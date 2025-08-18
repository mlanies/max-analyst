package ru.ok.android.externcalls.sdk.analytics;

import defpackage.k7d;
import defpackage.ms2;
import defpackage.tpa;
import defpackage.wg0;
import defpackage.z84;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JL\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsUploadConfig;", "", "maxLocalFileSizeKb", "", "maxEventCount", "maxLocalFileCount", "timeToUploadNextFileMs", "", "compressContent", "", "disableUploadWhenCallIsActiveProvider", "(IIILjava/lang/Long;ZZ)V", "getCompressContent", "()Z", "getDisableUploadWhenCallIsActiveProvider", "getMaxEventCount", "()I", "getMaxLocalFileCount", "getMaxLocalFileSizeKb", "getTimeToUploadNextFileMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(IIILjava/lang/Long;ZZ)Lru/ok/android/externcalls/sdk/analytics/ConversationAnalyticsUploadConfig;", "equals", "other", "hashCode", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ConversationAnalyticsUploadConfig {
    private final boolean compressContent;
    private final boolean disableUploadWhenCallIsActiveProvider;
    private final int maxEventCount;
    private final int maxLocalFileCount;
    private final int maxLocalFileSizeKb;
    private final Long timeToUploadNextFileMs;

    public ConversationAnalyticsUploadConfig(int i, int i2, int i3, Long l, boolean z, boolean z2) {
        this.maxLocalFileSizeKb = i;
        this.maxEventCount = i2;
        this.maxLocalFileCount = i3;
        this.timeToUploadNextFileMs = l;
        this.compressContent = z;
        this.disableUploadWhenCallIsActiveProvider = z2;
    }

    public static /* synthetic */ ConversationAnalyticsUploadConfig copy$default(ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig, int i, int i2, int i3, Long l, boolean z, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = conversationAnalyticsUploadConfig.maxLocalFileSizeKb;
        }
        if ((i4 & 2) != 0) {
            i2 = conversationAnalyticsUploadConfig.maxEventCount;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = conversationAnalyticsUploadConfig.maxLocalFileCount;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            l = conversationAnalyticsUploadConfig.timeToUploadNextFileMs;
        }
        Long l2 = l;
        if ((i4 & 16) != 0) {
            z = conversationAnalyticsUploadConfig.compressContent;
        }
        boolean z3 = z;
        if ((i4 & 32) != 0) {
            z2 = conversationAnalyticsUploadConfig.disableUploadWhenCallIsActiveProvider;
        }
        return conversationAnalyticsUploadConfig.copy(i, i5, i6, l2, z3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxLocalFileSizeKb() {
        return this.maxLocalFileSizeKb;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxEventCount() {
        return this.maxEventCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxLocalFileCount() {
        return this.maxLocalFileCount;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getTimeToUploadNextFileMs() {
        return this.timeToUploadNextFileMs;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCompressContent() {
        return this.compressContent;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final ConversationAnalyticsUploadConfig copy(int maxLocalFileSizeKb, int maxEventCount, int maxLocalFileCount, Long timeToUploadNextFileMs, boolean compressContent, boolean disableUploadWhenCallIsActiveProvider) {
        return new ConversationAnalyticsUploadConfig(maxLocalFileSizeKb, maxEventCount, maxLocalFileCount, timeToUploadNextFileMs, compressContent, disableUploadWhenCallIsActiveProvider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationAnalyticsUploadConfig)) {
            return false;
        }
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) other;
        return this.maxLocalFileSizeKb == conversationAnalyticsUploadConfig.maxLocalFileSizeKb && this.maxEventCount == conversationAnalyticsUploadConfig.maxEventCount && this.maxLocalFileCount == conversationAnalyticsUploadConfig.maxLocalFileCount && tpa.f(this.timeToUploadNextFileMs, conversationAnalyticsUploadConfig.timeToUploadNextFileMs) && this.compressContent == conversationAnalyticsUploadConfig.compressContent && this.disableUploadWhenCallIsActiveProvider == conversationAnalyticsUploadConfig.disableUploadWhenCallIsActiveProvider;
    }

    public final boolean getCompressContent() {
        return this.compressContent;
    }

    public final boolean getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final int getMaxEventCount() {
        return this.maxEventCount;
    }

    public final int getMaxLocalFileCount() {
        return this.maxLocalFileCount;
    }

    public final int getMaxLocalFileSizeKb() {
        return this.maxLocalFileSizeKb;
    }

    public final Long getTimeToUploadNextFileMs() {
        return this.timeToUploadNextFileMs;
    }

    public int hashCode() {
        int iE = k7d.e(this.maxLocalFileCount, k7d.e(this.maxEventCount, Integer.hashCode(this.maxLocalFileSizeKb) * 31, 31), 31);
        Long l = this.timeToUploadNextFileMs;
        return Boolean.hashCode(this.disableUploadWhenCallIsActiveProvider) + ms2.d((iE + (l == null ? 0 : l.hashCode())) * 31, 31, this.compressContent);
    }

    public String toString() {
        int i = this.maxLocalFileSizeKb;
        int i2 = this.maxEventCount;
        int i3 = this.maxLocalFileCount;
        Long l = this.timeToUploadNextFileMs;
        boolean z = this.compressContent;
        boolean z2 = this.disableUploadWhenCallIsActiveProvider;
        StringBuilder sbJ = wg0.j("ConversationAnalyticsUploadConfig(maxLocalFileSizeKb=", i, ", maxEventCount=", i2, ", maxLocalFileCount=");
        sbJ.append(i3);
        sbJ.append(", timeToUploadNextFileMs=");
        sbJ.append(l);
        sbJ.append(", compressContent=");
        sbJ.append(z);
        sbJ.append(", disableUploadWhenCallIsActiveProvider=");
        sbJ.append(z2);
        sbJ.append(")");
        return sbJ.toString();
    }

    public /* synthetic */ ConversationAnalyticsUploadConfig(int i, int i2, int i3, Long l, boolean z, boolean z2, int i4, z84 z84Var) {
        this(i, i2, (i4 & 4) != 0 ? 1 : i3, (i4 & 8) != 0 ? null : l, (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? false : z2);
    }
}
