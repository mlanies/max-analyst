package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class go2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        go2 go2Var = (go2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        go2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        go2 go2Var = new go2(continuation, this.Y);
        go2Var.X = obj;
        return go2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        xy8 xy8Var = (xy8) this.X;
        bc7[] bc7VarArr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        if (chatScreen.P0().d1.a.getValue() != null) {
            ChatScreen.x0(chatScreen, !(chatScreen.J0().Y.a.getValue() instanceof qzc) ? lr0.b : xy8Var == null ? lr0.c : lr0.a);
        }
        return e5f.a;
    }
}
