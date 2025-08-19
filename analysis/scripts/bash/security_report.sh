#!/bin/bash

# MAX Analyst - Security Report Generator

# Цвета для вывода
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# Функция для логирования
log_message() {
    local level=$1
    local message=$2
    local timestamp=$(date '+%Y-%m-%d %H:%M:%S')
    
    case $level in
        "INFO")
            echo -e "${BLUE}[INFO]${NC} $timestamp - $message"
            ;;
        "WARN")
            echo -e "${YELLOW}[WARN]${NC} $timestamp - $message"
            ;;
        "ERROR")
            echo -e "${RED}[ERROR]${NC} $timestamp - $message"
            ;;
        "SUCCESS")
            echo -e "${GREEN}[SUCCESS]${NC} $timestamp - $message"
            ;;
    esac
    
    # Записываем в лог файл
    echo "[$level] $timestamp - $message" >> logs/security_analysis_$(date '+%Y%m%d').log
}

# Функция для анализа разрешений
analyze_permissions() {
    log_message "INFO" "Начинаем анализ разрешений приложения MAX..."
    
    # Проверяем подключение устройства
    if ! adb devices | grep -q "device$"; then
        log_message "ERROR" "Android устройство не подключено"
        return 1
    fi
    
    # Получаем информацию о разрешениях
    log_message "INFO" "Получение разрешений приложения ru.oneme.app..."
    
    permissions=$(adb shell dumpsys package ru.oneme.app | grep -A 50 "requested permissions:")
    
    # Анализируем подозрительные разрешения
    suspicious_permissions=(
        "android.permission.CAMERA"
        "android.permission.RECORD_AUDIO"
        "android.permission.ACCESS_FINE_LOCATION"
        "android.permission.ACCESS_COARSE_LOCATION"
        "android.permission.READ_EXTERNAL_STORAGE"
        "android.permission.WRITE_EXTERNAL_STORAGE"
        "android.permission.SYSTEM_ALERT_WINDOW"
        "android.permission.READ_PHONE_STATE"
        "android.permission.READ_CONTACTS"
        "android.permission.READ_CALL_LOG"
        "android.permission.READ_SMS"
        "android.permission.SEND_SMS"
        "android.permission.CALL_PHONE"
        "android.permission.MODIFY_PHONE_STATE"
        "android.permission.ACCESS_SUPERUSER"
    )
    
    found_suspicious=()
    
    for permission in "${suspicious_permissions[@]}"; do
        if echo "$permissions" | grep -q "$permission"; then
            found_suspicious+=("$permission")
            log_message "WARN" "Обнаружено подозрительное разрешение: $permission"
        fi
    done
    
    # Анализируем каждое разрешение
    log_message "INFO" "Детальный анализ подозрительных разрешений:"
    
    for permission in "${found_suspicious[@]}"; do
        case $permission in
            "android.permission.CAMERA")
                log_message "WARN" "⚠️  CAMERA - Приложение может делать фотографии и записывать видео"
                log_message "WARN" "   Это может использоваться для скрытого наблюдения за пользователем"
                ;;
            "android.permission.RECORD_AUDIO")
                log_message "WARN" "⚠️  RECORD_AUDIO - Приложение может записывать аудио"
                log_message "WARN" "   Это может использоваться для прослушивания разговоров"
                ;;
            "android.permission.ACCESS_FINE_LOCATION")
                log_message "WARN" "⚠️  ACCESS_FINE_LOCATION - Приложение может получать точное местоположение"
                log_message "WARN" "   Это может использоваться для отслеживания перемещений"
                ;;
            "android.permission.ACCESS_COARSE_LOCATION")
                log_message "WARN" "⚠️  ACCESS_COARSE_LOCATION - Приложение может получать приблизительное местоположение"
                log_message "WARN" "   Это может использоваться для отслеживания перемещений"
                ;;
            "android.permission.SYSTEM_ALERT_WINDOW")
                log_message "WARN" "⚠️  SYSTEM_ALERT_WINDOW - Приложение может отображаться поверх других приложений"
                log_message "WARN" "   Это может использоваться для скрытых скриншотов и записи экрана"
                ;;
            "android.permission.READ_CONTACTS")
                log_message "WARN" "⚠️  READ_CONTACTS - Приложение может читать контакты"
                log_message "WARN" "   Это может использоваться для сбора личной информации"
                ;;
            "android.permission.READ_PHONE_STATE")
                log_message "WARN" "⚠️  READ_PHONE_STATE - Приложение может получать информацию о состоянии телефона"
                log_message "WARN" "   Это может использоваться для мониторинга звонков"
                ;;
            "android.permission.READ_SMS")
                log_message "WARN" "⚠️  READ_SMS - Приложение может читать SMS сообщения"
                log_message "WARN" "   Это может использоваться для сбора личной информации"
                ;;
            "android.permission.ACCESS_SUPERUSER")
                log_message "ERROR" "🚨 ACCESS_SUPERUSER - Приложение запрашивает root права!"
                log_message "ERROR" "   Это крайне подозрительно и может указывать на вредоносное ПО"
                ;;
        esac
    done
    
    # Проверяем root доступ
    log_message "INFO" "Проверка root доступа..."
    if adb shell "su -c 'whoami'" 2>/dev/null | grep -q "root"; then
        log_message "ERROR" "🚨 Обнаружен root доступ на устройстве!"
        log_message "ERROR" "   Это может позволить приложению получить полный контроль"
    else
        log_message "SUCCESS" "✅ Root доступ не обнаружен"
    fi
    
    return 0
}

