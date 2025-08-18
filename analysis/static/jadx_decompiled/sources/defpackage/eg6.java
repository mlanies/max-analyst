package defpackage;

import android.content.res.TypedArray;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class eg6 extends ViewGroup.MarginLayoutParams {
    public static final int c = (-2147483647) - Integer.MIN_VALUE;
    public static final int d = n3c.GridLayout_Layout_android_layout_margin;
    public static final int e = n3c.GridLayout_Layout_android_layout_marginLeft;
    public static final int f = n3c.GridLayout_Layout_android_layout_marginTop;
    public static final int g = n3c.GridLayout_Layout_android_layout_marginRight;
    public static final int h = n3c.GridLayout_Layout_android_layout_marginBottom;
    public static final int i = n3c.GridLayout_Layout_layout_column;
    public static final int j = n3c.GridLayout_Layout_layout_columnSpan;
    public static final int k = n3c.GridLayout_Layout_layout_columnWeight;
    public static final int l = n3c.GridLayout_Layout_layout_row;
    public static final int m = n3c.GridLayout_Layout_layout_rowSpan;
    public static final int n = n3c.GridLayout_Layout_layout_rowWeight;
    public static final int o = n3c.GridLayout_Layout_layout_gravity;
    public gg6 a;
    public gg6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg6() {
        super(-2, -2);
        gg6 gg6Var = gg6.e;
        this.a = gg6Var;
        this.b = gg6Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = gg6Var;
        this.b = gg6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eg6.class != obj.getClass()) {
            return false;
        }
        eg6 eg6Var = (eg6) obj;
        return this.b.equals(eg6Var.b) && this.a.equals(eg6Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.view.ViewGroup.LayoutParams
    public final void setBaseAttributes(TypedArray typedArray, int i2, int i3) {
        ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i2, -2);
        ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i3, -2);
    }
}
