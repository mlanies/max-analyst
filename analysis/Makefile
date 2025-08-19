# MAX Analyst - Makefile

.PHONY: help start stop clean install setup

# Переменные
WEB_PORT = 8000
API_PORT = 5003
WEB_DIR = web
API_DIR = backend/api

# Помощь
help:
	@echo "MAX Analyst - Security Monitoring System"
	@echo ""
	@echo "Доступные команды:"
	@echo "  make start     - Запустить веб-интерфейс и API"
	@echo "  make web       - Запустить только веб-интерфейс"
	@echo "  make api       - Запустить только API"
	@echo "  make stop      - Остановить все процессы"
	@echo "  make clean     - Очистить логи и временные файлы"
	@echo "  make install   - Установить зависимости"
	@echo "  make setup     - Настройка проекта"
	@echo "  make emulator  - Запустить Android эмулятор"
	@echo "  make monitor   - Запустить мониторинг"
	@echo "  make status    - Проверить статус системы"

# Запуск всего проекта
start: web api
	@echo "MAX Analyst запущен!"
	@echo "Веб-интерфейс: http://localhost:$(WEB_PORT)"
	@echo "API: http://localhost:$(API_PORT)"

# Запуск веб-интерфейса
web:
	@echo "Запуск веб-интерфейса на порту $(WEB_PORT)..."
	@cd $(WEB_DIR) && python3 -m http.server $(WEB_PORT) &
	@echo "Веб-интерфейс доступен по адресу: http://localhost:$(WEB_PORT)"

# Запуск API
api:
	@echo "Запуск API сервера на порту $(API_PORT)..."
	@cd $(API_DIR) && python3 api_server.py &
	@echo "API доступен по адресу: http://localhost:$(API_PORT)"

# Остановка всех процессов
stop:
	@echo "Остановка всех процессов..."
	@pkill -f "python3 -m http.server $(WEB_PORT)" || true
	@pkill -f "api_server.py" || true
	@echo "Все процессы остановлены"

# Очистка
clean:
	@echo "Очистка проекта..."
	@rm -rf logs/*.log
	@rm -rf temp/*
	@rm -rf __pycache__
	@find . -name "*.pyc" -delete
	@echo "Очистка завершена"

# Установка зависимостей
install:
	@echo "Установка зависимостей..."
	@pip3 install flask requests
	@echo "Зависимости установлены"

# Настройка проекта
setup:
	@echo "Настройка проекта..."
	@mkdir -p logs reports temp
	@chmod +x scripts/bash/*.sh
	@echo "Проект настроен"

# Запуск эмулятора
emulator:
	@echo "Запуск Android эмулятора..."
	@./scripts/bash/start_emulator.sh

# Запуск мониторинга
monitor:
	@echo "Запуск мониторинга..."
	@./scripts/bash/live_monitoring.sh

# Проверка статуса
status:
	@echo "Проверка статуса системы..."
	@./scripts/bash/check_status.sh

# Перезапуск
restart: stop start

# Логи
logs:
	@echo "Последние логи:"
	@tail -f logs/*.log

# Отчеты
reports:
	@echo "Генерация отчетов..."
	@./scripts/bash/traffic_analysis.sh

# Тест API
test-api:
	@echo "Тестирование API..."
	@python3 scripts/python/test_api.py
