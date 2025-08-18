#!/bin/bash

# ИНТЕРАКТИВНАЯ СИСТЕМА МОНИТОРИНГА MAX МЕССЕНДЖЕРА В РЕАЛЬНОМ ВРЕМЕНИ
# Аналог команды ps для Android приложений

set -e

export ANDROID_HOME=~/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools

# README: Live Monitoring
# - Now filters strictly by the application package and its PID/UID.
# - Use --package <pkg> or env APP_PACKAGE to override (default: ru.oneme.app).
# - Host/emulator noise is suppressed in UI; only app-related data is shown.

# Load shared utilities
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
if [ -f "$SCRIPT_DIR/scripts/common.sh" ]; then
    # shellcheck disable=SC1091
    . "$SCRIPT_DIR/scripts/common.sh"
else
    echo "[ERROR] common utilities not found at $SCRIPT_DIR/scripts/common.sh" >&2
    exit 1
fi

# Цвета для вывода
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
PURPLE='\033[0;35m'
CYAN='\033[0;36m'
NC='\033[0m' # No Color

# Переменные
APP_PACKAGE="${APP_PACKAGE:-ru.oneme.app}"
REFRESH_INTERVAL=2
LOG_FILE="live_monitoring_$(date +%Y%m%d_%H%M%S).log"

# Функция очистки экрана
clear_screen() {
    clear
    echo -e "${CYAN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
    echo -e "${CYAN}║                    МОНИТОРИНГ MAX МЕССЕНДЖЕРА В РЕАЛЬНОМ ВРЕМЕНИ              ║${NC}"
    echo -e "${CYAN}║                              Live Monitoring System                           ║${NC}"
    echo -e "${CYAN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
    echo ""
}

# Функция получения информации о процессе (строго по PID)
get_process_info() {
    ensure_device || { echo "ПРОЦЕСС НЕ АКТИВЕН"; return; }
    local pid
    pid=$(get_app_pid)
    if [ -z "$pid" ]; then
        echo "ПРОЦЕСС НЕ АКТИВЕН"
        return
    fi
    adb shell sh -c "ps -A | awk '\$2==\"$pid\"{print \$0}'" 2>/dev/null || echo "ПРОЦЕСС НЕ АКТИВЕН"
}

# Функция получения сетевых соединений (строго по UID приложения)
get_network_connections() {
    ensure_device || { echo "СЕТЕВЫЕ СОЕДИНЕНИЯ НЕ НАЙДЕНЫ"; return; }
    local uid
    uid=$(get_app_uid)
    if [ -z "$uid" ]; then
        echo "UID ПРИЛОЖЕНИЯ НЕ НАЙДЕН — ПРОПУСКАЕМ"
        return
    fi
    adb shell sh -c 'cat /proc/net/tcp /proc/net/tcp6 /proc/net/udp /proc/net/udp6' \
      | awk -v u="$uid" '$0 ~ (" "u" ")' | head -20 || echo "СЕТЕВЫЕ СОЕДИНЕНИЯ НЕ НАЙДЕНЫ"
}

# Функция получения активных сервисов (только для пакета)
get_active_services() {
    ensure_device || { echo "АКТИВНЫЕ СЕРВИСЫ НЕ НАЙДЕНЫ"; return; }
    local services
    services=$(adb shell dumpsys activity services "$APP_PACKAGE" 2>/dev/null)
    if [ -z "$services" ]; then
        services=$(adb shell dumpsys activity services 2>/dev/null | sed -n "/$APP_PACKAGE/,+12p" | head -50)
    fi
    if [ -n "$services" ]; then
        echo "$services"
    else
        echo "АКТИВНЫЕ СЕРВИСЫ НЕ НАЙДЕНЫ"
    fi
}

# Функция получения сетевых запросов (только для пакета)
get_network_requests() {
    ensure_device || { echo "СЕТЕВЫЕ ЗАПРОСЫ НЕ НАЙДЕНЫ"; return; }
    local requests
    requests=$(adb shell dumpsys connectivity 2>/dev/null | sed -n "/RequestorPkg: $APP_PACKAGE/,+15p" | head -60)
    if [ -n "$requests" ]; then
        echo "$requests"
    else
        echo "СЕТЕВЫЕ ЗАПРОСЫ НЕ НАЙДЕНЫ"
    fi
}

