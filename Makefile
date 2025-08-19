# MAX Analyst - Security Monitoring System
# Makefile для управления проектом и автоматизации задач

.PHONY: help install setup clean analyze monitor report test lint docs start stop restart web api status health info backup restore update quick traffic emulator studio realistic

# =============================================================================
# ПЕРЕМЕННЫЕ
# =============================================================================

PROJECT_NAME = MAX Analyst
VERSION = 2.0.0
ANALYSIS_DIR = analysis
SCRIPTS_DIR = $(ANALYSIS_DIR)/scripts
REPORTS_DIR = $(ANALYSIS_DIR)/reports
LOG_DIR = $(ANALYSIS_DIR)/logs
WEB_DIR = $(ANALYSIS_DIR)/web
API_DIR = $(ANALYSIS_DIR)/backend/api

# Порты
WEB_PORT = 8000
API_PORT = 5003

# Цвета для вывода
RED = \033[0;31m
GREEN = \033[0;32m
YELLOW = \033[1;33m
BLUE = \033[0;34m
NC = \033[0m # No Color

# =============================================================================
# ОСНОВНЫЕ КОМАНДЫ
# =============================================================================

# Помощь
help:
	@echo "$(BLUE)$(PROJECT_NAME) v$(VERSION)$(NC)"
	@echo ""
	@echo "$(YELLOW)Основные команды:$(NC)"
	@echo "  $(GREEN)start$(NC)       - Запустить всю систему (веб + API)"
	@echo "  $(GREEN)web$(NC)         - Запустить только веб-интерфейс"
	@echo "  $(GREEN)api$(NC)         - Запустить только API сервер"
	@echo "  $(GREEN)stop$(NC)        - Остановить все сервисы"
	@echo "  $(GREEN)restart$(NC)     - Перезапустить все сервисы"
	@echo "  $(GREEN)status$(NC)      - Проверить статус системы"
	@echo ""
	@echo "$(YELLOW)Анализ и мониторинг:$(NC)"
	@echo "  $(GREEN)analyze$(NC)     - Запуск полного анализа"
	@echo "  $(GREEN)monitor$(NC)     - Запуск мониторинга"
	@echo "  $(GREEN)realistic$(NC)   - Реалистичный анализ безопасности"
	@echo "  $(GREEN)quick$(NC)       - Быстрый анализ"
	@echo "  $(GREEN)traffic$(NC)     - Анализ трафика"
	@echo ""
	@echo "$(YELLOW)Управление проектом:$(NC)"
	@echo "  $(GREEN)install$(NC)     - Установка зависимостей"
	@echo "  $(GREEN)setup$(NC)       - Настройка окружения"
	@echo "  $(GREEN)report$(NC)      - Генерация отчетов"
	@echo "  $(GREEN)clean$(NC)       - Очистка временных файлов"
	@echo "  $(GREEN)backup$(NC)      - Создание бэкапа"
	@echo "  $(GREEN)update$(NC)      - Обновление проекта"
	@echo ""
	@echo "$(YELLOW)Android инструменты:$(NC)"
	@echo "  $(GREEN)emulator$(NC)    - Запуск Android эмулятора"
	@echo "  $(GREEN)studio$(NC)      - Запуск Android Studio"
	@echo ""
	@echo "$(YELLOW)Утилиты:$(NC)"
	@echo "  $(GREEN)test$(NC)        - Запуск тестов"
	@echo "  $(GREEN)lint$(NC)        - Проверка кода"
	@echo "  $(GREEN)docs$(NC)        - Генерация документации"
	@echo "  $(GREEN)health$(NC)      - Проверка здоровья системы"
	@echo "  $(GREEN)info$(NC)        - Информация о системе"
	@echo "  $(GREEN)help$(NC)        - Показать эту справку"

# =============================================================================
# ЗАПУСК СИСТЕМЫ
# =============================================================================

# Запуск всей системы
start: web api
	@echo "$(GREEN)✅ $(PROJECT_NAME) запущен!$(NC)"
	@echo "$(BLUE)🌐 Веб-интерфейс: http://localhost:$(WEB_PORT)$(NC)"
	@echo "$(BLUE)🔌 API: http://localhost:$(API_PORT)$(NC)"
	@echo "$(YELLOW)Для остановки используйте: make stop$(NC)"

# Запуск веб-интерфейса
web:
	@echo "$(BLUE)Запуск веб-интерфейса на порту $(WEB_PORT)...$(NC)"
	@cd $(WEB_DIR) && python3 -m http.server $(WEB_PORT) > ../logs/web_server.log 2>&1 &
	@echo "$(GREEN)✅ Веб-интерфейс доступен: http://localhost:$(WEB_PORT)$(NC)"

# Запуск API сервера
api:
	@echo "$(BLUE)Запуск API сервера на порту $(API_PORT)...$(NC)"
	@cd $(API_DIR) && source ../../venv/bin/activate && python simple_api.py > ../../logs/api_server.log 2>&1 &
	@echo "$(GREEN)✅ API доступен: http://localhost:$(API_PORT)$(NC)"

# Остановка всех сервисов
stop:
	@echo "$(BLUE)Остановка всех сервисов...$(NC)"
	@pkill -f "python3 -m http.server $(WEB_PORT)" >/dev/null 2>&1 || true
	@pkill -f "simple_api.py" >/dev/null 2>&1 || true
	@pkill -f "api_server.py" >/dev/null 2>&1 || true
	@echo "$(GREEN)✅ Все сервисы остановлены$(NC)"

# Перезапуск системы
restart: stop start

# =============================================================================
# УСТАНОВКА И НАСТРОЙКА
# =============================================================================

# Установка зависимостей
install:
	@echo "$(BLUE)Установка зависимостей...$(NC)"
	@which adb >/dev/null 2>&1 || (echo "$(RED)❌ ADB не найден. Установите Android SDK$(NC)" && exit 1)
	@which python3 >/dev/null 2>&1 || (echo "$(RED)❌ Python3 не найден$(NC)" && exit 1)
	@which make >/dev/null 2>&1 || (echo "$(RED)❌ Make не найден$(NC)" && exit 1)
	@echo "$(GREEN)✅ Системные зависимости проверены$(NC)"
	@echo "$(BLUE)Создание виртуального окружения...$(NC)"
	@cd $(ANALYSIS_DIR) && python3 -m venv venv
	@cd $(ANALYSIS_DIR) && source venv/bin/activate && pip install flask flask-cors requests
	@echo "$(GREEN)✅ Python зависимости установлены$(NC)"

# Настройка окружения
setup:
	@echo "$(BLUE)Настройка окружения...$(NC)"
	@mkdir -p $(LOG_DIR) $(REPORTS_DIR) $(ANALYSIS_DIR)/temp $(WEB_DIR) $(API_DIR)
	@chmod +x $(ANALYSIS_DIR)/*.sh 2>/dev/null || true
	@chmod +x $(SCRIPTS_DIR)/*.sh 2>/dev/null || true
	@echo "$(GREEN)✅ Окружение настроено$(NC)"

# =============================================================================
# АНАЛИЗ И МОНИТОРИНГ
# =============================================================================

# Запуск полного анализа
analyze:
	@echo "$(BLUE)Запуск полного анализа...$(NC)"
	@cd $(ANALYSIS_DIR) && ./start.sh

# Запуск мониторинга
monitor:
	@echo "$(BLUE)Запуск мониторинга...$(NC)"
	@cd $(ANALYSIS_DIR) && ./scripts/bash/live_monitoring.sh

# Реалистичный анализ безопасности
realistic:
	@echo "$(BLUE)Запуск реалистичного анализа безопасности...$(NC)"
	@cd $(ANALYSIS_DIR) && ./scripts/bash/realistic_analysis.sh

# Быстрый анализ
quick:
	@echo "$(BLUE)Быстрый анализ...$(NC)"
	@cd $(ANALYSIS_DIR) && ./scripts/bash/simple_traffic_analysis.sh

# Анализ трафика
traffic:
	@echo "$(BLUE)Анализ трафика...$(NC)"
	@cd $(ANALYSIS_DIR) && ./scripts/bash/traffic_analysis.sh

# =============================================================================
# ОТЧЕТЫ И ДОКУМЕНТАЦИЯ
# =============================================================================

# Генерация отчетов
report:
	@echo "$(BLUE)Генерация отчетов...$(NC)"
	@cd $(SCRIPTS_DIR) && ./report_generator.sh all
	@echo "$(GREEN)✅ Отчеты сгенерированы в $(REPORTS_DIR)$(NC)"

# Генерация документации
docs:
	@echo "$(BLUE)Генерация документации...$(NC)"
	@echo "$(YELLOW)⚠️  Документация пока не реализована$(NC)"

# =============================================================================
# ТЕСТИРОВАНИЕ И ПРОВЕРКА
# =============================================================================

# Запуск тестов
test:
	@echo "$(BLUE)Запуск тестов...$(NC)"
	@echo "$(YELLOW)⚠️  Тесты пока не реализованы$(NC)"

# Проверка кода
lint:
	@echo "$(BLUE)Проверка кода...$(NC)"
	@which shellcheck >/dev/null 2>&1 && find $(ANALYSIS_DIR) -name "*.sh" -exec shellcheck {} \; || echo "$(YELLOW)⚠️  ShellCheck не установлен$(NC)"
	@echo "$(GREEN)✅ Проверка кода завершена$(NC)"

# =============================================================================
# СТАТУС И ИНФОРМАЦИЯ
# =============================================================================

# Проверка статуса
status:
	@echo "$(BLUE)Статус системы:$(NC)"
	@echo "  Версия: $(VERSION)"
	@echo "  Директории:"
	@echo "    Анализ: $(ANALYSIS_DIR)"
	@echo "    Скрипты: $(SCRIPTS_DIR)"
	@echo "    Отчеты: $(REPORTS_DIR)"
	@echo "    Логи: $(LOG_DIR)"
	@echo "    Веб: $(WEB_DIR)"
	@echo "    API: $(API_DIR)"
	@echo "  Сервисы:"
	@ps aux | grep -E "(http.server|simple_api)" | grep -v grep || echo "    Нет запущенных сервисов"

# Проверка здоровья системы
health:
	@echo "$(BLUE)Проверка здоровья системы...$(NC)"
	@echo "  Проверка ADB..."
	@adb version >/dev/null 2>&1 && echo "$(GREEN)✅ ADB работает$(NC)" || echo "$(RED)❌ ADB не работает$(NC)"
	@echo "  Проверка Python..."
	@python3 --version >/dev/null 2>&1 && echo "$(GREEN)✅ Python работает$(NC)" || echo "$(RED)❌ Python не работает$(NC)"
	@echo "  Проверка директорий..."
	@[ -d "$(ANALYSIS_DIR)" ] && echo "$(GREEN)✅ Директория анализа$(NC)" || echo "$(RED)❌ Директория анализа$(NC)"
	@[ -d "$(SCRIPTS_DIR)" ] && echo "$(GREEN)✅ Директория скриптов$(NC)" || echo "$(RED)❌ Директория скриптов$(NC)"
	@[ -d "$(WEB_DIR)" ] && echo "$(GREEN)✅ Директория веб$(NC)" || echo "$(RED)❌ Директория веб$(NC)"
	@[ -d "$(API_DIR)" ] && echo "$(GREEN)✅ Директория API$(NC)" || echo "$(RED)❌ Директория API$(NC)"

# Информация о системе
info:
	@echo "$(BLUE)Информация о системе:$(NC)"
	@echo "  ОС: $(shell uname -s)"
	@echo "  Архитектура: $(shell uname -m)"
	@echo "  Версия: $(shell uname -r)"
	@echo "  ADB: $(shell which adb 2>/dev/null || echo 'Не установлен')"
	@echo "  Python: $(shell python3 --version 2>/dev/null || echo 'Не установлен')"
	@echo "  Bash: $(shell bash --version | head -1 2>/dev/null || echo 'Не установлен')"
	@echo "  Make: $(shell make --version | head -1 2>/dev/null || echo 'Не установлен')"

# =============================================================================
# ANDROID ИНСТРУМЕНТЫ
# =============================================================================

# Запуск эмулятора
emulator:
	@echo "$(BLUE)Запуск Android эмулятора...$(NC)"
	@cd $(ANALYSIS_DIR) && ./scripts/bash/start_emulator.sh

# Запуск Android Studio
studio:
	@echo "$(BLUE)Запуск Android Studio и эмулятора...$(NC)"
	@cd $(ANALYSIS_DIR) && ./scripts/bash/start_android_studio.sh

# =============================================================================
# УПРАВЛЕНИЕ ДАННЫМИ
# =============================================================================

# Очистка временных файлов
clean:
	@echo "$(BLUE)Очистка временных файлов...$(NC)"
	@rm -rf $(LOG_DIR)/*.log
	@rm -rf $(ANALYSIS_DIR)/temp/*
	@rm -rf $(REPORTS_DIR)/*.tmp
	@find . -name "*.pyc" -delete 2>/dev/null || true
	@find . -name "__pycache__" -type d -exec rm -rf {} + 2>/dev/null || true
	@echo "$(GREEN)✅ Очистка завершена$(NC)"

# Создание бэкапа
backup:
	@echo "$(BLUE)Создание бэкапа...$(NC)"
	@tar -czf max_analyst_backup_$(shell date +%Y%m%d_%H%M%S).tar.gz \
		--exclude='*.log' \
		--exclude='temp/*' \
		--exclude='*.tmp' \
		--exclude='venv/*' \
		--exclude='.git/*' \
		$(ANALYSIS_DIR)
	@echo "$(GREEN)✅ Бэкап создан$(NC)"

# Восстановление из бэкапа
restore:
	@echo "$(BLUE)Восстановление из бэкапа...$(NC)"
	@if [ -z "$(BACKUP_FILE)" ]; then \
		echo "$(RED)❌ Укажите файл бэкапа: make restore BACKUP_FILE=file.tar.gz$(NC)"; \
		exit 1; \
	fi
	@tar -xzf $(BACKUP_FILE)
	@echo "$(GREEN)✅ Восстановление завершено$(NC)"

# Обновление проекта
update:
	@echo "$(BLUE)Обновление проекта...$(NC)"
	@git pull origin main || echo "$(YELLOW)⚠️  Git недоступен$(NC)"
	@echo "$(GREEN)✅ Обновление завершено$(NC)"

# =============================================================================
# ДОПОЛНИТЕЛЬНЫЕ КОМАНДЫ
# =============================================================================

# Просмотр логов
logs:
	@echo "$(BLUE)Последние логи:$(NC)"
	@tail -f $(LOG_DIR)/*.log

# Просмотр отчетов
reports:
	@echo "$(BLUE)Доступные отчеты:$(NC)"
	@ls -la $(REPORTS_DIR)/ 2>/dev/null || echo "$(YELLOW)Нет отчетов$(NC)"

# Тест API
test-api:
	@echo "$(BLUE)Тестирование API...$(NC)"
	@curl -s http://localhost:$(API_PORT)/api/status || echo "$(RED)❌ API недоступен$(NC)"

# =============================================================================
# НАСТРОЙКИ
# =============================================================================

# Установка по умолчанию
.DEFAULT_GOAL := help

# Игнорирование ошибок для некоторых команд
.IGNORE: clean stop

# Специальные символы
.SUFFIXES:
