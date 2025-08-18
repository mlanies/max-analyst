package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class lof extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    public lof(ViewPager2 viewPager2) {
        this.E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void L0(zdc zdcVar, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.L0(zdcVar, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.a
    public final void a0(vdc vdcVar, zdc zdcVar, l4 l4Var) {
        super.a0(vdcVar, zdcVar, l4Var);
        this.E.H0.getClass();
    }

    @Override // androidx.recyclerview.widget.a
    public final void b0(vdc vdcVar, zdc zdcVar, View view, l4 l4Var) {
        int iM;
        int iM2;
        ViewPager2 viewPager2 = (ViewPager2) this.E.H0.X;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.u0.getClass();
            iM = a.M(view);
        } else {
            iM = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.u0.getClass();
            iM2 = a.M(view);
        } else {
            iM2 = 0;
        }
        l4Var.i(k4.a(false, iM, 1, iM2, 1));
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean o0(vdc vdcVar, zdc zdcVar, int i, Bundle bundle) {
        this.E.H0.getClass();
        return super.o0(vdcVar, zdcVar, i, bundle);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean v0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
