package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d1a extends AtomicReference implements f2a, zl4 {
    public static final a1a[] Y = new a1a[0];
    public static final a1a[] Z = new a1a[0];
    public final AtomicReference X;
    public final c1a a;
    public boolean b;
    public final AtomicReference c = new AtomicReference(Y);
    public final AtomicBoolean o = new AtomicBoolean();

    public d1a(c1a c1aVar, AtomicReference atomicReference) {
        this.a = c1aVar;
        this.X = atomicReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(a1a a1aVar) {
        a1a[] a1aVarArr;
        while (true) {
            AtomicReference atomicReference = this.c;
            a1a[] a1aVarArr2 = (a1a[]) atomicReference.get();
            int length = a1aVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (a1aVarArr2[i].equals(a1aVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                a1aVarArr = Y;
            } else {
                a1a[] a1aVarArr3 = new a1a[length - 1];
                System.arraycopy(a1aVarArr2, 0, a1aVarArr3, 0, i);
                System.arraycopy(a1aVarArr2, i + 1, a1aVarArr3, i, (length - i) - 1);
                a1aVarArr = a1aVarArr3;
            }
            while (!atomicReference.compareAndSet(a1aVarArr2, a1aVarArr)) {
                if (atomicReference.get() != a1aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.f2a
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        c1a c1aVar = this.a;
        c1aVar.a();
        for (a1a a1aVar : (a1a[]) this.c.getAndSet(Z)) {
            c1aVar.c(a1aVar);
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.e(this, zl4Var)) {
            for (a1a a1aVar : (a1a[]) this.c.get()) {
                this.a.c(a1aVar);
            }
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (this.b) {
            return;
        }
        c1a c1aVar = this.a;
        c1aVar.b(obj);
        for (a1a a1aVar : (a1a[]) this.c.get()) {
            c1aVar.c(a1aVar);
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        AtomicReference atomicReference;
        this.c.set(Z);
        do {
            atomicReference = this.X;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        dm4.a(this);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.c.get() == Z;
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.b) {
            j47.Z(th);
            return;
        }
        this.b = true;
        c1a c1aVar = this.a;
        c1aVar.d(th);
        for (a1a a1aVar : (a1a[]) this.c.getAndSet(Z)) {
            c1aVar.c(a1aVar);
        }
    }
}
