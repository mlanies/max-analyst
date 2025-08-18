package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zy9 extends AtomicReference implements f2a {
    public final /* synthetic */ int a;
    public final f2a b;
    public final AtomicInteger c;

    public /* synthetic */ zy9(f2a f2aVar, AtomicInteger atomicInteger, int i) {
        this.a = i;
        this.b = f2aVar;
        this.c = atomicInteger;
    }

    @Override // defpackage.f2a
    public final void b() {
        switch (this.a) {
            case 0:
                az9 az9Var = (az9) this.c;
                az9Var.t0 = false;
                az9Var.a();
                break;
            default:
                bz9 bz9Var = (bz9) this.c;
                bz9Var.Z = false;
                bz9Var.a();
                break;
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                dm4.c(this, zl4Var);
                break;
            default:
                dm4.c(this, zl4Var);
                break;
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e(obj);
                break;
            default:
                this.b.e(obj);
                break;
        }
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                az9 az9Var = (az9) this.c;
                if (az9Var.o.a(th)) {
                    if (!az9Var.Y) {
                        az9Var.s0.g();
                    }
                    az9Var.t0 = false;
                    az9Var.a();
                    break;
                }
                break;
            default:
                ((bz9) this.c).g();
                this.b.onError(th);
                break;
        }
    }
}
