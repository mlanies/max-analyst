#!/bin/bash

# Скрипт запуска Android Studio и эмулятора с графическим интерфейсом
# Удобный способ для разработки и тестирования приложений

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

echo -e "${CYAN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
echo -e "${CYAN}║                    ЗАПУСК ANDROID STUDIO И ЭМУЛЯТОРА                        ║${NC}"
echo -e "${CYAN}║                    Android Studio & Emulator Launcher                       ║${NC}"
echo -e "${CYAN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
echo ""

# Функция проверки зависимостей
check_dependencies() {
    echo -e "${YELLOW}Проверка зависимостей...${NC}"
    
    # Проверка Android Studio
    if [ -d "/Applications/Android Studio.app" ]; then
        echo -e "  ${GREEN}✓ Android Studio найден${NC}"
    else
        echo -e "  ${RED}✗ Android Studio не найден${NC}"
        echo -e "  ${YELLOW}Установите Android Studio с https://developer.android.com/studio${NC}"
        exit 1
    fi
    
    # Проверка Android SDK
    if [ -d "$ANDROID_HOME" ]; then
        echo -e "  ${GREEN}✓ Android SDK найден${NC}"
    else
        echo -e "  ${RED}✗ Android SDK не найден${NC}"
        echo -e "  ${YELLOW}Установите Android SDK через Android Studio${NC}"
        exit 1
    fi
    
    # Проверка эмулятора
    if [ -f "$ANDROID_HOME/emulator/emulator" ]; then
        echo -e "  ${GREEN}✓ Android эмулятор найден${NC}"
    else
        echo -e "  ${RED}✗ Android эмулятор не найден${NC}"
        echo -e "  ${YELLOW}Установите Android SDK Platform Tools${NC}"
        exit 1
    fi
    
    echo -e "${GREEN}Все зависимости найдены${NC}"
}

# Функция получения списка AVD
list_avds() {
    echo -e "${YELLOW}Доступные виртуальные устройства:${NC}"
    "$ANDROID_HOME/emulator/emulator" -list-avds | while read -r avd; do
        echo -e "  • ${GREEN}$avd${NC}"
    done
}

# Функция запуска Android Studio
start_android_studio() {
    echo -e "${CYAN}Запуск Android Studio...${NC}"
    
    if open -a "Android Studio"; then
        echo -e "${GREEN}Android Studio запущен${NC}"
        echo -e "${YELLOW}Подождите загрузки Android Studio...${NC}"
        sleep 5
    else
        echo -e "${RED}Ошибка запуска Android Studio${NC}"
        exit 1
    fi
}

