package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import defpackage.aje;
import defpackage.aq4;
import defpackage.aw4;
import defpackage.bje;
import defpackage.cje;
import defpackage.cx5;
import defpackage.dje;
import defpackage.dof;
import defpackage.eje;
import defpackage.fje;
import defpackage.g04;
import defpackage.gje;
import defpackage.hpa;
import defpackage.j4;
import defpackage.ju0;
import defpackage.kq0;
import defpackage.m2c;
import defpackage.mqd;
import defpackage.nu0;
import defpackage.oag;
import defpackage.og;
import defpackage.omf;
import defpackage.p3c;
import defpackage.q18;
import defpackage.qq9;
import defpackage.s36;
import defpackage.sre;
import defpackage.stb;
import defpackage.tsb;
import defpackage.u5b;
import defpackage.v5b;
import defpackage.y18;
import defpackage.yj0;
import defpackage.z2c;
import defpackage.z7;
import defpackage.zmf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.apache.http.HttpStatus;

@dof
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    public static final int k1 = m2c.Widget_Design_TabLayout;
    public static final v5b l1 = new v5b(16);
    public ColorStateList A0;
    public ColorStateList B0;
    public Drawable C0;
    public int D0;
    public final PorterDuff.Mode E0;
    public final float F0;
    public final float G0;
    public final int H0;
    public int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public int N0;
    public final int O0;
    public int P0;
    public int Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public int U0;
    public boolean V0;
    public qq9 W0;
    public final TimeInterpolator X0;
    public bje Y0;
    public final ArrayList Z0;
    public int a;
    public cx5 a1;
    public final ArrayList b;
    public ValueAnimator b1;
    public eje c;
    public ViewPager c1;
    public hpa d1;
    public g04 e1;
    public fje f1;
    public aje g1;
    public boolean h1;
    public int i1;
    public final u5b j1;
    public final dje o;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final int x0;
    public final int y0;
    public ColorStateList z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i = tsb.tabStyle;
        int i2 = k1;
        super(y18.a(context, attributeSet, i, i2), attributeSet, i);
        this.a = -1;
        this.b = new ArrayList();
        this.y0 = -1;
        this.D0 = 0;
        this.I0 = Integer.MAX_VALUE;
        this.T0 = -1;
        this.Z0 = new ArrayList();
        this.j1 = new u5b(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        dje djeVar = new dje(this, context2);
        this.o = djeVar;
        super.addView(djeVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = sre.d(context2, attributeSet, z2c.TabLayout, i, i2, z2c.TabLayout_tabTextAppearance);
        ColorStateList colorStateListR = oag.r(getBackground());
        if (colorStateListR != null) {
            q18 q18Var = new q18();
            q18Var.l(colorStateListR);
            q18Var.j(context2);
            WeakHashMap weakHashMap = zmf.a;
            q18Var.k(omf.i(this));
            setBackground(q18Var);
        }
        setSelectedTabIndicator(ju0.s(context2, typedArrayD, z2c.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayD.getColor(z2c.TabLayout_tabIndicatorColor, 0));
        djeVar.b(typedArrayD.getDimensionPixelSize(z2c.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(z2c.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayD.getInt(z2c.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(z2c.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(z2c.TabLayout_tabPadding, 0);
        this.v0 = dimensionPixelSize;
        this.u0 = dimensionPixelSize;
        this.t0 = dimensionPixelSize;
        this.s0 = dimensionPixelSize;
        this.s0 = typedArrayD.getDimensionPixelSize(z2c.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.t0 = typedArrayD.getDimensionPixelSize(z2c.TabLayout_tabPaddingTop, dimensionPixelSize);
        this.u0 = typedArrayD.getDimensionPixelSize(z2c.TabLayout_tabPaddingEnd, dimensionPixelSize);
        this.v0 = typedArrayD.getDimensionPixelSize(z2c.TabLayout_tabPaddingBottom, dimensionPixelSize);
        if (kq0.E(tsb.isMaterial3Theme, context2, false)) {
            this.w0 = tsb.textAppearanceTitleSmall;
        } else {
            this.w0 = tsb.textAppearanceButton;
        }
        int resourceId = typedArrayD.getResourceId(z2c.TabLayout_tabTextAppearance, m2c.TextAppearance_Design_Tab);
        this.x0 = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, p3c.TextAppearance);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(p3c.TextAppearance_android_textSize, 0);
            this.F0 = dimensionPixelSize2;
            this.z0 = ju0.q(context2, typedArrayObtainStyledAttributes, p3c.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(z2c.TabLayout_tabSelectedTextAppearance)) {
                this.y0 = typedArrayD.getResourceId(z2c.TabLayout_tabSelectedTextAppearance, resourceId);
            }
            int i3 = this.y0;
            if (i3 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i3, p3c.TextAppearance);
                try {
                    typedArrayObtainStyledAttributes.getDimensionPixelSize(p3c.TextAppearance_android_textSize, (int) dimensionPixelSize2);
                    ColorStateList colorStateListQ = ju0.q(context2, typedArrayObtainStyledAttributes, p3c.TextAppearance_android_textColor);
                    if (colorStateListQ != null) {
                        this.z0 = f(this.z0.getDefaultColor(), colorStateListQ.getColorForState(new int[]{R.attr.state_selected}, colorStateListQ.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (typedArrayD.hasValue(z2c.TabLayout_tabTextColor)) {
                this.z0 = ju0.q(context2, typedArrayD, z2c.TabLayout_tabTextColor);
            }
            if (typedArrayD.hasValue(z2c.TabLayout_tabSelectedTextColor)) {
                this.z0 = f(this.z0.getDefaultColor(), typedArrayD.getColor(z2c.TabLayout_tabSelectedTextColor, 0));
            }
            this.A0 = ju0.q(context2, typedArrayD, z2c.TabLayout_tabIconTint);
            this.E0 = mqd.A(typedArrayD.getInt(z2c.TabLayout_tabIconTintMode, -1), null);
            this.B0 = ju0.q(context2, typedArrayD, z2c.TabLayout_tabRippleColor);
            this.O0 = typedArrayD.getInt(z2c.TabLayout_tabIndicatorAnimationDuration, HttpStatus.SC_MULTIPLE_CHOICES);
            this.X0 = z7.Q(context2, tsb.motionEasingEmphasizedInterpolator, og.b);
            this.J0 = typedArrayD.getDimensionPixelSize(z2c.TabLayout_tabMinWidth, -1);
            this.K0 = typedArrayD.getDimensionPixelSize(z2c.TabLayout_tabMaxWidth, -1);
            this.H0 = typedArrayD.getResourceId(z2c.TabLayout_tabBackground, 0);
            this.M0 = typedArrayD.getDimensionPixelSize(z2c.TabLayout_tabContentStart, 0);
            this.Q0 = typedArrayD.getInt(z2c.TabLayout_tabMode, 1);
            this.N0 = typedArrayD.getInt(z2c.TabLayout_tabGravity, 0);
            this.R0 = typedArrayD.getBoolean(z2c.TabLayout_tabInlineLabel, false);
            this.V0 = typedArrayD.getBoolean(z2c.TabLayout_tabUnboundedRipple, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.G0 = resources.getDimensionPixelSize(stb.design_tab_text_size_2line);
            this.L0 = resources.getDimensionPixelSize(stb.design_tab_scrollable_min_width);
            d();
        } finally {
        }
    }

    public static ColorStateList f(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            eje ejeVar = (eje) arrayList.get(i);
            if (ejeVar == null || ejeVar.a == null || TextUtils.isEmpty(ejeVar.b)) {
                i++;
            } else if (!this.R0) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.J0;
        if (i != -1) {
            return i;
        }
        int i2 = this.Q0;
        if (i2 == 0 || i2 == 2) {
            return this.L0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.o.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        dje djeVar = this.o;
        int childCount = djeVar.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = djeVar.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof gje) {
                        ((gje) childAt).g();
                    }
                }
                i2++;
            }
        }
    }

    public final void a(bje bjeVar) {
        ArrayList arrayList = this.Z0;
        if (arrayList.contains(bjeVar)) {
            return;
        }
        arrayList.add(bjeVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(eje ejeVar, int i, boolean z) {
        if (ejeVar.f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        ejeVar.d = i;
        ArrayList arrayList = this.b;
        arrayList.add(i, ejeVar);
        int size = arrayList.size();
        int i2 = -1;
        for (int i3 = i + 1; i3 < size; i3++) {
            if (((eje) arrayList.get(i3)).d == this.a) {
                i2 = i3;
            }
            ((eje) arrayList.get(i3)).d = i3;
        }
        this.a = i2;
        gje gjeVar = ejeVar.g;
        gjeVar.setSelected(false);
        gjeVar.setActivated(false);
        int i4 = ejeVar.d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.Q0 == 1 && this.N0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.o.addView(gjeVar, i4, layoutParams);
        if (z) {
            TabLayout tabLayout = ejeVar.f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.o(ejeVar, true);
        }
    }

    public final void c(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = zmf.a;
            if (isLaidOut()) {
                dje djeVar = this.o;
                int childCount = djeVar.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (djeVar.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iE = e(i, 0.0f);
                if (scrollX != iE) {
                    g();
                    this.b1.setIntValues(scrollX, iE);
                    this.b1.start();
                }
                ValueAnimator valueAnimator = djeVar.a;
                if (valueAnimator != null && valueAnimator.isRunning() && djeVar.b.a != i) {
                    djeVar.a.cancel();
                }
                djeVar.d(i, this.O0, true);
                return;
            }
        }
        q(i, 0.0f, true, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r4 = this;
            int r0 = r4.Q0
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r4.M0
            int r3 = r4.s0
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            java.util.WeakHashMap r3 = defpackage.zmf.a
            dje r3 = r4.o
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r4.Q0
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L25
            if (r0 == r1) goto L25
            goto L3c
        L25:
            r3.setGravity(r2)
            goto L3c
        L29:
            int r0 = r4.N0
            if (r0 == 0) goto L36
            if (r0 == r2) goto L32
            if (r0 == r1) goto L36
            goto L3c
        L32:
            r3.setGravity(r2)
            goto L3c
        L36:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L3c:
            r4.s(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.d():void");
    }

    public final int e(int i, float f) {
        dje djeVar;
        View childAt;
        int i2 = this.Q0;
        if ((i2 != 0 && i2 != 2) || (childAt = (djeVar = this.o).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < djeVar.getChildCount() ? djeVar.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        WeakHashMap weakHashMap = zmf.a;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void g() {
        if (this.b1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.b1 = valueAnimator;
            valueAnimator.setInterpolator(this.X0);
            this.b1.setDuration(this.O0);
            this.b1.addUpdateListener(new yj0(7, this));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        eje ejeVar = this.c;
        if (ejeVar != null) {
            return ejeVar.d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.N0;
    }

    public ColorStateList getTabIconTint() {
        return this.A0;
    }

    public int getTabIndicatorAnimationMode() {
        return this.U0;
    }

    public int getTabIndicatorGravity() {
        return this.P0;
    }

    public int getTabMaxWidth() {
        return this.I0;
    }

    public int getTabMode() {
        return this.Q0;
    }

    public ColorStateList getTabRippleColor() {
        return this.B0;
    }

    public Drawable getTabSelectedIndicator() {
        return this.C0;
    }

    public ColorStateList getTabTextColors() {
        return this.z0;
    }

    public final eje h(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (eje) this.b.get(i);
    }

    public final eje i() {
        eje ejeVar = (eje) l1.f();
        if (ejeVar == null) {
            ejeVar = new eje();
            ejeVar.d = -1;
            ejeVar.h = -1;
        }
        ejeVar.f = this;
        u5b u5bVar = this.j1;
        gje gjeVar = u5bVar != null ? (gje) u5bVar.f() : null;
        if (gjeVar == null) {
            gjeVar = new gje(this, getContext());
        }
        gjeVar.setTab(ejeVar);
        gjeVar.setFocusable(true);
        gjeVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(ejeVar.c)) {
            gjeVar.setContentDescription(ejeVar.b);
        } else {
            gjeVar.setContentDescription(ejeVar.c);
        }
        ejeVar.g = gjeVar;
        int i = ejeVar.h;
        if (i != -1) {
            gjeVar.setId(i);
        }
        return ejeVar;
    }

    public final void j() {
        int currentItem;
        k();
        hpa hpaVar = this.d1;
        if (hpaVar != null) {
            int iB = hpaVar.b();
            for (int i = 0; i < iB; i++) {
                eje ejeVarI = i();
                this.d1.getClass();
                if (TextUtils.isEmpty(ejeVarI.c) && !TextUtils.isEmpty(null)) {
                    ejeVarI.g.setContentDescription(null);
                }
                ejeVarI.b = null;
                gje gjeVar = ejeVarI.g;
                if (gjeVar != null) {
                    gjeVar.e();
                }
                b(ejeVarI, this.b.size(), false);
            }
            ViewPager viewPager = this.c1;
            if (viewPager == null || iB <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            o(h(currentItem), true);
        }
    }

    public final void k() {
        for (int childCount = this.o.getChildCount() - 1; childCount >= 0; childCount--) {
            n(childCount);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            eje ejeVar = (eje) it.next();
            it.remove();
            ejeVar.f = null;
            ejeVar.g = null;
            ejeVar.a = null;
            ejeVar.h = -1;
            ejeVar.b = null;
            ejeVar.c = null;
            ejeVar.d = -1;
            ejeVar.e = null;
            l1.e(ejeVar);
        }
        this.c = null;
    }

    public final void l(bje bjeVar) {
        this.Z0.remove(bjeVar);
    }

    public final void m(int i) {
        eje ejeVar = this.c;
        int i2 = ejeVar != null ? ejeVar.d : 0;
        n(i);
        ArrayList arrayList = this.b;
        eje ejeVar2 = (eje) arrayList.remove(i);
        int i3 = -1;
        if (ejeVar2 != null) {
            ejeVar2.f = null;
            ejeVar2.g = null;
            ejeVar2.a = null;
            ejeVar2.h = -1;
            ejeVar2.b = null;
            ejeVar2.c = null;
            ejeVar2.d = -1;
            ejeVar2.e = null;
            l1.e(ejeVar2);
        }
        int size = arrayList.size();
        for (int i4 = i; i4 < size; i4++) {
            if (((eje) arrayList.get(i4)).d == this.a) {
                i3 = i4;
            }
            ((eje) arrayList.get(i4)).d = i4;
        }
        this.a = i3;
        if (i2 == i) {
            o(arrayList.isEmpty() ? null : (eje) arrayList.get(Math.max(0, i - 1)), true);
        }
    }

    public final void n(int i) {
        dje djeVar = this.o;
        gje gjeVar = (gje) djeVar.getChildAt(i);
        djeVar.removeViewAt(i);
        if (gjeVar != null) {
            gjeVar.setTab(null);
            gjeVar.setSelected(false);
            this.j1.e(gjeVar);
        }
        requestLayout();
    }

    public final void o(eje ejeVar, boolean z) {
        eje ejeVar2 = this.c;
        ArrayList arrayList = this.Z0;
        if (ejeVar2 == ejeVar) {
            if (ejeVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((bje) arrayList.get(size)).getClass();
                }
                c(ejeVar.d);
                return;
            }
            return;
        }
        int i = ejeVar != null ? ejeVar.d : -1;
        if (z) {
            if ((ejeVar2 == null || ejeVar2.d == -1) && i != -1) {
                q(i, 0.0f, true, true, true);
            } else {
                c(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.c = ejeVar;
        if (ejeVar2 != null && ejeVar2.f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((bje) arrayList.get(size2)).getClass();
            }
        }
        if (ejeVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((bje) arrayList.get(size3)).a(ejeVar);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof q18) {
            nu0.N(this, (q18) background);
        }
        if (this.c1 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                r((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.h1) {
            setupWithViewPager(null);
            this.h1 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        gje gjeVar;
        Drawable drawable;
        int i = 0;
        while (true) {
            dje djeVar = this.o;
            if (i >= djeVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = djeVar.getChildAt(i);
            if ((childAt instanceof gje) && (drawable = (gjeVar = (gje) childAt).w0) != null) {
                drawable.setBounds(gjeVar.getLeft(), gjeVar.getTop(), gjeVar.getRight(), gjeVar.getBottom());
                gjeVar.w0.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j4.a(1, getTabCount(), 1).a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = defpackage.mqd.h(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.K0
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = defpackage.mqd.h(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.I0 = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto La9
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.Q0
            if (r0 == 0) goto L81
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L81
            goto La9
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto La9
            goto L8b
        L81:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto La9
        L8b:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r6 = r6.getMeasuredWidth()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r7.measure(r6, r8)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(hpa hpaVar, boolean z) {
        g04 g04Var;
        hpa hpaVar2 = this.d1;
        if (hpaVar2 != null && (g04Var = this.e1) != null) {
            hpaVar2.a.unregisterObserver(g04Var);
        }
        this.d1 = hpaVar;
        if (z && hpaVar != null) {
            if (this.e1 == null) {
                this.e1 = new g04(2, this);
            }
            hpaVar.a.registerObserver(this.e1);
        }
        j();
    }

    public final void q(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound >= 0) {
            dje djeVar = this.o;
            if (iRound >= djeVar.getChildCount()) {
                return;
            }
            if (z2) {
                djeVar.b.a = Math.round(f2);
                ValueAnimator valueAnimator = djeVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    djeVar.a.cancel();
                }
                djeVar.c(djeVar.getChildAt(i), djeVar.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.b1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.b1.cancel();
            }
            int iE = e(i, f);
            int scrollX = getScrollX();
            boolean z4 = (i < getSelectedTabPosition() && iE >= scrollX) || (i > getSelectedTabPosition() && iE <= scrollX) || i == getSelectedTabPosition();
            WeakHashMap weakHashMap = zmf.a;
            if (getLayoutDirection() == 1) {
                z4 = (i < getSelectedTabPosition() && iE <= scrollX) || (i > getSelectedTabPosition() && iE >= scrollX) || i == getSelectedTabPosition();
            }
            if (z4 || this.i1 == 1 || z3) {
                if (i < 0) {
                    iE = 0;
                }
                scrollTo(iE, 0);
            }
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void r(ViewPager viewPager, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.c1;
        if (viewPager2 != null) {
            fje fjeVar = this.f1;
            if (fjeVar != null && (arrayList2 = viewPager2.f1) != null) {
                arrayList2.remove(fjeVar);
            }
            aje ajeVar = this.g1;
            if (ajeVar != null && (arrayList = this.c1.h1) != null) {
                arrayList.remove(ajeVar);
            }
        }
        bje bjeVar = this.a1;
        if (bjeVar != null) {
            l(bjeVar);
            this.a1 = null;
        }
        if (viewPager != null) {
            this.c1 = viewPager;
            if (this.f1 == null) {
                this.f1 = new fje(this);
            }
            fje fjeVar2 = this.f1;
            fjeVar2.c = 0;
            fjeVar2.b = 0;
            viewPager.b(fjeVar2);
            cx5 cx5Var = new cx5(2, viewPager);
            this.a1 = cx5Var;
            a(cx5Var);
            hpa adapter = viewPager.getAdapter();
            if (adapter != null) {
                p(adapter, true);
            }
            if (this.g1 == null) {
                this.g1 = new aje(this);
            }
            aje ajeVar2 = this.g1;
            ajeVar2.a = true;
            if (viewPager.h1 == null) {
                viewPager.h1 = new ArrayList();
            }
            viewPager.h1.add(ajeVar2);
            q(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            this.c1 = null;
            p(null, false);
        }
        this.h1 = z;
    }

    public final void s(boolean z) {
        int i = 0;
        while (true) {
            dje djeVar = this.o;
            if (i >= djeVar.getChildCount()) {
                return;
            }
            View childAt = djeVar.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.Q0 == 1 && this.N0 == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof q18) {
            ((q18) background).k(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.R0 == z) {
            return;
        }
        this.R0 = z;
        int i = 0;
        while (true) {
            dje djeVar = this.o;
            if (i >= djeVar.getChildCount()) {
                d();
                return;
            }
            View childAt = djeVar.getChildAt(i);
            if (childAt instanceof gje) {
                gje gjeVar = (gje) childAt;
                gjeVar.setOrientation(!gjeVar.y0.R0 ? 1 : 0);
                TextView textView = gjeVar.u0;
                if (textView == null && gjeVar.v0 == null) {
                    gjeVar.h(gjeVar.b, gjeVar.c, true);
                } else {
                    gjeVar.h(textView, gjeVar.v0, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(cje cjeVar) {
        setOnTabSelectedListener((bje) cjeVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.b1.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.C0 = drawableMutate;
        int i = this.D0;
        if (i != 0) {
            aq4.g(drawableMutate, i);
        } else {
            aq4.h(drawableMutate, null);
        }
        int intrinsicHeight = this.T0;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.C0.getIntrinsicHeight();
        }
        this.o.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.D0 = i;
        Drawable drawable = this.C0;
        if (i != 0) {
            aq4.g(drawable, i);
        } else {
            aq4.h(drawable, null);
        }
        s(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.P0 != i) {
            this.P0 = i;
            WeakHashMap weakHashMap = zmf.a;
            this.o.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.T0 = i;
        this.o.b(i);
    }

    public void setTabGravity(int i) {
        if (this.N0 != i) {
            this.N0 = i;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                gje gjeVar = ((eje) arrayList.get(i)).g;
                if (gjeVar != null) {
                    gjeVar.e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(z7.n(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.U0 = i;
        if (i == 0) {
            this.W0 = new qq9();
            return;
        }
        if (i == 1) {
            this.W0 = new aw4(0);
        } else {
            if (i == 2) {
                this.W0 = new aw4(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.S0 = z;
        int i = dje.c;
        dje djeVar = this.o;
        djeVar.a(djeVar.b.getSelectedTabPosition());
        WeakHashMap weakHashMap = zmf.a;
        djeVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.Q0) {
            this.Q0 = i;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.B0 == colorStateList) {
            return;
        }
        this.B0 = colorStateList;
        int i = 0;
        while (true) {
            dje djeVar = this.o;
            if (i >= djeVar.getChildCount()) {
                return;
            }
            View childAt = djeVar.getChildAt(i);
            if (childAt instanceof gje) {
                Context context = getContext();
                int i2 = gje.z0;
                ((gje) childAt).f(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(z7.n(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                gje gjeVar = ((eje) arrayList.get(i)).g;
                if (gjeVar != null) {
                    gjeVar.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(hpa hpaVar) {
        p(hpaVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.V0 == z) {
            return;
        }
        this.V0 = z;
        int i = 0;
        while (true) {
            dje djeVar = this.o;
            if (i >= djeVar.getChildCount()) {
                return;
            }
            View childAt = djeVar.getChildAt(i);
            if (childAt instanceof gje) {
                Context context = getContext();
                int i2 = gje.z0;
                ((gje) childAt).f(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        r(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(bje bjeVar) {
        bje bjeVar2 = this.Y0;
        if (bjeVar2 != null) {
            l(bjeVar2);
        }
        this.Y0 = bjeVar;
        if (bjeVar != null) {
            a(bjeVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(s36.n(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
