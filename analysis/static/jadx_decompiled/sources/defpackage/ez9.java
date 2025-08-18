package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ez9 extends AtomicReference implements uz9, zl4, erd {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ez9(AtomicInteger atomicInteger, int i) {
        this.a = i;
        this.b = atomicInteger;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
    @Override // defpackage.erd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez9.a(java.lang.Object):void");
    }

    public void b() {
        if (h()) {
            return;
        }
        try {
            ((f2a) this.b).b();
        } finally {
            dm4.a(this);
        }
    }

    @Override // defpackage.erd
    public void c(zl4 zl4Var) {
        switch (this.a) {
            case 1:
                dm4.e(this, zl4Var);
                break;
            default:
                dm4.e(this, zl4Var);
                break;
        }
    }

    public void d(Object obj) {
        if (obj != null) {
            if (h()) {
                return;
            }
            ((f2a) this.b).e(obj);
        } else {
            NullPointerException nullPointerExceptionB = q45.b("onNext called with a null value.");
            if (e(nullPointerExceptionB)) {
                return;
            }
            j47.Z(nullPointerExceptionB);
        }
    }

    public boolean e(Throwable th) {
        if (h()) {
            return false;
        }
        try {
            ((f2a) this.b).onError(th);
            dm4.a(this);
            return true;
        } catch (Throwable th2) {
            dm4.a(this);
            throw th2;
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                dm4.a(this);
                break;
            case 1:
                dm4.a(this);
                break;
            default:
                dm4.a(this);
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
        }
        return dm4.b((zl4) get());
    }

    @Override // defpackage.erd
    public void onError(Throwable th) {
        switch (this.a) {
            case 1:
                kr5 kr5Var = (kr5) this.b;
                hc3 hc3Var = kr5Var.X;
                hc3Var.c(this);
                if (kr5Var.Z.a(th)) {
                    if (!kr5Var.b) {
                        kr5Var.u0.cancel();
                        hc3Var.g();
                    } else if (kr5Var.c != Integer.MAX_VALUE) {
                        kr5Var.u0.j(1L);
                    }
                    kr5Var.Y.decrementAndGet();
                    kr5Var.c();
                    break;
                }
                break;
            default:
                d0a d0aVar = (d0a) this.b;
                hc3 hc3Var2 = d0aVar.o;
                hc3Var2.c(this);
                if (d0aVar.Y.a(th)) {
                    if (!d0aVar.c) {
                        d0aVar.t0.g();
                        hc3Var2.g();
                    }
                    d0aVar.X.decrementAndGet();
                    if (d0aVar.getAndIncrement() == 0) {
                        d0aVar.a();
                        break;
                    }
                }
                break;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.a) {
            case 0:
                return ez9.class.getSimpleName() + "{" + super.toString() + "}";
            default:
                return super.toString();
        }
    }

    public ez9(f2a f2aVar) {
        this.a = 0;
        this.b = f2aVar;
    }
}
