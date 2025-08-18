package defpackage;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class ry0 extends ndc {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final int o;

    public ry0(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                this.o = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                break;
            case 3:
                this.b = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                this.o = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                break;
            case 4:
                this.b = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                this.o = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                break;
            case 5:
                this.b = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                this.o = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                break;
            case 6:
                this.b = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(7 * fk4.d().getDisplayMetrics().density);
                this.o = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                break;
            case 7:
                this.b = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                this.o = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                break;
            default:
                float f = 8;
                this.b = tu0.G(fk4.d().getDisplayMetrics().density * f);
                tu0.G(f * fk4.d().getDisplayMetrics().density);
                float f2 = 16;
                this.c = tu0.G(fk4.d().getDisplayMetrics().density * f2);
                this.o = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
                break;
        }
    }

    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        int iR;
        kg6 kg6Var;
        int iR2;
        kg6 kg6Var2;
        kg6 kg6Var3;
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int iR3 = RecyclerView.R(view);
                hdc adapter = recyclerView.getAdapter();
                ae1 ae1Var = adapter instanceof ae1 ? (ae1) adapter : null;
                if (ae1Var != null && iR3 >= 0 && iR3 < ae1Var.j()) {
                    ol7 ol7Var = (ol7) ae1Var.C(iR3);
                    sy0 sy0Var = ol7Var instanceof sy0 ? (sy0) ol7Var : null;
                    ol7 ol7VarG = ae1Var.G(iR3 + 1);
                    sy0 sy0Var2 = ol7VarG instanceof sy0 ? (sy0) ol7VarG : null;
                    int i = 0;
                    boolean z = iR3 == 0;
                    boolean z2 = iR3 == ae1Var.j() - 1;
                    int i2 = this.c;
                    rect.left = i2;
                    rect.right = i2;
                    int i3 = this.b;
                    rect.top = z ? 0 : i3;
                    if (z2) {
                        i = this.o;
                    } else {
                        if (!tpa.f(sy0Var != null ? Integer.valueOf(sy0Var.c) : null, sy0Var2 != null ? Integer.valueOf(sy0Var2.c) : null)) {
                            i = i3;
                        }
                    }
                    rect.bottom = i;
                    break;
                }
                break;
            case 1:
                hdc adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && (iR = RecyclerView.R(view)) >= 0 && iR < adapter2.j()) {
                    int iG = tu0.G(32 * fk4.d().getDisplayMetrics().density);
                    int i4 = this.b;
                    int iF = j1e.f(recyclerView, iG, i4);
                    GridLayoutManager gridLayoutManagerQ = z7.q(recyclerView);
                    if (gridLayoutManagerQ != null && (kg6Var = gridLayoutManagerQ.K) != null) {
                        int iB = kg6Var.b(iR, i4);
                        if (adapter2.l(iR) != jca.q) {
                            int i5 = this.c / 2;
                            rect.bottom = i5;
                            rect.top = i5;
                            rect.left = (iB * iF) / i4;
                            rect.right = iF - (((iB + 1) * iF) / i4);
                            break;
                        } else {
                            rect.top = this.o;
                            break;
                        }
                    }
                }
                break;
            case 2:
                recyclerView.getClass();
                int iR4 = RecyclerView.R(view);
                hdc adapter3 = recyclerView.getAdapter();
                if (adapter3 != null && iR4 >= 0 && iR4 < adapter3.j()) {
                    int i6 = this.o;
                    rect.left = i6;
                    rect.right = i6;
                    if (iR4 != 0) {
                        rect.top = this.c;
                        break;
                    } else {
                        rect.top = this.b;
                        break;
                    }
                }
                break;
            case 3:
                recyclerView.getClass();
                int iR5 = RecyclerView.R(view);
                hdc adapter4 = recyclerView.getAdapter();
                mfd mfdVar = null;
                nd3 nd3Var = adapter4 instanceof nd3 ? (nd3) adapter4 : null;
                if (nd3Var != null) {
                    Pair pairD = nd3Var.D(iR5);
                    Integer num = pairD.first instanceof mfd ? (Integer) pairD.second : -1;
                    Object obj = pairD.first;
                    if ((obj instanceof mfd) && (obj instanceof mfd)) {
                        mfdVar = (mfd) obj;
                    }
                    if (mfdVar != null) {
                        int iJ = mfdVar.j();
                        int iIntValue = num.intValue();
                        if (iIntValue >= 0 && iIntValue < iJ) {
                            kfd kfdVar = (kfd) ((ol7) mfdVar.C(num.intValue()));
                            kfd kfdVar2 = (kfd) mfdVar.G(num.intValue() + 1);
                            boolean z3 = num.intValue() == 0 && iR5 == 0;
                            int i7 = this.o;
                            rect.left = i7;
                            rect.right = i7;
                            rect.top = z3 ? this.b : 0;
                            rect.bottom = (kfdVar2 == null || kfdVar.u() != kfdVar2.u()) ? this.c : 0;
                            break;
                        }
                    }
                }
                break;
            case 4:
                recyclerView.getClass();
                int iR6 = RecyclerView.R(view);
                hdc adapter5 = recyclerView.getAdapter();
                lgd lgdVar = adapter5 instanceof lgd ? (lgd) adapter5 : null;
                if (lgdVar != null && iR6 >= 0 && iR6 < lgdVar.j()) {
                    ol7 ol7Var2 = (ol7) lgdVar.C(iR6);
                    d1d d1dVar = ol7Var2 instanceof d1d ? (d1d) ol7Var2 : null;
                    ol7 ol7VarG2 = lgdVar.G(iR6 + 1);
                    d1d d1dVar2 = ol7VarG2 instanceof d1d ? (d1d) ol7VarG2 : null;
                    int i8 = 0;
                    boolean z4 = iR6 == 0;
                    int i9 = this.o;
                    rect.left = i9;
                    rect.right = i9;
                    int i10 = this.b;
                    rect.top = z4 ? i10 : 0;
                    if (!tpa.f(d1dVar != null ? Integer.valueOf(d1dVar.u()) : null, d1dVar2 != null ? Integer.valueOf(d1dVar2.u()) : null)) {
                        i8 = i10;
                    } else if (d1dVar != null && !d1dVar.g()) {
                        i8 = this.c;
                    }
                    rect.bottom = i8;
                    break;
                }
                break;
            case 5:
                recyclerView.getClass();
                int iR7 = RecyclerView.R(view);
                hdc adapter6 = recyclerView.getAdapter();
                chd chdVar = adapter6 instanceof chd ? (chd) adapter6 : null;
                if (chdVar != null && iR7 >= 0 && iR7 < chdVar.j()) {
                    ol7 ol7Var3 = (ol7) chdVar.C(iR7);
                    z0d z0dVar = ol7Var3 instanceof z0d ? (z0d) ol7Var3 : null;
                    ol7 ol7VarG3 = chdVar.G(iR7 + 1);
                    z0d z0dVar2 = ol7VarG3 instanceof z0d ? (z0d) ol7VarG3 : null;
                    int i11 = 0;
                    boolean z5 = iR7 == 0;
                    int i12 = this.o;
                    rect.left = i12;
                    rect.right = i12;
                    int i13 = this.b;
                    rect.top = z5 ? i13 : 0;
                    if (!tpa.f(z0dVar != null ? Integer.valueOf(z0dVar.u()) : null, z0dVar2 != null ? Integer.valueOf(z0dVar2.u()) : null)) {
                        i11 = i13;
                    } else if (z0dVar != null && !z0dVar.g()) {
                        i11 = this.c;
                    }
                    rect.bottom = i11;
                    break;
                }
                break;
            case 6:
                dec decVarT = recyclerView.T(view);
                if (decVarT != null) {
                    int iR8 = RecyclerView.R(view);
                    hdc adapter7 = recyclerView.getAdapter();
                    int i14 = decVarT.Y;
                    if (i14 != 0 && adapter7 != null && iR8 >= 0 && iR8 < adapter7.j()) {
                        int i15 = this.o;
                        rect.left = i15;
                        rect.right = i15;
                        int i16 = this.b;
                        if (iR8 != 0) {
                            if (i14 == gja.s) {
                                rect.top = i16;
                                rect.bottom = this.c;
                                break;
                            }
                        } else {
                            rect.top = i16;
                            break;
                        }
                    }
                }
                break;
            case 7:
                recyclerView.getClass();
                int iR9 = RecyclerView.R(view);
                hdc adapter8 = recyclerView.getAdapter();
                hid hidVar = adapter8 instanceof hid ? (hid) adapter8 : null;
                if (hidVar != null && iR9 >= 0 && iR9 < hidVar.j()) {
                    ol7 ol7Var4 = (ol7) hidVar.C(iR9);
                    l1d l1dVar = ol7Var4 instanceof l1d ? (l1d) ol7Var4 : null;
                    ol7 ol7VarG4 = hidVar.G(iR9 + 1);
                    l1d l1dVar2 = ol7VarG4 instanceof l1d ? (l1d) ol7VarG4 : null;
                    int i17 = 0;
                    boolean z6 = iR9 == 0;
                    int i18 = this.o;
                    rect.left = i18;
                    rect.right = i18;
                    int i19 = this.b;
                    rect.top = z6 ? i19 : 0;
                    if (!tpa.f(l1dVar != null ? Integer.valueOf(l1dVar.u()) : null, l1dVar2 != null ? Integer.valueOf(l1dVar2.u()) : null)) {
                        i17 = i19;
                    } else if (l1dVar != null && !l1dVar.g()) {
                        i17 = this.c;
                    }
                    rect.bottom = i17;
                    break;
                }
                break;
            default:
                hdc adapter9 = recyclerView.getAdapter();
                if (adapter9 != null && (iR2 = RecyclerView.R(view)) >= 0 && iR2 < adapter9.j()) {
                    int iG2 = tu0.G(81 * fk4.d().getDisplayMetrics().density);
                    int i20 = this.b;
                    int iF2 = j1e.f(recyclerView, iG2, i20);
                    GridLayoutManager gridLayoutManagerQ2 = z7.q(recyclerView);
                    if (gridLayoutManagerQ2 != null && (kg6Var2 = gridLayoutManagerQ2.K) != null) {
                        int iB2 = kg6Var2.b(iR2, i20);
                        GridLayoutManager gridLayoutManagerQ3 = z7.q(recyclerView);
                        if (((gridLayoutManagerQ3 == null || (kg6Var3 = gridLayoutManagerQ3.K) == null) ? 1 : kg6Var3.c(iR2)) != i20) {
                            int i21 = this.c / 2;
                            rect.bottom = i21;
                            rect.top = i21;
                            rect.left = (iB2 * iF2) / i20;
                            rect.right = iF2 - (((iB2 + 1) * iF2) / i20);
                            break;
                        } else {
                            rect.top = this.o;
                            break;
                        }
                    }
                }
                break;
        }
    }

    public ry0(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 8:
                this.b = i;
                this.c = i2;
                this.o = tu0.G(10 * fk4.d().getDisplayMetrics().density);
                break;
            default:
                this.b = i;
                this.c = i2;
                this.o = tu0.G(10 * fk4.d().getDisplayMetrics().density);
                break;
        }
    }
}
