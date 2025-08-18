package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bdf extends ffe implements a66 {
    public final /* synthetic */ gdf X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdf(gdf gdfVar, Continuation continuation) {
        super(2, continuation);
        this.X = gdfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bdf) n((e5f) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bdf(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        gdf gdfVar = this.X;
        RecyclerView recyclerView = gdfVar.f;
        e5f e5fVar = e5f.a;
        if (recyclerView == null) {
            return e5fVar;
        }
        String str = gdfVar.e;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Player autoplay. Handle fetch event for video message, try start autoplay.", null);
        }
        if (recyclerView.getScrollState() == 0) {
            this.X.e(recyclerView, false);
        }
        return e5fVar;
    }
}
