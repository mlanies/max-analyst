package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes.dex */
public final class rn2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rn2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rn2(continuation, this.Y);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objY;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        ChatScreen chatScreen = this.Y;
        if (i == 0) {
            od2.a0(obj);
            if (chatScreen.getView() != null && !chatScreen.I0().n()) {
                rq2 rq2VarP0 = chatScreen.P0();
                this.X = 1;
                objY = rq2VarP0.y(this);
                if (objY == tx3Var) {
                    return tx3Var;
                }
            }
            return e5fVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od2.a0(obj);
        objY = obj;
        long jLongValue = ((Number) objY).longValue();
        bc7[] bc7VarArr = ChatScreen.k1;
        znc zncVarI0 = chatScreen.I0();
        String str = chatScreen.L0;
        long j = chatScreen.getArgs().getLong("load_mark");
        long j2 = chatScreen.getArgs().getLong("message_id");
        Object obj2 = chatScreen.getArgs().get("highlights");
        List list = obj2 instanceof List ? (List) obj2 : null;
        if (list == null) {
            list = nz4.a;
        }
        MessagesListWidget messagesListWidget = new MessagesListWidget(str, jLongValue, j, list, j2, chatScreen.getArgs().getBoolean("highlight_message"), chatScreen.getArgs().getBoolean("from_forward"), null);
        messagesListWidget.I0 = chatScreen.Z0;
        zncVarI0.R(new coc(messagesListWidget, null, null, null, false, -1));
        return e5fVar;
    }
}
