package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class m98 implements u98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w98 b;
    public final /* synthetic */ float c;

    public /* synthetic */ m98(w98 w98Var, float f, int i) {
        this.a = i;
        this.b = w98Var;
        this.c = f;
    }

    @Override // defpackage.u98
    public final void c(qr6 qr6Var, int i) {
        switch (this.a) {
            case 0:
                qr6Var.x(this.b.c, i, this.c);
                break;
            default:
                qr6Var.y(this.b.c, i, this.c);
                break;
        }
    }
}
