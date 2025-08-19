#!/bin/bash

# MAX Analyst - Реалистичный анализ безопасности мессенджеров

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
    echo "[$level] $timestamp - $message" >> logs/realistic_analysis_$(date '+%Y%m%d').log
}

# Функция для анализа разрешений с учетом стандартных функций мессенджеров
analyze_permissions_realistically() {
    log_message "INFO" "Начинаем реалистичный анализ разрешений мессенджера MAX..."
    
    # Проверяем подключение устройства
    if ! adb devices | grep -q "device$"; then
        log_message "ERROR" "Android устройство не подключено"
        return 1
    fi
    
    # Получаем информацию о разрешениях
    log_message "INFO" "Получение разрешений приложения ru.oneme.app..."
    
    permissions=$(adb shell dumpsys package ru.oneme.app | grep -A 50 "requested permissions:")
    
    # СТАНДАРТНЫЕ разрешения для мессенджеров
    standard_messenger_permissions=(
        "android.permission.INTERNET"                    # Интернет для отправки сообщений
        "android.permission.ACCESS_NETWORK_STATE"        # Проверка состояния сети
        "android.permission.WAKE_LOCK"                   # Поддержание соединения
        "android.permission.VIBRATE"                     # Уведомления
        "android.permission.RECEIVE_BOOT_COMPLETED"      # Автозапуск
        "android.permission.CAMERA"                      # Фото/видео в сообщениях
        "android.permission.RECORD_AUDIO"                # Голосовые сообщения
        "android.permission.READ_EXTERNAL_STORAGE"       # Отправка файлов
        "android.permission.WRITE_EXTERNAL_STORAGE"      # Сохранение файлов
        "android.permission.READ_CONTACTS"               # Поиск контактов
        "android.permission.READ_PHONE_STATE"            # Определение номера
        "android.permission.ACCESS_FINE_LOCATION"        # Отправка местоположения
        "android.permission.ACCESS_COARSE_LOCATION"      # Приблизительное местоположение
        "android.permission.SYSTEM_ALERT_WINDOW"         # Входящие звонки поверх экрана
    )
    
    # ПОДОЗРИТЕЛЬНЫЕ разрешения (не стандартные для мессенджеров)
    suspicious_permissions=(
        "android.permission.READ_SMS"                    # Чтение SMS
        "android.permission.SEND_SMS"                    # Отправка SMS
        "android.permission.READ_CALL_LOG"               # Чтение истории звонков
        "android.permission.WRITE_CALL_LOG"              # Изменение истории звонков
        "android.permission.CALL_PHONE"                  # Совершение звонков
        "android.permission.MODIFY_PHONE_STATE"          # Изменение состояния телефона
        "android.permission.ACCESS_SUPERUSER"            # Root права
        "android.permission.READ_LOGS"                   # Чтение системных логов
        "android.permission.WRITE_SECURE_SETTINGS"       # Изменение системных настроек
        "android.permission.INSTALL_PACKAGES"            # Установка приложений
        "android.permission.DELETE_PACKAGES"             # Удаление приложений
        "android.permission.ACCESS_ALL_EXTERNAL_STORAGE" # Полный доступ к хранилищу
        "android.permission.MANAGE_EXTERNAL_STORAGE"     # Управление хранилищем
    )
    
    found_standard=()
    found_suspicious=()
    
    # Проверяем стандартные разрешения
    log_message "INFO" "Проверка стандартных разрешений для мессенджеров..."
    for permission in "${standard_messenger_permissions[@]}"; do
        if echo "$permissions" | grep -q "$permission"; then
            found_standard+=("$permission")
            log_message "SUCCESS" "✅ Стандартное разрешение: $permission"
        fi
    done
    
    # Проверяем подозрительные разрешения
    log_message "INFO" "Проверка подозрительных разрешений..."
    for permission in "${suspicious_permissions[@]}"; do
        if echo "$permissions" | grep -q "$permission"; then
            found_suspicious+=("$permission")
            log_message "ERROR" " ПОДОЗРИТЕЛЬНОЕ разрешение: $permission"
        fi
    done
    
    # Анализируем каждое подозрительное разрешение
    if [[ ${#found_suspicious[@]} -gt 0 ]]; then
        log_message "WARN" "Детальный анализ ПОДОЗРИТЕЛЬНЫХ разрешений:"
        
        for permission in "${found_suspicious[@]}"; do
            case $permission in
                "android.permission.READ_SMS")
                    log_message "ERROR" " READ_SMS - Чтение SMS сообщений"
                    log_message "ERROR" "   Это НЕ стандартно для мессенджеров и может указывать на шпионаж"
                    ;;
                "android.permission.SEND_SMS")
                    log_message "ERROR" " SEND_SMS - Отправка SMS сообщений"
                    log_message "ERROR" "   Может использоваться для скрытой отправки данных"
                    ;;
                "android.permission.READ_CALL_LOG")
                    log_message "ERROR" " READ_CALL_LOG - Чтение истории звонков"
                    log_message "ERROR" "   Это НЕ стандартно для мессенджеров"
                    ;;
                "android.permission.CALL_PHONE")
                    log_message "ERROR" " CALL_PHONE - Совершение звонков"
                    log_message "ERROR" "   Может использоваться для скрытых звонков"
                    ;;
                "android.permission.ACCESS_SUPERUSER")
                    log_message "ERROR" " ACCESS_SUPERUSER - Root права!"
                    log_message "ERROR" "   Это крайне подозрительно для любого приложения"
                    ;;
                "android.permission.READ_LOGS")
                    log_message "ERROR" " READ_LOGS - Чтение системных логов"
                    log_message "ERROR" "   Может использоваться для сбора системной информации"
                    ;;
            esac
        done
    else
        log_message "SUCCESS" "✅ Подозрительных разрешений не обнаружено!"
    fi
    
    # Проверяем root доступ
    log_message "INFO" "Проверка root доступа..."
    if adb shell "su -c 'whoami'" 2>/dev/null | grep -q "root"; then
        log_message "ERROR" " Обнаружен root доступ на устройстве!"
        log_message "ERROR" "   Это может позволить приложению получить полный контроль"
    else
        log_message "SUCCESS" "✅ Root доступ не обнаружен"
    fi
    
    return 0
}

