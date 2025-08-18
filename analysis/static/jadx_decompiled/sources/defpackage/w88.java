package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class w88 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i98 b;
    public final /* synthetic */ a98 c;

    public /* synthetic */ w88(i98 i98Var, a98 a98Var, int i) {
        this.a = i;
        this.b = i98Var;
        this.c = a98Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i98 i98Var = this.b;
                a98 a98Var = this.c;
                i98Var.t0 = a98Var;
                if (a98Var != null && i98Var.u0) {
                    i98Var.l(a98Var);
                }
                i98Var.d(new w88(i98Var, a98Var, 1), new xq1(1, i98Var));
                break;
            default:
                i98 i98Var2 = this.b;
                a98 a98Var2 = this.c;
                if (i98Var2.a instanceof q0) {
                    a98Var2.release();
                    break;
                }
                break;
        }
    }
}
