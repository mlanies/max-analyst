#!/bin/bash

# Система логирования для MAX Analyst
# Централизованное управление логами

# Загрузка конфигурации
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
if [ -f "$SCRIPT_DIR/config.sh" ]; then
    # shellcheck disable=SC1091
    . "$SCRIPT_DIR/config.sh"
fi

# Переменные логирования
LOG_LEVEL=${LOG_LEVEL:-$DEFAULT_LOG_LEVEL}
LOG_FILE="${LOG_FILE:-$LOG_DIR/analysis_$(date +%Y%m%d).log}"
LOG_MAX_SIZE=${LOG_MAX_SIZE:-10485760}  # 10MB
LOG_BACKUP_COUNT=${LOG_BACKUP_COUNT:-5}

# Функции логирования
log_message() {
    local level="$1"
    local message="$2"
    local timestamp=$(date '+%Y-%m-%d %H:%M:%S')
    local level_name
    
    case $level in
        $LOG_LEVEL_DEBUG) level_name="DEBUG" ;;
        $LOG_LEVEL_INFO)  level_name="INFO"  ;;
        $LOG_LEVEL_WARN)  level_name="WARN"  ;;
        $LOG_LEVEL_ERROR) level_name="ERROR" ;;
        *) level_name="UNKNOWN" ;;
    esac
    
    # Проверка уровня логирования
    if [ "$level" -ge "$LOG_LEVEL" ]; then
        echo "[$timestamp] [$level_name] $message" >> "$LOG_FILE"
        
        # Вывод в консоль для важных сообщений
        if [ "$level" -ge "$LOG_LEVEL_WARN" ]; then
            case $level in
                $LOG_LEVEL_WARN)
                    echo -e "${COLOR_YELLOW}[$level_name]${COLOR_NC} $message" >&2
                    ;;
                $LOG_LEVEL_ERROR)
                    echo -e "${COLOR_RED}[$level_name]${COLOR_NC} $message" >&2
                    ;;
            esac
        fi
    fi
}

log_debug() {
    log_message $LOG_LEVEL_DEBUG "$1"
}

log_info() {
    log_message $LOG_LEVEL_INFO "$1"
}

log_warn() {
    log_message $LOG_LEVEL_WARN "$1"
}

log_error() {
    log_message $LOG_LEVEL_ERROR "$1"
}

# Функция ротации логов
rotate_logs() {
    if [ -f "$LOG_FILE" ]; then
        local file_size=$(stat -f%z "$LOG_FILE" 2>/dev/null || stat -c%s "$LOG_FILE" 2>/dev/null || echo 0)
        
        if [ "$file_size" -gt "$LOG_MAX_SIZE" ]; then
            # Создание бэкапа
            local backup_file="${LOG_FILE}.$(date +%Y%m%d_%H%M%S)"
            mv "$LOG_FILE" "$backup_file"
            
            # Удаление старых бэкапов
            local backup_count=$(ls -1 "${LOG_FILE}."* 2>/dev/null | wc -l)
            if [ "$backup_count" -gt "$LOG_BACKUP_COUNT" ]; then
                ls -1t "${LOG_FILE}."* | tail -n +$((LOG_BACKUP_COUNT + 1)) | xargs rm -f
            fi
            
            log_info "Лог файл ротирован: $backup_file"
        fi
    fi
}

# Функция очистки старых логов
cleanup_old_logs() {
    local retention_days=${LOG_RETENTION_DAYS:-$MONITORING_LOG_RETENTION_DAYS}
    local cutoff_date=$(date -d "$retention_days days ago" +%Y%m%d 2>/dev/null || \
                       date -v-${retention_days}d +%Y%m%d 2>/dev/null || \
                       echo "0")
    
    if [ "$cutoff_date" != "0" ]; then
        find "$LOG_DIR" -name "*.log" -type f -mtime +$retention_days -delete 2>/dev/null || true
        log_info "Очищены логи старше $retention_days дней"
    fi
}

# Функция получения статистики логов
get_log_stats() {
    if [ -f "$LOG_FILE" ]; then
        echo "=== Статистика логов ==="
        echo "Файл: $LOG_FILE"
        echo "Размер: $(du -h "$LOG_FILE" | cut -f1)"
        echo "Строк: $(wc -l < "$LOG_FILE")"
        echo "Последнее обновление: $(stat -f%Sm "$LOG_FILE" 2>/dev/null || stat -c%y "$LOG_FILE" 2>/dev/null || echo "N/A")"
        echo ""
        echo "Распределение по уровням:"
        grep -E "\[(DEBUG|INFO|WARN|ERROR)\]" "$LOG_FILE" | \
            awk '{print $3}' | sort | uniq -c | sort -nr
    else
        echo "Лог файл не найден: $LOG_FILE"
    fi
}

# Функция поиска в логах
search_logs() {
    local pattern="$1"
    local lines="${2:-50}"
    
    if [ -f "$LOG_FILE" ]; then
        echo "=== Поиск в логах: '$pattern' ==="
        grep -i "$pattern" "$LOG_FILE" | tail -n "$lines"
    else
        echo "Лог файл не найден: $LOG_FILE"
    fi
}

# Функция экспорта логов
export_logs() {
    local output_file="$1"
    local format="${2:-text}"
    
    if [ -z "$output_file" ]; then
        output_file="$LOG_DIR/export_$(date +%Y%m%d_%H%M%S).log"
    fi
    
    case $format in
        "json")
            echo "[" > "$output_file"
            grep -E "\[(DEBUG|INFO|WARN|ERROR)\]" "$LOG_FILE" | \
                awk -F'[][]' '{
                    gsub(/^[ \t]+|[ \t]+$/, "", $3)
                    gsub(/^[ \t]+|[ \t]+$/, "", $4)
                    printf "  {\n    \"timestamp\": \"%s\",\n    \"level\": \"%s\",\n    \"message\": \"%s\"\n  },\n", $2, $3, $4
                }' | sed '$ s/,$//' >> "$output_file"
            echo "]" >> "$output_file"
            ;;
        "csv")
            echo "timestamp,level,message" > "$output_file"
            grep -E "\[(DEBUG|INFO|WARN|ERROR)\]" "$LOG_FILE" | \
                awk -F'[][]' '{
                    gsub(/^[ \t]+|[ \t]+$/, "", $3)
                    gsub(/^[ \t]+|[ \t]+$/, "", $4)
                    gsub(/"/, "\"\"", $4)
                    printf "\"%s\",\"%s\",\"%s\"\n", $2, $3, $4
                }' >> "$output_file"
            ;;
        *)
            cp "$LOG_FILE" "$output_file"
            ;;
    esac
    
    log_info "Логи экспортированы в: $output_file (формат: $format)"
    echo "$output_file"
}

# Инициализация системы логирования
init_logger() {
    # Создание директории для логов
    mkdir -p "$(dirname "$LOG_FILE")"
    
    # Ротация логов при запуске
    rotate_logs
    
    # Очистка старых логов
    cleanup_old_logs
    
    log_info "Система логирования инициализирована"
    log_info "Уровень логирования: $LOG_LEVEL"
    log_info "Файл лога: $LOG_FILE"
}

# Автоматическая инициализация при загрузке
init_logger
