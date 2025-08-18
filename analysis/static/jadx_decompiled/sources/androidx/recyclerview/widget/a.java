package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.b23;
import defpackage.cec;
import defpackage.dec;
import defpackage.fd7;
import defpackage.g03;
import defpackage.gaa;
import defpackage.hdc;
import defpackage.j4;
import defpackage.l0f;
import defpackage.l4;
import defpackage.l7b;
import defpackage.mdc;
import defpackage.odc;
import defpackage.pdc;
import defpackage.sy4;
import defpackage.u2c;
import defpackage.vdc;
import defpackage.yh7;
import defpackage.zdc;
import defpackage.zmf;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class a {
    public l0f a;
    public RecyclerView b;
    public final l7b c;
    public final l7b d;
    public yh7 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public a() {
        fd7 fd7Var = new fd7(this);
        gaa gaaVar = new gaa(this);
        this.c = new l7b(fd7Var);
        this.d = new l7b(gaaVar);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int B(View view) {
        return view.getLeft() - ((pdc) view.getLayoutParams()).b.left;
    }

    public static int C(View view) {
        Rect rect = ((pdc) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int D(View view) {
        Rect rect = ((pdc) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int E(View view) {
        return view.getRight() + ((pdc) view.getLayoutParams()).b.right;
    }

    public static int F(View view) {
        return view.getTop() - ((pdc) view.getLayoutParams()).b.top;
    }

    public static int M(View view) {
        return ((pdc) view.getLayoutParams()).a.i();
    }

    public static odc N(Context context, AttributeSet attributeSet, int i, int i2) {
        odc odcVar = new odc();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u2c.RecyclerView, i, i2);
        odcVar.a = typedArrayObtainStyledAttributes.getInt(u2c.RecyclerView_android_orientation, 1);
        odcVar.b = typedArrayObtainStyledAttributes.getInt(u2c.RecyclerView_spanCount, 1);
        odcVar.c = typedArrayObtainStyledAttributes.getBoolean(u2c.RecyclerView_reverseLayout, false);
        odcVar.d = typedArrayObtainStyledAttributes.getBoolean(u2c.RecyclerView_stackFromEnd, false);
        typedArrayObtainStyledAttributes.recycle();
        return odcVar;
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

    public static int h(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int x(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.x(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        return view.getBottom() + ((pdc) view.getLayoutParams()).b.bottom;
    }

    public void A(Rect rect, View view) {
        RecyclerView.V(rect, view);
    }

    public final void A0(RecyclerView recyclerView) {
        B0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void B0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.P1) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 != 0 || RecyclerView.P1) {
            return;
        }
        this.o = 0;
    }

    public void C0(Rect rect, int i, int i2) {
        int iK = K() + J() + rect.width();
        int I = I() + L() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = zmf.a;
        this.b.setMeasuredDimension(h(i, iK, recyclerView.getMinimumWidth()), h(i2, I, this.b.getMinimumHeight()));
    }

    public final void D0(int i, int i2) {
        int iW = w();
        if (iW == 0) {
            this.b.t(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iW; i7++) {
            View viewV = v(i7);
            Rect rect = this.b.x0;
            A(rect, viewV);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.x0.set(i6, i4, i3, i5);
        C0(this.b.x0, i, i2);
    }

    public final void E0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.t0;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    final boolean F0(View view, int i, int i2, pdc pdcVar) {
        return (!view.isLayoutRequested() && this.h && R(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) pdcVar).width) && R(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) pdcVar).height)) ? false : true;
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        hdc adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.j();
        }
        return 0;
    }

    public boolean G0() {
        return false;
    }

    public final int H() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = zmf.a;
        return recyclerView.getLayoutDirection();
    }

    public final boolean H0(View view, int i, int i2, pdc pdcVar) {
        return (this.h && R(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) pdcVar).width) && R(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) pdcVar).height)) ? false : true;
    }

    public final int I() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public abstract void I0(RecyclerView recyclerView, int i);

    public final int J() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final void J0(yh7 yh7Var) {
        yh7 yh7Var2 = this.e;
        if (yh7Var2 != null && yh7Var != yh7Var2 && yh7Var2.e) {
            yh7Var2.l();
        }
        this.e = yh7Var;
        RecyclerView recyclerView = this.b;
        cec cecVar = recyclerView.p1;
        cecVar.Z.removeCallbacks(cecVar);
        cecVar.c.abortAnimation();
        yh7Var.b = recyclerView;
        yh7Var.c = this;
        int i = yh7Var.a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.s1.a = i;
        yh7Var.e = true;
        yh7Var.d = true;
        yh7Var.f = recyclerView.B0.r(i);
        yh7Var.b.p1.b();
    }

    public final int K() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public boolean K0() {
        return false;
    }

    public final int L() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int O(vdc vdcVar, zdc zdcVar) {
        return -1;
    }

    public final void P(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((pdc) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.z0;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean Q();

    public void S(View view, int i, int i2, int i3, int i4) {
        pdc pdcVar = (pdc) view.getLayoutParams();
        Rect rect = pdcVar.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) pdcVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) pdcVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) pdcVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pdcVar).bottomMargin);
    }

    public void T(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iZ = recyclerView.t0.z();
            for (int i2 = 0; i2 < iZ; i2++) {
                recyclerView.t0.y(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void U(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.c0(i);
        }
    }

    public void V() {
    }

    public void W(RecyclerView recyclerView) {
    }

    public abstract void X(RecyclerView recyclerView);

    public View Y(View view, int i, vdc vdcVar, zdc zdcVar) {
        return null;
    }

    public void Z(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        vdc vdcVar = recyclerView.c;
        zdc zdcVar = recyclerView.s1;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        hdc hdcVar = this.b.A0;
        if (hdcVar != null) {
            accessibilityEvent.setItemCount(hdcVar.j());
        }
    }

    public void a0(vdc vdcVar, zdc zdcVar, l4 l4Var) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            l4Var.a(8192);
            l4Var.j(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            l4Var.a(4096);
            l4Var.j(true);
        }
        l4Var.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j4.a(O(vdcVar, zdcVar), y(vdcVar, zdcVar), 0).a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r8, android.view.View r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.b(int, android.view.View, boolean):void");
    }

    public void b0(vdc vdcVar, zdc zdcVar, View view, l4 l4Var) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.n(str);
        }
    }

    public final void c0(View view, l4 l4Var) {
        dec decVarU = RecyclerView.U(view);
        if (decVarU == null || decVarU.p() || ((ArrayList) this.a.Y).contains(decVarU.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        b0(recyclerView.c, recyclerView.s1, view, l4Var);
    }

    public final void d(Rect rect, View view) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public void d0(int i, int i2) {
    }

    public abstract boolean e();

    public void e0() {
    }

    public abstract boolean f();

    public void f0(int i, int i2) {
    }

    public boolean g(pdc pdcVar) {
        return pdcVar != null;
    }

    public void g0(int i, int i2) {
    }

    public void h0(int i) {
    }

    public void i(int i, int i2, zdc zdcVar, b23 b23Var) {
    }

    public void i0(RecyclerView recyclerView, int i, int i2) {
        h0(i);
    }

    public void j(int i, b23 b23Var) {
    }

    public abstract void j0(vdc vdcVar, zdc zdcVar);

    public abstract int k(zdc zdcVar);

    public abstract void k0(zdc zdcVar);

    public abstract int l(zdc zdcVar);

    public void l0(Parcelable parcelable) {
    }

    public abstract int m(zdc zdcVar);

    public Parcelable m0() {
        return null;
    }

    public abstract int n(zdc zdcVar);

    public void n0(int i) {
    }

    public abstract int o(zdc zdcVar);

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[PHI: r3
      0x0061: PHI (r3v8 int) = (r3v5 int), (r3v11 int) binds: [B:28:0x007d, B:20:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o0(defpackage.vdc r3, defpackage.zdc r4, int r5, android.os.Bundle r6) {
        /*
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r2.b
            r4 = 0
            if (r3 != 0) goto L6
            return r4
        L6:
            int r3 = r2.o
            int r6 = r2.n
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r2.b
            android.graphics.Matrix r1 = r1.getMatrix()
            boolean r1 = r1.isIdentity()
            if (r1 == 0) goto L2b
            androidx.recyclerview.widget.RecyclerView r1 = r2.b
            boolean r1 = r1.getGlobalVisibleRect(r0)
            if (r1 == 0) goto L2b
            int r3 = r0.height()
            int r6 = r0.width()
        L2b:
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 1
            if (r5 == r0) goto L63
            r0 = 8192(0x2000, float:1.148E-41)
            if (r5 == r0) goto L37
            r3 = r4
            r5 = r3
            goto L8a
        L37:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            r0 = -1
            boolean r5 = r5.canScrollVertically(r0)
            if (r5 == 0) goto L4c
            int r5 = r2.L()
            int r3 = r3 - r5
            int r5 = r2.I()
            int r3 = r3 - r5
            int r3 = -r3
            goto L4d
        L4c:
            r3 = r4
        L4d:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            boolean r5 = r5.canScrollHorizontally(r0)
            if (r5 == 0) goto L61
            int r5 = r2.J()
            int r6 = r6 - r5
            int r5 = r2.K()
            int r6 = r6 - r5
            int r5 = -r6
            goto L8a
        L61:
            r5 = r4
            goto L8a
        L63:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L76
            int r5 = r2.L()
            int r3 = r3 - r5
            int r5 = r2.I()
            int r3 = r3 - r5
            goto L77
        L76:
            r3 = r4
        L77:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            boolean r5 = r5.canScrollHorizontally(r1)
            if (r5 == 0) goto L61
            int r5 = r2.J()
            int r6 = r6 - r5
            int r5 = r2.K()
            int r5 = r6 - r5
        L8a:
            if (r3 != 0) goto L8f
            if (r5 != 0) goto L8f
            return r4
        L8f:
            androidx.recyclerview.widget.RecyclerView r2 = r2.b
            r2.A0(r5, r3, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.o0(vdc, zdc, int, android.os.Bundle):boolean");
    }

    public abstract int p(zdc zdcVar);

    public void p0() {
        w0();
    }

    public final void q(vdc vdcVar) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            dec decVarU = RecyclerView.U(viewV);
            if (decVarU.w()) {
                if (RecyclerView.M1) {
                    decVarU.toString();
                }
            } else if (!decVarU.n() || decVarU.p() || this.b.A0.b) {
                v(iW);
                this.a.r(iW);
                vdcVar.i(viewV);
                this.b.u0.o(decVarU);
            } else {
                if (v(iW) != null) {
                    this.a.R(iW);
                }
                vdcVar.h(decVarU);
            }
        }
    }

    public final void q0() {
        for (int iW = w() - 1; iW >= 0; iW--) {
            this.a.R(iW);
        }
    }

    public View r(int i) {
        int iW = w();
        for (int i2 = 0; i2 < iW; i2++) {
            View viewV = v(i2);
            dec decVarU = RecyclerView.U(viewV);
            if (decVarU != null && decVarU.i() == i && !decVarU.w() && (this.b.s1.h || !decVarU.p())) {
                return viewV;
            }
        }
        return null;
    }

    public final void r0(vdc vdcVar) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            if (!RecyclerView.U(v(iW)).w()) {
                u0(iW, vdcVar);
            }
        }
    }

    public abstract pdc s();

    public final void s0(vdc vdcVar) {
        int size = vdcVar.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((dec) vdcVar.a.get(i)).a;
            dec decVarU = RecyclerView.U(view);
            if (!decVarU.w()) {
                decVarU.v(false);
                if (decVarU.r()) {
                    this.b.removeDetachedView(view, false);
                }
                mdc mdcVar = this.b.a1;
                if (mdcVar != null) {
                    mdcVar.d(decVarU);
                }
                decVarU.v(true);
                dec decVarU2 = RecyclerView.U(view);
                decVarU2.y0 = null;
                decVarU2.z0 = false;
                decVarU2.u0 &= -33;
                vdcVar.h(decVarU2);
            }
        }
        vdcVar.a.clear();
        ArrayList arrayList = vdcVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public pdc t(Context context, AttributeSet attributeSet) {
        return new pdc(context, attributeSet);
    }

    public final void t0(View view, vdc vdcVar) {
        l0f l0fVar = this.a;
        sy4 sy4Var = (sy4) l0fVar.o;
        int i = l0fVar.b;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            l0fVar.b = 1;
            l0fVar.c = view;
            int iIndexOfChild = ((RecyclerView) sy4Var.b).indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((g03) l0fVar.X).Z(iIndexOfChild)) {
                    l0fVar.X(view);
                }
                sy4Var.M(iIndexOfChild);
            }
            l0fVar.b = 0;
            l0fVar.c = null;
            vdcVar.g(view);
        } catch (Throwable th) {
            l0fVar.b = 0;
            l0fVar.c = null;
            throw th;
        }
    }

    public pdc u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pdc ? new pdc((pdc) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new pdc((ViewGroup.MarginLayoutParams) layoutParams) : new pdc(layoutParams);
    }

    public final void u0(int i, vdc vdcVar) {
        View viewV = v(i);
        if (v(i) != null) {
            this.a.R(i);
        }
        vdcVar.g(viewV);
    }

    public final View v(int i) {
        l0f l0fVar = this.a;
        if (l0fVar != null) {
            return l0fVar.y(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean v0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.J()
            int r1 = r8.L()
            int r2 = r8.n
            int r3 = r8.K()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.I()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.H()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.J()
            int r2 = r8.L()
            int r3 = r8.n
            int r4 = r8.K()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.I()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.x0
            r8.A(r5, r13)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto Lb3
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto Lb3
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto Lb3
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            goto Lbd
        Lba:
            r9.A0(r11, r10, r0)
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.v0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final int w() {
        l0f l0fVar = this.a;
        if (l0fVar != null) {
            return l0fVar.z();
        }
        return 0;
    }

    public final void w0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int x0(int i, vdc vdcVar, zdc zdcVar);

    public int y(vdc vdcVar, zdc zdcVar) {
        return -1;
    }

    public abstract void y0(int i);

    public abstract int z0(int i, vdc vdcVar, zdc zdcVar);
}
