package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class jof extends mof {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewPager2 b;

    public /* synthetic */ jof(ViewPager2 viewPager2, int i) {
        this.a = i;
        this.b = viewPager2;
    }

    @Override // defpackage.mof
    public void a(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    this.b.h();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mof
    public final void c(int i) {
        switch (this.a) {
            case 0:
                ViewPager2 viewPager2 = this.b;
                if (viewPager2.o != i) {
                    viewPager2.o = i;
                    viewPager2.H0.M();
                    break;
                }
                break;
            default:
                ViewPager2 viewPager22 = this.b;
                viewPager22.clearFocus();
                if (viewPager22.hasFocus()) {
                    viewPager22.x0.requestFocus(2);
                    break;
                }
                break;
        }
    }
}
