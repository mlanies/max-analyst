#!/bin/bash

# MAX Analyst - Startup Script

# Цвета для вывода
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# Функция для вывода сообщений
log_info() {
    echo -e "${BLUE}ℹ️  $1${NC}"
}

log_success() {
    echo -e "${GREEN}✅ $1${NC}"
}

log_warning() {
    echo -e "${YELLOW}⚠️  $1${NC}"
}

log_error() {
    echo -e "${RED}❌ $1${NC}"
}

# Функция для проверки порта
check_port() {
    local port=$1
    local service=$2
    local max_attempts=30
    local attempt=1
    
    log_info "Проверка $service на порту $port..."
    
    while [ $attempt -le $max_attempts ]; do
        if curl -s "http://localhost:$port" > /dev/null 2>&1; then
            log_success "$service доступен на порту $port"
            return 0
        fi
        
        if [ $attempt -eq $max_attempts ]; then
            log_error "$service не отвечает на порту $port после $max_attempts попыток"
            return 1
        fi
        
        sleep 1
        attempt=$((attempt + 1))
    done
}

# Функция для остановки процессов
stop_processes() {
    log_info "Остановка существующих процессов..."
    
    # Остановка веб-сервера
    pkill -f "python3 -m http.server 8000" > /dev/null 2>&1 || true
    
    # Остановка API сервера
    pkill -f "api_server.py" > /dev/null 2>&1 || true
    
    # Ждем завершения процессов
    sleep 2
    
    log_success "Процессы остановлены"
}

