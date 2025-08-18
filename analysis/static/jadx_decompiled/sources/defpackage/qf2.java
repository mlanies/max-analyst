package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaListWidget;

/* loaded from: classes2.dex */
public final class qf2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf2(Continuation continuation, ChatMediaListWidget chatMediaListWidget) {
        super(2, continuation);
        this.Y = chatMediaListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qf2 qf2Var = (qf2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qf2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qf2 qf2Var = new qf2(continuation, this.Y);
        qf2Var.X = obj;
        return qf2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        lh2 lh2Var = (lh2) this.X;
        ChatMediaListWidget chatMediaListWidget = this.Y;
        ChatMediaListWidget.m0(chatMediaListWidget).setRefreshingNext(false);
        a layoutManager = ChatMediaListWidget.m0(chatMediaListWidget).getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        Integer num = linearLayoutManager != null ? new Integer(linearLayoutManager.T0()) : null;
        hdc adapter = ChatMediaListWidget.m0(chatMediaListWidget).getAdapter();
        nf2 nf2Var = adapter instanceof nf2 ? (nf2) adapter : null;
        if (nf2Var != null) {
            nf2Var.E(lh2Var.a);
        }
        if (num != null && num.intValue() == 0) {
            ChatMediaListWidget.m0(chatMediaListWidget).B0(0);
        }
        return e5f.a;
    }
}
