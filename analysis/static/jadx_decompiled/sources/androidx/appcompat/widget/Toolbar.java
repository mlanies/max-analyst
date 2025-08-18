package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.bkg;
import defpackage.br8;
import defpackage.e0d;
import defpackage.e16;
import defpackage.e7;
import defpackage.fwe;
import defpackage.gwe;
import defpackage.hwe;
import defpackage.iwe;
import defpackage.jwe;
import defpackage.k8g;
import defpackage.kwe;
import defpackage.lwe;
import defpackage.nr8;
import defpackage.p3c;
import defpackage.pl8;
import defpackage.rwe;
import defpackage.s36;
import defpackage.swe;
import defpackage.ude;
import defpackage.umf;
import defpackage.uq8;
import defpackage.v54;
import defpackage.voc;
import defpackage.vsb;
import defpackage.wmc;
import defpackage.wq8;
import defpackage.yq8;
import defpackage.zmf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements yq8 {
    public int A0;
    public final int B0;
    public final int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public voc H0;
    public int I0;
    public int J0;
    public final int K0;
    public CharSequence L0;
    public CharSequence M0;
    public ColorStateList N0;
    public ColorStateList O0;
    public boolean P0;
    public boolean Q0;
    public final ArrayList R0;
    public final ArrayList S0;
    public final int[] T0;
    public final pl8 U0;
    public ArrayList V0;
    public kwe W0;
    public final bkg X0;
    public rwe Y0;
    public e7 Z0;
    public ActionMenuView a;
    public iwe a1;
    public AppCompatTextView b;
    public nr8 b1;
    public AppCompatTextView c;
    public uq8 c1;
    public boolean d1;
    public OnBackInvokedCallback e1;
    public OnBackInvokedDispatcher f1;
    public boolean g1;
    public final gwe h1;
    public AppCompatImageButton o;
    public AppCompatImageView s0;
    public Drawable t0;
    public final CharSequence u0;
    public AppCompatImageButton v0;
    public View w0;
    public Context x0;
    public int y0;
    public int z0;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vsb.toolbarStyle);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new ude(getContext());
    }

    public static jwe h() {
        return new jwe(-2);
    }

    public static jwe i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof jwe;
        if (z) {
            jwe jweVar = (jwe) layoutParams;
            jwe jweVar2 = new jwe(jweVar);
            jweVar2.b = 0;
            jweVar2.b = jweVar.b;
            return jweVar2;
        }
        if (z) {
            jwe jweVar3 = new jwe((jwe) layoutParams);
            jweVar3.b = 0;
            return jweVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            jwe jweVar4 = new jwe(layoutParams);
            jweVar4.b = 0;
            return jweVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        jwe jweVar5 = new jwe(marginLayoutParams);
        jweVar5.b = 0;
        ((ViewGroup.MarginLayoutParams) jweVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) jweVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) jweVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) jweVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return jweVar5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                jwe jweVar = (jwe) childAt.getLayoutParams();
                if (jweVar.b == 0 && v(childAt)) {
                    int i3 = jweVar.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            jwe jweVar2 = (jwe) childAt2.getLayoutParams();
            if (jweVar2.b == 0 && v(childAt2)) {
                int i5 = jweVar2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        jwe jweVarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (jwe) layoutParams;
        jweVarH.b = 1;
        if (!z || this.w0 == null) {
            addView(view, jweVarH);
        } else {
            view.setLayoutParams(jweVarH);
            this.S0.add(view);
        }
    }

    public final void c() {
        if (this.v0 == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, vsb.toolbarNavigationButtonStyle);
            this.v0 = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.t0);
            this.v0.setContentDescription(this.u0);
            jwe jweVarH = h();
            jweVarH.a = (this.B0 & 112) | 8388611;
            jweVarH.b = 2;
            this.v0.setLayoutParams(jweVarH);
            this.v0.setOnClickListener(new e0d(13, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof jwe);
    }

    public final void d() {
        if (this.H0 == null) {
            voc vocVar = new voc();
            vocVar.a = 0;
            vocVar.b = 0;
            vocVar.c = Integer.MIN_VALUE;
            vocVar.d = Integer.MIN_VALUE;
            vocVar.e = 0;
            vocVar.f = 0;
            vocVar.g = false;
            vocVar.h = false;
            this.H0 = vocVar;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            wq8 wq8Var = (wq8) actionMenuView.getMenu();
            if (this.a1 == null) {
                this.a1 = new iwe(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            wq8Var.b(this.a1, this.x0);
            x();
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.y0);
            this.a.setOnMenuItemClickListener(this.X0);
            ActionMenuView actionMenuView2 = this.a;
            nr8 nr8Var = this.b1;
            wmc wmcVar = new wmc(this, false);
            actionMenuView2.t0 = nr8Var;
            actionMenuView2.u0 = wmcVar;
            jwe jweVarH = h();
            jweVarH.a = (this.B0 & 112) | 8388613;
            this.a.setLayoutParams(jweVarH);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.o == null) {
            this.o = new AppCompatImageButton(getContext(), null, vsb.toolbarNavigationButtonStyle);
            jwe jweVarH = h();
            jweVarH.a = (this.B0 & 112) | 8388611;
            this.o.setLayoutParams(jweVarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.v0;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.v0;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        voc vocVar = this.H0;
        if (vocVar != null) {
            return vocVar.g ? vocVar.a : vocVar.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.J0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        voc vocVar = this.H0;
        if (vocVar != null) {
            return vocVar.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        voc vocVar = this.H0;
        if (vocVar != null) {
            return vocVar.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        voc vocVar = this.H0;
        if (vocVar != null) {
            return vocVar.g ? vocVar.b : vocVar.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.I0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        wq8 wq8Var;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (wq8Var = actionMenuView.a) == null || !wq8Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.J0, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.I0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.s0;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.s0;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.o;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.o;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.o;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public e7 getOuterActionMenuPresenter() {
        return this.Z0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.x0;
    }

    public int getPopupTheme() {
        return this.y0;
    }

    public CharSequence getSubtitle() {
        return this.M0;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.L0;
    }

    public int getTitleMarginBottom() {
        return this.G0;
    }

    public int getTitleMarginEnd() {
        return this.E0;
    }

    public int getTitleMarginStart() {
        return this.D0;
    }

    public int getTitleMarginTop() {
        return this.F0;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public v54 getWrapper() {
        if (this.Y0 == null) {
            this.Y0 = new rwe(this, true);
        }
        return this.Y0;
    }

    public final int j(View view, int i) {
        jwe jweVar = (jwe) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = jweVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.K0 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) jweVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) jweVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) jweVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        Iterator it = this.V0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.U0.b).iterator();
        while (it2.hasNext()) {
            ((e16) it2.next()).a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.V0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.S0.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.h1);
        x();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.Q0 = false;
        }
        if (!this.Q0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.Q0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.Q0 = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0298 A[LOOP:0: B:105:0x0296->B:106:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b5 A[LOOP:1: B:108:0x02b3->B:109:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d3 A[LOOP:2: B:111:0x02d1->B:112:0x02d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0321 A[LOOP:3: B:120:0x031f->B:121:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0221  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        char c2;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            c2 = 1;
            c = 0;
        } else {
            c = 1;
            c2 = 0;
        }
        if (v(this.o)) {
            t(this.o, i, 0, i2, this.C0);
            iK = k(this.o) + this.o.getMeasuredWidth();
            iMax = Math.max(0, l(this.o) + this.o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.o.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (v(this.v0)) {
            t(this.v0, i, 0, i2, this.C0);
            iK = k(this.v0) + this.v0.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.v0) + this.v0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.v0.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.T0;
        iArr[c2] = iMax4;
        if (v(this.a)) {
            t(this.a, i, iMax3, i2, this.C0);
            iK2 = k(this.a) + this.a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.a) + this.a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iK2);
        if (v(this.w0)) {
            iMax5 += s(this.w0, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.w0) + this.w0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.w0.getMeasuredState());
        }
        if (v(this.s0)) {
            iMax5 += s(this.s0, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.s0) + this.s0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.s0.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((jwe) childAt.getLayoutParams()).b == 0 && v(childAt)) {
                iMax5 += s(childAt, i, iMax5, i2, 0, iArr);
                iMax = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.F0 + this.G0;
        int i6 = this.D0 + this.E0;
        if (v(this.b)) {
            s(this.b, i, iMax5 + i6, i2, i5, iArr);
            int iK3 = k(this.b) + this.b.getMeasuredWidth();
            iL = l(this.b) + this.b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (v(this.c)) {
            iMax2 = Math.max(iMax2, s(this.c, i, iMax5 + i6, i2, iL + i5, iArr));
            iL += l(this.c) + this.c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.d1) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            View childAt2 = getChildAt(i7);
            if (v(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof lwe)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        lwe lweVar = (lwe) parcelable;
        super.onRestoreInstanceState(lweVar.a);
        ActionMenuView actionMenuView = this.a;
        wq8 wq8Var = actionMenuView != null ? actionMenuView.a : null;
        int i = lweVar.c;
        if (i != 0 && this.a1 != null && wq8Var != null && (menuItemFindItem = wq8Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (lweVar.o) {
            gwe gweVar = this.h1;
            removeCallbacks(gweVar);
            post(gweVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        voc vocVar = this.H0;
        boolean z = i == 1;
        if (z == vocVar.g) {
            return;
        }
        vocVar.g = z;
        if (!vocVar.h) {
            vocVar.a = vocVar.e;
            vocVar.b = vocVar.f;
            return;
        }
        if (z) {
            int i2 = vocVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = vocVar.e;
            }
            vocVar.a = i2;
            int i3 = vocVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = vocVar.f;
            }
            vocVar.b = i3;
            return;
        }
        int i4 = vocVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = vocVar.e;
        }
        vocVar.a = i4;
        int i5 = vocVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = vocVar.f;
        }
        vocVar.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        br8 br8Var;
        lwe lweVar = new lwe(super.onSaveInstanceState());
        iwe iweVar = this.a1;
        if (iweVar != null && (br8Var = iweVar.b) != null) {
            lweVar.c = br8Var.a;
        }
        lweVar.o = p();
        return lweVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.P0 = false;
        }
        if (!this.P0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.P0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.P0 = false;
        }
        return true;
    }

    public final boolean p() {
        e7 e7Var;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (e7Var = actionMenuView.s0) == null || !e7Var.j()) ? false : true;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        jwe jweVar = (jwe) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) jweVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) jweVar).rightMargin + iMax;
    }

    public final int r(View view, int i, int i2, int[] iArr) {
        jwe jweVar = (jwe) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) jweVar).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) jweVar).leftMargin);
    }

    public final int s(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.g1 != z) {
            this.g1 = z;
            x();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(s36.n(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.d1 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.J0) {
            this.J0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.I0) {
            this.I0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(s36.n(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(s36.n(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.o.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(kwe kweVar) {
        this.W0 = kweVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.y0 != i) {
            this.y0 = i;
            if (i == 0) {
                this.x0 = getContext();
            } else {
                this.x0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.G0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.E0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.D0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.F0 = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void u(int i, int i2) {
        d();
        this.H0.a(i, i2);
    }

    public final boolean v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean w() {
        e7 e7Var;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (e7Var = actionMenuView.s0) == null || !e7Var.l()) ? false : true;
    }

    public final void x() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = hwe.a(this);
            iwe iweVar = this.a1;
            boolean z = (iweVar == null || iweVar.b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.g1) ? false : true;
            if (z && this.f1 == null) {
                if (this.e1 == null) {
                    this.e1 = hwe.b(new fwe(this, 0));
                }
                hwe.c(onBackInvokedDispatcherA, this.e1);
                this.f1 = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f1) == null) {
                return;
            }
            hwe.d(onBackInvokedDispatcher, this.e1);
            this.f1 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.K0 = 8388627;
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
        this.T0 = new int[2];
        this.U0 = new pl8(new fwe(this, 1));
        this.V0 = new ArrayList();
        this.X0 = new bkg(28, this);
        this.h1 = new gwe(0, this);
        k8g k8gVarX = k8g.x(getContext(), attributeSet, p3c.Toolbar, i, 0);
        int[] iArr = p3c.Toolbar;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(this, context, iArr, attributeSet, (TypedArray) k8gVarX.b, i, 0);
        int i2 = p3c.Toolbar_titleTextAppearance;
        TypedArray typedArray = (TypedArray) k8gVarX.b;
        this.z0 = typedArray.getResourceId(i2, 0);
        this.A0 = typedArray.getResourceId(p3c.Toolbar_subtitleTextAppearance, 0);
        this.K0 = typedArray.getInteger(p3c.Toolbar_android_gravity, 8388627);
        this.B0 = typedArray.getInteger(p3c.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(p3c.Toolbar_titleMargin, 0);
        dimensionPixelOffset = typedArray.hasValue(p3c.Toolbar_titleMargins) ? typedArray.getDimensionPixelOffset(p3c.Toolbar_titleMargins, dimensionPixelOffset) : dimensionPixelOffset;
        this.G0 = dimensionPixelOffset;
        this.F0 = dimensionPixelOffset;
        this.E0 = dimensionPixelOffset;
        this.D0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(p3c.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.D0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(p3c.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.E0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(p3c.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.F0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(p3c.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.G0 = dimensionPixelOffset5;
        }
        this.C0 = typedArray.getDimensionPixelSize(p3c.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(p3c.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(p3c.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(p3c.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(p3c.Toolbar_contentInsetRight, 0);
        d();
        voc vocVar = this.H0;
        vocVar.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            vocVar.e = dimensionPixelSize;
            vocVar.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            vocVar.f = dimensionPixelSize2;
            vocVar.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            vocVar.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.I0 = typedArray.getDimensionPixelOffset(p3c.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.J0 = typedArray.getDimensionPixelOffset(p3c.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.t0 = k8gVarX.n(p3c.Toolbar_collapseIcon);
        this.u0 = typedArray.getText(p3c.Toolbar_collapseContentDescription);
        CharSequence text = typedArray.getText(p3c.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(p3c.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.x0 = getContext();
        setPopupTheme(typedArray.getResourceId(p3c.Toolbar_popupTheme, 0));
        Drawable drawableN = k8gVarX.n(p3c.Toolbar_navigationIcon);
        if (drawableN != null) {
            setNavigationIcon(drawableN);
        }
        CharSequence text3 = typedArray.getText(p3c.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableN2 = k8gVarX.n(p3c.Toolbar_logo);
        if (drawableN2 != null) {
            setLogo(drawableN2);
        }
        CharSequence text4 = typedArray.getText(p3c.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(p3c.Toolbar_titleTextColor)) {
            setTitleTextColor(k8gVarX.l(p3c.Toolbar_titleTextColor));
        }
        if (typedArray.hasValue(p3c.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(k8gVarX.l(p3c.Toolbar_subtitleTextColor));
        }
        if (typedArray.hasValue(p3c.Toolbar_menu)) {
            m(typedArray.getResourceId(p3c.Toolbar_menu, 0));
        }
        k8gVarX.z();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        jwe jweVar = new jwe(context, attributeSet);
        jweVar.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3c.ActionBarLayout);
        jweVar.a = typedArrayObtainStyledAttributes.getInt(p3c.ActionBarLayout_android_layout_gravity, 0);
        typedArrayObtainStyledAttributes.recycle();
        jweVar.b = 0;
        return jweVar;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.v0;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.v0.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.v0;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.t0);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.s0 == null) {
                this.s0 = new AppCompatImageView(getContext(), null);
            }
            if (!o(this.s0)) {
                b(this.s0, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.s0;
            if (appCompatImageView != null && o(appCompatImageView)) {
                removeView(this.s0);
                this.S0.remove(this.s0);
            }
        }
        AppCompatImageView appCompatImageView2 = this.s0;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.s0 == null) {
            this.s0 = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.s0;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.o;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            swe.a(this.o, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.o)) {
                b(this.o, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.o;
            if (appCompatImageButton != null && o(appCompatImageButton)) {
                removeView(this.o);
                this.S0.remove(this.o);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.o;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.c;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.c);
                this.S0.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A0;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.O0;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!o(this.c)) {
                b(this.c, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.M0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.O0 = colorStateList;
        AppCompatTextView appCompatTextView = this.c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.b;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.b);
                this.S0.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.z0;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.N0;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!o(this.b)) {
                b(this.b, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.L0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.N0 = colorStateList;
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
