package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h1a extends vg3 {
    public final r1a a;
    public final AtomicReference b;
    public final z0a c;
    public final r1a o;

    public h1a(e1a e1aVar, r1a r1aVar, AtomicReference atomicReference, z0a z0aVar) {
        this.o = e1aVar;
        this.a = r1aVar;
        this.b = atomicReference;
        this.c = z0aVar;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        this.o.a(f2aVar);
    }

    @Override // defpackage.vg3
    public final void x(w0a w0aVar) {
        d1a d1aVar;
        loop0: while (true) {
            AtomicReference atomicReference = this.b;
            d1aVar = (d1a) atomicReference.get();
            if (d1aVar != null && !d1aVar.h()) {
                break;
            }
            d1a d1aVar2 = new d1a(this.c.call(), atomicReference);
            while (!atomicReference.compareAndSet(d1aVar, d1aVar2)) {
                if (atomicReference.get() != d1aVar) {
                    break;
                }
            }
            d1aVar = d1aVar2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = d1aVar.o;
        boolean z = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            w0aVar.accept(d1aVar);
            if (z) {
                this.a.a(d1aVar);
            }
        } catch (Throwable th) {
            c37.B(th);
            if (z) {
                atomicBoolean.compareAndSet(true, false);
            }
            c37.B(th);
            throw q45.f(th);
        }
    }

    @Override // defpackage.vg3
    public final void y() {
        AtomicReference atomicReference = this.b;
        d1a d1aVar = (d1a) atomicReference.get();
        if (d1aVar == null || !d1aVar.h()) {
            return;
        }
        while (!atomicReference.compareAndSet(d1aVar, null) && atomicReference.get() == d1aVar) {
        }
    }
}
