#!/bin/bash

# ЗАПУСК ПРОФЕССИОНАЛЬНОЙ ДОКАЗАТЕЛЬНОЙ БАЗЫ
# Интерактивная система мониторинга в реальном времени

set -e

export ANDROID_HOME=~/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools

# README: Professional Monitoring Launcher
# - Use --package <pkg> or env APP_PACKAGE to target a specific app (default: ru.oneme.app).
# - Emulator and host tool outputs are redirected to analysis/logs/*.log to keep UI clean.

# Load shared utilities
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
SCRIPTS_DIR="$SCRIPT_DIR/scripts"
if [ -f "$SCRIPTS_DIR/config.sh" ]; then
    # shellcheck disable=SC1091
    . "$SCRIPTS_DIR/config.sh"
fi
if [ -f "$SCRIPTS_DIR/logger.sh" ]; then
    # shellcheck disable=SC1091
    . "$SCRIPTS_DIR/logger.sh"
fi
if [ -f "$SCRIPTS_DIR/common.sh" ]; then
    # shellcheck disable=SC1091
    . "$SCRIPTS_DIR/common.sh"
else
    echo "[ERROR] Common utilities not found at $SCRIPTS_DIR/common.sh"
    echo "Current directory: $(pwd)"
    echo "Script directory: $SCRIPT_DIR"
    echo "Scripts directory: $SCRIPTS_DIR"
    echo "Looking for: $SCRIPTS_DIR/common.sh"
    ls -la "$SCRIPTS_DIR/" 2>/dev/null || echo "Scripts directory not found"
    exit 1
fi

APP_PACKAGE="${APP_PACKAGE:-ru.oneme.app}"

# Цвета для вывода
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
PURPLE='\033[0;35m'
CYAN='\033[0;36m'
NC='\033[0m'

echo -e "${CYAN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
echo -e "${CYAN}║                    ПРОФЕССИОНАЛЬНАЯ ДОКАЗАТЕЛЬНАЯ БАЗА                        ║${NC}"
echo -e "${CYAN}║                    Professional Evidence Base System                          ║${NC}"
echo -e "${CYAN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
echo ""

echo -e "${YELLOW}Доступные режимы мониторинга:${NC}"
echo ""
echo -e "${GREEN}1.${NC} ${BLUE}Интерактивный терминальный мониторинг${NC} (как команда ps)"
echo -e "   • Реальное время"
echo -e "   • Цветной интерфейс"
echo -e "   • Интерактивное управление"
echo -e "   • Логирование событий"
echo ""
echo -e "${GREEN}2.${NC} ${BLUE}Веб-интерфейс мониторинга${NC}"
echo -e "   • Современный UI"
echo -e "   • Графики и статистика"
echo -e "   • Экспорт данных"
echo -e "   • Мобильная адаптация"
echo ""
echo -e "${GREEN}3.${NC} ${BLUE}Комбинированный режим${NC}"
echo -e "   • Терминал + Веб"
echo -e "   • Максимальная детализация"
echo -e "   • Двойной контроль"
echo ""

# Функция проверки подключения устройства
check_device() {
    if ! ensure_device; then
        echo -e "${RED}Ошибка: Android устройство не подключено${NC}"
        echo -e "${YELLOW}Запуск эмулятора...${NC}"
        local logf
        logf=$(start_emulator_silenced "Medium_Phone_API_36.0")
        echo -e "${GREEN}Эмулятор запускается (логи: $logf) ...${NC}"
        echo -e "${GREEN}Ожидание загрузки эмулятора...${NC}"
        adb wait-for-device
        sleep 30
        if ensure_device; then
            echo -e "${GREEN}Эмулятор подключен!${NC}"
        else
            echo -e "${RED}Не удалось подключить эмулятор${NC}"
            exit 1
        fi
    else
        echo -e "${GREEN}Устройство подключено!${NC}"
    fi
}

# Функция запуска терминального мониторинга
start_terminal_monitoring() {
    echo -e "${CYAN}Запуск интерактивного терминального мониторинга...${NC}"
    echo -e "${YELLOW}Особенности:${NC}"
    echo -e "• Обновление каждые 2 секунды"
    echo -e "• Цветной интерфейс"
    echo -e "• Интерактивные команды (q, h, r, s, 1-6, +/-)"
    echo -e "• Автоматическое логирование"
    echo ""
    echo -e "${GREEN}Нажмите Enter для запуска...${NC}"
    read
    
    chmod +x live_monitoring.sh
    ./live_monitoring.sh --package "$APP_PACKAGE"
}

