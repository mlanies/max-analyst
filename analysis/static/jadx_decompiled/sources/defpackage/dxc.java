package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class dxc extends dle {
    public final int X = 1;
    public final String Y = dxc.class.getName();
    public final m56 o;

    public dxc(o59 o59Var) {
        this.o = o59Var;
    }

    public static final boolean h0(dxc dxcVar, RecyclerView recyclerView, int i) {
        dxcVar.getClass();
        return z7.H(recyclerView, i - 1) && z7.H(recyclerView, z7.l(recyclerView, 1.0f));
    }

    public static final void i0(dxc dxcVar, hdc hdcVar) {
        dxcVar.getClass();
        int iJ = hdcVar.j() - 1;
        String str = dxcVar.Y;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, zr6.h(iJ, "scrollToBottomNotifier scroll to bottom position, pos:"), null);
        }
        dxcVar.o.invoke(cxc.a);
    }

    @Override // defpackage.dle
    public final jdc W(RecyclerView recyclerView, hdc hdcVar) {
        return new y15(this, recyclerView, hdcVar);
    }
}
