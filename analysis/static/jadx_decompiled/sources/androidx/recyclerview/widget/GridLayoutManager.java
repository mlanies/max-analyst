package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.b23;
import defpackage.b85;
import defpackage.ig6;
import defpackage.jg6;
import defpackage.k4;
import defpackage.kg6;
import defpackage.l4;
import defpackage.pdc;
import defpackage.th7;
import defpackage.uh7;
import defpackage.vdc;
import defpackage.wg0;
import defpackage.zdc;
import defpackage.zmf;
import defpackage.zr6;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public kg6 K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new ig6();
        this.L = new Rect();
        A1(a.N(context, attributeSet, i, i2).b);
    }

    public final void A1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            throw new IllegalArgumentException(zr6.h(i, "Span count should be at least 1. Provided "));
        }
        this.F = i;
        this.K.d();
        w0();
    }

    public final void B1() {
        int I;
        int iL;
        if (this.p == 1) {
            I = this.n - K();
            iL = J();
        } else {
            I = this.o - I();
            iL = L();
        }
        t1(I - iL);
    }

    @Override // androidx.recyclerview.widget.a
    public final void C0(Rect rect, int i, int i2) {
        int iH;
        int iH2;
        if (this.G == null) {
            super.C0(rect, i, i2);
        }
        int iK = K() + J();
        int I = I() + L();
        if (this.p == 1) {
            int iHeight = rect.height() + I;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = zmf.a;
            iH2 = a.h(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iH = a.h(i, iArr[iArr.length - 1] + iK, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iK;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = zmf.a;
            iH = a.h(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iH2 = a.h(i2, iArr2[iArr2.length - 1] + I, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iH, iH2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final boolean K0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void M0(zdc zdcVar, uh7 uh7Var, b23 b23Var) {
        int i;
        int iC = this.F;
        for (int i2 = 0; i2 < this.F && (i = uh7Var.d) >= 0 && i < zdcVar.b() && iC > 0; i2++) {
            int i3 = uh7Var.d;
            b23Var.b(i3, Math.max(0, uh7Var.g));
            iC -= this.K.c(i3);
            uh7Var.d += uh7Var.e;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int O(vdc vdcVar, zdc zdcVar) {
        if (this.p == 0) {
            return this.F;
        }
        if (zdcVar.b() < 1) {
            return 0;
        }
        return w1(zdcVar.b() - 1, vdcVar, zdcVar) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0126  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Y(android.view.View r23, int r24, defpackage.vdc r25, defpackage.zdc r26) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Y(android.view.View, int, vdc, zdc):android.view.View");
    }

    @Override // androidx.recyclerview.widget.a
    public final void a0(vdc vdcVar, zdc zdcVar, l4 l4Var) {
        super.a0(vdcVar, zdcVar, l4Var);
        l4Var.h(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.a
    public final void b0(vdc vdcVar, zdc zdcVar, View view, l4 l4Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof jg6)) {
            c0(view, l4Var);
            return;
        }
        jg6 jg6Var = (jg6) layoutParams;
        int iW1 = w1(jg6Var.a.i(), vdcVar, zdcVar);
        if (this.p == 0) {
            l4Var.i(k4.a(false, jg6Var.X, jg6Var.Y, iW1, 1));
        } else {
            l4Var.i(k4.a(false, iW1, 1, jg6Var.X, jg6Var.Y));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View b1(vdc vdcVar, zdc zdcVar, boolean z, boolean z2) {
        int i;
        int iW;
        int iW2 = w();
        int i2 = 1;
        if (z2) {
            iW = w() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iW2;
            iW = 0;
        }
        int iB = zdcVar.b();
        R0();
        int iM = this.r.m();
        int iH = this.r.h();
        View view = null;
        View view2 = null;
        while (iW != i) {
            View viewV = v(iW);
            int iM2 = a.M(viewV);
            if (iM2 >= 0 && iM2 < iB && x1(iM2, vdcVar, zdcVar) == 0) {
                if (((pdc) viewV.getLayoutParams()).a.p()) {
                    if (view2 == null) {
                        view2 = viewV;
                    }
                } else {
                    if (this.r.f(viewV) < iH && this.r.c(viewV) >= iM) {
                        return viewV;
                    }
                    if (view == null) {
                        view = viewV;
                    }
                }
            }
            iW += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.a
    public final void d0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.a
    public final void e0() {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.a
    public boolean g(pdc pdcVar) {
        return pdcVar instanceof jg6;
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void h1(vdc vdcVar, zdc zdcVar, uh7 uh7Var, th7 th7Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iE;
        int iE2;
        int i8;
        int iE3;
        int iX;
        int iX2;
        boolean z;
        int i9;
        View viewB;
        int iK = this.r.k();
        boolean z2 = iK != 1073741824;
        int i10 = w() > 0 ? this.G[this.F] : 0;
        if (z2) {
            B1();
        }
        boolean z3 = uh7Var.e == 1;
        int iX1 = this.F;
        if (!z3) {
            iX1 = x1(uh7Var.d, vdcVar, zdcVar) + y1(uh7Var.d, vdcVar, zdcVar);
        }
        int i11 = 0;
        while (i11 < this.F && (i9 = uh7Var.d) >= 0 && i9 < zdcVar.b() && iX1 > 0) {
            int i12 = uh7Var.d;
            int iY1 = y1(i12, vdcVar, zdcVar);
            if (iY1 > this.F) {
                throw new IllegalArgumentException(zr6.j(wg0.j("Item at position ", i12, " requires ", iY1, " spans but GridLayoutManager has only "), this.F, " spans."));
            }
            iX1 -= iY1;
            if (iX1 < 0 || (viewB = uh7Var.b(vdcVar)) == null) {
                break;
            }
            this.H[i11] = viewB;
            i11++;
        }
        if (i11 == 0) {
            th7Var.b = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i11;
            i = 0;
        } else {
            i = i11 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i13 = 0;
        while (i != i2) {
            View view = this.H[i];
            jg6 jg6Var = (jg6) view.getLayoutParams();
            int iY12 = y1(a.M(view), vdcVar, zdcVar);
            jg6Var.Y = iY12;
            jg6Var.X = i13;
            i13 += iY12;
            i += i3;
        }
        float f = 0.0f;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            View view2 = this.H[i15];
            if (uh7Var.k != null) {
                z = false;
                if (z3) {
                    b(-1, view2, true);
                } else {
                    b(0, view2, true);
                }
            } else if (z3) {
                z = false;
                b(-1, view2, false);
            } else {
                z = false;
                b(0, view2, false);
            }
            d(this.L, view2);
            z1(iK, view2, z);
            int iD = this.r.d(view2);
            if (iD > i14) {
                i14 = iD;
            }
            float fE = (this.r.e(view2) * 1.0f) / ((jg6) view2.getLayoutParams()).Y;
            if (fE > f) {
                f = fE;
            }
        }
        if (z2) {
            t1(Math.max(Math.round(f * this.F), i10));
            i14 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                View view3 = this.H[i16];
                z1(1073741824, view3, true);
                int iD2 = this.r.d(view3);
                if (iD2 > i14) {
                    i14 = iD2;
                }
            }
        }
        for (int i17 = 0; i17 < i11; i17++) {
            View view4 = this.H[i17];
            if (this.r.d(view4) != i14) {
                jg6 jg6Var2 = (jg6) view4.getLayoutParams();
                Rect rect = jg6Var2.b;
                int i18 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) jg6Var2).topMargin + ((ViewGroup.MarginLayoutParams) jg6Var2).bottomMargin;
                int i19 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) jg6Var2).leftMargin + ((ViewGroup.MarginLayoutParams) jg6Var2).rightMargin;
                int iV1 = v1(jg6Var2.X, jg6Var2.Y);
                if (this.p == 1) {
                    iX2 = a.x(false, iV1, 1073741824, i19, ((ViewGroup.MarginLayoutParams) jg6Var2).width);
                    iX = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    iX = a.x(false, iV1, 1073741824, i18, ((ViewGroup.MarginLayoutParams) jg6Var2).height);
                    iX2 = iMakeMeasureSpec;
                }
                if (H0(view4, iX2, iX, (pdc) view4.getLayoutParams())) {
                    view4.measure(iX2, iX);
                }
            }
        }
        int i20 = 0;
        th7Var.a = i14;
        if (this.p != 1) {
            if (uh7Var.f == -1) {
                int i21 = uh7Var.b;
                i5 = i21 - i14;
                i4 = i21;
            } else {
                int i22 = uh7Var.b;
                i4 = i22 + i14;
                i5 = i22;
            }
            i6 = 0;
            i7 = 0;
        } else if (uh7Var.f == -1) {
            i7 = uh7Var.b;
            i6 = i7 - i14;
            i5 = 0;
            i4 = 0;
        } else {
            int i23 = uh7Var.b;
            i6 = i23;
            i4 = 0;
            i7 = i23 + i14;
            i5 = 0;
        }
        while (i20 < i11) {
            View view5 = this.H[i20];
            jg6 jg6Var3 = (jg6) view5.getLayoutParams();
            if (this.p != 1) {
                int iL = L() + this.G[jg6Var3.X];
                iE = i5;
                iE2 = i4;
                i8 = iL;
                iE3 = this.r.e(view5) + iL;
            } else if (g1()) {
                int iJ = J() + this.G[this.F - jg6Var3.X];
                iE2 = iJ;
                i8 = i6;
                iE3 = i7;
                iE = iJ - this.r.e(view5);
            } else {
                int iJ2 = J() + this.G[jg6Var3.X];
                iE2 = this.r.e(view5) + iJ2;
                i8 = i6;
                iE3 = i7;
                iE = iJ2;
            }
            S(view5, iE, i8, iE2, iE3);
            if (jg6Var3.a.p() || jg6Var3.a.s()) {
                th7Var.c = true;
            }
            th7Var.d |= view5.hasFocusable();
            i20++;
            i5 = iE;
            i4 = iE2;
            i6 = i8;
            i7 = iE3;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(RecyclerView recyclerView, int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void i1(vdc vdcVar, zdc zdcVar, b85 b85Var, int i) {
        B1();
        if (zdcVar.b() > 0 && !zdcVar.h) {
            boolean z = i == 1;
            int iX1 = x1(b85Var.b, vdcVar, zdcVar);
            if (z) {
                while (iX1 > 0) {
                    int i2 = b85Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    b85Var.b = i3;
                    iX1 = x1(i3, vdcVar, zdcVar);
                }
            } else {
                int iB = zdcVar.b() - 1;
                int i4 = b85Var.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iX12 = x1(i5, vdcVar, zdcVar);
                    if (iX12 <= iX1) {
                        break;
                    }
                    i4 = i5;
                    iX1 = iX12;
                }
                b85Var.b = i4;
            }
        }
        u1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void j0(vdc vdcVar, zdc zdcVar) {
        boolean z = zdcVar.h;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iW = w();
            for (int i = 0; i < iW; i++) {
                jg6 jg6Var = (jg6) v(i).getLayoutParams();
                int i2 = jg6Var.a.i();
                sparseIntArray2.put(i2, jg6Var.Y);
                sparseIntArray.put(i2, jg6Var.X);
            }
        }
        super.j0(vdcVar, zdcVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void k0(zdc zdcVar) {
        super.k0(zdcVar);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int l(zdc zdcVar) {
        return O0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int m(zdc zdcVar) {
        return P0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int o(zdc zdcVar) {
        return O0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int p(zdc zdcVar) {
        return P0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void p1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.p1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public pdc s() {
        return this.p == 0 ? new jg6(-2, -1) : new jg6(-1, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public pdc t(Context context, AttributeSet attributeSet) {
        jg6 jg6Var = new jg6(context, attributeSet);
        jg6Var.X = -1;
        jg6Var.Y = 0;
        return jg6Var;
    }

    public final void t1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    @Override // androidx.recyclerview.widget.a
    public pdc u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            jg6 jg6Var = new jg6((ViewGroup.MarginLayoutParams) layoutParams);
            jg6Var.X = -1;
            jg6Var.Y = 0;
            return jg6Var;
        }
        jg6 jg6Var2 = new jg6(layoutParams);
        jg6Var2.X = -1;
        jg6Var2.Y = 0;
        return jg6Var2;
    }

    public final void u1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int v1(int i, int i2) {
        if (this.p != 1 || !g1()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int w1(int i, vdc vdcVar, zdc zdcVar) {
        if (!zdcVar.h) {
            return this.K.a(i, this.F);
        }
        int iB = vdcVar.b(i);
        if (iB == -1) {
            return 0;
        }
        return this.K.a(iB, this.F);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int x0(int i, vdc vdcVar, zdc zdcVar) {
        B1();
        u1();
        return super.x0(i, vdcVar, zdcVar);
    }

    public final int x1(int i, vdc vdcVar, zdc zdcVar) {
        if (!zdcVar.h) {
            return this.K.b(i, this.F);
        }
        int i2 = this.J.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = vdcVar.b(i);
        if (iB == -1) {
            return 0;
        }
        return this.K.b(iB, this.F);
    }

    @Override // androidx.recyclerview.widget.a
    public final int y(vdc vdcVar, zdc zdcVar) {
        if (this.p == 1) {
            return this.F;
        }
        if (zdcVar.b() < 1) {
            return 0;
        }
        return w1(zdcVar.b() - 1, vdcVar, zdcVar) + 1;
    }

    public final int y1(int i, vdc vdcVar, zdc zdcVar) {
        if (!zdcVar.h) {
            return this.K.c(i);
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = vdcVar.b(i);
        if (iB == -1) {
            return 1;
        }
        return this.K.c(iB);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int z0(int i, vdc vdcVar, zdc zdcVar) {
        B1();
        u1();
        return super.z0(i, vdcVar, zdcVar);
    }

    public final void z1(int i, View view, boolean z) {
        int iX;
        int iX2;
        jg6 jg6Var = (jg6) view.getLayoutParams();
        Rect rect = jg6Var.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) jg6Var).topMargin + ((ViewGroup.MarginLayoutParams) jg6Var).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) jg6Var).leftMargin + ((ViewGroup.MarginLayoutParams) jg6Var).rightMargin;
        int iV1 = v1(jg6Var.X, jg6Var.Y);
        if (this.p == 1) {
            iX2 = a.x(false, iV1, i, i3, ((ViewGroup.MarginLayoutParams) jg6Var).width);
            iX = a.x(true, this.r.n(), this.m, i2, ((ViewGroup.MarginLayoutParams) jg6Var).height);
        } else {
            int iX3 = a.x(false, iV1, i, i2, ((ViewGroup.MarginLayoutParams) jg6Var).height);
            int iX4 = a.x(true, this.r.n(), this.l, i3, ((ViewGroup.MarginLayoutParams) jg6Var).width);
            iX = iX3;
            iX2 = iX4;
        }
        pdc pdcVar = (pdc) view.getLayoutParams();
        if (z ? H0(view, iX2, iX, pdcVar) : F0(view, iX2, iX, pdcVar)) {
            view.measure(iX2, iX);
        }
    }

    public GridLayoutManager(int i) {
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new ig6();
        this.L = new Rect();
        A1(i);
    }

    public GridLayoutManager(int i, int i2) {
        super(1, false);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new ig6();
        this.L = new Rect();
        A1(i);
    }
}
