package defpackage;

/* loaded from: classes2.dex */
public final class bf5 implements b34 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bf5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void e() {
    }

    private final void f(g0 g0Var) {
    }

    @Override // defpackage.b34
    public final void a(g0 g0Var) {
        switch (this.a) {
            case 0:
                ry1 ry1Var = (ry1) this.b;
                if (!ry1Var.isCancelled() && g0Var.h()) {
                    ry1Var.resumeWith(g0Var.e());
                    break;
                }
                break;
            default:
                boolean zF = g0Var.f();
                vjc vjcVar = (vjc) this.b;
                if (!zF) {
                    if (g0Var.h()) {
                        vjcVar.getClass();
                        break;
                    }
                } else if (g0Var == vjcVar.h) {
                    vjcVar.l(null, false, g0Var.a);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.b34
    public final void b(g0 g0Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                vjc vjcVar = (vjc) this.b;
                if (g0Var == vjcVar.h) {
                    vjcVar.k(g0Var.d());
                    break;
                }
                break;
        }
    }

    @Override // defpackage.b34
    public final void c(g0 g0Var) {
        switch (this.a) {
            case 0:
                ry1 ry1Var = (ry1) this.b;
                if (ry1Var.isActive()) {
                    Throwable thC = g0Var.c();
                    if (thC == null) {
                        thC = new IllegalStateException("fail");
                    }
                    ry1Var.resumeWith(new njc(thC));
                    break;
                }
                break;
            default:
                ((vjc) this.b).getClass();
                break;
        }
    }

    @Override // defpackage.b34
    public final void d() {
        switch (this.a) {
            case 0:
                ry1 ry1Var = (ry1) this.b;
                if (ry1Var.isActive()) {
                    ry1Var.cancel(null);
                    break;
                }
                break;
        }
    }
}
