package defpackage;

/* loaded from: classes2.dex */
public final class l55 implements Runnable {
    public final Runnable a;
    public final g55 b;
    public final h55 c;

    public l55(Runnable runnable, g55 g55Var, h55 h55Var) {
        this.a = runnable;
        this.b = g55Var;
        this.c = h55Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h55 h55Var = this.c;
        long jA = this.b.a();
        try {
            this.a.run();
        } finally {
            h55Var.a(jA);
        }
    }
}
