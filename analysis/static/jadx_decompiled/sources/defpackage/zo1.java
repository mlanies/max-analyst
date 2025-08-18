package defpackage;

/* loaded from: classes.dex */
public final class zo1 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ap1 o;

    /* JADX WARN: Illegal instructions before constructor call */
    public zo1(ap1 ap1Var, int i) {
        this.c = i;
        switch (i) {
            case 1:
                this.o = ap1Var;
                super(9, (Object) null);
                break;
            default:
                yo1 yo1Var = yo1.b;
                this.o = ap1Var;
                super(9, yo1Var);
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (((yo1) obj) != ((yo1) obj2)) {
                    ap1.E(this.o);
                    break;
                }
                break;
            default:
                fka fkaVarJ = (fka) obj2;
                if (!tpa.f((fka) obj, fkaVarJ)) {
                    ap1 ap1Var = this.o;
                    if (fkaVarJ == null) {
                        fkaVarJ = qp4.u0.j(ap1Var);
                    }
                    ap1Var.onThemeChanged(fkaVarJ);
                    break;
                }
                break;
        }
    }
}
