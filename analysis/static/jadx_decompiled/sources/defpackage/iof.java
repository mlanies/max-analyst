package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class iof extends jdc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iof(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jdc
    public final void a() {
        switch (this.a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.b;
                viewPager2.s0 = true;
                viewPager2.z0.l = true;
                break;
            default:
                ((m5d) this.b).M();
                break;
        }
    }

    @Override // defpackage.jdc
    public final void b(int i, int i2) {
        a();
    }

    @Override // defpackage.jdc
    public final void c(int i, int i2, Object obj) {
        a();
    }

    @Override // defpackage.jdc
    public final void d(int i, int i2) {
        a();
    }

    @Override // defpackage.jdc
    public final void e(int i, int i2) {
        a();
    }

    @Override // defpackage.jdc
    public final void f(int i, int i2) {
        a();
    }
}
