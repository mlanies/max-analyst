package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class tn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        tn2 tn2Var = (tn2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        tn2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tn2 tn2Var = new tn2(continuation, this.Y);
        tn2Var.X = obj;
        return tn2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        kpa kpaVar = (kpa) this.X;
        ls2 ls2Var = (ls2) kpaVar.a;
        tzc tzcVar = (tzc) kpaVar.b;
        bc7[] bc7VarArr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        if (tpa.f(chatScreen.N0().getRightActions(), nka.a) || !tpa.f(chatScreen.N0().getRightActions(), ls2Var.g)) {
            chatScreen.N0().setRightActions(ls2Var.g);
        }
        chatScreen.N0().setTitle(ls2Var.b);
        ChatScreen.w0(chatScreen, chatScreen.N0(), ls2Var.d);
        cla claVarN0 = chatScreen.N0();
        jqe jqeVar = ls2Var.c;
        claVarN0.setSubtitle(jqeVar != null ? jqeVar.b(chatScreen.getContext()) : null);
        chatScreen.N0().setAvatar(new tka(ls2Var.e, ls2Var.f, ls2Var.a, ls2Var.h, 8));
        boolean z = tzcVar instanceof qzc;
        cha chaVar = cha.o;
        cha chaVar2 = cha.c;
        if (z) {
            if (chatScreen.K0().getState() == chaVar2 || chatScreen.K0().getState() == chaVar) {
                chatScreen.K0().b();
            }
        } else if (tzcVar instanceof rzc) {
            if (chatScreen.K0().getState() != chaVar2 && chatScreen.K0().getState() != chaVar) {
                chatScreen.N0().f(false);
                eha ehaVarK0 = chatScreen.K0();
                ehaVarK0.setExpandWithAnimation(((rzc) tzcVar).a);
                ehaVarK0.c(true);
            }
        } else if (!(tzcVar instanceof pzc)) {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
