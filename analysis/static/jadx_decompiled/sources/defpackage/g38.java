package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g38 implements b38 {
    public final /* synthetic */ int a = 0;
    public final AtomicReference b;
    public final b38 c;

    public g38(b38 b38Var, AtomicReference atomicReference) {
        this.c = b38Var;
        this.b = atomicReference;
    }

    @Override // defpackage.b38, defpackage.erd
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.c.a(obj);
                break;
            default:
                this.c.a(obj);
                break;
        }
    }

    @Override // defpackage.b38, defpackage.ab3
    public final void b() {
        switch (this.a) {
            case 0:
                this.c.b();
                break;
            default:
                this.c.b();
                break;
        }
    }

    @Override // defpackage.b38, defpackage.erd
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                dm4.e(this.b, zl4Var);
                break;
            default:
                dm4.c(this.b, zl4Var);
                break;
        }
    }

    @Override // defpackage.b38, defpackage.erd
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.c.onError(th);
                break;
            default:
                this.c.onError(th);
                break;
        }
    }

    public g38(AtomicReference atomicReference, b38 b38Var) {
        this.b = atomicReference;
        this.c = b38Var;
    }
}
