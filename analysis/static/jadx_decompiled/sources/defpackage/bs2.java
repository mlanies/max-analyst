package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* loaded from: classes2.dex */
public final class bs2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatTitleIconScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.Y = chatTitleIconScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bs2 bs2Var = (bs2) n((cs2) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bs2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bs2 bs2Var = new bs2(continuation, this.Y);
        bs2Var.X = obj;
        return bs2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (tpa.f((cs2) this.X, cs2.a)) {
            bc7[] bc7VarArr = ChatTitleIconScreen.z0;
            ChatTitleIconScreen chatTitleIconScreen = this.Y;
            chatTitleIconScreen.p0().setProgressEnabled(false);
            wha whaVar = new wha(chatTitleIconScreen);
            whaVar.g(new eqe(aja.b));
            whaVar.i();
        }
        return e5f.a;
    }
}
