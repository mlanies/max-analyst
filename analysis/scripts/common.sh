# Common utilities for analysis scripts

# Resolve base directories
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
ANALYSIS_DIR="$(cd "$SCRIPT_DIR/.." && pwd)"
LOG_DIR="$ANALYSIS_DIR/logs"
mkdir -p "$LOG_DIR"

# Default app package; can be overridden by env APP_PACKAGE or --package arg
: "${APP_PACKAGE:=ru.oneme.app}"

ts() {
	echo "$(date '+%Y-%m-%d %H:%M:%S')"
}

safe_grep() {
	grep -F --color=never "$@"
}

header() {
	local title="$1"
	echo ""
	echo "=================================================="
	echo "$title"
	echo "=================================================="
}

section() {
	local title="$1"
	echo "-- $title --"
}

ensure_device() {
	adb wait-for-device >/dev/null 2>&1 || return 1
	# Verify at least one device in 'device' state
	local has_device
	has_device=$(adb devices | awk 'NR>1 && /\tdevice$/{print $1}' | head -1)
	if [ -z "$has_device" ]; then
		return 1
	fi
	return 0
}

parse_common_args() {
	while [ $# -gt 0 ]; do
		case "$1" in
			--package)
				shift
				APP_PACKAGE="$1"
				;;
			--package=*)
				APP_PACKAGE="${1#*=}"
				;;
			*)
				;;
		esac
		shift || true
	done
}

get_app_pid() {
	# Returns the current PID of the app, empty if not running
	ensure_device || { echo ""; return 0; }
	local pid
	pid=$(adb shell pidof "$APP_PACKAGE" 2>/dev/null | tr -d '\r' | tr -d '\n') || true
	if [ -z "$pid" ]; then
		pid=$(adb shell sh -c "ps -A | grep -F '$APP_PACKAGE' | awk '{print \$2}' | head -1" 2>/dev/null | tr -d '\r' | tr -d '\n') || true
	fi
	echo "$pid"
}

get_app_uid() {
	# Returns decimal UID for the app package
	ensure_device || { echo ""; return 0; }
	adb shell dumpsys package "$APP_PACKAGE" 2>/dev/null | awk -F= '/userId=/{gsub(/\r/,""); print $2; exit}' | tr -d '\r' | tr -d '\n'
}

start_emulator_silenced() {
	# Starts emulator with reduced noise; logs to analysis/logs
	local avd_name="$1"
	local ts_file
	ts_file="$(date +%Y%m%d_%H%M%S)"
	local log_file="$LOG_DIR/emulator_${ts_file}.log"
	"${ANDROID_HOME:-$HOME/Library/Android/sdk}"/emulator/emulator -avd "$avd_name" -no-boot-anim -no-snapshot-load -no-snapshot-save >/"$log_file" 2>&1 &
	echo "$log_file"
}


