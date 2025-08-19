// Monitoring Service для управления мониторингом
class MonitoringService {
    constructor(apiService, chartService) {
        this.apiService = apiService;
        this.chartService = chartService;
        this.isMonitoring = false;
        this.monitoringInterval = null;
        this.metricsInterval = null;
        this.chartsInterval = null;
    }

    // Запуск мониторинга
    startMonitoring() {
        if (this.isMonitoring) return;
        
        this.isMonitoring = true;
        this.updateButtonState(true);
        
        // Немедленное обновление
        this.updateMetrics();
        this.updateLogs();
        
        // Автоматическое обновление каждые 5 секунд
        this.monitoringInterval = setInterval(async () => {
            await this.updateMetrics();
            await this.updateLogs();
        }, 5000);
        
        // Дополнительное автообновление метрик каждые 3 секунды
        this.metricsInterval = setInterval(() => {
            this.updateMetrics();
        }, 3000);
        
        // Автообновление графиков каждые 5 секунд
        this.chartsInterval = setInterval(() => {
            this.updateCharts();
        }, 5000);
        
        this.addLogEntry('INFO', 'Monitoring started');
    }

    // Остановка мониторинга
    stopMonitoring() {
        if (!this.isMonitoring) return;
        
        this.isMonitoring = false;
        this.clearIntervals();
        this.updateButtonState(false);
        
        this.addLogEntry('INFO', 'Monitoring stopped');
    }

    // Очистка интервалов
    clearIntervals() {
        if (this.monitoringInterval) {
            clearInterval(this.monitoringInterval);
            this.monitoringInterval = null;
        }
        if (this.metricsInterval) {
            clearInterval(this.metricsInterval);
            this.metricsInterval = null;
        }
        if (this.chartsInterval) {
            clearInterval(this.chartsInterval);
            this.chartsInterval = null;
        }
    }

    // Обновление состояния кнопки
    updateButtonState(disabled) {
        const startButton = document.querySelector('button[onclick="startMonitoring()"]');
        if (startButton) {
            startButton.disabled = disabled;
        }
    }

    // Обновление метрик
    async updateMetrics() {
        try {
            const metricsData = await this.apiService.getMetrics();
            const securityData = await this.apiService.getSecurityData();
            
            this.updateStatusBar(metricsData);
            this.updateSystemMetrics(metricsData);
            await this.updateNetworkActivity();
            this.updateSecurityStatus(securityData);
            
        } catch (error) {
            console.error('Metrics update error:', error);
        }
    }

    // Обновление статус бара
    updateStatusBar(metricsData) {
        const elements = {
            'cpu-usage': (metricsData.cpu_usage || 0) + '%',
            'memory-usage': (metricsData.memory_usage || 0) + '%',
            'network-connections': (metricsData.network_activity || 0)
        };
        
        Object.entries(elements).forEach(([id, value]) => {
            const element = document.getElementById(id);
            if (element) element.textContent = value;
        });
    }

    // Обновление системных метрик
    updateSystemMetrics(metricsData) {
        const elements = {
            'cpu-metric': (metricsData.cpu_usage || 0) + '%',
            'memory-metric': (metricsData.memory_usage || 0) + '%',
            'network-in': (metricsData.network_activity || 0) + ' KB/s',
            'network-out': (metricsData.network_activity || 0) + ' KB/s'
        };
        
        Object.entries(elements).forEach(([id, value]) => {
            const element = document.getElementById(id);
            if (element) element.textContent = value;
        });
    }

    // Обновление сетевой активности
    async updateNetworkActivity() {
        try {
            // Получаем реальные данные из API
            const suspiciousData = await this.apiService.get('/api/suspicious-actions');
            const securityData = await this.apiService.get('/api/max-security');
            
            const networkAnalysis = securityData.network_analysis || {};
            const connectionTypes = networkAnalysis.connection_types || {};
            const protocols = networkAnalysis.protocols || {};
            
            // Подсчитываем реальные соединения
            const activeConnections = securityData.network_analysis?.connections?.length || 0;
            const httpRequests = protocols.http || 0;
            const httpsRequests = protocols.https || 0;
            const suspiciousDomains = connectionTypes.suspicious || 0;
            const activePermissions = securityData.permissions_count || 0;
            const detectedTrackers = connectionTypes.suspicious || 0;
            const sslErrors = 0; // Пока статично
            
            // console.log('Network Activity Data:', {
            //     activeConnections,
            //     httpRequests,
            //     httpsRequests,
            //     suspiciousDomains,
            //     activePermissions,
            //     detectedTrackers
            // });
            
            const elements = {
                'active-connections': activeConnections,
                'http-requests': httpRequests,
                'https-requests': httpsRequests,
                'suspicious-domains': suspiciousDomains,
                'active-permissions': activePermissions,
                'detected-trackers': detectedTrackers,
                'ssl-errors': sslErrors
            };
            
            Object.entries(elements).forEach(([id, value]) => {
                const element = document.getElementById(id);
                if (element) element.textContent = value;
            });
            
            // Обновляем статус безопасности
            this.updateSecurityStatus(securityData);
            
        } catch (error) {
            console.error('Error updating network activity:', error);
        }
    }

