package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class vx2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        vx2 vx2Var = (vx2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        vx2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vx2 vx2Var = new vx2(continuation, this.Y);
        vx2Var.X = obj;
        return vx2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean zBooleanValue = ((Boolean) this.X).booleanValue();
        bc7[] bc7VarArr = ChatsListWidget.M0;
        ChatsListWidget chatsListWidget = this.Y;
        if (zBooleanValue) {
            OneMeButton oneMeButton = chatsListWidget.n0().J0;
            oneMeButton.setText((CharSequence) null);
            oneMeButton.setOnClickListener(null);
            oneMeButton.setVisibility(8);
        } else {
            chatsListWidget.n0().x(chatsListWidget.getContext().getString(j0c.chats_list_empty_state_action), new c5(17, chatsListWidget));
        }
        return e5f.a;
    }
}
