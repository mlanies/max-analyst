/**
 * Suspicious Activity Dashboard Component
 * Displays suspicious activity monitoring interface
 */
class SuspiciousActivityDashboard {
    constructor() {
        this.service = new SuspiciousActivityService(new ApiService());
        this.analysisService = new SecurityAnalysisService();
        this.updateInterval = null;
        this.init();
    }

    /**
     * Initialize dashboard
     */
    async init() {
        try {
            await this.loadData();
            this.renderDashboard();
            this.startRealTimeUpdates();
            this.bindEvents();
        } catch (error) {
            console.error('Error initializing dashboard:', error);
            this.showError('Failed to initialize dashboard');
        }
    }

    /**
     * Load initial data
     */
    async loadData() {
        try {
            const [actionsResponse, timelineResponse] = await Promise.all([
                this.service.getSuspiciousActions(),
                this.service.getActivityTimeline()
            ]);
            
            this.actions = actionsResponse.actions || [];
            this.summary = actionsResponse.summary || {};
            this.timeline = timelineResponse.timeline || [];
        } catch (error) {
            console.error('Error loading data:', error);
            this.actions = [];
            this.summary = { total: 0, high_risk: 0, medium_risk: 0, low_risk: 0 };
            this.timeline = [];
        }
    }

    /**
     * Render main dashboard
     */
    renderDashboard() {
        this.renderSummaryCards();
        this.renderActivityTimeline();
        this.renderRecentEvents();
    }

    /**
     * Render summary cards
     */
    renderSummaryCards() {
        const container = document.getElementById('suspicious-summary');
        if (!container) return;

        container.innerHTML = `
            <div class="summary-card high-risk">
                <h3>NETWORK SPYING</h3>
                <div class="count">${this.summary.high_risk || 0}</div>
                <div class="risk-level">High Risk</div>
            </div>
            <div class="summary-card medium-risk">
                <h3>FILE ACCESS</h3>
                <div class="count">${this.summary.medium_risk || 0}</div>
                <div class="risk-level">Medium Risk</div>
            </div>
            <div class="summary-card low-risk">
                <h3>CAMERA ACCESS</h3>
                <div class="count">${this.summary.low_risk || 0}</div>
                <div class="risk-level">Low Risk</div>
            </div>
        `;
    }

    /**
     * Render activity timeline
     */
    renderActivityTimeline() {
        const container = document.getElementById('activity-timeline');
        if (!container) return;

        if (this.timeline.length === 0) {
            container.innerHTML = '<div class="no-data">No activity data available</div>';
            return;
        }

        const timelineHtml = this.timeline.map(item => {
            const timestamp = this.service.formatTimestamp(item.timestamp);
            const events = item.events.map(event => {
                const severityClass = event.severity === 'high' ? 'high-risk' : 
                                    event.severity === 'medium' ? 'medium-risk' : 'low-risk';
                return `<span class="event-badge ${severityClass}">${event.type}</span>`;
            }).join('');
            
            return `
                <div class="timeline-item">
                    <div class="timeline-time">${timestamp}</div>
                    <div class="timeline-events">${events}</div>
                </div>
            `;
        }).join('');

        container.innerHTML = `
            <div class="timeline-container">
                <h3>ACTIVITY TIMELINE</h3>
                <div class="timeline-list">
                    ${timelineHtml}
                </div>
            </div>
        `;
    }

    /**
     * Render recent events
     */
    renderRecentEvents() {
        const container = document.getElementById('recent-events');
        if (!container) return;

        if (this.actions.length === 0) {
            container.innerHTML = '<div class="no-data">No suspicious activities detected</div>';
            return;
        }

        const recentActions = this.actions.slice(0, 5); // Show last 5 events
        const eventsHtml = recentActions.map(action => {
            const severityInfo = this.service.getSeverityInfo(action.severity);
            const timestamp = this.service.formatTimestamp(action.timestamp);
            const category = this.service.getCategoryDisplayName(action.category);
            
            return `
                <div class="event-item ${severityInfo.class}">
                    <div class="event-time">${timestamp}</div>
                    <div class="event-category">${category}</div>
                    <div class="event-description">${action.description}</div>
                    <div class="event-severity ${severityInfo.class}">${severityInfo.label}</div>
                    <button class="btn-details" onclick="suspiciousDashboard.showActionDetails('${action.id}')">
                        View Details
                    </button>
                </div>
            `;
        }).join('');

        container.innerHTML = `
            <div class="events-container">
                <h3>RECENT EVENTS</h3>
                <div class="events-list">
                    ${eventsHtml}
                </div>
            </div>
        `;
    }

