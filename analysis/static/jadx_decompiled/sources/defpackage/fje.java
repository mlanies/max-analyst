package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class fje implements gof {
    public final WeakReference a;
    public int b;
    public int c;

    public fje(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    @Override // defpackage.gof
    public final void k(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.i1 = this.c;
        }
    }

    @Override // defpackage.gof
    public final void m(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.c;
        tabLayout.o(tabLayout.h(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }

    @Override // defpackage.gof
    public final void n(int i, float f) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i2 = this.c;
            tabLayout.q(i, f, i2 != 2 || this.b == 1, (i2 == 2 && this.b == 0) ? false : true, false);
        }
    }
}
