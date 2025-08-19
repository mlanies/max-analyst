/**
 * Suspicious Activity Service
 * Handles API calls for suspicious activity monitoring
 */
class SuspiciousActivityService {
    constructor(apiService) {
        this.apiService = apiService;
    }

    /**
     * Get list of suspicious actions
     * @param {string} timeFilter - Time filter (today/week/month/all)
     * @returns {Promise<Object>} Suspicious actions data
     */
    async getSuspiciousActions(timeFilter = 'all') {
        try {
            const params = timeFilter !== 'all' ? { time_filter: timeFilter } : {};
            return await this.apiService.get('/api/suspicious-actions', params);
        } catch (error) {
            console.error('Error fetching suspicious actions:', error);
            throw error;
        }
    }

    /**
     * Get detailed information about specific action
     * @param {string} actionId - Action ID
     * @returns {Promise<Object>} Action details
     */
    async getActionDetails(actionId) {
        try {
            return await this.apiService.get(`/api/suspicious-actions/${actionId}`);
        } catch (error) {
            console.error('Error fetching action details:', error);
            throw error;
        }
    }

    /**
     * Get activity timeline
     * @returns {Promise<Object>} Timeline data
     */
    async getActivityTimeline() {
        try {
            return await this.apiService.get('/api/activity-timeline');
        } catch (error) {
            console.error('Error fetching activity timeline:', error);
            throw error;
        }
    }

    /**
     * Export suspicious activity data
     * @param {string} format - Export format (json/csv)
     * @returns {Promise<Object>} Export data
     */
    async exportData(format = 'json') {
        try {
            return await this.apiService.post('/api/export-suspicious-data', { format });
        } catch (error) {
            console.error('Error exporting data:', error);
            throw error;
        }
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
            'system_activity': 'System Activity'
        };
        return categoryNames[category] || category;
    }

    /**
     * Get severity display info
     * @param {string} severity - Severity level
     * @returns {Object} Severity info with color and label
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
     * Format timestamp for display
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
}
