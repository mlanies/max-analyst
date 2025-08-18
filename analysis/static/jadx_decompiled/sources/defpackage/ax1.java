package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public interface ax1 extends fv1, k9f {
    @Override // defpackage.fv1
    default yw1 a() {
        return p();
    }

    default void b(yv1 yv1Var) {
    }

    default boolean d() {
        return p().g() == 0;
    }

    ry9 f();

    hw1 g();

    default yv1 h() {
        return bw1.a;
    }

    default void j(boolean z) {
    }

    void k(Collection collection);

    void l(ArrayList arrayList);

    default boolean n() {
        return true;
    }

    default void o(boolean z) {
    }

    yw1 p();
}
