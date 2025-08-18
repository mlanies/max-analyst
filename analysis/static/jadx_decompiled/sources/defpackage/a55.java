package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a55 extends AtomicReference implements Runnable, zl4 {
    public final uy1 a;
    public final uy1 b;

    public a55(Runnable runnable) {
        super(runnable);
        this.a = new uy1(2);
        this.b = new uy1(2);
    }

    @Override // defpackage.zl4
    public final void g() {
        if (getAndSet(null) != null) {
            uy1 uy1Var = this.a;
            uy1Var.getClass();
            dm4.a(uy1Var);
            uy1 uy1Var2 = this.b;
            uy1Var2.getClass();
            dm4.a(uy1Var2);
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() == null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uy1 uy1Var = this.b;
        uy1 uy1Var2 = this.a;
        dm4 dm4Var = dm4.a;
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                try {
                    runnable.run();
                    lazySet(null);
                    uy1Var2.lazySet(dm4Var);
                    uy1Var.lazySet(dm4Var);
                } catch (Throwable th) {
                    lazySet(null);
                    uy1Var2.lazySet(dm4Var);
                    uy1Var.lazySet(dm4Var);
                    throw th;
                }
            } catch (Throwable th2) {
                j47.Z(th2);
                throw th2;
            }
        }
    }
}
