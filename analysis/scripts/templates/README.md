# MAX Analyst CSS Style Guide

## Обзор

Этот файл содержит профессиональные CSS стили для веб-интерфейса MAX Analyst. Стили разработаны с учетом лучших практик и обеспечивают единообразный внешний вид.

## Подключение стилей

### В HTML файле
```html
<link rel="stylesheet" href="scripts/templates/style.css">
```

### Структура файлов
```
analysis/
├── scripts/
│   └── templates/
│       ├── style.css          # Основные стили
│       └── README.md          # Эта документация
├── web_monitor.html           # Основной интерфейс
└── demo.html                  # Демонстрация компонентов
```

## Цветовая схема

### CSS переменные
```css
:root {
    --bg-primary: #0a0a0a;        /* Основной фон */
    --bg-secondary: #1a1a1a;      /* Вторичный фон */
    --bg-tertiary: #2a2a2a;       /* Третичный фон */
    --text-primary: #ffffff;      /* Основной текст */
    --text-secondary: #b0b0b0;    /* Вторичный текст */
    --text-muted: #666666;        /* Приглушенный текст */
    --accent-primary: #3b82f6;    /* Основной акцент */
    --accent-secondary: #1d4ed8;  /* Вторичный акцент */
    --success: #10b981;           /* Успех */
    --warning: #f59e0b;           /* Предупреждение */
    --error: #ef4444;             /* Ошибка */
    --border: #333333;            /* Границы */
    --shadow: rgba(0, 0, 0, 0.3); /* Тени */
}
```

## Компоненты

### Кнопки
```html
<button class="btn">Primary Button</button>
<button class="btn btn-success">Success Button</button>
<button class="btn btn-danger">Danger Button</button>
<button class="btn" disabled>Disabled Button</button>
```

### Уведомления
```html
<div class="alert alert-info">Info message</div>
<div class="alert alert-success">Success message</div>
<div class="alert alert-warning">Warning message</div>
<div class="alert alert-error">Error message</div>
```

### Бейджи
```html
<span class="badge badge-success">Success</span>
<span class="badge badge-warning">Warning</span>
<span class="badge badge-error">Error</span>
<span class="badge badge-info">Info</span>
```

### Прогресс-бары
```html
<div class="progress">
    <div class="progress-bar" style="width: 75%"></div>
</div>
<div class="progress">
    <div class="progress-bar success" style="width: 90%"></div>
</div>
<div class="progress">
    <div class="progress-bar warning" style="width: 60%"></div>
</div>
<div class="progress">
    <div class="progress-bar error" style="width: 25%"></div>
</div>
```

### Индикаторы статуса
```html
<span class="status-indicator online"></span>
<span class="status-indicator offline"></span>
<span class="status-indicator warning"></span>
```

### Формы
```html
<div class="form-group">
    <label class="form-label">Label</label>
    <input type="text" class="form-input" placeholder="Placeholder">
</div>
<div class="form-group">
    <label class="form-label">Select</label>
    <select class="form-select">
        <option>Option 1</option>
        <option>Option 2</option>
    </select>
</div>
```

### Таблицы
```html
<table class="data-table">
    <thead>
        <tr>
            <th>Header 1</th>
            <th>Header 2</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Data 1</td>
            <td>Data 2</td>
        </tr>
    </tbody>
</table>
```

### Блоки кода
```html
<div class="code-block">
    <pre>Your code here</pre>
</div>
```

### Подсказки
```html
<div class="tooltip">
    <span>Hover me</span>
    <span class="tooltiptext">Tooltip text</span>
</div>
```

### Уведомления (фиксированные)
```html
<div class="notification success">Success notification</div>
<div class="notification warning">Warning notification</div>
<div class="notification error">Error notification</div>
<div class="notification info">Info notification</div>
```

## Утилитарные классы

### Выравнивание текста
```html
<div class="text-center">Centered text</div>
<div class="text-right">Right aligned text</div>
<div class="text-left">Left aligned text</div>
```

### Отступы
```html
<div class="mt-8">Margin top 8px</div>
<div class="mt-16">Margin top 16px</div>
<div class="mb-8">Margin bottom 8px</div>
<div class="mb-16">Margin bottom 16px</div>
<div class="ml-8">Margin left 8px</div>
<div class="mr-8">Margin right 8px</div>
<div class="p-8">Padding 8px</div>
<div class="p-16">Padding 16px</div>
```

### Flexbox
```html
<div class="flex">Display flex</div>
<div class="flex-col">Flex column</div>
<div class="items-center">Align items center</div>
<div class="justify-between">Justify space between</div>
<div class="justify-center">Justify center</div>
<div class="gap-8">Gap 8px</div>
<div class="gap-16">Gap 16px</div>
```

### Размеры
```html
<div class="w-full">Width 100%</div>
<div class="h-full">Height 100%</div>
```

### Видимость
```html
<div class="hidden">Hidden element</div>
<div class="visible">Visible element</div>
```

### Анимации
```html
<div class="pulse">Pulsing animation</div>
```

## Адаптивность

### Мобильные устройства
```css
@media (max-width: 768px) {
    .hidden-mobile {
        display: none;
    }
}
```

### Печать
```css
@media print {
    .no-print {
        display: none !important;
    }
}
```

## Доступность

### Фокус
Все интерактивные элементы имеют стили фокуса для навигации с клавиатуры:
```css
.btn:focus,
input:focus,
select:focus,
textarea:focus {
    outline: 2px solid var(--accent-primary);
    outline-offset: 2px;
}
```

### Контрастность
Цветовая схема разработана с учетом требований WCAG для достаточной контрастности.

## Кастомизация

### Изменение цветов
Для изменения цветовой схемы отредактируйте CSS переменные в начале файла `style.css`.

### Добавление новых компонентов
Новые компоненты следует добавлять в соответствующие секции файла с комментариями.

## Демонстрация

Для просмотра всех доступных компонентов откройте файл `demo.html` в браузере:

```bash
# Запуск веб-сервера
python3 -m http.server 8000

# Открыть демо
# http://localhost:8000/demo.html
```

## Совместимость

- **Браузеры**: Chrome 90+, Firefox 88+, Safari 14+, Edge 90+
- **Платформы**: Desktop, Tablet, Mobile
- **Поддержка**: CSS Grid, Flexbox, CSS Variables

## Лицензия

Стили разработаны специально для проекта MAX Analyst и могут использоваться в рамках проекта.
