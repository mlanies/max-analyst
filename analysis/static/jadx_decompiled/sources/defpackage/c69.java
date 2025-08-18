package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class c69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        c69 c69Var = (c69) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        c69Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        c69 c69Var = new c69(continuation, this.Y);
        c69Var.X = obj;
        return c69Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        String str = this.Y.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            int size = list.size();
            Object objI0 = x53.i0(list);
            MessageModel messageModel = objI0 instanceof MessageModel ? (MessageModel) objI0 : null;
            String strM = messageModel != null ? messageModel.m() : null;
            Object objQ0 = x53.q0(list);
            MessageModel messageModel2 = objQ0 instanceof MessageModel ? (MessageModel) objQ0 : null;
            ir6Var.d(us7Var, str, "Got new messages on UI, size=" + size + ", first=" + strM + ", last=" + (messageModel2 != null ? messageModel2.m() : null), null);
        }
        kp.x(this.Y.u0(), new h76(this.Y, 13, list));
        return e5f.a;
    }
}
