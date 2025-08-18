package defpackage;

/* loaded from: classes2.dex */
public final class iw9 extends li0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry1 b;

    public /* synthetic */ iw9(sy1 sy1Var, int i) {
        this.a = i;
        this.b = sy1Var;
    }

    @Override // defpackage.li0, defpackage.b34
    public final void d() {
        switch (this.a) {
            case 0:
                ry1 ry1Var = this.b;
                if (ry1Var.isActive()) {
                    ry1Var.cancel(new Throwable("Cancelled with fresco pipeline"));
                    break;
                }
                break;
            default:
                ry1 ry1Var2 = this.b;
                if (ry1Var2.isActive()) {
                    ry1Var2.cancel(new Throwable("Cancelled with fresco pipeline"));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.li0
    public final void e(g0 g0Var) {
        switch (this.a) {
            case 0:
                ry1 ry1Var = this.b;
                if (ry1Var.isActive()) {
                    ry1Var.resumeWith(new njc(new Throwable("Fetch failed", g0Var.c())));
                    break;
                }
                break;
            default:
                this.b.resumeWith(null);
                break;
        }
    }

    @Override // defpackage.li0
    public final void f(g0 g0Var) {
        switch (this.a) {
            case 0:
                ry1 ry1Var = this.b;
                if (ry1Var.isActive()) {
                    ry1Var.resumeWith(e5f.a);
                    break;
                }
                break;
            default:
                boolean zH = g0Var.h();
                ry1 ry1Var2 = this.b;
                if (!zH) {
                    ry1Var2.resumeWith(null);
                    break;
                } else {
                    o43 o43VarO = o43.o((o43) g0Var.e());
                    if (o43VarO != null) {
                        ry1Var2.resumeWith(o43VarO.e0());
                        break;
                    } else {
                        ry1Var2.resumeWith(null);
                        break;
                    }
                }
        }
    }
}
