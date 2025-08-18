package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class l98 implements u98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w98 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ l98(w98 w98Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = w98Var;
        this.c = i;
        this.o = i2;
    }

    @Override // defpackage.u98
    public final void c(qr6 qr6Var, int i) {
        switch (this.a) {
            case 0:
                qr6Var.K(this.b.c, i, this.c, this.o);
                break;
            case 1:
                qr6Var.s(this.b.c, i, this.c, this.o);
                break;
            default:
                qr6Var.C0(this.b.c, i, this.c, this.o);
                break;
        }
    }
}