# Функция для создания необходимых директорий
create_directories() {
    log_info "Создание необходимых директорий..."
    
    mkdir -p logs reports temp web/css web/js/services backend/api
    chmod +x scripts/bash/*.sh 2>/dev/null || true
    
    log_success "Директории созданы"
}

# Функция для установки зависимостей
install_dependencies() {
    log_info "Проверка и установка зависимостей..."
    
    # Проверка Python
    if ! command -v python3 &> /dev/null; then
        log_error "Python3 не найден. Установите Python3."
        exit 1
    fi
    
    # Проверка pip
    if ! command -v pip3 &> /dev/null; then
        log_error "pip3 не найден. Установите pip3."
        exit 1
    fi
    
    # Установка Python зависимостей
    log_info "Установка Python зависимостей..."
    
    # Проверяем наличие виртуального окружения
    if [ ! -d "venv" ]; then
        log_info "Создание виртуального окружения..."
        python3 -m venv venv
    fi
    
    # Активируем виртуальное окружение и устанавливаем зависимости
    source venv/bin/activate && pip install flask requests flask-cors > /dev/null 2>&1 || {
        log_warning "Не удалось установить зависимости. Попробуйте установить вручную:"
        echo "source venv/bin/activate && pip install flask requests flask-cors"
    }
    
    log_success "Зависимости проверены"
}

# Функция для запуска веб-сервера
start_web_server() {
    log_info "Запуск веб-сервера..."
    
    # Проверяем, что мы в правильной директории
    if [ ! -f "web/index.html" ]; then
        log_error "Файл web/index.html не найден. Убедитесь, что вы находитесь в корневой директории проекта."
        exit 1
    fi
    
    # Запускаем веб-сервер из папки web
    cd web
    python3 -m http.server 8000 > ../logs/web_server.log 2>&1 &
    WEB_PID=$!
    cd ..
    
    # Сохраняем PID
    echo $WEB_PID > temp/web_server.pid
    
    # Проверяем, что сервер запустился
    sleep 2
    if check_port 8000 "Веб-сервер"; then
        log_success "Веб-сервер запущен (PID: $WEB_PID)"
    else
        log_error "Не удалось запустить веб-сервер"
        exit 1
    fi
}

# Функция для запуска API сервера
start_api_server() {
    log_info "Запуск API сервера..."
    
    # Проверяем наличие API сервера
    if [ ! -f "backend/api/simple_api.py" ]; then
        log_warning "API сервер не найден. Создаем простой API сервер..."
        create_simple_api_server
    fi
    
    # Запускаем API сервер с виртуальным окружением
    cd backend/api
    source ../../venv/bin/activate && python simple_api.py > ../../logs/api_server.log 2>&1 &
    API_PID=$!
    cd ../..
    
    # Сохраняем PID
    echo $API_PID > temp/api_server.pid
    
    # Проверяем, что сервер запустился
    sleep 2
    if check_port 5003 "API сервер"; then
        log_success "API сервер запущен (PID: $API_PID)"
    else
        log_warning "API сервер может быть не запущен. Проверьте логи: logs/api_server.log"
    fi
}

# Функция для создания простого API сервера
create_simple_api_server() {
    log_info "Создание простого API сервера..."
    
    mkdir -p backend/api
    
    cat > backend/api/api_server.py << 'EOF'
#!/usr/bin/env python3
"""
Простой API сервер для MAX Analyst
"""

from flask import Flask, jsonify
import json
import time
import random
from datetime import datetime

app = Flask(__name__)

# Мок данные для демонстрации
def get_mock_data():
    return {
        "system_metrics": {
            "cpu_usage": random.randint(10, 80),
            "memory_usage": random.randint(20, 90),
            "disk_usage": random.randint(30, 70),
            "network_activity": random.randint(5, 50)
        },
        "network_activity": {
            "http_requests": random.randint(100, 500),
            "https_requests": random.randint(200, 800),
            "tcp_connections": random.randint(50, 200),
            "udp_packets": random.randint(10, 100),
            "suspicious_connections": random.randint(0, 5)
        },
        "security_status": {
            "risk_level": random.choice(["Low", "Medium", "High"]),
            "suspicious_activities": random.randint(0, 10),
            "permissions_count": random.randint(5, 20),
            "last_scan": datetime.now().isoformat()
        },
        "max_messenger": {
            "status": "active",
            "version": "1.0.0",
            "permissions": [
                "android.permission.INTERNET",
                "android.permission.ACCESS_NETWORK_STATE",
                "android.permission.READ_EXTERNAL_STORAGE",
                "android.permission.WRITE_EXTERNAL_STORAGE"
            ],
            "network_requests": random.randint(50, 200),
            "data_transmitted": random.randint(1000, 5000)
        }
    }

@app.route('/')
def index():
    return jsonify({"status": "MAX Analyst API Server", "version": "1.0.0"})

@app.route('/api/status')
def status():
    return jsonify({"status": "running", "timestamp": datetime.now().isoformat()})

@app.route('/api/metrics')
def metrics():
    data = get_mock_data()
    return jsonify(data)

@app.route('/api/max-security')
def max_security():
    data = get_mock_data()
    return jsonify({
        "permissions_count": data["security_status"]["permissions_count"],
        "security_events": {
            "file_access": [],
            "camera_access": [],
            "audio_recording": [],
            "network_spying": []
        },
        "risk_level": data["security_status"]["risk_level"]
    })

@app.route('/api/logs')
def logs():
    return jsonify({
        "logs": [
            {
                "timestamp": datetime.now().isoformat(),
                "level": "INFO",
                "message": "MAX Analyst monitoring active"
            }
        ]
    })

if __name__ == '__main__':
    print("🚀 Запуск MAX Analyst API сервера на порту 5003...")
    app.run(host='0.0.0.0', port=5003, debug=False)
EOF

    log_success "API сервер создан"
}

# Функция для отображения информации о запуске
show_startup_info() {
    echo ""
    log_success "MAX Analyst успешно запущен!"
    echo ""
    echo -e "${BLUE}📱 Веб-интерфейс:${NC} http://localhost:8000"
    echo -e "${BLUE}🔌 API:${NC} http://localhost:5003"
    echo ""
    echo -e "${YELLOW}Полезные команды:${NC}"
    echo "  make stop      - Остановить все сервисы"
    echo "  make restart   - Перезапустить все сервисы"
    echo "  make logs      - Просмотр логов"
    echo "  make status    - Проверить статус"
    echo ""
    echo -e "${GREEN}Для остановки используйте: make stop${NC}"
    echo ""
}

# Основная функция
main() {
    echo -e "${BLUE}🚀 Запуск MAX Analyst Security Monitoring System...${NC}"
    echo ""
    
    # Остановка существующих процессов
    stop_processes
    
    # Создание директорий
    create_directories
    
    # Установка зависимостей
    install_dependencies
    
    # Запуск сервисов
    start_web_server
    start_api_server
    
    # Отображение информации
    show_startup_info
}

# Запуск основной функции
main "$@"
