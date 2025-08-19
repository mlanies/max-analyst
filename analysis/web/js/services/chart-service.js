// Chart Service для управления графиками
class ChartService {
    constructor() {
        this.charts = {};
        this.initializeCharts();
    }

    // Инициализация всех графиков
    initializeCharts() {
        // Chart.js глобальная конфигурация для темной темы
        Chart.defaults.color = '#b0b0b0';
        Chart.defaults.borderColor = '#333333';
        Chart.defaults.plugins.legend.labels.color = '#b0b0b0';

        this.createResourcesChart();
        this.createNetworkChart();
        this.createSecurityChart();
    }

    // Создание графика ресурсов
    createResourcesChart() {
        const resourcesCtx = document.getElementById('resourcesChart').getContext('2d');
        this.charts.resources = new Chart(resourcesCtx, {
            type: 'line',
            data: {
                labels: [],
                datasets: [{
                    label: 'CPU (%)',
                    data: [],
                    borderColor: '#3b82f6',
                    backgroundColor: 'rgba(59, 130, 246, 0.1)',
                    tension: 0.4,
                    borderWidth: 2,
                    pointRadius: 3,
                    pointHoverRadius: 5
                }, {
                    label: 'Memory (MB)',
                    data: [],
                    borderColor: '#8b5cf6',
                    backgroundColor: 'rgba(139, 92, 246, 0.1)',
                    tension: 0.4,
                    borderWidth: 2,
                    pointRadius: 3,
                    pointHoverRadius: 5
                }]
            },
            options: {
                responsive: true,
                maintainAspectRatio: false,
                plugins: {
                    legend: {
                        position: 'top',
                        labels: {
                            usePointStyle: true,
                            padding: 15
                        }
                    }
                },
                scales: {
                    x: {
                        grid: { color: '#333333' },
                        ticks: { color: '#b0b0b0' }
                    },
                    y: {
                        beginAtZero: true,
                        grid: { color: '#333333' },
                        ticks: { color: '#b0b0b0' }
                    }
                },
                interaction: {
                    intersect: false,
                    mode: 'index'
                }
            }
        });
    }

    // Создание графика сети
    createNetworkChart() {
        const networkCtx = document.getElementById('networkChart').getContext('2d');
        this.charts.network = new Chart(networkCtx, {
            type: 'bar',
            data: {
                labels: ['HTTP', 'HTTPS', 'TCP', 'UDP'],
                datasets: [{
                    label: 'Connections',
                    data: [0, 0, 0, 0],
                    backgroundColor: [
                        'rgba(239, 68, 68, 0.8)',
                        'rgba(59, 130, 246, 0.8)',
                        'rgba(245, 158, 11, 0.8)',
                        'rgba(16, 185, 129, 0.8)'
                    ],
                    borderColor: [
                        '#ef4444',
                        '#3b82f6',
                        '#f59e0b',
                        '#10b981'
                    ],
                    borderWidth: 1
                }]
            },
            options: {
                responsive: true,
                maintainAspectRatio: false,
                plugins: {
                    legend: {
                        position: 'bottom',
                        labels: {
                            usePointStyle: true,
                            padding: 15
                        }
                    }
                }
            }
        });
    }

    // Создание графика безопасности
    createSecurityChart() {
        const securityCtx = document.getElementById('securityChart').getContext('2d');
        this.charts.security = new Chart(securityCtx, {
            type: 'doughnut',
            data: {
                labels: ['Safe Connections', 'Suspicious Activity', 'Google Services', 'API Calls', 'Media Uploads'],
                datasets: [{
                    data: [0, 0, 0, 0, 0],
                    backgroundColor: [
                        'rgba(16, 185, 129, 0.8)',   // Зеленый - безопасно
                        'rgba(239, 68, 68, 0.8)',    // Красный - подозрительно
                        'rgba(59, 130, 246, 0.8)',   // Синий - Google сервисы
                        'rgba(245, 158, 11, 0.8)',   // Желтый - API вызовы
                        'rgba(139, 92, 246, 0.8)'    // Фиолетовый - медиа
                    ],
                    borderColor: [
                        '#10b981',
                        '#ef4444', 
                        '#3b82f6',
                        '#f59e0b',
                        '#8b5cf6'
                    ],
                    borderWidth: 2
                }]
            },
            options: {
                responsive: true,
                maintainAspectRatio: false,
                plugins: {
                    legend: {
                        position: 'bottom',
                        labels: {
                            usePointStyle: true,
                            padding: 15,
                            font: {
                                size: 11
                            }
                        }
                    },
                    tooltip: {
                        callbacks: {
                            label: function(context) {
                                const label = context.label || '';
                                const value = context.parsed || 0;
                                return `${label}: ${value}`;
                            }
                        }
                    }
                }
            }
        });
    }

