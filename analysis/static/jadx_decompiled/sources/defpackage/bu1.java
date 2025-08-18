package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class bu1 {
    public long a;
    public long b;
    public Object c;

    public int a() {
        if (!((eu1) this.c).c()) {
            return 700;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.b == -1) {
            this.b = jUptimeMillis;
        }
        long j = jUptimeMillis - this.b;
        if (j <= 120000) {
            return 1000;
        }
        return j <= 300000 ? 2000 : 4000;
    }

    public int b() {
        boolean zC = ((eu1) this.c).c();
        long j = this.a;
        if (zC) {
            if (j > 0) {
                return Math.min((int) j, 1800000);
            }
            return 1800000;
        }
        if (j > 0) {
            return Math.min((int) j, 10000);
        }
        return 10000;
    }
}
