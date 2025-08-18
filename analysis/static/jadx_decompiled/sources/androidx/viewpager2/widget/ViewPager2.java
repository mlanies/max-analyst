package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.a;
import defpackage.gpa;
import defpackage.hdc;
import defpackage.iof;
import defpackage.j4;
import defpackage.jb5;
import defpackage.jof;
import defpackage.kof;
import defpackage.lh0;
import defpackage.lof;
import defpackage.m5d;
import defpackage.mdc;
import defpackage.mof;
import defpackage.pof;
import defpackage.qof;
import defpackage.rof;
import defpackage.sof;
import defpackage.umf;
import defpackage.uwc;
import defpackage.v0e;
import defpackage.v2c;
import defpackage.vwc;
import defpackage.zj0;
import defpackage.zmf;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public lh0 A0;
    public jb5 B0;
    public gpa C0;
    public mdc D0;
    public boolean E0;
    public boolean F0;
    public int G0;
    public m5d H0;
    public final Rect a;
    public final Rect b;
    public final lh0 c;
    public int o;
    public boolean s0;
    public final iof t0;
    public lof u0;
    public int v0;
    public Parcelable w0;
    public rof x0;
    public qof y0;
    public vwc z0;

    public ViewPager2(Context context) {
        super(context);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new lh0();
        this.s0 = false;
        this.t0 = new iof(0, this);
        this.v0 = -1;
        this.D0 = null;
        this.E0 = false;
        this.F0 = true;
        this.G0 = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        int i = 0;
        int i2 = 1;
        this.H0 = new m5d(this);
        rof rofVar = new rof(this, context);
        this.x0 = rofVar;
        rofVar.setId(View.generateViewId());
        this.x0.setDescendantFocusability(131072);
        lof lofVar = new lof(this);
        this.u0 = lofVar;
        this.x0.setLayoutManager(lofVar);
        this.x0.setScrollingTouchSlop(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v2c.ViewPager2);
        int[] iArr = v2c.ViewPager2;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(v2c.ViewPager2_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.x0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.x0.k(new kof());
            vwc vwcVar = new vwc(this);
            this.z0 = vwcVar;
            this.B0 = new jb5(this, vwcVar, this.x0);
            qof qofVar = new qof(this);
            this.y0 = qofVar;
            qofVar.a(this.x0);
            this.x0.m(this.z0);
            lh0 lh0Var = new lh0();
            this.A0 = lh0Var;
            this.z0.a = lh0Var;
            jof jofVar = new jof(this, i);
            jof jofVar2 = new jof(this, i2);
            ((ArrayList) lh0Var.b).add(jofVar);
            ((ArrayList) this.A0.b).add(jofVar2);
            this.H0.J(this.x0);
            lh0 lh0Var2 = this.A0;
            ((ArrayList) lh0Var2.b).add(this.c);
            gpa gpaVar = new gpa(this.u0);
            this.C0 = gpaVar;
            ((ArrayList) this.A0.b).add(gpaVar);
            rof rofVar2 = this.x0;
            attachViewToParent(rofVar2, 0, rofVar2.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(mof mofVar) {
        ((ArrayList) this.c.b).add(mofVar);
    }

    public final void c() {
        if (this.C0.b == null) {
            return;
        }
        vwc vwcVar = this.z0;
        vwcVar.g();
        uwc uwcVar = vwcVar.g;
        double d = uwcVar.b + uwcVar.a;
        int i = (int) d;
        float f = (float) (d - i);
        this.C0.b(i, f, Math.round(getPageSize() * f));
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.x0.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.x0.canScrollVertically(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        hdc adapter;
        if (this.v0 == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.w0;
        if (parcelable != null) {
            if (adapter instanceof v0e) {
                ((v0e) adapter).c(parcelable);
            }
            this.w0 = null;
        }
        int iMax = Math.max(0, Math.min(this.v0, adapter.j() - 1));
        this.o = iMax;
        this.v0 = -1;
        this.x0.x0(iMax);
        this.H0.M();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof sof) {
            int i = ((sof) parcelable).a;
            sparseArray.put(this.x0.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public final void e(int i, boolean z) {
        if (this.B0.b.m) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        f(i, z);
    }

    public final void f(int i, boolean z) {
        hdc adapter = getAdapter();
        if (adapter == null) {
            if (this.v0 != -1) {
                this.v0 = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.j() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.j() - 1);
        int i2 = this.o;
        if (iMin == i2 && this.z0.f == 0) {
            return;
        }
        if (iMin == i2 && z) {
            return;
        }
        double d = i2;
        this.o = iMin;
        this.H0.M();
        vwc vwcVar = this.z0;
        if (vwcVar.f != 0) {
            vwcVar.g();
            uwc uwcVar = vwcVar.g;
            d = uwcVar.b + uwcVar.a;
        }
        vwc vwcVar2 = this.z0;
        vwcVar2.getClass();
        vwcVar2.e = z ? 2 : 3;
        vwcVar2.m = false;
        boolean z2 = vwcVar2.i != iMin;
        vwcVar2.i = iMin;
        vwcVar2.d(2);
        if (z2) {
            vwcVar2.c(iMin);
        }
        if (!z) {
            this.x0.x0(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - d) <= 3.0d) {
            this.x0.B0(iMin);
            return;
        }
        this.x0.x0(d2 > d ? iMin - 3 : iMin + 3);
        rof rofVar = this.x0;
        rofVar.post(new zj0(rofVar, iMin));
    }

    public final void g(mof mofVar) {
        ((ArrayList) this.c.b).remove(mofVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.H0.getClass();
        this.H0.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public hdc getAdapter() {
        return this.x0.getAdapter();
    }

    public int getCurrentItem() {
        return this.o;
    }

    public int getItemDecorationCount() {
        return this.x0.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.G0;
    }

    public int getOrientation() {
        return this.u0.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        rof rofVar = this.x0;
        if (getOrientation() == 0) {
            height = rofVar.getWidth() - rofVar.getPaddingLeft();
            paddingBottom = rofVar.getPaddingRight();
        } else {
            height = rofVar.getHeight() - rofVar.getPaddingTop();
            paddingBottom = rofVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.z0.f;
    }

    public final void h() {
        qof qofVar = this.y0;
        if (qofVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewI = qofVar.i(this.u0);
        if (viewI == null) {
            return;
        }
        this.u0.getClass();
        int iM = a.M(viewI);
        if (iM != this.o && getScrollState() == 0) {
            this.A0.c(iM);
        }
        this.s0 = false;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iJ;
        int iJ2;
        int iJ3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.H0.X;
        if (viewPager2.getAdapter() == null) {
            iJ = 0;
            iJ2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iJ = viewPager2.getAdapter().j();
            iJ2 = 1;
        } else {
            iJ2 = viewPager2.getAdapter().j();
            iJ = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j4.a(iJ, iJ2, 0).a);
        hdc adapter = viewPager2.getAdapter();
        if (adapter == null || (iJ3 = adapter.j()) == 0 || !viewPager2.F0) {
            return;
        }
        if (viewPager2.o > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.o < iJ3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.x0.getMeasuredWidth();
        int measuredHeight = this.x0.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.a;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.x0.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.s0) {
            h();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.x0, i, i2);
        int measuredWidth = this.x0.getMeasuredWidth();
        int measuredHeight = this.x0.getMeasuredHeight();
        int measuredState = this.x0.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sof)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sof sofVar = (sof) parcelable;
        super.onRestoreInstanceState(sofVar.getSuperState());
        this.v0 = sofVar.b;
        this.w0 = sofVar.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        sof sofVar = new sof(super.onSaveInstanceState());
        sofVar.a = this.x0.getId();
        int i = this.v0;
        if (i == -1) {
            i = this.o;
        }
        sofVar.b = i;
        Parcelable parcelable = this.w0;
        if (parcelable != null) {
            sofVar.c = parcelable;
        } else {
            Object adapter = this.x0.getAdapter();
            if (adapter instanceof v0e) {
                sofVar.c = ((v0e) adapter).a();
            }
        }
        return sofVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.H0.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        m5d m5dVar = this.H0;
        m5dVar.getClass();
        if (i != 8192 && i != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = (ViewPager2) m5dVar.X;
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.F0) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    public void setAdapter(hdc hdcVar) {
        hdc adapter = this.x0.getAdapter();
        m5d m5dVar = this.H0;
        if (adapter != null) {
            adapter.B((iof) m5dVar.o);
        } else {
            m5dVar.getClass();
        }
        iof iofVar = this.t0;
        if (adapter != null) {
            adapter.B(iofVar);
        }
        this.x0.setAdapter(hdcVar);
        this.o = 0;
        d();
        m5d m5dVar2 = this.H0;
        m5dVar2.M();
        if (hdcVar != null) {
            hdcVar.z((iof) m5dVar2.o);
        }
        if (hdcVar != null) {
            hdcVar.z(iofVar);
        }
    }

    public void setCurrentItem(int i) {
        e(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.H0.M();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.G0 = i;
        this.x0.requestLayout();
    }

    public void setOrientation(int i) {
        this.u0.o1(i);
        this.H0.M();
    }

    public void setPageTransformer(pof pofVar) {
        if (pofVar != null) {
            if (!this.E0) {
                this.D0 = this.x0.getItemAnimator();
                this.E0 = true;
            }
            this.x0.setItemAnimator(null);
        } else if (this.E0) {
            this.x0.setItemAnimator(this.D0);
            this.D0 = null;
            this.E0 = false;
        }
        gpa gpaVar = this.C0;
        if (pofVar == gpaVar.b) {
            return;
        }
        gpaVar.b = pofVar;
        c();
    }

    public void setUserInputEnabled(boolean z) {
        this.F0 = z;
        this.H0.M();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new lh0();
        this.s0 = false;
        this.t0 = new iof(0, this);
        this.v0 = -1;
        this.D0 = null;
        this.E0 = false;
        this.F0 = true;
        this.G0 = -1;
        a(context, attributeSet);
    }
}
