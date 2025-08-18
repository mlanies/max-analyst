package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w53 extends FrameLayout {
    public static final int T0 = m2c.Widget_Design_CollapsingToolbar;
    public boolean A0;
    public boolean B0;
    public Drawable C0;
    public Drawable D0;
    public int E0;
    public boolean F0;
    public ValueAnimator G0;
    public long H0;
    public final TimeInterpolator I0;
    public final TimeInterpolator J0;
    public int K0;
    public u53 L0;
    public int M0;
    public int N0;
    public x6g O0;
    public int P0;
    public boolean Q0;
    public int R0;
    public boolean S0;
    public boolean a;
    public final int b;
    public ViewGroup c;
    public View o;
    public View s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public final Rect x0;
    public final s53 y0;
    public final ew4 z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public w53(Context context) {
        int i;
        ColorStateList colorStateListQ;
        ColorStateList colorStateListQ2;
        int i2 = tsb.collapsingToolbarLayoutStyle;
        int i3 = T0;
        super(y18.a(context, null, i2, i3), null, i2);
        this.a = true;
        this.x0 = new Rect();
        this.K0 = -1;
        this.P0 = 0;
        this.R0 = 0;
        Context context2 = getContext();
        s53 s53Var = new s53(this);
        this.y0 = s53Var;
        s53Var.W = og.e;
        s53Var.i(false);
        s53Var.J = false;
        this.z0 = new ew4(context2);
        int[] iArr = z2c.CollapsingToolbarLayout;
        sre.a(context2, null, i2, i3);
        sre.b(context2, null, iArr, i2, i3, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, i2, i3);
        int i4 = typedArrayObtainStyledAttributes.getInt(z2c.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
        if (s53Var.j != i4) {
            s53Var.j = i4;
            s53Var.i(false);
        }
        s53Var.l(typedArrayObtainStyledAttributes.getInt(z2c.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.w0 = dimensionPixelSize;
        this.v0 = dimensionPixelSize;
        this.u0 = dimensionPixelSize;
        this.t0 = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(z2c.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.A0 = typedArrayObtainStyledAttributes.getBoolean(z2c.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayObtainStyledAttributes.getText(z2c.CollapsingToolbarLayout_title));
        s53Var.n(m2c.TextAppearance_Design_CollapsingToolbar_Expanded);
        s53Var.k(s2c.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(z2c.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            s53Var.n(typedArrayObtainStyledAttributes.getResourceId(z2c.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            s53Var.k(typedArrayObtainStyledAttributes.getResourceId(z2c.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.CollapsingToolbarLayout_titleTextEllipsize)) {
            int i5 = typedArrayObtainStyledAttributes.getInt(z2c.CollapsingToolbarLayout_titleTextEllipsize, -1);
            setTitleEllipsize(i5 != 0 ? i5 != 1 ? i5 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.CollapsingToolbarLayout_expandedTitleTextColor) && s53Var.n != (colorStateListQ2 = ju0.q(context2, typedArrayObtainStyledAttributes, z2c.CollapsingToolbarLayout_expandedTitleTextColor))) {
            s53Var.n = colorStateListQ2;
            s53Var.i(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.CollapsingToolbarLayout_collapsedTitleTextColor) && s53Var.o != (colorStateListQ = ju0.q(context2, typedArrayObtainStyledAttributes, z2c.CollapsingToolbarLayout_collapsedTitleTextColor))) {
            s53Var.o = colorStateListQ;
            s53Var.i(false);
        }
        this.K0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (typedArrayObtainStyledAttributes.hasValue(z2c.CollapsingToolbarLayout_maxLines) && (i = typedArrayObtainStyledAttributes.getInt(z2c.CollapsingToolbarLayout_maxLines, 1)) != s53Var.n0) {
            s53Var.n0 = i;
            Bitmap bitmap = s53Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                s53Var.K = null;
            }
            s53Var.i(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.CollapsingToolbarLayout_titlePositionInterpolator)) {
            s53Var.V = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(z2c.CollapsingToolbarLayout_titlePositionInterpolator, 0));
            s53Var.i(false);
        }
        this.H0 = typedArrayObtainStyledAttributes.getInt(z2c.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        this.I0 = z7.Q(context2, tsb.motionEasingStandardInterpolator, og.c);
        this.J0 = z7.Q(context2, tsb.motionEasingStandardInterpolator, og.d);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(z2c.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(z2c.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(z2c.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.b = typedArrayObtainStyledAttributes.getResourceId(z2c.CollapsingToolbarLayout_toolbarId, -1);
        this.Q0 = typedArrayObtainStyledAttributes.getBoolean(z2c.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.S0 = typedArrayObtainStyledAttributes.getBoolean(z2c.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        w4d w4dVar = new w4d(9, this);
        WeakHashMap weakHashMap = zmf.a;
        omf.u(this, w4dVar);
    }

    public static cof b(View view) {
        cof cofVar = (cof) view.getTag(ivb.view_offset_helper);
        if (cofVar != null) {
            return cofVar;
        }
        cof cofVar2 = new cof(view);
        view.setTag(ivb.view_offset_helper, cofVar2);
        return cofVar2;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() throws Resources.NotFoundException {
        Context context = getContext();
        TypedValue typedValueC = kq0.C(context, tsb.colorSurfaceContainer);
        ColorStateList colorStateListValueOf = null;
        if (typedValueC != null) {
            int i = typedValueC.resourceId;
            if (i != 0) {
                colorStateListValueOf = z7.n(context, i);
            } else {
                int i2 = typedValueC.data;
                if (i2 != 0) {
                    colorStateListValueOf = ColorStateList.valueOf(i2);
                }
            }
        }
        if (colorStateListValueOf != null) {
            return colorStateListValueOf.getDefaultColor();
        }
        float dimension = getResources().getDimension(stb.design_appbar_elevation);
        ew4 ew4Var = this.z0;
        return ew4Var.a(ew4Var.d, dimension);
    }

    public final void a() {
        if (this.a) {
            ViewGroup viewGroup = null;
            this.c = null;
            this.o = null;
            int i = this.b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.c = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.o = view;
                }
            }
            if (this.c == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.c = viewGroup;
            }
            c();
            this.a = false;
        }
    }

    public final void c() {
        View view;
        if (!this.A0 && (view = this.s0) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.s0);
            }
        }
        if (!this.A0 || this.c == null) {
            return;
        }
        if (this.s0 == null) {
            this.s0 = new View(getContext());
        }
        if (this.s0.getParent() == null) {
            this.c.addView(this.s0, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t53;
    }

    public final void d() {
        if (this.C0 == null && this.D0 == null) {
            return;
        }
        setScrimsShown(getHeight() + this.M0 < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.c == null && (drawable = this.C0) != null && this.E0 > 0) {
            drawable.mutate().setAlpha(this.E0);
            this.C0.draw(canvas);
        }
        if (this.A0 && this.B0) {
            ViewGroup viewGroup = this.c;
            s53 s53Var = this.y0;
            if (viewGroup == null || this.C0 == null || this.E0 <= 0 || this.N0 != 1 || s53Var.b >= s53Var.e) {
                s53Var.d(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.C0.getBounds(), Region.Op.DIFFERENCE);
                s53Var.d(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.D0 == null || this.E0 <= 0) {
            return;
        }
        x6g x6gVar = this.O0;
        int iD = x6gVar != null ? x6gVar.d() : 0;
        if (iD > 0) {
            this.D0.setBounds(0, -this.M0, getWidth(), iD - this.M0);
            this.D0.mutate().setAlpha(this.E0);
            this.D0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.C0;
        if (drawable == null || this.E0 <= 0 || ((view2 = this.o) == null || view2 == this ? view != this.c : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.N0 == 1 && view != null && this.A0) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.C0.mutate().setAlpha(this.E0);
            this.C0.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.D0;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.C0;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        s53 s53Var = this.y0;
        if (s53Var != null) {
            s53Var.R = drawableState;
            ColorStateList colorStateList2 = s53Var.o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = s53Var.n) != null && colorStateList.isStateful())) {
                s53Var.i(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.A0 || (view = this.s0) == null) {
            return;
        }
        WeakHashMap weakHashMap = zmf.a;
        int titleMarginStart = 0;
        boolean z2 = view.isAttachedToWindow() && this.s0.getVisibility() == 0;
        this.B0 = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.o;
            if (view2 == null) {
                view2 = this.c;
            }
            int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((t53) view2.getLayoutParams())).bottomMargin;
            View view3 = this.s0;
            ThreadLocal threadLocal = uh4.a;
            int width = view3.getWidth();
            int height2 = view3.getHeight();
            Rect rect = this.x0;
            rect.set(0, 0, width, height2);
            uh4.b(this, view3, rect);
            ViewGroup viewGroup = this.c;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            } else {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            }
            int i5 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
            int i6 = rect.top + height + titleMarginTop;
            int i7 = rect.right;
            if (!z3) {
                titleMarginStart = titleMarginEnd;
            }
            int i8 = i7 - titleMarginStart;
            int i9 = (rect.bottom + height) - titleMarginBottom;
            s53 s53Var = this.y0;
            Rect rect2 = s53Var.h;
            if (rect2.left != i5 || rect2.top != i6 || rect2.right != i8 || rect2.bottom != i9) {
                rect2.set(i5, i6, i8, i9);
                s53Var.S = true;
            }
            int i10 = z3 ? this.v0 : this.t0;
            int i11 = rect.top + this.u0;
            int i12 = (i3 - i) - (z3 ? this.t0 : this.v0);
            int i13 = (i4 - i2) - this.w0;
            Rect rect3 = s53Var.g;
            if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                rect3.set(i10, i11, i12, i13);
                s53Var.S = true;
            }
            s53Var.i(z);
        }
    }

    public final void f() {
        if (this.c != null && this.A0 && TextUtils.isEmpty(this.y0.G)) {
            ViewGroup viewGroup = this.c;
            setTitle(viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new t53(-1, -1);
    }

    public int getCollapsedTitleGravity() {
        return this.y0.k;
    }

    public float getCollapsedTitleTextSize() {
        return this.y0.m;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.y0.w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.C0;
    }

    public int getExpandedTitleGravity() {
        return this.y0.j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.w0;
    }

    public int getExpandedTitleMarginEnd() {
        return this.v0;
    }

    public int getExpandedTitleMarginStart() {
        return this.t0;
    }

    public int getExpandedTitleMarginTop() {
        return this.u0;
    }

    public float getExpandedTitleTextSize() {
        return this.y0.l;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.y0.z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.y0.q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.y0.i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.y0.i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.y0.i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.y0.n0;
    }

    public int getScrimAlpha() {
        return this.E0;
    }

    public long getScrimAnimationDuration() {
        return this.H0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.K0;
        if (i >= 0) {
            return i + this.P0 + this.R0;
        }
        x6g x6gVar = this.O0;
        int iD = x6gVar != null ? x6gVar.d() : 0;
        WeakHashMap weakHashMap = zmf.a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iD, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.D0;
    }

    public CharSequence getTitle() {
        if (this.A0) {
            return this.y0.G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.N0;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.y0.V;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.y0.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof fm) {
            fm fmVar = (fm) parent;
            if (this.N0 == 1) {
                fmVar.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = zmf.a;
            setFitsSystemWindows(fmVar.getFitsSystemWindows());
            if (this.L0 == null) {
                this.L0 = new u53(this);
            }
            fmVar.a(this.L0);
            mmf.c(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.y0.h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        u53 u53Var = this.L0;
        if (u53Var != null && (parent instanceof fm) && (arrayList = ((fm) parent).v0) != null) {
            arrayList.remove(u53Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        x6g x6gVar = this.O0;
        if (x6gVar != null) {
            int iD = x6gVar.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap weakHashMap = zmf.a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            cof cofVarB = b(getChildAt(i6));
            View view = cofVarB.a;
            cofVarB.b = view.getTop();
            cofVarB.c = view.getLeft();
        }
        e(false, i, i2, i3, i4);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        x6g x6gVar = this.O0;
        int iD = x6gVar != null ? x6gVar.d() : 0;
        if ((mode == 0 || this.Q0) && iD > 0) {
            this.P0 = iD;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iD, 1073741824));
        }
        if (this.S0) {
            s53 s53Var = this.y0;
            if (s53Var.n0 > 1) {
                f();
                e(true, 0, 0, getMeasuredWidth(), getMeasuredHeight());
                int i3 = s53Var.p;
                if (i3 > 1) {
                    TextPaint textPaint = s53Var.U;
                    textPaint.setTextSize(s53Var.l);
                    textPaint.setTypeface(s53Var.z);
                    textPaint.setLetterSpacing(s53Var.g0);
                    this.R0 = (i3 - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.R0, 1073741824));
                }
            }
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            View view = this.o;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.C0;
        if (drawable != null) {
            ViewGroup viewGroup = this.c;
            if (this.N0 == 1 && viewGroup != null && this.A0) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.y0.l(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.y0.k(i);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        s53 s53Var = this.y0;
        if (s53Var.o != colorStateList) {
            s53Var.o = colorStateList;
            s53Var.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f) {
        s53 s53Var = this.y0;
        if (s53Var.m != f) {
            s53Var.m = f;
            s53Var.i(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        s53 s53Var = this.y0;
        if (s53Var.m(typeface)) {
            s53Var.i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.C0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.C0 = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.c;
                if (this.N0 == 1 && viewGroup != null && this.A0) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.C0.setCallback(this);
                this.C0.setAlpha(this.E0);
            }
            WeakHashMap weakHashMap = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(kt3.b(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        s53 s53Var = this.y0;
        if (s53Var.j != i) {
            s53Var.j = i;
            s53Var.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.w0 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.v0 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.t0 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.u0 = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.y0.n(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        s53 s53Var = this.y0;
        if (s53Var.n != colorStateList) {
            s53Var.n = colorStateList;
            s53Var.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        s53 s53Var = this.y0;
        if (s53Var.l != f) {
            s53Var.l = f;
            s53Var.i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        s53 s53Var = this.y0;
        if (s53Var.o(typeface)) {
            s53Var.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.S0 = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.Q0 = z;
    }

    public void setHyphenationFrequency(int i) {
        this.y0.q0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.y0.o0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.y0.p0 = f;
    }

    public void setMaxLines(int i) {
        s53 s53Var = this.y0;
        if (i != s53Var.n0) {
            s53Var.n0 = i;
            Bitmap bitmap = s53Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                s53Var.K = null;
            }
            s53Var.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.y0.J = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.E0) {
            if (this.C0 != null && (viewGroup = this.c) != null) {
                WeakHashMap weakHashMap = zmf.a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.E0 = i;
            WeakHashMap weakHashMap2 = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.H0 = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.K0 != i) {
            this.K0 = i;
            d();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap weakHashMap = zmf.a;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.F0 != z) {
            if (z2) {
                int i = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.G0;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.G0 = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.E0 ? this.I0 : this.J0);
                    this.G0.addUpdateListener(new yj0(2, this));
                } else if (valueAnimator.isRunning()) {
                    this.G0.cancel();
                }
                this.G0.setDuration(this.H0);
                this.G0.setIntValues(this.E0, i);
                this.G0.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.F0 = z;
        }
    }

    public void setStaticLayoutBuilderConfigurer(v53 v53Var) {
        s53 s53Var = this.y0;
        if (v53Var != null) {
            s53Var.i(true);
        } else {
            s53Var.getClass();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.D0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.D0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.D0.setState(getDrawableState());
                }
                Drawable drawable3 = this.D0;
                WeakHashMap weakHashMap = zmf.a;
                bq4.b(drawable3, getLayoutDirection());
                this.D0.setVisible(getVisibility() == 0, false);
                this.D0.setCallback(this);
                this.D0.setAlpha(this.E0);
            }
            WeakHashMap weakHashMap2 = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(kt3.b(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        s53 s53Var = this.y0;
        if (charSequence == null || !TextUtils.equals(s53Var.G, charSequence)) {
            s53Var.G = charSequence;
            s53Var.H = null;
            Bitmap bitmap = s53Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                s53Var.K = null;
            }
            s53Var.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.N0 = i;
        boolean z = i == 1;
        this.y0.c = z;
        ViewParent parent = getParent();
        if (parent instanceof fm) {
            fm fmVar = (fm) parent;
            if (this.N0 == 1) {
                fmVar.setLiftOnScroll(false);
            }
        }
        if (z && this.C0 == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        s53 s53Var = this.y0;
        s53Var.F = truncateAt;
        s53Var.i(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.A0) {
            this.A0 = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        s53 s53Var = this.y0;
        s53Var.V = timeInterpolator;
        s53Var.i(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.D0;
        if (drawable != null && drawable.isVisible() != z) {
            this.D0.setVisible(z, false);
        }
        Drawable drawable2 = this.C0;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.C0.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.C0 || drawable == this.D0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new t53(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        t53 t53Var = new t53(context, attributeSet);
        t53Var.a = 0;
        t53Var.b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.CollapsingToolbarLayout_Layout);
        t53Var.a = typedArrayObtainStyledAttributes.getInt(z2c.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
        t53Var.b = typedArrayObtainStyledAttributes.getFloat(z2c.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return t53Var;
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        t53 t53Var = new t53(layoutParams);
        t53Var.a = 0;
        t53Var.b = 0.5f;
        return t53Var;
    }
}
