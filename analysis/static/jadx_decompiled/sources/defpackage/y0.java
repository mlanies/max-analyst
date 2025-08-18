package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class y0 extends v3c {
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;

    public y0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.d = atomicReferenceFieldUpdater;
        this.e = atomicReferenceFieldUpdater2;
        this.f = atomicReferenceFieldUpdater3;
        this.g = atomicReferenceFieldUpdater4;
        this.h = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.v3c
    public final void C(j1 j1Var, j1 j1Var2) {
        this.e.lazySet(j1Var, j1Var2);
    }

    @Override // defpackage.v3c
    public final void D(j1 j1Var, Thread thread) {
        this.d.lazySet(j1Var, thread);
    }

    @Override // defpackage.v3c
    public final boolean c(l1 l1Var, w0 w0Var, w0 w0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(l1Var, w0Var, w0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l1Var) == w0Var);
        return false;
    }

    @Override // defpackage.v3c
    public final boolean d(l1 l1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(l1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l1Var) == obj);
        return false;
    }

    @Override // defpackage.v3c
    public final boolean e(l1 l1Var, j1 j1Var, j1 j1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f;
            if (atomicReferenceFieldUpdater.compareAndSet(l1Var, j1Var, j1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l1Var) == j1Var);
        return false;
    }
}
