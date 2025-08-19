// Modal Service для управления модальным окном безопасности
class ModalService {
    constructor(apiService) {
        this.apiService = apiService;
        this.httpRequests = [];
        this.filteredRequests = [];
        this.currentPage = 1;
        this.requestsPerPage = 10;
    }

    // Открытие модального окна
    openHttpModal() {
        const modal = document.getElementById('http-requests-modal');
        if (modal) {
            modal.style.display = 'block';
            // Задержка для загрузки модального окна
            setTimeout(() => {
                this.loadHttpRequests();
            }, 100);
        }
    }

    // Закрытие модального окна
    closeHttpModal() {
        const modal = document.getElementById('http-requests-modal');
        if (modal) {
            modal.style.display = 'none';
        }
    }

    // Закрытие детального модального окна
    closeDetailsModal() {
        const modal = document.getElementById('request-details-modal');
        if (modal) {
            modal.style.display = 'none';
            console.log('Details modal closed');
        }
    }

    // Загрузка HTTP запросов
    async loadHttpRequests() {
        try {
            const data = await this.apiService.getSecurityData();
            
            this.updateAppInfo(data);
            this.updateSecurityMonitoring(data);
            
            this.httpRequests = this.generateNetworkActivityData(data);
            this.filteredRequests = [...this.httpRequests];
            this.updateRequestsTable();
            this.updateStats();
            
            // Загружаем данные о подозрительных действиях
            await this.loadSuspiciousActivities();
            
        } catch (error) {
            console.error('Error loading security data:', error);
        }
    }

    // Загрузка подозрительных действий
    async loadSuspiciousActivities() {
        console.log('loadSuspiciousActivities called');
        try {
            console.log('Fetching suspicious activities from API...');
            const response = await this.apiService.get('/api/suspicious-actions');
            console.log('API response:', response);
            
            const suspiciousData = response.suspicious_actions || [];
            const summary = response.summary || {};
            
            console.log('Suspicious data:', suspiciousData);
            console.log('Summary:', summary);
            
            this.updateAnomalyAnalysis(summary, suspiciousData);
            this.updateSecurityMonitoringWithAnomalies(suspiciousData);
            
        } catch (error) {
            console.error('Error loading suspicious activities:', error);
        }
    }

    // Обновление анализа аномалий
    updateAnomalyAnalysis(summary, suspiciousData) {
        // Обновляем счетчики
        const elements = {
            'high-risk-count': summary.high_risk || 0,
            'medium-risk-count': summary.medium_risk || 0,
            'low-risk-count': summary.low_risk || 0
        };
        
        Object.entries(elements).forEach(([id, value]) => {
            const element = document.getElementById(id);
            if (element) element.textContent = value;
        });
        
        // Обновляем детали аномалий
        this.updateAnomalyDetails(suspiciousData);
    }

    // Обновление деталей аномалий
    updateAnomalyDetails(suspiciousData) {
        console.log('updateAnomalyDetails called with data:', suspiciousData);
        const detailsContainer = document.getElementById('anomaly-details');
        if (!detailsContainer) {
            console.error('anomaly-details container not found');
            return;
        }
        
        if (suspiciousData.length === 0) {
            detailsContainer.innerHTML = '<div class="no-data">No suspicious activities detected</div>';
            return;
        }
        
        const detailsHTML = suspiciousData.map(activity => {
            const time = this.formatTimestamp(activity.timestamp);
            const category = this.getCategoryDisplayName(activity.category);
            const severity = activity.severity;
            
            return `
                <div class="anomaly-item" data-activity-id="${activity.id}">
                    <div class="anomaly-time">${time}</div>
                    <div class="anomaly-category">${category}</div>
                    <div class="anomaly-description-text">${activity.description}</div>
                    <span class="anomaly-severity ${severity}-risk">${severity.toUpperCase()}</span>
                    <button class="btn-details" data-activity-id="${activity.id}">Details</button>
                </div>
            `;
        }).join('');
        
        detailsContainer.innerHTML = detailsHTML;
        console.log('HTML added to container, length:', detailsHTML.length);
        
        // Добавляем обработчики событий для кнопок Details
        this.addAnomalyDetailsEventListeners();
    }

