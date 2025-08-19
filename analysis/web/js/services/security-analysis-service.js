/**
 * Security Analysis Service
 * Handles security analysis and risk assessment
 */
class SecurityAnalysisService {
    constructor() {
        this.suspiciousDomains = [
            'tracking', 'analytics', 'spy', 'telemetry',
            'monitoring', 'surveillance', 'collect', 'ad',
            'ads', 'pixel', 'beacon', 'tracker'
        ];
        
        this.personalDataPatterns = [
            'user_id', 'phone', 'email', 'location',
            'contacts', 'messages', 'calls', 'device_id',
            'imei', 'mac_address', 'ip_address', 'gps'
        ];
        
        this.dangerousPermissions = [
            'android.permission.CAMERA',
            'android.permission.RECORD_AUDIO',
            'android.permission.ACCESS_FINE_LOCATION',
            'android.permission.ACCESS_COARSE_LOCATION',
            'android.permission.READ_EXTERNAL_STORAGE',
            'android.permission.WRITE_EXTERNAL_STORAGE',
            'android.permission.SYSTEM_ALERT_WINDOW',
            'android.permission.READ_PHONE_STATE',
            'android.permission.READ_CONTACTS',
            'android.permission.READ_CALL_LOG',
            'android.permission.READ_SMS',
            'android.permission.SEND_SMS'
        ];
    }

    /**
     * Analyze network request for security risks
     * @param {Object} request - Network request data
     * @returns {Object} Security analysis results
     */
    analyzeNetworkRequest(request) {
        const analysis = {
            suspicious_domain: this.isSuspiciousDomain(request.url),
            personal_data_sent: this.containsPersonalData(request.body),
            hidden_transmission: this.isHiddenTransmission(request),
            risk_level: this.calculateRiskLevel(request),
            recommendations: []
        };

        // Generate recommendations based on analysis
        if (analysis.suspicious_domain) {
            analysis.recommendations.push(`Block domain ${this.extractDomain(request.url)}`);
        }
        
        if (analysis.personal_data_sent) {
            analysis.recommendations.push('Review data transmission settings');
        }
        
        if (analysis.hidden_transmission) {
            analysis.recommendations.push('Check for hidden background processes');
        }

        return analysis;
    }

    /**
     * Check if domain is suspicious
     * @param {string} url - URL to check
     * @returns {boolean} True if suspicious
     */
    isSuspiciousDomain(url) {
        const domain = this.extractDomain(url);
        return this.suspiciousDomains.some(suspicious => 
            domain.toLowerCase().includes(suspicious.toLowerCase())
        );
    }

    /**
     * Extract domain from URL
     * @param {string} url - URL to parse
     * @returns {string} Domain name
     */
    extractDomain(url) {
        try {
            const urlObj = new URL(url);
            return urlObj.hostname;
        } catch (error) {
            // Fallback for malformed URLs
            const match = url.match(/https?:\/\/([^\/]+)/);
            return match ? match[1] : url;
        }
    }

    /**
     * Check if request contains personal data
     * @param {Object} body - Request body
     * @returns {boolean} True if personal data found
     */
    containsPersonalData(body) {
        if (!body) return false;
        
        const bodyString = JSON.stringify(body).toLowerCase();
        return this.personalDataPatterns.some(pattern => 
            bodyString.includes(pattern.toLowerCase())
        );
    }

    /**
     * Check if transmission is hidden
     * @param {Object} request - Request data
     * @returns {boolean} True if hidden transmission
     */
    isHiddenTransmission(request) {
        // Check for suspicious headers or patterns
        const suspiciousHeaders = [
            'x-forwarded-for', 'x-real-ip', 'x-client-ip',
            'x-cluster-client-ip', 'x-forwarded', 'x-remote-ip'
        ];
        
        if (request.headers) {
            const headerKeys = Object.keys(request.headers).map(k => k.toLowerCase());
            if (suspiciousHeaders.some(header => headerKeys.includes(header))) {
                return true;
            }
        }
        
        // Check for suspicious URL patterns
        const suspiciousUrlPatterns = [
            'tracking', 'analytics', 'pixel', 'beacon',
            'collect', 'telemetry', 'monitoring'
        ];
        
        return suspiciousUrlPatterns.some(pattern => 
            request.url.toLowerCase().includes(pattern)
        );
    }

    /**
     * Calculate risk level for request
     * @param {Object} request - Request data
     * @returns {string} Risk level (low/medium/high)
     */
    calculateRiskLevel(request) {
        let riskScore = 0;
        
        // Domain risk
        if (this.isSuspiciousDomain(request.url)) {
            riskScore += 3;
        }
        
        // Personal data risk
        if (this.containsPersonalData(request.body)) {
            riskScore += 2;
        }
        
        // Hidden transmission risk
        if (this.isHiddenTransmission(request)) {
            riskScore += 2;
        }
        
        // Method risk
        if (request.method && request.method.toUpperCase() === 'POST') {
            riskScore += 1;
        }
        
        // Determine risk level
        if (riskScore >= 5) return 'high';
        if (riskScore >= 3) return 'medium';
        return 'low';
    }

