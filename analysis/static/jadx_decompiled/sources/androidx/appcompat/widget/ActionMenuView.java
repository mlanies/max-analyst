package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.b7;
import defpackage.br8;
import defpackage.d7;
import defpackage.e7;
import defpackage.f7;
import defpackage.g7;
import defpackage.h7;
import defpackage.nr8;
import defpackage.qr8;
import defpackage.rh7;
import defpackage.rxd;
import defpackage.sh7;
import defpackage.uq8;
import defpackage.vq8;
import defpackage.vu4;
import defpackage.wq8;

/* loaded from: classes.dex */
public class ActionMenuView extends sh7 implements vq8, qr8 {
    public wq8 a;
    public Context b;
    public int c;
    public boolean o;
    public e7 s0;
    public nr8 t0;
    public uq8 u0;
    public boolean v0;
    public int w0;
    public final int x0;
    public final int y0;
    public h7 z0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.x0 = (int) (56.0f * f);
        this.y0 = (int) (f * 4.0f);
        this.b = context;
        this.c = 0;
    }

    public static g7 c() {
        g7 g7Var = new g7(-2, -2);
        g7Var.a = false;
        ((LinearLayout.LayoutParams) g7Var).gravity = 16;
        return g7Var;
    }

    public static g7 e(ViewGroup.LayoutParams layoutParams) {
        g7 g7Var;
        if (layoutParams == null) {
            return c();
        }
        if (layoutParams instanceof g7) {
            g7 g7Var2 = (g7) layoutParams;
            g7Var = new g7(g7Var2);
            g7Var.a = g7Var2.a;
        } else {
            g7Var = new g7(layoutParams);
        }
        if (((LinearLayout.LayoutParams) g7Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) g7Var).gravity = 16;
        }
        return g7Var;
    }

    @Override // defpackage.vq8
    public final boolean a(br8 br8Var) {
        return this.a.q(br8Var, null, 0);
    }

    @Override // defpackage.qr8
    public final void b(wq8 wq8Var) {
        this.a = wq8Var;
    }

    @Override // defpackage.sh7, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g7;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final boolean f(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof f7)) {
            zB = ((f7) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof f7)) ? zB : zB | ((f7) childAt2).e();
    }

    @Override // defpackage.sh7, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ rh7 generateDefaultLayoutParams() {
        return c();
    }

    @Override // defpackage.sh7, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ rh7 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return e(layoutParams);
    }

    public Menu getMenu() {
        if (this.a == null) {
            Context context = getContext();
            wq8 wq8Var = new wq8(context);
            this.a = wq8Var;
            wq8Var.X = new rxd(1, this);
            e7 e7Var = new e7(context);
            this.s0 = e7Var;
            e7Var.w0 = true;
            e7Var.x0 = true;
            nr8 vu4Var = this.t0;
            if (vu4Var == null) {
                vu4Var = new vu4();
            }
            e7Var.X = vu4Var;
            this.a.b(e7Var, this.b);
            e7 e7Var2 = this.s0;
            e7Var2.s0 = this;
            this.a = e7Var2.c;
        }
        return this.a;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        e7 e7Var = this.s0;
        d7 d7Var = e7Var.t0;
        if (d7Var != null) {
            return d7Var.getDrawable();
        }
        if (e7Var.v0) {
            return e7Var.u0;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.c;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e7 e7Var = this.s0;
        if (e7Var != null) {
            e7Var.i();
            if (this.s0.j()) {
                this.s0.f();
                this.s0.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e7 e7Var = this.s0;
        if (e7Var != null) {
            e7Var.f();
            b7 b7Var = e7Var.E0;
            if (b7Var == null || !b7Var.b()) {
                return;
            }
            b7Var.j.dismiss();
        }
    }

    @Override // defpackage.sh7, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.v0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                g7 g7Var = (g7) childAt.getLayoutParams();
                if (g7Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (f(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) g7Var).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) g7Var).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) g7Var).leftMargin) + ((LinearLayout.LayoutParams) g7Var).rightMargin;
                    f(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                g7 g7Var2 = (g7) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !g7Var2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) g7Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) g7Var2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            g7 g7Var3 = (g7) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !g7Var3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) g7Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) g7Var3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // defpackage.sh7, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        ?? r1;
        int i10;
        int i11;
        int i12;
        wq8 wq8Var;
        boolean z2 = this.v0;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.v0 = z3;
        if (z2 != z3) {
            this.w0 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.v0 && (wq8Var = this.a) != null && size != this.w0) {
            this.w0 = size;
            wq8Var.p(true);
        }
        int childCount = getChildCount();
        if (!this.v0 || childCount <= 0) {
            for (int i13 = 0; i13 < childCount; i13++) {
                g7 g7Var = (g7) getChildAt(i13).getLayoutParams();
                ((LinearLayout.LayoutParams) g7Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) g7Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i14 = size2 - paddingRight;
        int i15 = this.x0;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = (i17 / i16) + i15;
        int childCount2 = getChildCount();
        int i19 = 0;
        int iMax = 0;
        int i20 = 0;
        boolean z4 = false;
        int i21 = 0;
        int iMax2 = 0;
        long j = 0;
        while (true) {
            i3 = this.y0;
            if (i20 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i20);
            int i22 = size3;
            if (childAt.getVisibility() == 8) {
                i10 = i14;
                i11 = paddingBottom;
            } else {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i23 = i19 + 1;
                if (z5) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                g7 g7Var2 = (g7) childAt.getLayoutParams();
                g7Var2.f = false;
                g7Var2.c = 0;
                g7Var2.b = 0;
                g7Var2.d = false;
                ((LinearLayout.LayoutParams) g7Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) g7Var2).rightMargin = 0;
                g7Var2.e = z5 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i24 = g7Var2.a ? 1 : i16;
                g7 g7Var3 = (g7) childAt.getLayoutParams();
                i10 = i14;
                i11 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z5 ? (ActionMenuItemView) childAt : null;
                boolean z6 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i24 <= 0 || (z6 && i24 < 2)) {
                    i12 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i24 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i12 = measuredWidth / i18;
                    if (measuredWidth % i18 != 0) {
                        i12++;
                    }
                    if (z6 && i12 < 2) {
                        i12 = 2;
                    }
                }
                g7Var3.d = !g7Var3.a && z6;
                g7Var3.b = i12;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i18, 1073741824), iMakeMeasureSpec);
                iMax = Math.max(iMax, i12);
                if (g7Var2.d) {
                    i21++;
                }
                if (g7Var2.a) {
                    z4 = true;
                }
                i16 -= i12;
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                if (i12 == 1) {
                    j |= 1 << i20;
                }
                i19 = i23;
            }
            i20++;
            size3 = i22;
            paddingBottom = i11;
            i14 = i10;
        }
        int i25 = i14;
        int i26 = size3;
        int i27 = iMax2;
        boolean z7 = z4 && i19 == 2;
        boolean z8 = false;
        while (i21 > 0 && i16 > 0) {
            int i28 = Integer.MAX_VALUE;
            int i29 = 0;
            int i30 = 0;
            long j2 = 0;
            while (i30 < childCount2) {
                int i31 = i27;
                g7 g7Var4 = (g7) getChildAt(i30).getLayoutParams();
                boolean z9 = z8;
                if (g7Var4.d) {
                    int i32 = g7Var4.b;
                    if (i32 < i28) {
                        j2 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        i29++;
                        j2 |= 1 << i30;
                    }
                }
                i30++;
                z8 = z9;
                i27 = i31;
            }
            i5 = i27;
            z = z8;
            j |= j2;
            if (i29 > i16) {
                i4 = mode;
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                g7 g7Var5 = (g7) childAt2.getLayoutParams();
                int i35 = mode;
                int i36 = childMeasureSpec;
                int i37 = childCount2;
                long j3 = 1 << i34;
                if ((j2 & j3) != 0) {
                    if (z7 && g7Var5.e) {
                        r1 = 1;
                        r1 = 1;
                        if (i16 == 1) {
                            childAt2.setPadding(i3 + i18, 0, i3, 0);
                        }
                    } else {
                        r1 = 1;
                    }
                    g7Var5.b += r1;
                    g7Var5.f = r1;
                    i16--;
                } else if (g7Var5.b == i33) {
                    j |= j3;
                }
                i34++;
                childMeasureSpec = i36;
                mode = i35;
                childCount2 = i37;
            }
            i27 = i5;
            z8 = true;
        }
        i4 = mode;
        i5 = i27;
        z = z8;
        int i38 = childMeasureSpec;
        int i39 = childCount2;
        boolean z10 = !z4 && i19 == 1;
        if (i16 <= 0 || j == 0 || (i16 >= i19 - 1 && !z10 && iMax <= 1)) {
            i6 = i39;
        } else {
            float fBitCount = Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((g7) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i40 = i39 - 1;
                if ((j & (1 << i40)) != 0 && !((g7) getChildAt(i40).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i41 = fBitCount > 0.0f ? (int) ((i16 * i18) / fBitCount) : 0;
            i6 = i39;
            for (int i42 = 0; i42 < i6; i42++) {
                if ((j & (1 << i42)) != 0) {
                    View childAt3 = getChildAt(i42);
                    g7 g7Var6 = (g7) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        g7Var6.c = i41;
                        g7Var6.f = true;
                        if (i42 == 0 && !g7Var6.e) {
                            ((LinearLayout.LayoutParams) g7Var6).leftMargin = (-i41) / 2;
                        }
                        z = true;
                    } else if (g7Var6.a) {
                        g7Var6.c = i41;
                        g7Var6.f = true;
                        ((LinearLayout.LayoutParams) g7Var6).rightMargin = (-i41) / 2;
                        z = true;
                    } else {
                        if (i42 != 0) {
                            ((LinearLayout.LayoutParams) g7Var6).leftMargin = i41 / 2;
                        }
                        if (i42 != i6 - 1) {
                            ((LinearLayout.LayoutParams) g7Var6).rightMargin = i41 / 2;
                        }
                    }
                }
            }
        }
        if (z) {
            int i43 = 0;
            while (i43 < i6) {
                View childAt4 = getChildAt(i43);
                g7 g7Var7 = (g7) childAt4.getLayoutParams();
                if (g7Var7.f) {
                    i9 = i38;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((g7Var7.b * i18) + g7Var7.c, 1073741824), i9);
                } else {
                    i9 = i38;
                }
                i43++;
                i38 = i9;
            }
        }
        if (i4 != 1073741824) {
            i8 = i25;
            i7 = i5;
        } else {
            i7 = i26;
            i8 = i25;
        }
        setMeasuredDimension(i8, i7);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.s0.B0 = z;
    }

    public void setOnMenuItemClickListener(h7 h7Var) {
        this.z0 = h7Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        e7 e7Var = this.s0;
        d7 d7Var = e7Var.t0;
        if (d7Var != null) {
            d7Var.setImageDrawable(drawable);
        } else {
            e7Var.v0 = true;
            e7Var.u0 = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.o = z;
    }

    public void setPopupTheme(int i) {
        if (this.c != i) {
            this.c = i;
            if (i == 0) {
                this.b = getContext();
            } else {
                this.b = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(e7 e7Var) {
        this.s0 = e7Var;
        e7Var.s0 = this;
        this.a = e7Var.c;
    }

    @Override // defpackage.sh7, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return c();
    }

    @Override // defpackage.sh7, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return e(layoutParams);
    }

    @Override // defpackage.sh7, android.view.ViewGroup
    public final rh7 generateLayoutParams(AttributeSet attributeSet) {
        return new g7(getContext(), attributeSet);
    }

    @Override // defpackage.sh7, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g7(getContext(), attributeSet);
    }
}
