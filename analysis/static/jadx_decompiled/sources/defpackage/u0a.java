package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u0a extends AtomicReference implements f2a, zl4 {
    public static final t0a[] X = new t0a[0];
    public static final t0a[] Y = new t0a[0];
    public final AtomicReference b;
    public Throwable o;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicReference c = new AtomicReference();

    public u0a(AtomicReference atomicReference) {
        this.b = atomicReference;
        lazySet(X);
    }

    public final void a(t0a t0aVar) {
        t0a[] t0aVarArr;
        t0a[] t0aVarArr2;
        do {
            t0aVarArr = (t0a[]) get();
            int length = t0aVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (t0aVarArr[i] == t0aVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            t0aVarArr2 = X;
            if (length != 1) {
                t0aVarArr2 = new t0a[length - 1];
                System.arraycopy(t0aVarArr, 0, t0aVarArr2, 0, i);
                System.arraycopy(t0aVarArr, i + 1, t0aVarArr2, i, (length - i) - 1);
            }
        } while (!compareAndSet(t0aVarArr, t0aVarArr2));
    }

    @Override // defpackage.f2a
    public final void b() {
        this.c.lazySet(dm4.a);
        for (t0a t0aVar : (t0a[]) getAndSet(Y)) {
            t0aVar.a.b();
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        dm4.e(this.c, zl4Var);
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        for (t0a t0aVar : (t0a[]) get()) {
            t0aVar.a.e(obj);
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        AtomicReference atomicReference;
        getAndSet(Y);
        do {
            atomicReference = this.b;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        dm4.a(this.c);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() == Y;
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        AtomicReference atomicReference = this.c;
        Object obj = atomicReference.get();
        dm4 dm4Var = dm4.a;
        if (obj == dm4Var) {
            j47.Z(th);
            return;
        }
        this.o = th;
        atomicReference.lazySet(dm4Var);
        for (t0a t0aVar : (t0a[]) getAndSet(Y)) {
            t0aVar.a.onError(th);
        }
    }
}
