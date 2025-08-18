package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class g26 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h26 b;

    public /* synthetic */ g26(h26 h26Var, int i) {
        this.a = i;
        this.b = h26Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        h26 h26Var = this.b;
        switch (i) {
            case 0:
                h26Var.t0 = false;
                if (h26Var.Y != null) {
                    h26Var.Y.stopCapture();
                }
                h26Var.u0 = false;
                break;
            default:
                h26Var.t0 = false;
                if (h26Var.Y != null) {
                    h26Var.Y.stopCapture();
                }
                h26Var.Y = null;
                h26Var.u0 = false;
                if (h26Var.X != null) {
                    h26Var.X.dispose();
                }
                h26Var.X = null;
                break;
        }
    }
}
