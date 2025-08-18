package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mnb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vnb b;

    public /* synthetic */ mnb(vnb vnbVar, int i) {
        this.a = i;
        this.b = vnbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.S0 = true;
                break;
            case 1:
                this.b.u();
                break;
            default:
                vnb vnbVar = this.b;
                if (!vnbVar.Y0) {
                    xd8 xd8Var = vnbVar.C0;
                    xd8Var.getClass();
                    xd8Var.j(vnbVar);
                    break;
                }
                break;
        }
    }
}
