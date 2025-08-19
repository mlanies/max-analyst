#!/bin/bash

# Скрипт запуска Android эмулятора для MAX Analyst
# Автоматический запуск эмулятора с оптимальными настройками

set -e

# Настройки
export ANDROID_HOME=~/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools

# Цвета для вывода
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
CYAN='\033[0;36m'
NC='\033[0m'

# Функция проверки зависимостей
check_dependencies() {
    echo -e "${CYAN}Проверка зависимостей...${NC}"
    
    # Проверка Android SDK
    if [ ! -d "$ANDROID_HOME" ]; then
        echo -e "${RED}Android SDK не найден в $ANDROID_HOME${NC}"
        echo -e "${YELLOW}Установите Android Studio или Android SDK${NC}"
        exit 1
    fi
    
    # Проверка эмулятора
    if [ ! -f "$ANDROID_HOME/emulator/emulator" ]; then
        echo -e "${RED}Android эмулятор не найден${NC}"
        echo -e "${YELLOW}Установите Android SDK Platform Tools${NC}"
        exit 1
    fi
    
    # Проверка ADB
    if ! command -v adb >/dev/null 2>&1; then
        echo -e "${RED}ADB не найден${NC}"
        echo -e "${YELLOW}Установите Android SDK Platform Tools${NC}"
        exit 1
    fi
    
    echo -e "${GREEN}Все зависимости найдены${NC}"
}

# Функция получения списка доступных AVD
list_avds() {
    echo -e "${CYAN}Доступные виртуальные устройства:${NC}"
    "$ANDROID_HOME/emulator/emulator" -list-avds | while read -r avd; do
        echo -e "  • ${GREEN}$avd${NC}"
    done
}

# Функция создания AVD если не существует
create_avd_if_needed() {
    local avd_name="$1"
    local api_level="${2:-36}"
    
    echo -e "${CYAN}Проверка AVD: $avd_name${NC}"
    
    if ! "$ANDROID_HOME/emulator/emulator" -list-avds | grep -q "^$avd_name$"; then
        echo -e "${YELLOW}AVD '$avd_name' не найден. Создание...${NC}"
        
        # Проверка наличия системного образа
        local system_image="system-images;android-$api_level;google_apis;x86_64"
        if [ ! -d "$ANDROID_HOME/system-images/android-$api_level/google_apis/x86_64" ]; then
            echo -e "${RED}Системный образ не найден: $system_image${NC}"
            echo -e "${YELLOW}Установите системный образ через Android Studio${NC}"
            exit 1
        fi
        
        # Создание AVD
        echo -e "${YELLOW}Создание AVD (это может занять несколько минут)...${NC}"
        "$ANDROID_HOME/tools/bin/avdmanager" create avd \
            --name "$avd_name" \
            --package "$system_image" \
            --force \
            --device "pixel_6" \
            --abi "google_apis/x86_64"
        
        echo -e "${GREEN}AVD '$avd_name' создан успешно${NC}"
    else
        echo -e "${GREEN}AVD '$avd_name' уже существует${NC}"
    fi
}

# Функция запуска эмулятора
start_emulator() {
    local avd_name="$1"
    local log_file="$2"
    
    echo -e "${CYAN}Запуск эмулятора: $avd_name${NC}"
    echo -e "${YELLOW}Логи будут сохранены в: $log_file${NC}"
    
    # Параметры запуска для оптимизации
    local emulator_args=(
        -avd "$avd_name"
        -no-boot-anim          # Отключение анимации загрузки
        -no-snapshot-load      # Не загружать снапшоты
        -no-snapshot-save      # Не сохранять снапшоты
        -gpu swiftshader_indirect  # Программный рендеринг
        -memory 2048           # 2GB RAM
        -cores 2               # 2 CPU ядра
        -skin 1080x1920        # Разрешение экрана
        -no-audio              # Отключение аудио для экономии ресурсов
        -no-window             # Запуск в фоне (уберите для GUI)
    )
    
    # Запуск эмулятора
    "$ANDROID_HOME/emulator/emulator" "${emulator_args[@]}" > "$log_file" 2>&1 &
    local emulator_pid=$!
    
    echo -e "${GREEN}Эмулятор запущен с PID: $emulator_pid${NC}"
    echo -e "${YELLOW}Ожидание загрузки эмулятора...${NC}"
    
    # Ожидание подключения устройства
    local timeout=120
    local counter=0
    
    while [ $counter -lt $timeout ]; do
        if adb devices | grep -q "emulator.*device"; then
            echo -e "${GREEN}Эмулятор успешно подключен!${NC}"
            return 0
        fi
        
        echo -n "."
        sleep 2
        counter=$((counter + 2))
    done
    
    echo -e "${RED}Таймаут ожидания подключения эмулятора${NC}"
    echo -e "${YELLOW}Проверьте логи: $log_file${NC}"
    return 1
}

# Функция установки приложения
install_app() {
    local apk_file="$1"
    
    if [ -f "$apk_file" ]; then
        echo -e "${CYAN}Установка приложения: $apk_file${NC}"
        
        # Ждем полной загрузки системы
        echo -e "${YELLOW}Ожидание полной загрузки системы...${NC}"
        local timeout=60
        local counter=0
        
        while [ $counter -lt $timeout ]; do
            if adb shell getprop sys.boot_completed 2>/dev/null | grep -q "1"; then
                echo -e "${GREEN}Система загружена${NC}"
                break
            fi
            echo -n "."
            sleep 2
            counter=$((counter + 2))
        done
        
        if [ $counter -ge $timeout ]; then
            echo -e "${RED}Таймаут ожидания загрузки системы${NC}"
            return 1
        fi
        
        # Дополнительное ожидание для стабилизации
        sleep 10
        
        # Попытка установки
        echo -e "${YELLOW}Установка APK...${NC}"
        if adb install -r "$apk_file"; then
            echo -e "${GREEN}Приложение установлено успешно${NC}"
        else
            echo -e "${RED}Ошибка установки приложения${NC}"
            echo -e "${YELLOW}Попробуйте установить вручную:${NC}"
            echo -e "${BLUE}adb install -r $apk_file${NC}"
            return 1
        fi
    else
        echo -e "${YELLOW}APK файл не найден: $apk_file${NC}"
        return 1
    fi
}

