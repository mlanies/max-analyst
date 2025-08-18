package ru.ok.android.externcalls.sdk.rate.rtt;

import defpackage.z84;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/rtt/RttRateHintConfig;", "", "rttMs", "", "highRttCount", "", "(JI)V", "getHighRttCount", "()I", "getRttMs", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RttRateHintConfig {
    private final int highRttCount;
    private final long rttMs;

    public RttRateHintConfig() {
        this(0L, 0, 3, null);
    }

    public static /* synthetic */ RttRateHintConfig copy$default(RttRateHintConfig rttRateHintConfig, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = rttRateHintConfig.rttMs;
        }
        if ((i2 & 2) != 0) {
            i = rttRateHintConfig.highRttCount;
        }
        return rttRateHintConfig.copy(j, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getRttMs() {
        return this.rttMs;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHighRttCount() {
        return this.highRttCount;
    }

    public final RttRateHintConfig copy(long rttMs, int highRttCount) {
        return new RttRateHintConfig(rttMs, highRttCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RttRateHintConfig)) {
            return false;
        }
        RttRateHintConfig rttRateHintConfig = (RttRateHintConfig) other;
        return this.rttMs == rttRateHintConfig.rttMs && this.highRttCount == rttRateHintConfig.highRttCount;
    }

    public final int getHighRttCount() {
        return this.highRttCount;
    }

    public final long getRttMs() {
        return this.rttMs;
    }

    public int hashCode() {
        return Integer.hashCode(this.highRttCount) + (Long.hashCode(this.rttMs) * 31);
    }

    public String toString() {
        return "RttRateHintConfig(rttMs=" + this.rttMs + ", highRttCount=" + this.highRttCount + ")";
    }

    public RttRateHintConfig(long j, int i) {
        this.rttMs = j;
        this.highRttCount = i;
    }

    public /* synthetic */ RttRateHintConfig(long j, int i, int i2, z84 z84Var) {
        this((i2 & 1) != 0 ? 1000L : j, (i2 & 2) != 0 ? 1 : i);
    }
}
