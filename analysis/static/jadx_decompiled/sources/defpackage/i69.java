package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class i69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        i69 i69Var = (i69) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        i69Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        i69 i69Var = new i69(continuation, this.Y);
        i69Var.X = obj;
        return i69Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        y6c y6cVar;
        od2.a0(obj);
        s6c s6cVar = (s6c) this.X;
        bc7[] bc7VarArr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.Y;
        messagesListWidget.getClass();
        if (!(s6cVar instanceof s6c)) {
            throw new NoWhenBranchMatchedException();
        }
        if ((!s6cVar.e || messagesListWidget.s0().a(s6cVar.c)) && (y6cVar = messagesListWidget.W0) != null) {
            y6cVar.e(s6cVar.b, s6cVar.a, s6cVar.d);
        }
        return e5f.a;
    }
}
