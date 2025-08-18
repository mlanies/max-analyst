package ru.ok.android.externcalls.sdk.analytics.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsConfigurationImpl;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/analytics/internal/ConversationAnalyticsSenderImpl;", "Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsSender;", "<init>", "()V", "Le5f;", "forceSendScheduledEvents", "Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfigurationImpl;", "configuration", "Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfigurationImpl;", "getConfiguration", "()Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfigurationImpl;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ConversationAnalyticsSenderImpl implements ConversationAnalyticsSender {
    private final ConversationAnalyticsConfigurationImpl configuration = new ConversationAnalyticsConfigurationImpl();

    @Override // ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender
    public void forceSendScheduledEvents() {
        CallAnalyticsSender.INSTANCE.forceSendScheduledEvents();
    }

    @Override // ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender
    public ConversationAnalyticsConfigurationImpl getConfiguration() {
        return this.configuration;
    }
}
