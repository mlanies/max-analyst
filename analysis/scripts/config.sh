#!/bin/bash

# Конфигурация проекта MAX Analyst
# Централизованное управление настройками

# Основные настройки
export PROJECT_NAME="MAX Analyst"
export PROJECT_VERSION="2.0.0"
export PROJECT_DESCRIPTION="Professional Security Analysis Framework for MAX Messenger"

# Настройки приложения
export DEFAULT_APP_PACKAGE="ru.oneme.app"
export DEFAULT_APP_NAME="MAX Messenger"
export APK_FILE="ru.oneme.app_6392_rs.apk"

# Пути и директории
export ANALYSIS_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
export LOG_DIR="$ANALYSIS_DIR/logs"
export REPORTS_DIR="$ANALYSIS_DIR/reports"
export STATIC_DIR="$ANALYSIS_DIR/static"
export SCRIPTS_DIR="$ANALYSIS_DIR/scripts"
export TEMP_DIR="$ANALYSIS_DIR/temp"

# Создание необходимых директорий
mkdir -p "$LOG_DIR" "$REPORTS_DIR" "$TEMP_DIR"

# Настройки мониторинга
export MONITORING_REFRESH_INTERVAL=2
export MONITORING_MAX_LOGS=1000
export MONITORING_LOG_RETENTION_DAYS=30

# Настройки веб-интерфейса
export WEB_SERVER_PORT=8000
export WEB_SERVER_HOST="localhost"
export WEB_UI_REFRESH_INTERVAL=5000

# Настройки анализа
export STATIC_ANALYSIS_TIMEOUT=300
export DYNAMIC_ANALYSIS_TIMEOUT=600
export TRAFFIC_CAPTURE_DURATION=300

# Цветовая схема
export COLOR_RED='\033[0;31m'
export COLOR_GREEN='\033[0;32m'
export COLOR_YELLOW='\033[1;33m'
export COLOR_BLUE='\033[0;34m'
export COLOR_PURPLE='\033[0;35m'
export COLOR_CYAN='\033[0;36m'
export COLOR_NC='\033[0m'

# Уровни логирования
export LOG_LEVEL_DEBUG=0
export LOG_LEVEL_INFO=1
export LOG_LEVEL_WARN=2
export LOG_LEVEL_ERROR=3
export DEFAULT_LOG_LEVEL=$LOG_LEVEL_INFO

# Настройки безопасности
export ENABLE_SSL_PINNING_CHECK=true
export ENABLE_PERMISSION_ANALYSIS=true
export ENABLE_TRACKER_DETECTION=true
export ENABLE_NETWORK_ANALYSIS=true

# Настройки отчетов
export REPORT_FORMAT="markdown"
export REPORT_INCLUDE_EVIDENCE=true
export REPORT_INCLUDE_RECOMMENDATIONS=true
export REPORT_AUTO_GENERATE=true

# Функции конфигурации
load_config() {
    local config_file="$1"
    if [ -f "$config_file" ]; then
        # shellcheck disable=SC1090
        source "$config_file"
    fi
}

save_config() {
    local config_file="$1"
    local config_data="$2"
    echo "$config_data" > "$config_file"
}

get_config_value() {
    local key="$1"
    local default_value="$2"
    local value
    
    value=$(eval "echo \$$key")
    if [ -z "$value" ]; then
        echo "$default_value"
    else
        echo "$value"
    fi
}

set_config_value() {
    local key="$1"
    local value="$2"
    eval "export $key=\"$value\""
}

# Загрузка пользовательской конфигурации
USER_CONFIG_FILE="$ANALYSIS_DIR/.config"
if [ -f "$USER_CONFIG_FILE" ]; then
    load_config "$USER_CONFIG_FILE"
fi
