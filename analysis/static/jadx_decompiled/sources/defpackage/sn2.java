package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

/* loaded from: classes.dex */
public final class sn2 extends ffe implements a66 {
    public final /* synthetic */ ChatScreen X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sn2 sn2Var = (sn2) n((kce) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sn2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sn2(continuation, this.X);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = ChatScreen.k1;
        ChatScreen chatScreen = this.X;
        if (chatScreen.M0().b() == null) {
            j03 j03VarM0 = chatScreen.M0();
            boolean zF = tpa.f(j03VarM0.c(), "SuggestionsWidgetTag");
            String str = chatScreen.L0;
            if (!zF) {
                coc cocVar = new coc(new SuggestionsWidget(str, null), null, null, null, false, -1);
                cocVar.d("SuggestionsWidgetTag");
                j03VarM0.a.R(cocVar);
            }
            znc childRouter = chatScreen.getChildRouter(chatScreen.L0());
            childRouter.e = 1;
            childRouter.Q(false);
            if (!childRouter.n()) {
                childRouter.R(i24.e(new SuggestionsWidget(str, null), null, null));
            }
        }
        return e5f.a;
    }
}
