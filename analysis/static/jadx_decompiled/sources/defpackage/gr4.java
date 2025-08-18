package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class gr4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr4 b;
    public final /* synthetic */ mr4 c;

    public /* synthetic */ gr4(kr4 kr4Var, mr4 mr4Var, int i) {
        this.a = i;
        this.b = kr4Var;
        this.c = mr4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kr4 kr4Var = this.b;
                this.c.B(kr4Var.a, kr4Var.b);
                break;
            case 1:
                kr4 kr4Var2 = this.b;
                this.c.K(kr4Var2.a, kr4Var2.b);
                break;
            case 2:
                kr4 kr4Var3 = this.b;
                this.c.I(kr4Var3.a, kr4Var3.b);
                break;
            default:
                kr4 kr4Var4 = this.b;
                this.c.v(kr4Var4.a, kr4Var4.b);
                break;
        }
    }
}