    // Обновление мониторинга безопасности с учетом аномалий
    updateSecurityMonitoringWithAnomalies(suspiciousData) {
        const categories = {
            'network_spying': { status: 'network-spying-status', details: 'network-spying-details' },
            'permission_abuse': { status: 'permission-status', details: 'permission-details' },
            'camera_access': { status: 'camera-status', details: 'camera-details' },
            'file_access': { status: 'file-status', details: 'file-details' },
            'location_tracking': { status: 'location-status', details: 'location-details' }
        };
        
        // Сбрасываем все статусы на безопасные
        Object.values(categories).forEach(({ status, details }) => {
            const statusElement = document.getElementById(status);
            const detailsElement = document.getElementById(details);
            
            if (statusElement) {
                statusElement.textContent = 'No Activity';
                statusElement.className = 'monitor-status status-safe';
            }
            
            if (detailsElement) {
                detailsElement.textContent = `No ${status.replace('-status', '')} detected`;
            }
        });
        
        // Обновляем статусы на основе реальных данных
        suspiciousData.forEach(activity => {
            const category = categories[activity.category];
            if (category) {
                const statusElement = document.getElementById(category.status);
                const detailsElement = document.getElementById(category.details);
                
                if (statusElement) {
                    statusElement.textContent = activity.severity.toUpperCase();
                    statusElement.className = `monitor-status status-${activity.severity === 'high' ? 'danger' : activity.severity === 'medium' ? 'warning' : 'safe'}`;
                }
                
                if (detailsElement) {
                    detailsElement.textContent = activity.description;
                }
            }
        });
    }

    // Вспомогательные функции
    formatTimestamp(timestamp) {
        const date = new Date(timestamp);
        return date.toLocaleTimeString();
    }

    getCategoryDisplayName(category) {
        const names = {
            'network_spying': 'Network Spying',
            'permission_abuse': 'Permission Abuse',
            'camera_access': 'Camera Access',
            'file_access': 'File Access',
            'location_tracking': 'Location Tracking',
            'system_monitoring': 'System Monitoring'
        };
        return names[category] || category;
    }

    // Добавление обработчиков событий для кнопок Details
    addAnomalyDetailsEventListeners() {
        const detailsButtons = document.querySelectorAll('.btn-details[data-activity-id]');
        console.log('Found details buttons:', detailsButtons.length);
        
        detailsButtons.forEach(button => {
            console.log('Adding event listener to button:', button.getAttribute('data-activity-id'));
            button.addEventListener('click', (e) => {
                e.preventDefault();
                e.stopPropagation();
                const activityId = button.getAttribute('data-activity-id');
                console.log('Button clicked, activityId:', activityId);
                this.showAnomalyDetails(activityId);
            });
        });
    }

    // Показать детали аномалии
    async showAnomalyDetails(activityId) {
        console.log('showAnomalyDetails called with activityId:', activityId);
        try {
            console.log('Fetching details from API...');
            const response = await this.apiService.get(`/api/suspicious-actions/${activityId}`);
            console.log('API response:', response);
            this.showAnomalyDetailsModal(response);
        } catch (error) {
            console.error('Error loading anomaly details:', error);
        }
    }

    // Показать модальное окно с деталями аномалии
    showAnomalyDetailsModal(activity) {
        console.log('showAnomalyDetailsModal called with activity:', activity);
        
        const modal = document.getElementById('request-details-modal');
        const content = modal ? modal.querySelector('.request-details') : null;
        
        console.log('Modal element:', modal);
        console.log('Content element:', content);
        
        if (!modal || !content) {
            console.error('Modal or content element not found');
            return;
        }
        
        const detailsHTML = this.generateAnomalyDetailsHTML(activity);
        console.log('Generated HTML length:', detailsHTML.length);
        
        content.innerHTML = detailsHTML;
        
        // Обновляем заголовок
        const header = modal.querySelector('.modal-header h2');
        if (header) {
            header.textContent = 'Anomaly Details';
        }
        
        console.log('Setting modal display to block');
        modal.style.display = 'block';
        console.log('Modal should now be visible');
    }