# Функция получения логов приложения (строго по PID)
get_app_logs() {
    ensure_device || { echo "ЛОГИ НЕ НАЙДЕНЫ"; return; }
    local pid
    pid=$(get_app_pid)
    if [ -z "$pid" ]; then
        echo "ЛОГИ НЕДОСТУПНЫ (ПРОЦЕСС НЕ АКТИВЕН)"
        return
    fi
    adb logcat -d -v threadtime --pid "$pid" -T 50 2>/dev/null | tail -20 || echo "ЛОГИ НЕ НАЙДЕНЫ"
}

# Функция получения информации о памяти
get_memory_info() {
    ensure_device || { echo "ИНФОРМАЦИЯ О ПАМЯТИ НЕДОСТУПНА"; return; }
    local memory
    memory=$(adb shell dumpsys meminfo "$APP_PACKAGE" 2>/dev/null | head -30)
    if [ -n "$memory" ]; then
        echo "$memory"
    else
        echo "ИНФОРМАЦИЯ О ПАМЯТИ НЕДОСТУПНА"
    fi
}

# Функция получения информации о CPU (предпочтительно по PID)
get_cpu_info() {
    ensure_device || { echo "ИНФОРМАЦИЯ О CPU НЕДОСТУПНА"; return; }
    local pid
    pid=$(get_app_pid)
    if [ -z "$pid" ]; then
        echo "ИНФОРМАЦИЯ О CPU НЕДОСТУПНА (ПРОЦЕСС НЕ АКТИВЕН)"
        return
    fi
    local cpu
    cpu=$(adb shell top -n 1 -H -p "$pid" 2>/dev/null || true)
    if [ -z "$cpu" ]; then
        cpu=$(adb shell top -n 1 2>/dev/null | safe_grep " $pid ")
    fi
    if [ -n "$cpu" ]; then
        echo "$cpu"
    else
        echo "ИНФОРМАЦИЯ О CPU НЕДОСТУПНА"
    fi
}

# Функция получения пер-UID RX/TX
get_uid_traffic() {
    ensure_device || { echo "RX/TX НЕДОСТУПНЫ"; return; }
    local uid rx tx
    uid=$(get_app_uid)
    if [ -z "$uid" ]; then
        echo "UID ПРИЛОЖЕНИЯ НЕ НАЙДЕН"
        return
    fi
    rx=$(adb shell cmd network trafficstats getuidrxbytes "$uid" 2>/dev/null | tr -d '\r')
    tx=$(adb shell cmd network trafficstats getuidtxbytes "$uid" 2>/dev/null | tr -d '\r')
    echo "Traffic UID=$uid: RX=${rx:-N/A} bytes, TX=${tx:-N/A} bytes"
}

# Функция отображения статистики
show_statistics() {
    local timestamp=$(date '+%Y-%m-%d %H:%M:%S')
    local device=$(adb devices | grep "device$" | head -1 | cut -f1 2>/dev/null || echo "НЕ ПОДКЛЮЧЕНО")
    
    echo -e "${YELLOW}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
    echo -e "${YELLOW}║                              СТАТИСТИКА СИСТЕМЫ                               ║${NC}"
    echo -e "${YELLOW}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
    echo -e "${GREEN}Время:${NC} $timestamp"
    echo -e "${GREEN}Устройство:${NC} $device"
    echo -e "${GREEN}Пакет:${NC} $APP_PACKAGE"
    echo -e "${GREEN}Интервал обновления:${NC} ${REFRESH_INTERVAL} сек"
    echo ""
}

# Функция отображения процесса
show_process_info() {
    echo -e "${BLUE}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
    echo -e "${BLUE}║                              ИНФОРМАЦИЯ О ПРОЦЕССЕ                             ║${NC}"
    echo -e "${BLUE}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
    local process_info=$(get_process_info)
    if [[ "$process_info" == *"ПРОЦЕСС НЕ АКТИВЕН"* ]]; then
        echo -e "${RED}$process_info${NC}"
    else
        echo -e "${GREEN}$process_info${NC}"
    fi
    echo ""
}

# Функция отображения сетевых соединений
show_network_connections() {
    echo -e "${PURPLE}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
    echo -e "${PURPLE}║                            СЕТЕВЫЕ СОЕДИНЕНИЯ                                 ║${NC}"
    echo -e "${PURPLE}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
    local connections=$(get_network_connections)
    if [[ "$connections" == *"НЕ НАЙДЕНЫ"* ]]; then
        echo -e "${YELLOW}$connections${NC}"
    else
        echo -e "${GREEN}$connections${NC}"
    fi
    echo ""
}

