package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class jo2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jo2 jo2Var = (jo2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jo2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jo2 jo2Var = new jo2(continuation, this.Y);
        jo2Var.X = obj;
        return jo2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        fg9 fg9Var = (fg9) this.X;
        bc7[] bc7VarArr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        chatScreen.getClass();
        if (fg9Var.a > 0) {
            chatScreen.N0().c(String.valueOf(fg9Var.a), fg9Var.b, new fn2(chatScreen, 5), new gn2(chatScreen, 1));
        } else if (chatScreen.N0().b()) {
            chatScreen.N0().a();
        }
        return e5f.a;
    }
}
