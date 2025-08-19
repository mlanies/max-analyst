// API Service для работы с бэкендом
class ApiService {
    constructor(baseUrl = 'http://localhost:5003') {
        this.baseUrl = baseUrl;
    }

    // Универсальный GET метод
    async get(endpoint, params = {}) {
        try {
            const url = new URL(`${this.baseUrl}${endpoint}`);
            
            // Добавляем параметры запроса
            Object.keys(params).forEach(key => {
                url.searchParams.append(key, params[key]);
            });
            
            const response = await fetch(url.toString());
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            return await response.json();
        } catch (error) {
            console.error(`Error fetching ${endpoint}:`, error);
            throw error;
        }
    }

    // Универсальный POST метод
    async post(endpoint, data = {}) {
        try {
            const response = await fetch(`${this.baseUrl}${endpoint}`, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(data)
            });
            
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            
            const contentType = response.headers.get('content-type');
            if (contentType && contentType.includes('application/json')) {
                return await response.json();
            } else {
                return await response.text();
            }
        } catch (error) {
            console.error(`Error posting to ${endpoint}:`, error);
            throw error;
        }
    }

    // Получение метрик системы
    async getMetrics() {
        try {
            const response = await fetch(`${this.baseUrl}/api/metrics`);
            return await response.json();
        } catch (error) {
            console.error('Error fetching metrics:', error);
            return {
                cpu_usage: 0,
                memory_usage: 0,
                network_activity: 0,
                status: 'error'
            };
        }
    }

    // Получение данных безопасности
    async getSecurityData() {
        try {
            const response = await fetch(`${this.baseUrl}/api/max-security`);
            return await response.json();
        } catch (error) {
            console.error('Error fetching security data:', error);
            return {
                security_status: 'error',
                security_events: {},
                network_analysis: {},
                permissions_count: 0
            };
        }
    }

    // Получение логов
    async getLogs() {
        try {
            const response = await fetch(`${this.baseUrl}/api/logs`);
            return await response.json();
        } catch (error) {
            console.error('Error fetching logs:', error);
            return [];
        }
    }

    // Получение статуса системы
    async getStatus() {
        try {
            const response = await fetch(`${this.baseUrl}/api/status`);
            return await response.json();
        } catch (error) {
            console.error('Error fetching status:', error);
            return { status: 'error' };
        }
    }
}

// Экспорт для использования в других модулях
window.ApiService = ApiService;