    /**
     * Analyze permissions for security risks
     * @param {Array} permissions - List of permissions
     * @returns {Object} Permission analysis
     */
    analyzePermissions(permissions) {
        const analysis = {
            dangerous_permissions: [],
            risk_level: 'low',
            recommendations: []
        };

        // Check for dangerous permissions
        analysis.dangerous_permissions = permissions.filter(permission =>
            this.dangerousPermissions.includes(permission)
        );

        // Calculate risk level
        if (analysis.dangerous_permissions.length >= 5) {
            analysis.risk_level = 'high';
        } else if (analysis.dangerous_permissions.length >= 2) {
            analysis.risk_level = 'medium';
        }

        // Generate recommendations
        if (analysis.dangerous_permissions.includes('android.permission.CAMERA')) {
            analysis.recommendations.push('Review camera access settings');
        }
        
        if (analysis.dangerous_permissions.includes('android.permission.RECORD_AUDIO')) {
            analysis.recommendations.push('Review microphone access settings');
        }
        
        if (analysis.dangerous_permissions.includes('android.permission.ACCESS_FINE_LOCATION')) {
            analysis.recommendations.push('Review location access settings');
        }

        return analysis;
    }

    /**
     * Analyze file access patterns
     * @param {Array} fileAccesses - File access events
     * @returns {Object} File access analysis
     */
    analyzeFileAccess(fileAccesses) {
        const analysis = {
            suspicious_files: [],
            risk_level: 'low',
            recommendations: []
        };

        const sensitivePaths = [
            '/sdcard/Downloads', '/sdcard/Pictures', '/sdcard/Documents',
            '/data/data', '/system', '/proc', '/sys'
        ];

        fileAccesses.forEach(access => {
            if (sensitivePaths.some(path => access.path.includes(path))) {
                analysis.suspicious_files.push(access);
            }
        });

        if (analysis.suspicious_files.length > 0) {
            analysis.risk_level = 'medium';
            analysis.recommendations.push('Review file access permissions');
        }

        return analysis;
    }

    /**
     * Get overall security score
     * @param {Object} analysisData - Combined analysis data
     * @returns {number} Security score (0-100)
     */
    calculateSecurityScore(analysisData) {
        let score = 100;
        
        // Deduct points for various security issues
        if (analysisData.network_analysis) {
            const network = analysisData.network_analysis;
            if (network.suspicious_domains > 0) score -= 20;
            if (network.personal_data_sent) score -= 15;
            if (network.hidden_transmissions > 0) score -= 10;
        }
        
        if (analysisData.permissions) {
            const permissions = analysisData.permissions;
            score -= permissions.dangerous_permissions.length * 5;
        }
        
        if (analysisData.file_access) {
            const fileAccess = analysisData.file_access;
            score -= fileAccess.suspicious_files.length * 3;
        }
        
        return Math.max(0, score);
    }

    /**
     * Generate security report
     * @param {Object} analysisData - Analysis data
     * @returns {Object} Security report
     */
    generateSecurityReport(analysisData) {
        const score = this.calculateSecurityScore(analysisData);
        
        return {
            timestamp: new Date().toISOString(),
            security_score: score,
            risk_level: score >= 80 ? 'low' : score >= 60 ? 'medium' : 'high',
            summary: {
                network_issues: analysisData.network_analysis?.suspicious_domains || 0,
                permission_issues: analysisData.permissions?.dangerous_permissions?.length || 0,
                file_access_issues: analysisData.file_access?.suspicious_files?.length || 0
            },
            recommendations: this.generateRecommendations(analysisData)
        };
    }

    /**
     * Generate recommendations based on analysis
     * @param {Object} analysisData - Analysis data
     * @returns {Array} List of recommendations
     */
    generateRecommendations(analysisData) {
        const recommendations = [];
        
        if (analysisData.network_analysis) {
            if (analysisData.network_analysis.suspicious_domains > 0) {
                recommendations.push('Block suspicious domains');
            }
            if (analysisData.network_analysis.personal_data_sent) {
                recommendations.push('Review data transmission settings');
            }
        }
        
        if (analysisData.permissions?.dangerous_permissions?.length > 0) {
            recommendations.push('Review and restrict dangerous permissions');
        }
        
        if (analysisData.file_access?.suspicious_files?.length > 0) {
            recommendations.push('Review file access patterns');
        }
        
        return recommendations;
    }
}
