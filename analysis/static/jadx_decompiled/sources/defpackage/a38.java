package defpackage;

/* loaded from: classes.dex */
public final class a38 extends n2 {
    public final /* synthetic */ int b;
    public final ztc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a38(f38 f38Var, ztc ztcVar, int i) {
        super(f38Var);
        this.b = i;
        this.c = ztcVar;
    }

    @Override // defpackage.f28
    public final void g(b38 b38Var) {
        switch (this.b) {
            case 0:
                this.a.a(new z28(b38Var, this.c, 0));
                break;
            default:
                iq1 iq1Var = new iq1(b38Var);
                b38Var.c(iq1Var);
                zl4 zl4VarB = this.c.b(new h76(iq1Var, 10, this.a));
                uy1 uy1Var = (uy1) iq1Var.b;
                uy1Var.getClass();
                dm4.c(uy1Var, zl4VarB);
                break;
        }
    }
}
