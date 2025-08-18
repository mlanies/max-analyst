package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes.dex */
public final class ao2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ao2 ao2Var = (ao2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ao2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ao2 ao2Var = new ao2(continuation, this.Y);
        ao2Var.X = obj;
        return ao2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        od2.a0(obj);
        Boolean bool = (Boolean) this.X;
        bool.booleanValue();
        bc7[] bc7VarArr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        chatScreen.getClass();
        uu3 uu3VarB = ((j03) chatScreen.X0.T0(chatScreen, ChatScreen.k1[17])).b();
        VideoMessageWidget videoMessageWidget = uu3VarB instanceof VideoMessageWidget ? (VideoMessageWidget) uu3VarB : null;
        if (videoMessageWidget != null) {
            q0e q0eVar = ((ljf) videoMessageWidget.c.getValue()).b;
            do {
                value = q0eVar.getValue();
                ((Boolean) value).getClass();
            } while (!q0eVar.c(value, bool));
        }
        return e5f.a;
    }
}
