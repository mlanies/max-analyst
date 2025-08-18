package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes.dex */
public final class zn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zn2 zn2Var = (zn2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zn2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zn2 zn2Var = new zn2(continuation, this.Y);
        zn2Var.X = obj;
        return zn2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean zBooleanValue = ((Boolean) this.X).booleanValue();
        bc7[] bc7VarArr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        chatScreen.O0().setVisibility(zBooleanValue ? 0 : 8);
        q7c q7cVar = chatScreen.X0;
        if (zBooleanValue) {
            j03 j03Var = (j03) q7cVar.T0(chatScreen, ChatScreen.k1[17]);
            if (!tpa.f(j03Var.c(), "video_msg_controller")) {
                coc cocVar = new coc(new VideoMessageWidget(), null, null, null, false, -1);
                cocVar.d("video_msg_controller");
                j03Var.a.R(cocVar);
            }
        } else {
            ((j03) q7cVar.T0(chatScreen, ChatScreen.k1[17])).a();
        }
        return e5f.a;
    }
}
