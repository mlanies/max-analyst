# Техническое задание: Улучшение UI для анализа подозрительных действий мессенджера

## 📋 Обзор проекта
**Проект:** MAX Analyst - Security Monitoring System  
**Цель:** Создать систему мониторинга подозрительной активности мессенджера MAX  
**Статус:** Требует улучшения UI для отображения детальной информации о подозрительных действиях

---

## 🎯 Основные требования

### 1. Дашборд подозрительных действий
Создать новый раздел в главном интерфейсе для отображения подозрительных действий мессенджера в реальном времени.

#### Функциональные требования:
- **Отображение в реальном времени** подозрительных действий
- **Категоризация действий** по типам угроз
- **Счетчики активности** для каждой категории
- **Индикаторы уровня риска** (Low/Medium/High)
- **Фильтрация по времени** (сегодня/неделя/месяц)

#### Технические требования:
```javascript
// Структура данных для подозрительных действий
const suspiciousActivity = {
  timestamp: "2025-08-19T03:15:30Z",
  category: "network_spying",
  severity: "high",
  description: "Необычный HTTP запрос к внешнему серверу",
  details: {
    url: "https://tracking.example.com/collect",
    method: "POST",
    payload: "...",
    headers: {...}
  },
  app_package: "ru.oneme.app",
  user_id: "user123"
}
```

### 2. Модальное окно детального анализа
Создать расширенное модальное окно для просмотра детальной информации о подозрительных действиях.

#### Функциональные требования:
- **Детальная информация** о каждом подозрительном действии
- **Анализ сетевых запросов** с возможностью просмотра заголовков и тела
- **Временная шкала** событий
- **Экспорт данных** в различных форматах
- **Сравнение с нормальным поведением**

#### Технические требования:
```javascript
// API endpoints для получения данных
GET /api/suspicious-actions          // Список подозрительных действий
GET /api/suspicious-actions/{id}     // Детали конкретного действия
GET /api/network-requests            // Сетевые запросы
GET /api/activity-timeline           // Временная шкала активности
POST /api/export-suspicious-data     // Экспорт данных
```

---

## 🎨 UI/UX требования

### 1. Главный дашборд
```
┌─────────────────────────────────────────────────────────┐
│                    ПОДОЗРИТЕЛЬНЫЕ ДЕЙСТВИЯ              │
├─────────────────────────────────────────────────────────┤
│ 🔴 СЕТЕВОЕ ШПИОНСТВО    │ 🟡 ДОСТУП К ФАЙЛАМ    │ 🟢 КАМЕРА │
│        15 запросов      │        8 операций     │   3 раза  │
│      Высокий риск       │     Средний риск      │  Низкий   │
├─────────────────────────────────────────────────────────┤
│ 📊 ВРЕМЕННАЯ ШКАЛА АКТИВНОСТИ                          │
│ [График активности за последние 24 часа]               │
├─────────────────────────────────────────────────────────┤
│ 🚨 ПОСЛЕДНИЕ СОБЫТИЯ                                    │
│ • 03:15 - HTTP POST к tracking.example.com              │
│ • 03:12 - Чтение файла /sdcard/Downloads/private.pdf   │
│ • 03:10 - Доступ к камере (скрытый режим)              │
└─────────────────────────────────────────────────────────┘
```

