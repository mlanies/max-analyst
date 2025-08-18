package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class zc7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ KeyboardStickersWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc7(KeyboardStickersWidget keyboardStickersWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = keyboardStickersWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zc7 zc7Var = (zc7) n((k7e) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zc7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zc7 zc7Var = new zc7(this.Y, continuation);
        zc7Var.X = obj;
        return zc7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        k7e k7eVar = (k7e) this.X;
        bc7[] bc7VarArr = KeyboardStickersWidget.t0;
        KeyboardStickersWidget keyboardStickersWidget = this.Y;
        EndlessRecyclerView2 endlessRecyclerView2M0 = keyboardStickersWidget.m0();
        int i = k7eVar.b;
        if (i >= 0) {
            endlessRecyclerView2M0.E0();
            GridLayoutManager gridLayoutManagerQ = z7.q(endlessRecyclerView2M0);
            if (gridLayoutManagerQ != null) {
                gridLayoutManagerQ.n1(i, 0);
            }
        }
        RecyclerView recyclerViewN0 = keyboardStickersWidget.n0();
        int i2 = k7eVar.c;
        if (i2 >= 0) {
            recyclerViewN0.E0();
            recyclerViewN0.x0(i2);
        }
        return e5f.a;
    }
}
