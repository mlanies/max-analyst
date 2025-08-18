package defpackage;

/* loaded from: classes.dex */
public final class za3 extends pa3 {
    public final /* synthetic */ int a;
    public final pa3 b;
    public final ztc c;

    public /* synthetic */ za3(pa3 pa3Var, ztc ztcVar, int i) {
        this.a = i;
        this.b = pa3Var;
        this.c = ztcVar;
    }

    @Override // defpackage.pa3
    public final void j(ab3 ab3Var) {
        switch (this.a) {
            case 0:
                this.b.i(new ya3(ab3Var, this.c));
                break;
            default:
                ya3 ya3Var = new ya3(ab3Var, this.b);
                ab3Var.c(ya3Var);
                zl4 zl4VarB = this.c.b(ya3Var);
                uy1 uy1Var = (uy1) ya3Var.c;
                uy1Var.getClass();
                dm4.c(uy1Var, zl4VarB);
                break;
        }
    }
}
