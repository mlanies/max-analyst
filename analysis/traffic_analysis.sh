#!/bin/bash

# АНАЛИЗ СЕТЕВОГО ТРАФИКА MAX МЕССЕНДЖЕРА
# Автор: Система анализа безопасности
# Дата: 18 августа 2025

set -e

# Настройка переменных
export ANDROID_HOME=~/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools

# Load shared utilities and handle --package
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
if [ -f "$SCRIPT_DIR/scripts/common.sh" ]; then
    . "$SCRIPT_DIR/scripts/common.sh"
else
    echo "[ERROR] common utilities not found at $SCRIPT_DIR/scripts/common.sh" >&2
    exit 1
fi

APP_PACKAGE="${APP_PACKAGE:-ru.oneme.app}"

SESSION_ID=$(date +"%Y%m%d_%H%M%S")
TRAFFIC_DIR="traffic_analysis_$SESSION_ID"
LOG_FILE="$TRAFFIC_DIR/traffic_analysis.log"

echo "=== АНАЛИЗ СЕТЕВОГО ТРАФИКА MAX МЕССЕНДЖЕРА ==="
echo "Сессия: $SESSION_ID"
echo "Время начала: $(date)"
echo ""

# Создание директории для анализа
mkdir -p "$TRAFFIC_DIR"
mkdir -p "$TRAFFIC_DIR/captures"
mkdir -p "$TRAFFIC_DIR/analysis"
mkdir -p "$TRAFFIC_DIR/reports"

# Функция логирования
log() {
    echo "[$(date '+%Y-%m-%d %H:%M:%S')] $1" | tee -a "$LOG_FILE"
}

# Функция ожидания подключения устройства
wait_for_device() {
    log "Ожидание подключения Android устройства..."
    ensure_device
    DEVICE=$(adb devices | awk 'NR>1 && /\tdevice$/{print $1}' | head -1)
    log "Устройство подключено: $DEVICE"
}

# Функция установки приложения
install_app() {
    log "Проверка установки MAX мессенджера..."
    if ! adb shell pm list packages | safe_grep "$APP_PACKAGE" >/dev/null; then
        log "Установка MAX мессенджера..."
        adb install -r ru.oneme.app_6392_rs.apk
        log "Приложение установлено"
    else
        log "Приложение уже установлено"
    fi
}

# Функция захвата трафика через tcpdump
capture_traffic() {
    log "Начало захвата сетевого трафика..."
    
    # Запуск tcpdump на устройстве
    adb shell "su -c 'tcpdump -i any -w /sdcard/traffic_capture_$SESSION_ID.pcap'" &
    TCPDUMP_PID=$!
    
    log "tcpdump запущен с PID: $TCPDUMP_PID"
    log "Захват трафика активен..."
    
    # Ожидание 30 секунд для сбора трафика
    sleep 30
    
    # Остановка захвата
    kill $TCPDUMP_PID 2>/dev/null || true
    adb shell "su -c 'pkill tcpdump'" 2>/dev/null || true
    
    # Копирование файла захвата
    log "Копирование файла захвата..."
    adb pull "/sdcard/traffic_capture_$SESSION_ID.pcap" "$TRAFFIC_DIR/captures/"
    
    log "Захват трафика завершен"
}

# Функция анализа активных соединений
analyze_connections() {
    log "Анализ активных сетевых соединений..."
    
    # Получение активных соединений (строго по UID приложения)
    local uid pid
    uid="$(get_app_uid)"
    pid="$(get_app_pid)"
    if [ -n "$uid" ]; then
        adb shell sh -c 'cat /proc/net/tcp /proc/net/tcp6 /proc/net/udp /proc/net/udp6' | awk -v u="$uid" '$0 ~ (" "u" ")' > "$TRAFFIC_DIR/analysis/active_connections.txt"
    else
        echo "UID приложения не найден" > "$TRAFFIC_DIR/analysis/active_connections.txt"
    fi
    
    # Анализ процессов (точный PID)
    if [ -n "$pid" ]; then
        adb shell sh -c "ps -A | awk '\$2==\"$pid\"{print \$0}'" > "$TRAFFIC_DIR/analysis/app_processes.txt"
    else
        echo "Процесс не активен" > "$TRAFFIC_DIR/analysis/app_processes.txt"
    fi
    
    log "Анализ соединений завершен"
}

# Функция мониторинга DNS запросов
monitor_dns() {
    log "Мониторинг DNS запросов..."
    
    # Запуск мониторинга DNS (системный, вывод только в файл)
    adb shell logcat -v brief | grep -i dns > "$TRAFFIC_DIR/analysis/dns_queries.txt" &
    DNS_PID=$!
    
    sleep 10
    kill $DNS_PID 2>/dev/null || true
    
    log "DNS мониторинг завершен"
}

# Функция анализа через mitmproxy (если доступен)
setup_mitmproxy() {
    if command -v mitmproxy >/dev/null 2>&1; then
        log "Настройка mitmproxy для анализа HTTP/HTTPS трафика..."
        
        # Запуск mitmproxy (логи перенаправлены в файл)
        mitmproxy -p 8080 --set confdir="$TRAFFIC_DIR/mitmproxy" > "$TRAFFIC_DIR/mitmproxy.log" 2>&1 &
        MITM_PID=$!
        
        # Настройка прокси на устройстве
        adb shell "settings put global http_proxy 10.0.2.2:8080"
        
        log "mitmproxy запущен на порту 8080"
        log "Прокси настроен на устройстве"
        
        # Ожидание для сбора трафика
        sleep 20
        
        # Остановка mitmproxy
        kill $MITM_PID 2>/dev/null || true
        adb shell "settings put global http_proxy :0"
        
        log "mitmproxy остановлен"
    else
        log "mitmproxy не найден, пропускаем HTTP/HTTPS анализ"
    fi
}

