package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class vd3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(vd3.class, "load$volatile");
    public final int a;
    public final int b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public final /* synthetic */ AtomicReferenceArray e;
    public final /* synthetic */ yd3 f;
    private volatile /* synthetic */ int load$volatile;

    public vd3(yd3 yd3Var, int i) {
        this.f = yd3Var;
        this.a = i;
        this.b = Integer.numberOfLeadingZeros(i) + 1;
        this.c = (i * 2) / 3;
        this.d = new AtomicReferenceArray(i);
        this.e = new AtomicReferenceArray(i);
    }

    public final Object a(Object obj, Object obj2, ui6 ui6Var) {
        int i;
        int iHashCode = (obj.hashCode() * (-1640531527)) >>> this.b;
        boolean z = false;
        loop0: while (true) {
            AtomicReferenceArray atomicReferenceArray = this.d;
            ui6 ui6Var2 = (ui6) atomicReferenceArray.get(iHashCode);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            if (ui6Var2 == null) {
                if (obj2 != null) {
                    if (!z) {
                        do {
                            i = atomicIntegerFieldUpdater.get(this);
                            if (i >= this.c) {
                                return zd3.a;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    boolean z2 = z;
                    if (ui6Var == null) {
                        ui6Var = new ui6(obj, this.f.a);
                        obj.hashCode();
                    }
                    ui6 ui6Var3 = ui6Var;
                    while (!atomicReferenceArray.compareAndSet(iHashCode, null, ui6Var3)) {
                        if (atomicReferenceArray.get(iHashCode) != null) {
                            z = z2;
                            ui6Var = ui6Var3;
                        }
                    }
                    break loop0;
                }
                return null;
            }
            Object obj3 = ui6Var2.get();
            if (!obj.equals(obj3)) {
                if (obj3 == null) {
                    c(iHashCode);
                }
                if (iHashCode == 0) {
                    iHashCode = this.a;
                }
                iHashCode--;
            } else if (z) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
            }
        }
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = this.e;
            Object obj4 = atomicReferenceArray2.get(iHashCode);
            if (obj4 instanceof a08) {
                return zd3.a;
            }
            while (!atomicReferenceArray2.compareAndSet(iHashCode, obj4, obj2)) {
                if (atomicReferenceArray2.get(iHashCode) != obj4) {
                    break;
                }
            }
            return obj4;
        }
    }

    public final vd3 b() {
        int i;
        Object obj;
        a08 a08Var;
        while (true) {
            yd3 yd3Var = this.f;
            int size = yd3Var.size();
            if (size < 4) {
                size = 4;
            }
            vd3 vd3Var = new vd3(yd3Var, Integer.highestOneBit(size) * 4);
            while (i < this.a) {
                ui6 ui6Var = (ui6) this.d.get(i);
                Object obj2 = ui6Var != null ? ui6Var.get() : null;
                if (ui6Var != null && obj2 == null) {
                    c(i);
                }
                while (true) {
                    AtomicReferenceArray atomicReferenceArray = this.e;
                    obj = atomicReferenceArray.get(i);
                    if (!(obj instanceof a08)) {
                        if (obj == null) {
                            a08Var = zd3.b;
                        } else {
                            Symbol symbol = zd3.a;
                            a08Var = obj.equals(Boolean.TRUE) ? zd3.c : new a08(obj);
                        }
                        while (!atomicReferenceArray.compareAndSet(i, obj, a08Var)) {
                            if (atomicReferenceArray.get(i) != obj) {
                                break;
                            }
                        }
                        break;
                    }
                    obj = ((a08) obj).a;
                    break;
                }
                i = (obj2 == null || obj == null || vd3Var.a(obj2, obj, ui6Var) != zd3.a) ? i + 1 : 0;
            }
            return vd3Var;
        }
    }

    public final void c(int i) {
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.e;
            Object obj = atomicReferenceArray.get(i);
            if (obj == null || (obj instanceof a08)) {
                return;
            }
            while (!atomicReferenceArray.compareAndSet(i, obj, null)) {
                if (atomicReferenceArray.get(i) != obj) {
                    break;
                }
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = yd3.b;
            yd3 yd3Var = this.f;
            yd3Var.getClass();
            yd3.b.decrementAndGet(yd3Var);
            return;
        }
    }
}
