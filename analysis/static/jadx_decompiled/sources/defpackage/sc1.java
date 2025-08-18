package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class sc1 extends ndc {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    public sc1(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                break;
            case 2:
                this.b = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                break;
            default:
                this.b = tu0.G(20 * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                break;
        }
    }

    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int iR = RecyclerView.R(view);
                hdc adapter = recyclerView.getAdapter();
                da1 da1Var = adapter instanceof da1 ? (da1) adapter : null;
                if (da1Var != null && iR >= 0 && iR < da1Var.j()) {
                    ol7 ol7Var = (ol7) da1Var.C(iR);
                    jc1 jc1Var = ol7Var instanceof jc1 ? (jc1) ol7Var : null;
                    ol7 ol7VarG = da1Var.G(iR + 1);
                    jc1 jc1Var2 = ol7VarG instanceof jc1 ? (jc1) ol7VarG : null;
                    int i = this.c;
                    rect.left = i;
                    rect.right = i;
                    rect.top = 0;
                    rect.bottom = tpa.f(jc1Var != null ? Integer.valueOf(jc1Var.u()) : null, jc1Var2 != null ? Integer.valueOf(jc1Var2.u()) : null) ? 0 : this.b;
                    break;
                }
                break;
            case 1:
                recyclerView.getClass();
                int iR2 = RecyclerView.R(view);
                hdc adapter2 = recyclerView.getAdapter();
                mfd mfdVar = adapter2 instanceof mfd ? (mfd) adapter2 : null;
                if (mfdVar != null && iR2 >= 0 && iR2 < mfdVar.j()) {
                    kfd kfdVar = (kfd) ((ol7) mfdVar.C(iR2));
                    kfd kfdVar2 = (kfd) mfdVar.G(iR2 + 1);
                    rect.top = iR2 == 0 ? this.b : 0;
                    rect.bottom = (kfdVar2 == null || kfdVar.u() != kfdVar2.u()) ? this.c : 0;
                    break;
                }
                break;
            case 2:
                recyclerView.getClass();
                int iR3 = RecyclerView.R(view);
                hdc adapter3 = recyclerView.getAdapter();
                mfd mfdVar2 = adapter3 instanceof mfd ? (mfd) adapter3 : null;
                if (mfdVar2 != null && iR3 >= 0 && iR3 < mfdVar2.j()) {
                    rect.top = iR3 == 0 ? this.b : this.c;
                    break;
                }
                break;
            case 3:
                int i2 = this.b;
                rect.top = i2;
                rect.bottom = i2;
                if (zdcVar.b() != 1) {
                    recyclerView.getClass();
                    int iR4 = RecyclerView.R(view);
                    int iB = zdcVar.b() - 1;
                    int i3 = this.c;
                    if (iR4 != iB) {
                        if (RecyclerView.R(view) != 0) {
                            int i4 = i3 / 2;
                            rect.left = i4;
                            rect.right = i4;
                            break;
                        } else {
                            rect.left = i2;
                            rect.right = i3 / 2;
                            break;
                        }
                    } else {
                        rect.left = i3 / 2;
                        rect.right = i2;
                        break;
                    }
                } else {
                    rect.left = i2;
                    rect.right = i2;
                    break;
                }
            case 4:
                recyclerView.getClass();
                int iR5 = RecyclerView.R(view);
                int i5 = this.b;
                int iMax = iR5 % ((int) Math.max(1.0d, i5));
                int iMax2 = (int) Math.max(1.0d, i5);
                int i6 = this.c;
                rect.left = (iMax * i6) / iMax2;
                rect.right = i6 - (((iMax + 1) * i6) / iMax2);
                if (iR5 >= iMax2) {
                    rect.top = i6;
                    break;
                }
                break;
            case 5:
                int i7 = this.c;
                rect.left = i7;
                rect.right = i7;
                rect.top = this.b;
                break;
            case 6:
                recyclerView.getClass();
                int iR6 = RecyclerView.R(view);
                int i8 = this.b;
                if (iR6 == 0) {
                    rect.right = i8 / 2;
                } else if (iR6 == zdcVar.b() - 1) {
                    rect.left = i8 / 2;
                } else {
                    int i9 = i8 / 2;
                    rect.left = i9;
                    rect.right = i9;
                }
                int i10 = this.c;
                rect.top = i10;
                rect.bottom = i10;
                break;
            default:
                recyclerView.getClass();
                int iR7 = RecyclerView.R(view);
                int iB2 = zdcVar.b() - 1;
                int i11 = this.c;
                int i12 = this.b;
                if (iR7 != iB2) {
                    if (RecyclerView.R(view) != 0) {
                        rect.top = i12;
                        rect.bottom = i12;
                        break;
                    } else {
                        rect.top = i11;
                        rect.bottom = i12;
                        break;
                    }
                } else {
                    rect.top = i12;
                    rect.bottom = i11;
                    break;
                }
        }
    }

    public /* synthetic */ sc1(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
