package defpackage;

import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class t8d extends d8d {
    public static long c;
    public static final /* synthetic */ int o = 0;
    public final boolean b;

    static {
        int i = ft4.o;
        c = 0L;
    }

    public t8d(boolean z) {
        this.b = z;
    }

    @Override // defpackage.d8d
    public final ExecutorService k(iba ibaVar, vi4 vi4Var) {
        ExecutorService executorServiceI = ibaVar.i(ibaVar.b().a(10, "logout"), "logout");
        executorServiceI.submit(new kc(11));
        return executorServiceI;
    }

    @Override // defpackage.d8d
    public final boolean v() {
        return true;
    }

    @Override // defpackage.d8d
    public final void x() {
        String name = t8d.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            int i = ft4.o;
            ir6Var.d(us7Var, name, "process ".concat(ft4.j(ft4.g(z7.S(System.nanoTime(), kt4.NANOSECONDS), c))), null);
        }
        int i2 = ft4.o;
        long jNanoTime = System.nanoTime();
        kt4 kt4Var = kt4.NANOSECONDS;
        long jS = z7.S(jNanoTime, kt4Var);
        e8d e8dVar = this.a;
        if (e8dVar == null) {
            e8dVar = null;
        }
        ((ku7) e8dVar.G.getValue()).a(this.b);
        t().c(new nu7());
        String name2 = t8d.class.getName();
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.X, name2, "process finish ".concat(ft4.j(ft4.g(z7.S(System.nanoTime(), kt4Var), jS))), null);
        }
    }
}
