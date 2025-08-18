package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes.dex */
public final class xu2 implements qdc {
    public boolean X;
    public final RecyclerView a;
    public final k56 b;
    public final je7 c;
    public boolean o;

    public xu2(EndlessRecyclerView2 endlessRecyclerView2, ox2 ox2Var, je7 je7Var) {
        this.a = endlessRecyclerView2;
        this.b = ox2Var;
        this.c = je7Var;
    }

    @Override // defpackage.qdc
    public final void b(View view) {
    }

    @Override // defpackage.qdc
    public final void d(View view) {
        RecyclerView recyclerView = this.a;
        View viewI = recyclerView.I(view);
        dec decVarT = viewI == null ? null : recyclerView.T(viewI);
        if (decVarT instanceof a57) {
            if (this.o) {
                return;
            }
            this.o = true;
            pla.a(view, new wu2(view, this, 0));
            return;
        }
        if ((decVarT instanceof hb5) || (decVarT instanceof db5)) {
            if (this.X) {
                return;
            }
            this.X = true;
            pla.a(view, new wu2(view, this, 1));
            return;
        }
        if (!(decVarT instanceof us2) || this.X) {
            return;
        }
        this.X = true;
        pla.a(view, new wu2(view, this, 2));
    }
}
