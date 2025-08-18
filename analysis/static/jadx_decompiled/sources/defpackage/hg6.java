package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import java.util.Arrays;
import java.util.WeakHashMap;
import ru.ok.messages.views.widgets.ContextMenuGridLayout;

/* loaded from: classes.dex */
public abstract class hg6 extends ViewGroup {
    public static final wf6 G0;
    public static final wf6 H0;
    public static final wf6 I0;
    public static final wf6 J0;
    public static final xf6 K0;
    public static final xf6 L0;
    public static final wf6 M0;
    public static final wf6 N0;
    public static final wf6 O0;
    public final bg6 a;
    public final bg6 b;
    public int c;
    public boolean o;
    public int s0;
    public final int t0;
    public int u0;
    public Printer v0;
    public static final LogPrinter w0 = new LogPrinter(3, hg6.class.getName());
    public static final vf6 x0 = new vf6();
    public static final int y0 = n3c.GridLayout_orientation;
    public static final int z0 = n3c.GridLayout_rowCount;
    public static final int A0 = n3c.GridLayout_columnCount;
    public static final int B0 = n3c.GridLayout_useDefaultMargins;
    public static final int C0 = n3c.GridLayout_alignmentMode;
    public static final int D0 = n3c.GridLayout_rowOrderPreserved;
    public static final int E0 = n3c.GridLayout_columnOrderPreserved;
    public static final wf6 F0 = new wf6(0);

    static {
        wf6 wf6Var = new wf6(1);
        wf6 wf6Var2 = new wf6(2);
        G0 = wf6Var;
        H0 = wf6Var2;
        I0 = wf6Var;
        J0 = wf6Var2;
        K0 = new xf6(wf6Var, wf6Var2);
        L0 = new xf6(wf6Var2, wf6Var);
        M0 = new wf6(3);
        N0 = new wf6(4);
        O0 = new wf6(5);
    }