### 2. Модальное окно детального анализа
```
┌─────────────────────────────────────────────────────────┐
│ 🔍 ДЕТАЛЬНЫЙ АНАЛИЗ: HTTP POST к tracking.example.com  │
├─────────────────────────────────────────────────────────┤
│ 📋 ОСНОВНАЯ ИНФОРМАЦИЯ                                  │
│ Время: 2025-08-19 03:15:30                             │
│ Категория: Сетевое шпионаже                            │
│ Уровень риска: Высокий                                 │
│ Приложение: ru.oneme.app                               │
├─────────────────────────────────────────────────────────┤
│ 🌐 СЕТЕВОЙ ЗАПРОС                                       │
│ URL: https://tracking.example.com/collect              │
│ Метод: POST                                            │
│ Размер: 2.3 KB                                         │
│ Длительность: 1.2 сек                                  │
├─────────────────────────────────────────────────────────┤
│ 📄 ЗАГОЛОВКИ ЗАПРОСА                                    │
│ User-Agent: MAX-Messenger/1.0.0                        │
│ Content-Type: application/json                         │
│ Authorization: Bearer [скрыто]                         │
├─────────────────────────────────────────────────────────┤
│ 📦 ТЕЛО ЗАПРОСА                                         │
│ {                                                      │
│   "user_id": "user123",                                │
│   "event": "message_sent",                             │
│   "timestamp": "2025-08-19T03:15:30Z",                 │
│   "metadata": {...}                                    │
│ }                                                      │
├─────────────────────────────────────────────────────────┤
│ ⚠️  АНАЛИЗ БЕЗОПАСНОСТИ                                 │
│ • Домен не связан с мессенджером                       │
│ • Отправка персональных данных                         │
│ • Скрытая передача метаданных                          │
├─────────────────────────────────────────────────────────┤
│ [📊 СРАВНЕНИЕ] [📥 ЭКСПОРТ] [❌ ЗАКРЫТЬ]               │
└─────────────────────────────────────────────────────────┘
```

---

## 🔧 Техническая реализация

### 1. Backend API расширения

#### Новые endpoints:
```python
# В api_server.py добавить:

@app.route('/api/suspicious-actions')
def get_suspicious_actions():
    """Получение списка подозрительных действий"""
    return jsonify({
        "actions": [
            {
                "id": "action_001",
                "timestamp": "2025-08-19T03:15:30Z",
                "category": "network_spying",
                "severity": "high",
                "description": "HTTP POST к внешнему серверу",
                "app_package": "ru.oneme.app",
                "details_url": "/api/suspicious-actions/action_001"
            }
        ],
        "summary": {
            "total": 15,
            "high_risk": 8,
            "medium_risk": 5,
            "low_risk": 2
        }
    })

@app.route('/api/suspicious-actions/<action_id>')
def get_action_details(action_id):
    """Получение детальной информации о подозрительном действии"""
    return jsonify({
        "id": action_id,
        "timestamp": "2025-08-19T03:15:30Z",
        "category": "network_spying",
        "severity": "high",
        "description": "HTTP POST к tracking.example.com",
        "network_request": {
            "url": "https://tracking.example.com/collect",
            "method": "POST",
            "headers": {
                "User-Agent": "MAX-Messenger/1.0.0",
                "Content-Type": "application/json"
            },
            "body": {
                "user_id": "user123",
                "event": "message_sent",
                "metadata": {...}
            },
            "response": {
                "status": 200,
                "size": "2.3 KB",
                "duration": "1.2 сек"
            }
        },
        "security_analysis": {
            "suspicious_domain": True,
            "personal_data_sent": True,
            "hidden_transmission": True,
            "recommendations": [
                "Блокировать домен tracking.example.com",
                "Проверить настройки приватности",
                "Рассмотреть альтернативный мессенджер"
            ]
        }
    })

@app.route('/api/activity-timeline')
def get_activity_timeline():
    """Получение временной шкалы активности"""
    return jsonify({
        "timeline": [
            {
                "timestamp": "2025-08-19T03:15:00Z",
                "events": [
                    {"type": "network", "severity": "high"},
                    {"type": "file_access", "severity": "medium"}
                ]
            }
        ]
    })
```

### 2. Frontend компоненты