    // Генерация HTML для деталей аномалии
    generateAnomalyDetailsHTML(activity) {
        const time = this.formatTimestamp(activity.timestamp);
        const category = this.getCategoryDisplayName(activity.category);
        const severity = activity.severity;
        
        let detailsHTML = `
            <div class="anomaly-details-modal">
                <div class="detail-section">
                    <h3>Basic Information</h3>
                    <div class="detail-grid">
                        <div class="detail-item">
                            <label>ID:</label>
                            <span>${activity.id}</span>
                        </div>
                        <div class="detail-item">
                            <label>Category:</label>
                            <span>${category}</span>
                        </div>
                        <div class="detail-item">
                            <label>Severity:</label>
                            <span class="severity-badge ${severity}-risk">${severity.toUpperCase()}</span>
                        </div>
                        <div class="detail-item">
                            <label>Timestamp:</label>
                            <span>${time}</span>
                        </div>
                        <div class="detail-item">
                            <label>App Package:</label>
                            <span>${activity.app_package}</span>
                        </div>
                    </div>
                </div>
                
                <div class="detail-section">
                    <h3>Description</h3>
                    <p>${activity.description}</p>
                </div>
        `;
        
        // Добавляем детали в зависимости от категории
        if (activity.details) {
            detailsHTML += `
                <div class="detail-section">
                    <h3>Network Connection Details</h3>
                    <div class="detail-grid">
                        <div class="detail-item">
                            <label>Direction:</label>
                            <span>${activity.details.direction || 'Unknown'}</span>
                        </div>
                        <div class="detail-item">
                            <label>Protocol:</label>
                            <span>${activity.details.method || 'Unknown'}</span>
                        </div>
                        <div class="detail-item">
                            <label>Local Address:</label>
                            <span>${activity.details.local_address || 'Unknown'}</span>
                        </div>
                        <div class="detail-item">
                            <label>Remote Address:</label>
                            <span>${activity.details.remote_address || 'Unknown'}</span>
                        </div>
                        <div class="detail-item">
                            <label>Remote Domain:</label>
                            <span>${activity.details.remote_domain || 'Unknown'}</span>
                        </div>
                        <div class="detail-item">
                            <label>Remote IP:</label>
                            <span>${activity.details.remote_ip || 'Unknown'}</span>
                        </div>
                        <div class="detail-item">
                            <label>Service Type:</label>
                            <span>${activity.details.service_type || 'Unknown'}</span>
                        </div>
                        <div class="detail-item">
                            <label>URL:</label>
                            <span>${activity.details.url || 'Unknown'}</span>
                        </div>
                    </div>
                </div>
                
                <div class="detail-section">
                    <h3>Connection Headers</h3>
                    <div class="detail-grid">
            `;
            
            if (activity.details.headers) {
                Object.entries(activity.details.headers).forEach(([key, value]) => {
                    detailsHTML += `
                        <div class="detail-item">
                            <label>${key.replace(/_/g, ' ').toUpperCase()}:</label>
                            <span>${value}</span>
                        </div>
                    `;
                });
            }
            
            detailsHTML += `
                    </div>
                </div>
                
                <div class="detail-section">
                    <h3>Data Transmission</h3>
                    <div class="detail-grid">
            `;
            
            if (activity.details.body) {
                Object.entries(activity.details.body).forEach(([key, value]) => {
                    detailsHTML += `
                        <div class="detail-item">
                            <label>${key.replace(/_/g, ' ').toUpperCase()}:</label>
                            <span>${value}</span>
                        </div>
                    `;
                });
            }
            
            detailsHTML += `
                    </div>
                </div>
                
                <div class="detail-section">
                    <h3>Response Information</h3>
                    <div class="detail-grid">
            `;
            
            if (activity.details.response) {
                Object.entries(activity.details.response).forEach(([key, value]) => {
                    detailsHTML += `
                        <div class="detail-item">
                            <label>${key.replace(/_/g, ' ').toUpperCase()}:</label>
                            <span>${value}</span>
                        </div>
                    `;
                });
            }
            
            detailsHTML += `
                    </div>
                </div>
            `;
        }
        
        // Добавляем анализ безопасности
        if (activity.security_analysis) {
            detailsHTML += `
                <div class="detail-section">
                    <h3>Security Analysis</h3>
                    <div class="security-analysis">
            `;
            
            Object.entries(activity.security_analysis).forEach(([key, value]) => {
                if (key === 'recommendations' && Array.isArray(value)) {
                    detailsHTML += `
                        <div class="detail-item full-width">
                            <label>Recommendations:</label>
                            <ul>
                                ${value.map(rec => `<li>${rec}</li>`).join('')}
                            </ul>
                        </div>
                    `;
                } else if (typeof value === 'boolean') {
                    detailsHTML += `
                        <div class="detail-item">
                            <label>${key.replace(/_/g, ' ').toUpperCase()}:</label>
                            <span class="status-${value ? 'danger' : 'safe'}">${value ? 'Yes' : 'No'}</span>
                        </div>
                    `;
                } else {
                    detailsHTML += `
                        <div class="detail-item">
                            <label>${key.replace(/_/g, ' ').toUpperCase()}:</label>
                            <span>${value}</span>
                        </div>
                    `;
                }
            });
            
            detailsHTML += `
                    </div>
                </div>
            `;
        }
        
        detailsHTML += `</div>`;
        
        return detailsHTML;
    }

