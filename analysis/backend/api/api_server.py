#!/usr/bin/env python3
"""
Simple API server for MAX Analyst web interface
"""

from flask import Flask, jsonify, request
from flask_cors import CORS
import time
import random
import json
from datetime import datetime, timedelta

app = Flask(__name__)
CORS(app)

# Mock data for demonstration
mock_data = {
    'status': 'Online',
    'pid': '12345',
    'cpu': 15,
    'memory': 256,
    'connections': 8,
    'httpRequests': 45,
    'httpsRequests': 67,
    'suspiciousDomains': 0,
    'activePermissions': 3,
    'detectedTrackers': 2,
    'sslErrors': 0,
    'riskLevel': 'low',
    'networkIn': 128,
    'networkOut': 64,
    'tcpConnections': 5,
    'udpConnections': 3
}

# Mock data for suspicious activities
suspicious_activities = [
    {
        "id": "action_001",
        "timestamp": "2025-08-19T03:15:30Z",
        "category": "network_spying",
        "severity": "high",
        "description": "HTTP POST request to external server",
        "app_package": "ru.oneme.app",
        "details_url": "/api/suspicious-actions/action_001",
        "details": {
            "url": "https://tracking.example.com/collect",
            "method": "POST",
            "headers": {
                "User-Agent": "MAX-Messenger/1.0.0",
                "Content-Type": "application/json",
                "Authorization": "Bearer [hidden]"
            },
            "body": {
                "user_id": "user123",
                "event": "message_sent",
                "timestamp": "2025-08-19T03:15:30Z",
                "metadata": {
                    "device_id": "android_12345",
                    "location": "Moscow, Russia",
                    "app_version": "1.0.0"
                }
            },
            "response": {
                "status": 200,
                "size": "2.3 KB",
                "duration": "1.2 sec"
            }
        },
        "security_analysis": {
            "suspicious_domain": True,
            "personal_data_sent": True,
            "hidden_transmission": True,
            "recommendations": [
                "Block domain tracking.example.com",
                "Check privacy settings",
                "Consider alternative messenger"
            ]
        }
    },
    {
        "id": "action_002",
        "timestamp": "2025-08-19T03:12:15Z",
        "category": "file_access",
        "severity": "medium",
        "description": "Reading file /sdcard/Downloads/private.pdf",
        "app_package": "ru.oneme.app",
        "details_url": "/api/suspicious-actions/action_002",
        "details": {
            "file_path": "/sdcard/Downloads/private.pdf",
            "operation": "read",
            "file_size": "1.2 MB",
            "permission": "READ_EXTERNAL_STORAGE"
        },
        "security_analysis": {
            "suspicious_file": True,
            "unauthorized_access": False,
            "recommendations": [
                "Check file access settings",
                "Restrict access to Downloads folder"
            ]
        }
    },
    {
        "id": "action_003",
        "timestamp": "2025-08-19T03:10:45Z",
        "category": "camera_access",
        "severity": "low",
        "description": "Camera access (hidden mode)",
        "app_package": "ru.oneme.app",
        "details_url": "/api/suspicious-actions/action_003",
        "details": {
            "device": "camera",
            "operation": "capture",
            "mode": "hidden",
            "duration": "5 sec"
        },
        "security_analysis": {
            "hidden_camera": True,
            "unauthorized_access": False,
            "recommendations": [
                "Check camera settings",
                "Disable background camera access"
            ]
        }
    }
]

@app.route('/api/status')
def get_status():
    """Get application status"""
    return jsonify({
        'status': mock_data['status'],
        'pid': mock_data['pid'],
        'cpu': f"{mock_data['cpu']}%",
        'memory': f"{mock_data['memory']} MB",
        'connections': mock_data['connections']
    })

@app.route('/api/metrics')
def get_metrics():
    """Get current metrics"""
    # Simulate some variation
    mock_data['cpu'] = max(5, min(30, mock_data['cpu'] + random.randint(-5, 5)))
    mock_data['memory'] = max(200, min(400, mock_data['memory'] + random.randint(-20, 20)))
    mock_data['connections'] = max(5, min(15, mock_data['connections'] + random.randint(-2, 2)))
    
    return jsonify(mock_data)

@app.route('/api/logs')
def get_logs():
    """Get recent logs"""
    log_levels = ['INFO', 'WARN', 'ERROR', 'DEBUG']
    log_messages = [
        'Monitoring session started',
        'Network connection established',
        'Security scan completed',
        'Permission check passed',
        'Data export successful',
        'System resources normal',
        'No suspicious activity detected',
        'SSL certificate valid',
        'API endpoint accessed',
        'User session active'
    ]
    
    logs = []
    for i in range(10):
        timestamp = datetime.now().strftime('%H:%M:%S')
        level = random.choice(log_levels)
        message = random.choice(log_messages)
        logs.append({
            'timestamp': timestamp,
            'level': level,
            'message': message
        })
    
    return jsonify(logs)

