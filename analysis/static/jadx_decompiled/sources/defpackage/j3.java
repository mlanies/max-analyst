package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class j3 extends mqd {
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;

    public j3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f = atomicReferenceFieldUpdater;
        this.g = atomicReferenceFieldUpdater2;
        this.h = atomicReferenceFieldUpdater3;
        this.i = atomicReferenceFieldUpdater4;
        this.j = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.mqd
    public final void B(l3 l3Var, l3 l3Var2) {
        this.g.lazySet(l3Var, l3Var2);
    }

    @Override // defpackage.mqd
    public final void C(l3 l3Var, Thread thread) {
        this.f.lazySet(l3Var, thread);
    }

    @Override // defpackage.mqd
    public final boolean c(m3 m3Var, i3 i3Var, i3 i3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(m3Var, i3Var, i3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(m3Var) == i3Var);
        return false;
    }

    @Override // defpackage.mqd
    public final boolean d(m3 m3Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(m3Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(m3Var) == obj);
        return false;
    }

    @Override // defpackage.mqd
    public final boolean e(m3 m3Var, l3 l3Var, l3 l3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(m3Var, l3Var, l3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(m3Var) == l3Var);
        return false;
    }
}