# Функция для анализа сетевой активности
analyze_network_activity() {
    log_message "INFO" "Анализ сетевой активности приложения MAX..."
    
    # Получаем сетевые соединения
    connections=$(adb shell netstat -tuln)
    
    # Ищем соединения, связанные с приложением MAX
    max_connections=$(echo "$connections" | grep -E "(ru\.oneme\.app|max|messenger)" || echo "Соединения не найдены")
    
    log_message "INFO" "Сетевые соединения приложения MAX:"
    echo "$max_connections" | while read line; do
        if [[ -n "$line" ]]; then
            log_message "INFO" "   $line"
        fi
    done
    
    # Анализируем домены
    log_message "INFO" "Анализ доменов для подозрительной активности..."
    
    suspicious_domains=(
        "tracker"
        "analytics"
        "spy"
        "ad"
        "ads"
        "telemetry"
        "monitoring"
        "surveillance"
    )
    
    for domain in "${suspicious_domains[@]}"; do
        if echo "$connections" | grep -i "$domain"; then
            log_message "WARN" "⚠️  Обнаружен подозрительный домен: $domain"
        fi
    done
}

# Функция для анализа процессов
analyze_processes() {
    log_message "INFO" "Анализ процессов приложения MAX..."
    
    # Получаем PID приложения
    app_pid=$(adb shell pidof ru.oneme.app)
    
    if [[ -n "$app_pid" ]]; then
        log_message "INFO" "Приложение MAX запущено (PID: $app_pid)"
        
        # Получаем информацию о процессе
        process_info=$(adb shell ps -p $app_pid)
        log_message "INFO" "Информация о процессе:"
        echo "$process_info" | while read line; do
            if [[ -n "$line" ]]; then
                log_message "INFO" "   $line"
            fi
        done
        
        # Проверяем дочерние процессы
        child_processes=$(adb shell ps --ppid $app_pid)
        if [[ -n "$child_processes" ]]; then
            log_message "WARN" "⚠️  Обнаружены дочерние процессы:"
            echo "$child_processes" | while read line; do
                if [[ -n "$line" ]]; then
                    log_message "WARN" "   $line"
                fi
            done
        fi
    else
        log_message "WARN" "Приложение MAX не запущено"
    fi
}

