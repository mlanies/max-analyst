package defpackage;

import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class w15 implements Runnable {
    public final /* synthetic */ x15 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public w15(x15 x15Var, int i, int i2) {
        this.a = x15Var;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x15 x15Var = this.a;
        t15 t15Var = x15Var.a;
        if (this.b != 0 || this.c != 0) {
            t15Var.getClass();
        }
        EndlessRecyclerView2 endlessRecyclerView2 = x15Var.d;
        int iY0 = endlessRecyclerView2.getLinearLayoutManager().Y0();
        hdc adapter = endlessRecyclerView2.getAdapter();
        if ((adapter != null ? adapter.j() : 0) - iY0 <= x15Var.b && ((endlessRecyclerView2.getIgnoreRefreshingFlagsForScrollEvent() || !endlessRecyclerView2.b2) && t15Var.m())) {
            endlessRecyclerView2.setRefreshingNext(true);
            t15Var.l();
        }
        int iW0 = endlessRecyclerView2.getLinearLayoutManager().W0();
        if (iW0 < 0 || iW0 > x15Var.b) {
            return;
        }
        if ((endlessRecyclerView2.getIgnoreRefreshingFlagsForScrollEvent() || !endlessRecyclerView2.c2) && t15Var.h()) {
            endlessRecyclerView2.setRefreshingPrev(true);
            t15Var.j();
        }
    }
}
