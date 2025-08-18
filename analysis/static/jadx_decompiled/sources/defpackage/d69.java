package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class d69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        d69 d69Var = (d69) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        d69Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        d69 d69Var = new d69(continuation, this.Y);
        d69Var.X = obj;
        return d69Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        twc twcVar = (twc) this.X;
        MessagesListWidget messagesListWidget = this.Y;
        String str = messagesListWidget.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Got new scrollEvent=" + twcVar, null);
        }
        if (twcVar.b) {
            messagesListWidget.r0().u1("ScrollEvent");
            messagesListWidget.s0().b();
        } else {
            messagesListWidget.r0().t1(new a69(messagesListWidget, 0));
        }
        return e5f.a;
    }
}
