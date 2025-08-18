package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class mge extends zu3 {
    public final String X;
    public final zu3 o;

    public mge() {
        this(0);
    }

    @Override // defpackage.zu3
    public final void a() {
        this.o.a();
    }

    @Override // defpackage.zu3
    public final void f(zu3 zu3Var, uu3 uu3Var) {
        this.o.f(zu3Var, uu3Var);
    }

    @Override // defpackage.zu3
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, xu3 xu3Var) {
        if (view == null && !z) {
            String str = this.X;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, "Already swiped controller manually, skip performChange", null);
            }
            xu3Var.q();
            return;
        }
        if (view != null || !z) {
            this.o.g(viewGroup, view, view2, z, xu3Var);
            return;
        }
        String str2 = this.X;
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.X, str2, "Showing controller without animation", null);
        }
        new gqd(true).g(viewGroup, view, view2, z, xu3Var);
    }

    @Override // defpackage.zu3
    public final void h(Bundle bundle) {
        this.o.h(bundle);
    }

    @Override // defpackage.zu3
    public final void i(Bundle bundle) {
        this.o.i(bundle);
    }

    public mge(int i) {
        this.o = new u18(0);
        this.X = mge.class.getName();
    }
}
