package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class g02 extends tdc {
    public final ppd a;
    public final m56 b;

    public g02(ppd ppdVar, m56 m56Var) {
        this.a = ppdVar;
        this.b = m56Var;
    }

    @Override // defpackage.tdc
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iT0;
        GridLayoutManager gridLayoutManagerQ = z7.q(recyclerView);
        if (gridLayoutManagerQ == null || (iT0 = gridLayoutManagerQ.T0()) == -1) {
            return;
        }
        this.b.invoke((ol7) x53.j0(iT0, this.a.o.f));
    }
}