# Функция для сравнения с другими мессенджерами
compare_with_other_messengers() {
    log_message "INFO" "Сравнение разрешений с другими популярными мессенджерами..."
    
    echo ""
    echo "📱 СРАВНЕНИЕ РАЗРЕШЕНИЙ МЕССЕНДЖЕРОВ:"
    echo "======================================"
    echo ""
    
    # Telegram
    echo "📲 Telegram (стандартные разрешения):"
    echo "   ✅ INTERNET, ACCESS_NETWORK_STATE"
    echo "   ✅ CAMERA, RECORD_AUDIO (для медиа)"
    echo "   ✅ READ_CONTACTS (поиск контактов)"
    echo "   ✅ ACCESS_FINE_LOCATION (отправка местоположения)"
    echo "   ✅ SYSTEM_ALERT_WINDOW (входящие звонки)"
    echo "   ❌ НЕ запрашивает: READ_SMS, CALL_PHONE, ACCESS_SUPERUSER"
    echo ""
    
    # WhatsApp
    echo "📲 WhatsApp (стандартные разрешения):"
    echo "   ✅ INTERNET, ACCESS_NETWORK_STATE"
    echo "   ✅ CAMERA, RECORD_AUDIO (для медиа)"
    echo "   ✅ READ_CONTACTS (поиск контактов)"
    echo "   ✅ ACCESS_FINE_LOCATION (отправка местоположения)"
    echo "   ✅ SYSTEM_ALERT_WINDOW (входящие звонки)"
    echo "   ❌ НЕ запрашивает: READ_SMS, CALL_PHONE, ACCESS_SUPERUSER"
    echo ""
    
    # Signal
    echo "📲 Signal (стандартные разрешения):"
    echo "   ✅ INTERNET, ACCESS_NETWORK_STATE"
    echo "   ✅ CAMERA, RECORD_AUDIO (для медиа)"
    echo "   ✅ READ_CONTACTS (поиск контактов)"
    echo "   ✅ ACCESS_FINE_LOCATION (отправка местоположения)"
    echo "   ❌ НЕ запрашивает: READ_SMS, CALL_PHONE, ACCESS_SUPERUSER"
    echo ""
    
    echo "🔍 ВЫВОД: Стандартные мессенджеры НЕ запрашивают:"
    echo "   • READ_SMS (чтение SMS)"
    echo "   • CALL_PHONE (совершение звонков)"
    echo "   • ACCESS_SUPERUSER (root права)"
    echo "   • READ_LOGS (системные логи)"
    echo ""
}

