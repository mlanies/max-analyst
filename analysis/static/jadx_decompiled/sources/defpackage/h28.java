package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h28 extends AtomicInteger implements b38, xae {
    public final f38[] X;
    public int Y;
    public long Z;
    public final vae a;
    public final AtomicLong b = new AtomicLong();
    public final uy1 o = new uy1(2);
    public final AtomicReference c = new AtomicReference(hv9.a);

    public h28(vae vaeVar, f38[] f38VarArr) {
        this.a = vaeVar;
        this.X = f38VarArr;
    }

    @Override // defpackage.b38, defpackage.erd
    public final void a(Object obj) {
        this.c.lazySet(obj);
        d();
    }

    @Override // defpackage.b38, defpackage.ab3
    public final void b() {
        this.c.lazySet(hv9.a);
        d();
    }

    @Override // defpackage.b38, defpackage.erd
    public final void c(zl4 zl4Var) {
        uy1 uy1Var = this.o;
        uy1Var.getClass();
        dm4.c(uy1Var, zl4Var);
    }

    @Override // defpackage.xae
    public final void cancel() {
        uy1 uy1Var = this.o;
        uy1Var.getClass();
        dm4.a(uy1Var);
    }

    public final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.c;
        do {
            uy1 uy1Var = this.o;
            if (uy1Var.h()) {
                atomicReference.lazySet(null);
                return;
            }
            Object obj = atomicReference.get();
            if (obj != null) {
                hv9 hv9Var = hv9.a;
                vae vaeVar = this.a;
                if (obj != hv9Var) {
                    long j = this.Z;
                    if (j != this.b.get()) {
                        this.Z = j + 1;
                        atomicReference.lazySet(null);
                        vaeVar.e(obj);
                    }
                } else {
                    atomicReference.lazySet(null);
                }
                if (!uy1Var.h()) {
                    int i = this.Y;
                    f38[] f38VarArr = this.X;
                    if (i == f38VarArr.length) {
                        vaeVar.b();
                        return;
                    } else {
                        this.Y = i + 1;
                        f38VarArr[i].a(this);
                    }
                }
            }
        } while (decrementAndGet() != 0);
    }

    @Override // defpackage.xae
    public final void j(long j) {
        if (zae.d(j)) {
            ngg.b(this.b, j);
            d();
        }
    }

    @Override // defpackage.b38, defpackage.erd
    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
