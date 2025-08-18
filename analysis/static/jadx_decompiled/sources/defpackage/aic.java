package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class aic implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bic b;

    public /* synthetic */ aic(bic bicVar, int i) {
        this.a = i;
        this.b = bicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gb0 gb0Var = this.b.c;
                if (((bic) gb0Var.g) != null) {
                    gb0Var.b();
                    break;
                }
                break;
            default:
                gb0 gb0Var2 = this.b.c;
                if (((bic) gb0Var2.g) != null && (gb0Var2.b & 3) != 0) {
                    gb0Var2.b();
                    break;
                }
                break;
        }
    }
}
