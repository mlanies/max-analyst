package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class zz0 extends ndc {
    public final int a = tu0.G(20 * fk4.d().getDisplayMetrics().density);
    public final int b = tu0.G(8 * fk4.d().getDisplayMetrics().density);
    public final int c = tu0.G(12 * fk4.d().getDisplayMetrics().density);

    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        recyclerView.getClass();
        int iR = RecyclerView.R(view);
        hdc adapter = recyclerView.getAdapter();
        dz0 dz0Var = adapter instanceof dz0 ? (dz0) adapter : null;
        if (dz0Var != null && iR >= 0 && iR < dz0Var.j()) {
            ol7 ol7Var = (ol7) dz0Var.C(iR);
            h01 h01Var = ol7Var instanceof h01 ? (h01) ol7Var : null;
            ol7 ol7VarG = dz0Var.G(iR + 1);
            h01 h01Var2 = ol7VarG instanceof h01 ? (h01) ol7VarG : null;
            int i = 0;
            boolean z = iR == 0;
            int i2 = this.c;
            rect.left = i2;
            rect.right = i2;
            boolean z2 = h01Var instanceof g01;
            int i3 = this.a;
            rect.top = (z2 || z) ? i3 : 0;
            if (!tpa.f(h01Var != null ? Integer.valueOf(h01Var.u()) : null, h01Var2 != null ? Integer.valueOf(h01Var2.u()) : null)) {
                i = i3;
            } else if (h01Var != null && !h01Var.g()) {
                i = this.b;
            }
            rect.bottom = i;
        }
    }
}