# Функция отображения RX/TX по UID
show_uid_traffic() {
    echo -e "${PURPLE}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
    echo -e "${PURPLE}║                          ТРАФИК ПО UID ПРИЛОЖЕНИЯ                           ║${NC}"
    echo -e "${PURPLE}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
    local t
    t=$(get_uid_traffic)
    if [[ "$t" == *"НЕ НАЙДЕН"* || "$t" == *"НЕДОСТУП"* ]]; then
        echo -e "${YELLOW}$t${NC}"
    else
        echo -e "${GREEN}$t${NC}"
    fi
    echo ""
}

# Функция отображения активных сервисов
show_active_services() {
    echo -e "${CYAN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
    echo -e "${CYAN}║                             АКТИВНЫЕ СЕРВИСЫ                                   ║${NC}"
    echo -e "${CYAN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
    local services=$(get_active_services)
    if [[ "$services" == *"НЕ НАЙДЕНЫ"* ]]; then
        echo -e "${YELLOW}$services${NC}"
    else
        echo -e "${GREEN}$services${NC}"
    fi
    echo ""
}

# Функция отображения сетевых запросов
show_network_requests() {
    echo -e "${RED}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
    echo -e "${RED}║                             СЕТЕВЫЕ ЗАПРОСЫ                                     ║${NC}"
    echo -e "${RED}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
    local requests=$(get_network_requests)
    if [[ "$requests" == *"НЕ НАЙДЕНЫ"* ]]; then
        echo -e "${YELLOW}$requests${NC}"
    else
        echo -e "${GREEN}$requests${NC}"
    fi
    echo ""
}

# Функция отображения логов
show_app_logs() {
    echo -e "${GREEN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
    echo -e "${GREEN}║                                ЛОГИ ПРИЛОЖЕНИЯ                                ║${NC}"
    echo -e "${GREEN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
    local logs=$(get_app_logs)
    if [[ "$logs" == *"НЕ НАЙДЕНЫ"* ]]; then
        echo -e "${YELLOW}$logs${NC}"
    else
        echo -e "${GREEN}$logs${NC}"
    fi
    echo ""
}

# Функция отображения информации о памяти
show_memory_info() {
    echo -e "${YELLOW}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
    echo -e "${YELLOW}║                              ИСПОЛЬЗОВАНИЕ ПАМЯТИ                            ║${NC}"
    echo -e "${YELLOW}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
    local memory=$(get_memory_info)
    if [[ "$memory" == *"НЕДОСТУПНА"* ]]; then
        echo -e "${YELLOW}$memory${NC}"
    else
        echo -e "${GREEN}$memory${NC}"
    fi
    echo ""
}

# Функция отображения информации о CPU
show_cpu_info() {
    echo -e "${PURPLE}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
    echo -e "${PURPLE}║                              ИСПОЛЬЗОВАНИЕ CPU                               ║${NC}"
    echo -e "${PURPLE}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
    local cpu=$(get_cpu_info)
    if [[ "$cpu" == *"НЕДОСТУПНА"* ]]; then
        echo -e "${YELLOW}$cpu${NC}"
    else
        echo -e "${GREEN}$cpu${NC}"
    fi
    echo ""
}

# Функция отображения справки
show_help() {
    echo -e "${CYAN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
    echo -e "${CYAN}║                                   СПРАВКА                                      ║${NC}"
    echo -e "${CYAN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
    echo -e "${GREEN}Управление:${NC}"
    echo -e "  ${YELLOW}q${NC} - Выход"
    echo -e "  ${YELLOW}h${NC} - Показать справку"
    echo -e "  ${YELLOW}r${NC} - Перезапустить приложение"
    echo -e "  ${YELLOW}s${NC} - Остановить приложение"
    echo -e "  ${YELLOW}1-6${NC} - Переключить отображение секций"
    echo -e "  ${YELLOW}+/-${NC} - Изменить интервал обновления"
    echo ""
}

# Функция логирования
log_event() {
    local event="$1"
    echo "[$(date '+%Y-%m-%d %H:%M:%S')] $event" >> "$LOG_FILE"
}

