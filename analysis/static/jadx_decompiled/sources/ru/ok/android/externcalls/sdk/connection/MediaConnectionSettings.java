package ru.ok.android.externcalls.sdk.connection;

import defpackage.z84;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/connection/MediaConnectionSettings;", "", "noMediaReportTimeoutMs", "", "noIceConnectionReportTimeoutMs", "(JJ)V", "getNoIceConnectionReportTimeoutMs", "()J", "getNoMediaReportTimeoutMs", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaConnectionSettings {
    private final long noIceConnectionReportTimeoutMs;
    private final long noMediaReportTimeoutMs;

    public MediaConnectionSettings() {
        this(0L, 0L, 3, null);
    }

    public final long getNoIceConnectionReportTimeoutMs() {
        return this.noIceConnectionReportTimeoutMs;
    }

    public final long getNoMediaReportTimeoutMs() {
        return this.noMediaReportTimeoutMs;
    }

    public MediaConnectionSettings(long j, long j2) {
        this.noMediaReportTimeoutMs = j;
        this.noIceConnectionReportTimeoutMs = j2;
    }

    public /* synthetic */ MediaConnectionSettings(long j, long j2, int i, z84 z84Var) {
        this((i & 1) != 0 ? 3000L : j, (i & 2) != 0 ? 3000L : j2);
    }
}
