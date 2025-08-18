package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* loaded from: classes.dex */
public final class yx2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yx2 yx2Var = (yx2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yx2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yx2 yx2Var = new yx2(continuation, this.Y);
        yx2Var.X = obj;
        return yx2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.G0.E((List) this.X);
        return e5f.a;
    }
}