@app.route('/api/export')
def export_data():
    """Export data as JSON"""
    export_data = {
        'timestamp': datetime.now().isoformat(),
        'metrics': mock_data.copy(),
        'logs': get_logs().json,
        'summary': {
            'total_connections': mock_data['connections'],
            'security_score': 85,
            'performance_score': 92,
            'risk_assessment': 'low'
        }
    }
    return jsonify(export_data)

@app.route('/api/health')
def health_check():
    """Health check endpoint"""
    return jsonify({
        'status': 'healthy',
        'timestamp': datetime.now().isoformat(),
        'version': '2.0.0',
        'uptime': '00:15:30'
    })

# Новые endpoints для подозрительных действий
@app.route('/api/suspicious-actions')
def get_suspicious_actions():
    """Получение списка подозрительных действий"""
    # Фильтрация по времени
    time_filter = request.args.get('time_filter', 'all')
    
    # Подсчет по категориям
    summary = {
        "total": len(suspicious_activities),
        "high_risk": len([a for a in suspicious_activities if a['severity'] == 'high']),
        "medium_risk": len([a for a in suspicious_activities if a['severity'] == 'medium']),
        "low_risk": len([a for a in suspicious_activities if a['severity'] == 'low'])
    }
    
    return jsonify({
        "actions": suspicious_activities,
        "summary": summary
    })

@app.route('/api/suspicious-actions/<action_id>')
def get_action_details(action_id):
    """Получение детальной информации о подозрительном действии"""
    action = next((a for a in suspicious_activities if a['id'] == action_id), None)
    
    if not action:
        return jsonify({"error": "Action not found"}), 404
    
    return jsonify(action)

@app.route('/api/activity-timeline')
def get_activity_timeline():
    """Получение временной шкалы активности"""
    # Генерируем временную шкалу за последние 24 часа
    timeline = []
    now = datetime.now()
    
    for hour in range(24):
        timestamp = now - timedelta(hours=hour)
        events = []
        
        # Добавляем случайные события
        if random.random() > 0.7:
            event_types = ['network', 'file_access', 'camera']
            event_type = random.choice(event_types)
            severity = random.choice(['low', 'medium', 'high'])
            events.append({"type": event_type, "severity": severity})
        
        if events:
            timeline.append({
                "timestamp": timestamp.isoformat(),
                "events": events
            })
    
    return jsonify({
        "timeline": timeline[::-1]  # Обратный порядок для хронологии
    })

@app.route('/api/export-suspicious-data', methods=['POST'])
def export_suspicious_data():
    """Экспорт данных о подозрительных действиях"""
    format_type = request.json.get('format', 'json')
    
    export_data = {
        'timestamp': datetime.now().isoformat(),
        'suspicious_actions': suspicious_activities,
        'summary': {
            'total_actions': len(suspicious_activities),
            'high_risk_count': len([a for a in suspicious_activities if a['severity'] == 'high']),
            'medium_risk_count': len([a for a in suspicious_activities if a['severity'] == 'medium']),
            'low_risk_count': len([a for a in suspicious_activities if a['severity'] == 'low'])
        }
    }
    
    if format_type == 'csv':
        # Простая CSV конвертация
        csv_data = "ID,Timestamp,Category,Severity,Description\n"
        for action in suspicious_activities:
            csv_data += f"{action['id']},{action['timestamp']},{action['category']},{action['severity']},{action['description']}\n"
        return csv_data, 200, {'Content-Type': 'text/csv'}
    
    return jsonify(export_data)

if __name__ == '__main__':
    print("Starting MAX Analyst API Server...")
    print("API endpoints:")
    print("  GET /api/status - Application status")
    print("  GET /api/metrics - Current metrics")
    print("  GET /api/logs - Recent logs")
    print("  GET /api/export - Export data")
    print("  GET /api/health - Health check")
    print("  GET /api/suspicious-actions - Suspicious actions list")
    print("  GET /api/suspicious-actions/<id> - Action details")
    print("  GET /api/activity-timeline - Activity timeline")
    print("  POST /api/export-suspicious-data - Export suspicious data")
    print("\nWeb interface: http://localhost:8000/")
    print("API server: http://localhost:5003/")
    
    app.run(host='0.0.0.0', port=5003, debug=True)
