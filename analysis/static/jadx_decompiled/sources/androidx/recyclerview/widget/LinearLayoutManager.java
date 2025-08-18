package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.b23;
import defpackage.b85;
import defpackage.ga7;
import defpackage.odc;
import defpackage.pdc;
import defpackage.s5c;
import defpackage.th7;
import defpackage.uh7;
import defpackage.vdc;
import defpackage.vh7;
import defpackage.ydc;
import defpackage.yh7;
import defpackage.zdc;
import defpackage.zr6;

/* loaded from: classes.dex */
public class LinearLayoutManager extends a implements ydc {
    public final b85 A;
    public final th7 B;
    public int C;
    public final int[] D;
    public int p;
    public uh7 q;
    public ga7 r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public vh7 z;

    public LinearLayoutManager() {
        this(1, false);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean G0() {
        if (this.m == 1073741824 || this.l == 1073741824) {
            return false;
        }
        int iW = w();
        for (int i = 0; i < iW; i++) {
            ViewGroup.LayoutParams layoutParams = v(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public void I0(RecyclerView recyclerView, int i) {
        yh7 yh7Var = new yh7(recyclerView.getContext());
        yh7Var.a = i;
        J0(yh7Var);
    }

    @Override // androidx.recyclerview.widget.a
    public boolean K0() {
        return this.z == null && this.s == this.v;
    }

    public void L0(zdc zdcVar, int[] iArr) {
        int i;
        int iN = zdcVar.a != -1 ? this.r.n() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i;
    }

    public void M0(zdc zdcVar, uh7 uh7Var, b23 b23Var) {
        int i = uh7Var.d;
        if (i < 0 || i >= zdcVar.b()) {
            return;
        }
        b23Var.b(i, Math.max(0, uh7Var.g));
    }

    public final int N0(zdc zdcVar) {
        if (w() == 0) {
            return 0;
        }
        R0();
        ga7 ga7Var = this.r;
        boolean z = !this.w;
        return s5c.p(zdcVar, ga7Var, V0(z), U0(z), this, this.w);
    }

    public final int O0(zdc zdcVar) {
        if (w() == 0) {
            return 0;
        }
        R0();
        ga7 ga7Var = this.r;
        boolean z = !this.w;
        return s5c.q(zdcVar, ga7Var, V0(z), U0(z), this, this.w, this.u);
    }

    public final int P0(zdc zdcVar) {
        if (w() == 0) {
            return 0;
        }
        R0();
        ga7 ga7Var = this.r;
        boolean z = !this.w;
        return s5c.r(zdcVar, ga7Var, V0(z), U0(z), this, this.w);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean Q() {
        return true;
    }

    public final int Q0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE : this.p == 0 ? 1 : Integer.MIN_VALUE : this.p == 1 ? -1 : Integer.MIN_VALUE : this.p == 0 ? -1 : Integer.MIN_VALUE : (this.p != 1 && g1()) ? -1 : 1 : (this.p != 1 && g1()) ? 1 : -1;
    }

    public final void R0() {
        if (this.q == null) {
            uh7 uh7Var = new uh7();
            uh7Var.a = true;
            uh7Var.h = 0;
            uh7Var.i = 0;
            uh7Var.k = null;
            this.q = uh7Var;
        }
    }

    public final int S0(vdc vdcVar, uh7 uh7Var, zdc zdcVar, boolean z) {
        int i;
        int i2 = uh7Var.c;
        int i3 = uh7Var.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                uh7Var.g = i3 + i2;
            }
            j1(vdcVar, uh7Var);
        }
        int i4 = uh7Var.c + uh7Var.h;
        while (true) {
            if ((!uh7Var.l && i4 <= 0) || (i = uh7Var.d) < 0 || i >= zdcVar.b()) {
                break;
            }
            th7 th7Var = this.B;
            th7Var.a = 0;
            th7Var.b = false;
            th7Var.c = false;
            th7Var.d = false;
            h1(vdcVar, zdcVar, uh7Var, th7Var);
            if (!th7Var.b) {
                int i5 = uh7Var.b;
                int i6 = th7Var.a;
                uh7Var.b = (uh7Var.f * i6) + i5;
                if (!th7Var.c || uh7Var.k != null || !zdcVar.h) {
                    uh7Var.c -= i6;
                    i4 -= i6;
                }
                int i7 = uh7Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    uh7Var.g = i8;
                    int i9 = uh7Var.c;
                    if (i9 < 0) {
                        uh7Var.g = i8 + i9;
                    }
                    j1(vdcVar, uh7Var);
                }
                if (z && th7Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - uh7Var.c;
    }

    public final int T0() {
        View viewA1 = a1(0, w(), true, false);
        if (viewA1 == null) {
            return -1;
        }
        return a.M(viewA1);
    }

    public final View U0(boolean z) {
        return this.u ? a1(0, w(), z, true) : a1(w() - 1, -1, z, true);
    }

    public final View V0(boolean z) {
        return this.u ? a1(w() - 1, -1, z, true) : a1(0, w(), z, true);
    }

    public final int W0() {
        View viewA1 = a1(0, w(), false, true);
        if (viewA1 == null) {
            return -1;
        }
        return a.M(viewA1);
    }

    @Override // androidx.recyclerview.widget.a
    public void X(RecyclerView recyclerView) {
    }

    public final int X0() {
        View viewA1 = a1(w() - 1, -1, true, false);
        if (viewA1 == null) {
            return -1;
        }
        return a.M(viewA1);
    }

    @Override // androidx.recyclerview.widget.a
    public View Y(View view, int i, vdc vdcVar, zdc zdcVar) {
        int iQ0;
        l1();
        if (w() == 0 || (iQ0 = Q0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        R0();
        q1(iQ0, (int) (this.r.n() * 0.33333334f), false, zdcVar);
        uh7 uh7Var = this.q;
        uh7Var.g = Integer.MIN_VALUE;
        uh7Var.a = false;
        S0(vdcVar, uh7Var, zdcVar, true);
        View viewZ0 = iQ0 == -1 ? this.u ? Z0(w() - 1, -1) : Z0(0, w()) : this.u ? Z0(0, w()) : Z0(w() - 1, -1);
        View viewF1 = iQ0 == -1 ? f1() : e1();
        if (!viewF1.hasFocusable()) {
            return viewZ0;
        }
        if (viewZ0 == null) {
            return null;
        }
        return viewF1;
    }

    public final int Y0() {
        View viewA1 = a1(w() - 1, -1, false, true);
        if (viewA1 == null) {
            return -1;
        }
        return a.M(viewA1);
    }

    @Override // androidx.recyclerview.widget.a
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(W0());
            accessibilityEvent.setToIndex(Y0());
        }
    }

    public final View Z0(int i, int i2) {
        int i3;
        int i4;
        R0();
        if (i2 <= i && i2 >= i) {
            return v(i);
        }
        if (this.r.f(v(i)) < this.r.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.h(i, i2, i3, i4) : this.d.h(i, i2, i3, i4);
    }

    @Override // defpackage.ydc
    public final PointF a(int i) {
        if (w() == 0) {
            return null;
        }
        int i2 = (i < a.M(v(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final View a1(int i, int i2, boolean z, boolean z2) {
        R0();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.p == 0 ? this.c.h(i, i2, i3, i4) : this.d.h(i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View b1(defpackage.vdc r17, defpackage.zdc r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.R0()
            int r1 = r16.w()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r16.w()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            ga7 r7 = r0.r
            int r7 = r7.m()
            ga7 r8 = r0.r
            int r8 = r8.h()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.v(r1)
            int r13 = androidx.recyclerview.widget.a.M(r12)
            ga7 r14 = r0.r
            int r14 = r14.f(r12)
            ga7 r15 = r0.r
            int r15 = r15.c(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            pdc r13 = (defpackage.pdc) r13
            dec r13 = r13.a
            boolean r13 = r13.p()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            goto L84
        L7f:
            if (r10 == 0) goto L83
            r9 = r10
            goto L84
        L83:
            r9 = r11
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.b1(vdc, zdc, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.a
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    public final int c1(int i, vdc vdcVar, zdc zdcVar, boolean z) {
        int iH;
        int iH2 = this.r.h() - i;
        if (iH2 <= 0) {
            return 0;
        }
        int i2 = -m1(-iH2, vdcVar, zdcVar);
        int i3 = i + i2;
        if (!z || (iH = this.r.h() - i3) <= 0) {
            return i2;
        }
        this.r.r(iH);
        return iH + i2;
    }

    public final int d1(int i, vdc vdcVar, zdc zdcVar, boolean z) {
        int iM;
        int iM2 = i - this.r.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -m1(iM2, vdcVar, zdcVar);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.r.m()) <= 0) {
            return i2;
        }
        this.r.r(-iM);
        return i2 - iM;
    }

    @Override // androidx.recyclerview.widget.a
    public boolean e() {
        return this.p == 0;
    }

    public final View e1() {
        return v(this.u ? 0 : w() - 1);
    }

    @Override // androidx.recyclerview.widget.a
    public boolean f() {
        return this.p == 1;
    }

    public final View f1() {
        return v(this.u ? w() - 1 : 0);
    }

    public final boolean g1() {
        return H() == 1;
    }

    public void h1(vdc vdcVar, zdc zdcVar, uh7 uh7Var, th7 th7Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int iJ;
        int iE;
        View viewB = uh7Var.b(vdcVar);
        if (viewB == null) {
            th7Var.b = true;
            return;
        }
        pdc pdcVar = (pdc) viewB.getLayoutParams();
        if (uh7Var.k == null) {
            if (this.u == (uh7Var.f == -1)) {
                b(-1, viewB, false);
            } else {
                b(0, viewB, false);
            }
        } else {
            if (this.u == (uh7Var.f == -1)) {
                b(-1, viewB, true);
            } else {
                b(0, viewB, true);
            }
        }
        pdc pdcVar2 = (pdc) viewB.getLayoutParams();
        Rect rectW = this.b.W(viewB);
        int i5 = rectW.left + rectW.right;
        int i6 = rectW.top + rectW.bottom;
        int iX = a.x(e(), this.n, this.l, K() + J() + ((ViewGroup.MarginLayoutParams) pdcVar2).leftMargin + ((ViewGroup.MarginLayoutParams) pdcVar2).rightMargin + i5, ((ViewGroup.MarginLayoutParams) pdcVar2).width);
        int iX2 = a.x(f(), this.o, this.m, I() + L() + ((ViewGroup.MarginLayoutParams) pdcVar2).topMargin + ((ViewGroup.MarginLayoutParams) pdcVar2).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) pdcVar2).height);
        if (F0(viewB, iX, iX2, pdcVar2)) {
            viewB.measure(iX, iX2);
        }
        th7Var.a = this.r.d(viewB);
        if (this.p == 1) {
            if (g1()) {
                iE = this.n - K();
                iJ = iE - this.r.e(viewB);
            } else {
                iJ = J();
                iE = this.r.e(viewB) + iJ;
            }
            if (uh7Var.f == -1) {
                int i7 = uh7Var.b;
                i2 = i7;
                i3 = iE;
                i = i7 - th7Var.a;
            } else {
                int i8 = uh7Var.b;
                i = i8;
                i3 = iE;
                i2 = th7Var.a + i8;
            }
            i4 = iJ;
        } else {
            int iL = L();
            int iE2 = this.r.e(viewB) + iL;
            if (uh7Var.f == -1) {
                int i9 = uh7Var.b;
                i4 = i9 - th7Var.a;
                i3 = i9;
                i = iL;
                i2 = iE2;
            } else {
                int i10 = uh7Var.b;
                i = iL;
                i2 = iE2;
                i3 = th7Var.a + i10;
                i4 = i10;
            }
        }
        S(viewB, i4, i, i3, i2);
        if (pdcVar.a.p() || pdcVar.a.s()) {
            th7Var.c = true;
        }
        th7Var.d = viewB.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.a
    public final void i(int i, int i2, zdc zdcVar, b23 b23Var) {
        if (this.p != 0) {
            i = i2;
        }
        if (w() == 0 || i == 0) {
            return;
        }
        R0();
        q1(i > 0 ? 1 : -1, Math.abs(i), true, zdcVar);
        M0(zdcVar, this.q, b23Var);
    }

    public void i1(vdc vdcVar, zdc zdcVar, b85 b85Var, int i) {
    }

    @Override // androidx.recyclerview.widget.a
    public final void j(int i, b23 b23Var) {
        boolean z;
        int i2;
        vh7 vh7Var = this.z;
        if (vh7Var == null || (i2 = vh7Var.a) < 0) {
            l1();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = vh7Var.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            b23Var.b(i2, 0);
            i2 += i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0188  */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j0(defpackage.vdc r18, defpackage.zdc r19) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.j0(vdc, zdc):void");
    }

    public final void j1(vdc vdcVar, uh7 uh7Var) {
        if (!uh7Var.a || uh7Var.l) {
            return;
        }
        int i = uh7Var.g;
        int i2 = uh7Var.i;
        if (uh7Var.f == -1) {
            int iW = w();
            if (i < 0) {
                return;
            }
            int iG = (this.r.g() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iW; i3++) {
                    View viewV = v(i3);
                    if (this.r.f(viewV) < iG || this.r.q(viewV) < iG) {
                        k1(vdcVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iW - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewV2 = v(i5);
                if (this.r.f(viewV2) < iG || this.r.q(viewV2) < iG) {
                    k1(vdcVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iW2 = w();
        if (!this.u) {
            for (int i7 = 0; i7 < iW2; i7++) {
                View viewV3 = v(i7);
                if (this.r.c(viewV3) > i6 || this.r.p(viewV3) > i6) {
                    k1(vdcVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iW2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewV4 = v(i9);
            if (this.r.c(viewV4) > i6 || this.r.p(viewV4) > i6) {
                k1(vdcVar, i8, i9);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int k(zdc zdcVar) {
        return N0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public void k0(zdc zdcVar) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.e();
    }

    public final void k1(vdc vdcVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                u0(i, vdcVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                u0(i3, vdcVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public int l(zdc zdcVar) {
        return O0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof vh7) {
            vh7 vh7Var = (vh7) parcelable;
            this.z = vh7Var;
            if (this.x != -1) {
                vh7Var.a = -1;
            }
            w0();
        }
    }

    public final void l1() {
        if (this.p == 1 || !g1()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public int m(zdc zdcVar) {
        return P0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final Parcelable m0() {
        vh7 vh7Var = this.z;
        if (vh7Var != null) {
            vh7 vh7Var2 = new vh7();
            vh7Var2.a = vh7Var.a;
            vh7Var2.b = vh7Var.b;
            vh7Var2.c = vh7Var.c;
            return vh7Var2;
        }
        vh7 vh7Var3 = new vh7();
        if (w() > 0) {
            R0();
            boolean z = this.s ^ this.u;
            vh7Var3.c = z;
            if (z) {
                View viewE1 = e1();
                vh7Var3.b = this.r.h() - this.r.c(viewE1);
                vh7Var3.a = a.M(viewE1);
            } else {
                View viewF1 = f1();
                vh7Var3.a = a.M(viewF1);
                vh7Var3.b = this.r.f(viewF1) - this.r.m();
            }
        } else {
            vh7Var3.a = -1;
        }
        return vh7Var3;
    }

    public final int m1(int i, vdc vdcVar, zdc zdcVar) {
        if (w() == 0 || i == 0) {
            return 0;
        }
        R0();
        this.q.a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        q1(i2, iAbs, true, zdcVar);
        uh7 uh7Var = this.q;
        int iS0 = S0(vdcVar, uh7Var, zdcVar, false) + uh7Var.g;
        if (iS0 < 0) {
            return 0;
        }
        if (iAbs > iS0) {
            i = i2 * iS0;
        }
        this.r.r(-i);
        this.q.j = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.a
    public final int n(zdc zdcVar) {
        return N0(zdcVar);
    }

    public final void n1(int i, int i2) {
        this.x = i;
        this.y = i2;
        vh7 vh7Var = this.z;
        if (vh7Var != null) {
            vh7Var.a = -1;
        }
        w0();
    }

    @Override // androidx.recyclerview.widget.a
    public int o(zdc zdcVar) {
        return O0(zdcVar);
    }

    public final void o1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(zr6.h(i, "invalid orientation:"));
        }
        c(null);
        if (i != this.p || this.r == null) {
            ga7 ga7VarB = ga7.b(this, i);
            this.r = ga7VarB;
            this.A.f = ga7VarB;
            this.p = i;
            w0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public int p(zdc zdcVar) {
        return P0(zdcVar);
    }

    public void p1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        w0();
    }

    public final void q1(int i, int i2, boolean z, zdc zdcVar) {
        int iM;
        this.q.l = this.r.j() == 0 && this.r.g() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        L0(zdcVar, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        uh7 uh7Var = this.q;
        int i3 = z2 ? iMax2 : iMax;
        uh7Var.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        uh7Var.i = iMax;
        if (z2) {
            uh7Var.h = this.r.i() + i3;
            View viewE1 = e1();
            uh7 uh7Var2 = this.q;
            uh7Var2.e = this.u ? -1 : 1;
            int iM2 = a.M(viewE1);
            uh7 uh7Var3 = this.q;
            uh7Var2.d = iM2 + uh7Var3.e;
            uh7Var3.b = this.r.c(viewE1);
            iM = this.r.c(viewE1) - this.r.h();
        } else {
            View viewF1 = f1();
            uh7 uh7Var4 = this.q;
            uh7Var4.h = this.r.m() + uh7Var4.h;
            uh7 uh7Var5 = this.q;
            uh7Var5.e = this.u ? 1 : -1;
            int iM3 = a.M(viewF1);
            uh7 uh7Var6 = this.q;
            uh7Var5.d = iM3 + uh7Var6.e;
            uh7Var6.b = this.r.f(viewF1);
            iM = (-this.r.f(viewF1)) + this.r.m();
        }
        uh7 uh7Var7 = this.q;
        uh7Var7.c = i2;
        if (z) {
            uh7Var7.c = i2 - iM;
        }
        uh7Var7.g = iM;
    }

    @Override // androidx.recyclerview.widget.a
    public final View r(int i) {
        int iW = w();
        if (iW == 0) {
            return null;
        }
        int iM = i - a.M(v(0));
        if (iM >= 0 && iM < iW) {
            View viewV = v(iM);
            if (a.M(viewV) == i) {
                return viewV;
            }
        }
        return super.r(i);
    }

    public final void r1(int i, int i2) {
        this.q.c = this.r.h() - i2;
        uh7 uh7Var = this.q;
        uh7Var.e = this.u ? -1 : 1;
        uh7Var.d = i;
        uh7Var.f = 1;
        uh7Var.b = i2;
        uh7Var.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.a
    public pdc s() {
        return new pdc(-2, -2);
    }

    public final void s1(int i, int i2) {
        this.q.c = i2 - this.r.m();
        uh7 uh7Var = this.q;
        uh7Var.d = i;
        uh7Var.e = this.u ? 1 : -1;
        uh7Var.f = -1;
        uh7Var.b = i2;
        uh7Var.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.a
    public int x0(int i, vdc vdcVar, zdc zdcVar) {
        if (this.p == 1) {
            return 0;
        }
        return m1(i, vdcVar, zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public void y0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        vh7 vh7Var = this.z;
        if (vh7Var != null) {
            vh7Var.a = -1;
        }
        w0();
    }

    @Override // androidx.recyclerview.widget.a
    public int z0(int i, vdc vdcVar, zdc zdcVar) {
        if (this.p == 0) {
            return 0;
        }
        return m1(i, vdcVar, zdcVar);
    }

    public LinearLayoutManager(int i, boolean z) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new b85();
        this.B = new th7();
        this.C = 2;
        this.D = new int[2];
        o1(i);
        c(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        w0();
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new b85();
        this.B = new th7();
        this.C = 2;
        this.D = new int[2];
        odc odcVarN = a.N(context, attributeSet, i, i2);
        o1(odcVarN.a);
        boolean z = odcVarN.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            w0();
        }
        p1(odcVarN.d);
    }
}
