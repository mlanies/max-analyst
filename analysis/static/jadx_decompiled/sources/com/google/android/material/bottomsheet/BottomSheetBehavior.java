package com.google.android.material.bottomsheet;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.a18;
import defpackage.a4;
import defpackage.aab;
import defpackage.ar0;
import defpackage.br0;
import defpackage.cr0;
import defpackage.dnf;
import defpackage.dr0;
import defpackage.eo;
import defpackage.er0;
import defpackage.f4;
import defpackage.ge0;
import defpackage.gjd;
import defpackage.h6;
import defpackage.ju0;
import defpackage.m2c;
import defpackage.mmf;
import defpackage.npf;
import defpackage.og;
import defpackage.omf;
import defpackage.ow3;
import defpackage.p18;
import defpackage.q18;
import defpackage.rw3;
import defpackage.sh0;
import defpackage.stb;
import defpackage.tsb;
import defpackage.umf;
import defpackage.w08;
import defpackage.w27;
import defpackage.w3;
import defpackage.wb5;
import defpackage.wzb;
import defpackage.yj0;
import defpackage.z2c;
import defpackage.z3;
import defpackage.zmf;
import defpackage.zr6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends ow3 implements w08 {
    public static final int f0 = m2c.Widget_Design_BottomSheet_Modal;
    public final er0 A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public dnf M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W;
    public VelocityTracker X;
    public a18 Y;
    public int Z;
    public final int a;
    public int a0;
    public boolean b;
    public boolean b0;
    public final float c;
    public HashMap c0;
    public final int d;
    public final SparseIntArray d0;
    public int e;
    public final br0 e0;
    public boolean f;
    public int g;
    public final int h;
    public final q18 i;
    public final ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final gjd y;
    public boolean z;

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new er0(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.a0 = -1;
        this.d0 = new SparseIntArray();
        this.e0 = new br0(0, this);
    }

    public static View B(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = zmf.a;
        if (omf.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewB = B(viewGroup.getChildAt(i));
                if (viewB != null) {
                    return viewB;
                }
            }
        }
        return null;
    }

    public static BottomSheetBehavior C(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof rw3)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        ow3 ow3Var = ((rw3) layoutParams).a;
        if (ow3Var instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) ow3Var;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int D(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        View view = (View) this.U.get();
        if (view != null) {
            ArrayList arrayList = this.W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.G;
            if (i <= i2 && i2 != E()) {
                E();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((cr0) arrayList.get(i3)).b(view);
            }
        }
    }

    public final int E() {
        if (this.b) {
            return this.D;
        }
        return Math.max(this.C, this.r ? 0 : this.w);
    }

    public final int F(int i) {
        if (i == 3) {
            return E();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.T;
        }
        if (i == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(zr6.h(i, "Invalid state to get top offset: "));
    }

    public final boolean G() {
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final void H(boolean z) throws Resources.NotFoundException {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.U != null) {
            x();
        }
        L((this.b && this.L == 6) ? 3 : this.L);
        P(this.L, true);
        O();
    }

    public final void I(boolean z) throws Resources.NotFoundException {
        if (this.I != z) {
            this.I = z;
            if (!z && this.L == 5) {
                K(4);
            }
            O();
        }
    }

    public final void J(int i) {
        if (i == -1) {
            if (this.f) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!this.f && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        R();
    }

    public final void K(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(zr6.l(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.I || i != 5) {
            int i2 = (i == 6 && this.b && F(i) <= this.D) ? 3 : i;
            WeakReference weakReference = this.U;
            if (weakReference == null || weakReference.get() == null) {
                L(i);
                return;
            }
            View view = (View) this.U.get();
            eo eoVar = new eo(this, view, i2);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = zmf.a;
                if (view.isAttachedToWindow()) {
                    view.post(eoVar);
                    return;
                }
            }
            eoVar.run();
        }
    }

    public final void L(int i) {
        View view;
        if (this.L == i) {
            return;
        }
        this.L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.I;
        }
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            Q(true);
        } else if (i == 6 || i == 5 || i == 4) {
            Q(false);
        }
        P(i, true);
        while (true) {
            ArrayList arrayList = this.W;
            if (i2 >= arrayList.size()) {
                O();
                return;
            } else {
                ((cr0) arrayList.get(i2)).c(view, i);
                i2++;
            }
        }
    }

    public final boolean M(View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) z()) > 0.5f;
    }

    public final void N(int i, View view, boolean z) {
        int iF = F(i);
        dnf dnfVar = this.M;
        if (dnfVar == null || (!z ? dnfVar.p(view, view.getLeft(), iF) : dnfVar.n(view.getLeft(), iF))) {
            L(i);
            return;
        }
        L(2);
        P(i, true);
        this.A.b(i);
    }

    public final void O() throws Resources.NotFoundException {
        View view;
        int iA;
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        zmf.h(view, 524288);
        zmf.e(view, 0);
        zmf.h(view, 262144);
        zmf.e(view, 0);
        zmf.h(view, 1048576);
        zmf.e(view, 0);
        SparseIntArray sparseIntArray = this.d0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            zmf.h(view, i);
            zmf.e(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.b && this.L != 6) {
            String string = view.getResources().getString(wzb.bottomsheet_action_expand_halfway);
            sh0 sh0Var = new sh0(i, 1, this);
            ArrayList arrayListC = zmf.c(view);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListC.size()) {
                    int i3 = -1;
                    for (int i4 = 0; i4 < 32 && i3 == -1; i4++) {
                        int i5 = zmf.b[i4];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListC.size(); i6++) {
                            z &= ((f4) arrayListC.get(i6)).a() != i5;
                        }
                        if (z) {
                            i3 = i5;
                        }
                    }
                    iA = i3;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((f4) arrayListC.get(i2)).a).getLabel())) {
                        iA = ((f4) arrayListC.get(i2)).a();
                        break;
                    }
                    i2++;
                }
            }
            if (iA != -1) {
                f4 f4Var = new f4(null, iA, string, sh0Var, null);
                View.AccessibilityDelegate accessibilityDelegateA = umf.a(view);
                a4 a4Var = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof z3 ? ((z3) accessibilityDelegateA).a : new a4(accessibilityDelegateA);
                if (a4Var == null) {
                    a4Var = new a4();
                }
                zmf.j(view, a4Var);
                zmf.h(view, f4Var.a());
                zmf.c(view).add(f4Var);
                zmf.e(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I) {
            int i7 = 5;
            if (this.L != 5) {
                zmf.i(view, f4.j, new sh0(i7, 1, this));
            }
        }
        int i8 = this.L;
        int i9 = 4;
        int i10 = 3;
        if (i8 == 3) {
            zmf.i(view, f4.i, new sh0(this.b ? 4 : 6, 1, this));
            return;
        }
        if (i8 == 4) {
            zmf.i(view, f4.h, new sh0(this.b ? 3 : 6, 1, this));
        } else {
            if (i8 != 6) {
                return;
            }
            zmf.i(view, f4.i, new sh0(i9, 1, this));
            zmf.i(view, f4.h, new sh0(i10, 1, this));
        }
    }

    public final void P(int i, boolean z) {
        q18 q18Var = this.i;
        ValueAnimator valueAnimator = this.B;
        if (i == 2) {
            return;
        }
        boolean z2 = this.L == 3 && (this.x || G());
        if (this.z == z2 || q18Var == null) {
            return;
        }
        this.z = z2;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(q18Var.a.j, z2 ? y() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fY = this.z ? y() : 1.0f;
        p18 p18Var = q18Var.a;
        if (p18Var.j != fY) {
            p18Var.j = fY;
            q18Var.X = true;
            q18Var.invalidateSelf();
        }
    }

    public final void Q(boolean z) {
        WeakReference weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.c0 != null) {
                    return;
                } else {
                    this.c0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.U.get() && z) {
                    this.c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.c0 = null;
        }
    }

    public final void R() {
        View view;
        if (this.U != null) {
            x();
            if (this.L != 4 || (view = (View) this.U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.w08
    public final void a() {
        a18 a18Var = this.Y;
        if (a18Var == null) {
            return;
        }
        ge0 ge0Var = a18Var.f;
        a18Var.f = null;
        if (ge0Var == null || Build.VERSION.SDK_INT < 34) {
            K(this.I ? 5 : 4);
            return;
        }
        boolean z = this.I;
        int i = a18Var.d;
        int i2 = a18Var.c;
        float f = ge0Var.c;
        if (!z) {
            AnimatorSet animatorSetA = a18Var.a();
            animatorSetA.setDuration(og.c(i2, f, i));
            animatorSetA.start();
            K(4);
            return;
        }
        h6 h6Var = new h6(3, this);
        View view = a18Var.b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        objectAnimatorOfFloat.setInterpolator(new wb5());
        objectAnimatorOfFloat.setDuration(og.c(i2, f, i));
        objectAnimatorOfFloat.addListener(new h6(8, a18Var));
        objectAnimatorOfFloat.addListener(h6Var);
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.w08
    public final void b(ge0 ge0Var) {
        a18 a18Var = this.Y;
        if (a18Var == null) {
            return;
        }
        ge0 ge0Var2 = a18Var.f;
        a18Var.f = ge0Var;
        if (ge0Var2 == null) {
            return;
        }
        a18Var.b(ge0Var.c);
    }

    @Override // defpackage.w08
    public final void c(ge0 ge0Var) {
        a18 a18Var = this.Y;
        if (a18Var == null) {
            return;
        }
        a18Var.f = ge0Var;
    }

    @Override // defpackage.w08
    public final void d() {
        a18 a18Var = this.Y;
        if (a18Var == null) {
            return;
        }
        ge0 ge0Var = a18Var.f;
        a18Var.f = null;
        if (ge0Var == null) {
            return;
        }
        AnimatorSet animatorSetA = a18Var.a();
        animatorSetA.setDuration(a18Var.e);
        animatorSetA.start();
    }

    @Override // defpackage.ow3
    public final void g(rw3 rw3Var) {
        this.U = null;
        this.M = null;
        this.Y = null;
    }

    @Override // defpackage.ow3
    public final void j() {
        this.U = null;
        this.M = null;
        this.Y = null;
    }

    @Override // defpackage.ow3
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        dnf dnfVar;
        if (!view.isShown() || !this.K) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Z = -1;
            this.a0 = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.a0 = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference weakReference = this.V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.h(view2, x, this.a0)) {
                    this.Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.b0 = true;
                }
            }
            this.N = this.Z == -1 && !coordinatorLayout.h(view, x, this.a0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b0 = false;
            this.Z = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (!this.N && (dnfVar = this.M) != null && dnfVar.o(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.N || this.L == 1 || coordinatorLayout.h(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || (i = this.a0) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.M.b)) ? false : true;
    }

    @Override // defpackage.ow3
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        int i2 = this.l;
        q18 q18Var = this.i;
        WeakHashMap weakHashMap = zmf.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i3 = 0;
        if (this.U == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(stb.design_bottom_sheet_peek_height_min);
            boolean z = (this.n || this.f) ? false : true;
            if (this.o || this.p || this.q || this.s || this.t || this.u || z) {
                ar0 ar0Var = new ar0(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                w3 w3Var = new w3();
                w3Var.a = paddingStart;
                w3Var.b = paddingEnd;
                w3Var.c = paddingBottom;
                omf.u(view, new aab(ar0Var, w3Var));
                if (view.isAttachedToWindow()) {
                    mmf.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new npf());
                }
            }
            zmf.l(view, new w27(view));
            this.U = new WeakReference(view);
            this.Y = new a18(view);
            if (q18Var != null) {
                view.setBackground(q18Var);
                float fI = this.H;
                if (fI == -1.0f) {
                    fI = omf.i(view);
                }
                q18Var.k(fI);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    omf.q(view, colorStateList);
                }
            }
            O();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.M == null) {
            this.M = new dnf(coordinatorLayout.getContext(), coordinatorLayout, this.e0);
        }
        int top = view.getTop();
        coordinatorLayout.p(view, i);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.R = height;
        int iMin = this.T;
        int i4 = iMin - height;
        int i5 = this.w;
        if (i4 < i5) {
            if (this.r) {
                if (i2 != -1) {
                    iMin = Math.min(iMin, i2);
                }
                this.R = iMin;
            } else {
                int iMin2 = iMin - i5;
                if (i2 != -1) {
                    iMin2 = Math.min(iMin2, i2);
                }
                this.R = iMin2;
            }
        }
        this.D = Math.max(0, this.T - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        x();
        int i6 = this.L;
        if (i6 == 3) {
            view.offsetTopAndBottom(E());
        } else if (i6 == 6) {
            view.offsetTopAndBottom(this.E);
        } else if (this.I && i6 == 5) {
            view.offsetTopAndBottom(this.T);
        } else if (i6 == 4) {
            view.offsetTopAndBottom(this.G);
        } else if (i6 == 1 || i6 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        P(this.L, false);
        this.V = new WeakReference(B(view));
        while (true) {
            ArrayList arrayList = this.W;
            if (i3 >= arrayList.size()) {
                return true;
            }
            ((cr0) arrayList.get(i3)).a(view);
            i3++;
        }
    }

    @Override // defpackage.ow3
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(D(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), D(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.ow3
    public final boolean n(View view) {
        WeakReference weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // defpackage.ow3
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < E()) {
                int iE = top - E();
                iArr[1] = iE;
                int i5 = -iE;
                WeakHashMap weakHashMap = zmf.a;
                view.offsetTopAndBottom(i5);
                L(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = zmf.a;
                view.offsetTopAndBottom(-i2);
                L(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.G;
            if (i4 > i6 && !this.I) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = zmf.a;
                view.offsetTopAndBottom(i8);
                L(4);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = zmf.a;
                view.offsetTopAndBottom(-i2);
                L(1);
            }
        }
        A(view.getTop());
        this.O = i2;
        this.P = true;
    }

    @Override // defpackage.ow3
    public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // defpackage.ow3
    public final void r(View view, Parcelable parcelable) {
        dr0 dr0Var = (dr0) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = dr0Var.o;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = dr0Var.X;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = dr0Var.Y;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = dr0Var.Z;
            }
        }
        int i2 = dr0Var.c;
        if (i2 == 1 || i2 == 2) {
            this.L = 4;
        } else {
            this.L = i2;
        }
    }

    @Override // defpackage.ow3
    public final Parcelable s(View view) {
        return new dr0(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.ow3
    public final boolean u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.O = 0;
        this.P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // defpackage.ow3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.E()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.L(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.V
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.P
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.O
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.X
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.X
            int r6 = r2.Z
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.M(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.O
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.b
            if (r1 == 0) goto L74
            int r5 = r2.D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.E
            if (r3 >= r1) goto L83
            int r6 = r2.G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.N(r0, r4, r3)
            r2.P = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.v(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.ow3
    public final boolean w(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        dnf dnfVar = this.M;
        if (dnfVar != null && (this.K || i == 1)) {
            dnfVar.i(motionEvent);
        }
        if (actionMasked == 0) {
            this.Z = -1;
            this.a0 = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && ((this.K || this.L == 1) && actionMasked == 2 && !this.N)) {
            float fAbs = Math.abs(this.a0 - motionEvent.getY());
            dnf dnfVar2 = this.M;
            if (fAbs > dnfVar2.b) {
                dnfVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void x() {
        int iZ = z();
        if (this.b) {
            this.G = Math.max(this.T - iZ, this.D);
        } else {
            this.G = this.T - iZ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float y() {
        /*
            r5 = this;
            q18 r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.G()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            q18 r2 = r5.i
            p18 r3 = r2.a
            gjd r3 = r3.a
            hx3 r3 = r3.e
            android.graphics.RectF r2 = r2.h()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = defpackage.m30.n(r0)
            if (r3 == 0) goto L4e
            int r3 = defpackage.m30.b(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            q18 r5 = r5.i
            p18 r2 = r5.a
            gjd r2 = r2.a
            hx3 r2 = r2.f
            android.graphics.RectF r5 = r5.h()
            float r5 = r2.a(r5)
            android.view.RoundedCorner r0 = defpackage.m30.A(r0)
            if (r0 == 0) goto L74
            int r0 = defpackage.m30.b(r0)
            float r0 = (float) r0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L74
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 <= 0) goto L74
            float r1 = r0 / r5
        L74:
            float r5 = java.lang.Math.max(r3, r1)
            return r5
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.y():float");
    }

    public final int z() {
        int iMin;
        int i;
        int i2;
        if (this.f) {
            iMin = Math.min(Math.max(this.g, this.T - ((this.S * 9) / 16)), this.R);
            i = this.v;
        } else {
            if (!this.n && !this.o && (i2 = this.m) > 0) {
                return Math.max(this.e, i2 + this.h);
            }
            iMin = this.e;
            i = this.v;
        }
        return iMin + i;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i;
        int i2 = 1;
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new er0(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.a0 = -1;
        this.d0 = new SparseIntArray();
        this.e0 = new br0(0, this);
        this.h = context.getResources().getDimensionPixelSize(stb.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.BottomSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(z2c.BottomSheetBehavior_Layout_backgroundTint)) {
            this.j = ju0.q(context, typedArrayObtainStyledAttributes, z2c.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.y = gjd.b(context, attributeSet, tsb.bottomSheetStyle, f0).c();
        }
        gjd gjdVar = this.y;
        if (gjdVar != null) {
            q18 q18Var = new q18(gjdVar);
            this.i = q18Var;
            q18Var.j(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(y(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new yj0(i2, this));
        this.H = typedArrayObtainStyledAttributes.getDimension(z2c.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(z2c.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.BottomSheetBehavior_Layout_android_maxWidth, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.BottomSheetBehavior_Layout_android_maxHeight, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(z2c.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            J(i);
        } else {
            J(typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        I(typedArrayObtainStyledAttributes.getBoolean(z2c.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.n = typedArrayObtainStyledAttributes.getBoolean(z2c.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        H(typedArrayObtainStyledAttributes.getBoolean(z2c.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.J = typedArrayObtainStyledAttributes.getBoolean(z2c.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(z2c.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.a = typedArrayObtainStyledAttributes.getInt(z2c.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(z2c.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.F = f;
            if (this.U != null) {
                this.E = (int) ((1.0f - f) * this.T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(z2c.BottomSheetBehavior_Layout_behavior_expandedOffset);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.C = i3;
                    P(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(z2c.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    P(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = typedArrayObtainStyledAttributes.getInt(z2c.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
            this.o = typedArrayObtainStyledAttributes.getBoolean(z2c.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
            this.p = typedArrayObtainStyledAttributes.getBoolean(z2c.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
            this.q = typedArrayObtainStyledAttributes.getBoolean(z2c.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
            this.r = typedArrayObtainStyledAttributes.getBoolean(z2c.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
            this.s = typedArrayObtainStyledAttributes.getBoolean(z2c.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
            this.t = typedArrayObtainStyledAttributes.getBoolean(z2c.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
            this.u = typedArrayObtainStyledAttributes.getBoolean(z2c.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
            this.x = typedArrayObtainStyledAttributes.getBoolean(z2c.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
            typedArrayObtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