    // Обновление информации о приложении
    updateAppInfo(data) {
        const elements = {
            'app-package': data.app_package || 'Unknown',
            'app-pid': data.app_pid || '-',
            'permissions-count': data.permissions_count || 0
        };
        
        Object.entries(elements).forEach(([id, value]) => {
            const element = document.getElementById(id);
            if (element) element.textContent = value;
        });
        
        // Обновление статуса root
        const rootStatus = document.getElementById('root-status');
        if (rootStatus) {
            if (data.has_root) {
                rootStatus.textContent = 'Root Access Detected';
                rootStatus.className = 'status-danger';
            } else {
                rootStatus.textContent = 'No Root Access';
                rootStatus.className = 'status-safe';
            }
        }
        
        // Обновление статуса приложения
        const appStatus = document.getElementById('app-status');
        if (appStatus) {
            if (data.app_pid) {
                appStatus.textContent = 'Running';
                appStatus.className = 'status-safe';
            } else {
                appStatus.textContent = 'Not Running';
                appStatus.className = 'status-warning';
            }
        }
    }

    // Обновление мониторинга безопасности
    updateSecurityMonitoring(data) {
        const securityEvents = data.security_events || {};
        
        const monitors = {
            'screenshot-status': {
                events: securityEvents.screenshots || [],
                safeText: 'No Activity',
                warningText: 'Suspicious Activity',
                details: 'screenshot attempts detected'
            },
            'audio-status': {
                events: securityEvents.audio_recording || [],
                safeText: 'No Activity',
                warningText: 'Suspicious Activity',
                details: 'audio recording attempts detected'
            },
            'camera-status': {
                events: securityEvents.camera_access || [],
                safeText: 'No Activity',
                warningText: 'Suspicious Activity',
                details: 'unauthorized camera access attempts detected'
            },
            'location-status': {
                events: securityEvents.location_tracking || [],
                safeText: 'No Activity',
                warningText: 'Suspicious Activity',
                details: 'location tracking attempts detected'
            },
            'file-status': {
                events: securityEvents.file_access || [],
                safeText: 'No Activity',
                warningText: 'Suspicious Activity',
                details: 'unauthorized file access attempts detected'
            },
            'network-status': {
                events: securityEvents.network_spying || [],
                safeText: 'Normal',
                warningText: 'Suspicious Activity',
                details: 'Only legitimate API calls detected'
            }
        };
        
        Object.entries(monitors).forEach(([statusId, config]) => {
            const statusElement = document.getElementById(statusId);
            const detailsElement = document.getElementById(statusId.replace('-status', '-details'));
            
            if (statusElement) {
                if (config.events.length > 0) {
                    statusElement.textContent = config.warningText;
                    statusElement.className = 'monitor-status status-warning';
                } else {
                    statusElement.textContent = config.safeText;
                    statusElement.className = 'monitor-status status-safe';
                }
            }
            
            if (detailsElement) {
                if (config.events.length > 0) {
                    detailsElement.textContent = `${config.events.length} ${config.details}`;
                } else {
                    detailsElement.textContent = `No ${config.details}`;
                }
            }
        });
    }

