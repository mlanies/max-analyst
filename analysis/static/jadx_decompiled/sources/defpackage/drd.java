package defpackage;

/* loaded from: classes.dex */
public final class drd extends iqd {
    public final /* synthetic */ int a;
    public final iqd b;
    public final ztc c;

    public /* synthetic */ drd(iqd iqdVar, ztc ztcVar, int i) {
        this.a = i;
        this.b = iqdVar;
        this.c = ztcVar;
    }

    @Override // defpackage.iqd
    public final void l(erd erdVar) {
        switch (this.a) {
            case 0:
                this.b.k(new z28(erdVar, this.c, 1));
                break;
            default:
                ya3 ya3Var = new ya3(erdVar, this.b);
                erdVar.c(ya3Var);
                zl4 zl4VarB = this.c.b(ya3Var);
                uy1 uy1Var = (uy1) ya3Var.c;
                uy1Var.getClass();
                dm4.c(uy1Var, zl4VarB);
                break;
        }
    }
}
