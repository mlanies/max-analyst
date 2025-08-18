package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class jn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jn2 jn2Var = (jn2) n((gk6) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jn2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jn2 jn2Var = new jn2(continuation, this.Y);
        jn2Var.X = obj;
        return jn2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        gk6 gk6Var = (gk6) this.X;
        kpa kpaVar = gk6Var == null ? null : new kpa(new Long(gk6Var.b), gk6Var.d);
        bc7[] bc7VarArr = ChatScreen.k1;
        this.Y.H0().q(kpaVar);
        return e5f.a;
    }
}
