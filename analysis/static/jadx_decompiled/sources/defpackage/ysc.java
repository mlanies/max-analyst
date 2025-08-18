package defpackage;

/* loaded from: classes.dex */
public final class ysc extends h0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
            this.c = null;
        } catch (Throwable th) {
            g();
            this.c = null;
            j47.Z(th);
            throw th;
        }
    }
}
