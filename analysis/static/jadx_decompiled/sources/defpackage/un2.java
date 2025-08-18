package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class un2 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        un2 un2Var = (un2) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        un2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        un2 un2Var = new un2(continuation, this.Y);
        un2Var.X = ((Boolean) obj).booleanValue();
        return un2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (this.X) {
            uu3 uu3Var = this.Y;
            uu3Var.getRouter().B(uu3Var);
        }
        return e5f.a;
    }
}