# Функция проверки состояния эмулятора
check_emulator_status() {
    echo -e "${CYAN}Статус эмулятора:${NC}"
    
    # Список устройств
    echo -e "${YELLOW}Подключенные устройства:${NC}"
    adb devices
    
    # Информация о системе
    if adb devices | grep -q "emulator.*device"; then
        echo -e "${YELLOW}Информация о системе:${NC}"
        echo -e "  Android версия: $(adb shell getprop ro.build.version.release 2>/dev/null || echo 'Недоступно')"
        echo -e "  Модель: $(adb shell getprop ro.product.model 2>/dev/null || echo 'Недоступно')"
        echo -e "  API уровень: $(adb shell getprop ro.build.version.sdk 2>/dev/null || echo 'Недоступно')"
        
        # Проверка загрузки системы
        local boot_completed
        boot_completed=$(adb shell getprop sys.boot_completed 2>/dev/null || echo "0")
        if [ "$boot_completed" = "1" ]; then
            echo -e "  Статус загрузки: ${GREEN}Загружена${NC}"
        else
            echo -e "  Статус загрузки: ${YELLOW}Загружается...${NC}"
        fi
        
        echo -e "${YELLOW}Использование памяти:${NC}"
        adb shell dumpsys meminfo 2>/dev/null | grep "Total RAM" || echo "  Информация недоступна"
        
        echo -e "${YELLOW}Запущенные процессы (топ 5):${NC}"
        adb shell ps 2>/dev/null | grep -E "(system|com\.android)" | head -5 || echo "  Информация недоступна"
        
        # Проверка установленных приложений
        echo -e "${YELLOW}Установленные приложения (топ 10):${NC}"
        adb shell pm list packages 2>/dev/null | head -10 | sed 's/package://' || echo "  Информация недоступна"
    else
        echo -e "${RED}Эмулятор не подключен${NC}"
    fi
}

# Главная функция
main() {
    echo -e "${CYAN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
    echo -e "${CYAN}║                    ЗАПУСК ANDROID ЭМУЛЯТОРА                                  ║${NC}"
    echo -e "${CYAN}║                    Android Emulator Launcher                                 ║${NC}"
    echo -e "${CYAN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
    echo ""
    
    # Проверка зависимостей
    check_dependencies
    
    # Параметры по умолчанию
    AVD_NAME="${1:-Medium_Phone_API_36.0}"
    APK_FILE="${2:-../ru.oneme.app_6392_rs.apk}"
    
    echo -e "${YELLOW}Параметры запуска:${NC}"
    echo -e "  AVD: ${GREEN}$AVD_NAME${NC}"
    echo -e "  APK: ${GREEN}$APK_FILE${NC}"
    echo ""
    
    # Список доступных AVD
    list_avds
    echo ""
    
    # Создание AVD если нужно
    create_avd_if_needed "$AVD_NAME"
    echo ""
    
    # Создание директории для логов
    mkdir -p logs
    
    # Запуск эмулятора
    local log_file="logs/emulator_$(date +%Y%m%d_%H%M%S).log"
    if start_emulator "$AVD_NAME" "$log_file"; then
        echo ""
        echo -e "${GREEN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
        echo -e "${GREEN}║                    ЭМУЛЯТОР УСПЕШНО ЗАПУЩЕН                                ║${NC}"
        echo -e "${GREEN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
        echo ""
        
        # Установка приложения
        install_app "$APK_FILE"
        echo ""
        
        # Проверка статуса
        check_emulator_status
        echo ""
        
        echo -e "${CYAN}Следующие шаги:${NC}"
        echo -e "  1. Запустите анализ: ${GREEN}./start_professional_monitoring.sh${NC}"
        echo -e "  2. Или мониторинг: ${GREEN}./live_monitoring.sh${NC}"
        echo -e "  3. Для остановки эмулятора: ${GREEN}adb emu kill${NC}"
        echo ""
        echo -e "${YELLOW}Логи эмулятора: $log_file${NC}"
        
    else
        echo -e "${RED}Ошибка запуска эмулятора${NC}"
        echo -e "${YELLOW}Проверьте логи: $log_file${NC}"
        exit 1
    fi
}

# Обработка аргументов командной строки
case "${1:-}" in
    -h|--help)
        echo "Использование: $0 [AVD_NAME] [APK_FILE]"
        echo ""
        echo "Параметры:"
        echo "  AVD_NAME    Имя виртуального устройства (по умолчанию: Medium_Phone_API_36.0)"
        echo "  APK_FILE    Путь к APK файлу для установки"
        echo ""
        echo "Примеры:"
        echo "  $0                                    # Запуск с параметрами по умолчанию"
        echo "  $0 Pixel_6_API_36                    # Запуск конкретного AVD"
        echo "  $0 Medium_Phone_API_36.0 app.apk     # Запуск с установкой APK"
        exit 0
        ;;
    *)
        main "$@"
        ;;
esac
