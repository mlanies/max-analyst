package defpackage;

/* loaded from: classes.dex */
public abstract class li0 implements b34 {
    @Override // defpackage.b34
    public final void a(g0 g0Var) {
        boolean zH = g0Var.h();
        try {
            f(g0Var);
        } finally {
            if (zH) {
                g0Var.a();
            }
        }
    }

    @Override // defpackage.b34
    public void b(g0 g0Var) {
    }

    @Override // defpackage.b34
    public final void c(g0 g0Var) {
        try {
            e(g0Var);
        } finally {
            g0Var.a();
        }
    }

    @Override // defpackage.b34
    public void d() {
    }

    public abstract void e(g0 g0Var);

    public abstract void f(g0 g0Var);
}
