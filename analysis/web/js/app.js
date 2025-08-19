// Главное приложение MAX Analyst
class MaxAnalystApp {
    constructor() {
        this.apiService = new ApiService();
        this.chartService = new ChartService();
        this.monitoringService = new MonitoringService(this.apiService, this.chartService);
        this.modalService = new ModalService(this.apiService);
        
        // Делаем modalService доступным глобально
        window.modalService = this.modalService;
        
        this.initializeApp();
    }

    // Инициализация приложения
    initializeApp() {
        this.checkAppStatus();
        this.setupEventListeners();
        this.autoStartMonitoring();
    }

    // Проверка статуса приложения
    async checkAppStatus() {
        try {
            const data = await this.apiService.getStatus();
            
            const statusText = data.status === 'running' ? 'Online' : 'Offline';
            const statusElement = document.getElementById('app-status');
            if (statusElement) {
                statusElement.textContent = statusText;
                statusElement.className = 'status-value ' + 
                    (data.status === 'running' ? 'status-online' : 'status-offline');
            }
            
            const pidElement = document.getElementById('process-pid');
            if (pidElement) {
                pidElement.textContent = data.devices && data.devices.length > 0 ? data.devices[0] : '-';
            }
            
        } catch (error) {
            console.error('Status check error:', error);
            const statusElement = document.getElementById('app-status');
            if (statusElement) {
                statusElement.textContent = 'Error';
                statusElement.className = 'status-value status-offline';
            }
        }
    }

    // Настройка обработчиков событий
    setupEventListeners() {
        // Обработчики для кнопок мониторинга
        document.addEventListener('click', (e) => {
            if (e.target.matches('button[onclick="startMonitoring()"]')) {
                e.preventDefault();
                this.monitoringService.startMonitoring();
            } else if (e.target.matches('button[onclick="stopMonitoring()"]')) {
                e.preventDefault();
                this.monitoringService.stopMonitoring();
            } else if (e.target.matches('button[onclick="openHttpModal()"]')) {
                e.preventDefault();
                this.modalService.openHttpModal();
            } else if (e.target.matches('button[onclick="exportData()"]')) {
                e.preventDefault();
                this.exportData();
            } else if (e.target.matches('button[onclick="clearLogs()"]')) {
                e.preventDefault();
                this.clearLogs();
            }
        });

        // Обработчики для модального окна
        document.addEventListener('click', (e) => {
            if (e.target.matches('button[onclick="closeHttpModal()"]')) {
                e.preventDefault();
                this.modalService.closeHttpModal();
            } else if (e.target.matches('button[onclick="closeDetailsModal()"]')) {
                e.preventDefault();
                this.modalService.closeDetailsModal();
            } else if (e.target.matches('button[onclick="filterRequests()"]')) {
                e.preventDefault();
                this.modalService.filterRequests();
            } else if (e.target.matches('button[onclick="clearFilters()"]')) {
                e.preventDefault();
                this.modalService.clearFilters();
            } else if (e.target.matches('button[onclick="refreshRequests()"]')) {
                e.preventDefault();
                this.modalService.loadHttpRequests();
            } else if (e.target.matches('button[onclick="previousPage()"]')) {
                e.preventDefault();
                this.modalService.previousPage();
            } else if (e.target.matches('button[onclick="nextPage()"]')) {
                e.preventDefault();
                this.modalService.nextPage();
            } else if (e.target.matches('button[onclick="exportRequests()"]')) {
                e.preventDefault();
                this.modalService.exportRequests();
            } else if (e.target.matches('button[onclick="exportSecurityReport()"]')) {
                e.preventDefault();
                this.modalService.exportSecurityReport();
            }
        });

        // Обработчики для фильтров
        document.addEventListener('change', (e) => {
            if (e.target.matches('#activity-filter, #status-filter, #time-filter')) {
                this.modalService.filterRequests();
            }
        });

        document.addEventListener('keyup', (e) => {
            if (e.target.matches('#domain-filter')) {
                this.modalService.filterRequests();
            }
        });

        // Обработчики для деталей запросов
        document.addEventListener('click', (e) => {
            if (e.target.matches('button[onclick^="showRequestDetails("]')) {
                e.preventDefault();
                const requestId = parseInt(e.target.getAttribute('onclick').match(/\d+/)[0]);
                this.modalService.showRequestDetails(requestId);
            }
        });
    }

