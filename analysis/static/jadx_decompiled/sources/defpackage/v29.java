package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class v29 implements qdc {
    public final RecyclerView a;
    public final k56 b;

    public v29(EndlessRecyclerView2 endlessRecyclerView2, p59 p59Var) {
        this.a = endlessRecyclerView2;
        this.b = p59Var;
    }

    @Override // defpackage.qdc
    public final void b(View view) {
    }

    @Override // defpackage.qdc
    public final void d(View view) {
        RecyclerView recyclerView = this.a;
        View viewI = recyclerView.I(view);
        if ((viewI == null ? null : recyclerView.T(viewI)) instanceof qy8) {
            pla.a(view, new q57(13, view, this));
        }
    }
}
