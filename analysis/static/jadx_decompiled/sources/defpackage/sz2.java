package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* loaded from: classes.dex */
public final class sz2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsTabWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.Y = chatsTabWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sz2 sz2Var = (sz2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sz2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sz2 sz2Var = new sz2(continuation, this.Y);
        sz2Var.X = obj;
        return sz2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int size = ((List) this.X).size();
        ChatsTabWidget chatsTabWidget = this.Y;
        if (size > 1) {
            bc7[] bc7VarArr = ChatsTabWidget.C0;
            chatsTabWidget.m0().setVisibility(0);
            chatsTabWidget.n0().setUserInputEnabled(true);
        } else {
            bc7[] bc7VarArr2 = ChatsTabWidget.C0;
            chatsTabWidget.m0().setVisibility(8);
            chatsTabWidget.n0().setUserInputEnabled(false);
        }
        return e5f.a;
    }
}
