package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class h69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        h69 h69Var = (h69) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        h69Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        h69 h69Var = new h69(continuation, this.Y);
        h69Var.X = obj;
        return h69Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        u5f u5fVar = (u5f) this.X;
        long jA = u5fVar.a();
        bc7[] bc7VarArr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.Y;
        messagesListWidget.getClass();
        bc7[] bc7VarArr2 = MessagesListWidget.X0;
        bc7 bc7Var = bc7VarArr2[2];
        messagesListWidget.o.b(messagesListWidget, Long.valueOf(jA));
        r5f r5fVar = messagesListWidget.F0;
        if (r5fVar != null) {
            bc7 bc7Var2 = bc7VarArr2[4];
            r5fVar.c = ((Boolean) messagesListWidget.Y.a(messagesListWidget)).booleanValue() ? 0L : u5fVar.a();
            messagesListWidget.u0().Y();
            if (u5fVar instanceof t5f) {
                int iK = messagesListWidget.A0.K(((t5f) u5fVar).a);
                if (iK >= 0) {
                    messagesListWidget.M0.e = -1;
                    messagesListWidget.u0().getLinearLayoutManager().n1(iK, messagesListWidget.u0().getMeasuredHeight() - r5fVar.i().getMeasuredHeight());
                }
            }
        }
        return e5f.a;
    }
}
