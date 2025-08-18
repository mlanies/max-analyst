package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes2.dex */
public final class np9 extends tdc {
    public final jv5 a;
    public final m56 b;
    public boolean c;

    public np9(jv5 jv5Var, om8 om8Var) {
        this.a = jv5Var;
        this.b = om8Var;
    }

    @Override // defpackage.tdc
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.c = false;
        }
    }

    @Override // defpackage.tdc
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (this.c) {
            return;
        }
        a layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int iT0 = gridLayoutManager.T0();
        int iX0 = gridLayoutManager.X0();
        jv5 jv5Var = this.a;
        int iJ = jv5Var.j();
        if (iT0 == -1) {
            return;
        }
        this.b.invoke(iX0 == iJ + (-1) ? jv5Var.J(iX0) : jv5Var.J(iT0));
    }
}
