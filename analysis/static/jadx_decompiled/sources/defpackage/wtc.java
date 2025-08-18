package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class wtc implements Runnable {
    public long X;
    public long Y;
    public final /* synthetic */ xtc Z;
    public final Runnable a;
    public final uy1 b;
    public final long c;
    public long o;

    public wtc(xtc xtcVar, long j, Runnable runnable, long j2, uy1 uy1Var, long j3) {
        this.Z = xtcVar;
        this.a = runnable;
        this.b = uy1Var;
        this.c = j3;
        this.X = j2;
        this.Y = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        this.a.run();
        uy1 uy1Var = this.b;
        if (uy1Var.h()) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        xtc xtcVar = this.Z;
        xtcVar.getClass();
        long jA = xtc.a(timeUnit);
        long j2 = ztc.b;
        long j3 = jA + j2;
        long j4 = this.X;
        long j5 = this.c;
        if (j3 < j4 || jA >= j4 + j5 + j2) {
            j = jA + j5;
            long j6 = this.o + 1;
            this.o = j6;
            this.Y = j - (j5 * j6);
        } else {
            long j7 = this.Y;
            long j8 = this.o + 1;
            this.o = j8;
            j = (j8 * j5) + j7;
        }
        this.X = jA;
        dm4.c(uy1Var, xtcVar.c(this, j - jA, timeUnit));
    }
}