# Функция для генерации реалистичного отчета
generate_realistic_report() {
    log_message "INFO" "Генерация реалистичного отчета по безопасности..."
    
    echo ""
    echo "=================================================================="
    echo "              РЕАЛИСТИЧНЫЙ ОТЧЕТ ПО БЕЗОПАСНОСТИ MAX"
    echo "=================================================================="
    echo "Дата: $(date '+%Y-%m-%d %H:%M:%S')"
    echo ""
    
    # Подсчитываем количество разрешений
    standard_count=$(grep -c "Стандартное разрешение" logs/realistic_analysis_$(date '+%Y%m%d').log)
    suspicious_count=$(grep -c "ПОДОЗРИТЕЛЬНОЕ разрешение" logs/realistic_analysis_$(date '+%Y%m%d').log)
    
    echo "РЕЗУЛЬТАТЫ АНАЛИЗА:"
    echo "   • Стандартных разрешений: $standard_count"
    echo "   • Подозрительных разрешений: $suspicious_count"
    echo ""
    
    if [[ $suspicious_count -gt 0 ]]; then
        echo " ВЫВОД:"
        echo "   Обнаружены НЕстандартные разрешения для мессенджера:"
        echo ""
        
        # Выводим найденные подозрительные разрешения
        grep "ПОДОЗРИТЕЛЬНОЕ разрешение" logs/realistic_analysis_$(date '+%Y%m%d').log | while read line; do
            permission=$(echo "$line" | sed 's/.*разрешение: //')
            echo "   • $permission"
        done
        
        echo ""
        echo "   ⚠️  Эти разрешения НЕ являются стандартными для мессенджеров"
        echo "   и могут указывать на потенциальный шпионаж!"
        echo ""
        echo " РЕКОМЕНДАЦИИ:"
        echo "   • Проверить, зачем мессенджеру нужны эти разрешения"
        echo "   • Рассмотреть альтернативные мессенджеры (Telegram, Signal)"
        echo "   • Ограничить разрешения в настройках"
    else
        echo "✅ ВЫВОД:"
        echo "   Все разрешения являются стандартными для мессенджеров"
        echo "   Приложение MAX выглядит безопасным с точки зрения разрешений"
        echo ""
        echo "📝 ЗАМЕЧАНИЕ:"
        echo "   Стандартные разрешения (камера, микрофон, местоположение)"
        echo "   необходимы для полноценной работы мессенджера"
    fi
    
    echo ""
    echo "=================================================================="
    echo "Отчет сохранен в: logs/realistic_analysis_$(date '+%Y%m%d').log"
    echo "=================================================================="
}

# Основная функция
main() {
    log_message "INFO" "Запуск реалистичного анализа безопасности мессенджера MAX..."
    log_message "INFO" "Цель: определить, какие разрешения действительно подозрительны"
    
    # Создаем директорию для логов
    mkdir -p logs
    
    # Выполняем анализ
    analyze_permissions_realistically
    compare_with_other_messengers
    
    # Генерируем реалистичный отчет
    generate_realistic_report
    
    log_message "SUCCESS" "Реалистичный анализ безопасности завершен"
}

# Запуск основной функции
main "$@"
