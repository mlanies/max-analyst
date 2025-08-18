package defpackage;

/* loaded from: classes.dex */
public final class oc9 extends e1 implements Runnable {
    public final Runnable s0;

    public oc9(Runnable runnable) {
        runnable.getClass();
        this.s0 = runnable;
    }

    @Override // defpackage.k1
    public final String j() {
        return "task=[" + this.s0 + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.s0.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