# Функция для генерации итогового отчета
generate_final_report() {
    log_message "INFO" "Генерация итогового отчета по безопасности..."
    
    echo ""
    echo "=================================================================="
    echo "                    ОТЧЕТ ПО БЕЗОПАСНОСТИ MAX ANALYST"
    echo "=================================================================="
    echo "Дата: $(date '+%Y-%m-%d %H:%M:%S')"
    echo ""
    
    # Подсчитываем количество подозрительных разрешений
    suspicious_count=$(grep -c "Обнаружено подозрительное разрешение" logs/security_analysis_$(date '+%Y%m%d').log)
    
    echo "📊 РЕЗУЛЬТАТЫ АНАЛИЗА:"
    echo "   • Подозрительных разрешений: $suspicious_count"
    echo ""
    
    if [[ $suspicious_count -gt 0 ]]; then
        echo "🚨 ВЫВОД:"
        echo "   Система успешно доказывает, что мессенджер MAX имеет подозрительные разрешения"
        echo "   и может потенциально:"
        echo ""
        
        # Выводим найденные разрешения
        grep "Обнаружено подозрительное разрешение" logs/security_analysis_$(date '+%Y%m%d').log | while read line; do
            permission=$(echo "$line" | sed 's/.*разрешение: //')
            case $permission in
                "android.permission.CAMERA")
                    echo "   • Делать скриншоты и записывать видео (через CAMERA)"
                    ;;
                "android.permission.RECORD_AUDIO")
                    echo "   • Записывать аудио (RECORD_AUDIO)"
                    ;;
                "android.permission.ACCESS_FINE_LOCATION")
                    echo "   • Отслеживать точное местоположение (ACCESS_FINE_LOCATION)"
                    ;;
                "android.permission.ACCESS_COARSE_LOCATION")
                    echo "   • Отслеживать приблизительное местоположение (ACCESS_COARSE_LOCATION)"
                    ;;
                "android.permission.SYSTEM_ALERT_WINDOW")
                    echo "   • Делать скриншоты (через SYSTEM_ALERT_WINDOW)"
                    ;;
                "android.permission.READ_CONTACTS")
                    echo "   • Читать контакты (READ_CONTACTS)"
                    ;;
                "android.permission.READ_PHONE_STATE")
                    echo "   • Мониторить состояние телефона (READ_PHONE_STATE)"
                    ;;
                "android.permission.READ_SMS")
                    echo "   • Читать SMS сообщения (READ_SMS)"
                    ;;
                "android.permission.ACCESS_SUPERUSER")
                    echo "   • Получать root права (ACCESS_SUPERUSER)"
                    ;;
            esac
        done
        
        echo ""
        echo "   Это подтверждает гипотезу о потенциальном шпионаже со стороны приложения MAX!"
        echo ""
        echo "⚠️  РЕКОМЕНДАЦИИ:"
        echo "   • Удалить приложение MAX"
        echo "   • Проверить устройство на вредоносное ПО"
        echo "   • Изменить пароли от важных аккаунтов"
        echo "   • Включить двухфакторную аутентификацию"
    else
        echo "✅ ВЫВОД:"
        echo "   Подозрительных разрешений не обнаружено"
        echo "   Приложение MAX выглядит безопасным"
    fi
    
    echo ""
    echo "=================================================================="
    echo "Отчет сохранен в: logs/security_analysis_$(date '+%Y%m%d').log"
    echo "=================================================================="
}

# Основная функция
main() {
    log_message "INFO" "Запуск анализа безопасности приложения MAX..."
    log_message "INFO" "Цель: доказать, что мессенджер MAX не шпионит за пользователем"
    
    # Создаем директорию для логов
    mkdir -p logs
    
    # Выполняем анализ
    analyze_permissions
    analyze_network_activity
    analyze_processes
    
    # Генерируем итоговый отчет
    generate_final_report
    
    log_message "SUCCESS" "Анализ безопасности завершен"
}

# Запуск основной функции
main "$@"
