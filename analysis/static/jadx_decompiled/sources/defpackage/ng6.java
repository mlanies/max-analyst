package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class ng6 {
    public final ViewPager2 a;
    public final rg6 b;
    public boolean c;
    public hdc d;
    public mg6 e;
    public pz4 f;

    public ng6(ViewPager2 viewPager2, rg6 rg6Var) {
        this.a = viewPager2;
        this.b = rg6Var;
    }

    public final void a() {
        hdc hdcVar = this.d;
        if (hdcVar == null) {
            return;
        }
        try {
            int iJ = hdcVar.j();
            this.b.b(iJ, iJ == 0 ? 0 : Math.min(this.a.getCurrentItem(), iJ - 1));
        } catch (IllegalArgumentException e) {
            hm9.l0(ng6.class.getName(), "updatePagesNumber error: " + e.getMessage(), e);
        }
    }
}
