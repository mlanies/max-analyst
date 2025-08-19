#!/bin/bash

# Скрипт быстрой проверки состояния эмулятора и приложения

# Цвета
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
CYAN='\033[0;36m'
NC='\033[0m'

echo -e "${CYAN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
echo -e "${CYAN}║                    ПРОВЕРКА СОСТОЯНИЯ СИСТЕМЫ                               ║${NC}"
echo -e "${CYAN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
echo ""

# Проверка ADB
echo -e "${YELLOW}1. Проверка ADB:${NC}"
if command -v adb >/dev/null 2>&1; then
    echo -e "  ${GREEN}✓ ADB найден${NC}"
else
    echo -e "  ${RED}✗ ADB не найден${NC}"
    exit 1
fi

# Проверка подключенных устройств
echo -e "${YELLOW}2. Подключенные устройства:${NC}"
if adb devices | grep -q "emulator.*device"; then
    echo -e "  ${GREEN}✓ Эмулятор подключен${NC}"
    adb devices
else
    echo -e "  ${RED}✗ Эмулятор не подключен${NC}"
    echo -e "  ${YELLOW}Запустите: ./start_emulator.sh${NC}"
    exit 1
fi

# Проверка загрузки системы
echo -e "${YELLOW}3. Статус загрузки системы:${NC}"
boot_completed=$(adb shell getprop sys.boot_completed 2>/dev/null || echo "0")
if [ "$boot_completed" = "1" ]; then
    echo -e "  ${GREEN}✓ Система загружена${NC}"
else
    echo -e "  ${YELLOW}⚠ Система загружается...${NC}"
fi

# Информация о системе
echo -e "${YELLOW}4. Информация о системе:${NC}"
android_version=$(adb shell getprop ro.build.version.release 2>/dev/null || echo "Недоступно")
api_level=$(adb shell getprop ro.build.version.sdk 2>/dev/null || echo "Недоступно")
model=$(adb shell getprop ro.product.model 2>/dev/null || echo "Недоступно")

echo -e "  Android версия: ${BLUE}$android_version${NC}"
echo -e "  API уровень: ${BLUE}$api_level${NC}"
echo -e "  Модель: ${BLUE}$model${NC}"

# Проверка установленного приложения
echo -e "${YELLOW}5. Проверка приложения:${NC}"
if adb shell pm list packages | grep -q "ru.oneme.app"; then
    echo -e "  ${GREEN}✓ Приложение установлено${NC}"
    
    # Проверка активности приложения
    app_pid=$(adb shell pidof ru.oneme.app 2>/dev/null || echo "")
    if [ -n "$app_pid" ]; then
        echo -e "  ${GREEN}✓ Приложение запущено (PID: $app_pid)${NC}"
    else
        echo -e "  ${YELLOW}⚠ Приложение не запущено${NC}"
        echo -e "  ${BLUE}Для запуска: adb shell am start -n ru.oneme.app/.MainActivity${NC}"
    fi
else
    echo -e "  ${RED}✗ Приложение не установлено${NC}"
    echo -e "  ${YELLOW}Установите: adb install -r ../ru.oneme.app_6392_rs.apk${NC}"
fi

# Проверка использования ресурсов
echo -e "${YELLOW}6. Использование ресурсов:${NC}"
total_ram=$(adb shell dumpsys meminfo 2>/dev/null | grep "Total RAM" | head -1 || echo "Недоступно")
echo -e "  Память: ${BLUE}$total_ram${NC}"

# Проверка сетевых соединений
echo -e "${YELLOW}7. Сетевые соединения:${NC}"
netstat_output=$(adb shell netstat 2>/dev/null | head -5 || echo "Недоступно")
if [ "$netstat_output" != "Недоступно" ]; then
    echo -e "  ${GREEN}✓ Сеть активна${NC}"
    echo "$netstat_output" | while read -r line; do
        echo -e "    ${BLUE}$line${NC}"
    done
else
    echo -e "  ${YELLOW}⚠ Сетевая информация недоступна${NC}"
fi

echo ""
echo -e "${CYAN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
echo -e "${CYAN}║                    ГОТОВ К АНАЛИЗУ                                          ║${NC}"
echo -e "${CYAN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
echo ""

echo -e "${YELLOW}Доступные команды:${NC}"
echo -e "  ${GREEN}./start_professional_monitoring.sh${NC}  - Полный анализ"
echo -e "  ${GREEN}./live_monitoring.sh${NC}               - Мониторинг в реальном времени"
echo -e "  ${GREEN}./simple_traffic_analysis.sh${NC}       - Анализ трафика"
echo -e "  ${GREEN}adb shell am start -n ru.oneme.app/.MainActivity${NC} - Запуск приложения"
echo -e "  ${GREEN}adb logcat${NC}                         - Просмотр логов"
echo -e "  ${GREEN}adb emu kill${NC}                       - Остановка эмулятора"