#### Новые JavaScript сервисы:
```javascript
// services/suspicious-activity-service.js
class SuspiciousActivityService {
    constructor(apiService) {
        this.apiService = apiService;
    }

    async getSuspiciousActions() {
        return await this.apiService.get('/api/suspicious-actions');
    }

    async getActionDetails(actionId) {
        return await this.apiService.get(`/api/suspicious-actions/${actionId}`);
    }

    async getActivityTimeline() {
        return await this.apiService.get('/api/activity-timeline');
    }

    async exportData(format = 'json') {
        return await this.apiService.post('/api/export-suspicious-data', { format });
    }
}

// services/security-analysis-service.js
class SecurityAnalysisService {
    analyzeNetworkRequest(request) {
        const analysis = {
            suspicious_domain: this.isSuspiciousDomain(request.url),
            personal_data_sent: this.containsPersonalData(request.body),
            hidden_transmission: this.isHiddenTransmission(request),
            risk_level: this.calculateRiskLevel(request)
        };
        return analysis;
    }

    isSuspiciousDomain(url) {
        const suspiciousDomains = [
            'tracking', 'analytics', 'spy', 'telemetry',
            'monitoring', 'surveillance', 'collect'
        ];
        return suspiciousDomains.some(domain => url.includes(domain));
    }

    containsPersonalData(body) {
        const personalDataPatterns = [
            'user_id', 'phone', 'email', 'location',
            'contacts', 'messages', 'calls'
        ];
        return personalDataPatterns.some(pattern => 
            JSON.stringify(body).includes(pattern)
        );
    }
}
```

#### Новые UI компоненты:
```javascript
// components/suspicious-activity-dashboard.js
class SuspiciousActivityDashboard {
    constructor() {
        this.service = new SuspiciousActivityService(new ApiService());
        this.analysisService = new SecurityAnalysisService();
        this.init();
    }

    async init() {
        await this.loadData();
        this.renderDashboard();
        this.startRealTimeUpdates();
    }

    async loadData() {
        this.actions = await this.service.getSuspiciousActions();
        this.timeline = await this.service.getActivityTimeline();
    }

    renderDashboard() {
        this.renderSummaryCards();
        this.renderActivityTimeline();
        this.renderRecentEvents();
    }

    renderSummaryCards() {
        const container = document.getElementById('suspicious-summary');
        container.innerHTML = `
            <div class="summary-card high-risk">
                <h3>🔴 СЕТЕВОЕ ШПИОНСТВО</h3>
                <div class="count">${this.actions.summary.high_risk}</div>
                <div class="risk-level">Высокий риск</div>
            </div>
            <div class="summary-card medium-risk">
                <h3>🟡 ДОСТУП К ФАЙЛАМ</h3>
                <div class="count">${this.actions.summary.medium_risk}</div>
                <div class="risk-level">Средний риск</div>
            </div>
            <div class="summary-card low-risk">
                <h3>🟢 КАМЕРА</h3>
                <div class="count">${this.actions.summary.low_risk}</div>
                <div class="risk-level">Низкий риск</div>
            </div>
        `;
    }
}

// components/suspicious-activity-modal.js
class SuspiciousActivityModal {
    constructor() {
        this.service = new SuspiciousActivityService(new ApiService());
        this.analysisService = new SecurityAnalysisService();
    }

    async showActionDetails(actionId) {
        const action = await this.service.getActionDetails(actionId);
        this.renderModal(action);
    }

    renderModal(action) {
        const modal = document.getElementById('suspicious-activity-modal');
        modal.innerHTML = `
            <div class="modal-content">
                <div class="modal-header">
                    <h2>🔍 ДЕТАЛЬНЫЙ АНАЛИЗ: ${action.description}</h2>
                    <button onclick="this.closeModal()">❌</button>
                </div>
                <div class="modal-body">
                    ${this.renderBasicInfo(action)}
                    ${this.renderNetworkRequest(action.network_request)}
                    ${this.renderSecurityAnalysis(action.security_analysis)}
                </div>
                <div class="modal-footer">
                    <button onclick="this.exportData()">📥 ЭКСПОРТ</button>
                    <button onclick="this.closeModal()">❌ ЗАКРЫТЬ</button>
                </div>
            </div>
        `;
        modal.style.display = 'block';
    }

    renderNetworkRequest(request) {
        return `
            <div class="section">
                <h3>🌐 СЕТЕВОЙ ЗАПРОС</h3>
                <div class="request-details">
                    <div><strong>URL:</strong> ${request.url}</div>
                    <div><strong>Метод:</strong> ${request.method}</div>
                    <div><strong>Размер:</strong> ${request.response.size}</div>
                    <div><strong>Длительность:</strong> ${request.response.duration}</div>
                </div>
                <div class="request-headers">
                    <h4>📄 ЗАГОЛОВКИ ЗАПРОСА</h4>
                    <pre>${JSON.stringify(request.headers, null, 2)}</pre>
                </div>
                <div class="request-body">
                    <h4>📦 ТЕЛО ЗАПРОСА</h4>
                    <pre>${JSON.stringify(request.body, null, 2)}</pre>
                </div>
            </div>
        `;
    }
}
```

