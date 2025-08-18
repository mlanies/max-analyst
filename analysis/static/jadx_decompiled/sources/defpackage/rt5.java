package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class rt5 extends ndc {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final Object o;

    public rt5(int i, u4a u4aVar) {
        this.a = 1;
        this.b = i;
        this.o = u4aVar;
        this.c = tu0.G(12 * fk4.d().getDisplayMetrics().density);
    }

    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        GridLayoutManager gridLayoutManagerQ;
        kg6 kg6Var;
        int iR;
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int iR2 = RecyclerView.R(view);
                hdc adapter = recyclerView.getAdapter();
                if (adapter != null && iR2 >= 0 && iR2 < adapter.j()) {
                    int i = this.c;
                    rect.left = i;
                    rect.right = i;
                    int i2 = ((o1d) this.o).i(iR2);
                    if (i2 == 0 || i2 == 1 || i2 == 4) {
                        rect.top = this.b;
                        break;
                    }
                }
                break;
            default:
                hdc adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && (gridLayoutManagerQ = z7.q(recyclerView)) != null && (kg6Var = gridLayoutManagerQ.K) != null && (iR = RecyclerView.R(view)) >= 0 && iR < adapter2.j()) {
                    int iB = kg6Var.b(iR, 8);
                    int iA = kg6Var.a(iR, 8);
                    int iA2 = kg6Var.a(adapter2.j() - 1, 8);
                    int i3 = this.c / 2;
                    if (((Boolean) ((k56) this.o).invoke()).booleanValue()) {
                        if (iA == 0) {
                            rect.bottom = i3;
                        } else if (iA == iA2) {
                            rect.top = i3;
                        } else {
                            rect.bottom = i3;
                            rect.top = i3;
                        }
                    }
                    int i4 = this.b;
                    rect.left = (iB * i4) / 8;
                    rect.right = i4 - (((iB + 1) * i4) / 8);
                    break;
                }
                break;
        }
    }

    public rt5(q64 q64Var) {
        this.a = 0;
        this.o = q64Var;
        this.b = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        this.c = tu0.G(12 * fk4.d().getDisplayMetrics().density);
    }
}
