package defpackage;

/* loaded from: classes.dex */
public final class f0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ b34 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ g0 o;

    public f0(g0 g0Var, boolean z, b34 b34Var, boolean z2) {
        this.o = g0Var;
        this.a = z;
        this.b = b34Var;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.a;
        g0 g0Var = this.o;
        b34 b34Var = this.b;
        if (z) {
            b34Var.c(g0Var);
        } else if (this.c) {
            b34Var.d();
        } else {
            b34Var.a(g0Var);
        }
    }
}
