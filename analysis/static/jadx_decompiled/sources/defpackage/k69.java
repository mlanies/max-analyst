package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class k69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        k69 k69Var = (k69) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        k69Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        k69 k69Var = new k69(continuation, this.Y);
        k69Var.X = obj;
        return k69Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.Y;
        EndlessRecyclerView2 endlessRecyclerView2U0 = messagesListWidget.u0();
        if (endlessRecyclerView2U0.getScrollState() == 0) {
            messagesListWidget.p0().e(endlessRecyclerView2U0, false);
        }
        return e5f.a;
    }
}
