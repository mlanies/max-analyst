package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class bi6 implements Runnable, zl4 {
    public final /* synthetic */ int a = 0;
    public final Runnable b;
    public volatile boolean c;
    public final Object o;

    public bi6(Handler handler, Runnable runnable) {
        this.o = handler;
        this.b = runnable;
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                ((Handler) this.o).removeCallbacks(this);
                this.c = true;
                break;
            default:
                this.c = true;
                ((xtc) this.o).g();
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.run();
                    return;
                } catch (Throwable th) {
                    j47.Z(th);
                    return;
                }
            default:
                if (this.c) {
                    return;
                }
                try {
                    this.b.run();
                    return;
                } catch (Throwable th2) {
                    g();
                    j47.Z(th2);
                    throw th2;
                }
        }
    }

    public bi6(Runnable runnable, xtc xtcVar) {
        this.b = runnable;
        this.o = xtcVar;
    }
}
