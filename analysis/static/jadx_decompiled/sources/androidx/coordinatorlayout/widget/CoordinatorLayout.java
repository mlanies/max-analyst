package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bq4;
import defpackage.die;
import defpackage.fm;
import defpackage.fs4;
import defpackage.gaa;
import defpackage.hnf;
import defpackage.j3c;
import defpackage.jt;
import defpackage.k2c;
import defpackage.kn9;
import defpackage.kt3;
import defpackage.ln9;
import defpackage.mmf;
import defpackage.nw3;
import defpackage.omf;
import defpackage.osb;
import defpackage.ow3;
import defpackage.pw3;
import defpackage.qpd;
import defpackage.qw3;
import defpackage.rw3;
import defpackage.sw3;
import defpackage.tw3;
import defpackage.umf;
import defpackage.v5b;
import defpackage.x6g;
import defpackage.zmf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements kn9, ln9 {
    public static final String G0;
    public static final Class[] H0;
    public static final ThreadLocal I0;
    public static final fs4 J0;
    public static final v5b K0;
    public x6g A0;
    public boolean B0;
    public Drawable C0;
    public ViewGroup.OnHierarchyChangeListener D0;
    public gaa E0;
    public final jt F0;
    public final ArrayList a;
    public final die b;
    public final ArrayList c;
    public final int[] o;
    public final int[] s0;
    public boolean t0;
    public boolean u0;
    public final int[] v0;
    public View w0;
    public View x0;
    public sw3 y0;
    public boolean z0;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        G0 = r0 != null ? r0.getName() : null;
        J0 = new fs4(19);
        H0 = new Class[]{Context.class, AttributeSet.class};
        I0 = new ThreadLocal();
        K0 = new v5b(12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i = 0;
        int i2 = osb.coordinatorLayoutStyle;
        super(context, attributeSet, i2);
        this.a = new ArrayList();
        this.b = new die(7);
        this.c = new ArrayList();
        this.o = new int[2];
        this.s0 = new int[2];
        this.F0 = new jt(6);
        TypedArray typedArrayObtainStyledAttributes = i2 == 0 ? context.obtainStyledAttributes(attributeSet, j3c.CoordinatorLayout, 0, k2c.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, j3c.CoordinatorLayout, i2, 0);
        if (i2 == 0) {
            int[] iArr = j3c.CoordinatorLayout;
            int i3 = k2c.Widget_Support_CoordinatorLayout;
            WeakHashMap weakHashMap = zmf.a;
            umf.d(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, i3);
        } else {
            int[] iArr2 = j3c.CoordinatorLayout;
            WeakHashMap weakHashMap2 = zmf.a;
            umf.d(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(j3c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.v0 = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i4 = 0; i4 < length; i4++) {
                this.v0[i4] = (int) (r3[i4] * f);
            }
        }
        this.C0 = typedArrayObtainStyledAttributes.getDrawable(j3c.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        x();
        super.setOnHierarchyChangeListener(new qw3(i, this));
        WeakHashMap weakHashMap3 = zmf.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) K0.f();
        return rect == null ? new Rect() : rect;
    }

    public static void f(int i, Rect rect, Rect rect2, rw3 rw3Var, int i2, int i3) {
        int i4 = rw3Var.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = rw3Var.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rw3 g(View view) {
        rw3 rw3Var = (rw3) view.getLayoutParams();
        if (!rw3Var.b) {
            if (view instanceof nw3) {
                rw3Var.b(((fm) ((nw3) view)).getBehavior());
                rw3Var.b = true;
            } else {
                pw3 pw3Var = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    pw3Var = (pw3) superclass.getAnnotation(pw3.class);
                    if (pw3Var != null) {
                        break;
                    }
                }
                if (pw3Var != null) {
                    try {
                        rw3Var.b((ow3) pw3Var.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception unused) {
                        pw3Var.value().getClass();
                    }
                }
                rw3Var.b = true;
            }
        }
        return rw3Var;
    }

    public static void v(View view, int i) {
        rw3 rw3Var = (rw3) view.getLayoutParams();
        int i2 = rw3Var.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = zmf.a;
            view.offsetLeftAndRight(i - i2);
            rw3Var.i = i;
        }
    }

    public static void w(View view, int i) {
        rw3 rw3Var = (rw3) view.getLayoutParams();
        int i2 = rw3Var.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = zmf.a;
            view.offsetTopAndBottom(i - i2);
            rw3Var.j = i;
        }
    }

    public final void b(rw3 rw3Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) rw3Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) rw3Var).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) rw3Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) rw3Var).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final void c(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            e(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof rw3) && super.checkLayoutParams(layoutParams);
    }

    public final List d(View view) {
        qpd qpdVar = (qpd) this.b.b;
        int i = qpdVar.c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) qpdVar.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(qpdVar.f(i2));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ow3 ow3Var = ((rw3) view.getLayoutParams()).a;
        if (ow3Var != null) {
            ow3Var.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.C0;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e(Rect rect, View view) {
        ThreadLocal threadLocal = hnf.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = hnf.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        hnf.a(this, view, matrix);
        ThreadLocal threadLocal3 = hnf.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new rw3(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new rw3(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        t();
        return Collections.unmodifiableList(this.a);
    }

    public final x6g getLastWindowInsets() {
        return this.A0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        jt jtVar = this.F0;
        return jtVar.c | jtVar.b;
    }

    public Drawable getStatusBarBackground() {
        return this.C0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final boolean h(View view, int i, int i2) {
        v5b v5bVar = K0;
        Rect rectA = a();
        e(rectA, view);
        try {
            return rectA.contains(i, i2);
        } finally {
            rectA.setEmpty();
            v5bVar.e(rectA);
        }
    }

    @Override // defpackage.ln9
    public final void i(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ow3 ow3Var;
        boolean z;
        int iMin;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                rw3 rw3Var = (rw3) childAt.getLayoutParams();
                if (rw3Var.a(i5) && (ow3Var = rw3Var.a) != null) {
                    int[] iArr2 = this.o;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ow3Var.p(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    if (i4 > 0) {
                        z = true;
                        iMin = Math.max(i6, iArr2[1]);
                    } else {
                        z = true;
                        iMin = Math.min(i6, iArr2[1]);
                    }
                    i6 = iMin;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i6;
        if (z2) {
            o(1);
        }
    }

    @Override // defpackage.kn9
    public final void j(View view, int i, int i2, int i3, int i4, int i5) {
        i(view, i, i2, i3, i4, 0, this.s0);
    }

    @Override // defpackage.kn9
    public final boolean k(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                rw3 rw3Var = (rw3) childAt.getLayoutParams();
                ow3 ow3Var = rw3Var.a;
                if (ow3Var != null) {
                    boolean zU = ow3Var.u(this, childAt, view, view2, i, i2);
                    z |= zU;
                    if (i2 == 0) {
                        rw3Var.n = zU;
                    } else if (i2 == 1) {
                        rw3Var.o = zU;
                    }
                } else if (i2 == 0) {
                    rw3Var.n = false;
                } else if (i2 == 1) {
                    rw3Var.o = false;
                }
            }
        }
        return z;
    }

    @Override // defpackage.kn9
    public final void l(View view, View view2, int i, int i2) {
        jt jtVar = this.F0;
        if (i2 == 1) {
            jtVar.c = i;
        } else {
            jtVar.b = i;
        }
        this.x0 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((rw3) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // defpackage.kn9
    public final void m(View view, int i) {
        jt jtVar = this.F0;
        if (i == 1) {
            jtVar.c = 0;
        } else {
            jtVar.b = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            rw3 rw3Var = (rw3) childAt.getLayoutParams();
            if (rw3Var.a(i)) {
                ow3 ow3Var = rw3Var.a;
                if (ow3Var != null) {
                    ow3Var.v(this, childAt, view, i);
                }
                if (i == 0) {
                    rw3Var.n = false;
                } else if (i == 1) {
                    rw3Var.o = false;
                }
                rw3Var.p = false;
            }
        }
        this.x0 = null;
    }

    @Override // defpackage.kn9
    public final void n(View view, int i, int i2, int[] iArr, int i3) {
        ow3 ow3Var;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                rw3 rw3Var = (rw3) childAt.getLayoutParams();
                if (rw3Var.a(i3) && (ow3Var = rw3Var.a) != null) {
                    int[] iArr2 = this.o;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ow3Var.o(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            o(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0044 A[EDGE_INSN: B:146:0x0044->B:10:0x0044 BREAK  A[LOOP:2: B:122:0x02d4->B:139:0x030d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(int r26) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.o(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
        if (this.z0) {
            if (this.y0 == null) {
                this.y0 = new sw3(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.y0);
        }
        if (this.A0 == null) {
            WeakHashMap weakHashMap = zmf.a;
            if (getFitsSystemWindows()) {
                mmf.c(this);
            }
        }
        this.u0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
        if (this.z0 && this.y0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.y0);
        }
        View view = this.x0;
        if (view != null) {
            m(view, 0);
        }
        this.u0 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.B0 || this.C0 == null) {
            return;
        }
        x6g x6gVar = this.A0;
        int iD = x6gVar != null ? x6gVar.d() : 0;
        if (iD > 0) {
            this.C0.setBounds(0, 0, getWidth(), iD);
            this.C0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u();
        }
        boolean zS = s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.w0 = null;
            u();
        }
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ow3 ow3Var;
        WeakHashMap weakHashMap = zmf.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((ow3Var = ((rw3) view.getLayoutParams()).a) == null || !ow3Var.l(this, view, layoutDirection))) {
                p(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                rw3 rw3Var = (rw3) childAt.getLayoutParams();
                if (rw3Var.a(0)) {
                    ow3 ow3Var = rw3Var.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        ow3 ow3Var;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                rw3 rw3Var = (rw3) childAt.getLayoutParams();
                if (rw3Var.a(0) && (ow3Var = rw3Var.a) != null) {
                    zN |= ow3Var.n(view);
                }
            }
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        n(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        j(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        l(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof tw3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        tw3 tw3Var = (tw3) parcelable;
        super.onRestoreInstanceState(tw3Var.a);
        SparseArray sparseArray = tw3Var.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            ow3 ow3Var = g(childAt).a;
            if (id != -1 && ow3Var != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                ow3Var.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableS;
        tw3 tw3Var = new tw3(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            ow3 ow3Var = ((rw3) childAt.getLayoutParams()).a;
            if (id != -1 && ow3Var != null && (parcelableS = ow3Var.s(childAt)) != null) {
                sparseArray.append(id, parcelableS);
            }
        }
        tw3Var.c = sparseArray;
        return tw3Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return k(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        m(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zS;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.w0;
        boolean z = false;
        if (view != null) {
            ow3 ow3Var = ((rw3) view.getLayoutParams()).a;
            zS = ow3Var != null ? ow3Var.w(this, this.w0, motionEvent) : false;
        } else {
            zS = s(motionEvent, 1);
            if (actionMasked != 0 && zS) {
                z = true;
            }
        }
        if (this.w0 == null || actionMasked == 3) {
            zS |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.w0 = null;
            u();
        }
        return zS;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.view.View r13, int r14) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(android.view.View, int):void");
    }

    public final void q(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    public final boolean r(ow3 ow3Var, View view, MotionEvent motionEvent, int i) {
        if (i == 0) {
            return ow3Var.k(this, view, motionEvent);
        }
        if (i == 1) {
            return ow3Var.w(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        ow3 ow3Var = ((rw3) view.getLayoutParams()).a;
        if (ow3Var == null || !ow3Var.q(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.t0) {
            return;
        }
        if (this.w0 == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                ow3 ow3Var = ((rw3) childAt.getLayoutParams()).a;
                if (ow3Var != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    ow3Var.k(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        u();
        this.t0 = true;
    }

    public final boolean s(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        fs4 fs4Var = J0;
        if (fs4Var != null) {
            Collections.sort(arrayList, fs4Var);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zR = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            rw3 rw3Var = (rw3) view.getLayoutParams();
            ow3 ow3Var = rw3Var.a;
            if (!(zR || z2) || actionMasked == 0) {
                if (!z2 && !zR && ow3Var != null && (zR = r(ow3Var, view, motionEvent, i))) {
                    this.w0 = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            View view2 = (View) arrayList.get(i4);
                            ow3 ow3Var2 = ((rw3) view2.getLayoutParams()).a;
                            if (ow3Var2 != null) {
                                if (motionEventObtain == null) {
                                    motionEventObtain = MotionEvent.obtain(motionEvent);
                                    motionEventObtain.setAction(3);
                                }
                                r(ow3Var2, view2, motionEventObtain, i);
                            }
                        }
                    }
                }
                if (rw3Var.a == null) {
                    rw3Var.m = false;
                }
                boolean z3 = rw3Var.m;
                if (z3) {
                    z = true;
                } else {
                    rw3Var.m = z3;
                    z = z3;
                }
                z2 = z && !z3;
                if (z && !z2) {
                    break;
                }
            } else if (ow3Var != null) {
                if (motionEventObtain == null) {
                    motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                }
                r(ow3Var, view, motionEventObtain, i);
            }
        }
        arrayList.clear();
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        return zR;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.D0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.C0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.C0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.C0.setState(getDrawableState());
                }
                Drawable drawable3 = this.C0;
                WeakHashMap weakHashMap = zmf.a;
                bq4.b(drawable3, getLayoutDirection());
                this.C0.setVisible(getVisibility() == 0, false);
                this.C0.setCallback(this);
            }
            WeakHashMap weakHashMap2 = zmf.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? kt3.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.C0;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.C0.setVisible(z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.t():void");
    }

    public final void u() {
        View view = this.w0;
        if (view != null) {
            ow3 ow3Var = ((rw3) view.getLayoutParams()).a;
            if (ow3Var != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                ow3Var.w(this, this.w0, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.w0 = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((rw3) getChildAt(i).getLayoutParams()).m = false;
        }
        this.t0 = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.C0;
    }

    public final void x() {
        WeakHashMap weakHashMap = zmf.a;
        if (!getFitsSystemWindows()) {
            omf.u(this, null);
            return;
        }
        if (this.E0 == null) {
            this.E0 = new gaa(this);
        }
        omf.u(this, this.E0);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof rw3 ? new rw3((rw3) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new rw3((ViewGroup.MarginLayoutParams) layoutParams) : new rw3(layoutParams);
    }
}
