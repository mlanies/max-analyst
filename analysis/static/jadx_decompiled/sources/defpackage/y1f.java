package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class y1f extends zu3 {
    public boolean X;
    public xu3 Y;
    public boolean o;

    @Override // defpackage.zu3
    public final void a() {
        this.X = true;
    }

    @Override // defpackage.zu3
    public final boolean d() {
        return true;
    }

    @Override // defpackage.zu3
    public void f(zu3 zu3Var, uu3 uu3Var) {
        this.o = true;
    }

    @Override // defpackage.zu3
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, xu3 xu3Var) {
        this.Y = xu3Var;
        if (this.o) {
            xu3Var.q();
            return;
        }
        if (this.X) {
            k(viewGroup, view, view2, null, z);
            xu3Var.q();
        } else {
            gwe gweVar = new gwe(2, xu3Var);
            e2f e2fVarL = l(viewGroup, view, view2, z);
            e2fVarL.a(new x1f(this, viewGroup, gweVar));
            m(viewGroup, view, view2, e2fVarL, z, new i50(this, viewGroup, e2fVarL, view, view2, z, gweVar, 6));
        }
    }

    public void k(ViewGroup viewGroup, View view, View view2, w1f w1fVar, boolean z) {
        if (view != null && view.getParent() == viewGroup) {
            viewGroup.removeView(view);
        }
        if (view2 == null || view2.getParent() != null) {
            return;
        }
        viewGroup.addView(view2);
    }

    public abstract e2f l(ViewGroup viewGroup, View view, View view2, boolean z);

    public void m(ViewGroup viewGroup, View view, View view2, w1f w1fVar, boolean z, i50 i50Var) {
        i50Var.g();
    }
}