    /**
     * Show action details modal
     * @param {string} actionId - Action ID
     */
    async showActionDetails(actionId) {
        try {
            const action = await this.service.getActionDetails(actionId);
            const modal = new SuspiciousActivityModal();
            modal.showActionDetails(action);
        } catch (error) {
            console.error('Error showing action details:', error);
            this.showError('Failed to load action details');
        }
    }

    /**
     * Start real-time updates
     */
    startRealTimeUpdates() {
        // Update every 5 seconds
        this.updateInterval = setInterval(async () => {
            try {
                await this.loadData();
                this.renderDashboard();
            } catch (error) {
                console.error('Error updating dashboard:', error);
            }
        }, 5000);
    }

    /**
     * Stop real-time updates
     */
    stopRealTimeUpdates() {
        if (this.updateInterval) {
            clearInterval(this.updateInterval);
            this.updateInterval = null;
        }
    }

    /**
     * Bind event handlers
     */
    bindEvents() {
        // Export button
        const exportBtn = document.getElementById('export-suspicious-data');
        if (exportBtn) {
            exportBtn.addEventListener('click', () => this.exportData());
        }

        // Filter buttons
        const filterButtons = document.querySelectorAll('.filter-btn');
        filterButtons.forEach(btn => {
            btn.addEventListener('click', (e) => {
                const filter = e.target.dataset.filter;
                this.applyFilter(filter);
            });
        });
    }

    /**
     * Apply time filter
     * @param {string} filter - Filter type
     */
    async applyFilter(filter) {
        try {
            const actionsResponse = await this.service.getSuspiciousActions(filter);
            this.actions = actionsResponse.actions || [];
            this.summary = actionsResponse.summary || {};
            this.renderDashboard();
        } catch (error) {
            console.error('Error applying filter:', error);
            this.showError('Failed to apply filter');
        }
    }

    /**
     * Export data
     */
    async exportData() {
        try {
            const format = document.getElementById('export-format')?.value || 'json';
            const data = await this.service.exportData(format);
            
            if (format === 'csv') {
                this.downloadCSV(data, 'suspicious_activities.csv');
            } else {
                this.downloadJSON(data, 'suspicious_activities.json');
            }
        } catch (error) {
            console.error('Error exporting data:', error);
            this.showError('Failed to export data');
        }
    }

    /**
     * Download CSV file
     * @param {string} data - CSV data
     * @param {string} filename - Filename
     */
    downloadCSV(data, filename) {
        const blob = new Blob([data], { type: 'text/csv' });
        const url = window.URL.createObjectURL(blob);
        const a = document.createElement('a');
        a.href = url;
        a.download = filename;
        a.click();
        window.URL.revokeObjectURL(url);
    }

    /**
     * Download JSON file
     * @param {Object} data - JSON data
     * @param {string} filename - Filename
     */
    downloadJSON(data, filename) {
        const blob = new Blob([JSON.stringify(data, null, 2)], { type: 'application/json' });
        const url = window.URL.createObjectURL(blob);
        const a = document.createElement('a');
        a.href = url;
        a.download = filename;
        a.click();
        window.URL.revokeObjectURL(url);
    }

    /**
     * Show error message
     * @param {string} message - Error message
     */
    showError(message) {
        const errorContainer = document.getElementById('error-container');
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

    /**
     * Destroy dashboard
     */
    destroy() {
        this.stopRealTimeUpdates();
    }
}
