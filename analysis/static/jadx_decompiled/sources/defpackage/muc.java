package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class muc {
    public static final trd a;
    public static final ld3 b;
    public static final u67 c;
    public static final u0f d;

    static {
        RuntimeException runtimeExceptionF;
        try {
            trd trdVar = luc.a;
            Objects.requireNonNull(trdVar, "Scheduler Supplier result can't be null");
            a = trdVar;
            try {
                ld3 ld3Var = iuc.a;
                Objects.requireNonNull(ld3Var, "Scheduler Supplier result can't be null");
                b = ld3Var;
                try {
                    u67 u67Var = juc.a;
                    Objects.requireNonNull(u67Var, "Scheduler Supplier result can't be null");
                    c = u67Var;
                    d = u0f.c;
                    try {
                        Objects.requireNonNull(kuc.a, "Scheduler Supplier result can't be null");
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ztc a() {
        ld3 ld3Var = b;
        b66 b66Var = j47.t0;
        if (b66Var == null) {
            return ld3Var;
        }
        try {
            return (ztc) b66Var.mo131apply(ld3Var);
        } catch (Throwable th) {
            throw q45.f(th);
        }
    }

    public static ztc b() {
        u67 u67Var = c;
        b66 b66Var = j47.v0;
        if (b66Var == null) {
            return u67Var;
        }
        try {
            return (ztc) b66Var.mo131apply(u67Var);
        } catch (Throwable th) {
            throw q45.f(th);
        }
    }
}