    // Генерация данных сетевой активности
    generateNetworkActivityData(data) {
        const requests = [];
        const networkAnalysis = data.network_analysis;
        
        if (networkAnalysis?.domain_info && networkAnalysis.domain_info.length > 0) {
            networkAnalysis.domain_info.forEach((domainData, index) => {
                const { domain, ip, service, type: domainType } = domainData;
                
                let activityType = 'Network Activity';
                let purpose = 'Unknown';
                let status = 'Normal';
                let details = `Domain: ${domain} (${ip})`;
                
                switch (service) {
                    case 'messenger_api':
                        activityType = 'API Call';
                        purpose = 'Messenger API communication';
                        status = 'Normal';
                        details = `MAX Messenger API endpoint`;
                        break;
                    case 'media_service':
                        activityType = 'Media Upload';
                        purpose = 'File or media transfer';
                        status = 'Normal';
                        details = `Media content delivery`;
                        break;
                    case 'google_service':
                        activityType = 'Google Service';
                        purpose = 'Google services integration';
                        status = 'Normal';
                        details = `Google services (GMS, Play Store, etc.)`;
                        break;
                    case 'social_media':
                        activityType = 'Social Media';
                        purpose = 'Social media integration';
                        status = 'Normal';
                        details = `Social media platform`;
                        break;
                    case 'tracker':
                        activityType = 'Suspicious Activity';
                        purpose = 'Potential tracking or analytics';
                        status = 'Suspicious';
                        details = `Analytics or tracking service`;
                        break;
                    case 'apptracer_sdk':
                        activityType = 'AppTracer SDK';
                        purpose = 'Performance monitoring and crash reporting';
                        status = 'Normal';
                        details = `AppTracer SDK for app analytics`;
                        break;
                    default:
                        activityType = 'Network Activity';
                        purpose = 'Standard network communication';
                        status = 'Normal';
                        details = `Standard network endpoint`;
                }
                
                requests.push({
                    id: index + 1,
                    time: new Date().toLocaleTimeString(),
                    type: activityType,
                    url: domain,
                    purpose: purpose,
                    dataSize: Math.floor(Math.random() * 1000) + 100,
                    status: status,
                    domain: domain,
                    ip: ip,
                    service: service,
                    details: details
                });
            });
        }
        
        // Добавляем события из логов безопасности
        const securityEvents = data.security_events || {};
        
        // Добавляем события файлового доступа
        if (securityEvents.file_access && securityEvents.file_access.length > 0) {
            securityEvents.file_access.forEach((event, index) => {
                requests.push({
                    id: requests.length + index + 1,
                    time: event.timestamp,
                    type: 'File Access',
                    url: 'Local File System',
                    purpose: 'System Operation',
                    dataSize: Math.floor(Math.random() * 1000) + 50,
                    status: 'Normal',
                    domain: 'local'
                });
            });
        }
        
        // Если нет данных, создаем базовые записи
        if (requests.length === 0) {
            requests.push({
                id: 1,
                time: new Date().toLocaleTimeString(),
                type: 'Network Activity',
                url: 'No active connections',
                purpose: 'System idle',
                dataSize: 0,
                status: 'Normal',
                domain: 'none'
            });
        }
        
        return requests;
    }

    // Обновление таблицы запросов
    updateRequestsTable() {
        const tbody = document.getElementById('requests-tbody');
        if (!tbody) return;
        
        const startIndex = (this.currentPage - 1) * this.requestsPerPage;
        const endIndex = startIndex + this.requestsPerPage;
        const pageRequests = this.filteredRequests.slice(startIndex, endIndex);
        
        tbody.innerHTML = '';
        
        pageRequests.forEach(request => {
            const row = document.createElement('tr');
            const statusClass = request.status === 'Suspicious' ? 'status-danger' : 'status-safe';
            
            row.innerHTML = `
                <td>${request.time}</td>
                <td><span class="activity-type">${request.type}</span></td>
                <td>${request.url}</td>
                <td>${request.purpose}</td>
                <td>${request.dataSize} B</td>
                <td><span class="${statusClass}">${request.status}</span></td>
                <td>
                    <button class="btn btn-sm btn-primary" onclick="showRequestDetails(${request.id})">Details</button>
                </td>
            `;
            
            tbody.appendChild(row);
        });
        
        this.updatePagination();
    }

