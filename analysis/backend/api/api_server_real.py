#!/usr/bin/env python3
"""
API сервер для реальных данных мониторинга MAX Analyst
Читает данные из логов и системных файлов
"""

from flask import Flask, jsonify, request
from flask_cors import CORS
import os
import json
import subprocess
import time
from datetime import datetime
import glob

app = Flask(__name__)
CORS(app)

# Пути к данным
ANALYSIS_DIR = os.path.dirname(os.path.abspath(__file__))
LOGS_DIR = os.path.join(ANALYSIS_DIR, 'logs')
TEMP_DIR = os.path.join(ANALYSIS_DIR, 'temp')

def get_real_status():
    """Получение реального статуса системы"""
    try:
        # Проверка подключения устройства
        result = subprocess.run(['adb', 'devices'], capture_output=True, text=True)
        devices = result.stdout.strip().split('\n')[1:]  # Пропускаем заголовок
        
        connected_devices = []
        for device in devices:
            if device.strip() and '\tdevice' in device:
                device_id = device.split('\t')[0]
                connected_devices.append(device_id)
        
        if connected_devices:
            # Получение информации о приложении
            app_package = "ru.oneme.app"
            pid_result = subprocess.run(['adb', 'shell', 'pidof', app_package], 
                                      capture_output=True, text=True)
            app_running = bool(pid_result.stdout.strip())
            
            return {
                "status": "running" if app_running else "stopped",
                "devices": connected_devices,
                "app_package": app_package,
                "app_running": app_running,
                "timestamp": datetime.now().isoformat()
            }
        else:
            return {
                "status": "no_device",
                "devices": [],
                "message": "No Android device connected",
                "timestamp": datetime.now().isoformat()
            }
    except Exception as e:
        return {
            "status": "error",
            "error": str(e),
            "timestamp": datetime.now().isoformat()
        }

def get_real_metrics():
    """Получение реальных метрик системы"""
    try:
        metrics = {}
        
        # Получение информации о системе Android
        try:
            # CPU usage
            cpu_result = subprocess.run(['adb', 'shell', 'top', '-n', '1'], 
                                      capture_output=True, text=True, timeout=5)
            if cpu_result.stdout:
                # Парсим CPU usage из top
                lines = cpu_result.stdout.split('\n')
                for line in lines:
                    if 'CPU:' in line:
                        cpu_parts = line.split()
                        if len(cpu_parts) > 1:
                            cpu_usage = cpu_parts[1].replace('%', '')
                            try:
                                metrics['cpu_usage'] = float(cpu_usage)
                            except:
                                metrics['cpu_usage'] = 0
                        break
        except:
            metrics['cpu_usage'] = 0
        
        # Memory usage
        try:
            mem_result = subprocess.run(['adb', 'shell', 'dumpsys', 'meminfo'], 
                                      capture_output=True, text=True, timeout=5)
            if mem_result.stdout:
                lines = mem_result.stdout.split('\n')
                for line in lines:
                    if 'Total RAM:' in line:
                        ram_parts = line.split()
                        if len(ram_parts) > 2:
                            total_ram = ram_parts[2].replace('K', '')
                            try:
                                metrics['total_ram'] = int(total_ram)
                            except:
                                metrics['total_ram'] = 0
                        break
        except:
            metrics['total_ram'] = 0
        
        # Network activity
        try:
            net_result = subprocess.run(['adb', 'shell', 'netstat'], 
                                      capture_output=True, text=True, timeout=5)
            if net_result.stdout:
                connections = len([line for line in net_result.stdout.split('\n') 
                                 if 'ESTABLISHED' in line])
                metrics['network_connections'] = connections
        except:
            metrics['network_connections'] = 0
        
        # Battery level
        try:
            battery_result = subprocess.run(['adb', 'shell', 'dumpsys', 'battery'], 
                                          capture_output=True, text=True, timeout=5)
            if battery_result.stdout:
                lines = battery_result.stdout.split('\n')
                for line in lines:
                    if 'level:' in line:
                        level_parts = line.split(':')
                        if len(level_parts) > 1:
                            try:
                                metrics['battery_level'] = int(level_parts[1].strip())
                            except:
                                metrics['battery_level'] = 0
                        break
        except:
            metrics['battery_level'] = 0
        
        # App-specific metrics
        app_package = "ru.oneme.app"
        try:
            # Memory usage by app
            app_mem_result = subprocess.run(['adb', 'shell', 'dumpsys', 'meminfo', app_package], 
                                          capture_output=True, text=True, timeout=5)
            if app_mem_result.stdout:
                lines = app_mem_result.stdout.split('\n')
                for line in lines:
                    if 'TOTAL' in line:
                        mem_parts = line.split()
                        if len(mem_parts) > 1:
                            try:
                                metrics['app_memory'] = int(mem_parts[1])
                            except:
                                metrics['app_memory'] = 0
                        break
        except:
            metrics['app_memory'] = 0
        
        metrics['timestamp'] = datetime.now().isoformat()
        return metrics
        
    except Exception as e:
        return {
            "error": str(e),
            "timestamp": datetime.now().isoformat()
        }