    // Обновление графика ресурсов
    updateResourcesChart(data) {
        const now = new Date().toLocaleTimeString();
        
        if (this.charts.resources.data.labels.length > 15) {
            this.charts.resources.data.labels.shift();
            this.charts.resources.data.datasets[0].data.shift();
            this.charts.resources.data.datasets[1].data.shift();
        }
        
        this.charts.resources.data.labels.push(now);
        this.charts.resources.data.datasets[0].data.push(data.cpu_usage || 0);
        this.charts.resources.data.datasets[1].data.push(data.memory_usage || 0);
        this.charts.resources.update('none');
    }

    // Обновление графика сети
    updateNetworkChart(protocols) {
        const httpCount = protocols.http || 0;
        const httpsCount = protocols.https || 0;
        const tcpCount = protocols.tcp || 0;
        const udpCount = protocols.udp || 0;
        
        this.charts.network.data.datasets[0].data = [httpCount, httpsCount, tcpCount, udpCount];
        this.charts.network.update('none');
    }

    // Обновление графика безопасности
    updateSecurityChart(securityData) {
        // Получаем реальные данные безопасности
        const networkAnalysis = securityData.network_analysis || {};
        const connectionTypes = networkAnalysis.connection_types || {};
        const protocols = networkAnalysis.protocols || {};
        const securityEvents = securityData.security_events || {};
        
        // Подсчитываем реальные метрики безопасности
        const totalConnections = connectionTypes.total || 0;
        const suspiciousConnections = connectionTypes.suspicious || 0;
        const googleServices = connectionTypes.google_services || 0;
        const apiCalls = connectionTypes.api_calls || 0;
        const mediaUploads = connectionTypes.media_uploads || 0;
        const socialMedia = connectionTypes.social_media || 0;
        
        // Подсчитываем события безопасности
        const fileAccessCount = securityEvents.file_access ? securityEvents.file_access.length : 0;
        const cameraAccessCount = securityEvents.camera_access ? securityEvents.camera_access.length : 0;
        const audioRecordingCount = securityEvents.audio_recording ? securityEvents.audio_recording.length : 0;
        const networkSpyingCount = securityEvents.network_spying ? securityEvents.network_spying.length : 0;
        
        // Обновляем данные графика
        this.charts.security.data.labels = [
            'Safe Connections',
            'Suspicious Activity', 
            'Google Services',
            'API Calls',
            'Media Uploads'
        ];
        
        this.charts.security.data.datasets[0].data = [
            totalConnections - suspiciousConnections, // Безопасные соединения
            suspiciousConnections + fileAccessCount + cameraAccessCount + audioRecordingCount + networkSpyingCount, // Подозрительная активность
            googleServices, // Google сервисы
            apiCalls, // API вызовы
            mediaUploads // Загрузка медиа
        ];
        
        // Обновляем цвета для лучшей визуализации
        this.charts.security.data.datasets[0].backgroundColor = [
            'rgba(16, 185, 129, 0.8)',   // Зеленый - безопасно
            'rgba(239, 68, 68, 0.8)',    // Красный - подозрительно
            'rgba(59, 130, 246, 0.8)',   // Синий - Google сервисы
            'rgba(245, 158, 11, 0.8)',   // Желтый - API вызовы
            'rgba(139, 92, 246, 0.8)'    // Фиолетовый - медиа
        ];
        
        this.charts.security.data.datasets[0].borderColor = [
            '#10b981',
            '#ef4444', 
            '#3b82f6',
            '#f59e0b',
            '#8b5cf6'
        ];
        
        this.charts.security.update('none');
    }
}

// Экспорт для использования в других модулях
window.ChartService = ChartService;