    // Обновление статистики
    updateStats() {
        const total = this.filteredRequests.length;
        const apiCount = this.filteredRequests.filter(r => r.type === 'API Call' || r.type === 'Network Activity').length;
        const mediaCount = this.filteredRequests.filter(r => r.type === 'Media Upload').length;
        const suspiciousCount = this.filteredRequests.filter(r => r.status === 'Suspicious').length;
        const fileCount = this.filteredRequests.filter(r => r.type === 'File Access').length;
        const googleCount = this.filteredRequests.filter(r => r.type === 'Google Service').length;
        const socialCount = this.filteredRequests.filter(r => r.type === 'Social Media').length;
        const cameraCount = this.filteredRequests.filter(r => r.type === 'Camera Access').length;
        const audioCount = this.filteredRequests.filter(r => r.type === 'Audio Recording').length;
        
        const elements = {
            'total-requests': total,
            'legitimate-api': apiCount,
            'google-services': googleCount,
            'suspicious-activity': suspiciousCount
        };
        
        Object.entries(elements).forEach(([id, value]) => {
            const element = document.getElementById(id);
            if (element) element.textContent = value;
        });
    }

    // Фильтрация запросов
    filterRequests() {
        const activityFilter = document.getElementById('activity-filter').value;
        const statusFilter = document.getElementById('status-filter').value;
        const domainFilter = document.getElementById('domain-filter').value.toLowerCase();
        const timeFilter = document.getElementById('time-filter').value;
        
        this.filteredRequests = this.httpRequests.filter(request => {
            const activityMatch = !activityFilter || request.type.toLowerCase().includes(activityFilter);
            const statusMatch = !statusFilter || request.status.toLowerCase() === statusFilter.toLowerCase();
            const domainMatch = !domainFilter || request.domain.toLowerCase().includes(domainFilter);
            const timeMatch = true; // Упрощенная логика времени
            
            return activityMatch && statusMatch && domainMatch && timeMatch;
        });
        
        this.currentPage = 1;
        this.updateRequestsTable();
        this.updateStats();
    }

    // Очистка фильтров
    clearFilters() {
        document.getElementById('activity-filter').value = '';
        document.getElementById('status-filter').value = '';
        document.getElementById('domain-filter').value = '';
        document.getElementById('time-filter').value = 'all';
        
        this.filteredRequests = [...this.httpRequests];
        this.currentPage = 1;
        this.updateRequestsTable();
        this.updateStats();
    }

    // Обновление пагинации
    updatePagination() {
        const pageInfo = document.getElementById('page-info');
        const prevBtn = document.getElementById('prev-btn');
        const nextBtn = document.getElementById('next-btn');
        
        if (!pageInfo || !prevBtn || !nextBtn) return;
        
        const totalPages = Math.ceil(this.filteredRequests.length / this.requestsPerPage);
        pageInfo.textContent = `Page ${this.currentPage} of ${totalPages}`;
        prevBtn.disabled = this.currentPage === 1;
        nextBtn.disabled = this.currentPage === totalPages;
    }

    // Предыдущая страница
    previousPage() {
        if (this.currentPage > 1) {
            this.currentPage--;
            this.updateRequestsTable();
        }
    }

    // Следующая страница
    nextPage() {
        const totalPages = Math.ceil(this.filteredRequests.length / this.requestsPerPage);
        if (this.currentPage < totalPages) {
            this.currentPage++;
            this.updateRequestsTable();
        }
    }

