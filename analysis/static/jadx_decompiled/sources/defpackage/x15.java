package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class x15 extends tdc {
    public final t15 a;
    public int b = 1;
    public w15 c;
    public final /* synthetic */ EndlessRecyclerView2 d;

    public x15(EndlessRecyclerView2 endlessRecyclerView2, t15 t15Var) {
        this.d = endlessRecyclerView2;
        this.a = t15Var;
    }

    @Override // defpackage.tdc
    public final void b(RecyclerView recyclerView, int i, int i2) {
        w15 w15Var = this.c;
        EndlessRecyclerView2 endlessRecyclerView2 = this.d;
        if (w15Var != null) {
            endlessRecyclerView2.removeCallbacks(w15Var);
        }
        w15 w15Var2 = new w15(this, i, i2);
        this.c = w15Var2;
        endlessRecyclerView2.post(w15Var2);
    }
}
