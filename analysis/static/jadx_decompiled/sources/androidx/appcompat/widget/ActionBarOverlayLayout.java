package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import defpackage.d6g;
import defpackage.e7;
import defpackage.h6;
import defpackage.i6;
import defpackage.iwe;
import defpackage.j6;
import defpackage.jt;
import defpackage.k6;
import defpackage.kn9;
import defpackage.l6;
import defpackage.ln9;
import defpackage.m6g;
import defpackage.mmf;
import defpackage.mvb;
import defpackage.n6g;
import defpackage.nr8;
import defpackage.o6g;
import defpackage.omf;
import defpackage.rwe;
import defpackage.s36;
import defpackage.u54;
import defpackage.v27;
import defpackage.v54;
import defpackage.v6g;
import defpackage.vsb;
import defpackage.wof;
import defpackage.wq8;
import defpackage.x6g;
import defpackage.zmf;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements u54, kn9, ln9 {
    public static final int[] Q0 = {vsb.actionBarSize, R.attr.windowContentOverlay};
    public static final x6g R0;
    public static final Rect S0;
    public final Rect A0;
    public final Rect B0;
    public final Rect C0;
    public final Rect D0;
    public x6g E0;
    public x6g F0;
    public x6g G0;
    public x6g H0;
    public j6 I0;
    public OverScroller J0;
    public ViewPropertyAnimator K0;
    public final h6 L0;
    public final i6 M0;
    public final i6 N0;
    public final jt O0;
    public final l6 P0;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer o;
    public v54 s0;
    public Drawable t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public int y0;
    public int z0;

    static {
        o6g n6gVar = Build.VERSION.SDK_INT >= 30 ? new n6g() : new m6g();
        n6gVar.f(v27.b(0, 1, 0, 1));
        R0 = n6gVar.b();
        S0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.A0 = new Rect();
        this.B0 = new Rect();
        this.C0 = new Rect();
        this.D0 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        x6g x6gVar = x6g.b;
        this.E0 = x6gVar;
        this.F0 = x6gVar;
        this.G0 = x6gVar;
        this.H0 = x6gVar;
        this.L0 = new h6(0, this);
        this.M0 = new i6(this, 0);
        this.N0 = new i6(this, 1);
        c(context);
        this.O0 = new jt(6);
        l6 l6Var = new l6(context, 0);
        l6Var.setWillNotDraw(true);
        this.P0 = l6Var;
        addView(l6Var);
    }

    public static boolean a(View view, Rect rect, boolean z) {
        boolean z2;
        k6 k6Var = (k6) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) k6Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) k6Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) k6Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) k6Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) k6Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) k6Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) k6Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) k6Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public final void b() {
        removeCallbacks(this.M0);
        removeCallbacks(this.N0);
        ViewPropertyAnimator viewPropertyAnimator = this.K0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(Q0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.t0 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.J0 = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k6;
    }

    public final void d(int i) {
        e();
        if (i == 2) {
            this.s0.getClass();
        } else if (i == 5) {
            this.s0.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.t0 != null) {
            if (this.o.getVisibility() == 0) {
                translationY = (int) (this.o.getTranslationY() + this.o.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.t0.setBounds(0, translationY, getWidth(), this.t0.getIntrinsicHeight() + translationY);
            this.t0.draw(canvas);
        }
    }

    public final void e() {
        v54 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(mvb.action_bar_activity_content);
            this.o = (ActionBarContainer) findViewById(mvb.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(mvb.action_bar);
            if (callbackFindViewById instanceof v54) {
                wrapper = (v54) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.s0 = wrapper;
        }
    }

    public final void f(Menu menu, nr8 nr8Var) {
        e();
        rwe rweVar = (rwe) this.s0;
        e7 e7Var = rweVar.m;
        Toolbar toolbar = rweVar.a;
        if (e7Var == null) {
            rweVar.m = new e7(toolbar.getContext());
        }
        e7 e7Var2 = rweVar.m;
        e7Var2.X = nr8Var;
        wq8 wq8Var = (wq8) menu;
        if (wq8Var == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        wq8 wq8Var2 = toolbar.a.a;
        if (wq8Var2 == wq8Var) {
            return;
        }
        if (wq8Var2 != null) {
            wq8Var2.r(toolbar.Z0);
            wq8Var2.r(toolbar.a1);
        }
        if (toolbar.a1 == null) {
            toolbar.a1 = new iwe(toolbar);
        }
        e7Var2.B0 = true;
        if (wq8Var != null) {
            wq8Var.b(e7Var2, toolbar.x0);
            wq8Var.b(toolbar.a1, toolbar.x0);
        } else {
            e7Var2.k(toolbar.x0, null);
            toolbar.a1.k(toolbar.x0, null);
            e7Var2.i();
            toolbar.a1.i();
        }
        toolbar.a.setPopupTheme(toolbar.y0);
        toolbar.a.setPresenter(e7Var2);
        toolbar.Z0 = e7Var2;
        toolbar.x();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new k6(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new k6(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.o;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        jt jtVar = this.O0;
        return jtVar.c | jtVar.b;
    }

    public CharSequence getTitle() {
        e();
        return ((rwe) this.s0).a.getTitle();
    }

    @Override // defpackage.ln9
    public final void i(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        j(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.kn9
    public final void j(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.kn9
    public final boolean k(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.kn9
    public final void l(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.kn9
    public final void m(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.kn9
    public final void n(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        e();
        x6g x6gVarF = x6g.f(this, windowInsets);
        boolean zA = a(this.o, new Rect(x6gVarF.b(), x6gVarF.d(), x6gVarF.c(), x6gVarF.a()), false);
        WeakHashMap weakHashMap = zmf.a;
        Rect rect = this.A0;
        omf.b(this, x6gVarF, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        v6g v6gVar = x6gVarF.a;
        x6g x6gVarL = v6gVar.l(i, i2, i3, i4);
        this.E0 = x6gVarL;
        boolean z = true;
        if (!this.F0.equals(x6gVarL)) {
            this.F0 = this.E0;
            zA = true;
        }
        Rect rect2 = this.B0;
        if (rect2.equals(rect)) {
            z = zA;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return v6gVar.a().a.c().a.b().e();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = zmf.a;
        mmf.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                k6 k6Var = (k6) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) k6Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) k6Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.w0 || !z) {
            return false;
        }
        this.J0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.J0.getFinalY() > this.o.getHeight()) {
            b();
            this.N0.run();
        } else {
            b();
            this.M0.run();
        }
        this.x0 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.y0 + i2;
        this.y0 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        d6g d6gVar;
        wof wofVar;
        this.O0.b = i;
        this.y0 = getActionBarHideOffset();
        b();
        j6 j6Var = this.I0;
        if (j6Var == null || (wofVar = (d6gVar = (d6g) j6Var).G0) == null) {
            return;
        }
        wofVar.a();
        d6gVar.G0 = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.o.getVisibility() != 0) {
            return false;
        }
        return this.w0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.w0 || this.x0) {
            return;
        }
        if (this.y0 <= this.o.getHeight()) {
            b();
            postDelayed(this.M0, 600L);
        } else {
            b();
            postDelayed(this.N0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        e();
        int i2 = this.z0 ^ i;
        this.z0 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        j6 j6Var = this.I0;
        if (j6Var != null) {
            ((d6g) j6Var).C0 = !z2;
            if (z || !z2) {
                d6g d6gVar = (d6g) j6Var;
                if (d6gVar.D0) {
                    d6gVar.D0 = false;
                    d6gVar.f0(true);
                }
            } else {
                d6g d6gVar2 = (d6g) j6Var;
                if (!d6gVar2.D0) {
                    d6gVar2.D0 = true;
                    d6gVar2.f0(true);
                }
            }
        }
        if ((i2 & 256) == 0 || this.I0 == null) {
            return;
        }
        WeakHashMap weakHashMap = zmf.a;
        mmf.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        j6 j6Var = this.I0;
        if (j6Var != null) {
            ((d6g) j6Var).B0 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        b();
        this.o.setTranslationY(-Math.max(0, Math.min(i, this.o.getHeight())));
    }

    public void setActionBarVisibilityCallback(j6 j6Var) {
        this.I0 = j6Var;
        if (getWindowToken() != null) {
            ((d6g) this.I0).B0 = this.b;
            int i = this.z0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = zmf.a;
                mmf.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.v0 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.w0) {
            this.w0 = z;
            if (z) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        e();
        rwe rweVar = (rwe) this.s0;
        rweVar.d = i != 0 ? s36.n(rweVar.a.getContext(), i) : null;
        rweVar.c();
    }

    public void setLogo(int i) {
        e();
        rwe rweVar = (rwe) this.s0;
        rweVar.e = i != 0 ? s36.n(rweVar.a.getContext(), i) : null;
        rweVar.c();
    }

    public void setOverlayMode(boolean z) {
        this.u0 = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.u54
    public void setWindowCallback(Window.Callback callback) {
        e();
        ((rwe) this.s0).k = callback;
    }

    @Override // defpackage.u54
    public void setWindowTitle(CharSequence charSequence) {
        e();
        rwe rweVar = (rwe) this.s0;
        if (rweVar.g) {
            return;
        }
        rweVar.h = charSequence;
        if ((rweVar.b & 8) != 0) {
            Toolbar toolbar = rweVar.a;
            toolbar.setTitle(charSequence);
            if (rweVar.g) {
                zmf.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new k6(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        e();
        rwe rweVar = (rwe) this.s0;
        rweVar.d = drawable;
        rweVar.c();
    }
}
