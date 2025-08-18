package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class yd3 extends s2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(yd3.class, "_size$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(yd3.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public final ReferenceQueue a;
    private volatile /* synthetic */ Object core$volatile = new vd3(this, 16);

    public yd3(boolean z) {
        this.a = z ? new ReferenceQueue() : null;
    }

    public final synchronized Object a(Object obj, Object obj2) {
        Object objA;
        vd3 vd3VarB = (vd3) c.get(this);
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vd3.g;
            objA = vd3VarB.a(obj, obj2, null);
            if (objA == zd3.a) {
                vd3VarB = vd3VarB.b();
                c.set(this, vd3VarB);
            }
        }
        return objA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Iterator it = ((xd3) keySet()).iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        vd3 vd3Var = (vd3) c.get(this);
        vd3Var.getClass();
        int iHashCode = (obj.hashCode() * (-1640531527)) >>> vd3Var.b;
        while (true) {
            ui6 ui6Var = (ui6) vd3Var.d.get(iHashCode);
            if (ui6Var == null) {
                return null;
            }
            Object obj2 = ui6Var.get();
            if (obj.equals(obj2)) {
                Object obj3 = vd3Var.e.get(iHashCode);
                if (obj3 instanceof a08) {
                    obj3 = ((a08) obj3).a;
                }
                return obj3;
            }
            if (obj2 == null) {
                vd3Var.c(iHashCode);
            }
            if (iHashCode == 0) {
                iHashCode = vd3Var.a;
            }
            iHashCode--;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        vd3 vd3Var = (vd3) c.get(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vd3.g;
        Object objA = vd3Var.a(obj, obj2, null);
        if (objA == zd3.a) {
            objA = a(obj, obj2);
        }
        if (objA == null) {
            b.incrementAndGet(this);
        }
        return objA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        vd3 vd3Var = (vd3) c.get(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vd3.g;
        Object objA = vd3Var.a(obj, null, null);
        if (objA == zd3.a) {
            objA = a(obj, null);
        }
        if (objA != null) {
            b.decrementAndGet(this);
        }
        return objA;
    }
}
