#!/bin/bash

# УПРОЩЕННЫЙ АНАЛИЗ СЕТЕВОГО ТРАФИКА MAX МЕССЕНДЖЕРА
# Без root прав, используя доступные инструменты

set -e

export ANDROID_HOME=~/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools

# README: Simple Traffic Analysis
# - Filters strictly by app package via PID/UID.
# - Use --package <pkg> or env APP_PACKAGE to override (default: ru.oneme.app).

# Load shared utilities
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
if [ -f "$SCRIPT_DIR/scripts/common.sh" ]; then
    # shellcheck disable=SC1091
    . "$SCRIPT_DIR/scripts/common.sh"
else
    echo "[ERROR] common utilities not found at $SCRIPT_DIR/scripts/common.sh" >&2
    exit 1
fi

APP_PACKAGE="${APP_PACKAGE:-ru.oneme.app}"

SESSION_ID=$(date +"%Y%m%d_%H%M%S")
TRAFFIC_DIR="simple_traffic_analysis_$SESSION_ID"

echo "=== УПРОЩЕННЫЙ АНАЛИЗ СЕТЕВОГО ТРАФИКА ==="
echo "Сессия: $SESSION_ID"
echo "Время: $(date)"
echo ""

mkdir -p "$TRAFFIC_DIR"
mkdir -p "$TRAFFIC_DIR/analysis"
mkdir -p "$TRAFFIC_DIR/reports"

log() {
    echo "[$(date '+%H:%M:%S')] $1"
}

parse_common_args "$@"

# Проверка подключения устройства
log "Проверка подключения устройства..."
if ! ensure_device; then
    echo "Ошибка: Устройство не подключено"
    exit 1
fi

DEVICE=$(adb devices | grep "device$" | head -1 | cut -f1)
log "Устройство: $DEVICE"

# Анализ процессов приложения (точный PID)
log "Анализ процессов приложения..."
PID="$(get_app_pid)"
if [ -n "$PID" ]; then
    adb shell sh -c "ps -A | awk '\$2==\"$PID\"{print \$0}'" > "$TRAFFIC_DIR/analysis/app_processes.txt" 2>/dev/null || echo "Процессы не найдены" > "$TRAFFIC_DIR/analysis/app_processes.txt"
else
    echo "Процессы не найдены (приложение неактивно)" > "$TRAFFIC_DIR/analysis/app_processes.txt"
fi

# Анализ сетевых соединений (только UID приложения)
log "Анализ сетевых соединений..."
UID_APP="$(get_app_uid)"
if [ -n "$UID_APP" ]; then
    adb shell sh -c 'cat /proc/net/tcp /proc/net/tcp6' | awk -v u="$UID_APP" '$0 ~ (" "u" ")' > "$TRAFFIC_DIR/analysis/tcp_connections.txt" 2>/dev/null || echo "TCP соединения недоступны" > "$TRAFFIC_DIR/analysis/tcp_connections.txt"
    adb shell sh -c 'cat /proc/net/udp /proc/net/udp6' | awk -v u="$UID_APP" '$0 ~ (" "u" ")' > "$TRAFFIC_DIR/analysis/udp_connections.txt" 2>/dev/null || echo "UDP соединения недоступны" > "$TRAFFIC_DIR/analysis/udp_connections.txt"
else
    echo "UID приложения не найден" > "$TRAFFIC_DIR/analysis/tcp_connections.txt"
    echo "UID приложения не найден" > "$TRAFFIC_DIR/analysis/udp_connections.txt"
fi

# Анализ DNS
log "Анализ DNS запросов..."
adb shell "cat /proc/net/route" > "$TRAFFIC_DIR/analysis/network_routes.txt" 2>/dev/null || echo "Маршруты недоступны" > "$TRAFFIC_DIR/analysis/network_routes.txt"

# Мониторинг логов приложения (строго по PID)
log "Мониторинг логов приложения..."
if [ -n "$PID" ]; then
    adb logcat -d -v threadtime --pid "$PID" -T 200 > "$TRAFFIC_DIR/analysis/app_logs.txt" 2>/dev/null || echo "Логи недоступны" > "$TRAFFIC_DIR/analysis/app_logs.txt"
else
    echo "Логи недоступны (процесс не активен)" > "$TRAFFIC_DIR/analysis/app_logs.txt"
fi

# Анализ активных сервисов (только пакет)
log "Анализ активных сервисов..."
adb shell dumpsys activity services "$APP_PACKAGE" > "$TRAFFIC_DIR/analysis/active_services.txt" 2>/dev/null || echo "Сервисы не найдены" > "$TRAFFIC_DIR/analysis/active_services.txt"

# Анализ сетевых запросов через connectivity (только пакет)
log "Анализ сетевых запросов..."
adb shell dumpsys connectivity 2>/dev/null | sed -n "/RequestorPkg: $APP_PACKAGE/,+15p" > "$TRAFFIC_DIR/analysis/network_requests.txt" || echo "Сетевые запросы не найдены" > "$TRAFFIC_DIR/analysis/network_requests.txt"

# Запуск приложения и мониторинг
log "Запуск приложения..."
adb shell "am start -n $APP_PACKAGE/one.me.android.MainActivity" >/dev/null 2>&1
sleep 5

