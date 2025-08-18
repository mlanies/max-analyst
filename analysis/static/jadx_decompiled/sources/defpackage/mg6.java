package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class mg6 extends mof {
    public final /* synthetic */ int a;
    public final WeakReference b;
    public int c;
    public int d;

    public mg6(rg6 rg6Var) {
        this.a = 0;
        this.b = new WeakReference(rg6Var);
        this.c = 0;
        this.d = 0;
    }

    @Override // defpackage.mof
    public final void a(int i) {
        switch (this.a) {
            case 0:
                this.c = this.d;
                this.d = i;
                break;
            case 1:
                this.c = this.d;
                this.d = i;
                TabLayout tabLayout = (TabLayout) this.b.get();
                if (tabLayout != null) {
                    tabLayout.i1 = this.d;
                    break;
                }
                break;
            default:
                this.c = this.d;
                this.d = i;
                TabLayout tabLayout2 = (TabLayout) this.b.get();
                if (tabLayout2 != null) {
                    tabLayout2.i1 = this.d;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mof
    public final void b(int i, float f, int i2) {
        switch (this.a) {
            case 0:
                rg6 rg6Var = (rg6) this.b.get();
                if (rg6Var != null) {
                    try {
                        rg6.a(rg6Var.c.a, i);
                        rg6Var.c(i, f);
                        break;
                    } catch (IllegalArgumentException e) {
                        hm9.l0(mg6.class.getName(), "updatePagesNumber error: " + e.getMessage(), e);
                        return;
                    }
                }
                break;
            case 1:
                TabLayout tabLayout = (TabLayout) this.b.get();
                if (tabLayout != null) {
                    int i3 = this.d;
                    tabLayout.q(i, f, i3 != 2 || this.c == 1, (i3 == 2 && this.c == 0) ? false : true, false);
                    break;
                }
                break;
            default:
                TabLayout tabLayout2 = (TabLayout) this.b.get();
                if (tabLayout2 != null) {
                    int i4 = this.d;
                    tabLayout2.q(i, f, i4 != 2 || this.c == 1, (i4 == 2 && this.c == 0) ? false : true, false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mof
    public final void c(int i) {
        switch (this.a) {
            case 0:
                rg6 rg6Var = (rg6) this.b.get();
                try {
                    int i2 = this.d;
                    if (i2 != 0 && (i2 != 2 || this.c != 0)) {
                    }
                    if (rg6Var != null) {
                        rg6Var.setSelectedPageIndex(i);
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    hm9.l0(mg6.class.getName(), "updatePagesNumber error: " + e.getMessage(), e);
                    return;
                }
                break;
            case 1:
                TabLayout tabLayout = (TabLayout) this.b.get();
                if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                    int i3 = this.d;
                    tabLayout.o(tabLayout.h(i), i3 == 0 || (i3 == 2 && this.c == 0));
                    break;
                }
                break;
            default:
                TabLayout tabLayout2 = (TabLayout) this.b.get();
                if (tabLayout2 != null && tabLayout2.getSelectedTabPosition() != i && i < tabLayout2.getTabCount()) {
                    int i4 = this.d;
                    tabLayout2.o(tabLayout2.h(i), i4 == 0 || (i4 == 2 && this.c == 0));
                    break;
                }
                break;
        }
    }

    public mg6(TabLayout tabLayout, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new WeakReference(tabLayout);
                this.d = 0;
                this.c = 0;
                break;
            default:
                this.b = new WeakReference(tabLayout);
                this.d = 0;
                this.c = 0;
                break;
        }
    }
}
