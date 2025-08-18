package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class c70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e70 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c70(e70 e70Var, boolean z, int i) {
        this.a = i;
        this.b = e70Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e70 e70Var = this.b;
                int iS = au1.s(e70Var.g);
                if (iS != 0) {
                    if (iS == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                e70Var.b.set(null);
                e70Var.c.set(false);
                e70Var.g = 2;
                e70Var.a.execute(new c70(e70Var, this.c, 1));
                e70Var.d();
                return;
            default:
                e70 e70Var2 = this.b;
                int iS2 = au1.s(e70Var2.g);
                if (iS2 != 0 && iS2 != 1) {
                    if (iS2 == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                boolean z = e70Var2.r;
                boolean z2 = this.c;
                if (z == z2) {
                    return;
                }
                e70Var2.r = z2;
                if (e70Var2.g == 2) {
                    e70Var2.a();
                    return;
                }
                return;
        }
    }
}
