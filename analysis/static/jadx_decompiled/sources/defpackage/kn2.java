package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class kn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kn2 kn2Var = (kn2) n((lr0) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kn2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kn2 kn2Var = new kn2(continuation, this.Y);
        kn2Var.X = obj;
        return kn2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        od2.a0(obj);
        lr0 lr0Var = (lr0) this.X;
        bc7[] bc7VarArr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        g39 g39VarH0 = chatScreen.H0();
        boolean zF = tpa.f(lr0Var.name(), "SEARCH");
        q0e q0eVar = g39VarH0.b;
        do {
            value = q0eVar.getValue();
            ((Boolean) value).getClass();
        } while (!q0eVar.c(value, Boolean.valueOf(zF)));
        ChatScreen.x0(chatScreen, lr0Var);
        return e5f.a;
    }
}
