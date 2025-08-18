package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class kq extends ndc {
    public final /* synthetic */ int a;

    public /* synthetic */ kq(int i) {
        this.a = i;
    }

    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        int iR;
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int iR2 = RecyclerView.R(view);
                hdc adapter = recyclerView.getAdapter();
                xq0 xq0Var = null;
                Integer numValueOf = adapter != null ? Integer.valueOf(adapter.j()) : null;
                if (iR2 != -1 && numValueOf != null) {
                    view.setClipToOutline(true);
                    if (iR2 == 0) {
                        xq0Var = new xq0(1, fk4.d().getDisplayMetrics().density * 16.0f);
                    } else if (iR2 == numValueOf.intValue() - 1) {
                        xq0Var = new xq0(0, fk4.d().getDisplayMetrics().density * 16.0f);
                    }
                    view.setOutlineProvider(xq0Var);
                    break;
                }
                break;
            case 1:
                float f = 4;
                rect.top = tu0.G(fk4.d().getDisplayMetrics().density * f);
                rect.bottom = tu0.G(f * fk4.d().getDisplayMetrics().density);
                break;
            case 2:
                recyclerView.getClass();
                int iR3 = RecyclerView.R(view);
                if (!c54.K(view)) {
                    rect.left = tu0.G((iR3 == 0 ? 16 : 8) * fk4.d().getDisplayMetrics().density);
                    break;
                } else {
                    rect.right = tu0.G((iR3 == 0 ? 16 : 8) * fk4.d().getDisplayMetrics().density);
                    break;
                }
            case 3:
                dec decVarT = recyclerView.T(view);
                if (decVarT != null) {
                    int i = decVarT.Y;
                    if (i == p8a.a || i == p8a.b || i == p8a.u || i == p8a.v) {
                        float f2 = 6;
                        rect.set(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0);
                        break;
                    }
                }
                break;
            case 4:
                recyclerView.getClass();
                int iR4 = RecyclerView.R(view);
                rect.set((iR4 == -1 || iR4 == 0) ? 0 : tu0.G(8 * fk4.d().getDisplayMetrics().density), tu0.G(24 * fk4.d().getDisplayMetrics().density), rect.right, 0);
                break;
            case 5:
                super.f(rect, view, recyclerView, zdcVar);
                hdc adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && (iR = RecyclerView.R(view)) > 0) {
                    int iL = adapter2.l(iR);
                    if ((iL == z8a.m || iL == z8a.s) && adapter2.l(iR - 1) == gca.c) {
                        rect.top = tu0.G(10 * fk4.d().getDisplayMetrics().density);
                        break;
                    }
                }
                break;
            case 6:
                recyclerView.getClass();
                int iR5 = RecyclerView.R(view);
                hdc adapter3 = recyclerView.getAdapter();
                Integer numValueOf2 = adapter3 != null ? Integer.valueOf(adapter3.j()) : null;
                if (iR5 != -1 && numValueOf2 != null) {
                    rect.top = iR5 == 0 ? tu0.G(16 * fk4.d().getDisplayMetrics().density) : 0;
                    float f3 = 12;
                    rect.left = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                    rect.right = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
                    rect.bottom = iR5 == numValueOf2.intValue() + (-1) ? tu0.G(16 * fk4.d().getDisplayMetrics().density) : 0;
                    break;
                }
                break;
            case 7:
                recyclerView.getClass();
                int iR6 = RecyclerView.R(view);
                hdc adapter4 = recyclerView.getAdapter();
                Integer numValueOf3 = adapter4 != null ? Integer.valueOf(adapter4.j()) : null;
                if (iR6 != -1 && numValueOf3 != null) {
                    rect.top = iR6 == 0 ? tu0.G(16 * fk4.d().getDisplayMetrics().density) : 0;
                    break;
                }
                break;
            case 8:
                hdc adapter5 = recyclerView.getAdapter();
                if (adapter5 != null) {
                    if (RecyclerView.R(view) != adapter5.j() - 1) {
                    }
                    rect.left = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                    rect.top = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                    rect.right = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                    rect.bottom = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                    break;
                }
                break;
            case 9:
                recyclerView.getClass();
                if (RecyclerView.R(view) != -1 && (view instanceof OneMeButton)) {
                    rect.set(rect.left, tu0.G(16 * fk4.d().getDisplayMetrics().density), rect.right, rect.bottom);
                    break;
                }
                break;
            case 10:
                recyclerView.getClass();
                int iR7 = RecyclerView.R(view);
                if (iR7 != -1 && iR7 != 0 && (view instanceof AppCompatTextView)) {
                    rect.set(rect.left, tu0.G(12 * fk4.d().getDisplayMetrics().density), rect.right, rect.bottom);
                    break;
                }
                break;
            default:
                recyclerView.getClass();
                int iR8 = RecyclerView.R(view);
                if (c54.K(view)) {
                    rect.right = tu0.G((iR8 == 0 ? 4 : 6) * fk4.d().getDisplayMetrics().density);
                    if (z7.H(recyclerView, iR8)) {
                        rect.left = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                    }
                } else {
                    rect.left = tu0.G((iR8 == 0 ? 4 : 6) * fk4.d().getDisplayMetrics().density);
                    if (z7.H(recyclerView, iR8)) {
                        rect.right = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                    }
                }
                float f4 = 4;
                rect.top = tu0.G(fk4.d().getDisplayMetrics().density * f4);
                rect.bottom = tu0.G(f4 * fk4.d().getDisplayMetrics().density);
                break;
        }
    }
}
