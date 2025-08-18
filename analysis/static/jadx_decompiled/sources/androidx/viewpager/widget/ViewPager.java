package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import com.google.android.material.tabs.TabLayout;
import defpackage.aje;
import defpackage.b9b;
import defpackage.bm5;
import defpackage.c77;
import defpackage.cm5;
import defpackage.dof;
import defpackage.eof;
import defpackage.fof;
import defpackage.fr0;
import defpackage.g04;
import defpackage.gof;
import defpackage.gwe;
import defpackage.he0;
import defpackage.hm9;
import defpackage.hof;
import defpackage.hpa;
import defpackage.kt3;
import defpackage.ky6;
import defpackage.omf;
import defpackage.wg0;
import defpackage.x06;
import defpackage.zmf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] k1 = {R.attr.layout_gravity};
    public static final ky6 l1 = new ky6(16);
    public static final c77 m1 = new c77(4);
    public int A0;
    public Drawable B0;
    public int C0;
    public int D0;
    public float E0;
    public float F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public int K0;
    public boolean L0;
    public boolean M0;
    public final int N0;
    public int O0;
    public final int P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public int U0;
    public VelocityTracker V0;
    public final int W0;
    public final int X0;
    public final int Y0;
    public final int Z0;
    public int a;
    public final EdgeEffect a1;
    public final ArrayList b;
    public final EdgeEffect b1;
    public final eof c;
    public boolean c1;
    public boolean d1;
    public int e1;
    public ArrayList f1;
    public gof g1;
    public ArrayList h1;
    public final gwe i1;
    public int j1;
    public final Rect o;
    public hpa s0;
    public int t0;
    public int u0;
    public Parcelable v0;
    public ClassLoader w0;
    public final Scroller x0;
    public boolean y0;
    public g04 z0;

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
        this.c = new eof();
        this.o = new Rect();
        this.u0 = -1;
        this.v0 = null;
        this.w0 = null;
        this.E0 = -3.4028235E38f;
        this.F0 = Float.MAX_VALUE;
        this.K0 = 1;
        this.U0 = -1;
        this.c1 = true;
        this.i1 = new gwe(5, this);
        this.j1 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.x0 = new Scroller(context2, m1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.P0 = viewConfiguration.getScaledPagingTouchSlop();
        this.W0 = (int) (400.0f * f);
        this.X0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a1 = new EdgeEffect(context2);
        this.b1 = new EdgeEffect(context2);
        this.Y0 = (int) (25.0f * f);
        this.Z0 = (int) (2.0f * f);
        this.N0 = (int) (f * 16.0f);
        zmf.j(this, new fr0(5, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        omf.u(this, new b9b(this));
    }

    public static boolean d(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && d(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.I0 != z) {
            this.I0 = z;
        }
    }

    public final eof a(int i, int i2) {
        Bundle bundle;
        eof eofVar = new eof();
        eofVar.b = i;
        cm5 cm5Var = (cm5) this.s0;
        String strH = cm5Var.h(i);
        HashMap map = cm5Var.g;
        a aVar = (a) map.get(strH);
        if (aVar != null) {
            hm9.m("cm5", "CHECK instantiateItem use from cache f %s", aVar);
        } else {
            if (cm5Var.d == null) {
                c cVar = cm5Var.c;
                cVar.getClass();
                cm5Var.d = new he0(cVar);
            }
            String strH2 = cm5Var.h(i);
            a aVarG = cm5Var.g(i);
            bm5 bm5Var = (bm5) cm5Var.e.c(strH2);
            if (bm5Var != null) {
                hm9.m("cm5", "CHECK instantiateItem use ImplSavedState for %d fe %s", Integer.valueOf(i), aVarG);
                if (aVarG.F0 != null) {
                    throw new IllegalStateException("Fragment already added");
                }
                x06 x06Var = bm5Var.b;
                if (x06Var == null || (bundle = x06Var.a) == null) {
                    bundle = null;
                }
                aVarG.b = bundle;
            } else {
                hm9.m("cm5", "CHECK instantiateItem fr %s", aVarG);
            }
            aVarG.Z0(false);
            aVarG.c1(false);
            map.put(strH2, aVarG);
            cm5Var.d.f(getId(), aVarG, null, 1);
            aVar = aVarG;
        }
        eofVar.a = aVar;
        this.s0.getClass();
        eofVar.d = 1.0f;
        ArrayList arrayList = this.b;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(eofVar);
        } else {
            arrayList.add(i2, eofVar);
        }
        return eofVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        eof eofVarI;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (eofVarI = i(childAt)) != null && eofVarI.b == this.t0) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        eof eofVarI;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (eofVarI = i(childAt)) != null && eofVarI.b == this.t0) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        fof fofVar = (fof) layoutParams;
        boolean z = fofVar.a | (view.getClass().getAnnotation(dof.class) != null);
        fofVar.a = z;
        if (!this.H0) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            fofVar.d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    public final void b(gof gofVar) {
        if (this.f1 == null) {
            this.f1 = new ArrayList();
        }
        this.f1.add(gofVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r8) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 0
            if (r0 != r7) goto L9
        L7:
            r0 = r1
            goto L2b
        L9:
            if (r0 == 0) goto L2b
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r7) goto L16
            goto L2b
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            android.view.ViewParent r0 = r0.getParent()
        L1f:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L7
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            goto L1f
        L2b:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            r2 = 1
            r3 = 0
            r4 = 66
            r5 = 17
            if (r1 == 0) goto L7e
            if (r1 == r0) goto L7e
            android.graphics.Rect r6 = r7.o
            if (r8 != r5) goto L62
            android.graphics.Rect r4 = r7.h(r6, r1)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.h(r6, r0)
            int r5 = r5.left
            if (r0 == 0) goto L5c
            if (r4 < r5) goto L5c
            int r0 = r7.t0
            if (r0 <= 0) goto L98
            int r0 = r0 - r2
            r7.J0 = r3
            r7.v(r0, r3, r2, r3)
            goto L99
        L5c:
            boolean r0 = r1.requestFocus()
        L60:
            r3 = r0
            goto L9a
        L62:
            if (r8 != r4) goto L9a
            android.graphics.Rect r2 = r7.h(r6, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.h(r6, r0)
            int r3 = r3.left
            if (r0 == 0) goto L79
            if (r2 > r3) goto L79
            boolean r0 = r7.n()
            goto L60
        L79:
            boolean r0 = r1.requestFocus()
            goto L60
        L7e:
            if (r8 == r5) goto L8d
            if (r8 != r2) goto L83
            goto L8d
        L83:
            if (r8 == r4) goto L88
            r0 = 2
            if (r8 != r0) goto L9a
        L88:
            boolean r3 = r7.n()
            goto L9a
        L8d:
            int r0 = r7.t0
            if (r0 <= 0) goto L98
            int r0 = r0 - r2
            r7.J0 = r3
            r7.v(r0, r3, r2, r3)
            goto L99
        L98:
            r2 = r3
        L99:
            r3 = r2
        L9a:
            if (r3 == 0) goto La3
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.s0 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.E0)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.F0));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof fof) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.y0 = true;
        Scroller scroller = this.x0;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!o(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = zmf.a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L66
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L61
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L61
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r5 = r5.c(r4)
            goto L62
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L61
            boolean r5 = r5.c(r1)
            goto L62
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r5 = r5.n()
            goto L62
        L41:
            r6 = 66
            boolean r5 = r5.c(r6)
            goto L62
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L5a
            int r6 = r5.t0
            if (r6 <= 0) goto L61
            int r6 = r6 - r1
            r5.J0 = r2
            r5.v(r6, r2, r1, r2)
            r5 = r1
            goto L62
        L5a:
            r6 = 17
            boolean r5 = r5.c(r6)
            goto L62
        L61:
            r5 = r2
        L62:
            if (r5 == 0) goto L65
            goto L66
        L65:
            r1 = r2
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        eof eofVarI;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (eofVarI = i(childAt)) != null && eofVarI.b == this.t0 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        hpa hpaVar;
        EdgeEffect edgeEffect = this.b1;
        EdgeEffect edgeEffect2 = this.a1;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (hpaVar = this.s0) != null && hpaVar.b() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.E0 * width);
                edgeEffect2.setSize(height, width);
                zDraw = edgeEffect2.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!edgeEffect.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.F0 + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                zDraw |= edgeEffect.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (zDraw) {
            WeakHashMap weakHashMap = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.B0;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z) {
        Scroller scroller = this.x0;
        boolean z2 = this.j1 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.J0 = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            eof eofVar = (eof) arrayList.get(i);
            if (eofVar.c) {
                eofVar.c = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            gwe gweVar = this.i1;
            if (!z) {
                gweVar.run();
            } else {
                WeakHashMap weakHashMap = zmf.a;
                postOnAnimation(gweVar);
            }
        }
    }

    public final void f() {
        cm5 cm5Var;
        he0 he0Var;
        int iB = this.s0.b();
        this.a = iB;
        ArrayList arrayList = this.b;
        boolean z = arrayList.size() < (this.K0 * 2) + 1 && arrayList.size() < iB;
        int iMax = this.t0;
        int i = 0;
        boolean z2 = false;
        while (i < arrayList.size()) {
            eof eofVar = (eof) arrayList.get(i);
            int iC = this.s0.c(eofVar.a);
            if (iC != -1) {
                if (iC == -2) {
                    arrayList.remove(i);
                    i--;
                    if (!z2) {
                        this.s0.f(this);
                        z2 = true;
                    }
                    this.s0.a(this, eofVar.b, eofVar.a);
                    int i2 = this.t0;
                    if (i2 == eofVar.b) {
                        iMax = Math.max(0, Math.min(i2, iB - 1));
                    }
                } else {
                    int i3 = eofVar.b;
                    if (i3 != iC) {
                        if (i3 == this.t0) {
                            iMax = iC;
                        }
                        eofVar.b = iC;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z2 && (he0Var = (cm5Var = (cm5) this.s0).d) != null) {
            if (he0Var.g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            he0Var.q.B(he0Var, true);
            cm5Var.d = null;
        }
        Collections.sort(arrayList, l1);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                fof fofVar = (fof) getChildAt(i4).getLayoutParams();
                if (!fofVar.a) {
                    fofVar.c = 0.0f;
                }
            }
            v(iMax, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i) {
        gof gofVar = this.g1;
        if (gofVar != null) {
            gofVar.m(i);
        }
        ArrayList arrayList = this.f1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                gof gofVar2 = (gof) this.f1.get(i2);
                if (gofVar2 != null) {
                    gofVar2.m(i);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        fof fofVar = new fof(-1, -1);
        fofVar.c = 0.0f;
        return fofVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public hpa getAdapter() {
        return this.s0;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return this.t0;
    }

    public int getOffscreenPageLimit() {
        return this.K0;
    }

    public int getPageMargin() {
        return this.A0;
    }

    public final Rect h(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final eof i(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return null;
            }
            eof eofVar = (eof) arrayList.get(i);
            hpa hpaVar = this.s0;
            a aVar = eofVar.a;
            ((cm5) hpaVar).getClass();
            if (aVar.k0() == view) {
                return eofVar;
            }
            i++;
        }
    }

    public final eof j() {
        eof eofVar;
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.A0 / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        eof eofVar2 = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return eofVar2;
            }
            eof eofVar3 = (eof) arrayList.get(i2);
            if (z || eofVar3.b == (i = i3 + 1)) {
                eofVar = eofVar3;
            } else {
                float f4 = f + f3 + f2;
                eof eofVar4 = this.c;
                eofVar4.e = f4;
                eofVar4.b = i;
                this.s0.getClass();
                eofVar4.d = 1.0f;
                i2--;
                eofVar = eofVar4;
            }
            f = eofVar.e;
            float f5 = eofVar.d + f + f2;
            if (!z && scrollX < f) {
                return eofVar2;
            }
            if (scrollX < f5 || i2 == arrayList.size() - 1) {
                break;
            }
            int i4 = eofVar.b;
            float f6 = eofVar.d;
            i2++;
            z = false;
            eof eofVar5 = eofVar;
            i3 = i4;
            f3 = f6;
            eofVar2 = eofVar5;
        }
        return eofVar;
    }

    public final eof k(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            eof eofVar = (eof) arrayList.get(i2);
            if (eofVar.b == i) {
                return eofVar;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.e1
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L6c
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L1b:
            if (r6 >= r5) goto L6c
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            fof r8 = (defpackage.fof) r8
            boolean r9 = r8.a
            if (r9 != 0) goto L2c
            goto L69
        L2c:
            int r8 = r8.b
            r8 = r8 & 7
            if (r8 == r1) goto L50
            r9 = 3
            if (r8 == r9) goto L4a
            r9 = 5
            if (r8 == r9) goto L3a
            r8 = r2
            goto L5d
        L3a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L46:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5d
        L4a:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5d
        L50:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L46
        L5d:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L68
            r7.offsetLeftAndRight(r2)
        L68:
            r2 = r8
        L69:
            int r6 = r6 + 1
            goto L1b
        L6c:
            gof r14 = r11.g1
            if (r14 == 0) goto L73
            r14.n(r12, r13)
        L73:
            java.util.ArrayList r14 = r11.f1
            if (r14 == 0) goto L8d
            int r14 = r14.size()
        L7b:
            if (r0 >= r14) goto L8d
            java.util.ArrayList r2 = r11.f1
            java.lang.Object r2 = r2.get(r0)
            gof r2 = (defpackage.gof) r2
            if (r2 == 0) goto L8a
            r2.n(r12, r13)
        L8a:
            int r0 = r0 + 1
            goto L7b
        L8d:
            r11.d1 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.l(int, float, int):void");
    }

    public final void m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.U0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.Q0 = motionEvent.getX(i);
            this.U0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.V0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean n() throws Resources.NotFoundException {
        hpa hpaVar = this.s0;
        if (hpaVar == null || this.t0 >= hpaVar.b() - 1) {
            return false;
        }
        int i = this.t0 + 1;
        this.J0 = false;
        v(i, 0, true, false);
        return true;
    }

    public final boolean o(int i) {
        if (this.b.size() == 0) {
            if (this.c1) {
                return false;
            }
            this.d1 = false;
            l(0, 0.0f, 0);
            if (this.d1) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        eof eofVarJ = j();
        int clientWidth = getClientWidth();
        int i2 = this.A0;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = eofVarJ.b;
        float f2 = ((i / f) - eofVarJ.e) / (eofVarJ.d + (i2 / f));
        this.d1 = false;
        l(i4, f2, (int) (i3 * f2));
        if (this.d1) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.i1);
        Scroller scroller = this.x0;
        if (scroller != null && !scroller.isFinished()) {
            this.x0.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        ArrayList arrayList;
        float f2;
        super.onDraw(canvas);
        if (this.A0 <= 0 || this.B0 == null) {
            return;
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2.size() <= 0 || this.s0 == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f3 = this.A0 / width;
        int i2 = 0;
        eof eofVar = (eof) arrayList2.get(0);
        float f4 = eofVar.e;
        int size = arrayList2.size();
        int i3 = eofVar.b;
        int i4 = ((eof) arrayList2.get(size - 1)).b;
        while (i3 < i4) {
            while (true) {
                i = eofVar.b;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                eofVar = (eof) arrayList2.get(i2);
            }
            if (i3 == i) {
                float f5 = eofVar.e;
                float f6 = eofVar.d;
                f = (f5 + f6) * width;
                f4 = f5 + f6 + f3;
            } else {
                this.s0.getClass();
                f = (f4 + 1.0f) * width;
                f4 = 1.0f + f3 + f4;
            }
            if (this.A0 + f > scrollX) {
                arrayList = arrayList2;
                f2 = f3;
                this.B0.setBounds(Math.round(f), this.C0, Math.round(this.A0 + f), this.D0);
                this.B0.draw(canvas);
            } else {
                arrayList = arrayList2;
                f2 = f3;
            }
            if (f > scrollX + r3) {
                return;
            }
            i3++;
            arrayList2 = arrayList;
            f3 = f2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.P0;
        Scroller scroller = this.x0;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            t();
            return false;
        }
        if (action != 0) {
            if (this.L0) {
                return true;
            }
            if (this.M0) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.S0 = x;
            this.Q0 = x;
            float y = motionEvent.getY();
            this.T0 = y;
            this.R0 = y;
            this.U0 = motionEvent.getPointerId(0);
            this.M0 = false;
            this.y0 = true;
            scroller.computeScrollOffset();
            if (this.j1 != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.Z0) {
                e(false);
                this.L0 = false;
            } else {
                scroller.abortAnimation();
                this.J0 = false;
                q();
                this.L0 = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.U0;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.Q0;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.T0);
                if (f != 0.0f) {
                    float f2 = this.Q0;
                    if ((f2 >= this.O0 || f <= 0.0f) && ((f2 <= getWidth() - this.O0 || f >= 0.0f) && d((int) f, (int) x2, (int) y2, this, false))) {
                        this.Q0 = x2;
                        this.R0 = y2;
                        this.M0 = true;
                        return false;
                    }
                }
                float f3 = i;
                if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                    this.L0 = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.S0;
                    float f5 = i;
                    this.Q0 = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.R0 = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f3) {
                    this.M0 = true;
                }
                if (this.L0 && p(x2)) {
                    WeakHashMap weakHashMap = zmf.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m(motionEvent);
        }
        if (this.V0 == null) {
            this.V0 = VelocityTracker.obtain();
        }
        this.V0.addMovement(motionEvent);
        return this.L0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        fof fofVar;
        fof fofVar2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.O0 = Math.min(measuredWidth / 10, this.N0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (fofVar2 = (fof) childAt.getLayoutParams()) != null && fofVar2.a) {
                int i6 = fofVar2.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) fofVar2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) fofVar2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.G0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.H0 = true;
        q();
        this.H0 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((fofVar = (fof) childAt2.getLayoutParams()) == null || !fofVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * fofVar.c), 1073741824), this.G0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        eof eofVarI;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (eofVarI = i(childAt)) != null && eofVarI.b == this.t0 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof hof)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hof hofVar = (hof) parcelable;
        super.onRestoreInstanceState(hofVar.a);
        hpa hpaVar = this.s0;
        ClassLoader classLoader = hofVar.X;
        if (hpaVar != null) {
            hpaVar.e(hofVar.o, classLoader);
            v(hofVar.c, 0, false, true);
        } else {
            this.u0 = hofVar.c;
            this.v0 = hofVar.o;
            this.w0 = classLoader;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r7 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            hof r1 = new hof
            r1.<init>(r0)
            int r0 = r7.t0
            r1.c = r0
            hpa r7 = r7.s0
            if (r7 == 0) goto L8d
            cm5 r7 = (defpackage.cm5) r7
            java.util.HashMap r0 = r7.g
            boolean r2 = r7.f
            if (r2 != 0) goto L55
            mw7 r2 = r7.e
            int r3 = r2.g()
            if (r3 <= 0) goto L55
            java.util.LinkedHashMap r2 = r2.i()
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.remove(r4)
            goto L2d
        L3d:
            int r3 = r2.size()
            bm5[] r3 = new defpackage.bm5[r3]
            java.util.Collection r2 = r2.values()
            r2.toArray(r3)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r4 = "states"
            r2.putParcelableArray(r4, r3)
            goto L56
        L55:
            r2 = 0
        L56:
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L5e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L8b
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.get(r4)
            androidx.fragment.app.a r5 = (androidx.fragment.app.a) r5
            if (r5 == 0) goto L5e
            boolean r6 = r5.o0()
            if (r6 == 0) goto L5e
            if (r2 != 0) goto L7f
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L7f:
            java.lang.String r6 = "f"
            java.lang.String r4 = defpackage.wg0.i(r6, r4)
            androidx.fragment.app.c r6 = r7.c
            r6.W(r2, r4, r5)
            goto L5e
        L8b:
            r1.o = r2
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A0;
            s(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(float f) {
        boolean z;
        boolean z2;
        float f2 = this.Q0 - f;
        this.Q0 = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.E0 * clientWidth;
        float f4 = this.F0 * clientWidth;
        ArrayList arrayList = this.b;
        boolean z3 = false;
        eof eofVar = (eof) arrayList.get(0);
        eof eofVar2 = (eof) wg0.f(arrayList, 1);
        if (eofVar.b != 0) {
            f3 = eofVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (eofVar2.b != this.s0.b() - 1) {
            f4 = eofVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.a1.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.b1.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.Q0 = (scrollX - i) + this.Q0;
        scrollTo(i, getScrollY());
        o(i);
        return z3;
    }

    public final void q() {
        r(this.t0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc A[PHI: r7 r11 r12
      0x00bc: PHI (r7v21 int) = (r7v20 int), (r7v9 int), (r7v24 int) binds: [B:62:0x00de, B:59:0x00ca, B:51:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r11v36 float) = (r11v34 float), (r11v35 float), (r11v3 float) binds: [B:62:0x00de, B:59:0x00ca, B:51:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r12v29 int) = (r12v1 int), (r12v28 int), (r12v32 int) binds: [B:62:0x00de, B:59:0x00ca, B:51:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013c A[PHI: r3 r12
      0x013c: PHI (r3v26 float) = (r3v24 float), (r3v25 float), (r3v23 float) binds: [B:96:0x0163, B:93:0x014d, B:86:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r12v26 int) = (r12v24 int), (r12v25 int), (r12v23 int) binds: [B:96:0x0163, B:93:0x014d, B:86:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.r(int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.H0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.b.isEmpty()) {
            if (!this.x0.isFinished()) {
                this.x0.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        eof eofVarK = k(this.t0);
        int iMin = (int) ((eofVarK != null ? Math.min(eofVarK.e, this.F0) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            e(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public void setAdapter(hpa hpaVar) throws Resources.NotFoundException {
        ArrayList arrayList;
        hpa hpaVar2 = this.s0;
        if (hpaVar2 != null) {
            synchronized (hpaVar2) {
                hpaVar2.b = null;
            }
            this.s0.f(this);
            int i = 0;
            while (true) {
                arrayList = this.b;
                if (i >= arrayList.size()) {
                    break;
                }
                eof eofVar = (eof) arrayList.get(i);
                this.s0.a(this, eofVar.b, eofVar.a);
                i++;
            }
            cm5 cm5Var = (cm5) this.s0;
            he0 he0Var = cm5Var.d;
            if (he0Var != null) {
                if (he0Var.g) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                he0Var.q.B(he0Var, true);
                cm5Var.d = null;
            }
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((fof) getChildAt(i2).getLayoutParams()).a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.t0 = 0;
            scrollTo(0, 0);
        }
        this.s0 = hpaVar;
        this.a = 0;
        if (hpaVar != null) {
            if (this.z0 == null) {
                this.z0 = new g04(3, this);
            }
            hpa hpaVar3 = this.s0;
            g04 g04Var = this.z0;
            synchronized (hpaVar3) {
                hpaVar3.b = g04Var;
            }
            this.J0 = false;
            boolean z = this.c1;
            this.c1 = true;
            this.a = this.s0.b();
            if (this.u0 >= 0) {
                this.s0.e(this.v0, this.w0);
                v(this.u0, 0, false, true);
                this.u0 = -1;
                this.v0 = null;
                this.w0 = null;
            } else if (z) {
                requestLayout();
            } else {
                q();
            }
        }
        ArrayList arrayList2 = this.h1;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.h1.size();
        for (int i3 = 0; i3 < size; i3++) {
            aje ajeVar = (aje) this.h1.get(i3);
            TabLayout tabLayout = ajeVar.b;
            if (tabLayout.c1 == this) {
                tabLayout.p(hpaVar, ajeVar.a);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.J0 = false;
        v(i, 0, !this.c1, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.K0) {
            this.K0 = i;
            q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(gof gofVar) {
        this.g1 = gofVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.A0;
        this.A0 = i;
        int width = getWidth();
        s(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.B0 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.j1 == i) {
            return;
        }
        this.j1 = i;
        gof gofVar = this.g1;
        if (gofVar != null) {
            gofVar.k(i);
        }
        ArrayList arrayList = this.f1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                gof gofVar2 = (gof) this.f1.get(i2);
                if (gofVar2 != null) {
                    gofVar2.k(i);
                }
            }
        }
    }

    public final boolean t() {
        this.U0 = -1;
        this.L0 = false;
        this.M0 = false;
        VelocityTracker velocityTracker = this.V0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.V0 = null;
        }
        this.a1.onRelease();
        this.b1.onRelease();
        return this.a1.isFinished() || this.b1.isFinished();
    }

    public final void u(int i, int i2, boolean z, boolean z2) {
        int scrollX;
        int iAbs;
        Scroller scroller = this.x0;
        eof eofVarK = k(i);
        int iMax = eofVarK != null ? (int) (Math.max(this.E0, Math.min(eofVarK.e, this.F0)) * getClientWidth()) : 0;
        if (!z) {
            if (z2) {
                g(i);
            }
            e(false);
            scrollTo(iMax, 0);
            o(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.y0 ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = iMax - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                e(false);
                q();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i6 = clientWidth / 2;
                float f = clientWidth;
                float f2 = i6;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int iAbs2 = Math.abs(i2);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.s0.getClass();
                    iAbs = (int) (((Math.abs(i4) / ((f * 1.0f) + this.A0)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.y0 = false;
                this.x0.startScroll(i3, scrollY, i4, i5, iMin);
                WeakHashMap weakHashMap = zmf.a;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            g(i);
        }
    }

    public final void v(int i, int i2, boolean z, boolean z2) throws Resources.NotFoundException {
        hpa hpaVar = this.s0;
        if (hpaVar == null || hpaVar.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.b;
        if (!z2 && this.t0 == i && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.s0.b()) {
            i = this.s0.b() - 1;
        }
        int i3 = this.K0;
        int i4 = this.t0;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((eof) arrayList.get(i5)).c = true;
            }
        }
        boolean z3 = this.t0 != i;
        if (!this.c1) {
            r(i);
            u(i, i2, z, z3);
        } else {
            this.t0 = i;
            if (z3) {
                g(i);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        fof fofVar = new fof(context, attributeSet);
        fofVar.c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k1);
        fofVar.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return fofVar;
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(kt3.b(getContext(), i));
    }
}