    // Обновление статуса безопасности
    updateSecurityStatus(securityData) {
        const riskLevel = this.calculateRiskLevel(securityData);
        const riskLevelElement = document.getElementById('risk-level');
        const riskIndicator = document.getElementById('risk-indicator');
        
        if (riskLevelElement && (!window.currentRiskLevel || window.currentRiskLevel.toLowerCase() !== riskLevel)) {
            const riskLevelText = riskLevel.charAt(0).toUpperCase() + riskLevel.slice(1);
            riskLevelElement.textContent = riskLevelText;
            riskLevelElement.className = riskLevel === 'high' ? 'status-danger' : 
                                       riskLevel === 'medium' ? 'status-warning' : 'status-safe';
            
            // Обновляем индикатор риска
            if (riskIndicator) {
                riskIndicator.className = 'status-indicator';
                if (riskLevel === 'high') {
                    riskIndicator.classList.add('offline');
                } else if (riskLevel === 'medium') {
                    riskIndicator.classList.add('warning');
                } else {
                    riskIndicator.classList.add('online');
                }
            }
            
            window.currentRiskLevel = riskLevelText;
        }
        
        // Обновляем индикаторы для других метрик
        this.updateSecurityIndicators(securityData);
    }
    
    // Обновление индикаторов безопасности
    updateSecurityIndicators(securityData) {
        const permissionsCount = securityData.permissions_count || 0;
        const trackersCount = securityData.network_analysis?.connection_types?.suspicious || 0;
        const sslErrors = 0; // Пока статично
        
        // Индикатор разрешений
        const permissionsIndicator = document.getElementById('permissions-indicator');
        if (permissionsIndicator) {
            permissionsIndicator.className = 'status-indicator';
            if (permissionsCount > 10) {
                permissionsIndicator.classList.add('offline');
            } else if (permissionsCount > 5) {
                permissionsIndicator.classList.add('warning');
            } else {
                permissionsIndicator.classList.add('online');
            }
        }
        
        // Индикатор трекеров
        const trackersIndicator = document.getElementById('trackers-indicator');
        if (trackersIndicator) {
            trackersIndicator.className = 'status-indicator';
            if (trackersCount > 5) {
                trackersIndicator.classList.add('offline');
            } else if (trackersCount > 0) {
                trackersIndicator.classList.add('warning');
            } else {
                trackersIndicator.classList.add('online');
            }
        }
        
        // Индикатор SSL ошибок
        const sslIndicator = document.getElementById('ssl-indicator');
        if (sslIndicator) {
            sslIndicator.className = 'status-indicator';
            if (sslErrors > 0) {
                sslIndicator.classList.add('offline');
            } else {
                sslIndicator.classList.add('online');
            }
        }
    }

    // Расчет уровня риска
    calculateRiskLevel(securityData) {
        const securityEvents = securityData.security_events || {};
        const networkAnalysis = securityData.network_analysis || {};
        const connectionTypes = networkAnalysis.connection_types || {};
        
        const fileAccessCount = securityEvents.file_access ? securityEvents.file_access.length : 0;
        const cameraAccessCount = securityEvents.camera_access ? securityEvents.camera_access.length : 0;
        const audioRecordingCount = securityEvents.audio_recording ? securityEvents.audio_recording.length : 0;
        const networkSpyingCount = securityEvents.network_spying ? securityEvents.network_spying.length : 0;
        
        const totalSuspicious = connectionTypes.suspicious + fileAccessCount + cameraAccessCount + audioRecordingCount + networkSpyingCount;
        
        // Используем реальные данные для расчета риска
        if (totalSuspicious > 20 || securityData.permissions_count > 15) {
            return 'high';
        } else if (totalSuspicious > 10 || securityData.permissions_count > 8) {
            return 'medium';
        } else {
            return 'low';
        }
    }

    // Обновление графиков
    async updateCharts() {
        try {
            const metricsData = await this.apiService.getMetrics();
            const securityData = await this.apiService.getSecurityData();
            
            this.chartService.updateResourcesChart(metricsData);
            
            const networkAnalysis = securityData.network_analysis || {};
            const protocols = networkAnalysis.protocols || {};
            this.chartService.updateNetworkChart(protocols);
            
            const riskLevel = this.calculateRiskLevel(securityData);
            this.chartService.updateSecurityChart(securityData);
            
        } catch (error) {
            console.error('Charts update error:', error);
        }
    }

    // Обновление логов
    async updateLogs() {
        try {
            const logs = await this.apiService.getLogs();
            const logContainer = document.getElementById('log-container');
            
            if (logContainer) {
                logContainer.innerHTML = '';
                logs.forEach(log => {
                    this.addLogEntry(log.level, log.message, log.timestamp);
                });
            }
        } catch (error) {
            console.error('Logs update error:', error);
        }
    }

    // Добавление записи в лог
    addLogEntry(level, message, timestamp = new Date().toLocaleTimeString()) {
        const logContainer = document.getElementById('log-container');
        if (!logContainer) return;
        
        const logEntry = document.createElement('div');
        logEntry.className = 'log-entry';
        
        const levelClass = 'log-level-' + level.toLowerCase();
        logEntry.innerHTML = `
            <span class="log-timestamp">[${timestamp}]</span>
            <span class="${levelClass}">[${level.toUpperCase()}]</span>
            <span>${message}</span>
        `;
        
        logContainer.appendChild(logEntry);
        logContainer.scrollTop = logContainer.scrollHeight;
        
        // Ограничение количества записей
        while (logContainer.children.length > 100) {
            logContainer.removeChild(logContainer.firstChild);
        }
    }
}

// Экспорт для использования в других модулях
window.MonitoringService = MonitoringService;
