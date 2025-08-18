package defpackage;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class fm extends LinearLayout implements nw3 {
    public static final int N0 = m2c.Widget_Design_AppBarLayout;
    public int A0;
    public WeakReference B0;
    public final boolean C0;
    public ValueAnimator D0;
    public final ValueAnimator.AnimatorUpdateListener E0;
    public final ArrayList F0;
    public final long G0;
    public final TimeInterpolator H0;
    public int[] I0;
    public Drawable J0;
    public Integer K0;
    public final float L0;
    public AppBarLayout$Behavior M0;
    public int a;
    public int b;
    public int c;
    public int o;
    public boolean s0;
    public int t0;
    public x6g u0;
    public ArrayList v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    public fm(Context context) {
        Integer numValueOf;
        int i = 0;
        int i2 = tsb.appBarLayoutStyle;
        int i3 = N0;
        super(y18.a(context, null, i2, i3), null, i2);
        this.b = -1;
        this.c = -1;
        this.o = -1;
        this.t0 = 0;
        this.F0 = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayD = sre.d(context3, null, c37.e, i2, i3, new int[0]);
        try {
            if (typedArrayD.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayD.getResourceId(0, 0)));
            }
            typedArrayD.recycle();
            TypedArray typedArrayD2 = sre.d(context2, null, z2c.AppBarLayout, i2, i3, new int[0]);
            Drawable drawable = typedArrayD2.getDrawable(z2c.AppBarLayout_android_background);
            WeakHashMap weakHashMap = zmf.a;
            setBackground(drawable);
            final ColorStateList colorStateListQ = ju0.q(context2, typedArrayD2, z2c.AppBarLayout_liftOnScrollColor);
            this.C0 = colorStateListQ != null;
            final ColorStateList colorStateListR = oag.r(getBackground());
            if (colorStateListR != null) {
                final q18 q18Var = new q18();
                q18Var.l(colorStateListR);
                if (colorStateListQ != null) {
                    Context context4 = getContext();
                    TypedValue typedValueC = kq0.C(context4, tsb.colorSurface);
                    if (typedValueC != null) {
                        int i4 = typedValueC.resourceId;
                        numValueOf = Integer.valueOf(i4 != 0 ? lt3.a(context4, i4) : typedValueC.data);
                    } else {
                        numValueOf = null;
                    }
                    final Integer num = numValueOf;
                    this.E0 = new ValueAnimator.AnimatorUpdateListener() { // from class: xl
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num2;
                            fm fmVar = this.a;
                            fmVar.getClass();
                            int iN = mr0.N(colorStateListR.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateListQ.getDefaultColor());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iN);
                            q18 q18Var2 = q18Var;
                            q18Var2.l(colorStateListValueOf);
                            if (fmVar.J0 != null && (num2 = fmVar.K0) != null && num2.equals(num)) {
                                aq4.g(fmVar.J0, iN);
                            }
                            ArrayList arrayList = fmVar.F0;
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                au1.r(it.next());
                                if (q18Var2.a.c != null) {
                                    throw null;
                                }
                            }
                        }
                    };
                    setBackground(q18Var);
                } else {
                    q18Var.j(context2);
                    this.E0 = new yl(this, i, q18Var);
                    setBackground(q18Var);
                }
            }
            this.G0 = z7.P(tsb.motionDurationMedium2, getResources().getInteger(jyb.app_bar_elevation_anim_duration), context2);
            this.H0 = z7.Q(context2, tsb.motionEasingStandardInterpolator, og.a);
            if (typedArrayD2.hasValue(z2c.AppBarLayout_expanded)) {
                f(typedArrayD2.getBoolean(z2c.AppBarLayout_expanded, false), false, false);
            }
            if (typedArrayD2.hasValue(z2c.AppBarLayout_elevation)) {
                c37.z(this, typedArrayD2.getDimensionPixelSize(z2c.AppBarLayout_elevation, 0));
            }
            if (typedArrayD2.hasValue(z2c.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(typedArrayD2.getBoolean(z2c.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (typedArrayD2.hasValue(z2c.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(typedArrayD2.getBoolean(z2c.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
            this.L0 = getResources().getDimension(stb.design_appbar_elevation);
            this.z0 = typedArrayD2.getBoolean(z2c.AppBarLayout_liftOnScroll, false);
            this.A0 = typedArrayD2.getResourceId(z2c.AppBarLayout_liftOnScrollTargetViewId, -1);
            setStatusBarForeground(typedArrayD2.getDrawable(z2c.AppBarLayout_statusBarForeground));
            typedArrayD2.recycle();
            omf.u(this, new rxd(2, this));
        } catch (Throwable th) {
            typedArrayD.recycle();
            throw th;
        }
    }

    public static dm c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            dm dmVar = new dm((LinearLayout.LayoutParams) layoutParams);
            dmVar.a = 1;
            return dmVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            dm dmVar2 = new dm((ViewGroup.MarginLayoutParams) layoutParams);
            dmVar2.a = 1;
            return dmVar2;
        }
        dm dmVar3 = new dm(layoutParams);
        dmVar3.a = 1;
        return dmVar3;
    }

    public final void a(cm cmVar) {
        if (this.v0 == null) {
            this.v0 = new ArrayList();
        }
        if (cmVar == null || this.v0.contains(cmVar)) {
            return;
        }
        this.v0.add(cmVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dm generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        dm dmVar = new dm(context, attributeSet);
        dmVar.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.AppBarLayout_Layout);
        dmVar.a = typedArrayObtainStyledAttributes.getInt(z2c.AppBarLayout_Layout_layout_scrollFlags, 0);
        dmVar.b = typedArrayObtainStyledAttributes.getInt(z2c.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new h7b(3);
        if (typedArrayObtainStyledAttributes.hasValue(z2c.AppBarLayout_Layout_layout_scrollInterpolator)) {
            dmVar.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(z2c.AppBarLayout_Layout_layout_scrollInterpolator, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return dmVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof dm;
    }

    public final void d() {
        AppBarLayout$Behavior appBarLayout$Behavior = this.M0;
        bm bmVarI = (appBarLayout$Behavior == null || this.b == -1 || this.t0 != 0) ? null : appBarLayout$Behavior.I(z.b, this);
        this.b = -1;
        this.c = -1;
        this.o = -1;
        if (bmVarI != null) {
            AppBarLayout$Behavior appBarLayout$Behavior2 = this.M0;
            if (appBarLayout$Behavior2.m != null) {
                return;
            }
            appBarLayout$Behavior2.m = bmVarI;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.J0 == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.a);
        this.J0.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.J0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(int i) {
        this.a = i;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = zmf.a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.v0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cm cmVar = (cm) this.v0.get(i2);
                if (cmVar != null) {
                    cmVar.V(this, i);
                }
            }
        }
    }

    public final void f(boolean z, boolean z2, boolean z3) {
        this.t0 = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public final boolean g(boolean z) {
        if (!(!this.w0) || this.y0 == z) {
            return false;
        }
        this.y0 = z;
        refreshDrawableState();
        if (!(getBackground() instanceof q18)) {
            return true;
        }
        if (this.C0) {
            j(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.z0) {
            return true;
        }
        float f = this.L0;
        j(z ? 0.0f : f, z ? f : 0.0f);
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new dm(-1, -2);
    }

    public ow3 getBehavior() {
        AppBarLayout$Behavior appBarLayout$Behavior = new AppBarLayout$Behavior();
        this.M0 = appBarLayout$Behavior;
        return appBarLayout$Behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getDownNestedPreScrollRange() {
        /*
            r11 = this;
            r0 = 5
            r1 = 8
            int r2 = r11.c
            r3 = -1
            if (r2 == r3) goto L9
            return r2
        L9:
            int r2 = r11.getChildCount()
            int r2 = r2 + (-1)
            r4 = 0
            r5 = r4
        L11:
            if (r2 < 0) goto L68
            android.view.View r6 = r11.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 != r1) goto L1e
            goto L66
        L1e:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            dm r7 = (defpackage.dm) r7
            int r8 = r6.getMeasuredHeight()
            int r9 = r7.a
            r10 = r9 & 5
            if (r10 != r0) goto L63
            int r10 = r7.topMargin
            int r7 = r7.bottomMargin
            int r10 = r10 + r7
            r7 = r9 & 8
            if (r7 == 0) goto L3f
            java.util.WeakHashMap r7 = defpackage.zmf.a
            int r7 = r6.getMinimumHeight()
        L3d:
            int r7 = r7 + r10
            goto L4e
        L3f:
            r7 = r9 & 2
            if (r7 == 0) goto L4c
            java.util.WeakHashMap r7 = defpackage.zmf.a
            int r7 = r6.getMinimumHeight()
            int r7 = r8 - r7
            goto L3d
        L4c:
            int r7 = r10 + r8
        L4e:
            if (r2 != 0) goto L61
            java.util.WeakHashMap r9 = defpackage.zmf.a
            boolean r6 = r6.getFitsSystemWindows()
            if (r6 == 0) goto L61
            int r6 = r11.getTopInset()
            int r8 = r8 - r6
            int r7 = java.lang.Math.min(r7, r8)
        L61:
            int r5 = r5 + r7
            goto L66
        L63:
            if (r5 <= 0) goto L66
            goto L68
        L66:
            int r2 = r2 + r3
            goto L11
        L68:
            int r0 = java.lang.Math.max(r4, r5)
            r11.c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                dm dmVar = (dm) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) dmVar).topMargin + ((LinearLayout.LayoutParams) dmVar).bottomMargin + childAt.getMeasuredHeight();
                int i3 = dmVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap = zmf.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.o = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.A0;
    }

    public q18 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof q18) {
            return (q18) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = zmf.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.t0;
    }

    public Drawable getStatusBarForeground() {
        return this.J0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        x6g x6gVar = this.u0;
        if (x6gVar != null) {
            return x6gVar.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                dm dmVar = (dm) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = dmVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) dmVar).topMargin + ((LinearLayout.LayoutParams) dmVar).bottomMargin + minimumHeight;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = zmf.a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap2 = zmf.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h(View view) {
        int i;
        if (this.B0 == null && (i = this.A0) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.A0);
            }
            if (viewFindViewById != null) {
                this.B0 = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.B0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean i() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap weakHashMap = zmf.a;
        return !childAt.getFitsSystemWindows();
    }

    public final void j(float f, float f2) {
        ValueAnimator valueAnimator = this.D0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.D0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.G0);
        this.D0.setInterpolator(this.H0);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.E0;
        if (animatorUpdateListener != null) {
            this.D0.addUpdateListener(animatorUpdateListener);
        }
        this.D0.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof q18) {
            nu0.N(this, (q18) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.I0 == null) {
            this.I0 = new int[4];
        }
        int[] iArr = this.I0;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.x0;
        int i2 = tsb.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.y0) ? tsb.state_lifted : -tsb.state_lifted;
        int i3 = tsb.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.y0) ? tsb.state_collapsed : -tsb.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.B0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.B0 = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = true;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = zmf.a;
        if (getFitsSystemWindows() && i()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        d();
        this.s0 = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((dm) getChildAt(i5).getLayoutParams()).c != null) {
                this.s0 = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.J0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.w0) {
            return;
        }
        if (!this.z0) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((dm) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.x0 != z2) {
            this.x0 = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = zmf.a;
            if (getFitsSystemWindows() && i()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = z04.p(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        d();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof q18) {
            ((q18) background).k(f);
        }
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = zmf.a;
        f(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.z0 = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.A0 = -1;
        if (view != null) {
            this.B0 = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.B0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.B0 = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.A0 = i;
        WeakReference weakReference = this.B0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.B0 = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.w0 = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.J0;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.J0 = drawableMutate;
            if (drawableMutate instanceof q18) {
                numValueOf = Integer.valueOf(((q18) drawableMutate).F0);
            } else {
                ColorStateList colorStateListR = oag.r(drawableMutate);
                if (colorStateListR != null) {
                    numValueOf = Integer.valueOf(colorStateListR.getDefaultColor());
                }
            }
            this.K0 = numValueOf;
            Drawable drawable3 = this.J0;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.J0.setState(getDrawableState());
                }
                Drawable drawable4 = this.J0;
                WeakHashMap weakHashMap = zmf.a;
                bq4.b(drawable4, getLayoutDirection());
                this.J0.setVisible(getVisibility() == 0, false);
                this.J0.setCallback(this);
            }
            if (this.J0 != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            WeakHashMap weakHashMap2 = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(s36.n(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        c37.z(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.J0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.J0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new dm(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }
}
