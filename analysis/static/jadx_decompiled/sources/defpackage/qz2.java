package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* loaded from: classes.dex */
public final class qz2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsTabWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.Y = chatsTabWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qz2 qz2Var = (qz2) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qz2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qz2 qz2Var = new qz2(continuation, this.Y);
        qz2Var.X = obj;
        return qz2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        ChatsTabWidget chatsTabWidget = this.Y;
        chatsTabWidget.y0.g(list);
        chatsTabWidget.A0.M(list);
        return e5f.a;
    }
}
