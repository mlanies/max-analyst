package defpackage;

/* loaded from: classes.dex */
public final class pz6 implements b34 {
    public final int a;
    public final /* synthetic */ qz6 b;

    public pz6(qz6 qz6Var, int i) {
        this.b = qz6Var;
        this.a = i;
    }

    @Override // defpackage.b34
    public final void a(g0 g0Var) {
        Throwable th;
        int i;
        if (!g0Var.f()) {
            if (g0Var.h()) {
                qz6.o(this.b, this.a, g0Var);
                return;
            }
            return;
        }
        qz6 qz6Var = this.b;
        int i2 = this.a;
        qz6Var.getClass();
        boolean zH = g0Var.h();
        synchronized (qz6Var) {
            try {
                int i3 = qz6Var.i;
                if (g0Var == qz6Var.r(i2) && i2 != qz6Var.i) {
                    if (qz6Var.s() == null || (zH && i2 < qz6Var.i)) {
                        qz6Var.i = i2;
                        i = i2;
                    } else {
                        i = i3;
                    }
                    while (i3 > i) {
                        g0 g0VarQ = qz6Var.q(i3);
                        if (g0VarQ != null) {
                            g0VarQ.a();
                        }
                        i3--;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (g0Var == qz6Var.s()) {
            qz6Var.l(null, i2 == 0 && g0Var.h(), g0Var.a);
        }
        if (qz6Var.k.incrementAndGet() != qz6Var.j || (th = qz6Var.l) == null) {
            return;
        }
        qz6Var.j(th, qz6Var.m);
    }

    @Override // defpackage.b34
    public final void b(g0 g0Var) {
        if (this.a == 0) {
            this.b.k(g0Var.d());
        }
    }

    @Override // defpackage.b34
    public final void c(g0 g0Var) {
        qz6.o(this.b, this.a, g0Var);
    }

    @Override // defpackage.b34
    public final void d() {
    }
}
