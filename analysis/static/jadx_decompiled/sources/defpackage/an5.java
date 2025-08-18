package defpackage;

import com.google.android.flexbox.FlexboxLayoutManager;

/* loaded from: classes.dex */
public final class an5 {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public an5(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public static void a(an5 an5Var) {
        FlexboxLayoutManager flexboxLayoutManager = an5Var.h;
        if (flexboxLayoutManager.d1() || !flexboxLayoutManager.t) {
            an5Var.c = an5Var.e ? flexboxLayoutManager.B.h() : flexboxLayoutManager.B.m();
        } else {
            an5Var.c = an5Var.e ? flexboxLayoutManager.B.h() : flexboxLayoutManager.n - flexboxLayoutManager.B.m();
        }
    }

    public static void b(an5 an5Var) {
        an5Var.a = -1;
        an5Var.b = -1;
        an5Var.c = Integer.MIN_VALUE;
        an5Var.f = false;
        an5Var.g = false;
        FlexboxLayoutManager flexboxLayoutManager = an5Var.h;
        if (flexboxLayoutManager.d1()) {
            int i = flexboxLayoutManager.q;
            if (i == 0) {
                an5Var.e = flexboxLayoutManager.p == 1;
                return;
            } else {
                an5Var.e = i == 2;
                return;
            }
        }
        int i2 = flexboxLayoutManager.q;
        if (i2 == 0) {
            an5Var.e = flexboxLayoutManager.p == 3;
        } else {
            an5Var.e = i2 == 2;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
    }
}