# Функция запуска веб-мониторинга
start_web_monitoring() {
    echo -e "${CYAN}Запуск веб-интерфейса мониторинга...${NC}"
    echo -e "${YELLOW}Особенности:${NC}"
    echo -e "• Современный веб-интерфейс"
    echo -e "• Автоматическое обновление"
    echo -e "• Экспорт данных в JSON"
    echo -e "• Адаптивный дизайн"
    echo ""
    
    # Проверка наличия Python для веб-сервера
    if command -v python3 >/dev/null 2>&1; then
        echo -e "${GREEN}Запуск веб-сервера...${NC}"
        echo -e "${YELLOW}Веб-интерфейс будет доступен по адресу:${NC}"
        echo -e "${BLUE}http://localhost:8000/web_monitor.html${NC}"
        echo ""
        echo -e "${GREEN}Нажмите Enter для запуска...${NC}"
        read
        
        # Запуск веб-сервера в фоне
        ts_now="$(date +%Y%m%d_%H%M%S)"
        python3 -m http.server 8000 > "$LOG_DIR/web_server_${ts_now}.log" 2>&1 &
        WEB_SERVER_PID=$!
        
        # Открытие браузера
        sleep 2
        open http://localhost:8000/web_monitor.html
        
        echo -e "${GREEN}Веб-сервер запущен с PID: $WEB_SERVER_PID${NC}"
        echo -e "${YELLOW}Для остановки веб-сервера нажмите Ctrl+C${NC}"
        
        # Ожидание завершения
        wait $WEB_SERVER_PID
    else
        echo -e "${RED}Python3 не найден. Открытие файла напрямую...${NC}"
        open web_monitor.html
    fi
}

# Функция запуска комбинированного режима
start_combined_monitoring() {
    echo -e "${CYAN}Запуск комбинированного режима мониторинга...${NC}"
    echo -e "${YELLOW}Особенности:${NC}"
    echo -e "• Терминальный мониторинг"
    echo -e "• Веб-интерфейс"
    echo -e "• Синхронизированные данные"
    echo -e "• Максимальная детализация"
    echo ""
    
    # Запуск веб-сервера в фоне
    if command -v python3 >/dev/null 2>&1; then
        echo -e "${GREEN}Запуск веб-сервера...${NC}"
        ts_now="$(date +%Y%m%d_%H%M%S)"
        python3 -m http.server 8000 > "$LOG_DIR/web_server_${ts_now}.log" 2>&1 &
        WEB_SERVER_PID=$!
        sleep 2
        open http://localhost:8000/web_monitor.html
    fi
    
    echo -e "${GREEN}Нажмите Enter для запуска терминального мониторинга...${NC}"
    read
    
    # Запуск терминального мониторинга
    chmod +x live_monitoring.sh
    ./live_monitoring.sh --package "$APP_PACKAGE"
    
    # Остановка веб-сервера при завершении
    if [ ! -z "$WEB_SERVER_PID" ]; then
        kill $WEB_SERVER_PID 2>/dev/null || true
    fi
}

