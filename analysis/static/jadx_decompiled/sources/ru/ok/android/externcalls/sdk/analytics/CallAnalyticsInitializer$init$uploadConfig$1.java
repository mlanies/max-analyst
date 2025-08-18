package ru.ok.android.externcalls.sdk.analytics;

import defpackage.k56;
import defpackage.rd7;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsUploadConfig;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallAnalyticsInitializer$init$uploadConfig$1 extends rd7 implements k56 {
    final /* synthetic */ ConversationAnalyticsConfigurationImpl $analyticsConfiguration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallAnalyticsInitializer$init$uploadConfig$1(ConversationAnalyticsConfigurationImpl conversationAnalyticsConfigurationImpl) {
        super(0);
        this.$analyticsConfiguration = conversationAnalyticsConfigurationImpl;
    }

    @Override // defpackage.k56
    public final ConversationAnalyticsUploadConfig invoke() {
        UploadConfigProvider uploadConfigProvider = this.$analyticsConfiguration.getUploadConfigProvider();
        if (uploadConfigProvider != null) {
            return uploadConfigProvider.getUploadConfig();
        }
        return null;
    }
}
