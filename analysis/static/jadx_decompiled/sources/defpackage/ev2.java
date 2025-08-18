package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* loaded from: classes.dex */
public final class ev2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListSearchScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ev2 ev2Var = (ev2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ev2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ev2 ev2Var = new ev2(continuation, this.Y);
        ev2Var.X = obj;
        return ev2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.D0.E((List) this.X);
        return e5f.a;
    }
}
