package ru.ok.android.externcalls.analytics.internal.config;

import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.config.UploadConfig;
import ru.ok.android.externcalls.analytics.internal.log.DefaultCallAnalyticsLogger;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/config/CallAnalyticsConfigStorage;", "", "()V", "config", "Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;", "getConfig", "()Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;", "setConfig", "(Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;)V", "defaultLogger", "Lru/ok/android/externcalls/analytics/internal/log/DefaultCallAnalyticsLogger;", "logger", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "getLogger", "()Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "upload", "Lru/ok/android/externcalls/analytics/config/UploadConfig;", "getUpload", "()Lru/ok/android/externcalls/analytics/config/UploadConfig;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallAnalyticsConfigStorage {
    private static volatile CallAnalyticsConfig config;
    public static final CallAnalyticsConfigStorage INSTANCE = new CallAnalyticsConfigStorage();
    private static final DefaultCallAnalyticsLogger defaultLogger = new DefaultCallAnalyticsLogger();

    private CallAnalyticsConfigStorage() {
    }

    public final CallAnalyticsConfig getConfig() {
        return config;
    }

    public final CallAnalyticsLogger getLogger() {
        CallAnalyticsLogger logger;
        CallAnalyticsConfig callAnalyticsConfig = config;
        return (callAnalyticsConfig == null || (logger = callAnalyticsConfig.getLogger()) == null) ? defaultLogger : logger;
    }

    public final UploadConfig getUpload() {
        UploadConfig upload;
        CallAnalyticsConfig callAnalyticsConfig = config;
        return (callAnalyticsConfig == null || (upload = callAnalyticsConfig.getUpload()) == null) ? new UploadConfig(0, null, 0L, 0L, null, null, null, null, null, null, 1023, null) : upload;
    }

    public final void setConfig(CallAnalyticsConfig callAnalyticsConfig) {
        config = callAnalyticsConfig;
    }
}
