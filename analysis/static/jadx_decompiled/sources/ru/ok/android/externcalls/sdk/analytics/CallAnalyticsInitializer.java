package ru.ok.android.externcalls.sdk.analytics;

import defpackage.k56;
import defpackage.q2a;
import defpackage.rd7;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig;
import ru.ok.android.externcalls.analytics.config.UploadConfig;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/analytics/CallAnalyticsInitializer;", "", "<init>", "()V", "Lru/ok/android/externcalls/analytics/CallAnalyticsSender;", "callAnalyticsSender", "Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfigurationImpl;", "analyticsConfiguration", "Lq2a;", "api", "Lkotlin/Function0;", "La4c;", "logger", "Le5f;", "init", "(Lru/ok/android/externcalls/analytics/CallAnalyticsSender;Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsConfigurationImpl;Lq2a;Lk56;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CallAnalyticsInitializer {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer$init$1, reason: invalid class name */
    public static final class AnonymousClass1 extends rd7 implements k56 {
        final /* synthetic */ ConversationAnalyticsConfigurationImpl $analyticsConfiguration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConversationAnalyticsConfigurationImpl conversationAnalyticsConfigurationImpl) {
            super(0);
            this.$analyticsConfiguration = conversationAnalyticsConfigurationImpl;
        }

        @Override // defpackage.k56
        public final String invoke() {
            ApplicationNameProvider applicationNameProvider = this.$analyticsConfiguration.getApplicationNameProvider();
            if (applicationNameProvider != null) {
                return applicationNameProvider.getName();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer$init$2, reason: invalid class name */
    public static final class AnonymousClass2 extends rd7 implements k56 {
        final /* synthetic */ k56 $uploadConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(k56 k56Var) {
            super(0);
            this.$uploadConfig = k56Var;
        }

        @Override // defpackage.k56
        public final Integer invoke() {
            ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) this.$uploadConfig.invoke();
            if (conversationAnalyticsUploadConfig != null) {
                return Integer.valueOf(conversationAnalyticsUploadConfig.getMaxLocalFileSizeKb());
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer$init$3, reason: invalid class name */
    public static final class AnonymousClass3 extends rd7 implements k56 {
        final /* synthetic */ k56 $uploadConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(k56 k56Var) {
            super(0);
            this.$uploadConfig = k56Var;
        }

        @Override // defpackage.k56
        public final Integer invoke() {
            ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) this.$uploadConfig.invoke();
            if (conversationAnalyticsUploadConfig != null) {
                return Integer.valueOf(conversationAnalyticsUploadConfig.getMaxEventCount());
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer$init$4, reason: invalid class name */
    public static final class AnonymousClass4 extends rd7 implements k56 {
        final /* synthetic */ k56 $uploadConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(k56 k56Var) {
            super(0);
            this.$uploadConfig = k56Var;
        }

        @Override // defpackage.k56
        public final Integer invoke() {
            ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) this.$uploadConfig.invoke();
            if (conversationAnalyticsUploadConfig != null) {
                return Integer.valueOf(conversationAnalyticsUploadConfig.getMaxLocalFileCount());
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer$init$5, reason: invalid class name */
    public static final class AnonymousClass5 extends rd7 implements k56 {
        final /* synthetic */ k56 $uploadConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(k56 k56Var) {
            super(0);
            this.$uploadConfig = k56Var;
        }

        @Override // defpackage.k56
        public final Long invoke() {
            ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) this.$uploadConfig.invoke();
            if (conversationAnalyticsUploadConfig != null) {
                return conversationAnalyticsUploadConfig.getTimeToUploadNextFileMs();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer$init$6, reason: invalid class name */
    public static final class AnonymousClass6 extends rd7 implements k56 {
        final /* synthetic */ k56 $uploadConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(k56 k56Var) {
            super(0);
            this.$uploadConfig = k56Var;
        }

        @Override // defpackage.k56
        public final Boolean invoke() {
            ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) this.$uploadConfig.invoke();
            if (conversationAnalyticsUploadConfig != null) {
                return Boolean.valueOf(conversationAnalyticsUploadConfig.getCompressContent());
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer$init$7, reason: invalid class name */
    public static final class AnonymousClass7 extends rd7 implements k56 {
        final /* synthetic */ k56 $uploadConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(k56 k56Var) {
            super(0);
            this.$uploadConfig = k56Var;
        }

        @Override // defpackage.k56
        public final Boolean invoke() {
            ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) this.$uploadConfig.invoke();
            if (conversationAnalyticsUploadConfig != null) {
                return Boolean.valueOf(conversationAnalyticsUploadConfig.getDisableUploadWhenCallIsActiveProvider());
            }
            return null;
        }
    }

    public final void init(CallAnalyticsSender callAnalyticsSender, ConversationAnalyticsConfigurationImpl analyticsConfiguration, q2a api, k56 logger) {
        CallAnalyticsInitializer$init$uploadConfig$1 callAnalyticsInitializer$init$uploadConfig$1 = new CallAnalyticsInitializer$init$uploadConfig$1(analyticsConfiguration);
        callAnalyticsSender.initialize(new CallAnalyticsConfig(api, new EventMetaParamsConfig(new AnonymousClass1(analyticsConfiguration)), new CallAnalyticsLoggerImpl(logger), new UploadConfig(0, null, 0L, 0L, new AnonymousClass2(callAnalyticsInitializer$init$uploadConfig$1), new AnonymousClass3(callAnalyticsInitializer$init$uploadConfig$1), new AnonymousClass4(callAnalyticsInitializer$init$uploadConfig$1), new AnonymousClass5(callAnalyticsInitializer$init$uploadConfig$1), new AnonymousClass6(callAnalyticsInitializer$init$uploadConfig$1), new AnonymousClass7(callAnalyticsInitializer$init$uploadConfig$1), 15, null)));
    }
}