def get_real_logs():
    """Получение реальных логов"""
    try:
        logs = []
        
        # Логи приложения
        try:
            logcat_result = subprocess.run(['adb', 'logcat', '-d', '-s', 'ru.oneme.app:*'], 
                                         capture_output=True, text=True, timeout=5)
            if logcat_result.stdout:
                lines = logcat_result.stdout.strip().split('\n')
                for line in lines[-10:]:  # Последние 10 строк
                    if line.strip():
                        parts = line.split()
                        if len(parts) >= 6:
                            timestamp = f"{parts[0]} {parts[1]}"
                            level = parts[4]
                            message = ' '.join(parts[5:])
                            logs.append({
                                "timestamp": timestamp,
                                "level": level,
                                "message": message,
                                "source": "app"
                            })
        except:
            pass
        
        # Системные логи
        try:
            sys_logcat_result = subprocess.run(['adb', 'logcat', '-d', '-s', 'System.err:*', 'AndroidRuntime:*'], 
                                             capture_output=True, text=True, timeout=5)
            if sys_logcat_result.stdout:
                lines = sys_logcat_result.stdout.strip().split('\n')
                for line in lines[-5:]:  # Последние 5 системных ошибок
                    if line.strip():
                        parts = line.split()
                        if len(parts) >= 6:
                            timestamp = f"{parts[0]} {parts[1]}"
                            level = "ERROR"
                            message = ' '.join(parts[5:])
                            logs.append({
                                "timestamp": timestamp,
                                "level": level,
                                "message": message,
                                "source": "system"
                            })
        except:
            pass
        
        # Логи из файлов проекта
        log_files = glob.glob(os.path.join(LOGS_DIR, '*.log'))
        for log_file in log_files[-3:]:  # Последние 3 файла
            try:
                with open(log_file, 'r', encoding='utf-8') as f:
                    lines = f.readlines()
                    for line in lines[-5:]:  # Последние 5 строк из каждого файла
                        if line.strip():
                            logs.append({
                                "timestamp": datetime.now().strftime("%Y-%m-%d %H:%M:%S"),
                                "level": "INFO",
                                "message": line.strip(),
                                "source": os.path.basename(log_file)
                            })
            except:
                continue
        
        # Сортируем по времени (новые сверху)
        logs.sort(key=lambda x: x['timestamp'], reverse=True)
        
        return logs[:20]  # Возвращаем последние 20 записей
        
    except Exception as e:
        return [{
            "timestamp": datetime.now().isoformat(),
            "level": "ERROR",
            "message": f"Error reading logs: {str(e)}",
            "source": "api"
        }]

@app.route('/api/status')
def get_status():
    """API endpoint для статуса"""
    return jsonify(get_real_status())

@app.route('/api/metrics')
def get_metrics():
    """API endpoint для метрик"""
    return jsonify(get_real_metrics())

@app.route('/api/logs')
def get_logs():
    """API endpoint для логов"""
    return jsonify(get_real_logs())

@app.route('/api/health')
def health_check():
    """Проверка здоровья API"""
    return jsonify({
        "status": "healthy",
        "timestamp": datetime.now().isoformat(),
        "version": "2.0.0"
    })

@app.route('/api/export')
def export_data():
    """Экспорт всех данных"""
    return jsonify({
        "status": get_real_status(),
        "metrics": get_real_metrics(),
        "logs": get_real_logs(),
        "export_time": datetime.now().isoformat()
    })

if __name__ == '__main__':
    print("🚀 Запуск API сервера с реальными данными...")
    print("📊 Эндпоинты:")
    print("   GET /api/status   - Статус системы")
    print("   GET /api/metrics  - Метрики")
    print("   GET /api/logs     - Логи")
    print("   GET /api/health   - Проверка здоровья")
    print("   GET /api/export   - Экспорт всех данных")
    print("🌐 Сервер запущен на http://localhost:5002")
    
    app.run(host='0.0.0.0', port=5002, debug=True)
