package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class dob {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object g;
    public Object h;

    public dob(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.g = constraintLayout2;
    }

    public static boolean a(int i2, int i3, int i4) {
        if (i2 == i3) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
        }
        return false;
    }

    public static boolean b(cob cobVar) {
        ty[] tyVarArr = cobVar.a.a;
        if (tyVarArr.length != 1 || tyVarArr[0].a != 0) {
            return false;
        }
        ty[] tyVarArr2 = cobVar.b.a;
        return tyVarArr2.length == 1 && tyVarArr2[0].a == 0;
    }

    public void c(hj3 hj3Var, xk0 xk0Var) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int i2;
        int iMin;
        boolean z;
        int baseline;
        int i3;
        if (hj3Var == null) {
            return;
        }
        if (hj3Var.g0 == 8) {
            xk0Var.g = 0;
            xk0Var.h = 0;
            xk0Var.i = 0;
            return;
        }
        if (hj3Var.T == null) {
            return;
        }
        int i4 = xk0Var.b;
        int i5 = xk0Var.d;
        int i6 = xk0Var.e;
        int i7 = xk0Var.f;
        int i8 = this.a + this.b;
        int i9 = this.c;
        View view = (View) hj3Var.f0;
        int iS = au1.s(i4);
        oi3 oi3Var = hj3Var.K;
        oi3 oi3Var2 = hj3Var.I;
        if (iS == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (iS == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.e, i9, -2);
        } else if (iS == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.e, i9, -2);
            boolean z2 = hj3Var.r == 1;
            int i10 = xk0Var.j;
            if (i10 == 1 || i10 == 2) {
                boolean z3 = view.getMeasuredHeight() == hj3Var.k();
                if (xk0Var.j == 2 || !z2 || ((z2 && z3) || hj3Var.A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hj3Var.q(), 1073741824);
                }
            }
        } else if (iS != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i11 = this.e;
            int i12 = oi3Var2 != null ? oi3Var2.g : 0;
            if (oi3Var != null) {
                i12 += oi3Var.g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int iS2 = au1.s(i5);
        if (iS2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (iS2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
        } else if (iS2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
            boolean z4 = hj3Var.s == 1;
            int i13 = xk0Var.j;
            if (i13 == 1 || i13 == 2) {
                boolean z5 = view.getMeasuredWidth() == hj3Var.q();
                if (xk0Var.j == 2 || !z4 || ((z4 && z5) || hj3Var.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(hj3Var.k(), 1073741824);
                }
            }
        } else if (iS2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i14 = this.f;
            int i15 = oi3Var2 != null ? hj3Var.J.g : 0;
            if (oi3Var != null) {
                i15 += hj3Var.L.g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        ij3 ij3Var = (ij3) hj3Var.T;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.h;
        if (ij3Var != null && v3c.k(constraintLayout.w0, 256) && view.getMeasuredWidth() == hj3Var.q() && view.getMeasuredWidth() < ij3Var.q() && view.getMeasuredHeight() == hj3Var.k() && view.getMeasuredHeight() < ij3Var.k() && view.getBaseline() == hj3Var.a0 && !hj3Var.z() && a(hj3Var.G, iMakeMeasureSpec, hj3Var.q()) && a(hj3Var.H, iMakeMeasureSpec2, hj3Var.k())) {
            xk0Var.g = hj3Var.q();
            xk0Var.h = hj3Var.k();
            xk0Var.i = hj3Var.a0;
            return;
        }
        boolean z6 = i4 == 3;
        boolean z7 = i5 == 3;
        boolean z8 = i5 == 4 || i5 == 1;
        boolean z9 = i4 == 4 || i4 == 1;
        boolean z10 = z6 && hj3Var.W > 0.0f;
        boolean z11 = z7 && hj3Var.W > 0.0f;
        if (view == null) {
            return;
        }
        ti3 ti3Var = (ti3) view.getLayoutParams();
        int i16 = xk0Var.j;
        if (i16 != 1 && i16 != 2 && z6 && hj3Var.r == 0 && z7 && hj3Var.s == 0) {
            i3 = -1;
            baseline = 0;
            z = false;
            iMin = 0;
            iMax = 0;
        } else {
            if ((view instanceof cqf) && (hj3Var instanceof nn5)) {
                ((cqf) view).l((nn5) hj3Var, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            hj3Var.G = iMakeMeasureSpec;
            hj3Var.H = iMakeMeasureSpec2;
            hj3Var.g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = hj3Var.u;
            iMax = i17 > 0 ? Math.max(i17, measuredWidth) : measuredWidth;
            int i18 = hj3Var.v;
            if (i18 > 0) {
                iMax = Math.min(i18, iMax);
            }
            int i19 = hj3Var.x;
            if (i19 > 0) {
                iMin = Math.max(i19, measuredHeight);
                i2 = iMakeMeasureSpec;
            } else {
                i2 = iMakeMeasureSpec;
                iMin = measuredHeight;
            }
            int i20 = hj3Var.y;
            if (i20 > 0) {
                iMin = Math.min(i20, iMin);
            }
            if (!v3c.k(constraintLayout.w0, 1)) {
                if (z10 && z8) {
                    iMax = (int) ((iMin * hj3Var.W) + 0.5f);
                } else if (z11 && z9) {
                    iMin = (int) ((iMax / hj3Var.W) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMin) {
                baseline = baseline2;
                i3 = -1;
                z = false;
            } else {
                int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i2;
                if (measuredHeight != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                hj3Var.G = iMakeMeasureSpec3;
                hj3Var.H = iMakeMeasureSpec2;
                z = false;
                hj3Var.g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMin = measuredHeight2;
                i3 = -1;
            }
        }
        boolean z12 = baseline != i3 ? true : z;
        if (iMax != xk0Var.e || iMin != xk0Var.f) {
            z = true;
        }
        xk0Var.k = z;
        boolean z13 = ti3Var.c0 ? true : z12;
        if (z13 && baseline != -1 && hj3Var.a0 != baseline) {
            xk0Var.k = true;
        }
        xk0Var.g = iMax;
        xk0Var.h = iMin;
        xk0Var.c = z13;
        xk0Var.i = baseline;
    }
}
