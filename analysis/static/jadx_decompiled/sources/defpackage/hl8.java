package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class hl8 implements Runnable {
    public final m56 X;
    public final Handler a;
    public final h1f b;
    public final long c;
    public final long o;
    public final String Y = hl8.class.getName();
    public long Z = Long.MIN_VALUE;
    public int s0 = Integer.MIN_VALUE;
    public final fm5 t0 = new fm5(false);

    public hl8(Handler handler, h1f h1fVar, long j, long j2, wz7 wz7Var) {
        this.a = handler;
        this.b = h1fVar;
        this.c = j;
        this.o = j2;
        this.X = wz7Var;
    }

    public final void a() {
        String str = this.Y;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "cancel", null);
        }
        this.a.removeCallbacks(this);
        this.Z = Long.MIN_VALUE;
        this.s0 = Integer.MIN_VALUE;
    }

    public final void b() {
        String str = this.Y;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "start", null);
        }
        this.a.postDelayed(this, this.c);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h1f h1fVar = this.b;
        fm5 fm5Var = this.t0;
        int iD = h1fVar.d(fm5Var);
        long j = this.Z;
        if (j == Long.MIN_VALUE) {
            this.Z = jElapsedRealtime;
            if (iD == 2) {
                this.s0 = fm5Var.b;
            }
        } else {
            String str = this.Y;
            if (iD != 2 || (i = fm5Var.b) <= this.s0) {
                long j2 = jElapsedRealtime - j;
                if (j2 >= this.o) {
                    hm9.m0(str, "it seems media transform is stuck, ~ " + (j2 / 1000.0f) + " s", new Object[0]);
                }
            } else {
                this.Z = jElapsedRealtime;
                this.s0 = i;
                hm9.n(str, "media transform progress=" + i + "%");
                m56 m56Var = this.X;
                if (m56Var != null) {
                    m56Var.invoke(Float.valueOf(this.s0 / 100.0f));
                }
            }
        }
        this.a.postDelayed(this, this.c);
    }
}