    // Автозапуск мониторинга
    autoStartMonitoring() {
        setTimeout(() => {
            this.monitoringService.startMonitoring();
        }, 2000);
    }

    // Экспорт данных
    exportData() {
        const data = {
            timestamp: new Date().toISOString(),
            metrics: {
                cpu: document.getElementById('cpu-metric')?.textContent || '0%',
                memory: document.getElementById('memory-metric')?.textContent || '0%',
                connections: document.getElementById('active-connections')?.textContent || '0'
            },
            security: {
                risk_level: document.getElementById('risk-level')?.textContent || 'Unknown',
                permissions: document.getElementById('active-permissions')?.textContent || '0'
            }
        };
        
        const blob = new Blob([JSON.stringify(data, null, 2)], { type: 'application/json' });
        const url = URL.createObjectURL(blob);
        const a = document.createElement('a');
        a.href = url;
        a.download = 'max_analyst_export_' + new Date().toISOString().slice(0, 19).replace(/:/g, '-') + '.json';
        a.click();
        URL.revokeObjectURL(url);
        
        this.monitoringService.addLogEntry('INFO', 'Data exported successfully');
    }

    // Очистка логов
    clearLogs() {
        const logContainer = document.getElementById('log-container');
        if (logContainer) {
            logContainer.innerHTML = '';
        }
        this.monitoringService.addLogEntry('INFO', 'Logs cleared');
    }
}

// Глобальные функции для совместимости с HTML
window.startMonitoring = function() {
    if (window.app && window.app.monitoringService) {
        window.app.monitoringService.startMonitoring();
    }
};

window.stopMonitoring = function() {
    if (window.app && window.app.monitoringService) {
        window.app.monitoringService.stopMonitoring();
    }
};

window.openHttpModal = function() {
    if (window.app && window.app.modalService) {
        window.app.modalService.openHttpModal();
    }
};

window.closeHttpModal = function() {
    if (window.app && window.app.modalService) {
        window.app.modalService.closeHttpModal();
    }
};

window.closeDetailsModal = function() {
    if (window.app && window.app.modalService) {
        window.app.modalService.closeDetailsModal();
    }
};

window.filterRequests = function() {
    if (window.app && window.app.modalService) {
        window.app.modalService.filterRequests();
    }
};

window.clearFilters = function() {
    if (window.app && window.app.modalService) {
        window.app.modalService.clearFilters();
    }
};

window.refreshRequests = function() {
    if (window.app && window.app.modalService) {
        window.app.modalService.loadHttpRequests();
    }
};

window.previousPage = function() {
    if (window.app && window.app.modalService) {
        window.app.modalService.previousPage();
    }
};

window.nextPage = function() {
    if (window.app && window.app.modalService) {
        window.app.modalService.nextPage();
    }
};

window.showRequestDetails = function(requestId) {
    if (window.app && window.app.modalService) {
        window.app.modalService.showRequestDetails(requestId);
    }
};

window.showAnomalyDetails = function(activityId) {
    if (window.app && window.app.modalService) {
        window.app.modalService.showAnomalyDetails(activityId);
    }
};

window.exportRequests = function() {
    if (window.app && window.app.modalService) {
        window.app.modalService.exportRequests();
    }
};

window.exportSecurityReport = function() {
    if (window.app && window.app.modalService) {
        window.app.modalService.exportSecurityReport();
    }
};

window.exportData = function() {
    if (window.app) {
        window.app.exportData();
    }
};

window.clearLogs = function() {
    if (window.app) {
        window.app.clearLogs();
    }
};

// Инициализация приложения при загрузке страницы
document.addEventListener('DOMContentLoaded', function() {
    // Инициализация глобальной переменной для уровня риска
    window.currentRiskLevel = 'Low';
    
    // Создание экземпляра приложения
    window.app = new MaxAnalystApp();
});
