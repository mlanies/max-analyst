package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* loaded from: classes.dex */
public final class gpa extends mof {
    public final LinearLayoutManager a;
    public pof b;

    public gpa(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    @Override // defpackage.mof
    public final void a(int i) {
    }

    @Override // defpackage.mof
    public final void b(int i, float f, int i2) {
        if (this.b == null) {
            return;
        }
        float f2 = -f;
        int i3 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.a;
            if (i3 >= linearLayoutManager.w()) {
                return;
            }
            View viewV = linearLayoutManager.v(i3);
            if (viewV == null) {
                Locale locale = Locale.US;
                throw new IllegalStateException(wg0.h("LayoutManager returned a null child at pos ", i3, "/", linearLayoutManager.w(), " while transforming pages"));
            }
            float fM = (a.M(viewV) - i) + f2;
            f9 f9Var = (f9) this.b;
            xq3 xq3Var = ((mh0) f9Var.c).G0;
            boolean z = xq3Var.j() > 1;
            int iG = tu0.G(20 * fk4.d().getDisplayMetrics().density);
            int iG2 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
            int i4 = iG + iG2;
            float f3 = fM * (-i4);
            ViewPager2 viewPager2 = (ViewPager2) f9Var.b;
            if (viewPager2.getOrientation() == 0) {
                ViewGroup.LayoutParams layoutParams = viewV.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (viewV instanceof aba) {
                    marginLayoutParams.setMarginStart(0);
                    marginLayoutParams.setMarginEnd(0);
                } else if (!z) {
                    marginLayoutParams.setMarginStart(iG2);
                    marginLayoutParams.setMarginEnd(iG2);
                } else if (viewPager2.getCurrentItem() == 0) {
                    marginLayoutParams.setMarginStart(iG2);
                    marginLayoutParams.setMarginEnd(i4);
                } else if (viewPager2.getCurrentItem() == xq3Var.j() - 1) {
                    marginLayoutParams.setMarginStart(i4);
                    marginLayoutParams.setMarginEnd(iG2);
                }
                viewV.setLayoutParams(marginLayoutParams);
                if (!z) {
                    f3 = 0.0f;
                } else if (c54.K(viewPager2)) {
                    f3 = -f3;
                }
                viewV.setTranslationX(f3);
            }
            i3++;
        }
    }

    @Override // defpackage.mof
    public final void c(int i) {
    }
}
