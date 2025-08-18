package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import one.me.sdk.lists.widgets.EmptyRecyclerView;

/* loaded from: classes2.dex */
public class z15 extends EmptyRecyclerView {
    public final LinkedHashSet Z1;
    public final LinkedHashSet a2;
    public r15 b2;
    public p15 c2;
    public boolean d2;
    public boolean e2;
    public int f2;
    public Integer g2;
    public tj3 h2;
    public boolean i2;

    public z15(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.Z1 = new LinkedHashSet();
        this.a2 = new LinkedHashSet();
        this.f2 = 1;
        super.setOnScrollListener(new s15(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRefreshingNext$lambda$3(z15 z15Var) {
        p15 p15Var = z15Var.c2;
        if (p15Var == null) {
            return;
        }
        if (!z15Var.d2) {
            p15Var.m();
        } else {
            p15Var.a.e(p15Var.j() - 1, 1);
        }
    }

    @Override // one.me.sdk.lists.widgets.EmptyRecyclerView
    public final void G0(hdc hdcVar) {
        this.c2 = hdcVar instanceof p15 ? (p15) hdcVar : null;
        F0();
    }

    @Override // one.me.sdk.lists.widgets.EmptyRecyclerView
    public final hdc N0(hdc hdcVar) {
        if (hdcVar instanceof p15) {
            return hdcVar;
        }
        if (hdcVar != null) {
            return new p15(this, hdcVar);
        }
        return null;
    }

    public final void P0(int i) {
        if (Z()) {
            if (i > 5) {
                return;
            }
            post(new l40(i, 9, this));
        } else {
            if (this.e2) {
                p15 p15Var = this.c2;
                if (p15Var != null) {
                    p15Var.a.e(0, 1);
                    return;
                }
                return;
            }
            p15 p15Var2 = this.c2;
            if (p15Var2 != null) {
                p15Var2.a.f(0, 1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public hdc getAdapter() {
        return this.c2;
    }

    public final boolean getIgnoreRefreshingFlagsForScrollEvent() {
        return this.i2;
    }

    public final LinearLayoutManager getLinearLayoutManager() {
        a layoutManager = super.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    public final pec getRefreshingNextDelegate() {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void h0() {
        Iterator it = this.a2.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m(tdc tdcVar) {
        this.Z1.add(tdcVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (Exception e) {
            hm9.p("EndlessRecyclerView", "onLayout", e);
        }
        r15 r15Var = this.b2;
        if (r15Var != null) {
            r15Var.b(this, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void s0(tdc tdcVar) {
        this.Z1.remove(tdcVar);
    }

    public final void setIgnoreRefreshingFlagsForScrollEvent(boolean z) {
        this.i2 = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(a aVar) {
        if (!(aVar instanceof LinearLayoutManager) && !(aVar instanceof StaggeredGridLayoutManager)) {
            throw new IllegalArgumentException("layout manager must be an instance of LinearLayoutManager or StaggeredGridLayoutManager");
        }
        super.setLayoutManager(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnScrollListener(tdc tdcVar) {
        throw new UnsupportedOperationException("use addOnScrollListener(OnScrollListener) and removeOnScrollListener(OnScrollListener) instead");
    }

    public final void setPager(t15 t15Var) {
        if (t15Var == null) {
            tdc tdcVar = this.b2;
            if (tdcVar != null) {
                s0(tdcVar);
                this.b2 = null;
                return;
            }
            return;
        }
        r15 r15Var = new r15(this, t15Var);
        int i = this.f2;
        if (i <= 0) {
            throw new IllegalArgumentException(zr6.h(i, "illegal threshold: ").toString());
        }
        r15Var.b = i;
        m(r15Var);
        this.b2 = r15Var;
    }

    public final void setProgressView(int i) {
        this.g2 = Integer.valueOf(i);
        this.h2 = null;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setRefreshingNext(boolean z) {
        if (this.d2 == z) {
            return;
        }
        if (z && this.g2 == null) {
            z = false;
        }
        this.d2 = z;
        kp.x(this, new dd4(16, this));
    }

    public final void setRefreshingNextDelegate(pec pecVar) {
    }

    public final void setRefreshingPrev(boolean z) {
        if (this.e2 == z) {
            return;
        }
        if (z && this.g2 == null) {
            this.e2 = false;
        } else {
            this.e2 = z;
        }
        P0(0);
    }

    public final void setThreshold(int i) {
        this.f2 = i;
        r15 r15Var = this.b2;
        if (r15Var != null) {
            if (i <= 0) {
                throw new IllegalArgumentException(zr6.h(i, "illegal threshold: ").toString());
            }
            r15Var.b = i;
        }
    }
}