---

## 📊 Категории подозрительных действий

### 1. Сетевое шпионаже (🔴 Высокий риск)
- HTTP/HTTPS запросы к подозрительным доменам
- Отправка персональных данных на внешние серверы
- Скрытая передача метаданных
- Соединения с трекинговыми сервисами

### 2. Доступ к файлам (🟡 Средний риск)
- Чтение системных файлов
- Доступ к личным документам
- Сканирование директорий
- Копирование файлов

### 3. Камера и микрофон (🟢 Низкий риск)
- Скрытый доступ к камере
- Запись аудио без уведомления
- Фоновое использование медиа устройств

### 4. Системная активность (🟡 Средний риск)
- Чтение системных логов
- Доступ к системным настройкам
- Мониторинг других приложений

---

## 🎯 Критерии приемки

### Функциональные требования:
- [ ] Дашборд отображает подозрительные действия в реальном времени
- [ ] Модальное окно показывает детальную информацию о каждом действии
- [ ] Фильтрация по категориям и времени работает корректно
- [ ] Экспорт данных в JSON/CSV форматах
- [ ] Временная шкала активности отображается корректно

### Технические требования:
- [ ] API endpoints возвращают корректные данные
- [ ] Frontend компоненты работают без ошибок
- [ ] Реальное время обновления данных (каждые 5 секунд)
- [ ] Адаптивный дизайн для мобильных устройств
- [ ] Логирование всех действий для отладки

### UI/UX требования:
- [ ] Интуитивно понятный интерфейс
- [ ] Цветовая индикация уровней риска
- [ ] Быстрая загрузка данных
- [ ] Плавные анимации переходов
- [ ] Доступность для пользователей с ограниченными возможностями

---

## 📅 Временные рамки

**Этап 1 (Backend):** 3-5 дней
- Реализация API endpoints
- Логика анализа подозрительных действий
- Интеграция с существующей системой мониторинга

**Этап 2 (Frontend):** 5-7 дней
- Создание UI компонентов
- Интеграция с существующим интерфейсом
- Тестирование функциональности

**Этап 3 (Тестирование):** 2-3 дня
- Функциональное тестирование
- UI/UX тестирование
- Исправление багов

**Общее время:** 10-15 дней

---

## 🔧 Инструменты и технологии

### Backend:
- Python Flask (существующий)
- ADB для получения данных с Android устройства
- JSON для API ответов

### Frontend:
- Vanilla JavaScript (существующий)
- Chart.js для графиков
- CSS Grid/Flexbox для макета
- LocalStorage для кэширования

### Мониторинг:
- Real-time обновления через WebSocket или polling
- Логирование в файлы
- Экспорт данных

---

## 📝 Дополнительные требования

### Безопасность:
- Валидация всех входных данных
- Санитизация данных перед отображением
- Логирование доступа к чувствительной информации

### Производительность:
- Кэширование часто запрашиваемых данных
- Пагинация для больших списков
- Оптимизация запросов к API

### Масштабируемость:
- Модульная архитектура компонентов
- Возможность добавления новых категорий действий
- Расширяемая система анализа безопасности


