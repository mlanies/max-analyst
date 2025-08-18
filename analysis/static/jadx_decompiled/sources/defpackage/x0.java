package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class x0 extends tpa {
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;

    public x0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.c = atomicReferenceFieldUpdater;
        this.d = atomicReferenceFieldUpdater2;
        this.e = atomicReferenceFieldUpdater3;
        this.f = atomicReferenceFieldUpdater4;
        this.g = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.tpa
    public final void C(i1 i1Var, i1 i1Var2) {
        this.d.lazySet(i1Var, i1Var2);
    }

    @Override // defpackage.tpa
    public final void D(i1 i1Var, Thread thread) {
        this.c.lazySet(i1Var, thread);
    }

    @Override // defpackage.tpa
    public final boolean i(k1 k1Var, v0 v0Var, v0 v0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f;
            if (atomicReferenceFieldUpdater.compareAndSet(k1Var, v0Var, v0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k1Var) == v0Var);
        return false;
    }

    @Override // defpackage.tpa
    public final boolean j(k1 k1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(k1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k1Var) == obj);
        return false;
    }

    @Override // defpackage.tpa
    public final boolean k(k1 k1Var, i1 i1Var, i1 i1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(k1Var, i1Var, i1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k1Var) == i1Var);
        return false;
    }

    @Override // defpackage.tpa
    public final v0 p(k1 k1Var) {
        return (v0) this.f.getAndSet(k1Var, v0.d);
    }

    @Override // defpackage.tpa
    public final i1 q(k1 k1Var) {
        return (i1) this.e.getAndSet(k1Var, i1.c);
    }
}