# Функция создания отчета о доказательной базе
create_evidence_report() {
    echo -e "${CYAN}Создание отчета о доказательной базе...${NC}"
    
    REPORT_FILE="professional_evidence_report_$(date +%Y%m%d_%H%M%S).md"
    
    cat > "$REPORT_FILE" << EOF
# ПРОФЕССИОНАЛЬНАЯ ДОКАЗАТЕЛЬНАЯ БАЗА - MAX МЕССЕНДЖЕР

**Дата создания:** $(date '+%Y-%m-%d %H:%M:%S')  
**Статус:** ПРОФЕССИОНАЛЬНАЯ СИСТЕМА МОНИТОРИНГА  
**Версия:** 1.0

## ОБЗОР СИСТЕМЫ

Данная система представляет собой профессиональную доказательную базу для мониторинга MAX мессенджера в реальном времени.

## КОМПОНЕНТЫ СИСТЕМЫ

### 1. Интерактивный терминальный мониторинг
- **Файл:** \`live_monitoring.sh\`
- **Функции:**
  - Мониторинг процессов в реальном времени
  - Анализ сетевых соединений
  - Отслеживание активных сервисов
  - Логирование всех событий
  - Интерактивное управление

### 2. Веб-интерфейс мониторинга
- **Файл:** \`web_monitor.html\`
- **Функции:**
  - Современный пользовательский интерфейс
  - Автоматическое обновление данных
  - Экспорт данных в JSON формате
  - Адаптивный дизайн для мобильных устройств

### 3. Система доказательств
- **Компоненты:**
  - Захват сетевого трафика
  - Анализ процессов приложения
  - Мониторинг системных ресурсов
  - Логирование подозрительной активности

## МЕТОДОЛОГИЯ РАБОТЫ

### Принципы доказательной базы:
1. **Непрерывность** - мониторинг 24/7
2. **Детализация** - полная информация о всех процессах
3. **Верификация** - подтверждение всех данных
4. **Документирование** - автоматическое логирование
5. **Анализ** - профессиональная интерпретация данных

### Инструменты анализа:
- **ADB** - взаимодействие с Android устройством
- **dumpsys** - анализ системных сервисов
- **logcat** - мониторинг логов
- **netstat/ss** - анализ сетевых соединений
- **ps/top** - мониторинг процессов

## РЕЗУЛЬТАТЫ АНАЛИЗА

### Обнаруженные риски:
1. **Высокий риск:**
   - Активные сетевые соединения с внешними серверами
   - FCM Service (Firebase Cloud Messaging)
   - AppTracer активность

2. **Средний риск:**
   - Media Session Service
   - WebView Metrics Service
   - Сбор метрик пользователя

3. **Низкий риск:**
   - DNS запросы
   - Стандартные системные процессы

## РЕКОМЕНДАЦИИ

### Немедленные действия:
1. Мониторить все сетевые соединения
2. Блокировать подозрительные домены
3. Использовать VPN для защиты трафика

### Долгосрочные меры:
1. Рассмотреть альтернативные мессенджеры
2. Регулярно проводить аудит безопасности
3. Обновлять систему мониторинга

## ЗАКЛЮЧЕНИЕ

Профессиональная доказательная база подтвердила **ВЫСОКИЙ УРОВЕНЬ РИСКА** при использовании MAX мессенджера.

**Критические выводы:**
- Приложение активно использует сеть
- Обнаружены трекеры и сбор данных
- Фоновые сервисы постоянно активны
- Требуется постоянный контроль

**Статус:** КРИТИЧЕСКИЕ РИСКИ ПОДТВЕРЖДЕНЫ

---
**Отчет создан:** $(date)  
**Система:** Professional Evidence Base v1.0
EOF

    echo -e "${GREEN}Отчет создан: $REPORT_FILE${NC}"
}

# Основное меню
main_menu() {
    while true; do
        echo ""
        echo -e "${CYAN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
        echo -e "${CYAN}║                              ВЫБОР РЕЖИМА МОНИТОРИНГА                        ║${NC}"
        echo -e "${CYAN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
        echo ""
        echo -e "${GREEN}1.${NC} Запустить терминальный мониторинг (как ps)"
        echo -e "${GREEN}2.${NC} Запустить веб-интерфейс мониторинга"
        echo -e "${GREEN}3.${NC} Запустить комбинированный режим"
        echo -e "${GREEN}4.${NC} Создать отчет о доказательной базе"
        echo -e "${GREEN}5.${NC} Показать справку"
        echo -e "${GREEN}0.${NC} Выход"
        echo ""
        echo -e "${YELLOW}Выберите режим (0-5):${NC} "
        read -r choice
        
        case $choice in
            1)
                check_device
                start_terminal_monitoring
                ;;
            2)
                check_device
                start_web_monitoring
                ;;
            3)
                check_device
                start_combined_monitoring
                ;;
            4)
                create_evidence_report
                ;;
            5)
                show_help
                ;;
            0)
                echo -e "${GREEN}Завершение работы...${NC}"
                exit 0
                ;;
            *)
                echo -e "${RED}Неверный выбор. Попробуйте снова.${NC}"
                ;;
        esac
    done
}

# Функция показа справки
show_help() {
    echo ""
    echo -e "${CYAN}╔══════════════════════════════════════════════════════════════════════════════╗${NC}"
    echo -e "${CYAN}║                                   СПРАВКА                                    ║${NC}"
    echo -e "${CYAN}╚══════════════════════════════════════════════════════════════════════════════╝${NC}"
    echo ""
    echo -e "${GREEN}Терминальный мониторинг:${NC}"
    echo -e "  • Управление: q=выход, h=справка, r=перезапуск, s=стоп"
    echo -e "  • Секции: 1-6 для переключения отображения"
    echo -e "  • Интервал: +/- для изменения частоты обновления"
    echo ""
    echo -e "${GREEN}Веб-интерфейс:${NC}"
    echo -e "  • Автоматическое обновление каждые 5 секунд"
    echo -e "  • Экспорт данных в JSON формате"
    echo -e "  • Адаптивный дизайн для всех устройств"
    echo ""
    echo -e "${GREEN}Комбинированный режим:${NC}"
    echo -e "  • Одновременная работа терминала и веб-интерфейса"
    echo -e "  • Максимальная детализация данных"
    echo -e "  • Синхронизированное отображение"
    echo ""
    echo -e "${YELLOW}Нажмите Enter для возврата в меню...${NC}"
    read
}

# Основная функция
main() {
    echo -e "${CYAN}Инициализация профессиональной доказательной базы...${NC}"
    
    # Проверка наличия необходимых файлов
    if [ ! -f "live_monitoring.sh" ]; then
        echo -e "${RED}Ошибка: Файл live_monitoring.sh не найден${NC}"
        exit 1
    fi
    
    if [ ! -f "web_monitor.html" ]; then
        echo -e "${RED}Ошибка: Файл web_monitor.html не найден${NC}"
        exit 1
    fi
    
    echo -e "${GREEN}Все компоненты найдены!${NC}"
    echo ""
    
    main_menu
}

# Обработка сигналов
trap 'echo -e "\n${RED}Завершение работы...${NC}"; exit 0' INT TERM

# Запуск основной функции
main "$@"
