package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class iy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ py0 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ iy0(py0 py0Var, Runnable runnable, int i) {
        this.a = i;
        this.b = py0Var;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                py0 py0Var = this.b;
                py0Var.s0.post(new iy0(py0Var, this.c, 1));
                break;
            default:
                py0 py0Var2 = this.b;
                py0Var2.V0.log("OKRTCCall", "disabling enhancer");
                if (!py0Var2.A0) {
                    py0Var2.a1 = true;
                    py0Var2.F(new wq9(false, true, true, false, null, null, 0, 0, 0, 0, 0, false, null, 0));
                    Runnable runnable = this.c;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }
}
