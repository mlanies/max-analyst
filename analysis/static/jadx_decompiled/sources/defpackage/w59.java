package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class w59 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w59(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        w59 w59Var = (w59) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        w59Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        w59 w59Var = new w59(continuation, this.Y);
        w59Var.X = obj;
        return w59Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bxc bxcVar = (bxc) this.X;
        bc7[] bc7VarArr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.Y;
        if (messagesListWidget.r0().w() == 0) {
            messagesListWidget.r0().t1(new x59(messagesListWidget, bxcVar));
        } else {
            messagesListWidget.r0().u1("ScrollButton");
            MessagesListWidget.o0(messagesListWidget, bxcVar);
        }
        return e5f.a;
    }
}
