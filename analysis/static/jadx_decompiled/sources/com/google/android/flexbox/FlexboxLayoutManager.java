package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import defpackage.an5;
import defpackage.bn5;
import defpackage.bna;
import defpackage.cn5;
import defpackage.ga7;
import defpackage.l84;
import defpackage.odc;
import defpackage.pdc;
import defpackage.vdc;
import defpackage.wd6;
import defpackage.xk0;
import defpackage.xm5;
import defpackage.ydc;
import defpackage.yh7;
import defpackage.zdc;
import defpackage.zm5;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FlexboxLayoutManager extends a implements xm5, ydc {
    public static final Rect N = new Rect();
    public final an5 A;
    public ga7 B;
    public ga7 C;
    public cn5 D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final SparseArray I;
    public final Context J;
    public View K;
    public int L;
    public final wd6 M;
    public int p;
    public final int q;
    public final int r;
    public boolean t;
    public boolean u;
    public final l84 w;
    public vdc x;
    public zdc y;
    public xk0 z;
    public final int s = -1;
    public List v = new ArrayList();

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        l84 l84Var = new l84();
        l84Var.a = this;
        this.w = l84Var;
        this.A = new an5(this);
        this.E = -1;
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.I = new SparseArray();
        this.L = -1;
        this.M = new wd6(15, false);
        odc odcVarN = a.N(context, attributeSet, i, i2);
        int i3 = odcVarN.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (odcVarN.c) {
                    f1(3);
                } else {
                    f1(2);
                }
            }
        } else if (odcVarN.c) {
            f1(1);
        } else {
            f1(0);
        }
        int i4 = this.q;
        if (i4 != 1) {
            if (i4 == 0) {
                q0();
                this.v.clear();
                an5 an5Var = this.A;
                an5.b(an5Var);
                an5Var.d = 0;
            }
            this.q = 1;
            this.B = null;
            this.C = null;
            w0();
        }
        if (this.r != 4) {
            q0();
            this.v.clear();
            an5 an5Var2 = this.A;
            an5.b(an5Var2);
            an5Var2.d = 0;
            this.r = 4;
            w0();
        }
        this.J = context;
    }

    public static boolean R(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final void I0(RecyclerView recyclerView, int i) {
        yh7 yh7Var = new yh7(recyclerView.getContext());
        yh7Var.a = i;
        J0(yh7Var);
    }

    public final int L0(zdc zdcVar) {
        if (w() == 0) {
            return 0;
        }
        int iB = zdcVar.b();
        O0();
        View viewQ0 = Q0(iB);
        View viewS0 = S0(iB);
        if (zdcVar.b() == 0 || viewQ0 == null || viewS0 == null) {
            return 0;
        }
        return Math.min(this.B.n(), this.B.c(viewS0) - this.B.f(viewQ0));
    }

    public final int M0(zdc zdcVar) {
        if (w() == 0) {
            return 0;
        }
        int iB = zdcVar.b();
        View viewQ0 = Q0(iB);
        View viewS0 = S0(iB);
        if (zdcVar.b() != 0 && viewQ0 != null && viewS0 != null) {
            int iM = a.M(viewQ0);
            int iM2 = a.M(viewS0);
            int iAbs = Math.abs(this.B.c(viewS0) - this.B.f(viewQ0));
            int i = ((int[]) this.w.c)[iM];
            if (i != 0 && i != -1) {
                return Math.round((i * (iAbs / ((r4[iM2] - i) + 1))) + (this.B.m() - this.B.f(viewQ0)));
            }
        }
        return 0;
    }

    public final int N0(zdc zdcVar) {
        if (w() == 0) {
            return 0;
        }
        int iB = zdcVar.b();
        View viewQ0 = Q0(iB);
        View viewS0 = S0(iB);
        if (zdcVar.b() == 0 || viewQ0 == null || viewS0 == null) {
            return 0;
        }
        View viewU0 = U0(0, w());
        int iM = viewU0 == null ? -1 : a.M(viewU0);
        return (int) ((Math.abs(this.B.c(viewS0) - this.B.f(viewQ0)) / (((U0(w() - 1, -1) != null ? a.M(r4) : -1) - iM) + 1)) * zdcVar.b());
    }

    public final void O0() {
        if (this.B != null) {
            return;
        }
        if (d1()) {
            if (this.q == 0) {
                this.B = new bna(this, 0);
                this.C = new bna(this, 1);
                return;
            } else {
                this.B = new bna(this, 1);
                this.C = new bna(this, 0);
                return;
            }
        }
        if (this.q == 0) {
            this.B = new bna(this, 1);
            this.C = new bna(this, 0);
        } else {
            this.B = new bna(this, 0);
            this.C = new bna(this, 1);
        }
    }

    public final int P0(vdc vdcVar, zdc zdcVar, xk0 xk0Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        l84 l84Var;
        boolean z2;
        View view;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        Rect rect;
        l84 l84Var2;
        int i16;
        int i17 = xk0Var.g;
        if (i17 != Integer.MIN_VALUE) {
            int i18 = xk0Var.b;
            if (i18 < 0) {
                xk0Var.g = i17 + i18;
            }
            e1(vdcVar, xk0Var);
        }
        int i19 = xk0Var.b;
        boolean zD1 = d1();
        int i20 = i19;
        int i21 = 0;
        while (true) {
            if (i20 <= 0 && !this.z.c) {
                break;
            }
            List list = this.v;
            int i22 = xk0Var.e;
            if (i22 < 0 || i22 >= zdcVar.b() || (i = xk0Var.d) < 0 || i >= list.size()) {
                break;
            }
            zm5 zm5Var = (zm5) this.v.get(xk0Var.d);
            xk0Var.e = zm5Var.k;
            boolean zD12 = d1();
            an5 an5Var = this.A;
            l84 l84Var3 = this.w;
            Rect rect2 = N;
            if (zD12) {
                int iJ = J();
                int iK = K();
                int i23 = this.n;
                int i24 = xk0Var.f;
                if (xk0Var.j == -1) {
                    i24 -= zm5Var.c;
                }
                int i25 = i24;
                int i26 = xk0Var.e;
                float f = an5Var.d;
                float measuredWidth = iJ - f;
                float measuredWidth2 = (i23 - iK) - f;
                float fMax = Math.max(0.0f, 0.0f);
                int i27 = zm5Var.d;
                i2 = i19;
                int i28 = i26;
                int i29 = 0;
                while (i28 < i26 + i27) {
                    View viewZ0 = Z0(i28);
                    if (viewZ0 == null) {
                        i14 = i29;
                        i15 = i25;
                        z3 = zD1;
                        i12 = i20;
                        i13 = i21;
                        i10 = i27;
                        rect = rect2;
                        l84Var2 = l84Var3;
                        i11 = i26;
                        i16 = i28;
                    } else {
                        i10 = i27;
                        i11 = i26;
                        if (xk0Var.j == 1) {
                            d(rect2, viewZ0);
                            i12 = i20;
                            b(-1, viewZ0, false);
                        } else {
                            i12 = i20;
                            d(rect2, viewZ0);
                            b(i29, viewZ0, false);
                            i29++;
                        }
                        i13 = i21;
                        long j = ((long[]) l84Var3.d)[i28];
                        int i30 = (int) j;
                        int i31 = (int) (j >> 32);
                        if (g1(viewZ0, i30, i31, (bn5) viewZ0.getLayoutParams())) {
                            viewZ0.measure(i30, i31);
                        }
                        float f2 = ((ViewGroup.MarginLayoutParams) r8).leftMargin + ((pdc) viewZ0.getLayoutParams()).b.left + measuredWidth;
                        float f3 = measuredWidth2 - (((ViewGroup.MarginLayoutParams) r8).rightMargin + ((pdc) viewZ0.getLayoutParams()).b.right);
                        int i32 = i25 + ((pdc) viewZ0.getLayoutParams()).b.top;
                        if (this.t) {
                            i14 = i29;
                            rect = rect2;
                            i15 = i25;
                            l84Var2 = l84Var3;
                            z3 = zD1;
                            i16 = i28;
                            this.w.E(viewZ0, zm5Var, Math.round(f3) - viewZ0.getMeasuredWidth(), i32, Math.round(f3), viewZ0.getMeasuredHeight() + i32);
                        } else {
                            i14 = i29;
                            i15 = i25;
                            z3 = zD1;
                            rect = rect2;
                            l84Var2 = l84Var3;
                            i16 = i28;
                            this.w.E(viewZ0, zm5Var, Math.round(f2), i32, viewZ0.getMeasuredWidth() + Math.round(f2), viewZ0.getMeasuredHeight() + i32);
                        }
                        measuredWidth = viewZ0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r8).rightMargin + ((pdc) viewZ0.getLayoutParams()).b.right + fMax + f2;
                        measuredWidth2 = f3 - (((viewZ0.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r8).leftMargin) + ((pdc) viewZ0.getLayoutParams()).b.left) + fMax);
                    }
                    i28 = i16 + 1;
                    rect2 = rect;
                    l84Var3 = l84Var2;
                    i27 = i10;
                    i26 = i11;
                    i20 = i12;
                    i21 = i13;
                    zD1 = z3;
                    i29 = i14;
                    i25 = i15;
                }
                z = zD1;
                i3 = i20;
                i4 = i21;
                xk0Var.d += this.z.j;
                i6 = zm5Var.c;
            } else {
                i2 = i19;
                z = zD1;
                i3 = i20;
                i4 = i21;
                l84 l84Var4 = l84Var3;
                int iL = L();
                int I = I();
                int i33 = this.o;
                int i34 = xk0Var.f;
                if (xk0Var.j == -1) {
                    int i35 = zm5Var.c;
                    i5 = i34 + i35;
                    i34 -= i35;
                } else {
                    i5 = i34;
                }
                int i36 = xk0Var.e;
                float f4 = i33 - I;
                float f5 = an5Var.d;
                float f6 = iL - f5;
                float measuredHeight = f4 - f5;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i37 = zm5Var.d;
                int i38 = i36;
                int i39 = 0;
                while (i38 < i36 + i37) {
                    View viewZ02 = Z0(i38);
                    if (viewZ02 == null) {
                        l84Var = l84Var4;
                        i7 = i38;
                        i8 = i37;
                        i9 = i36;
                    } else {
                        float f7 = measuredHeight;
                        long j2 = ((long[]) l84Var4.d)[i38];
                        int i40 = (int) j2;
                        int i41 = (int) (j2 >> 32);
                        if (g1(viewZ02, i40, i41, (bn5) viewZ02.getLayoutParams())) {
                            viewZ02.measure(i40, i41);
                        }
                        float f8 = f6 + ((ViewGroup.MarginLayoutParams) r6).topMargin + ((pdc) viewZ02.getLayoutParams()).b.top;
                        float f9 = f7 - (((ViewGroup.MarginLayoutParams) r6).rightMargin + ((pdc) viewZ02.getLayoutParams()).b.bottom);
                        l84Var = l84Var4;
                        if (xk0Var.j == 1) {
                            d(rect2, viewZ02);
                            z2 = false;
                            b(-1, viewZ02, false);
                        } else {
                            z2 = false;
                            d(rect2, viewZ02);
                            b(i39, viewZ02, false);
                            i39++;
                        }
                        int i42 = i39;
                        int i43 = i34 + ((pdc) viewZ02.getLayoutParams()).b.left;
                        int i44 = i5 - ((pdc) viewZ02.getLayoutParams()).b.right;
                        boolean z4 = this.t;
                        if (!z4) {
                            view = viewZ02;
                            i7 = i38;
                            i8 = i37;
                            i9 = i36;
                            if (this.u) {
                                this.w.F(view, zm5Var, z4, i43, Math.round(f9) - view.getMeasuredHeight(), view.getMeasuredWidth() + i43, Math.round(f9));
                            } else {
                                this.w.F(view, zm5Var, z4, i43, Math.round(f8), view.getMeasuredWidth() + i43, view.getMeasuredHeight() + Math.round(f8));
                            }
                        } else if (this.u) {
                            view = viewZ02;
                            i7 = i38;
                            i8 = i37;
                            i9 = i36;
                            this.w.F(viewZ02, zm5Var, z4, i44 - viewZ02.getMeasuredWidth(), Math.round(f9) - viewZ02.getMeasuredHeight(), i44, Math.round(f9));
                        } else {
                            view = viewZ02;
                            i7 = i38;
                            i8 = i37;
                            i9 = i36;
                            this.w.F(view, zm5Var, z4, i44 - view.getMeasuredWidth(), Math.round(f8), i44, view.getMeasuredHeight() + Math.round(f8));
                        }
                        float measuredHeight2 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r6).topMargin + ((pdc) view.getLayoutParams()).b.bottom + fMax2 + f8;
                        measuredHeight = f9 - (((view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r6).bottomMargin) + ((pdc) view.getLayoutParams()).b.top) + fMax2);
                        f6 = measuredHeight2;
                        i39 = i42;
                    }
                    i38 = i7 + 1;
                    i36 = i9;
                    l84Var4 = l84Var;
                    i37 = i8;
                }
                xk0Var.d += this.z.j;
                i6 = zm5Var.c;
            }
            i21 = i4 + i6;
            if (z || !this.t) {
                xk0Var.f += zm5Var.c * xk0Var.j;
            } else {
                xk0Var.f -= zm5Var.c * xk0Var.j;
            }
            i20 = i3 - zm5Var.c;
            i19 = i2;
            zD1 = z;
        }
        int i45 = i19;
        int i46 = i21;
        int i47 = xk0Var.b - i46;
        xk0Var.b = i47;
        int i48 = xk0Var.g;
        if (i48 != Integer.MIN_VALUE) {
            int i49 = i48 + i46;
            xk0Var.g = i49;
            if (i47 < 0) {
                xk0Var.g = i49 + i47;
            }
            e1(vdcVar, xk0Var);
        }
        return i45 - xk0Var.b;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean Q() {
        return true;
    }

    public final View Q0(int i) {
        View viewV0 = V0(0, w(), i);
        if (viewV0 == null) {
            return null;
        }
        int i2 = ((int[]) this.w.c)[a.M(viewV0)];
        if (i2 == -1) {
            return null;
        }
        return R0(viewV0, (zm5) this.v.get(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View R0(android.view.View r6, defpackage.zm5 r7) {
        /*
            r5 = this;
            boolean r0 = r5.d1()
            int r7 = r7.d
            r1 = 1
        L7:
            if (r1 >= r7) goto L3f
            android.view.View r2 = r5.v(r1)
            if (r2 == 0) goto L3c
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L18
            goto L3c
        L18:
            boolean r3 = r5.t
            if (r3 == 0) goto L2d
            if (r0 != 0) goto L2d
            ga7 r3 = r5.B
            int r3 = r3.c(r6)
            ga7 r4 = r5.B
            int r4 = r4.c(r2)
            if (r3 >= r4) goto L3c
            goto L3b
        L2d:
            ga7 r3 = r5.B
            int r3 = r3.f(r6)
            ga7 r4 = r5.B
            int r4 = r4.f(r2)
            if (r3 <= r4) goto L3c
        L3b:
            r6 = r2
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.R0(android.view.View, zm5):android.view.View");
    }

    public final View S0(int i) {
        View viewV0 = V0(w() - 1, -1, i);
        if (viewV0 == null) {
            return null;
        }
        return T0(viewV0, (zm5) this.v.get(((int[]) this.w.c)[a.M(viewV0)]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View T0(android.view.View r6, defpackage.zm5 r7) {
        /*
            r5 = this;
            boolean r0 = r5.d1()
            int r1 = r5.w()
            int r1 = r1 + (-2)
            int r2 = r5.w()
            int r7 = r7.d
            int r2 = r2 - r7
            int r2 = r2 + (-1)
        L13:
            if (r1 <= r2) goto L4b
            android.view.View r7 = r5.v(r1)
            if (r7 == 0) goto L48
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 != r4) goto L24
            goto L48
        L24:
            boolean r3 = r5.t
            if (r3 == 0) goto L39
            if (r0 != 0) goto L39
            ga7 r3 = r5.B
            int r3 = r3.f(r6)
            ga7 r4 = r5.B
            int r4 = r4.f(r7)
            if (r3 <= r4) goto L48
            goto L47
        L39:
            ga7 r3 = r5.B
            int r3 = r3.c(r6)
            ga7 r4 = r5.B
            int r4 = r4.c(r7)
            if (r3 >= r4) goto L48
        L47:
            r6 = r7
        L48:
            int r1 = r1 + (-1)
            goto L13
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.T0(android.view.View, zm5):android.view.View");
    }

    public final View U0(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewV = v(i);
            int iJ = J();
            int iL = L();
            int iK = this.n - K();
            int I = this.o - I();
            int iB = a.B(viewV) - ((ViewGroup.MarginLayoutParams) ((pdc) viewV.getLayoutParams())).leftMargin;
            int iF = a.F(viewV) - ((ViewGroup.MarginLayoutParams) ((pdc) viewV.getLayoutParams())).topMargin;
            int iE = a.E(viewV) + ((ViewGroup.MarginLayoutParams) ((pdc) viewV.getLayoutParams())).rightMargin;
            int iZ = a.z(viewV) + ((ViewGroup.MarginLayoutParams) ((pdc) viewV.getLayoutParams())).bottomMargin;
            boolean z = iB >= iK || iE >= iJ;
            boolean z2 = iF >= I || iZ >= iL;
            if (z && z2) {
                return viewV;
            }
            i += i3;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.a
    public final void V() {
        q0();
    }

    public final View V0(int i, int i2, int i3) {
        int iM;
        O0();
        if (this.z == null) {
            xk0 xk0Var = new xk0(1);
            xk0Var.i = 1;
            xk0Var.j = 1;
            this.z = xk0Var;
        }
        int iM2 = this.B.m();
        int iH = this.B.h();
        int i4 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewV = v(i);
            if (viewV != null && (iM = a.M(viewV)) >= 0 && iM < i3) {
                if (((pdc) viewV.getLayoutParams()).a.p()) {
                    if (view2 == null) {
                        view2 = viewV;
                    }
                } else {
                    if (this.B.f(viewV) >= iM2 && this.B.c(viewV) <= iH) {
                        return viewV;
                    }
                    if (view == null) {
                        view = viewV;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.a
    public final void W(RecyclerView recyclerView) {
        this.K = (View) recyclerView.getParent();
    }

    public final int W0(int i, vdc vdcVar, zdc zdcVar, boolean z) {
        int iB1;
        int iH;
        if (d1() || !this.t) {
            int iH2 = this.B.h() - i;
            if (iH2 <= 0) {
                return 0;
            }
            iB1 = -b1(-iH2, vdcVar, zdcVar);
        } else {
            int iM = i - this.B.m();
            if (iM <= 0) {
                return 0;
            }
            iB1 = b1(iM, vdcVar, zdcVar);
        }
        int i2 = i + iB1;
        if (!z || (iH = this.B.h() - i2) <= 0) {
            return iB1;
        }
        this.B.r(iH);
        return iH + iB1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void X(RecyclerView recyclerView) {
    }

    public final int X0(int i, vdc vdcVar, zdc zdcVar, boolean z) {
        int iB1;
        int iM;
        if (d1() || !this.t) {
            int iM2 = i - this.B.m();
            if (iM2 <= 0) {
                return 0;
            }
            iB1 = -b1(iM2, vdcVar, zdcVar);
        } else {
            int iH = this.B.h() - i;
            if (iH <= 0) {
                return 0;
            }
            iB1 = b1(-iH, vdcVar, zdcVar);
        }
        int i2 = i + iB1;
        if (!z || (iM = i2 - this.B.m()) <= 0) {
            return iB1;
        }
        this.B.r(-iM);
        return iB1 - iM;
    }

    public final int Y0(View view) {
        return d1() ? ((pdc) view.getLayoutParams()).b.top + ((pdc) view.getLayoutParams()).b.bottom : ((pdc) view.getLayoutParams()).b.left + ((pdc) view.getLayoutParams()).b.right;
    }

    public final View Z0(int i) {
        View view = (View) this.I.get(i);
        return view != null ? view : this.x.j(i, Long.MAX_VALUE).a;
    }

    @Override // defpackage.ydc
    public final PointF a(int i) {
        View viewV;
        if (w() == 0 || (viewV = v(0)) == null) {
            return null;
        }
        int i2 = i < a.M(viewV) ? -1 : 1;
        return d1() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    public final int a1() {
        if (this.v.size() == 0) {
            return 0;
        }
        int size = this.v.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((zm5) this.v.get(i)).a);
        }
        return iMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b1(int r19, defpackage.vdc r20, defpackage.zdc r21) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.b1(int, vdc, zdc):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[PHI: r4
      0x0056: PHI (r4v7 int) = (r4v4 int), (r4v9 int) binds: [B:24:0x0053, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c1(int r5) {
        /*
            r4 = this;
            int r0 = r4.w()
            if (r0 == 0) goto L59
            if (r5 != 0) goto L9
            goto L59
        L9:
            r4.O0()
            boolean r0 = r4.d1()
            android.view.View r1 = r4.K
            if (r0 == 0) goto L19
            int r1 = r1.getWidth()
            goto L1d
        L19:
            int r1 = r1.getHeight()
        L1d:
            if (r0 == 0) goto L22
            int r0 = r4.n
            goto L24
        L22:
            int r0 = r4.o
        L24:
            int r2 = r4.H()
            r3 = 1
            an5 r4 = r4.A
            if (r2 != r3) goto L44
            int r2 = java.lang.Math.abs(r5)
            if (r5 >= 0) goto L3d
            int r4 = r4.d
            int r0 = r0 + r4
            int r0 = r0 - r1
            int r4 = java.lang.Math.min(r0, r2)
            int r4 = -r4
            goto L58
        L3d:
            int r4 = r4.d
            int r0 = r4 + r5
            if (r0 <= 0) goto L57
            goto L56
        L44:
            if (r5 <= 0) goto L4f
            int r4 = r4.d
            int r0 = r0 - r4
            int r0 = r0 - r1
            int r4 = java.lang.Math.min(r0, r5)
            goto L58
        L4f:
            int r4 = r4.d
            int r0 = r4 + r5
            if (r0 < 0) goto L56
            goto L57
        L56:
            int r5 = -r4
        L57:
            r4 = r5
        L58:
            return r4
        L59:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.c1(int):int");
    }

    @Override // androidx.recyclerview.widget.a
    public final void d0(int i, int i2) {
        h1(i);
    }

    public final boolean d1() {
        int i = this.p;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean e() {
        if (this.q == 0) {
            return d1();
        }
        if (d1()) {
            int i = this.n;
            View view = this.K;
            if (i <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e1(defpackage.vdc r10, defpackage.xk0 r11) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.e1(vdc, xk0):void");
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        if (this.q == 0) {
            return !d1();
        }
        if (d1()) {
            return true;
        }
        int i = this.o;
        View view = this.K;
        return i > (view != null ? view.getHeight() : 0);
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(int i, int i2) {
        h1(Math.min(i, i2));
    }

    public final void f1(int i) {
        if (this.p != i) {
            q0();
            this.p = i;
            this.B = null;
            this.C = null;
            this.v.clear();
            an5 an5Var = this.A;
            an5.b(an5Var);
            an5Var.d = 0;
            w0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean g(pdc pdcVar) {
        return pdcVar instanceof bn5;
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0(int i, int i2) {
        h1(i);
    }

    public final boolean g1(View view, int i, int i2, bn5 bn5Var) {
        return (!view.isLayoutRequested() && this.h && R(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) bn5Var).width) && R(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) bn5Var).height)) ? false : true;
    }

    @Override // androidx.recyclerview.widget.a
    public final void h0(int i) {
        h1(i);
    }

    public final void h1(int i) {
        View viewU0 = U0(w() - 1, -1);
        if (i >= (viewU0 != null ? a.M(viewU0) : -1)) {
            return;
        }
        int iW = w();
        l84 l84Var = this.w;
        l84Var.x(iW);
        l84Var.y(iW);
        l84Var.w(iW);
        if (i >= ((int[]) l84Var.c).length) {
            return;
        }
        this.L = i;
        View viewV = v(0);
        if (viewV == null) {
            return;
        }
        this.E = a.M(viewV);
        if (d1() || !this.t) {
            this.F = this.B.f(viewV) - this.B.m();
        } else {
            this.F = this.B.i() + this.B.c(viewV);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(RecyclerView recyclerView, int i, int i2) {
        h1(i);
        h1(i);
    }

    public final void i1(an5 an5Var, boolean z, boolean z2) {
        int i;
        if (z2) {
            int i2 = d1() ? this.m : this.l;
            this.z.c = i2 == 0 || i2 == Integer.MIN_VALUE;
        } else {
            this.z.c = false;
        }
        if (d1() || !this.t) {
            this.z.b = this.B.h() - an5Var.c;
        } else {
            this.z.b = an5Var.c - K();
        }
        xk0 xk0Var = this.z;
        xk0Var.e = an5Var.a;
        xk0Var.i = 1;
        xk0Var.j = 1;
        xk0Var.f = an5Var.c;
        xk0Var.g = Integer.MIN_VALUE;
        xk0Var.d = an5Var.b;
        if (!z || this.v.size() <= 1 || (i = an5Var.b) < 0 || i >= this.v.size() - 1) {
            return;
        }
        zm5 zm5Var = (zm5) this.v.get(an5Var.b);
        xk0 xk0Var2 = this.z;
        xk0Var2.d++;
        xk0Var2.e += zm5Var.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f0  */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(defpackage.vdc r21, defpackage.zdc r22) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.j0(vdc, zdc):void");
    }

    public final void j1(an5 an5Var, boolean z, boolean z2) {
        if (z2) {
            int i = d1() ? this.m : this.l;
            this.z.c = i == 0 || i == Integer.MIN_VALUE;
        } else {
            this.z.c = false;
        }
        if (d1() || !this.t) {
            this.z.b = an5Var.c - this.B.m();
        } else {
            this.z.b = (this.K.getWidth() - an5Var.c) - this.B.m();
        }
        xk0 xk0Var = this.z;
        xk0Var.e = an5Var.a;
        xk0Var.i = 1;
        xk0Var.j = -1;
        xk0Var.f = an5Var.c;
        xk0Var.g = Integer.MIN_VALUE;
        int i2 = an5Var.b;
        xk0Var.d = i2;
        if (!z || i2 <= 0) {
            return;
        }
        int size = this.v.size();
        int i3 = an5Var.b;
        if (size > i3) {
            zm5 zm5Var = (zm5) this.v.get(i3);
            xk0 xk0Var2 = this.z;
            xk0Var2.d--;
            xk0Var2.e -= zm5Var.d;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int k(zdc zdcVar) {
        return L0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0(zdc zdcVar) {
        this.D = null;
        this.E = -1;
        this.F = Integer.MIN_VALUE;
        this.L = -1;
        an5.b(this.A);
        this.I.clear();
    }

    public final void k1(View view, int i) {
        this.I.put(i, view);
    }

    @Override // androidx.recyclerview.widget.a
    public final int l(zdc zdcVar) {
        return M0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(Parcelable parcelable) {
        if (parcelable instanceof cn5) {
            this.D = (cn5) parcelable;
            w0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int m(zdc zdcVar) {
        return N0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final Parcelable m0() {
        cn5 cn5Var = this.D;
        if (cn5Var != null) {
            cn5 cn5Var2 = new cn5();
            cn5Var2.a = cn5Var.a;
            cn5Var2.b = cn5Var.b;
            return cn5Var2;
        }
        cn5 cn5Var3 = new cn5();
        if (w() > 0) {
            View viewV = v(0);
            cn5Var3.a = a.M(viewV);
            cn5Var3.b = this.B.f(viewV) - this.B.m();
        } else {
            cn5Var3.a = -1;
        }
        return cn5Var3;
    }

    @Override // androidx.recyclerview.widget.a
    public final int n(zdc zdcVar) {
        return L0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final int o(zdc zdcVar) {
        return M0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final int p(zdc zdcVar) {
        return N0(zdcVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final pdc s() {
        bn5 bn5Var = new bn5(-2, -2);
        bn5Var.X = 0.0f;
        bn5Var.Y = 1.0f;
        bn5Var.Z = -1;
        bn5Var.s0 = -1.0f;
        bn5Var.v0 = 16777215;
        bn5Var.w0 = 16777215;
        return bn5Var;
    }

    @Override // androidx.recyclerview.widget.a
    public final pdc t(Context context, AttributeSet attributeSet) {
        bn5 bn5Var = new bn5(context, attributeSet);
        bn5Var.X = 0.0f;
        bn5Var.Y = 1.0f;
        bn5Var.Z = -1;
        bn5Var.s0 = -1.0f;
        bn5Var.v0 = 16777215;
        bn5Var.w0 = 16777215;
        return bn5Var;
    }

    @Override // androidx.recyclerview.widget.a
    public final int x0(int i, vdc vdcVar, zdc zdcVar) {
        if (!d1() || this.q == 0) {
            int iB1 = b1(i, vdcVar, zdcVar);
            this.I.clear();
            return iB1;
        }
        int iC1 = c1(i);
        this.A.d += iC1;
        this.C.r(-iC1);
        return iC1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void y0(int i) {
        this.E = i;
        this.F = Integer.MIN_VALUE;
        cn5 cn5Var = this.D;
        if (cn5Var != null) {
            cn5Var.a = -1;
        }
        w0();
    }

    @Override // androidx.recyclerview.widget.a
    public final int z0(int i, vdc vdcVar, zdc zdcVar) {
        if (d1() || (this.q == 0 && !d1())) {
            int iB1 = b1(i, vdcVar, zdcVar);
            this.I.clear();
            return iB1;
        }
        int iC1 = c1(i);
        this.A.d += iC1;
        this.C.r(-iC1);
        return iC1;
    }
}
