package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bk8 implements Runnable {
    public final /* synthetic */ pc8 X;
    public final /* synthetic */ int a;
    public final /* synthetic */ gk8 b;
    public final /* synthetic */ hk8 c;
    public final /* synthetic */ xn7 o;

    public /* synthetic */ bk8(gk8 gk8Var, hk8 hk8Var, xn7 xn7Var, pc8 pc8Var, int i) {
        this.a = i;
        this.b = gk8Var;
        this.c = hk8Var;
        this.o = xn7Var;
        this.X = pc8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gk8 gk8Var = this.b;
                this.c.N(gk8Var.b, (xj8) gk8Var.c, this.o, this.X);
                break;
            case 1:
                gk8 gk8Var2 = this.b;
                this.c.M(gk8Var2.b, (xj8) gk8Var2.c, this.o, this.X);
                break;
            default:
                gk8 gk8Var3 = this.b;
                this.c.b(gk8Var3.b, (xj8) gk8Var3.c, this.o, this.X);
                break;
        }
    }
}
