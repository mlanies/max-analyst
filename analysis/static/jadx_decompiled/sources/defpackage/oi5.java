package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class oi5 {
    public static final long[] h = {1, 2, 5, 10, 16};
    public final zy a;
    public final fd7 b;
    public final mi5 c;
    public nx3 f;
    public final AtomicReference d = new AtomicReference(null);
    public final Object e = new Object();
    public final je7 g = tu0.r(2, new es3(15, this));

    public oi5(zy zyVar, fd7 fd7Var, mi5 mi5Var) {
        this.a = zyVar;
        this.b = fd7Var;
        this.c = mi5Var;
    }

    public final void a(qi9 qi9Var) {
        nx3 nx3VarLimitedParallelism;
        synchronized (this.e) {
            try {
                fd7 fd7Var = this.b;
                if (fd7Var != null) {
                    fd7Var.G("schedule update");
                }
                this.d.set(qi9Var);
                if (this.f == null) {
                    try {
                        nx3VarLimitedParallelism = this.c.a().limitedParallelism(1, "file-prefs");
                    } catch (Throwable unused) {
                        nx3VarLimitedParallelism = null;
                    }
                    this.f = nx3VarLimitedParallelism;
                }
                nx3 nx3Var = this.f;
                if (nx3Var != null) {
                    nx3Var.mo20dispatch(hz4.a, (ni5) this.g.getValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
