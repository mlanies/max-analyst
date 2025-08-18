package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class wn2 extends ffe implements a66 {
    public final /* synthetic */ ChatScreen X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        wn2 wn2Var = (wn2) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        wn2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wn2(continuation, this.X);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = ChatScreen.k1;
        this.X.y0();
        return e5f.a;
    }
}
