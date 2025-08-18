package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class gm2 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ EndlessRecyclerView2 Y;
    public final /* synthetic */ h8e Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gm2(h8e h8eVar, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = h8eVar;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                gm2 gm2Var = new gm2(this.Z, continuation, 0);
                gm2Var.Y = endlessRecyclerView2;
                e5f e5fVar = e5f.a;
                gm2Var.o(e5fVar);
                return e5fVar;
            default:
                gm2 gm2Var2 = new gm2(this.Z, continuation, 1);
                gm2Var2.Y = endlessRecyclerView2;
                e5f e5fVar2 = e5f.a;
                gm2Var2.o(e5fVar2);
                return e5fVar2;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = this.Y;
                this.Z.j();
                endlessRecyclerView2.Y();
                break;
            default:
                od2.a0(obj);
                EndlessRecyclerView2 endlessRecyclerView22 = this.Y;
                this.Z.j();
                endlessRecyclerView22.Y();
                break;
        }
        return e5f.a;
    }
}