# Функция обработки команд
handle_command() {
    local key="$1"
    case $key in
        "q"|"Q")
            echo -e "${RED}Завершение мониторинга...${NC}"
            log_event "Мониторинг остановлен пользователем"
            exit 0
            ;;
        "h"|"H")
            show_help
            read -n 1 -s
            ;;
        "r"|"R")
            echo -e "${GREEN}Перезапуск приложения...${NC}"
            adb shell "am force-stop $APP_PACKAGE" >/dev/null 2>&1
            sleep 1
            adb shell "am start -n $APP_PACKAGE/one.me.android.MainActivity" >/dev/null 2>&1
            log_event "Приложение перезапущено"
            ;;
        "s"|"S")
            echo -e "${YELLOW}Остановка приложения...${NC}"
            adb shell "am force-stop $APP_PACKAGE" >/dev/null 2>&1
            log_event "Приложение остановлено"
            ;;
        "+")
            REFRESH_INTERVAL=$((REFRESH_INTERVAL + 1))
            echo -e "${GREEN}Интервал обновления: ${REFRESH_INTERVAL} сек${NC}"
            ;;
        "-")
            if [ $REFRESH_INTERVAL -gt 1 ]; then
                REFRESH_INTERVAL=$((REFRESH_INTERVAL - 1))
                echo -e "${GREEN}Интервал обновления: ${REFRESH_INTERVAL} сек${NC}"
            fi
            ;;
    esac
}

# Функция основного цикла мониторинга
main_monitoring_loop() {
    local show_sections="all"
    
    # Настройка терминала для неблокирующего ввода
    if [ -t 0 ]; then
        stty -echo -icanon time 0 min 0
    fi
    
    while true; do
        clear_screen
        show_statistics
        
        case $show_sections in
            "all")
                show_process_info
                show_network_connections
                show_uid_traffic
                show_active_services
                show_network_requests
                show_app_logs
                show_memory_info
                show_cpu_info
                ;;
            "1")
                show_process_info
                ;;
            "2")
                show_network_connections
                ;;
            "3")
                show_active_services
                ;;
            "4")
                show_network_requests
                ;;
            "5")
                show_app_logs
                ;;
            "6")
                show_memory_info
                show_cpu_info
                ;;
        esac
        
        echo -e "${CYAN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
        echo -e "${CYAN}║                              УПРАВЛЕНИЕ                                     ║${NC}"
        echo -e "${CYAN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
        echo -e "${GREEN}q${NC}=выход ${GREEN}h${NC}=справка ${GREEN}r${NC}=перезапуск ${GREEN}s${NC}=стоп ${GREEN}1-6${NC}=секции ${GREEN}+/-${NC}=интервал"
        echo ""
        
        # Проверка ввода пользователя
        if [ -t 0 ]; then
            read -t $REFRESH_INTERVAL -n 1 key
            if [ -n "$key" ]; then
                case $key in
                    "1"|"2"|"3"|"4"|"5"|"6")
                        show_sections="$key"
                        ;;
                    *)
                        handle_command "$key"
                        ;;
                esac
            fi
        else
            sleep $REFRESH_INTERVAL
        fi
        
        # Логирование активности
        log_event "Мониторинг активен - $(get_process_info | wc -l) процессов"
    done
}

# Функция инициализации
init_monitoring() {
    echo -e "${CYAN}Инициализация системы мониторинга...${NC}"
    
    # Проверка подключения устройства
    if ! ensure_device; then
        echo -e "${RED}Ошибка: Android устройство не подключено${NC}"
        echo -e "${YELLOW}Убедитесь, что эмулятор запущен и подключен${NC}"
        exit 1
    fi
    
    # Проверка установки приложения
    if ! adb shell pm list packages | safe_grep "$APP_PACKAGE" >/dev/null; then
        echo -e "${YELLOW}Приложение $APP_PACKAGE не установлено${NC}"
        echo -e "${GREEN}Установка приложения...${NC}"
        adb install -r ru.oneme.app_6392_rs.apk
    fi
    
    # Запуск приложения
    echo -e "${GREEN}Запуск приложения...${NC}"
    adb shell "am start -n $APP_PACKAGE/one.me.android.MainActivity" >/dev/null 2>&1
    
    log_event "Система мониторинга инициализирована"
    echo -e "${GREEN}Система мониторинга готова!${NC}"
    sleep 2
}

# Основная функция
main() {
    # Обработка ключей (в т.ч. --package)
    parse_common_args "$@"
    echo -e "${CYAN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
    echo -e "${CYAN}║                    ИНТЕРАКТИВНАЯ СИСТЕМА МОНИТОРИНГА                          ║${NC}"
    echo -e "${CYAN}║                              MAX МЕССЕНДЖЕР                                    ║${NC}"
    echo -e "${CYAN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
    echo ""
    
    init_monitoring
    main_monitoring_loop
}

# Обработка сигналов для корректного завершения
trap 'echo -e "\n${RED}Завершение мониторинга...${NC}"; stty sane; exit 0' INT TERM

# Запуск основной функции
main "$@"
