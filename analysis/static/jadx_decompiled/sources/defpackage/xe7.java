package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class xe7 extends z04 {
    public final /* synthetic */ int e;
    public final SideSheetBehavior f;

    public /* synthetic */ xe7(SideSheetBehavior sideSheetBehavior, int i) {
        this.e = i;
        this.f = sideSheetBehavior;
    }

    @Override // defpackage.z04
    public final int A() {
        switch (this.e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    @Override // defpackage.z04
    public final int C() {
        switch (this.e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.f.m;
        }
    }

    @Override // defpackage.z04
    public final int D() {
        switch (this.e) {
            case 0:
                return this.f.o;
            default:
                return this.f.m;
        }
    }

    @Override // defpackage.z04
    public final int E() {
        switch (this.e) {
            case 0:
                return -this.f.l;
            default:
                return A();
        }
    }

    @Override // defpackage.z04
    public final int F(View view) {
        switch (this.e) {
            case 0:
                return view.getRight() + this.f.o;
            default:
                return view.getLeft() - this.f.o;
        }
    }

    @Override // defpackage.z04
    public final int G(CoordinatorLayout coordinatorLayout) {
        switch (this.e) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // defpackage.z04
    public final int H() {
        switch (this.e) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.z04
    public final boolean M(float f) {
        switch (this.e) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.z04
    public final boolean N(View view) {
        switch (this.e) {
            case 0:
                if (view.getRight() < (A() - C()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (A() + this.f.m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.z04
    public final boolean Q(float f, float f2) {
        switch (this.e) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    float fAbs = Math.abs(f);
                    this.f.getClass();
                    if (fAbs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    float fAbs2 = Math.abs(f);
                    this.f.getClass();
                    if (fAbs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.z04
    public final boolean X(View view, float f) {
        switch (this.e) {
            case 0:
                if (Math.abs((f * this.f.k) + view.getLeft()) > 0.5f) {
                }
                break;
            default:
                if (Math.abs((f * this.f.k) + view.getRight()) > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.z04
    public final void a0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.e) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // defpackage.z04
    public final void b0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.e) {
            case 0:
                if (i <= this.f.m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f.m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.z04
    public final int h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.z04
    public final float i(int i) {
        switch (this.e) {
            case 0:
                float fC = C();
                return (i - fC) / (A() - fC);
            default:
                float f = this.f.m;
                return (f - i) / (f - A());
        }
    }

    @Override // defpackage.z04
    public final int z(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }
}