# Функция запуска эмулятора с GUI
start_emulator_gui() {
    local avd_name="$1"
    
    echo -e "${CYAN}Запуск эмулятора с графическим интерфейсом: $avd_name${NC}"
    echo -e "${YELLOW}Эмулятор запускается в отдельном окне...${NC}"
    
    # Параметры запуска для GUI
    local emulator_args=(
        -avd "$avd_name"
        -gpu host                    # Аппаратное ускорение
        -memory 4096                 # 4GB RAM
        -cores 4                     # 4 CPU ядра
        -skin 1080x1920              # Разрешение экрана
        -no-snapshot-load            # Не загружать снапшоты
        -no-snapshot-save            # Не сохранять снапшоты
    )
    
    # Запуск эмулятора в фоне
    "$ANDROID_HOME/emulator/emulator" "${emulator_args[@]}" &
    local emulator_pid=$!
    
    echo -e "${GREEN}Эмулятор запущен с PID: $emulator_pid${NC}"
    echo -e "${YELLOW}Ожидание загрузки эмулятора...${NC}"
    
    # Ожидание подключения устройства
    local timeout=180
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
    echo -e "${YELLOW}Проверьте окно эмулятора вручную${NC}"
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

# Функция запуска приложения
launch_app() {
    local package_name="$1"
    
    echo -e "${CYAN}Запуск приложения: $package_name${NC}"
    
    # Проверяем, установлено ли приложение
    if adb shell pm list packages | grep -q "$package_name"; then
        echo -e "${GREEN}Приложение найдено${NC}"
        
        # Запускаем приложение
        if adb shell am start -n "$package_name/.MainActivity"; then
            echo -e "${GREEN}Приложение запущено${NC}"
        else
            echo -e "${YELLOW}Попытка запуска через launcher...${NC}"
            adb shell monkey -p "$package_name" -c android.intent.category.LAUNCHER 1
            echo -e "${GREEN}Приложение запущено через launcher${NC}"
        fi
    else
        echo -e "${RED}Приложение не установлено${NC}"
        echo -e "${YELLOW}Установите приложение сначала${NC}"
        return 1
    fi
}

# Главная функция
main() {
    # Проверка зависимостей
    check_dependencies
    echo ""
    
    # Параметры по умолчанию
    AVD_NAME="${1:-Medium_Phone_API_36.0}"
    APK_FILE="${2:-../ru.oneme.app_6392_rs.apk}"
    PACKAGE_NAME="${3:-ru.oneme.app}"
    
    echo -e "${YELLOW}Параметры запуска:${NC}"
    echo -e "  AVD: ${GREEN}$AVD_NAME${NC}"
    echo -e "  APK: ${GREEN}$APK_FILE${NC}"
    echo -e "  Пакет: ${GREEN}$PACKAGE_NAME${NC}"
    echo ""
    
    # Список доступных AVD
    list_avds
    echo ""
    
    # Запуск Android Studio
    start_android_studio
    echo ""
    
    # Запуск эмулятора
    if start_emulator_gui "$AVD_NAME"; then
        echo ""
        echo -e "${GREEN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
        echo -e "${GREEN}║                    СИСТЕМА ГОТОВА К РАБОТЕ                                ║${NC}"
        echo -e "${GREEN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
        echo ""
        
        # Установка приложения
        install_app "$APK_FILE"
        echo ""
        
        # Запуск приложения
        launch_app "$PACKAGE_NAME"
        echo ""
        
        echo -e "${CYAN}Следующие шаги:${NC}"
        echo -e "  1. Откройте Android Studio"
        echo -e "  2. Создайте новый проект или откройте существующий"
        echo -e "  3. Используйте эмулятор для тестирования"
        echo -e "  4. Для анализа используйте: ${GREEN}./start_professional_monitoring.sh${NC}"
        echo ""
        echo -e "${YELLOW}Полезные команды:${NC}"
        echo -e "  ${BLUE}adb devices${NC}                    - Список устройств"
        echo -e "  ${BLUE}adb logcat${NC}                     - Просмотр логов"
        echo -e "  ${BLUE}adb shell am start -n $PACKAGE_NAME/.MainActivity${NC} - Запуск приложения"
        echo -e "  ${BLUE}adb emu kill${NC}                   - Остановка эмулятора"
        
    else
        echo -e "${RED}Ошибка запуска эмулятора${NC}"
        echo -e "${YELLOW}Попробуйте запустить эмулятор вручную через Android Studio${NC}"
        exit 1
    fi
}

# Обработка аргументов командной строки
case "${1:-}" in
    -h|--help)
        echo "Использование: $0 [AVD_NAME] [APK_FILE] [PACKAGE_NAME]"
        echo ""
        echo "Параметры:"
        echo "  AVD_NAME       Имя виртуального устройства (по умолчанию: Medium_Phone_API_36.0)"
        echo "  APK_FILE       Путь к APK файлу для установки"
        echo "  PACKAGE_NAME   Имя пакета приложения (по умолчанию: ru.oneme.app)"
        echo ""
        echo "Примеры:"
        echo "  $0                                    # Запуск с параметрами по умолчанию"
        echo "  $0 Pixel_6_API_36                    # Запуск конкретного AVD"
        echo "  $0 Medium_Phone_API_36.0 app.apk     # Запуск с установкой APK"
        echo "  $0 Medium_Phone_API_36.0 app.apk com.example.app  # Полная настройка"
        exit 0
        ;;
    *)
        main "$@"
        ;;
esac