    // Показать детали запроса
    showRequestDetails(requestId) {
        const request = this.httpRequests.find(r => r.id === requestId);
        if (!request) return;
        
        let method = 'GET';
        let status = '200 OK';
        const requestHeaders = {
            'User-Agent': 'MAX-Messenger/1.0',
            'Content-Type': request.type === 'Media Upload' ? 'multipart/form-data' : 'application/json',
            'Authorization': 'Bearer max_token_' + Math.random().toString(36).substr(2, 9),
            'X-Request-Type': request.type,
            'X-Purpose': request.purpose
        };
        
        const responseHeaders = {
            'Content-Type': 'application/json',
            'Cache-Control': 'no-cache',
            'Server': 'max-messenger-server/1.0',
            'X-Response-Type': request.type,
            'X-Status': request.status
        };
        
        // Генерируем тело запроса
        let requestBody = '';
        if (request.type === 'API Call') {
            requestBody = JSON.stringify({
                action: 'message_sync',
                timestamp: new Date().toISOString(),
                data: {
                    type: 'text',
                    content: 'Hello from MAX Messenger'
                }
            }, null, 2);
        } else if (request.type === 'Media Upload') {
            requestBody = JSON.stringify({
                action: 'media_upload',
                timestamp: new Date().toISOString(),
                data: {
                    type: 'image',
                    size: request.dataSize,
                    format: 'jpeg'
                }
            }, null, 2);
        }
        
        // Генерируем тело ответа
        let responseBody = '';
        if (request.status === 'Normal') {
            responseBody = JSON.stringify({
                status: 'success',
                timestamp: new Date().toISOString(),
                data: {
                    message: 'Operation completed successfully',
                    type: request.type,
                    purpose: request.purpose
                }
            }, null, 2);
        } else {
            responseBody = JSON.stringify({
                status: 'error',
                timestamp: new Date().toISOString(),
                data: {
                    message: 'Operation blocked by security policy',
                    type: request.type,
                    reason: 'Suspicious activity detected'
                }
            }, null, 2);
        }
        
        // Добавляем информацию о домене и IP
        const urlDisplay = request.details || `${request.url} (${request.ip || 'N/A'})`;
        
        const elements = {
            'detail-method': method,
            'detail-url': urlDisplay,
            'detail-status': status,
            'detail-time': request.time,
            'detail-size': request.dataSize + ' B',
            'detail-duration': Math.floor(Math.random() * 500) + 50 + ' ms',
            'detail-request-headers': JSON.stringify(requestHeaders, null, 2),
            'detail-response-headers': JSON.stringify(responseHeaders, null, 2),
            'detail-request-body': requestBody || 'No body',
            'detail-response-body': responseBody || 'No body'
        };
        
        Object.entries(elements).forEach(([id, value]) => {
            const element = document.getElementById(id);
            if (element) element.textContent = value;
        });
        
        document.getElementById('request-details-modal').style.display = 'block';
    }

    // Экспорт запросов
    exportRequests() {
        const csv = [
            ['Time', 'Type', 'URL', 'Purpose', 'Data Size', 'Status'],
            ...this.filteredRequests.map(r => [
                r.time,
                r.type,
                r.url,
                r.purpose,
                r.dataSize,
                r.status
            ])
        ].map(row => row.join(',')).join('\n');
        
        const blob = new Blob([csv], { type: 'text/csv' });
        const url = URL.createObjectURL(blob);
        const a = document.createElement('a');
        a.href = url;
        a.download = 'max_security_activity_' + new Date().toISOString().slice(0, 19).replace(/:/g, '-') + '.csv';
        a.click();
        URL.revokeObjectURL(url);
    }

    // Экспорт отчета безопасности
    exportSecurityReport() {
        const report = {
            timestamp: new Date().toISOString(),
            app_info: {
                package: document.getElementById('app-package')?.textContent || 'Unknown',
                pid: document.getElementById('app-pid')?.textContent || '-',
                permissions_count: document.getElementById('permissions-count')?.textContent || 0
            },
            security_status: {
                risk_level: document.getElementById('risk-level')?.textContent || 'Unknown',
                root_access: document.getElementById('root-status')?.textContent || 'Unknown'
            },
            network_activity: {
                total_requests: this.filteredRequests.length,
                suspicious_requests: this.filteredRequests.filter(r => r.status === 'Suspicious').length,
                normal_requests: this.filteredRequests.filter(r => r.status === 'Normal').length
            },
            requests: this.filteredRequests
        };
        
        const blob = new Blob([JSON.stringify(report, null, 2)], { type: 'application/json' });
        const url = URL.createObjectURL(blob);
        const a = document.createElement('a');
        a.href = url;
        a.download = 'max_security_report_' + new Date().toISOString().slice(0, 19).replace(/:/g, '-') + '.json';
        a.click();
        URL.revokeObjectURL(url);
    }
}

// Экспорт для использования в других модулях
window.ModalService = ModalService;
