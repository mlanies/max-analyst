package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* loaded from: classes.dex */
public final class am extends a4 {
    public final /* synthetic */ fm d;
    public final /* synthetic */ CoordinatorLayout e;
    public final /* synthetic */ AppBarLayout$BaseBehavior f;

    public am(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, fm fmVar, CoordinatorLayout coordinatorLayout) {
        this.f = appBarLayout$BaseBehavior;
        this.d = fmVar;
        this.e = coordinatorLayout;
    }

    @Override // defpackage.a4
    public final void d(View view, l4 l4Var) {
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior;
        View viewA;
        this.a.onInitializeAccessibilityNodeInfo(view, l4Var.a);
        l4Var.h(ScrollView.class.getName());
        fm fmVar = this.d;
        if (fmVar.getTotalScrollRange() == 0 || (viewA = AppBarLayout$BaseBehavior.A((appBarLayout$BaseBehavior = this.f), this.e)) == null) {
            return;
        }
        int childCount = fmVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((dm) fmVar.getChildAt(i).getLayoutParams()).a != 0) {
                if (appBarLayout$BaseBehavior.D() != (-fmVar.getTotalScrollRange())) {
                    l4Var.b(f4.f);
                    l4Var.j(true);
                }
                if (appBarLayout$BaseBehavior.D() != 0) {
                    if (!viewA.canScrollVertically(-1)) {
                        l4Var.b(f4.g);
                        l4Var.j(true);
                        return;
                    } else {
                        if ((-fmVar.getDownNestedPreScrollRange()) != 0) {
                            l4Var.b(f4.g);
                            l4Var.j(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.a4
    public final boolean g(View view, int i, Bundle bundle) {
        fm fmVar = this.d;
        if (i == 4096) {
            fmVar.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.f;
        if (appBarLayout$BaseBehavior.D() != 0) {
            View viewA = AppBarLayout$BaseBehavior.A(appBarLayout$BaseBehavior, this.e);
            if (!viewA.canScrollVertically(-1)) {
                fmVar.setExpanded(true);
                return true;
            }
            int i2 = -fmVar.getDownNestedPreScrollRange();
            if (i2 != 0) {
                fm fmVar2 = this.d;
                this.f.o(this.e, fmVar2, viewA, 0, i2, new int[]{0, 0}, 1);
                return true;
            }
        }
        return false;
    }
}
