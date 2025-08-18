package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v0a extends vg3 {
    public final r1a a;
    public final AtomicReference b = new AtomicReference();

    public v0a(xy9 xy9Var) {
        this.a = xy9Var;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        u0a u0aVar;
        t0a[] t0aVarArr;
        t0a[] t0aVarArr2;
        loop0: while (true) {
            AtomicReference atomicReference = this.b;
            u0aVar = (u0a) atomicReference.get();
            if (u0aVar != null) {
                break;
            }
            u0a u0aVar2 = new u0a(atomicReference);
            while (!atomicReference.compareAndSet(u0aVar, u0aVar2)) {
                if (atomicReference.get() != u0aVar) {
                    break;
                }
            }
            u0aVar = u0aVar2;
            break loop0;
        }
        t0a t0aVar = new t0a(f2aVar, u0aVar);
        f2aVar.c(t0aVar);
        do {
            t0aVarArr = (t0a[]) u0aVar.get();
            if (t0aVarArr == u0a.Y) {
                Throwable th = u0aVar.o;
                if (th != null) {
                    f2aVar.onError(th);
                    return;
                } else {
                    f2aVar.b();
                    return;
                }
            }
            int length = t0aVarArr.length;
            t0aVarArr2 = new t0a[length + 1];
            System.arraycopy(t0aVarArr, 0, t0aVarArr2, 0, length);
            t0aVarArr2[length] = t0aVar;
        } while (!u0aVar.compareAndSet(t0aVarArr, t0aVarArr2));
        if (t0aVar.h()) {
            u0aVar.a(t0aVar);
        }
    }

    @Override // defpackage.vg3
    public final void x(w0a w0aVar) {
        u0a u0aVar;
        loop0: while (true) {
            AtomicReference atomicReference = this.b;
            u0aVar = (u0a) atomicReference.get();
            if (u0aVar != null && !u0aVar.h()) {
                break;
            }
            u0a u0aVar2 = new u0a(atomicReference);
            while (!atomicReference.compareAndSet(u0aVar, u0aVar2)) {
                if (atomicReference.get() != u0aVar) {
                    break;
                }
            }
            u0aVar = u0aVar2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = u0aVar.a;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            w0aVar.accept(u0aVar);
            if (z) {
                this.a.a(u0aVar);
            }
        } catch (Throwable th) {
            c37.B(th);
            throw q45.f(th);
        }
    }

    @Override // defpackage.vg3
    public final void y() {
        AtomicReference atomicReference = this.b;
        u0a u0aVar = (u0a) atomicReference.get();
        if (u0aVar == null || !u0aVar.h()) {
            return;
        }
        while (!atomicReference.compareAndSet(u0aVar, null) && atomicReference.get() == u0aVar) {
        }
    }
}