# Функция анализа через tshark
analyze_pcap() {
    if command -v tshark >/dev/null 2>&1; then
        log "Анализ PCAP файла через tshark..."
        
        PCAP_FILE="$TRAFFIC_DIR/captures/traffic_capture_$SESSION_ID.pcap"
        
        if [ -f "$PCAP_FILE" ]; then
            # Статистика трафика
            tshark -r "$PCAP_FILE" -q -z io,phs > "$TRAFFIC_DIR/analysis/traffic_statistics.txt"
            
            # Топ доменов
            tshark -r "$PCAP_FILE" -q -z dns,stat > "$TRAFFIC_DIR/analysis/dns_statistics.txt"
            
            # HTTP запросы
            tshark -r "$PCAP_FILE" -Y "http.request" -T fields -e http.host -e http.request.uri > "$TRAFFIC_DIR/analysis/http_requests.txt"
            
            # HTTPS соединения
            tshark -r "$PCAP_FILE" -Y "ssl.handshake" -T fields -e ip.dst -e ssl.handshake.extensions_server_name > "$TRAFFIC_DIR/analysis/https_connections.txt"
            
            # Подозрительные соединения
            tshark -r "$PCAP_FILE" -Y "ip.dst contains apptracer or ip.dst contains facebook or ip.dst contains google" > "$TRAFFIC_DIR/analysis/suspicious_connections.txt"
            
            log "Анализ PCAP завершен"
        else
            log "PCAP файл не найден"
        fi
    else
        log "tshark не найден, пропускаем детальный анализ"
    fi
}

# Функция создания отчета
generate_report() {
    log "Создание отчета анализа трафика..."
    
    REPORT_FILE="$TRAFFIC_DIR/reports/traffic_analysis_report.md"
    
    cat > "$REPORT_FILE" << EOF
# ОТЧЕТ АНАЛИЗА СЕТЕВОГО ТРАФИКА MAX МЕССЕНДЖЕРА

**Дата анализа:** $(date '+%Y-%m-%d %H:%M:%S')  
**Сессия:** $SESSION_ID  
**Статус:** АНАЛИЗ ЗАВЕРШЕН

## РЕЗЮМЕ АНАЛИЗА

Данный отчет содержит результаты анализа сетевого трафика MAX мессенджера в контролируемой среде.

## МЕТОДОЛОГИЯ

### Инструменты анализа:
- **tcpdump** - захват сетевых пакетов
- **tshark** - анализ PCAP файлов
- **mitmproxy** - анализ HTTP/HTTPS трафика
- **adb** - взаимодействие с устройством

### Время анализа: 30 секунд активного захвата

## РЕЗУЛЬТАТЫ АНАЛИЗА

### 1. Активные соединения
\`\`\`
$(cat "$TRAFFIC_DIR/analysis/active_connections.txt" 2>/dev/null || echo "Данные недоступны")
\`\`\`

### 2. DNS запросы
\`\`\`
$(cat "$TRAFFIC_DIR/analysis/dns_queries.txt" 2>/dev/null || echo "Данные недоступны")
\`\`\`

### 3. HTTP запросы
\`\`\`
$(cat "$TRAFFIC_DIR/analysis/http_requests.txt" 2>/dev/null || echo "Данные недоступны")
\`\`\`

### 4. HTTPS соединения
\`\`\`
$(cat "$TRAFFIC_DIR/analysis/https_connections.txt" 2>/dev/null || echo "Данные недоступны")
\`\`\`

### 5. Подозрительные соединения
\`\`\`
$(cat "$TRAFFIC_DIR/analysis/suspicious_connections.txt" 2>/dev/null || echo "Данные недоступны")
\`\`\`

## ВЫВОДЫ

Анализ сетевого трафика выявил активность приложения и его взаимодействие с внешними серверами.

## РЕКОМЕНДАЦИИ

1. Мониторить все исходящие соединения
2. Блокировать подозрительные домены
3. Использовать VPN для защиты трафика

---
**Отчет создан:** $(date)  
**Файлы анализа:** $TRAFFIC_DIR/
EOF

    log "Отчет создан: $REPORT_FILE"
}

# Основная функция
main() {
    log "Начало анализа сетевого трафика MAX мессенджера"
    
    # Ожидание устройства
    wait_for_device
    
    # Установка приложения
    install_app
    
    # Запуск приложения
    log "Запуск приложения..."
    parse_common_args "$@"
    adb shell "am start -n $APP_PACKAGE/one.me.android.MainActivity"
    sleep 5
    
    # Анализ соединений
    analyze_connections
    
    # Захват трафика
    capture_traffic
    
    # Мониторинг DNS
    monitor_dns
    
    # Настройка mitmproxy
    setup_mitmproxy
    
    # Анализ PCAP
    analyze_pcap
    
    # Создание отчета
    generate_report
    
    log "Анализ сетевого трафика завершен"
    log "Результаты сохранены в: $TRAFFIC_DIR/"
    
    echo ""
    echo "=== АНАЛИЗ ТРАФИКА ЗАВЕРШЕН ==="
    echo "Результаты: $TRAFFIC_DIR/"
    echo "Отчет: $TRAFFIC_DIR/reports/traffic_analysis_report.md"
    echo "PCAP файл: $TRAFFIC_DIR/captures/"
}

# Запуск основной функции
main "$@"
