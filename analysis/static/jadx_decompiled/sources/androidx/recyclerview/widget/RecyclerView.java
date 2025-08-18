package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.aec;
import defpackage.anf;
import defpackage.au1;
import defpackage.b23;
import defpackage.bec;
import defpackage.c77;
import defpackage.ca6;
import defpackage.cec;
import defpackage.dec;
import defpackage.djb;
import defpackage.ey1;
import defpackage.fec;
import defpackage.g03;
import defpackage.g34;
import defpackage.gdc;
import defpackage.hdc;
import defpackage.hn9;
import defpackage.inf;
import defpackage.ixc;
import defpackage.jn9;
import defpackage.jt;
import defpackage.k61;
import defpackage.kdc;
import defpackage.kp;
import defpackage.l0f;
import defpackage.ldc;
import defpackage.mdc;
import defpackage.ms2;
import defpackage.ndc;
import defpackage.omf;
import defpackage.pdc;
import defpackage.pz4;
import defpackage.qdc;
import defpackage.qpd;
import defpackage.r5b;
import defpackage.rdc;
import defpackage.re6;
import defpackage.rmf;
import defpackage.rtb;
import defpackage.s5b;
import defpackage.sdc;
import defpackage.ssb;
import defpackage.sy4;
import defpackage.tdc;
import defpackage.u2c;
import defpackage.umf;
import defpackage.vdc;
import defpackage.w8;
import defpackage.wdc;
import defpackage.wv7;
import defpackage.x8;
import defpackage.xdc;
import defpackage.y53;
import defpackage.yb4;
import defpackage.ydc;
import defpackage.yh7;
import defpackage.zb5;
import defpackage.zdc;
import defpackage.zmf;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ixc, hn9 {
    public static boolean L1 = false;
    public static boolean M1 = false;
    public static final int[] N1 = {R.attr.nestedScrollingEnabled};
    public static final float O1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean P1 = true;
    public static final boolean Q1 = true;
    public static final boolean R1 = true;
    public static final Class[] S1;
    public static final c77 T1;
    public static final aec U1;
    public hdc A0;
    public final int[] A1;
    public a B0;
    public jn9 B1;
    public final ArrayList C0;
    public final int[] C1;
    public final ArrayList D0;
    public final int[] D1;
    public final ArrayList E0;
    public final int[] E1;
    public sdc F0;
    public final ArrayList F1;
    public boolean G0;
    public final gdc G1;
    public boolean H0;
    public boolean H1;
    public boolean I0;
    public int I1;
    public int J0;
    public int J1;
    public boolean K0;
    public final ey1 K1;
    public boolean L0;
    public boolean M0;
    public int N0;
    public boolean O0;
    public final AccessibilityManager P0;
    public ArrayList Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public int U0;
    public ldc V0;
    public EdgeEffect W0;
    public EdgeEffect X0;
    public EdgeEffect Y0;
    public EdgeEffect Z0;
    public final float a;
    public mdc a1;
    public final pz4 b;
    public int b1;
    public final vdc c;
    public int c1;
    public VelocityTracker d1;
    public int e1;
    public int f1;
    public int g1;
    public int h1;
    public int i1;
    public rdc j1;
    public final int k1;
    public final int l1;
    public final float m1;
    public final float n1;
    public xdc o;
    public boolean o1;
    public final cec p1;
    public ca6 q1;
    public final b23 r1;
    public final x8 s0;
    public final zdc s1;
    public final l0f t0;
    public tdc t1;
    public final djb u0;
    public ArrayList u1;
    public boolean v0;
    public boolean v1;
    public final gdc w0;
    public boolean w1;
    public final Rect x0;
    public final re6 x1;
    public final Rect y0;
    public boolean y1;
    public final RectF z0;
    public fec z1;

    static {
        Class cls = Integer.TYPE;
        S1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        T1 = new c77(2);
        U1 = new aec();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ssb.recyclerViewStyle);
    }

    public static RecyclerView L(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewL = L(viewGroup.getChildAt(i));
            if (recyclerViewL != null) {
                return recyclerViewL;
            }
        }
        return null;
    }

    public static int R(View view) {
        dec decVarU = U(view);
        if (decVarU != null) {
            return decVarU.g();
        }
        return -1;
    }

    public static int S(View view) {
        dec decVarU = U(view);
        if (decVarU != null) {
            return decVarU.i();
        }
        return -1;
    }

    public static dec U(View view) {
        if (view == null) {
            return null;
        }
        return ((pdc) view.getLayoutParams()).a;
    }

    public static void V(Rect rect, View view) {
        pdc pdcVar = (pdc) view.getLayoutParams();
        Rect rect2 = pdcVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pdcVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pdcVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pdcVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pdcVar).bottomMargin);
    }

    private jn9 getScrollingChildHelper() {
        if (this.B1 == null) {
            this.B1 = new jn9(this);
        }
        return this.B1;
    }

    public static void o(dec decVar) {
        WeakReference weakReference = decVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == decVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            decVar.b = null;
        }
    }

    public static int r(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && kp.k(edgeEffect) != 0.0f) {
            int iRound = Math.round(kp.q(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || kp.k(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(kp.q(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        L1 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        M1 = z;
    }

    public final void A(int i, int i2) {
        this.U0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        tdc tdcVar = this.t1;
        if (tdcVar != null) {
            tdcVar.b(this, i, i2);
        }
        ArrayList arrayList = this.u1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((tdc) this.u1.get(size)).b(this, i, i2);
            }
        }
        this.U0--;
    }

    public final void A0(int i, int i2, boolean z) {
        a aVar = this.B0;
        if (aVar == null || this.L0) {
            return;
        }
        if (!aVar.e()) {
            i = 0;
        }
        if (!this.B0.f()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().h(i3, 1);
        }
        this.p1.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void B() {
        if (this.Z0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.V0.a(this, 3);
        this.Z0 = edgeEffectA;
        if (this.v0) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void B0(int i) {
        a aVar;
        if (this.L0 || (aVar = this.B0) == null) {
            return;
        }
        aVar.I0(this, i);
    }

    public final void C() {
        if (this.W0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.V0.a(this, 0);
        this.W0 = edgeEffectA;
        if (this.v0) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void C0() {
        int i = this.J0 + 1;
        this.J0 = i;
        if (i != 1 || this.L0) {
            return;
        }
        this.K0 = false;
    }

    public final void D() {
        if (this.Y0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.V0.a(this, 2);
        this.Y0 = edgeEffectA;
        if (this.v0) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void D0(boolean z) {
        if (this.J0 < 1) {
            if (L1) {
                throw new IllegalStateException(ms2.e(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.J0 = 1;
        }
        if (!z && !this.L0) {
            this.K0 = false;
        }
        if (this.J0 == 1) {
            if (z && this.K0 && !this.L0 && this.B0 != null && this.A0 != null) {
                v();
            }
            if (!this.L0) {
                this.K0 = false;
            }
        }
        this.J0--;
    }

    public final void E() {
        if (this.X0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.V0.a(this, 1);
        this.X0 = edgeEffectA;
        if (this.v0) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void E0() {
        yh7 yh7Var;
        setScrollState(0);
        cec cecVar = this.p1;
        cecVar.Z.removeCallbacks(cecVar);
        cecVar.c.abortAnimation();
        a aVar = this.B0;
        if (aVar == null || (yh7Var = aVar.e) == null) {
            return;
        }
        yh7Var.l();
    }

    public final String F() {
        return " " + super.toString() + ", adapter:" + this.A0 + ", layout:" + this.B0 + ", context:" + getContext();
    }

    public final void G(zdc zdcVar) {
        if (getScrollState() != 2) {
            zdcVar.getClass();
            return;
        }
        OverScroller overScroller = this.p1.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        zdcVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View H(float f, float f2) {
        for (int iZ = this.t0.z() - 1; iZ >= 0; iZ--) {
            View viewY = this.t0.y(iZ);
            float translationX = viewY.getTranslationX();
            float translationY = viewY.getTranslationY();
            if (f >= viewY.getLeft() + translationX && f <= viewY.getRight() + translationX && f2 >= viewY.getTop() + translationY && f2 <= viewY.getBottom() + translationY) {
                return viewY;
            }
        }
        return null;
    }

    public final View I(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean J(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.E0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sdc sdcVar = (sdc) arrayList.get(i);
            if (sdcVar.c(this, motionEvent) && action != 3) {
                this.F0 = sdcVar;
                return true;
            }
        }
        return false;
    }

    public final void K(int[] iArr) {
        int iZ = this.t0.z();
        if (iZ == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iZ; i3++) {
            dec decVarU = U(this.t0.y(i3));
            if (!decVarU.w()) {
                int i4 = decVarU.i();
                if (i4 < i) {
                    i = i4;
                }
                if (i4 > i2) {
                    i2 = i4;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final dec M(int i) {
        dec decVar = null;
        if (this.R0) {
            return null;
        }
        int iD = this.t0.D();
        for (int i2 = 0; i2 < iD; i2++) {
            dec decVarU = U(this.t0.C(i2));
            if (decVarU != null && !decVarU.p() && P(decVarU) == i) {
                if (!this.t0.H(decVarU.a)) {
                    return decVarU;
                }
                decVar = decVarU;
            }
        }
        return decVar;
    }

    public final dec N(long j) {
        hdc hdcVar = this.A0;
        dec decVar = null;
        if (hdcVar != null && hdcVar.b) {
            int iD = this.t0.D();
            for (int i = 0; i < iD; i++) {
                dec decVarU = U(this.t0.C(i));
                if (decVarU != null && !decVarU.p() && decVarU.X == j) {
                    if (!this.t0.H(decVarU.a)) {
                        return decVarU;
                    }
                    decVar = decVarU;
                }
            }
        }
        return decVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public final boolean O(int i, int i2) {
        int iMax;
        int i3;
        int minFlingVelocity;
        yh7 yh7VarC;
        int iJ;
        a aVar = this.B0;
        if (aVar == null || this.L0) {
            return false;
        }
        int iE = aVar.e();
        boolean zF = this.B0.f();
        int i4 = this.k1;
        if (iE == 0 || Math.abs(i) < i4) {
            i = 0;
        }
        if (!zF || Math.abs(i2) < i4) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.W0;
            if (edgeEffect == null || kp.k(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.Y0;
                if (edgeEffect2 != null && kp.k(edgeEffect2) != 0.0f) {
                    if (z0(this.Y0, i, getWidth())) {
                        this.Y0.onAbsorb(i);
                        i = 0;
                    }
                    iMax = i;
                    i = 0;
                }
                iMax = 0;
            } else {
                int i5 = -i;
                if (z0(this.W0, i5, getWidth())) {
                    this.W0.onAbsorb(i5);
                    i = 0;
                }
                iMax = i;
                i = 0;
            }
        }
        if (i2 == 0) {
            i3 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.X0;
            if (edgeEffect3 == null || kp.k(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.Z0;
                if (edgeEffect4 != null && kp.k(edgeEffect4) != 0.0f) {
                    if (z0(this.Z0, i2, getHeight())) {
                        this.Z0.onAbsorb(i2);
                        i2 = 0;
                    }
                    i3 = 0;
                }
                i3 = i2;
                i2 = 0;
            } else {
                int i6 = -i2;
                if (z0(this.X0, i6, getHeight())) {
                    this.X0.onAbsorb(i6);
                    i2 = 0;
                }
                i3 = 0;
            }
        }
        cec cecVar = this.p1;
        int i7 = this.l1;
        if (iMax != 0 || i2 != 0) {
            int i8 = -i7;
            iMax = Math.max(i8, Math.min(iMax, i7));
            i2 = Math.max(i8, Math.min(i2, i7));
            cecVar.a(iMax, i2);
        }
        if (i == 0 && i3 == 0) {
            return (iMax == 0 && i2 == 0) ? false : true;
        }
        float f = i;
        float f2 = i3;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iE != 0 || zF;
            dispatchNestedFling(f, f2, z);
            rdc rdcVar = this.j1;
            if (rdcVar != null) {
                g34 g34Var = (g34) rdcVar;
                a layoutManager = g34Var.a.getLayoutManager();
                if (layoutManager != null && g34Var.a.getAdapter() != null && ((Math.abs(i3) > (minFlingVelocity = g34Var.a.getMinFlingVelocity()) || Math.abs(i) > minFlingVelocity) && (layoutManager instanceof ydc) && (yh7VarC = g34Var.c(layoutManager)) != null && (iJ = g34Var.j(layoutManager, i, i3)) != -1)) {
                    yh7VarC.a = iJ;
                    layoutManager.J0(yh7VarC);
                    return true;
                }
            }
            if (z) {
                if (zF) {
                    iE = (iE == true ? 1 : 0) | 2;
                }
                getScrollingChildHelper().h(iE, 1);
                int i9 = -i7;
                cecVar.a(Math.max(i9, Math.min(i, i7)), Math.max(i9, Math.min(i3, i7)));
                return true;
            }
        }
        return false;
    }

    public final int P(dec decVar) {
        if (decVar.k(524) || !decVar.m()) {
            return -1;
        }
        x8 x8Var = this.s0;
        int i = decVar.c;
        ArrayList arrayList = (ArrayList) x8Var.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            w8 w8Var = (w8) arrayList.get(i2);
            int i3 = w8Var.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = w8Var.b;
                    if (i4 <= i) {
                        int i5 = w8Var.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = w8Var.b;
                    if (i6 == i) {
                        i = w8Var.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (w8Var.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (w8Var.b <= i) {
                i += w8Var.d;
            }
        }
        return i;
    }

    public final long Q(dec decVar) {
        return this.A0.b ? decVar.X : decVar.c;
    }

    public final dec T(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return U(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect W(View view) {
        pdc pdcVar = (pdc) view.getLayoutParams();
        boolean z = pdcVar.c;
        Rect rect = pdcVar.b;
        if (!z) {
            return rect;
        }
        zdc zdcVar = this.s1;
        if (zdcVar.h && (pdcVar.a.s() || pdcVar.a.n())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.D0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.x0;
            rect2.set(0, 0, 0, 0);
            ((ndc) arrayList.get(i)).f(rect2, view, this, zdcVar);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pdcVar.c = false;
        return rect;
    }

    public final boolean X() {
        return !this.I0 || this.R0 || this.s0.D();
    }

    public void Y() {
        if (this.D0.size() == 0) {
            return;
        }
        a aVar = this.B0;
        if (aVar != null) {
            aVar.c("Cannot invalidate item decorations during a scroll or layout");
        }
        b0();
        requestLayout();
    }

    public final boolean Z() {
        return this.T0 > 0;
    }

    @Override // defpackage.hn9
    public final void a(int i) {
        getScrollingChildHelper().i(i);
    }

    public final void a0(int i) {
        if (this.B0 == null) {
            return;
        }
        setScrollState(2);
        this.B0.y0(i);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        a aVar = this.B0;
        if (aVar != null) {
            aVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0() {
        int iD = this.t0.D();
        for (int i = 0; i < iD; i++) {
            ((pdc) this.t0.C(i).getLayoutParams()).c = true;
        }
        vdc vdcVar = this.c;
        int size = vdcVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            pdc pdcVar = (pdc) ((dec) vdcVar.c.get(i2)).a.getLayoutParams();
            if (pdcVar != null) {
                pdcVar.c = true;
            }
        }
    }

    public final void c0(int i) {
        int iZ = this.t0.z();
        for (int i2 = 0; i2 < iZ; i2++) {
            this.t0.y(i2).offsetTopAndBottom(i);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof pdc) && this.B0.g((pdc) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        a aVar = this.B0;
        if (aVar != null && aVar.e()) {
            return this.B0.k(this.s1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        a aVar = this.B0;
        if (aVar != null && aVar.e()) {
            return this.B0.l(this.s1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        a aVar = this.B0;
        if (aVar != null && aVar.e()) {
            return this.B0.m(this.s1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        a aVar = this.B0;
        if (aVar != null && aVar.f()) {
            return this.B0.n(this.s1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        a aVar = this.B0;
        if (aVar != null && aVar.f()) {
            return this.B0.o(this.s1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        a aVar = this.B0;
        if (aVar != null && aVar.f()) {
            return this.B0.p(this.s1);
        }
        return 0;
    }

    public final void d0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iD = this.t0.D();
        for (int i4 = 0; i4 < iD; i4++) {
            dec decVarU = U(this.t0.C(i4));
            if (decVarU != null && !decVarU.w()) {
                int i5 = decVarU.c;
                zdc zdcVar = this.s1;
                if (i5 >= i3) {
                    if (M1) {
                        decVarU.toString();
                    }
                    decVarU.t(-i2, z);
                    zdcVar.g = true;
                } else if (i5 >= i) {
                    if (M1) {
                        decVarU.toString();
                    }
                    decVarU.f(8);
                    decVarU.t(-i2, z);
                    decVarU.c = i - 1;
                    zdcVar.g = true;
                }
            }
        }
        vdc vdcVar = this.c;
        for (int size = vdcVar.c.size() - 1; size >= 0; size--) {
            dec decVar = (dec) vdcVar.c.get(size);
            if (decVar != null) {
                int i6 = decVar.c;
                if (i6 >= i3) {
                    if (M1) {
                        decVar.toString();
                    }
                    decVar.t(-i2, z);
                } else if (i6 >= i) {
                    decVar.f(8);
                    vdcVar.f(size);
                }
            }
        }
        requestLayout();
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.D0;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((ndc) arrayList.get(i)).h(canvas, this);
        }
        EdgeEffect edgeEffect = this.W0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.v0 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.W0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.X0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.v0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.X0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.Y0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.v0 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.Y0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.Z0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.v0) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.Z0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.a1 == null || arrayList.size() <= 0 || !this.a1.f()) ? z : true) {
            WeakHashMap weakHashMap = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0() {
        this.T0++;
    }

    public final void f0(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.T0 - 1;
        this.T0 = i2;
        if (i2 < 1) {
            if (L1 && i2 < 0) {
                throw new IllegalStateException(ms2.e(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.T0 = 0;
            if (z) {
                int i3 = this.N0;
                this.N0 = 0;
                if (i3 != 0 && (accessibilityManager = this.P0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.F1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    dec decVar = (dec) arrayList.get(size);
                    if (decVar.a.getParent() == this && !decVar.w() && (i = decVar.B0) != -1) {
                        WeakHashMap weakHashMap = zmf.a;
                        decVar.a.setImportantForAccessibility(i);
                        decVar.B0 = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.c1) {
            int i = actionIndex == 0 ? 1 : 0;
            this.c1 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.g1 = x;
            this.e1 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.h1 = y;
            this.f1 = y;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = this.B0;
        if (aVar != null) {
            return aVar.s();
        }
        throw new IllegalStateException(ms2.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        a aVar = this.B0;
        if (aVar != null) {
            return aVar.t(getContext(), attributeSet);
        }
        throw new IllegalStateException(ms2.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public hdc getAdapter() {
        return this.A0;
    }

    @Override // android.view.View
    public int getBaseline() {
        a aVar = this.B0;
        if (aVar == null) {
            return super.getBaseline();
        }
        aVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.v0;
    }

    public fec getCompatAccessibilityDelegate() {
        return this.z1;
    }

    public ldc getEdgeEffectFactory() {
        return this.V0;
    }

    public mdc getItemAnimator() {
        return this.a1;
    }

    public int getItemDecorationCount() {
        return this.D0.size();
    }

    public a getLayoutManager() {
        return this.B0;
    }

    public int getMaxFlingVelocity() {
        return this.l1;
    }

    public int getMinFlingVelocity() {
        return this.k1;
    }

    public long getNanoTime() {
        if (R1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public rdc getOnFlingListener() {
        return this.j1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.o1;
    }

    public b getRecycledViewPool() {
        return this.c.c();
    }

    public int getScrollState() {
        return this.b1;
    }

    public void h0() {
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(dec decVar) {
        View view = decVar.a;
        boolean z = view.getParent() == this;
        this.c.k(T(view));
        if (decVar.r()) {
            this.t0.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.t0.a(-1, view, true);
            return;
        }
        l0f l0fVar = this.t0;
        int iIndexOfChild = ((RecyclerView) ((sy4) l0fVar.o).b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((g03) l0fVar.X).b0(iIndexOfChild);
            l0fVar.E(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void i0() {
        if (this.y1 || !this.G0) {
            return;
        }
        WeakHashMap weakHashMap = zmf.a;
        postOnAnimation(this.G1);
        this.y1 = true;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.G0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.L0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(ndc ndcVar) {
        a aVar = this.B0;
        if (aVar != null) {
            aVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.D0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(ndcVar);
        b0();
        requestLayout();
    }

    public final void j0() {
        boolean z;
        boolean z2 = false;
        if (this.R0) {
            x8 x8Var = this.s0;
            x8Var.M((ArrayList) x8Var.c);
            x8Var.M((ArrayList) x8Var.o);
            x8Var.a = 0;
            if (this.S0) {
                this.B0.e0();
            }
        }
        if (this.a1 == null || !this.B0.K0()) {
            this.s0.m();
        } else {
            this.s0.K();
        }
        boolean z3 = this.v1 || this.w1;
        boolean z4 = this.I0 && this.a1 != null && ((z = this.R0) || z3 || this.B0.f) && (!z || this.A0.b);
        zdc zdcVar = this.s1;
        zdcVar.k = z4;
        if (z4 && z3 && !this.R0 && this.a1 != null && this.B0.K0()) {
            z2 = true;
        }
        zdcVar.l = z2;
    }

    public final void k(qdc qdcVar) {
        if (this.Q0 == null) {
            this.Q0 = new ArrayList();
        }
        this.Q0.add(qdcVar);
    }

    public final void k0(boolean z) {
        this.S0 = z | this.S0;
        this.R0 = true;
        int iD = this.t0.D();
        for (int i = 0; i < iD; i++) {
            dec decVarU = U(this.t0.C(i));
            if (decVarU != null && !decVarU.w()) {
                decVarU.f(6);
            }
        }
        b0();
        vdc vdcVar = this.c;
        int size = vdcVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            dec decVar = (dec) vdcVar.c.get(i2);
            if (decVar != null) {
                decVar.f(6);
                decVar.f(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            }
        }
        hdc hdcVar = vdcVar.h.A0;
        if (hdcVar == null || !hdcVar.b) {
            vdcVar.e();
        }
    }

    public final void l(sdc sdcVar) {
        this.E0.add(sdcVar);
    }

    public final void l0(dec decVar, jt jtVar) {
        decVar.u0 &= -8193;
        boolean z = this.s1.i;
        djb djbVar = this.u0;
        if (z && decVar.s() && !decVar.p() && !decVar.w()) {
            ((wv7) djbVar.c).f(Q(decVar), decVar);
        }
        qpd qpdVar = (qpd) djbVar.b;
        inf infVarA = (inf) qpdVar.get(decVar);
        if (infVarA == null) {
            infVarA = inf.a();
            qpdVar.put(decVar, infVarA);
        }
        infVarA.b = jtVar;
        infVarA.a |= 4;
    }

    public void m(tdc tdcVar) {
        if (this.u1 == null) {
            this.u1 = new ArrayList();
        }
        this.u1.add(tdcVar);
    }

    public final int m0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.W0;
        float f2 = 0.0f;
        if (edgeEffect == null || kp.k(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.Y0;
            if (edgeEffect2 != null && kp.k(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.Y0.onRelease();
                } else {
                    float fQ = kp.q(this.Y0, width, height);
                    if (kp.k(this.Y0) == 0.0f) {
                        this.Y0.onRelease();
                    }
                    f2 = fQ;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.W0.onRelease();
            } else {
                float f3 = -kp.q(this.W0, -width, 1.0f - height);
                if (kp.k(this.W0) == 0.0f) {
                    this.W0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public final void n(String str) {
        if (Z()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(ms2.e(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.U0 > 0) {
            new IllegalStateException(ms2.e(this, new StringBuilder("")));
        }
    }

    public final int n0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.X0;
        float f2 = 0.0f;
        if (edgeEffect == null || kp.k(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.Z0;
            if (edgeEffect2 != null && kp.k(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.Z0.onRelease();
                } else {
                    float fQ = kp.q(this.Z0, height, 1.0f - width);
                    if (kp.k(this.Z0) == 0.0f) {
                        this.Z0.onRelease();
                    }
                    f2 = fQ;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.X0.onRelease();
            } else {
                float f3 = -kp.q(this.X0, -height, width);
                if (kp.k(this.X0) == 0.0f) {
                    this.X0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    public final void o0() {
        mdc mdcVar = this.a1;
        if (mdcVar != null) {
            mdcVar.e();
        }
        a aVar = this.B0;
        if (aVar != null) {
            aVar.r0(this.c);
            this.B0.s0(this.c);
        }
        vdc vdcVar = this.c;
        vdcVar.a.clear();
        vdcVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.T0 = r0
            r1 = 1
            r5.G0 = r1
            boolean r2 = r5.I0
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.I0 = r2
            vdc r2 = r5.c
            r2.d()
            androidx.recyclerview.widget.a r2 = r5.B0
            if (r2 == 0) goto L26
            r2.g = r1
            r2.W(r5)
        L26:
            r5.y1 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.R1
            if (r0 == 0) goto L91
            java.lang.ThreadLocal r0 = defpackage.ca6.X
            java.lang.Object r1 = r0.get()
            ca6 r1 = (defpackage.ca6) r1
            r5.q1 = r1
            if (r1 != 0) goto L74
            ca6 r1 = new ca6
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.o = r2
            r5.q1 = r1
            java.util.WeakHashMap r1 = defpackage.zmf.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L66
            if (r1 == 0) goto L66
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L66
            goto L68
        L66:
            r1 = 1114636288(0x42700000, float:60.0)
        L68:
            ca6 r2 = r5.q1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L74:
            ca6 r0 = r5.q1
            r0.getClass()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.L1
            java.util.ArrayList r0 = r0.a
            if (r1 == 0) goto L8e
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L86
            goto L8e
        L86:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "RecyclerView already present in worker list!"
            r5.<init>(r0)
            throw r5
        L8e:
            r0.add(r5)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ca6 ca6Var;
        super.onDetachedFromWindow();
        mdc mdcVar = this.a1;
        if (mdcVar != null) {
            mdcVar.e();
        }
        E0();
        int i = 0;
        this.G0 = false;
        a aVar = this.B0;
        if (aVar != null) {
            aVar.g = false;
            aVar.X(this);
        }
        this.F1.clear();
        removeCallbacks(this.G1);
        this.u0.getClass();
        while (inf.d.f() != null) {
        }
        vdc vdcVar = this.c;
        for (int i2 = 0; i2 < vdcVar.c.size(); i2++) {
            r5b.a(((dec) vdcVar.c.get(i2)).a);
        }
        hdc hdcVar = vdcVar.h.A0;
        b bVar = vdcVar.g;
        if (bVar != null) {
            bVar.detachForPoolingContainer(hdcVar, false);
        }
        int i3 = r5b.a;
        while (i < getChildCount()) {
            int i4 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int i5 = r5b.a;
            s5b s5bVar = (s5b) childAt.getTag(i5);
            if (s5bVar == null) {
                s5bVar = new s5b();
                childAt.setTag(i5, s5bVar);
            }
            ArrayList arrayList = s5bVar.a;
            int iL = y53.L(arrayList);
            if (-1 < iL) {
                au1.r(arrayList.get(iL));
                throw null;
            }
            i = i4;
        }
        if (!R1 || (ca6Var = this.q1) == null) {
            return;
        }
        boolean zRemove = ca6Var.a.remove(this);
        if (L1 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.q1 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.D0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ndc) arrayList.get(i)).g(canvas, this, this.s1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.L0) {
            return false;
        }
        this.F0 = null;
        if (J(motionEvent)) {
            u0();
            setScrollState(0);
            return true;
        }
        a aVar = this.B0;
        if (aVar == null) {
            return false;
        }
        boolean zE = aVar.e();
        boolean zF = this.B0.f();
        if (this.d1 == null) {
            this.d1 = VelocityTracker.obtain();
        }
        this.d1.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.M0) {
                this.M0 = false;
            }
            this.c1 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.g1 = x;
            this.e1 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.h1 = y;
            this.f1 = y;
            EdgeEffect edgeEffect = this.W0;
            if (edgeEffect == null || kp.k(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z = false;
            } else {
                kp.q(this.W0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.Y0;
            boolean z3 = z;
            if (edgeEffect2 != null) {
                z3 = z;
                if (kp.k(edgeEffect2) != 0.0f) {
                    z3 = z;
                    if (!canScrollHorizontally(1)) {
                        kp.q(this.Y0, 0.0f, motionEvent.getY() / getHeight());
                        z3 = true;
                    }
                }
            }
            EdgeEffect edgeEffect3 = this.X0;
            boolean z4 = z3;
            if (edgeEffect3 != null) {
                z4 = z3;
                if (kp.k(edgeEffect3) != 0.0f) {
                    z4 = z3;
                    if (!canScrollVertically(-1)) {
                        kp.q(this.X0, 0.0f, motionEvent.getX() / getWidth());
                        z4 = true;
                    }
                }
            }
            EdgeEffect edgeEffect4 = this.Z0;
            boolean z5 = z4;
            if (edgeEffect4 != null) {
                z5 = z4;
                if (kp.k(edgeEffect4) != 0.0f) {
                    z5 = z4;
                    if (!canScrollVertically(1)) {
                        kp.q(this.Z0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z5 = true;
                    }
                }
            }
            if (z5 || this.b1 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                a(1);
            }
            int[] iArr = this.D1;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zE;
            if (zF) {
                i = (zE ? 1 : 0) | 2;
            }
            getScrollingChildHelper().h(i, 0);
        } else if (actionMasked == 1) {
            this.d1.clear();
            a(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.c1);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.b1 != 1) {
                int i2 = x2 - this.e1;
                int i3 = y2 - this.f1;
                if (zE == 0 || Math.abs(i2) <= this.i1) {
                    z2 = false;
                } else {
                    this.g1 = x2;
                    z2 = true;
                }
                if (zF && Math.abs(i3) > this.i1) {
                    this.h1 = y2;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            u0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.c1 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.g1 = x3;
            this.e1 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.h1 = y3;
            this.f1 = y3;
        } else if (actionMasked == 6) {
            g0(motionEvent);
        }
        return this.b1 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        v();
        Trace.endSection();
        this.I0 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        a aVar = this.B0;
        if (aVar == null) {
            t(i, i2);
            return;
        }
        boolean zQ = aVar.Q();
        boolean z = false;
        zdc zdcVar = this.s1;
        if (zQ) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.B0.b.t(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.H1 = z;
            if (z || this.A0 == null) {
                return;
            }
            if (zdcVar.e == 1) {
                w();
            }
            this.B0.B0(i, i2);
            zdcVar.j = true;
            x();
            this.B0.D0(i, i2);
            if (this.B0.G0()) {
                this.B0.B0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                zdcVar.j = true;
                x();
                this.B0.D0(i, i2);
            }
            this.I1 = getMeasuredWidth();
            this.J1 = getMeasuredHeight();
            return;
        }
        if (this.H0) {
            this.B0.b.t(i, i2);
            return;
        }
        if (this.O0) {
            C0();
            e0();
            j0();
            f0(true);
            if (zdcVar.l) {
                zdcVar.h = true;
            } else {
                this.s0.m();
                zdcVar.h = false;
            }
            this.O0 = false;
            D0(false);
        } else if (zdcVar.l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        hdc hdcVar = this.A0;
        if (hdcVar != null) {
            zdcVar.f = hdcVar.j();
        } else {
            zdcVar.f = 0;
        }
        C0();
        this.B0.b.t(i, i2);
        D0(false);
        zdcVar.h = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (Z()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof xdc)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        xdc xdcVar = (xdc) parcelable;
        this.o = xdcVar;
        super.onRestoreInstanceState(xdcVar.a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        xdc xdcVar = new xdc(super.onSaveInstanceState());
        xdc xdcVar2 = this.o;
        if (xdcVar2 != null) {
            xdcVar.c = xdcVar2.c;
        } else {
            a aVar = this.B0;
            if (aVar != null) {
                xdcVar.c = aVar.m0();
            } else {
                xdcVar.c = null;
            }
        }
        return xdcVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.Z0 = null;
        this.X0 = null;
        this.Y0 = null;
        this.W0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2 A[PHI: r0
      0x00e2: PHI (r0v46 int) = (r0v31 int), (r0v50 int) binds: [B:49:0x00cb, B:53:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        int iD = this.t0.D();
        for (int i = 0; i < iD; i++) {
            dec decVarU = U(this.t0.C(i));
            if (!decVarU.w()) {
                decVarU.o = -1;
                decVarU.Z = -1;
            }
        }
        vdc vdcVar = this.c;
        int size = vdcVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            dec decVar = (dec) vdcVar.c.get(i2);
            decVar.o = -1;
            decVar.Z = -1;
        }
        int size2 = vdcVar.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            dec decVar2 = (dec) vdcVar.a.get(i3);
            decVar2.o = -1;
            decVar2.Z = -1;
        }
        ArrayList arrayList = vdcVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                dec decVar3 = (dec) vdcVar.b.get(i4);
                decVar3.o = -1;
                decVar3.Z = -1;
            }
        }
    }

    public final void p0(ndc ndcVar) {
        a aVar = this.B0;
        if (aVar != null) {
            aVar.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.D0;
        arrayList.remove(ndcVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        b0();
        requestLayout();
    }

    public final void q(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.W0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.W0.onRelease();
            zIsFinished = this.W0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.Y0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.Y0.onRelease();
            zIsFinished |= this.Y0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.X0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.X0.onRelease();
            zIsFinished |= this.X0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Z0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.Z0.onRelease();
            zIsFinished |= this.Z0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    public final void q0(qdc qdcVar) {
        ArrayList arrayList = this.Q0;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(qdcVar);
    }

    public final void r0(sdc sdcVar) {
        this.E0.remove(sdcVar);
        if (this.F0 == sdcVar) {
            this.F0 = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        dec decVarU = U(view);
        if (decVarU != null) {
            if (decVarU.r()) {
                decVarU.u0 &= -257;
            } else if (!decVarU.w()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(decVarU);
                throw new IllegalArgumentException(ms2.e(this, sb));
            }
        } else if (L1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(ms2.e(this, sb2));
        }
        view.clearAnimation();
        u(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        yh7 yh7Var = this.B0.e;
        if ((yh7Var == null || !yh7Var.e) && !Z() && view2 != null) {
            t0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.B0.v0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.E0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((sdc) arrayList.get(i)).e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.J0 != 0 || this.L0) {
            this.K0 = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        if (!this.I0 || this.R0) {
            Trace.beginSection("RV FullInvalidate");
            v();
            Trace.endSection();
            return;
        }
        if (this.s0.D()) {
            x8 x8Var = this.s0;
            int i = x8Var.a;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (x8Var.D()) {
                    Trace.beginSection("RV FullInvalidate");
                    v();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            C0();
            e0();
            this.s0.K();
            if (!this.K0) {
                int iZ = this.t0.z();
                int i2 = 0;
                while (true) {
                    if (i2 < iZ) {
                        dec decVarU = U(this.t0.y(i2));
                        if (decVarU != null && !decVarU.w() && decVarU.s()) {
                            v();
                            break;
                        }
                        i2++;
                    } else {
                        this.s0.l();
                        break;
                    }
                }
            }
            D0(true);
            f0(true);
            Trace.endSection();
        }
    }

    public void s0(tdc tdcVar) {
        ArrayList arrayList = this.u1;
        if (arrayList != null) {
            arrayList.remove(tdcVar);
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        a aVar = this.B0;
        if (aVar == null || this.L0) {
            return;
        }
        boolean zE = aVar.e();
        boolean zF = this.B0.f();
        if (zE || zF) {
            if (!zE) {
                i = 0;
            }
            if (!zF) {
                i2 = 0;
            }
            v0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!Z()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.N0 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(fec fecVar) {
        this.z1 = fecVar;
        zmf.j(this, fecVar);
    }

    public void setAdapter(hdc hdcVar) {
        setLayoutFrozen(false);
        y0(hdcVar, false, true);
        k0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(kdc kdcVar) {
        if (kdcVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(kdcVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.v0) {
            this.Z0 = null;
            this.X0 = null;
            this.Y0 = null;
            this.W0 = null;
        }
        this.v0 = z;
        super.setClipToPadding(z);
        if (this.I0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(ldc ldcVar) {
        ldcVar.getClass();
        this.V0 = ldcVar;
        this.Z0 = null;
        this.X0 = null;
        this.Y0 = null;
        this.W0 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.H0 = z;
    }

    public void setItemAnimator(mdc mdcVar) {
        mdc mdcVar2 = this.a1;
        if (mdcVar2 != null) {
            mdcVar2.e();
            this.a1.a = null;
        }
        this.a1 = mdcVar;
        if (mdcVar != null) {
            mdcVar.a = this.x1;
        }
    }

    public void setItemViewCacheSize(int i) {
        vdc vdcVar = this.c;
        vdcVar.e = i;
        vdcVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(a aVar) {
        sy4 sy4Var;
        if (aVar == this.B0) {
            return;
        }
        E0();
        if (this.B0 != null) {
            mdc mdcVar = this.a1;
            if (mdcVar != null) {
                mdcVar.e();
            }
            this.B0.r0(this.c);
            this.B0.s0(this.c);
            vdc vdcVar = this.c;
            vdcVar.a.clear();
            vdcVar.e();
            if (this.G0) {
                a aVar2 = this.B0;
                aVar2.g = false;
                aVar2.X(this);
            }
            this.B0.E0(null);
            this.B0 = null;
        } else {
            vdc vdcVar2 = this.c;
            vdcVar2.a.clear();
            vdcVar2.e();
        }
        l0f l0fVar = this.t0;
        ((g03) l0fVar.X).a0();
        ArrayList arrayList = (ArrayList) l0fVar.Y;
        int size = arrayList.size() - 1;
        while (true) {
            sy4Var = (sy4) l0fVar.o;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            sy4Var.getClass();
            dec decVarU = U(view);
            if (decVarU != null) {
                int i = decVarU.A0;
                RecyclerView recyclerView = (RecyclerView) sy4Var.b;
                if (recyclerView.Z()) {
                    decVarU.B0 = i;
                    recyclerView.F1.add(decVarU);
                } else {
                    WeakHashMap weakHashMap = zmf.a;
                    decVarU.a.setImportantForAccessibility(i);
                }
                decVarU.A0 = 0;
            }
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView2 = (RecyclerView) sy4Var.b;
        int childCount = recyclerView2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView2.getChildAt(i2);
            recyclerView2.u(childAt);
            childAt.clearAnimation();
        }
        recyclerView2.removeAllViews();
        this.B0 = aVar;
        if (aVar != null) {
            if (aVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(aVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(ms2.e(aVar.b, sb));
            }
            aVar.E0(this);
            if (this.G0) {
                a aVar3 = this.B0;
                aVar3.g = true;
                aVar3.W(this);
            }
        }
        this.c.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        jn9 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = zmf.a;
            omf.z(scrollingChildHelper.c);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(rdc rdcVar) {
        this.j1 = rdcVar;
    }

    @Deprecated
    public void setOnScrollListener(tdc tdcVar) {
        this.t1 = tdcVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.o1 = z;
    }

    public void setRecycledViewPool(b bVar) {
        vdc vdcVar = this.c;
        RecyclerView recyclerView = vdcVar.h;
        hdc hdcVar = recyclerView.A0;
        b bVar2 = vdcVar.g;
        if (bVar2 != null) {
            bVar2.detachForPoolingContainer(hdcVar, false);
        }
        b bVar3 = vdcVar.g;
        if (bVar3 != null) {
            bVar3.detach();
        }
        vdcVar.g = bVar;
        if (bVar != null && recyclerView.getAdapter() != null) {
            vdcVar.g.attach();
        }
        vdcVar.d();
    }

    @Deprecated
    public void setRecyclerListener(wdc wdcVar) {
    }

    public void setScrollState(int i) {
        yh7 yh7Var;
        if (i == this.b1) {
            return;
        }
        if (M1) {
            new Exception();
        }
        this.b1 = i;
        if (i != 2) {
            cec cecVar = this.p1;
            cecVar.Z.removeCallbacks(cecVar);
            cecVar.c.abortAnimation();
            a aVar = this.B0;
            if (aVar != null && (yh7Var = aVar.e) != null) {
                yh7Var.l();
            }
        }
        a aVar2 = this.B0;
        if (aVar2 != null) {
            aVar2.n0(i);
        }
        h0();
        tdc tdcVar = this.t1;
        if (tdcVar != null) {
            tdcVar.a(this, i);
        }
        ArrayList arrayList = this.u1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((tdc) this.u1.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.i1 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.i1 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(bec becVar) {
        this.c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.L0) {
            n("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.L0 = true;
                this.M0 = true;
                E0();
                return;
            }
            this.L0 = false;
            if (this.K0 && this.B0 != null && this.A0 != null) {
                requestLayout();
            }
            this.K0 = false;
        }
    }

    public final void t(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = zmf.a;
        setMeasuredDimension(a.h(i, paddingRight, getMinimumWidth()), a.h(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void t0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.x0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof pdc) {
            pdc pdcVar = (pdc) layoutParams;
            if (!pdcVar.c) {
                int i = rect.left;
                Rect rect2 = pdcVar.b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.B0.v0(this, view, this.x0, !this.I0, view2 == null);
    }

    public final void u(View view) {
        dec decVarU = U(view);
        hdc hdcVar = this.A0;
        if (hdcVar != null && decVarU != null) {
            hdcVar.x(decVarU);
        }
        ArrayList arrayList = this.Q0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((qdc) this.Q0.get(size)).b(view);
            }
        }
    }

    public final void u0() {
        VelocityTracker velocityTracker = this.d1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        a(0);
        EdgeEffect edgeEffect = this.W0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.W0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.X0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.X0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Y0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.Y0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Z0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.Z0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x038d  */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void w() {
        inf infVar;
        View viewI;
        zdc zdcVar = this.s1;
        zdcVar.a(1);
        G(zdcVar);
        zdcVar.j = false;
        C0();
        djb djbVar = this.u0;
        ((qpd) djbVar.b).clear();
        wv7 wv7Var = (wv7) djbVar.c;
        wv7Var.a();
        e0();
        j0();
        dec decVarT = null;
        View focusedChild = (this.o1 && hasFocus() && this.A0 != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewI = I(focusedChild)) != null) {
            decVarT = T(viewI);
        }
        if (decVarT == null) {
            zdcVar.n = -1L;
            zdcVar.m = -1;
            zdcVar.o = -1;
        } else {
            zdcVar.n = this.A0.b ? decVarT.X : -1L;
            zdcVar.m = this.R0 ? -1 : decVarT.p() ? decVarT.o : decVarT.g();
            View focusedChild2 = decVarT.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            zdcVar.o = id;
        }
        zdcVar.i = zdcVar.k && this.w1;
        this.w1 = false;
        this.v1 = false;
        zdcVar.h = zdcVar.l;
        zdcVar.f = this.A0.j();
        K(this.A1);
        boolean z = zdcVar.k;
        qpd qpdVar = (qpd) djbVar.b;
        if (z) {
            int iZ = this.t0.z();
            for (int i = 0; i < iZ; i++) {
                dec decVarU = U(this.t0.y(i));
                if (!decVarU.w() && (!decVarU.n() || this.A0.b)) {
                    mdc mdcVar = this.a1;
                    mdc.b(decVarU);
                    decVarU.j();
                    mdcVar.getClass();
                    jt jtVar = new jt(7);
                    jtVar.c(decVarU);
                    inf infVarA = (inf) qpdVar.get(decVarU);
                    if (infVarA == null) {
                        infVarA = inf.a();
                        qpdVar.put(decVarU, infVarA);
                    }
                    infVarA.b = jtVar;
                    infVarA.a |= 4;
                    if (zdcVar.i && decVarU.s() && !decVarU.p() && !decVarU.w() && !decVarU.n()) {
                        wv7Var.f(Q(decVarU), decVarU);
                    }
                }
            }
        }
        if (zdcVar.l) {
            int iD = this.t0.D();
            for (int i2 = 0; i2 < iD; i2++) {
                dec decVarU2 = U(this.t0.C(i2));
                if (L1 && decVarU2.c == -1 && !decVarU2.p()) {
                    throw new IllegalStateException(ms2.e(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!decVarU2.w() && decVarU2.o == -1) {
                    decVarU2.o = decVarU2.c;
                }
            }
            boolean z2 = zdcVar.g;
            zdcVar.g = false;
            this.B0.j0(this.c, zdcVar);
            zdcVar.g = z2;
            for (int i3 = 0; i3 < this.t0.z(); i3++) {
                dec decVarU3 = U(this.t0.y(i3));
                if (!decVarU3.w() && ((infVar = (inf) qpdVar.get(decVarU3)) == null || (infVar.a & 4) == 0)) {
                    mdc.b(decVarU3);
                    boolean zK = decVarU3.k(8192);
                    mdc mdcVar2 = this.a1;
                    decVarU3.j();
                    mdcVar2.getClass();
                    jt jtVar2 = new jt(7);
                    jtVar2.c(decVarU3);
                    if (zK) {
                        l0(decVarU3, jtVar2);
                    } else {
                        inf infVarA2 = (inf) qpdVar.get(decVarU3);
                        if (infVarA2 == null) {
                            infVarA2 = inf.a();
                            qpdVar.put(decVarU3, infVarA2);
                        }
                        infVarA2.a |= 2;
                        infVarA2.b = jtVar2;
                    }
                }
            }
            p();
        } else {
            p();
        }
        f0(true);
        D0(false);
        zdcVar.e = 2;
    }

    public final void w0(int i, int i2, int[] iArr) {
        dec decVar;
        C0();
        e0();
        Trace.beginSection("RV Scroll");
        zdc zdcVar = this.s1;
        G(zdcVar);
        int iX0 = i != 0 ? this.B0.x0(i, this.c, zdcVar) : 0;
        int iZ0 = i2 != 0 ? this.B0.z0(i2, this.c, zdcVar) : 0;
        Trace.endSection();
        int iZ = this.t0.z();
        for (int i3 = 0; i3 < iZ; i3++) {
            View viewY = this.t0.y(i3);
            dec decVarT = T(viewY);
            if (decVarT != null && (decVar = decVarT.t0) != null) {
                int left = viewY.getLeft();
                int top = viewY.getTop();
                View view = decVar.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        f0(true);
        D0(false);
        if (iArr != null) {
            iArr[0] = iX0;
            iArr[1] = iZ0;
        }
    }

    public final void x() {
        C0();
        e0();
        zdc zdcVar = this.s1;
        zdcVar.a(6);
        this.s0.m();
        zdcVar.f = this.A0.j();
        zdcVar.d = 0;
        if (this.o != null) {
            hdc hdcVar = this.A0;
            int iS = au1.s(hdcVar.c);
            if (iS == 1 ? hdcVar.j() > 0 : iS != 2) {
                Parcelable parcelable = this.o.c;
                if (parcelable != null) {
                    this.B0.l0(parcelable);
                }
                this.o = null;
            }
        }
        zdcVar.h = false;
        this.B0.j0(this.c, zdcVar);
        zdcVar.g = false;
        zdcVar.k = zdcVar.k && this.a1 != null;
        zdcVar.e = 4;
        f0(true);
        D0(false);
    }

    public final void x0(int i) {
        if (this.L0) {
            return;
        }
        E0();
        a aVar = this.B0;
        if (aVar == null) {
            return;
        }
        aVar.y0(i);
        awakenScrollBars();
    }

    public final boolean y(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void y0(hdc hdcVar, boolean z, boolean z2) {
        hdc hdcVar2 = this.A0;
        pz4 pz4Var = this.b;
        if (hdcVar2 != null) {
            hdcVar2.B(pz4Var);
            this.A0.u(this);
        }
        if (!z || z2) {
            o0();
        }
        x8 x8Var = this.s0;
        x8Var.M((ArrayList) x8Var.c);
        x8Var.M((ArrayList) x8Var.o);
        x8Var.a = 0;
        hdc hdcVar3 = this.A0;
        this.A0 = hdcVar;
        if (hdcVar != null) {
            hdcVar.z(pz4Var);
            hdcVar.q(this);
        }
        a aVar = this.B0;
        if (aVar != null) {
            aVar.V();
        }
        vdc vdcVar = this.c;
        hdc hdcVar4 = this.A0;
        vdcVar.a.clear();
        vdcVar.e();
        b bVar = vdcVar.g;
        if (bVar != null) {
            bVar.detachForPoolingContainer(hdcVar3, true);
        }
        vdcVar.c().onAdapterChanged(hdcVar3, hdcVar4, z);
        vdcVar.d();
        this.s1.g = true;
    }

    public final void z(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final boolean z0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fK = kp.k(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = O1;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        int i2 = 25;
        this.b = new pz4(6, this);
        this.c = new vdc(this);
        this.u0 = new djb(12);
        this.w0 = new gdc(this, 0);
        this.x0 = new Rect();
        this.y0 = new Rect();
        this.z0 = new RectF();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.J0 = 0;
        this.R0 = false;
        this.S0 = false;
        this.T0 = 0;
        this.U0 = 0;
        this.V0 = U1;
        this.a1 = new yb4();
        this.b1 = 0;
        this.c1 = -1;
        this.m1 = Float.MIN_VALUE;
        this.n1 = Float.MIN_VALUE;
        int i3 = 1;
        this.o1 = true;
        this.p1 = new cec(this);
        this.r1 = R1 ? new b23() : null;
        zdc zdcVar = new zdc();
        zdcVar.a = -1;
        zdcVar.c = 0;
        zdcVar.d = 0;
        zdcVar.e = 1;
        zdcVar.f = 0;
        zdcVar.g = false;
        zdcVar.h = false;
        zdcVar.i = false;
        zdcVar.j = false;
        zdcVar.k = false;
        zdcVar.l = false;
        this.s1 = zdcVar;
        this.v1 = false;
        this.w1 = false;
        re6 re6Var = new re6(i2, this);
        this.x1 = re6Var;
        this.y1 = false;
        this.A1 = new int[2];
        this.C1 = new int[2];
        this.D1 = new int[2];
        this.E1 = new int[2];
        this.F1 = new ArrayList();
        this.G1 = new gdc(this, i3);
        this.I1 = 0;
        this.J1 = 0;
        this.K1 = new ey1(i2, this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.i1 = viewConfiguration.getScaledTouchSlop();
        this.m1 = anf.a(viewConfiguration);
        this.n1 = anf.b(viewConfiguration);
        this.k1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.a1.a = re6Var;
        k61 k61Var = new k61();
        k61Var.a = this;
        this.s0 = new x8(k61Var);
        this.t0 = new l0f(new sy4(i2, this));
        WeakHashMap weakHashMap = zmf.a;
        if (rmf.c(this) == 0) {
            rmf.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.P0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new fec(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u2c.RecyclerView, i, 0);
        umf.d(this, context, u2c.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(u2c.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(u2c.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.v0 = typedArrayObtainStyledAttributes.getBoolean(u2c.RecyclerView_android_clipToPadding, true);
        if (typedArrayObtainStyledAttributes.getBoolean(u2c.RecyclerView_fastScrollEnabled, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(u2c.RecyclerView_fastScrollVerticalThumbDrawable);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(u2c.RecyclerView_fastScrollVerticalTrackDrawable);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(u2c.RecyclerView_fastScrollHorizontalThumbDrawable);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(u2c.RecyclerView_fastScrollHorizontalTrackDrawable);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(ms2.e(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            new zb5(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(rtb.fastscroll_default_thickness), resources.getDimensionPixelSize(rtb.fastscroll_minimum_range), resources.getDimensionPixelOffset(rtb.fastscroll_margin));
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(a.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(S1);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((a) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr = N1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        umf.d(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(r5b.b, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a aVar = this.B0;
        if (aVar != null) {
            return aVar.u(layoutParams);
        }
        throw new IllegalStateException(ms2.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
