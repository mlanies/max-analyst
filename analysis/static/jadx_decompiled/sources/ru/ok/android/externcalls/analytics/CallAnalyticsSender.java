package ru.ok.android.externcalls.analytics;

import defpackage.l01;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;
import ru.ok.android.externcalls.analytics.internal.log.DefaultCallAnalyticsLogger;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/analytics/CallAnalyticsSender;", "", "<init>", "()V", "Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;", "config", "Le5f;", "initialize", "(Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;)V", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "event", "send", "(Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;)V", "forceSendScheduledEvents", "", "isIdle", "setIdle", "(Z)V", "", "LOG_TAG", "Ljava/lang/String;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CallAnalyticsSender {
    public static final CallAnalyticsSender INSTANCE = new CallAnalyticsSender();
    private static final String LOG_TAG = "CallAnalyticsSender";

    private CallAnalyticsSender() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setIdle$lambda$0(boolean z) {
        return z;
    }

    public final void forceSendScheduledEvents() {
        EventQueueCollector.flushAll();
    }

    public final synchronized void initialize(CallAnalyticsConfig config) {
        CallAnalyticsConfigStorage callAnalyticsConfigStorage = CallAnalyticsConfigStorage.INSTANCE;
        if (callAnalyticsConfigStorage.getConfig() == null) {
            callAnalyticsConfigStorage.setConfig(config);
        }
    }

    public final void send(CallAnalyticsEvent event) {
        if (CallAnalyticsConfigStorage.INSTANCE.getConfig() != null) {
            EventQueueCollector.getInstance(event.getApiMethodName()).addEvent(event);
            return;
        }
        new DefaultCallAnalyticsLogger().e(LOG_TAG, "CallAnalyticsSender is not initialized, event=" + event + " is skipped");
    }

    public final void setIdle(boolean isIdle) {
        EventQueueCollector.setIdleStateProvider(new l01(isIdle, 0));
    }
}
