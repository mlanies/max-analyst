package com.facebook.common.time;

import android.os.SystemClock;
import defpackage.hc9;
import defpackage.pm4;
import java.util.concurrent.TimeUnit;

@pm4
/* loaded from: classes.dex */
public class RealtimeSinceBootClock implements hc9 {
    public static final RealtimeSinceBootClock a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @pm4
    public static RealtimeSinceBootClock get() {
        return a;
    }

    @Override // defpackage.hc9
    public final long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.hc9
    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
