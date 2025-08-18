package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class cue {
    public volatile long a;
    public volatile boolean c = false;
    public final jw4 b = new jw4();

    public final synchronized void a() {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (this.a == 0) {
            this.a = jElapsedRealtimeNanos;
            return;
        }
        long j = jElapsedRealtimeNanos - this.a;
        if (this.c) {
            this.b.a(j);
        } else {
            this.b.b = j;
            this.c = true;
        }
        this.a = jElapsedRealtimeNanos;
    }

    public final double b() {
        return TimeUnit.SECONDS.toNanos(1L) / this.b.b;
    }
}
