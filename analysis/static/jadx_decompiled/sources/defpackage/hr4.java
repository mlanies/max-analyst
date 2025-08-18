package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hr4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr4 b;
    public final /* synthetic */ nr4 c;

    public /* synthetic */ hr4(lr4 lr4Var, nr4 nr4Var, int i) {
        this.a = i;
        this.b = lr4Var;
        this.c = nr4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lr4 lr4Var = this.b;
                this.c.H(lr4Var.a, lr4Var.b);
                break;
            case 1:
                lr4 lr4Var2 = this.b;
                this.c.C(lr4Var2.a, lr4Var2.b);
                break;
            case 2:
                lr4 lr4Var3 = this.b;
                this.c.z(lr4Var3.a, lr4Var3.b);
                break;
            default:
                lr4 lr4Var4 = this.b;
                this.c.D(lr4Var4.a, lr4Var4.b);
                break;
        }
    }
}
