/**
 * Suspicious Activity Modal Component
 * Displays detailed analysis of suspicious activities
 */
class SuspiciousActivityModal {
    constructor() {
        this.service = new SuspiciousActivityService(new ApiService());
        this.analysisService = new SecurityAnalysisService();
        this.currentAction = null;
    }

    /**
     * Show action details modal
     * @param {Object} action - Action data
     */
    showActionDetails(action) {
        this.currentAction = action;
        this.renderModal(action);
        this.showModal();
    }

    /**
     * Render modal content
     * @param {Object} action - Action data
     */
    renderModal(action) {
        const modal = document.getElementById('suspicious-activity-modal');
        if (!modal) {
            this.createModalElement();
        }

        const modalContent = this.generateModalContent(action);
        document.getElementById('suspicious-activity-modal').innerHTML = modalContent;
    }

    /**
     * Create modal element if it doesn't exist
     */
    createModalElement() {
        const modal = document.createElement('div');
        modal.id = 'suspicious-activity-modal';
        modal.className = 'modal';
        document.body.appendChild(modal);
    }

    /**
     * Generate modal content
     * @param {Object} action - Action data
     * @returns {string} Modal HTML content
     */
    generateModalContent(action) {
        const severityInfo = this.getSeverityInfo(action.severity);
        const timestamp = this.formatTimestamp(action.timestamp);
        const category = this.getCategoryDisplayName(action.category);

        return `
            <div class="modal-content modal-large">
                <div class="modal-header">
                    <h2>DETAILED ANALYSIS: ${action.description}</h2>
                    <span class="close" onclick="suspiciousActivityModal.closeModal()">&times;</span>
                </div>
                <div class="modal-body">
                    ${this.renderBasicInfo(action, timestamp, category, severityInfo)}
                    ${this.renderNetworkRequest(action)}
                    ${this.renderSecurityAnalysis(action)}
                    ${this.renderRecommendations(action)}
                </div>
                <div class="modal-footer">
                    <button class="btn btn-success" onclick="suspiciousActivityModal.exportActionData()">
                        EXPORT DATA
                    </button>
                    <button class="btn" onclick="suspiciousActivityModal.closeModal()">
                        CLOSE
                    </button>
                </div>
            </div>
        `;
    }

    /**
     * Render basic information section
     * @param {Object} action - Action data
     * @param {string} timestamp - Formatted timestamp
     * @param {string} category - Category display name
     * @param {Object} severityInfo - Severity information
     * @returns {string} Basic info HTML
     */
    renderBasicInfo(action, timestamp, category, severityInfo) {
        return `
            <div class="section">
                <h3>BASIC INFORMATION</h3>
                <div class="info-grid">
                    <div class="info-item">
                        <label>Time:</label>
                        <span>${timestamp}</span>
                    </div>
                    <div class="info-item">
                        <label>Category:</label>
                        <span>${category}</span>
                    </div>
                    <div class="info-item">
                        <label>Risk Level:</label>
                        <span class="risk-badge ${severityInfo.class}">${severityInfo.label}</span>
                    </div>
                    <div class="info-item">
                        <label>Application:</label>
                        <span>${action.app_package}</span>
                    </div>
                </div>
            </div>
        `;
    }

    /**
     * Render network request section
     * @param {Object} action - Action data
     * @returns {string} Network request HTML
     */
    renderNetworkRequest(action) {
        if (!action.details || !action.details.url) {
            return '';
        }

        const details = action.details;
        return `
            <div class="section">
                <h3>NETWORK REQUEST</h3>
                <div class="request-details">
                    <div class="detail-item">
                        <label>URL:</label>
                        <span class="url-text">${details.url}</span>
                    </div>
                    <div class="detail-item">
                        <label>Method:</label>
                        <span class="method-${details.method?.toLowerCase()}">${details.method}</span>
                    </div>
                    ${details.response ? `
                        <div class="detail-item">
                            <label>Size:</label>
                            <span>${details.response.size}</span>
                        </div>
                        <div class="detail-item">
                            <label>Duration:</label>
                            <span>${details.response.duration}</span>
                        </div>
                    ` : ''}
                </div>
                ${this.renderRequestHeaders(details.headers)}
                ${this.renderRequestBody(details.body)}
            </div>
        `;
    }

    /**
     * Render request headers
     * @param {Object} headers - Request headers
     * @returns {string} Headers HTML
     */
    renderRequestHeaders(headers) {
        if (!headers) return '';

        const headersHtml = Object.entries(headers)
            .map(([key, value]) => `<div class="header-item"><strong>${key}:</strong> ${value}</div>`)
            .join('');

        return `
            <div class="request-headers">
                <h4>REQUEST HEADERS</h4>
                <div class="headers-list">
                    ${headersHtml}
                </div>
            </div>
        `;
    }

