#!/usr/bin/env python3
"""
Простой тест API сервера
"""

import requests
import json
import time

def test_api():
    base_url = "http://localhost:5003"
    
    print("🧪 Тестирование API сервера...")
    print(f"🌐 URL: {base_url}")
    print("-" * 50)
    
    # Тест 1: Проверка здоровья
    try:
        print("1. Тест /api/health...")
        response = requests.get(f"{base_url}/api/health", timeout=5)
        if response.status_code == 200:
            print("✅ /api/health - OK")
            print(f"   Ответ: {response.json()}")
        else:
            print(f"❌ /api/health - Ошибка {response.status_code}")
    except Exception as e:
        print(f"❌ /api/health - Ошибка: {e}")
    
    print()
    
    # Тест 2: Статус системы
    try:
        print("2. Тест /api/status...")
        response = requests.get(f"{base_url}/api/status", timeout=5)
        if response.status_code == 200:
            print("✅ /api/status - OK")
            data = response.json()
            print(f"   Статус: {data.get('status', 'N/A')}")
            print(f"   Устройства: {data.get('devices', [])}")
            print(f"   Приложение: {data.get('app_package', 'N/A')}")
        else:
            print(f"❌ /api/status - Ошибка {response.status_code}")
    except Exception as e:
        print(f"❌ /api/status - Ошибка: {e}")
    
    print()
    
    # Тест 3: Метрики
    try:
        print("3. Тест /api/metrics...")
        response = requests.get(f"{base_url}/api/metrics", timeout=5)
        if response.status_code == 200:
            print("✅ /api/metrics - OK")
            data = response.json()
            print(f"   CPU: {data.get('cpu_usage', 'N/A')}%")
            print(f"   RAM: {data.get('total_ram', 'N/A')}K")
            print(f"   Соединения: {data.get('network_connections', 'N/A')}")
        else:
            print(f"❌ /api/metrics - Ошибка {response.status_code}")
    except Exception as e:
        print(f"❌ /api/metrics - Ошибка: {e}")
    
    print()
    
    # Тест 4: Логи
    try:
        print("4. Тест /api/logs...")
        response = requests.get(f"{base_url}/api/logs", timeout=5)
        if response.status_code == 200:
            print("✅ /api/logs - OK")
            logs = response.json()
            print(f"   Количество логов: {len(logs)}")
            if logs:
                print(f"   Последний лог: {logs[0].get('message', 'N/A')[:50]}...")
        else:
            print(f"❌ /api/logs - Ошибка {response.status_code}")
    except Exception as e:
        print(f"❌ /api/logs - Ошибка: {e}")
    
    print()
    print("-" * 50)
    print("🏁 Тестирование завершено!")

if __name__ == "__main__":
    test_api()
