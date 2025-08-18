package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.aab;
import defpackage.b23;
import defpackage.ej9;
import defpackage.ga7;
import defpackage.he7;
import defpackage.nxd;
import defpackage.odc;
import defpackage.pdc;
import defpackage.pxd;
import defpackage.q57;
import defpackage.qxd;
import defpackage.s5c;
import defpackage.vdc;
import defpackage.ydc;
import defpackage.yh7;
import defpackage.zdc;
import defpackage.zmf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends a implements ydc {
    public boolean D;
    public boolean E;
    public pxd F;
    public final ej9 H;
    public final boolean I;
    public int[] J;
    public final q57 K;
    public qxd[] q;
    public final ga7 r;
    public final ga7 s;
    public final int t;
    public int u;
    public final he7 v;
    public boolean w;
    public BitSet y;
    public int p = -1;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;
    public final aab B = new aab();
    public final int C = 2;
    public final Rect G = new Rect();

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.w = false;
        ej9 ej9Var = new ej9();
        ej9Var.g = this;
        ej9Var.c();
        this.H = ej9Var;
        this.I = true;
        this.K = new q57(25, this);
        odc odcVarN = a.N(context, attributeSet, i, i2);
        int i3 = odcVarN.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            ga7 ga7Var = this.r;
            this.r = this.s;
            this.s = ga7Var;
            w0();
        }
        m1(odcVarN.b);
        boolean z = odcVarN.c;
        c(null);
        pxd pxdVar = this.F;
        if (pxdVar != null && pxdVar.s0 != z) {
            pxdVar.s0 = z;
        }
        this.w = z;
        w0();
        he7 he7Var = new he7();
        he7Var.a = true;
        he7Var.f = 0;
        he7Var.g = 0;
        this.v = he7Var;
        this.r = ga7.b(this, this.t);
        this.s = ga7.b(this, 1 - this.t);
    }

    public static int p1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.a
    public final void C0(Rect rect, int i, int i2) {
        int iH;
        int iH2;
        int iK = K() + J();
        int I = I() + L();
        if (this.t == 1) {
            int iHeight = rect.height() + I;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = zmf.a;
            iH2 = a.h(i2, iHeight, recyclerView.getMinimumHeight());
            iH = a.h(i, (this.u * this.p) + iK, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iK;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = zmf.a;
            iH = a.h(i, iWidth, recyclerView2.getMinimumWidth());
            iH2 = a.h(i2, (this.u * this.p) + I, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iH, iH2);
    }

    @Override // androidx.recyclerview.widget.a
    public final void I0(RecyclerView recyclerView, int i) {
        yh7 yh7Var = new yh7(recyclerView.getContext());
        yh7Var.a = i;
        J0(yh7Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean K0() {
        return this.F == null;
    }

    public final int L0(int i) {
        if (w() == 0) {
            return this.x ? 1 : -1;
        }
        return (i < V0()) != this.x ? -1 : 1;
    }

    public final boolean M0() {
        int iV0;
        if (w() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iV0 = W0();
                V0();
            } else {
                iV0 = V0();
                W0();
            }
            aab aabVar = this.B;
            if (iV0 == 0 && a1() != null) {
                aabVar.h();
                this.f = true;
                w0();
                return true;
            }
        }
        return false;
    }

    public final int N0(zdc zdcVar) {
        if (w() == 0) {
            return 0;
        }
        ga7 ga7Var = this.r;
        boolean z = this.I;
        return s5c.p(zdcVar, ga7Var, S0(!z), R0(!z), this, this.I);
    }

    public final int O0(zdc zdcVar) {
        if (w() == 0) {
            return 0;
        }
        ga7 ga7Var = this.r;
        boolean z = this.I;
        return s5c.q(zdcVar, ga7Var, S0(!z), R0(!z), this, this.I, this.x);
    }

    public final int P0(zdc zdcVar) {
        if (w() == 0) {
            return 0;
        }
        ga7 ga7Var = this.r;
        boolean z = this.I;
        return s5c.r(zdcVar, ga7Var, S0(!z), R0(!z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean Q() {
        return this.C != 0;
    }

    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v56 */
    public final int Q0(vdc vdcVar, he7 he7Var, zdc zdcVar) {
        qxd qxdVar;
        ?? r1;
        int i;
        int iD;
        int iD2;
        int iM;
        int iD3;
        int i2;
        View view;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 1;
        this.y.set(0, this.p, true);
        he7 he7Var2 = this.v;
        int i9 = he7Var2.i ? he7Var.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : he7Var.e == 1 ? he7Var.g + he7Var.b : he7Var.f - he7Var.b;
        int i10 = he7Var.e;
        for (int i11 = 0; i11 < this.p; i11++) {
            if (!((ArrayList) this.q[i11].e).isEmpty()) {
                o1(this.q[i11], i10, i9);
            }
        }
        int iH = this.x ? this.r.h() : this.r.m();
        int i12 = 0;
        while (true) {
            int i13 = he7Var.c;
            if (((i13 < 0 || i13 >= zdcVar.b()) ? i7 : i8) == 0 || (!he7Var2.i && this.y.isEmpty())) {
                break;
            }
            View view2 = vdcVar.j(he7Var.c, Long.MAX_VALUE).a;
            he7Var.c += he7Var.d;
            nxd nxdVar = (nxd) view2.getLayoutParams();
            int i14 = nxdVar.a.i();
            aab aabVar = this.B;
            int[] iArr = (int[]) aabVar.a;
            int i15 = (iArr == null || i14 >= iArr.length) ? -1 : iArr[i14];
            if (i15 == -1) {
                if (e1(he7Var.e)) {
                    i5 = this.p - i8;
                    i4 = -1;
                    i6 = -1;
                } else {
                    i4 = this.p;
                    i5 = i7;
                    i6 = i8;
                }
                qxd qxdVar2 = null;
                if (he7Var.e == i8) {
                    int iM2 = this.r.m();
                    int i16 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        qxd qxdVar3 = this.q[i5];
                        int iH2 = qxdVar3.h(iM2);
                        if (iH2 < i16) {
                            qxdVar2 = qxdVar3;
                            i16 = iH2;
                        }
                        i5 += i6;
                    }
                } else {
                    int iH3 = this.r.h();
                    int i17 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        qxd qxdVar4 = this.q[i5];
                        int iJ = qxdVar4.j(iH3);
                        if (iJ > i17) {
                            qxdVar2 = qxdVar4;
                            i17 = iJ;
                        }
                        i5 += i6;
                    }
                }
                qxdVar = qxdVar2;
                aabVar.j(i14);
                ((int[]) aabVar.a)[i14] = qxdVar.d;
            } else {
                qxdVar = this.q[i15];
            }
            qxd qxdVar5 = qxdVar;
            nxdVar.X = qxdVar5;
            if (he7Var.e == 1) {
                r1 = 0;
                b(-1, view2, false);
            } else {
                r1 = 0;
                b(0, view2, false);
            }
            if (this.t == 1) {
                i = 1;
                c1(view2, a.x(r1, this.u, this.l, r1, ((ViewGroup.MarginLayoutParams) nxdVar).width), a.x(true, this.o, this.m, I() + L(), ((ViewGroup.MarginLayoutParams) nxdVar).height));
            } else {
                i = 1;
                c1(view2, a.x(true, this.n, this.l, K() + J(), ((ViewGroup.MarginLayoutParams) nxdVar).width), a.x(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) nxdVar).height));
            }
            if (he7Var.e == i) {
                int iH4 = qxdVar5.h(iH);
                iD2 = iH4;
                iD = this.r.d(view2) + iH4;
            } else {
                int iJ2 = qxdVar5.j(iH);
                iD = iJ2;
                iD2 = iJ2 - this.r.d(view2);
            }
            if (he7Var.e == 1) {
                qxd qxdVar6 = nxdVar.X;
                qxdVar6.getClass();
                nxd nxdVar2 = (nxd) view2.getLayoutParams();
                nxdVar2.X = qxdVar6;
                ArrayList arrayList = (ArrayList) qxdVar6.e;
                arrayList.add(view2);
                qxdVar6.b = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    qxdVar6.a = Integer.MIN_VALUE;
                }
                if (nxdVar2.a.p() || nxdVar2.a.s()) {
                    qxdVar6.c = ((StaggeredGridLayoutManager) qxdVar6.f).r.d(view2) + qxdVar6.c;
                }
            } else {
                qxd qxdVar7 = nxdVar.X;
                qxdVar7.getClass();
                nxd nxdVar3 = (nxd) view2.getLayoutParams();
                nxdVar3.X = qxdVar7;
                ArrayList arrayList2 = (ArrayList) qxdVar7.e;
                arrayList2.add(0, view2);
                qxdVar7.a = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    qxdVar7.b = Integer.MIN_VALUE;
                }
                if (nxdVar3.a.p() || nxdVar3.a.s()) {
                    qxdVar7.c = ((StaggeredGridLayoutManager) qxdVar7.f).r.d(view2) + qxdVar7.c;
                }
            }
            if (b1() && this.t == 1) {
                iD3 = this.s.h() - (((this.p - 1) - qxdVar5.d) * this.u);
                iM = iD3 - this.s.d(view2);
            } else {
                iM = this.s.m() + (qxdVar5.d * this.u);
                iD3 = this.s.d(view2) + iM;
            }
            int i18 = iD3;
            int i19 = iM;
            if (this.t == 1) {
                i2 = 1;
                view = view2;
                S(view2, i19, iD2, i18, iD);
            } else {
                i2 = 1;
                view = view2;
                S(view, iD2, i19, iD, i18);
            }
            o1(qxdVar5, he7Var2.e, i9);
            g1(vdcVar, he7Var2);
            if (he7Var2.h && view.hasFocusable()) {
                i3 = 0;
                this.y.set(qxdVar5.d, false);
            } else {
                i3 = 0;
            }
            i7 = i3;
            i12 = i2;
            i8 = i12;
        }
        int i20 = i7;
        if (i12 == 0) {
            g1(vdcVar, he7Var2);
        }
        int iM3 = he7Var2.e == -1 ? this.r.m() - Y0(this.r.m()) : X0(this.r.h()) - this.r.h();
        return iM3 > 0 ? Math.min(he7Var.b, iM3) : i20;
    }

    public final View R0(boolean z) {
        int iM = this.r.m();
        int iH = this.r.h();
        View view = null;
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            int iF = this.r.f(viewV);
            int iC = this.r.c(viewV);
            if (iC > iM && iF < iH) {
                if (iC <= iH || !z) {
                    return viewV;
                }
                if (view == null) {
                    view = viewV;
                }
            }
        }
        return view;
    }

    public final View S0(boolean z) {
        int iM = this.r.m();
        int iH = this.r.h();
        int iW = w();
        View view = null;
        for (int i = 0; i < iW; i++) {
            View viewV = v(i);
            int iF = this.r.f(viewV);
            if (this.r.c(viewV) > iM && iF < iH) {
                if (iF >= iM || !z) {
                    return viewV;
                }
                if (view == null) {
                    view = viewV;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.a
    public final void T(int i) {
        super.T(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            qxd qxdVar = this.q[i2];
            int i3 = qxdVar.a;
            if (i3 != Integer.MIN_VALUE) {
                qxdVar.a = i3 + i;
            }
            int i4 = qxdVar.b;
            if (i4 != Integer.MIN_VALUE) {
                qxdVar.b = i4 + i;
            }
        }
    }

    public final void T0(vdc vdcVar, zdc zdcVar, boolean z) {
        int iH;
        int iX0 = X0(Integer.MIN_VALUE);
        if (iX0 != Integer.MIN_VALUE && (iH = this.r.h() - iX0) > 0) {
            int i = iH - (-k1(-iH, vdcVar, zdcVar));
            if (!z || i <= 0) {
                return;
            }
            this.r.r(i);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void U(int i) {
        super.U(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            qxd qxdVar = this.q[i2];
            int i3 = qxdVar.a;
            if (i3 != Integer.MIN_VALUE) {
                qxdVar.a = i3 + i;
            }
            int i4 = qxdVar.b;
            if (i4 != Integer.MIN_VALUE) {
                qxdVar.b = i4 + i;
            }
        }
    }

    public final void U0(vdc vdcVar, zdc zdcVar, boolean z) {
        int iM;
        int iY0 = Y0(Integer.MAX_VALUE);
        if (iY0 != Integer.MAX_VALUE && (iM = iY0 - this.r.m()) > 0) {
            int iK1 = iM - k1(iM, vdcVar, zdcVar);
            if (!z || iK1 <= 0) {
                return;
            }
            this.r.r(-iK1);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void V() {
        this.B.h();
        for (int i = 0; i < this.p; i++) {
            this.q[i].d();
        }
    }

    public final int V0() {
        if (w() == 0) {
            return 0;
        }
        return a.M(v(0));
    }

    public final int W0() {
        int iW = w();
        if (iW == 0) {
            return 0;
        }
        return a.M(v(iW - 1));
    }

    @Override // androidx.recyclerview.widget.a
    public final void X(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].d();
        }
        recyclerView.requestLayout();
    }

    public final int X0(int i) {
        int iH = this.q[0].h(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iH2 = this.q[i2].h(i);
            if (iH2 > iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005f  */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Y(android.view.View r9, int r10, defpackage.vdc r11, defpackage.zdc r12) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y(android.view.View, int, vdc, zdc):android.view.View");
    }

    public final int Y0(int i) {
        int iJ = this.q[0].j(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iJ2 = this.q[i2].j(i);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    @Override // androidx.recyclerview.widget.a
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (w() > 0) {
            View viewS0 = S0(false);
            View viewR0 = R0(false);
            if (viewS0 == null || viewR0 == null) {
                return;
            }
            int iM = a.M(viewS0);
            int iM2 = a.M(viewR0);
            if (iM < iM2) {
                accessibilityEvent.setFromIndex(iM);
                accessibilityEvent.setToIndex(iM2);
            } else {
                accessibilityEvent.setFromIndex(iM2);
                accessibilityEvent.setToIndex(iM);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.x
            if (r0 == 0) goto L9
            int r0 = r7.W0()
            goto Ld
        L9:
            int r0 = r7.V0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            aab r4 = r7.B
            r4.l(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.n(r8, r5)
            r4.m(r9, r5)
            goto L3a
        L33:
            r4.n(r8, r9)
            goto L3a
        L37:
            r4.m(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            return
        L3d:
            boolean r8 = r7.x
            if (r8 == 0) goto L46
            int r8 = r7.V0()
            goto L4a
        L46:
            int r8 = r7.W0()
        L4a:
            if (r3 > r8) goto L4f
            r7.w0()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Z0(int, int, int):void");
    }

    @Override // defpackage.ydc
    public final PointF a(int i) {
        int iL0 = L0(i);
        PointF pointF = new PointF();
        if (iL0 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = iL0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iL0;
        }
        return pointF;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a1() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a1():android.view.View");
    }

    public final boolean b1() {
        return H() == 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    public final void c1(View view, int i, int i2) {
        Rect rect = this.G;
        d(rect, view);
        nxd nxdVar = (nxd) view.getLayoutParams();
        int iP1 = p1(i, ((ViewGroup.MarginLayoutParams) nxdVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) nxdVar).rightMargin + rect.right);
        int iP12 = p1(i2, ((ViewGroup.MarginLayoutParams) nxdVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) nxdVar).bottomMargin + rect.bottom);
        if (F0(view, iP1, iP12, nxdVar)) {
            view.measure(iP1, iP12);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void d0(int i, int i2) {
        Z0(i, i2, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0411  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d1(defpackage.vdc r17, defpackage.zdc r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d1(vdc, zdc, boolean):void");
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean e() {
        return this.t == 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void e0() {
        this.B.h();
        w0();
    }

    public final boolean e1(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == b1();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        return this.t == 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(int i, int i2) {
        Z0(i, i2, 8);
    }

    public final void f1(int i, zdc zdcVar) {
        int iV0;
        int i2;
        if (i > 0) {
            iV0 = W0();
            i2 = 1;
        } else {
            iV0 = V0();
            i2 = -1;
        }
        he7 he7Var = this.v;
        he7Var.a = true;
        n1(iV0, zdcVar);
        l1(i2);
        he7Var.c = iV0 + he7Var.d;
        he7Var.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean g(pdc pdcVar) {
        return pdcVar instanceof nxd;
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(int i, int i2) {
        Z0(i, i2, 2);
    }

    public final void g1(vdc vdcVar, he7 he7Var) {
        if (!he7Var.a || he7Var.i) {
            return;
        }
        if (he7Var.b == 0) {
            if (he7Var.e == -1) {
                h1(he7Var.g, vdcVar);
                return;
            } else {
                i1(he7Var.f, vdcVar);
                return;
            }
        }
        int i = 1;
        if (he7Var.e == -1) {
            int i2 = he7Var.f;
            int iJ = this.q[0].j(i2);
            while (i < this.p) {
                int iJ2 = this.q[i].j(i2);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                i++;
            }
            int i3 = i2 - iJ;
            h1(i3 < 0 ? he7Var.g : he7Var.g - Math.min(i3, he7Var.b), vdcVar);
            return;
        }
        int i4 = he7Var.g;
        int iH = this.q[0].h(i4);
        while (i < this.p) {
            int iH2 = this.q[i].h(i4);
            if (iH2 < iH) {
                iH = iH2;
            }
            i++;
        }
        int i5 = iH - he7Var.g;
        i1(i5 < 0 ? he7Var.f : Math.min(i5, he7Var.b) + he7Var.f, vdcVar);
    }

    public final void h1(int i, vdc vdcVar) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            if (this.r.f(viewV) < i || this.r.q(viewV) < i) {
                return;
            }
            nxd nxdVar = (nxd) viewV.getLayoutParams();
            nxdVar.getClass();
            if (((ArrayList) nxdVar.X.e).size() == 1) {
                return;
            }
            qxd qxdVar = nxdVar.X;
            ArrayList arrayList = (ArrayList) qxdVar.e;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            nxd nxdVar2 = (nxd) view.getLayoutParams();
            nxdVar2.X = null;
            if (nxdVar2.a.p() || nxdVar2.a.s()) {
                qxdVar.c -= ((StaggeredGridLayoutManager) qxdVar.f).r.d(view);
            }
            if (size == 1) {
                qxdVar.a = Integer.MIN_VALUE;
            }
            qxdVar.b = Integer.MIN_VALUE;
            t0(viewV, vdcVar);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void i(int i, int i2, zdc zdcVar, b23 b23Var) {
        he7 he7Var;
        int iH;
        int iJ;
        if (this.t != 0) {
            i = i2;
        }
        if (w() == 0 || i == 0) {
            return;
        }
        f1(i, zdcVar);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.p) {
            this.J = new int[this.p];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.p;
            he7Var = this.v;
            if (i3 >= i5) {
                break;
            }
            if (he7Var.d == -1) {
                iH = he7Var.f;
                iJ = this.q[i3].j(iH);
            } else {
                iH = this.q[i3].h(he7Var.g);
                iJ = he7Var.g;
            }
            int i6 = iH - iJ;
            if (i6 >= 0) {
                this.J[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.J, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = he7Var.c;
            if (i8 < 0 || i8 >= zdcVar.b()) {
                return;
            }
            b23Var.b(he7Var.c, this.J[i7]);
            he7Var.c += he7Var.d;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(RecyclerView recyclerView, int i, int i2) {
        Z0(i, i2, 4);
    }

    public final void i1(int i, vdc vdcVar) {
        while (w() > 0) {
            View viewV = v(0);
            if (this.r.c(viewV) > i || this.r.p(viewV) > i) {
                return;
            }
            nxd nxdVar = (nxd) viewV.getLayoutParams();
            nxdVar.getClass();
            if (((ArrayList) nxdVar.X.e).size() == 1) {
                return;
            }
            qxd qxdVar = nxdVar.X;
            ArrayList arrayList = (ArrayList) qxdVar.e;
            View view = (View) arrayList.remove(0);
            nxd nxdVar2 = (nxd) view.getLayoutParams();
            nxdVar2.X = null;
            if (arrayList.size() == 0) {
                qxdVar.b = Integer.MIN_VALUE;
            }
            if (nxdVar2.a.p() || nxdVar2.a.s()) {
                qxdVar.c -= ((StaggeredGridLayoutManager) qxdVar.f).r.d(view);
            }
            qxdVar.a = Integer.MIN_VALUE;
            t0(viewV, vdcVar);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(vdc vdcVar, zdc zdcVar) {
        d1(vdcVar, zdcVar, true);
    }

    public final void j1() {
        if (this.t == 1 || !b1()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int k(zdc zdcVar) {
        return N0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0(zdc zdcVar) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.c();
    }

    public final int k1(int i, vdc vdcVar, zdc zdcVar) {
        if (w() == 0 || i == 0) {
            return 0;
        }
        f1(i, zdcVar);
        he7 he7Var = this.v;
        int iQ0 = Q0(vdcVar, he7Var, zdcVar);
        if (he7Var.b >= iQ0) {
            i = i < 0 ? -iQ0 : iQ0;
        }
        this.r.r(-i);
        this.D = this.x;
        he7Var.b = 0;
        g1(vdcVar, he7Var);
        return i;
    }

    @Override // androidx.recyclerview.widget.a
    public final int l(zdc zdcVar) {
        return O0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof pxd) {
            pxd pxdVar = (pxd) parcelable;
            this.F = pxdVar;
            if (this.z != -1) {
                pxdVar.o = null;
                pxdVar.c = 0;
                pxdVar.a = -1;
                pxdVar.b = -1;
                pxdVar.o = null;
                pxdVar.c = 0;
                pxdVar.X = 0;
                pxdVar.Y = null;
                pxdVar.Z = null;
            }
            w0();
        }
    }

    public final void l1(int i) {
        he7 he7Var = this.v;
        he7Var.e = i;
        he7Var.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final int m(zdc zdcVar) {
        return P0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final Parcelable m0() {
        int iJ;
        int iM;
        int[] iArr;
        pxd pxdVar = this.F;
        if (pxdVar != null) {
            pxd pxdVar2 = new pxd();
            pxdVar2.c = pxdVar.c;
            pxdVar2.a = pxdVar.a;
            pxdVar2.b = pxdVar.b;
            pxdVar2.o = pxdVar.o;
            pxdVar2.X = pxdVar.X;
            pxdVar2.Y = pxdVar.Y;
            pxdVar2.s0 = pxdVar.s0;
            pxdVar2.t0 = pxdVar.t0;
            pxdVar2.u0 = pxdVar.u0;
            pxdVar2.Z = pxdVar.Z;
            return pxdVar2;
        }
        pxd pxdVar3 = new pxd();
        pxdVar3.s0 = this.w;
        pxdVar3.t0 = this.D;
        pxdVar3.u0 = this.E;
        aab aabVar = this.B;
        if (aabVar == null || (iArr = (int[]) aabVar.a) == null) {
            pxdVar3.X = 0;
        } else {
            pxdVar3.Y = iArr;
            pxdVar3.X = iArr.length;
            pxdVar3.Z = (List) aabVar.b;
        }
        if (w() > 0) {
            pxdVar3.a = this.D ? W0() : V0();
            View viewR0 = this.x ? R0(true) : S0(true);
            pxdVar3.b = viewR0 != null ? a.M(viewR0) : -1;
            int i = this.p;
            pxdVar3.c = i;
            pxdVar3.o = new int[i];
            for (int i2 = 0; i2 < this.p; i2++) {
                if (this.D) {
                    iJ = this.q[i2].h(Integer.MIN_VALUE);
                    if (iJ != Integer.MIN_VALUE) {
                        iM = this.r.h();
                        iJ -= iM;
                    }
                } else {
                    iJ = this.q[i2].j(Integer.MIN_VALUE);
                    if (iJ != Integer.MIN_VALUE) {
                        iM = this.r.m();
                        iJ -= iM;
                    }
                }
                pxdVar3.o[i2] = iJ;
            }
        } else {
            pxdVar3.a = -1;
            pxdVar3.b = -1;
            pxdVar3.c = 0;
        }
        return pxdVar3;
    }

    public final void m1(int i) {
        c(null);
        if (i != this.p) {
            this.B.h();
            w0();
            this.p = i;
            this.y = new BitSet(this.p);
            this.q = new qxd[this.p];
            for (int i2 = 0; i2 < this.p; i2++) {
                this.q[i2] = new qxd(this, i2);
            }
            w0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int n(zdc zdcVar) {
        return N0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final void n0(int i) {
        if (i == 0) {
            M0();
        }
    }

    public final void n1(int i, zdc zdcVar) {
        int iN;
        int iN2;
        int i2;
        he7 he7Var = this.v;
        boolean z = false;
        he7Var.b = 0;
        he7Var.c = i;
        yh7 yh7Var = this.e;
        if (!(yh7Var != null && yh7Var.e) || (i2 = zdcVar.a) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.x == (i2 < i)) {
                iN = this.r.n();
                iN2 = 0;
            } else {
                iN2 = this.r.n();
                iN = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.v0) {
            he7Var.g = this.r.g() + iN;
            he7Var.f = -iN2;
        } else {
            he7Var.f = this.r.m() - iN2;
            he7Var.g = this.r.h() + iN;
        }
        he7Var.h = false;
        he7Var.a = true;
        if (this.r.j() == 0 && this.r.g() == 0) {
            z = true;
        }
        he7Var.i = z;
    }

    @Override // androidx.recyclerview.widget.a
    public final int o(zdc zdcVar) {
        return O0(zdcVar);
    }

    public final void o1(qxd qxdVar, int i, int i2) {
        int i3 = qxdVar.c;
        int i4 = qxdVar.d;
        if (i != -1) {
            int i5 = qxdVar.b;
            if (i5 == Integer.MIN_VALUE) {
                qxdVar.c();
                i5 = qxdVar.b;
            }
            if (i5 - i3 >= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = qxdVar.a;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) qxdVar.e).get(0);
            nxd nxdVar = (nxd) view.getLayoutParams();
            qxdVar.a = ((StaggeredGridLayoutManager) qxdVar.f).r.f(view);
            nxdVar.getClass();
            i6 = qxdVar.a;
        }
        if (i6 + i3 <= i2) {
            this.y.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int p(zdc zdcVar) {
        return P0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final pdc s() {
        return this.t == 0 ? new nxd(-2, -1) : new nxd(-1, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public final pdc t(Context context, AttributeSet attributeSet) {
        return new nxd(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.a
    public final pdc u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new nxd((ViewGroup.MarginLayoutParams) layoutParams) : new nxd(layoutParams);
    }

    @Override // androidx.recyclerview.widget.a
    public final int x0(int i, vdc vdcVar, zdc zdcVar) {
        return k1(i, vdcVar, zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final void y0(int i) {
        pxd pxdVar = this.F;
        if (pxdVar != null && pxdVar.a != i) {
            pxdVar.o = null;
            pxdVar.c = 0;
            pxdVar.a = -1;
            pxdVar.b = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        w0();
    }

    @Override // androidx.recyclerview.widget.a
    public final int z0(int i, vdc vdcVar, zdc zdcVar) {
        return k1(i, vdcVar, zdcVar);
    }
}
