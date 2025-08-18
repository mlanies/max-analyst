package defpackage;

import java.util.BitSet;

/* loaded from: classes2.dex */
public interface kfd extends ol7 {
    public static final yed V = yed.a;

    jqe b();

    bfd c();

    jqe d();

    hfd e();

    Integer f();

    jqe getTitle();

    default jfd getType() {
        return jfd.b;
    }

    @Override // defpackage.ol7
    default boolean h(ol7 ol7Var) {
        return getItemId() == ol7Var.getItemId();
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    default int getI0() {
        return 0;
    }

    @Override // defpackage.ol7
    default Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        ifd ifdVar = null;
        vfd vfdVar = ol7Var instanceof vfd ? (vfd) ol7Var : null;
        if (vfdVar != null) {
            ifdVar = new ifd(7);
            boolean z = u() != vfdVar.b;
            BitSet bitSet = (BitSet) ifdVar.b;
            bitSet.set(0, z);
            bitSet.set(1, !tpa.f(getTitle(), vfdVar.c));
            bitSet.set(2, getType() != vfdVar.o);
            bitSet.set(3, !tpa.f(b(), vfdVar.X));
            bitSet.set(4, !tpa.f(f(), vfdVar.Y));
            bitSet.set(5, !tpa.f(e(), vfdVar.Z));
            bitSet.set(6, !tpa.f(c(), vfdVar.s0));
            bitSet.set(7, !tpa.f(d(), vfdVar.t0));
            bitSet.set(8, q() != vfdVar.u0);
        }
        return ifdVar;
    }

    default int q() {
        return tu0.G(8 * fk4.d().getDisplayMetrics().density);
    }

    default wed s() {
        return null;
    }

    int u();
}
