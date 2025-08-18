package defpackage;

/* loaded from: classes.dex */
public final class vtc implements zl4, Runnable {
    public final Runnable a;
    public final xtc b;
    public Thread c;

    public vtc(Runnable runnable, xtc xtcVar) {
        this.a = runnable;
        this.b = xtcVar;
    }

    @Override // defpackage.zl4
    public final void g() {
        if (this.c == Thread.currentThread()) {
            xtc xtcVar = this.b;
            if (xtcVar instanceof zp9) {
                zp9 zp9Var = (zp9) xtcVar;
                if (zp9Var.b) {
                    return;
                }
                zp9Var.b = true;
                zp9Var.a.shutdown();
                return;
            }
        }
        this.b.g();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.b.h();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
        } finally {
        }
    }
}
