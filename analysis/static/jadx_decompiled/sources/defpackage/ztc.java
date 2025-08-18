package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class ztc {
    public static final boolean a = Boolean.getBoolean("rx3.scheduler.use-nanotime");
    public static final long b;

    static {
        long jLongValue = Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        b = "seconds".equalsIgnoreCase(property) ? TimeUnit.SECONDS.toNanos(jLongValue) : "milliseconds".equalsIgnoreCase(property) ? TimeUnit.MILLISECONDS.toNanos(jLongValue) : TimeUnit.MINUTES.toNanos(jLongValue);
    }

    public abstract xtc a();

    public zl4 b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        xtc xtcVarA = a();
        Objects.requireNonNull(runnable, "run is null");
        vtc vtcVar = new vtc(runnable, xtcVarA);
        xtcVarA.c(vtcVar, j, timeUnit);
        return vtcVar;
    }

    public zl4 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        xtc xtcVarA = a();
        Objects.requireNonNull(runnable, "run is null");
        bi6 bi6Var = new bi6(runnable, xtcVarA);
        zl4 zl4VarD = xtcVarA.d(bi6Var, j, j2, timeUnit);
        return zl4VarD == iz4.a ? zl4VarD : bi6Var;
    }
}