    /**
     * Render request body
     * @param {Object} body - Request body
     * @returns {string} Body HTML
     */
    renderRequestBody(body) {
        if (!body) return '';

        return `
            <div class="request-body">
                <h4>REQUEST BODY</h4>
                <pre class="code-block">${JSON.stringify(body, null, 2)}</pre>
            </div>
        `;
    }

    /**
     * Render security analysis section
     * @param {Object} action - Action data
     * @returns {string} Security analysis HTML
     */
    renderSecurityAnalysis(action) {
        if (!action.security_analysis) return '';

        const analysis = action.security_analysis;
        const analysisItems = [];

        if (analysis.suspicious_domain) {
            analysisItems.push('<div class="analysis-item high-risk">Suspicious domain detected</div>');
        }
        if (analysis.personal_data_sent) {
            analysisItems.push('<div class="analysis-item high-risk">Personal data transmission detected</div>');
        }
        if (analysis.hidden_transmission) {
            analysisItems.push('<div class="analysis-item medium-risk">Hidden transmission detected</div>');
        }
        if (analysis.suspicious_file) {
            analysisItems.push('<div class="analysis-item medium-risk">Suspicious file access detected</div>');
        }
        if (analysis.hidden_camera) {
            analysisItems.push('<div class="analysis-item low-risk">Hidden camera access detected</div>');
        }

        return `
            <div class="section">
                <h3>SECURITY ANALYSIS</h3>
                <div class="analysis-list">
                    ${analysisItems.join('')}
                </div>
            </div>
        `;
    }

    /**
     * Render recommendations section
     * @param {Object} action - Action data
     * @returns {string} Recommendations HTML
     */
    renderRecommendations(action) {
        if (!action.security_analysis?.recommendations) return '';

        const recommendations = action.security_analysis.recommendations;
        const recommendationsHtml = recommendations
            .map(rec => `<div class="recommendation-item">${rec}</div>`)
            .join('');

        return `
            <div class="section">
                <h3>RECOMMENDATIONS</h3>
                <div class="recommendations-list">
                    ${recommendationsHtml}
                </div>
            </div>
        `;
    }

    /**
     * Show modal
     */
    showModal() {
        const modal = document.getElementById('suspicious-activity-modal');
        if (modal) {
            modal.style.display = 'block';
        }
    }

    /**
     * Close modal
     */
    closeModal() {
        const modal = document.getElementById('suspicious-activity-modal');
        if (modal) {
            modal.style.display = 'none';
        }
    }

    /**
     * Export action data
     */
    async exportActionData() {
        if (!this.currentAction) return;

        try {
            const data = {
                action: this.currentAction,
                export_timestamp: new Date().toISOString(),
                analysis: this.analysisService.analyzeNetworkRequest(this.currentAction.details || {})
            };

            const blob = new Blob([JSON.stringify(data, null, 2)], { type: 'application/json' });
            const url = window.URL.createObjectURL(blob);
            const a = document.createElement('a');
            a.href = url;
            a.download = `suspicious_action_${this.currentAction.id}.json`;
            a.click();
            window.URL.revokeObjectURL(url);
        } catch (error) {
            console.error('Error exporting action data:', error);
            this.showError('Failed to export data');
        }
    }

    /**
     * Get severity information
     * @param {string} severity - Severity level
     * @returns {Object} Severity info
     */
    getSeverityInfo(severity) {
        const severityInfo = {
            'high': {
                color: '#ef4444',
                label: 'High Risk',
                class: 'high-risk'
            },
            'medium': {
                color: '#f59e0b',
                label: 'Medium Risk',
                class: 'medium-risk'
            },
            'low': {
                color: '#10b981',
                label: 'Low Risk',
                class: 'low-risk'
            }
        };
        return severityInfo[severity] || severityInfo['low'];
    }

    /**
     * Get category display name
     * @param {string} category - Category code
     * @returns {string} Display name
     */
    getCategoryDisplayName(category) {
        const categoryNames = {
            'network_spying': 'Network Spying',
            'file_access': 'File Access',
            'camera_access': 'Camera Access',
            'location_tracking': 'Location Tracking',
            'system_activity': 'System Activity'
        };
        return categoryNames[category] || category;
    }

    /**
     * Format timestamp
     * @param {string} timestamp - ISO timestamp
     * @returns {string} Formatted timestamp
     */
    formatTimestamp(timestamp) {
        try {
            const date = new Date(timestamp);
            return date.toLocaleString('en-US', {
                year: 'numeric',
                month: '2-digit',
                day: '2-digit',
                hour: '2-digit',
                minute: '2-digit',
                second: '2-digit'
            });
        } catch (error) {
            return timestamp;
        }
    }

    /**
     * Show error message
     * @param {string} message - Error message
     */
    showError(message) {
        const errorContainer = document.getElementById('modal-error');
        if (errorContainer) {
            errorContainer.innerHTML = `
                <div class="alert alert-error">
                    <strong>Error:</strong> ${message}
                </div>
            `;
            setTimeout(() => {
                errorContainer.innerHTML = '';
            }, 5000);
        }
    }
}