    public hg6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ContextMenuGridLayout contextMenuGridLayout = (ContextMenuGridLayout) this;
        this.a = new bg6(contextMenuGridLayout, true);
        this.b = new bg6(contextMenuGridLayout, false);
        this.c = 0;
        this.o = false;
        this.s0 = 1;
        this.u0 = 0;
        this.v0 = w0;
        this.t0 = context.getResources().getDimensionPixelOffset(ptb.default_gap);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n3c.GridLayout);
        try {
            setRowCount(typedArrayObtainStyledAttributes.getInt(z0, Integer.MIN_VALUE));
            setColumnCount(typedArrayObtainStyledAttributes.getInt(A0, Integer.MIN_VALUE));
            setOrientation(typedArrayObtainStyledAttributes.getInt(y0, 0));
            setUseDefaultMargins(typedArrayObtainStyledAttributes.getBoolean(B0, false));
            setAlignmentMode(typedArrayObtainStyledAttributes.getInt(C0, 1));
            setRowOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(D0, true));
            setColumnOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(E0, true));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ote d(int i, boolean z) {
        int i2 = (i & (z ? 7 : 112)) >> (z ? 0 : 4);
        return i2 != 1 ? i2 != 3 ? i2 != 5 ? i2 != 7 ? i2 != 8388611 ? i2 != 8388613 ? F0 : J0 : I0 : O0 : z ? L0 : H0 : z ? K0 : G0 : M0;
    }

    public static void g(String str) {
        throw new IllegalArgumentException(au1.g(str, ". "));
    }

    public static void k(eg6 eg6Var, int i, int i2, int i3, int i4) {
        dg6 dg6Var = new dg6(i, i2 + i);
        gg6 gg6Var = eg6Var.a;
        eg6Var.a = new gg6(gg6Var.a, dg6Var, gg6Var.c, gg6Var.d);
        dg6 dg6Var2 = new dg6(i3, i4 + i3);
        gg6 gg6Var2 = eg6Var.b;
        eg6Var.b = new gg6(gg6Var2.a, dg6Var2, gg6Var2.c, gg6Var2.d);
    }

    public static gg6 l(int i, int i2, ote oteVar, float f) {
        return new gg6(i != Integer.MIN_VALUE, new dg6(i, i2 + i), oteVar, f);
    }

    public final void a(eg6 eg6Var, boolean z) {
        String str = z ? "column" : "row";
        dg6 dg6Var = (z ? eg6Var.b : eg6Var.a).b;
        int i = dg6Var.a;
        if (i != Integer.MIN_VALUE && i < 0) {
            g(str.concat(" indices must be positive"));
            throw null;
        }
        int i2 = (z ? this.a : this.b).b;
        if (i2 != Integer.MIN_VALUE) {
            if (dg6Var.b > i2) {
                g(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            }
            if (dg6Var.a() <= i2) {
                return;
            }
            g(str + " span mustn't exceed the " + str + " count");
            throw null;
        }
    }

    public final int b() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                iHashCode = ((eg6) childAt.getLayoutParams()).hashCode() + (iHashCode * 31);
            }
        }
        return iHashCode;
    }

    public final void c() {
        int i = this.u0;
        if (i != 0) {
            if (i != b()) {
                this.v0.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                h();
                c();
                return;
            }
            return;
        }
        boolean z = this.c == 0;
        int i2 = (z ? this.a : this.b).b;
        if (i2 == Integer.MIN_VALUE) {
            i2 = 0;
        }
        int[] iArr = new int[i2];
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            eg6 eg6Var = (eg6) getChildAt(i5).getLayoutParams();
            gg6 gg6Var = z ? eg6Var.a : eg6Var.b;
            dg6 dg6Var = gg6Var.b;
            int iA = dg6Var.a();
            boolean z2 = gg6Var.a;
            if (z2) {
                i3 = dg6Var.a;
            }
            gg6 gg6Var2 = z ? eg6Var.b : eg6Var.a;
            dg6 dg6Var2 = gg6Var2.b;
            int iA2 = dg6Var2.a();
            boolean z3 = gg6Var2.a;
            int i6 = dg6Var2.a;
            if (i2 != 0) {
                iA2 = Math.min(iA2, i2 - (z3 ? Math.min(i6, i2) : 0));
            }
            if (z3) {
                i4 = i6;
            }
            if (i2 != 0) {
                if (!z2 || !z3) {
                    while (true) {
                        int i7 = i4 + iA2;
                        if (i7 <= i2) {
                            for (int i8 = i4; i8 < i7; i8++) {
                                if (iArr[i8] <= i3) {
                                }
                            }
                            break;
                        }
                        if (z3) {
                            i3++;
                        } else if (i7 <= i2) {
                            i4++;
                        } else {
                            i3++;
                            i4 = 0;
                        }
                    }
                }
                Arrays.fill(iArr, Math.min(i4, i2), Math.min(i4 + iA2, i2), i3 + iA);
            }
            if (z) {
                k(eg6Var, i3, iA, i4, iA2);
            } else {
                k(eg6Var, i4, iA2, i3, iA);
            }
            i4 += iA2;
        }
        this.u0 = b();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof eg6)) {
            return false;
        }
        eg6 eg6Var = (eg6) layoutParams;
        a(eg6Var, true);
        a(eg6Var, false);
        return true;
    }

    public final int e(View view, boolean z, boolean z2) {
        int[] iArr;
        if (this.s0 == 1) {
            return f(view, z, z2);
        }
        bg6 bg6Var = z ? this.a : this.b;
        if (z2) {
            if (bg6Var.j == null) {
                bg6Var.j = new int[bg6Var.f() + 1];
            }
            if (!bg6Var.k) {
                bg6Var.c(true);
                bg6Var.k = true;
            }
            iArr = bg6Var.j;
        } else {
            if (bg6Var.l == null) {
                bg6Var.l = new int[bg6Var.f() + 1];
            }
            if (!bg6Var.m) {
                bg6Var.c(false);
                bg6Var.m = true;
            }
            iArr = bg6Var.l;
        }
        eg6 eg6Var = (eg6) view.getLayoutParams();
        dg6 dg6Var = (z ? eg6Var.b : eg6Var.a).b;
        return iArr[z2 ? dg6Var.a : dg6Var.b];
    }

    public final int f(View view, boolean z, boolean z2) {
        eg6 eg6Var = (eg6) view.getLayoutParams();
        int i = z ? z2 ? ((ViewGroup.MarginLayoutParams) eg6Var).leftMargin : ((ViewGroup.MarginLayoutParams) eg6Var).rightMargin : z2 ? ((ViewGroup.MarginLayoutParams) eg6Var).topMargin : ((ViewGroup.MarginLayoutParams) eg6Var).bottomMargin;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int i2 = 0;
        if (this.o) {
            gg6 gg6Var = z ? eg6Var.b : eg6Var.a;
            bg6 bg6Var = z ? this.a : this.b;
            dg6 dg6Var = gg6Var.b;
            if (z) {
                WeakHashMap weakHashMap = zmf.a;
                if (getLayoutDirection() == 1) {
                    z2 = !z2;
                }
            }
            if (z2) {
                int i3 = dg6Var.a;
            } else {
                int i4 = dg6Var.b;
                bg6Var.f();
            }
            if (view.getClass() != avd.class && view.getClass() != Space.class) {
                i2 = this.t0 / 2;
            }
        }
        return i2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new eg6();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        eg6 eg6Var = new eg6(context, attributeSet);
        gg6 gg6Var = gg6.e;
        eg6Var.a = gg6Var;
        eg6Var.b = gg6Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n3c.GridLayout_Layout);
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(eg6.d, Integer.MIN_VALUE);
            ((ViewGroup.MarginLayoutParams) eg6Var).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(eg6.e, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) eg6Var).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(eg6.f, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) eg6Var).rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(eg6.g, dimensionPixelSize);
            ((ViewGroup.MarginLayoutParams) eg6Var).bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(eg6.h, dimensionPixelSize);
            typedArrayObtainStyledAttributes.recycle();
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n3c.GridLayout_Layout);
            try {
                int i = typedArrayObtainStyledAttributes.getInt(eg6.o, 0);
                int i2 = typedArrayObtainStyledAttributes.getInt(eg6.i, Integer.MIN_VALUE);
                int i3 = eg6.j;
                int i4 = eg6.c;
                eg6Var.b = l(i2, typedArrayObtainStyledAttributes.getInt(i3, i4), d(i, true), typedArrayObtainStyledAttributes.getFloat(eg6.k, 0.0f));
                eg6Var.a = l(typedArrayObtainStyledAttributes.getInt(eg6.l, Integer.MIN_VALUE), typedArrayObtainStyledAttributes.getInt(eg6.m, i4), d(i, false), typedArrayObtainStyledAttributes.getFloat(eg6.n, 0.0f));
                return eg6Var;
            } finally {
            }
        } finally {
        }
    }

    public int getAlignmentMode() {
        return this.s0;
    }

    public int getColumnCount() {
        return this.a.f();
    }

    public int getOrientation() {
        return this.c;
    }

    public Printer getPrinter() {
        return this.v0;
    }

    public int getRowCount() {
        return this.b.f();
    }

    public boolean getUseDefaultMargins() {
        return this.o;
    }

    public final void h() {
        this.u0 = 0;
        bg6 bg6Var = this.a;
        if (bg6Var != null) {
            bg6Var.l();
        }
        bg6 bg6Var2 = this.b;
        if (bg6Var2 != null) {
            bg6Var2.l();
        }
        if (bg6Var == null || bg6Var2 == null) {
            return;
        }
        bg6Var.m();
        bg6Var2.m();
    }

    public final void i(View view, int i, int i2, int i3, int i4) {
        view.measure(ViewGroup.getChildMeasureSpec(i, e(view, true, false) + e(view, true, true), i3), ViewGroup.getChildMeasureSpec(i2, e(view, false, false) + e(view, false, true), i4));
    }

    public final void j(int i, int i2, boolean z) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                eg6 eg6Var = (eg6) childAt.getLayoutParams();
                if (z) {
                    i(childAt, i, i2, ((ViewGroup.MarginLayoutParams) eg6Var).width, ((ViewGroup.MarginLayoutParams) eg6Var).height);
                } else {
                    boolean z2 = this.c == 0;
                    gg6 gg6Var = z2 ? eg6Var.b : eg6Var.a;
                    if (gg6Var.a(z2) == O0) {
                        int[] iArrH = (z2 ? this.a : this.b).h();
                        dg6 dg6Var = gg6Var.b;
                        int iE = (iArrH[dg6Var.b] - iArrH[dg6Var.a]) - (e(childAt, z2, false) + e(childAt, z2, true));
                        if (z2) {
                            i(childAt, i, i2, iE, ((ViewGroup.MarginLayoutParams) eg6Var).height);
                        } else {
                            i(childAt, i, i2, ((ViewGroup.MarginLayoutParams) eg6Var).width, iE);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        bg6 bg6Var;
        bg6 bg6Var2;
        int i5;
        boolean z2;
        int i6;
        View view;
        hg6 hg6Var = this;
        c();
        int i7 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i8 = (i7 - paddingLeft) - paddingRight;
        bg6 bg6Var3 = hg6Var.a;
        bg6Var3.v.a = i8;
        bg6Var3.w.a = -i8;
        boolean z3 = false;
        bg6Var3.q = false;
        bg6Var3.h();
        int i9 = ((i4 - i2) - paddingTop) - paddingBottom;
        bg6 bg6Var4 = hg6Var.b;
        bg6Var4.v.a = i9;
        bg6Var4.w.a = -i9;
        bg6Var4.q = false;
        bg6Var4.h();
        int[] iArrH = bg6Var3.h();
        int[] iArrH2 = bg6Var4.h();
        int i10 = 0;
        for (int childCount = getChildCount(); i10 < childCount; childCount = i6) {
            View childAt = hg6Var.getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                i5 = i10;
                i6 = childCount;
                bg6Var = bg6Var3;
                z2 = z3;
                bg6Var2 = bg6Var4;
            } else {
                eg6 eg6Var = (eg6) childAt.getLayoutParams();
                gg6 gg6Var = eg6Var.b;
                gg6 gg6Var2 = eg6Var.a;
                dg6 dg6Var = gg6Var.b;
                dg6 dg6Var2 = gg6Var2.b;
                int i11 = iArrH[dg6Var.a];
                int i12 = childCount;
                int i13 = iArrH2[dg6Var2.a];
                int i14 = iArrH[dg6Var.b];
                int i15 = iArrH2[dg6Var2.b];
                int i16 = i14 - i11;
                int i17 = i15 - i13;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ote oteVarA = gg6Var.a(true);
                ote oteVarA2 = gg6Var2.a(false);
                nw4 nw4VarG = bg6Var3.g();
                bg6Var = bg6Var3;
                cg6 cg6Var = (cg6) ((Object[]) nw4VarG.o)[((int[]) nw4VarG.b)[i10]];
                nw4 nw4VarG2 = bg6Var4.g();
                bg6Var2 = bg6Var4;
                cg6 cg6Var2 = (cg6) ((Object[]) nw4VarG2.o)[((int[]) nw4VarG2.b)[i10]];
                int iR = oteVarA.r(childAt, i16 - cg6Var.d(true));
                int iR2 = oteVarA2.r(childAt, i17 - cg6Var2.d(true));
                int iE = hg6Var.e(childAt, true, true);
                int iE2 = hg6Var.e(childAt, false, true);
                int iE3 = hg6Var.e(childAt, true, false);
                int i18 = iE + iE3;
                int iE4 = iE2 + hg6Var.e(childAt, false, false);
                i5 = i10;
                z2 = false;
                i6 = i12;
                int iA = cg6Var.a(this, childAt, oteVarA, measuredWidth + i18, true);
                int iA2 = cg6Var2.a(this, childAt, oteVarA2, measuredHeight + iE4, false);
                int iV = oteVarA.v(measuredWidth, i16 - i18);
                int iV2 = oteVarA2.v(measuredHeight, i17 - iE4);
                int i19 = i11 + iR + iA;
                WeakHashMap weakHashMap = zmf.a;
                int i20 = getLayoutDirection() == 1 ? (((i7 - iV) - paddingRight) - iE3) - i19 : paddingLeft + iE + i19;
                int i21 = paddingTop + i13 + iR2 + iA2 + iE2;
                if (iV == childAt.getMeasuredWidth() && iV2 == childAt.getMeasuredHeight()) {
                    view = childAt;
                } else {
                    view = childAt;
                    view.measure(View.MeasureSpec.makeMeasureSpec(iV, 1073741824), View.MeasureSpec.makeMeasureSpec(iV2, 1073741824));
                }
                view.layout(i20, i21, iV + i20, iV2 + i21);
            }
            i10 = i5 + 1;
            hg6Var = this;
            bg6Var3 = bg6Var;
            bg6Var4 = bg6Var2;
            z3 = z2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iJ;
        int iJ2;
        c();
        bg6 bg6Var = this.b;
        bg6 bg6Var2 = this.a;
        if (bg6Var2 != null && bg6Var != null) {
            bg6Var2.m();
            bg6Var.m();
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingRight) + i), View.MeasureSpec.getMode(i));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingBottom) + i2), View.MeasureSpec.getMode(i2));
        j(iMakeMeasureSpec, iMakeMeasureSpec2, true);
        if (this.c == 0) {
            iJ2 = bg6Var2.j(iMakeMeasureSpec);
            j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iJ = bg6Var.j(iMakeMeasureSpec2);
        } else {
            iJ = bg6Var.j(iMakeMeasureSpec2);
            j(iMakeMeasureSpec, iMakeMeasureSpec2, false);
            iJ2 = bg6Var2.j(iMakeMeasureSpec);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iJ2 + paddingRight, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(iJ + paddingBottom, getSuggestedMinimumHeight()), i2, 0));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        h();
    }

    public void setAlignmentMode(int i) {
        this.s0 = i;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.a.o(i);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        bg6 bg6Var = this.a;
        bg6Var.u = z;
        bg6Var.l();
        h();
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.c != i) {
            this.c = i;
            h();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = x0;
        }
        this.v0 = printer;
    }

    public void setRowCount(int i) {
        this.b.o(i);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        bg6 bg6Var = this.b;
        bg6Var.u = z;
        bg6Var.l();
        h();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z) {
        this.o = z;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof eg6) {
            eg6 eg6Var = (eg6) layoutParams;
            eg6 eg6Var2 = new eg6(eg6Var);
            gg6 gg6Var = gg6.e;
            eg6Var2.a = gg6Var;
            eg6Var2.b = gg6Var;
            eg6Var2.a = eg6Var.a;
            eg6Var2.b = eg6Var.b;
            return eg6Var2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            eg6 eg6Var3 = new eg6((ViewGroup.MarginLayoutParams) layoutParams);
            gg6 gg6Var2 = gg6.e;
            eg6Var3.a = gg6Var2;
            eg6Var3.b = gg6Var2;
            return eg6Var3;
        }
        eg6 eg6Var4 = new eg6(layoutParams);
        gg6 gg6Var3 = gg6.e;
        eg6Var4.a = gg6Var3;
        eg6Var4.b = gg6Var3;
        return eg6Var4;
    }
}
