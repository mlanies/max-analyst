# Детальный анализ критических разрешений

## 🔴 КРИТИЧЕСКИЕ РАЗРЕШЕНИЯ ДЛЯ ШПИОНАЖА

### Камера и медиа
- `android.permission.CAMERA` - **КРИТИЧНО** - доступ к камере
- `android.permission.READ_MEDIA_IMAGES` - **КРИТИЧНО** - чтение всех изображений
- `android.permission.READ_MEDIA_VIDEO` - **КРИТИЧНО** - чтение всех видео
- `android.permission.READ_MEDIA_VISUAL_USER_SELECTED` - **КРИТИЧНО** - чтение выбранных медиа

### Аудио и микрофон
- `android.permission.RECORD_AUDIO` - **КРИТИЧНО** - запись аудио
- `android.permission.MODIFY_AUDIO_SETTINGS` - **ВЫСОКИЙ РИСК** - изменение аудио настроек

### Bluetooth
- `android.permission.BLUETOOTH` - **ВЫСОКИЙ РИСК** - доступ к Bluetooth
- `android.permission.BLUETOOTH_ADMIN` - **ВЫСОКИЙ РИСК** - управление Bluetooth
- `android.permission.BLUETOOTH_CONNECT` - **ВЫСОКИЙ РИСК** - подключение к Bluetooth

### Местоположение
- `android.permission.ACCESS_FINE_LOCATION` - **КРИТИЧНО** - точное местоположение
- `android.permission.ACCESS_COARSE_LOCATION` - **ВЫСОКИЙ РИСК** - приблизительное местоположение

### Фоновые сервисы
- `android.permission.FOREGROUND_SERVICE` - **ВЫСОКИЙ РИСК** - фоновые сервисы
- `android.permission.FOREGROUND_SERVICE_CAMERA` - **КРИТИЧНО** - фоновый сервис камеры
- `android.permission.FOREGROUND_SERVICE_MICROPHONE` - **КРИТИЧНО** - фоновый сервис микрофона
- `android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION` - **КРИТИЧНО** - захват экрана

### Системные разрешения
- `android.permission.SYSTEM_ALERT_WINDOW` - **КРИТИЧНО** - поверх всех окон
- `android.permission.WAKE_LOCK` - **ВЫСОКИЙ РИСК** - предотвращение сна
- `android.permission.DISABLE_KEYGUARD` - **КРИТИЧНО** - отключение блокировки экрана
- `android.permission.RECEIVE_BOOT_COMPLETED` - **ВЫСОКИЙ РИСК** - автозапуск

## 📊 Статистика найденных функций

- **Камера:**     4658 упоминаний
- **Аудио запись:**      943 упоминаний  
- **Bluetooth:**      976 упоминаний
- **Фоновые сервисы:**      100 упоминаний
- **Автозапуск:**        4 упоминаний

## ⚠️ ВЫВОДЫ

Приложение имеет **ВСЕ НЕОБХОДИМЫЕ РАЗРЕШЕНИЯ** для полного шпионажа за пользователем:

1. **Скрытая съемка** - может делать фото/видео без уведомления
2. **Скрытое прослушивание** - может записывать аудио через микрофон
3. **Bluetooth шпионаж** - может подключаться к Bluetooth устройствам
4. **Отслеживание местоположения** - может отслеживать GPS координаты
5. **Захват экрана** - может делать скриншоты экрана
6. **Автозапуск** - может запускаться при загрузке системы
7. **Фоновые процессы** - может работать в фоне без уведомления

**ОБЩАЯ ОЦЕНКА РИСКА: 🔴 КРИТИЧЕСКИЙ**