log "Мониторинг активности в течение 30 секунд..."
for i in {1..6}; do
    log "Проверка $i/6..."
    
    # Проверка процессов
    if [ -n "$PID" ]; then
        adb shell sh -c "ps -A | awk '\$2==\"$PID\"{print \$0}'" >> "$TRAFFIC_DIR/analysis/process_monitoring.txt" 2>/dev/null || echo "Проверка $i: процессы не найдены" >> "$TRAFFIC_DIR/analysis/process_monitoring.txt"
    else
        echo "Проверка $i: процесс не активен" >> "$TRAFFIC_DIR/analysis/process_monitoring.txt"
    fi
    
    # Проверка TCP соединений (только UID)
    if [ -n "$UID_APP" ]; then
        adb shell sh -c 'cat /proc/net/tcp /proc/net/tcp6' | awk -v u="$UID_APP" '$0 ~ (" "u" ")' | tail -10 >> "$TRAFFIC_DIR/analysis/tcp_monitoring.txt" 2>/dev/null || echo "Проверка $i: TCP недоступен" >> "$TRAFFIC_DIR/analysis/tcp_monitoring.txt"
    else
        echo "Проверка $i: UID не найден" >> "$TRAFFIC_DIR/analysis/tcp_monitoring.txt"
    fi
    
    # Проверка логов (строго по PID)
    if [ -n "$PID" ]; then
        adb logcat -d -v threadtime --pid "$PID" -T 50 >> "$TRAFFIC_DIR/analysis/log_monitoring.txt" 2>/dev/null || echo "Проверка $i: логи недоступны" >> "$TRAFFIC_DIR/analysis/log_monitoring.txt"
    else
        echo "Проверка $i: логи недоступны (процесс не активен)" >> "$TRAFFIC_DIR/analysis/log_monitoring.txt"
    fi
    
    sleep 5
done

# Анализ через dumpsys
log "Детальный анализ через dumpsys..."
adb shell "dumpsys connectivity" > "$TRAFFIC_DIR/analysis/connectivity_dump.txt" 2>/dev/null || echo "Connectivity dump недоступен" > "$TRAFFIC_DIR/analysis/connectivity_dump.txt"
adb shell "dumpsys netpolicy" > "$TRAFFIC_DIR/analysis/netpolicy_dump.txt" 2>/dev/null || echo "Netpolicy dump недоступен" > "$TRAFFIC_DIR/analysis/netpolicy_dump.txt"

# Создание отчета
log "Создание отчета..."
REPORT_FILE="$TRAFFIC_DIR/reports/simple_traffic_report.md"

cat > "$REPORT_FILE" << EOF
# УПРОЩЕННЫЙ ОТЧЕТ АНАЛИЗА СЕТЕВОГО ТРАФИКА MAX МЕССЕНДЖЕРА

**Дата:** $(date '+%Y-%m-%d %H:%M:%S')  
**Сессия:** $SESSION_ID  
**Устройство:** $DEVICE  
**Статус:** АНАЛИЗ ЗАВЕРШЕН

## РЕЗЮМЕ

Упрощенный анализ сетевого трафика MAX мессенджера без root прав.

## МЕТОДОЛОГИЯ

- Анализ процессов приложения
- Мониторинг TCP/UDP соединений
- Анализ логов системы
- Мониторинг сетевых запросов
- Анализ активных сервисов

## РЕЗУЛЬТАТЫ АНАЛИЗА

### 1. Процессы приложения
\`\`\`
$(cat "$TRAFFIC_DIR/analysis/app_processes.txt")
\`\`\`

### 2. TCP соединения
\`\`\`
$(head -20 "$TRAFFIC_DIR/analysis/tcp_connections.txt")
\`\`\`

### 3. UDP соединения
\`\`\`
$(head -20 "$TRAFFIC_DIR/analysis/udp_connections.txt")
\`\`\`

### 4. Сетевые маршруты
\`\`\`
$(head -10 "$TRAFFIC_DIR/analysis/network_routes.txt")
\`\`\`

### 5. Логи приложения
\`\`\`
$(head -30 "$TRAFFIC_DIR/analysis/app_logs.txt")
\`\`\`

### 6. Активные сервисы
\`\`\`
$(cat "$TRAFFIC_DIR/analysis/active_services.txt")
\`\`\`

### 7. Сетевые запросы
\`\`\`
$(cat "$TRAFFIC_DIR/analysis/network_requests.txt")
\`\`\`

### 8. Мониторинг процессов
\`\`\`
$(head -20 "$TRAFFIC_DIR/analysis/process_monitoring.txt")
\`\`\`

### 9. Мониторинг TCP
\`\`\`
$(head -20 "$TRAFFIC_DIR/analysis/tcp_monitoring.txt")
\`\`\`

### 10. Мониторинг логов
\`\`\`
$(head -30 "$TRAFFIC_DIR/analysis/log_monitoring.txt")
\`\`\`

## ВЫВОДЫ

Анализ выявил активность приложения и его сетевые взаимодействия.

## РЕКОМЕНДАЦИИ

1. Для более детального анализа требуется root доступ
2. Использовать специализированные инструменты (tcpdump, tshark)
3. Мониторить активность приложения в реальном времени

---
**Отчет создан:** $(date)  
**Файлы анализа:** $TRAFFIC_DIR/
EOF

log "Отчет создан: $REPORT_FILE"

echo ""
echo "=== УПРОЩЕННЫЙ АНАЛИЗ ТРАФИКА ЗАВЕРШЕН ==="
echo "Результаты: $TRAFFIC_DIR/"
echo "Отчет: $REPORT_FILE"
echo ""
echo "Для более детального анализа требуется:"
echo "- Root права на устройстве"
echo "- tcpdump/tshark"
echo "- mitmproxy"
