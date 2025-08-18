package ru.ok.android.externcalls.analytics.config;

import defpackage.q2a;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;", "", "Lq2a;", "okApi", "Lru/ok/android/externcalls/analytics/config/EventMetaParamsConfig;", "eventMetaParams", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "logger", "Lru/ok/android/externcalls/analytics/config/UploadConfig;", "upload", "<init>", "(Lq2a;Lru/ok/android/externcalls/analytics/config/EventMetaParamsConfig;Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;Lru/ok/android/externcalls/analytics/config/UploadConfig;)V", "Lq2a;", "getOkApi", "()Lq2a;", "Lru/ok/android/externcalls/analytics/config/EventMetaParamsConfig;", "getEventMetaParams", "()Lru/ok/android/externcalls/analytics/config/EventMetaParamsConfig;", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "getLogger", "()Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "Lru/ok/android/externcalls/analytics/config/UploadConfig;", "getUpload", "()Lru/ok/android/externcalls/analytics/config/UploadConfig;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CallAnalyticsConfig {
    private final EventMetaParamsConfig eventMetaParams;
    private final CallAnalyticsLogger logger;
    private final q2a okApi;
    private final UploadConfig upload;

    public CallAnalyticsConfig(q2a q2aVar, EventMetaParamsConfig eventMetaParamsConfig, CallAnalyticsLogger callAnalyticsLogger, UploadConfig uploadConfig) {
        this.okApi = q2aVar;
        this.eventMetaParams = eventMetaParamsConfig;
        this.logger = callAnalyticsLogger;
        this.upload = uploadConfig;
    }

    public final EventMetaParamsConfig getEventMetaParams() {
        return this.eventMetaParams;
    }

    public final CallAnalyticsLogger getLogger() {
        return this.logger;
    }

    public final q2a getOkApi() {
        return this.okApi;
    }

    public final UploadConfig getUpload() {
        return this.upload;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ CallAnalyticsConfig(defpackage.q2a r19, ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig r20, ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger r21, ru.ok.android.externcalls.analytics.config.UploadConfig r22, int r23, defpackage.z84 r24) {
        /*
            r18 = this;
            r0 = r23 & 2
            if (r0 == 0) goto Lc
            ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig r0 = new ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig
            r1 = 1
            r2 = 0
            r0.<init>(r2, r1, r2)
            goto Le
        Lc:
            r0 = r20
        Le:
            r1 = r23 & 4
            if (r1 == 0) goto L18
            ru.ok.android.externcalls.analytics.internal.log.DefaultCallAnalyticsLogger r1 = new ru.ok.android.externcalls.analytics.internal.log.DefaultCallAnalyticsLogger
            r1.<init>()
            goto L1a
        L18:
            r1 = r21
        L1a:
            r2 = r23 & 8
            if (r2 == 0) goto L39
            ru.ok.android.externcalls.analytics.config.UploadConfig r2 = new ru.ok.android.externcalls.analytics.config.UploadConfig
            r16 = 1023(0x3ff, float:1.434E-42)
            r17 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17)
            r3 = r18
            r4 = r19
            goto L3f
        L39:
            r3 = r18
            r4 = r19
            r2 = r22
        L3f:
            r3.<init>(r4, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig.<init>(q2a, ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig, ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger, ru.ok.android.externcalls.analytics.config.UploadConfig, int, z84):void");
    }
}
