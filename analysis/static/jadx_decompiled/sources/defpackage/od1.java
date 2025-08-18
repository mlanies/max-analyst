package defpackage;

import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class od1 extends mof {
    public final ViewPager2 a;
    public final ViewStub b;
    public final u21 c;
    public final wd1 d;
    public final m56 e;
    public final k56 f;
    public boolean g = true;
    public int h;
    public boolean i;

    public od1(ViewPager2 viewPager2, ViewStub viewStub, u21 u21Var, wd1 wd1Var, di1 di1Var, ci1 ci1Var) {
        this.a = viewPager2;
        this.b = viewStub;
        this.c = u21Var;
        this.d = wd1Var;
        this.e = di1Var;
        this.f = ci1Var;
    }

    @Override // defpackage.mof
    public final void a(int i) {
        this.g = i == 0;
    }

    @Override // defpackage.mof
    public final void b(int i, float f, int i2) {
        if (f == 0.0f) {
            this.h = i;
        }
        int iJ = this.d.j() - 1;
        int i3 = this.h;
        ViewStub viewStub = this.b;
        u21 u21Var = this.c;
        if (iJ != i3) {
            if (br7.G(viewStub)) {
                u21Var.setVisibility(8);
            }
            this.i = false;
            return;
        }
        if (!br7.G(viewStub)) {
            br7.F(viewStub, u21Var, null);
        }
        boolean z = this.h > i;
        float f2 = z ? 1.0f - f : f;
        double d = f2;
        if (0.1d > d || d > 0.6d) {
            if (0.6d <= d && d <= 0.99d && !this.i) {
                this.i = true;
                int i4 = Build.VERSION.SDK_INT;
                ViewPager2 viewPager2 = this.a;
                if (i4 >= 30) {
                    pag.F(viewPager2, mi6.GESTURE_START);
                }
                int i5 = this.h;
                viewPager2.e(z ? i5 - 1 : i5 + 1, true);
            } else if (br7.G(viewStub)) {
                u21Var.setVisibility(8);
            }
        } else if (u21Var.getVisibility() != 0) {
            ft.g(this.c, true, 0L, null, 6);
        }
        u21Var.setTranslationY((((Number) this.f.invoke()).floatValue() - i2) + (fk4.d().getDisplayMetrics().density * (-50.0f)));
        float f3 = ((u21Var.t0 - r0) * f2) + u21Var.c;
        float f4 = ((u21Var.o - r3) * f2) + u21Var.a;
        float f5 = ((u21Var.s0 - r4) * f2) + u21Var.b;
        int iG = tu0.G(f3);
        v21 v21Var = u21Var.v0;
        v21Var.setPadding(iG, iG, iG, iG);
        ViewGroup.LayoutParams layoutParams = v21Var.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = tu0.G(f4);
        layoutParams.height = tu0.G(f5);
        v21Var.setLayoutParams(layoutParams);
        float f6 = f2 * 3.0f;
        u21Var.u0.setAlpha(f6 <= 1.0f ? f6 : 1.0f);
    }

    @Override // defpackage.mof
    public final void c(int i) {
        vd1 vd1Var;
        nnf nnfVar;
        ViewPager2 viewPager2 = this.a;
        boolean z = viewPager2.F0;
        hm9.n("CallModeScrollTag", "viewpager position changed position=" + i + " isUserInputEnabled=" + z);
        if (z && (vd1Var = (vd1) this.d.G(i)) != null && (nnfVar = vd1Var.a) != null && nnfVar != nnf.b) {
            this.e.invoke(nnfVar);
        }
        viewPager2.setUserInputEnabled(true);
    }
}
