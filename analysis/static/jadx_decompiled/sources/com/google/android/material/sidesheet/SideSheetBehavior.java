package com.google.android.material.sidesheet;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.a0;
import defpackage.au1;
import defpackage.br0;
import defpackage.dnf;
import defpackage.er0;
import defpackage.f4;
import defpackage.ge0;
import defpackage.gjd;
import defpackage.god;
import defpackage.h6;
import defpackage.hd0;
import defpackage.i8g;
import defpackage.ju0;
import defpackage.l40;
import defpackage.m2c;
import defpackage.og;
import defpackage.omf;
import defpackage.ow3;
import defpackage.q18;
import defpackage.rw3;
import defpackage.tmf;
import defpackage.v18;
import defpackage.w08;
import defpackage.w18;
import defpackage.wb5;
import defpackage.wg0;
import defpackage.wzb;
import defpackage.xe7;
import defpackage.z04;
import defpackage.z2c;
import defpackage.zmf;
import defpackage.zr6;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends ow3 implements w08 {
    public static final int x = wzb.side_sheet_accessibility_pane_title;
    public static final int y = m2c.Widget_Material3_SideSheet;
    public z04 a;
    public final q18 b;
    public final ColorStateList c;
    public final gjd d;
    public final er0 e;
    public final float f;
    public final boolean g;
    public int h;
    public dnf i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public w18 t;
    public int u;
    public final LinkedHashSet v;
    public final br0 w;

    public SideSheetBehavior() {
        this.e = new er0(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new br0(1, this);
    }

    public final void A(int i, View view, boolean z) {
        int iA;
        if (i == 3) {
            iA = this.a.A();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(zr6.h(i, "Invalid state to get outer edge offset: "));
            }
            iA = this.a.C();
        }
        dnf dnfVar = this.i;
        if (dnfVar == null || (!z ? dnfVar.p(view, iA, view.getTop()) : dnfVar.n(iA, view.getTop()))) {
            y(i);
        } else {
            y(2);
            this.e.b(i);
        }
    }

    public final void B() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        zmf.h(view, 262144);
        zmf.e(view, 0);
        zmf.h(view, 1048576);
        zmf.e(view, 0);
        int i = 5;
        if (this.h != 5) {
            zmf.i(view, f4.j, new hd0(i, 9, this));
        }
        int i2 = 3;
        if (this.h != 3) {
            zmf.i(view, f4.h, new hd0(i2, 9, this));
        }
    }

    @Override // defpackage.w08
    public final void a() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        w18 w18Var = this.t;
        if (w18Var == null) {
            return;
        }
        ge0 ge0Var = w18Var.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        w18Var.f = null;
        int i2 = 5;
        if (ge0Var == null || Build.VERSION.SDK_INT < 34) {
            x(5);
            return;
        }
        z04 z04Var = this.a;
        if (z04Var != null && z04Var.H() != 0) {
            i2 = 3;
        }
        h6 h6Var = new h6(9, this);
        WeakReference weakReference = this.q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iZ = this.a.z(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: fod
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.a.a0(marginLayoutParams, og.c(iZ, valueAnimator.getAnimatedFraction(), 0));
                    view.requestLayout();
                }
            };
        }
        boolean z = ge0Var.d == 0;
        WeakHashMap weakHashMap = zmf.a;
        View view2 = w18Var.b;
        boolean z2 = (Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new wb5());
        objectAnimatorOfFloat.setDuration(og.c(w18Var.c, ge0Var.c, w18Var.d));
        objectAnimatorOfFloat.addListener(new v18(w18Var, z, i2));
        objectAnimatorOfFloat.addListener(h6Var);
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.w08
    public final void b(ge0 ge0Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        w18 w18Var = this.t;
        if (w18Var == null) {
            return;
        }
        z04 z04Var = this.a;
        int i = 5;
        if (z04Var != null && z04Var.H() != 0) {
            i = 3;
        }
        ge0 ge0Var2 = w18Var.f;
        w18Var.f = ge0Var;
        if (ge0Var2 != null) {
            w18Var.a(ge0Var.c, ge0Var.d == 0, i);
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.p.get();
        WeakReference weakReference2 = this.q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.a.a0(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.o));
        view2.requestLayout();
    }

    @Override // defpackage.w08
    public final void c(ge0 ge0Var) {
        w18 w18Var = this.t;
        if (w18Var == null) {
            return;
        }
        w18Var.f = ge0Var;
    }

    @Override // defpackage.w08
    public final void d() {
        w18 w18Var = this.t;
        if (w18Var == null) {
            return;
        }
        ge0 ge0Var = w18Var.f;
        w18Var.f = null;
        if (ge0Var == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = w18Var.b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(w18Var.e);
        animatorSet.start();
    }

    @Override // defpackage.ow3
    public final void g(rw3 rw3Var) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // defpackage.ow3
    public final void j() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    @Override // defpackage.ow3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
        /*
            r2 = this;
            boolean r3 = r4.isShown()
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L12
            java.util.WeakHashMap r3 = defpackage.zmf.a
            java.lang.CharSequence r3 = defpackage.tmf.b(r4)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L5c
        L12:
            boolean r3 = r2.g
            if (r3 == 0) goto L5c
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L26
            android.view.VelocityTracker r4 = r2.s
            if (r4 == 0) goto L26
            r4.recycle()
            r4 = 0
            r2.s = r4
        L26:
            android.view.VelocityTracker r4 = r2.s
            if (r4 != 0) goto L30
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r2.s = r4
        L30:
            android.view.VelocityTracker r4 = r2.s
            r4.addMovement(r5)
            if (r3 == 0) goto L44
            if (r3 == r0) goto L3d
            r4 = 3
            if (r3 == r4) goto L3d
            goto L4b
        L3d:
            boolean r3 = r2.j
            if (r3 == 0) goto L4b
            r2.j = r1
            return r1
        L44:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.u = r3
        L4b:
            boolean r3 = r2.j
            if (r3 != 0) goto L5a
            dnf r2 = r2.i
            if (r2 == 0) goto L5a
            boolean r2 = r2.o(r5)
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            r0 = r1
        L5b:
            return r0
        L5c:
            r2.j = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // defpackage.ow3
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        int iF = 0;
        int i3 = 1;
        q18 q18Var = this.b;
        WeakHashMap weakHashMap = zmf.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.p == null) {
            this.p = new WeakReference(view);
            this.t = new w18(view);
            if (q18Var != null) {
                view.setBackground(q18Var);
                float fI = this.f;
                if (fI == -1.0f) {
                    fI = omf.i(view);
                }
                q18Var.k(fI);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    omf.q(view, colorStateList);
                }
            }
            int i4 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            B();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (tmf.b(view) == null) {
                zmf.k(view, view.getResources().getString(x));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((rw3) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        z04 z04Var = this.a;
        if (z04Var == null || z04Var.H() != i5) {
            gjd gjdVar = this.d;
            rw3 rw3Var = null;
            if (i5 == 0) {
                this.a = new xe7(this, i3);
                if (gjdVar != null) {
                    WeakReference weakReference = this.p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof rw3)) {
                        rw3Var = (rw3) view3.getLayoutParams();
                    }
                    if (rw3Var == null || ((ViewGroup.MarginLayoutParams) rw3Var).rightMargin <= 0) {
                        i8g i8gVarE = gjdVar.e();
                        i8gVarE.f = new a0(0.0f);
                        i8gVarE.g = new a0(0.0f);
                        gjd gjdVarC = i8gVarE.c();
                        if (q18Var != null) {
                            q18Var.setShapeAppearanceModel(gjdVarC);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException(wg0.g(i5, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.a = new xe7(this, iF);
                if (gjdVar != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof rw3)) {
                        rw3Var = (rw3) view2.getLayoutParams();
                    }
                    if (rw3Var == null || ((ViewGroup.MarginLayoutParams) rw3Var).leftMargin <= 0) {
                        i8g i8gVarE2 = gjdVar.e();
                        i8gVarE2.e = new a0(0.0f);
                        i8gVarE2.h = new a0(0.0f);
                        gjd gjdVarC2 = i8gVarE2.c();
                        if (q18Var != null) {
                            q18Var.setShapeAppearanceModel(gjdVarC2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new dnf(coordinatorLayout.getContext(), coordinatorLayout, this.w);
        }
        int iF2 = this.a.F(view);
        coordinatorLayout.p(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.G(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.h(marginLayoutParams) : 0;
        int i6 = this.h;
        if (i6 == 1 || i6 == 2) {
            iF = iF2 - this.a.F(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            iF = this.a.C();
        }
        view.offsetLeftAndRight(iF);
        if (this.q == null && (i2 = this.r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            au1.r(it.next());
        }
        return true;
    }

    @Override // defpackage.ow3
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.ow3
    public final void r(View view, Parcelable parcelable) {
        int i = ((god) parcelable).c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // defpackage.ow3
    public final Parcelable s(View view) {
        return new god(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.ow3
    public final boolean w(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (z()) {
            this.i.i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (z() && actionMasked == 2 && !this.j && z()) {
            float fAbs = Math.abs(this.u - motionEvent.getX());
            dnf dnfVar = this.i;
            if (fAbs > dnfVar.b) {
                dnfVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void x(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(zr6.l(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            y(i);
            return;
        }
        View view = (View) this.p.get();
        l40 l40Var = new l40(i, 16, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = zmf.a;
            if (view.isAttachedToWindow()) {
                view.post(l40Var);
                return;
            }
        }
        l40Var.run();
    }

    public final void y(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.v.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
        B();
    }

    public final boolean z() {
        return this.i != null && (this.g || this.h == 1);
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new er0(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new br0(1, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(z2c.SideSheetBehavior_Layout_backgroundTint)) {
            this.c = ju0.q(context, typedArrayObtainStyledAttributes, z2c.SideSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.SideSheetBehavior_Layout_shapeAppearance)) {
            this.d = gjd.b(context, attributeSet, 0, y).c();
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(z2c.SideSheetBehavior_Layout_coplanarSiblingViewId, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = zmf.a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        gjd gjdVar = this.d;
        if (gjdVar != null) {
            q18 q18Var = new q18(gjdVar);
            this.b = q18Var;
            q18Var.j(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(z2c.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(z2c.SideSheetBehavior_Layout_behavior_draggable, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
