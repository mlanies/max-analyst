package ru.ok.android.externcalls.sdk.rate.internal;

import defpackage.a4c;
import defpackage.yh1;
import defpackage.z84;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/RttRateHintTrigger;", "Lyh1;", "La4c;", "log", "Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "config", "Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;", "collection", "<init>", "(La4c;Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;)V", "Lc4c;", "rtcStat", "Le5f;", "onRtcStats", "(Lc4c;)V", "La4c;", "Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "Lru/ok/android/externcalls/sdk/rate/internal/RateHintCollection;", "", "highRttCount", "I", "", "wasReported", "Z", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RttRateHintTrigger implements yh1 {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "RateManager";
    private static final String RTT_HINT_REASON = "rtt_";
    private final RateHintCollection collection;
    private final RttRateHintConfig config;
    private int highRttCount;
    private final a4c log;
    private boolean wasReported;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/internal/RttRateHintTrigger$Companion;", "", "()V", "LOG_TAG", "", "RTT_HINT_REASON", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    public RttRateHintTrigger(a4c a4cVar, RttRateHintConfig rttRateHintConfig, RateHintCollection rateHintCollection) {
        this.log = a4cVar;
        this.config = rttRateHintConfig;
        this.collection = rateHintCollection;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    @Override // defpackage.yh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRtcStats(defpackage.c4c r6) {
        /*
            r5 = this;
            boolean r0 = r5.wasReported
            if (r0 == 0) goto L5
            return
        L5:
            cz1 r6 = r6.c()
            if (r6 == 0) goto L28
            java.lang.String r6 = r6.h
            if (r6 == 0) goto L28
            r0 = 0
            qec r1 = defpackage.hvc.a     // Catch: java.lang.NumberFormatException -> L20
            boolean r1 = r1.a(r6)     // Catch: java.lang.NumberFormatException -> L20
            if (r1 == 0) goto L20
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.NumberFormatException -> L20
            java.lang.Float r0 = java.lang.Float.valueOf(r6)     // Catch: java.lang.NumberFormatException -> L20
        L20:
            if (r0 == 0) goto L28
            float r6 = r0.floatValue()
            long r0 = (long) r6
            goto L2a
        L28:
            r0 = 0
        L2a:
            a4c r6 = r5.log
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "measured rtt: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RateManager"
            r6.log(r3, r2)
            ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig r6 = r5.config
            long r2 = r6.getRttMs()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 1
            if (r6 < 0) goto L50
            int r6 = r5.highRttCount
            int r6 = r6 + r0
            r5.highRttCount = r6
            goto L53
        L50:
            r6 = 0
            r5.highRttCount = r6
        L53:
            int r6 = r5.highRttCount
            ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig r1 = r5.config
            int r1 = r1.getHighRttCount()
            if (r6 < r1) goto L75
            ru.ok.android.externcalls.sdk.rate.internal.RateHintCollection r6 = r5.collection
            ru.ok.android.externcalls.sdk.rate.RateHint r1 = new ru.ok.android.externcalls.sdk.rate.RateHint
            ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig r2 = r5.config
            long r2 = r2.getRttMs()
            java.lang.String r4 = "rtt_"
            java.lang.String r2 = defpackage.ey8.h(r2, r4)
            r1.<init>(r2)
            r6.addRateHint(r1)
            r5.wasReported = r0
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.rate.internal.RttRateHintTrigger.onRtcStats(c4c):void");
    }
}
