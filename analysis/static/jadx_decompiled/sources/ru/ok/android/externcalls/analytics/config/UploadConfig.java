package ru.ok.android.externcalls.analytics.config;

import defpackage.au1;
import defpackage.h4f;
import defpackage.k56;
import defpackage.tpa;
import defpackage.z84;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b$\b\u0086\b\u0018\u0000 F2\u00020\u0001:\u0001FB©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u001a\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u001a\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u001a\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u001a\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010\u001bJ²\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0014J\u001a\u0010(\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u0018R!\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001bR!\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b3\u0010\u001bR!\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b4\u0010\u001bR!\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b5\u0010\u001bR!\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b6\u0010\u001bR!\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b7\u0010\u001bR\u0011\u00109\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b8\u0010\u0014R\u0011\u0010;\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b:\u0010\u0014R\u0011\u0010=\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b<\u0010\u0014R\u0013\u0010@\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010C\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010E\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bD\u0010B¨\u0006G"}, d2 = {"Lru/ok/android/externcalls/analytics/config/UploadConfig;", "", "", "uploadJobId", "Ljava/util/concurrent/Executor;", "uploadExecutor", "", "maxTimeToUploadMillis", "silenceToUploadMillis", "Lkotlin/Function0;", "maxFileLengthKbProvider", "maxEventCountProvider", "maxLocalCacheFileCountProvider", "timeToUploadNextMsProvider", "", "compressContentProvider", "disableUploadWhenCallIsActiveProvider", "<init>", "(ILjava/util/concurrent/Executor;JJLk56;Lk56;Lk56;Lk56;Lk56;Lk56;)V", "component1", "()I", "component2", "()Ljava/util/concurrent/Executor;", "component3", "()J", "component4", "component5", "()Lk56;", "component6", "component7", "component8", "component9", "component10", "copy", "(ILjava/util/concurrent/Executor;JJLk56;Lk56;Lk56;Lk56;Lk56;Lk56;)Lru/ok/android/externcalls/analytics/config/UploadConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getUploadJobId", "Ljava/util/concurrent/Executor;", "getUploadExecutor", "J", "getMaxTimeToUploadMillis", "getSilenceToUploadMillis", "Lk56;", "getMaxFileLengthKbProvider", "getMaxEventCountProvider", "getMaxLocalCacheFileCountProvider", "getTimeToUploadNextMsProvider", "getCompressContentProvider", "getDisableUploadWhenCallIsActiveProvider", "getFileLengthTriggerToUploadBytes", "fileLengthTriggerToUploadBytes", "getEventCountToUploadNumber", "eventCountToUploadNumber", "getMaxLocalCacheFileCount", "maxLocalCacheFileCount", "getTimeToUploadNextMs", "()Ljava/lang/Long;", "timeToUploadNextMs", "getCompressContent", "()Z", "compressContent", "getDisableUploadWhenCallIsActive", "disableUploadWhenCallIsActive", "Companion", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class UploadConfig {
    public static final int DEFAULT_MAX_EVENT_COUNT = 500;
    public static final int DEFAULT_MAX_FILE_SIZE_KB = 100;
    private final k56 compressContentProvider;
    private final k56 disableUploadWhenCallIsActiveProvider;
    private final k56 maxEventCountProvider;
    private final k56 maxFileLengthKbProvider;
    private final k56 maxLocalCacheFileCountProvider;
    private final long maxTimeToUploadMillis;
    private final long silenceToUploadMillis;
    private final k56 timeToUploadNextMsProvider;
    private final Executor uploadExecutor;
    private final int uploadJobId;

    public UploadConfig() {
        this(0, null, 0L, 0L, null, null, null, null, null, null, 1023, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUploadJobId() {
        return this.uploadJobId;
    }

    /* renamed from: component10, reason: from getter */
    public final k56 getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    /* renamed from: component2, reason: from getter */
    public final Executor getUploadExecutor() {
        return this.uploadExecutor;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMaxTimeToUploadMillis() {
        return this.maxTimeToUploadMillis;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSilenceToUploadMillis() {
        return this.silenceToUploadMillis;
    }

    /* renamed from: component5, reason: from getter */
    public final k56 getMaxFileLengthKbProvider() {
        return this.maxFileLengthKbProvider;
    }

    /* renamed from: component6, reason: from getter */
    public final k56 getMaxEventCountProvider() {
        return this.maxEventCountProvider;
    }

    /* renamed from: component7, reason: from getter */
    public final k56 getMaxLocalCacheFileCountProvider() {
        return this.maxLocalCacheFileCountProvider;
    }

    /* renamed from: component8, reason: from getter */
    public final k56 getTimeToUploadNextMsProvider() {
        return this.timeToUploadNextMsProvider;
    }

    /* renamed from: component9, reason: from getter */
    public final k56 getCompressContentProvider() {
        return this.compressContentProvider;
    }

    public final UploadConfig copy(int uploadJobId, Executor uploadExecutor, long maxTimeToUploadMillis, long silenceToUploadMillis, k56 maxFileLengthKbProvider, k56 maxEventCountProvider, k56 maxLocalCacheFileCountProvider, k56 timeToUploadNextMsProvider, k56 compressContentProvider, k56 disableUploadWhenCallIsActiveProvider) {
        return new UploadConfig(uploadJobId, uploadExecutor, maxTimeToUploadMillis, silenceToUploadMillis, maxFileLengthKbProvider, maxEventCountProvider, maxLocalCacheFileCountProvider, timeToUploadNextMsProvider, compressContentProvider, disableUploadWhenCallIsActiveProvider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadConfig)) {
            return false;
        }
        UploadConfig uploadConfig = (UploadConfig) other;
        return this.uploadJobId == uploadConfig.uploadJobId && tpa.f(this.uploadExecutor, uploadConfig.uploadExecutor) && this.maxTimeToUploadMillis == uploadConfig.maxTimeToUploadMillis && this.silenceToUploadMillis == uploadConfig.silenceToUploadMillis && tpa.f(this.maxFileLengthKbProvider, uploadConfig.maxFileLengthKbProvider) && tpa.f(this.maxEventCountProvider, uploadConfig.maxEventCountProvider) && tpa.f(this.maxLocalCacheFileCountProvider, uploadConfig.maxLocalCacheFileCountProvider) && tpa.f(this.timeToUploadNextMsProvider, uploadConfig.timeToUploadNextMsProvider) && tpa.f(this.compressContentProvider, uploadConfig.compressContentProvider) && tpa.f(this.disableUploadWhenCallIsActiveProvider, uploadConfig.disableUploadWhenCallIsActiveProvider);
    }

    public final boolean getCompressContent() {
        Boolean bool;
        k56 k56Var = this.compressContentProvider;
        if (k56Var == null || (bool = (Boolean) k56Var.invoke()) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final k56 getCompressContentProvider() {
        return this.compressContentProvider;
    }

    public final boolean getDisableUploadWhenCallIsActive() {
        Boolean bool;
        k56 k56Var = this.disableUploadWhenCallIsActiveProvider;
        if (k56Var == null || (bool = (Boolean) k56Var.invoke()) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final k56 getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final int getEventCountToUploadNumber() {
        Integer num;
        k56 k56Var = this.maxEventCountProvider;
        if (k56Var == null || (num = (Integer) k56Var.invoke()) == null) {
            return 500;
        }
        return num.intValue();
    }

    public final int getFileLengthTriggerToUploadBytes() {
        Integer num;
        k56 k56Var = this.maxFileLengthKbProvider;
        return ((k56Var == null || (num = (Integer) k56Var.invoke()) == null) ? 100 : num.intValue()) * 1000;
    }

    public final k56 getMaxEventCountProvider() {
        return this.maxEventCountProvider;
    }

    public final k56 getMaxFileLengthKbProvider() {
        return this.maxFileLengthKbProvider;
    }

    public final int getMaxLocalCacheFileCount() {
        Integer num;
        k56 k56Var = this.maxLocalCacheFileCountProvider;
        if (k56Var == null || (num = (Integer) k56Var.invoke()) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final k56 getMaxLocalCacheFileCountProvider() {
        return this.maxLocalCacheFileCountProvider;
    }

    public final long getMaxTimeToUploadMillis() {
        return this.maxTimeToUploadMillis;
    }

    public final long getSilenceToUploadMillis() {
        return this.silenceToUploadMillis;
    }

    public final Long getTimeToUploadNextMs() {
        k56 k56Var = this.timeToUploadNextMsProvider;
        if (k56Var != null) {
            return (Long) k56Var.invoke();
        }
        return null;
    }

    public final k56 getTimeToUploadNextMsProvider() {
        return this.timeToUploadNextMsProvider;
    }

    public final Executor getUploadExecutor() {
        return this.uploadExecutor;
    }

    public final int getUploadJobId() {
        return this.uploadJobId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.uploadJobId) * 31;
        Executor executor = this.uploadExecutor;
        int iM = h4f.m(h4f.m((iHashCode + (executor == null ? 0 : executor.hashCode())) * 31, 31, this.maxTimeToUploadMillis), 31, this.silenceToUploadMillis);
        k56 k56Var = this.maxFileLengthKbProvider;
        int iHashCode2 = (iM + (k56Var == null ? 0 : k56Var.hashCode())) * 31;
        k56 k56Var2 = this.maxEventCountProvider;
        int iHashCode3 = (iHashCode2 + (k56Var2 == null ? 0 : k56Var2.hashCode())) * 31;
        k56 k56Var3 = this.maxLocalCacheFileCountProvider;
        int iHashCode4 = (iHashCode3 + (k56Var3 == null ? 0 : k56Var3.hashCode())) * 31;
        k56 k56Var4 = this.timeToUploadNextMsProvider;
        int iHashCode5 = (iHashCode4 + (k56Var4 == null ? 0 : k56Var4.hashCode())) * 31;
        k56 k56Var5 = this.compressContentProvider;
        int iHashCode6 = (iHashCode5 + (k56Var5 == null ? 0 : k56Var5.hashCode())) * 31;
        k56 k56Var6 = this.disableUploadWhenCallIsActiveProvider;
        return iHashCode6 + (k56Var6 != null ? k56Var6.hashCode() : 0);
    }

    public String toString() {
        int i = this.uploadJobId;
        Executor executor = this.uploadExecutor;
        long j = this.maxTimeToUploadMillis;
        long j2 = this.silenceToUploadMillis;
        k56 k56Var = this.maxFileLengthKbProvider;
        k56 k56Var2 = this.maxEventCountProvider;
        k56 k56Var3 = this.maxLocalCacheFileCountProvider;
        k56 k56Var4 = this.timeToUploadNextMsProvider;
        k56 k56Var5 = this.compressContentProvider;
        k56 k56Var6 = this.disableUploadWhenCallIsActiveProvider;
        StringBuilder sb = new StringBuilder("UploadConfig(uploadJobId=");
        sb.append(i);
        sb.append(", uploadExecutor=");
        sb.append(executor);
        sb.append(", maxTimeToUploadMillis=");
        sb.append(j);
        au1.q(j2, ", silenceToUploadMillis=", ", maxFileLengthKbProvider=", sb);
        sb.append(k56Var);
        sb.append(", maxEventCountProvider=");
        sb.append(k56Var2);
        sb.append(", maxLocalCacheFileCountProvider=");
        sb.append(k56Var3);
        sb.append(", timeToUploadNextMsProvider=");
        sb.append(k56Var4);
        sb.append(", compressContentProvider=");
        sb.append(k56Var5);
        sb.append(", disableUploadWhenCallIsActiveProvider=");
        sb.append(k56Var6);
        sb.append(")");
        return sb.toString();
    }

    public UploadConfig(int i, Executor executor, long j, long j2, k56 k56Var, k56 k56Var2, k56 k56Var3, k56 k56Var4, k56 k56Var5, k56 k56Var6) {
        this.uploadJobId = i;
        this.uploadExecutor = executor;
        this.maxTimeToUploadMillis = j;
        this.silenceToUploadMillis = j2;
        this.maxFileLengthKbProvider = k56Var;
        this.maxEventCountProvider = k56Var2;
        this.maxLocalCacheFileCountProvider = k56Var3;
        this.timeToUploadNextMsProvider = k56Var4;
        this.compressContentProvider = k56Var5;
        this.disableUploadWhenCallIsActiveProvider = k56Var6;
    }

    public /* synthetic */ UploadConfig(int i, Executor executor, long j, long j2, k56 k56Var, k56 k56Var2, k56 k56Var3, k56 k56Var4, k56 k56Var5, k56 k56Var6, int i2, z84 z84Var) {
        this((i2 & 1) != 0 ? 3815413 : i, (i2 & 2) != 0 ? null : executor, (i2 & 4) != 0 ? Long.MAX_VALUE : j, (i2 & 8) != 0 ? 15000L : j2, (i2 & 16) != 0 ? null : k56Var, (i2 & 32) != 0 ? null : k56Var2, (i2 & 64) != 0 ? null : k56Var3, (i2 & 128) != 0 ? null : k56Var4, (i2 & 256) != 0 ? null : k56Var5, (i2 & 512) == 0 ? k56Var6 : null);
    }
}
