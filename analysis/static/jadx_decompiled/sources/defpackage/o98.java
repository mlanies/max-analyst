package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class o98 implements km7, u98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w98 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ o98(w98 w98Var, boolean z, int i) {
        this.a = i;
        this.b = w98Var;
        this.c = z;
    }

    @Override // defpackage.u98
    public void c(qr6 qr6Var, int i) {
        switch (this.a) {
            case 1:
                qr6Var.E0(this.b.c, i, this.c);
                break;
            case 2:
                qr6Var.w0(this.b.c, i, this.c);
                break;
            default:
                qr6Var.c0(this.b.c, i, this.c);
                break;
        }
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        n3b n3bVar = (n3b) obj;
        switch (this.a) {
            case 0:
                n3bVar.i(this.b.n.r, this.c);
                break;
            default:
                n3bVar.i(this.b.n.r, this.c);
                break;
        }
    }
}
