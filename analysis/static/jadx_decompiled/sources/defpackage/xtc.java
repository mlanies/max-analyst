package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class xtc implements zl4 {
    public static long a(TimeUnit timeUnit) {
        return !ztc.a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public zl4 b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public abstract zl4 c(Runnable runnable, long j, TimeUnit timeUnit);

    public final zl4 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        uy1 uy1Var = new uy1(2);
        uy1 uy1Var2 = new uy1(uy1Var);
        long nanos = timeUnit.toNanos(j2);
        long jA = a(TimeUnit.NANOSECONDS);
        zl4 zl4VarC = c(new wtc(this, timeUnit.toNanos(j) + jA, runnable, jA, uy1Var2, nanos), j, timeUnit);
        if (zl4VarC == iz4.a) {
            return zl4VarC;
        }
        dm4.c(uy1Var, zl4VarC);
        return uy1Var2;
    }
}
