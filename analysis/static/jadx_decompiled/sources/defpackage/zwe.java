package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes2.dex */
public final class zwe extends dle {
    public final ae3 o;

    public zwe(ae3 ae3Var) {
        this.o = ae3Var;
    }

    public static final void h0(zwe zweVar, RecyclerView recyclerView) {
        zweVar.getClass();
        a layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            if (recyclerView.canScrollVertically(-1)) {
                return;
            }
        } else if (linearLayoutManager.W0() > 0) {
            return;
        }
        if (zweVar.o.b) {
            recyclerView.B0(0);
        } else {
            recyclerView.x0(0);
        }
    }

    @Override // defpackage.dle
    public final jdc W(RecyclerView recyclerView, hdc hdcVar) {
        return new f8e(this, recyclerView, 1);
    }
}
