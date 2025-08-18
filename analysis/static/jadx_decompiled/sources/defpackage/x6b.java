package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class x6b {
    public static final long a = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    public static final long b = SystemClock.elapsedRealtimeNanos();
}
