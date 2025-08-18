package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class j98 implements u98, km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w98 b;
    public final /* synthetic */ int c;

    public /* synthetic */ j98(w98 w98Var, int i, int i2) {
        this.a = i2;
        this.b = w98Var;
        this.c = i;
    }

    @Override // defpackage.u98
    public void c(qr6 qr6Var, int i) {
        switch (this.a) {
            case 0:
                qr6Var.Z(this.b.c, i, this.c);
                break;
            case 1:
            case 3:
            case 5:
            default:
                qr6Var.I(this.b.c, i, this.c);
                break;
            case 2:
                qr6Var.L(this.b.c, i, this.c);
                break;
            case 4:
                qr6Var.F(this.b.c, i, this.c);
                break;
            case 6:
                qr6Var.z0(this.b.c, i, this.c);
                break;
            case 7:
                qr6Var.n0(this.b.c, i, this.c);
                break;
        }
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        n3b n3bVar = (n3b) obj;
        switch (this.a) {
            case 1:
                n3bVar.i(this.c, this.b.n.s);
                break;
            case 2:
            case 4:
            case 6:
            case 7:
            default:
                n3bVar.i(this.c, this.b.n.s);
                break;
            case 3:
                n3bVar.i(this.c, this.b.n.s);
                break;
            case 5:
                n3bVar.i(this.c, this.b.n.s);
                break;
            case 8:
                n3bVar.i(this.c, this.b.n.s);
                break;
            case 9:
                n3bVar.i(this.c, this.b.n.s);
                break;
        }
    }
}
