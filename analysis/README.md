# MAX Analyst - Security Monitoring System

Профессиональная система мониторинга безопасности для анализа мессенджера MAX.

## Структура проекта

```
max-analyst/analysis/
├── web/                    # Веб-интерфейс
│   ├── index.html         # Главная страница
│   ├── modal.html         # Модальное окно безопасности
│   ├── css/
│   │   └── style.css      # Стили (темная тема)
│   ├── js/
│   │   ├── app.js         # Главное приложение
│   │   └── services/      # Сервисы
│   │       ├── api-service.js
│   │       ├── chart-service.js
│   │       ├── monitoring-service.js
│   │       └── modal-service.js
│   └── assets/
│       └── ru.oneme.app_6392_rs.apk  # APK файл для анализа
├── backend/               # Бэкенд
│   └── api/
│       ├── api_server.py
│       ├── simple_api.py
│       └── api_server_real.py
├── scripts/               # Скрипты
│   ├── bash/             # Bash скрипты
│   │   ├── start_emulator.sh
│   │   ├── start_android_studio.sh
│   │   ├── check_status.sh
│   │   ├── live_monitoring.sh
│   │   ├── traffic_analysis.sh
│   │   └── simple_traffic_analysis.sh
│   └── python/           # Python скрипты
│       └── test_api.py
├── logs/                 # Логи
├── reports/              # Отчеты
└── docs/                 # Документация
```

## Быстрый старт

### 1. Запуск веб-интерфейса
```bash
cd web
python3 -m http.server 8000
```

### 2. Запуск API сервера
```bash
cd backend/api
python3 api_server.py
```

### 3. Открыть в браузере
```
http://localhost:8000
```

## Функции

### Веб-интерфейс
- **Мониторинг в реальном времени** - отслеживание CPU, памяти, сети
- **Анализ безопасности** - проверка подозрительной активности
- **Графики** - визуализация данных с помощью Chart.js
- **Модальное окно безопасности** - детальный анализ HTTP запросов
- **Темная тема** - профессиональный дизайн

### API
- `/api/metrics` - системные метрики
- `/api/max-security` - данные безопасности
- `/api/status` - статус системы
- `/api/logs` - логи

### Скрипты
- **Эмулятор Android** - запуск и настройка
- **Мониторинг** - отслеживание активности
- **Анализ трафика** - анализ сетевого трафика
- **Проверка статуса** - проверка состояния системы

## Технологии

- **Frontend**: HTML5, CSS3, JavaScript (ES6+)
- **Charts**: Chart.js
- **Backend**: Python Flask
- **Android**: ADB, Android Emulator
- **Analysis**: Bash scripts, Python

## Модульная архитектура

Проект использует модульную архитектуру с разделением на сервисы:

- **ApiService** - работа с API
- **ChartService** - управление графиками
- **MonitoringService** - мониторинг системы
- **ModalService** - управление модальными окнами

## Безопасность

Система анализирует:
- Сетевую активность
- Доступ к файлам
- Использование камеры
- Аудиозапись
- Root доступ
- Подозрительные домены

## Лицензия

MIT License
