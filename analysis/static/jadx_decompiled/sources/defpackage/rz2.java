package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* loaded from: classes.dex */
public final class rz2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsTabWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz2(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.Y = chatsTabWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rz2 rz2Var = (rz2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rz2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rz2 rz2Var = new rz2(continuation, this.Y);
        rz2Var.X = obj;
        return rz2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int iIntValue = ((Number) this.X).intValue();
        bc7[] bc7VarArr = ChatsTabWidget.C0;
        ChatsTabWidget chatsTabWidget = this.Y;
        if (chatsTabWidget.n0().getCurrentItem() != iIntValue || chatsTabWidget.m0().getSelectedTabPosition() != iIntValue) {
            chatsTabWidget.n0().e(iIntValue, false);
            chatsTabWidget.m0().q(iIntValue, 0.0f, true, true, true);
        }
        return e5f.a;
    }
}
