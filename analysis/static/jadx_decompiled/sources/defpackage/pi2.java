package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class pi2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        pi2 pi2Var = (pi2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        pi2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        pi2 pi2Var = new pi2(continuation, this.Y);
        pi2Var.X = obj;
        return pi2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        mv3 mv3Var = (mv3) this.X;
        bc7[] bc7VarArr = ChatMediaViewerScreen.K0;
        ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
        chatMediaViewerScreen.getClass();
        if (tpa.f(mv3Var, iv3.a)) {
            if (chatMediaViewerScreen.G0 >= 0.0f) {
                chatMediaViewerScreen.B0().g(chatMediaViewerScreen.G0);
                chatMediaViewerScreen.G0 = -1.0f;
                chatMediaViewerScreen.A0().b(false);
            } else {
                chatMediaViewerScreen.G0 = chatMediaViewerScreen.B0().e();
                chatMediaViewerScreen.B0().g(0.0f);
                chatMediaViewerScreen.A0().b(true);
            }
        } else if (tpa.f(mv3Var, kv3.a)) {
            chatMediaViewerScreen.H0 = true;
        } else if (mv3Var instanceof lv3) {
            chatMediaViewerScreen.H0 = false;
            chatMediaViewerScreen.B0().J0(((lv3) mv3Var).a);
        } else if (mv3Var instanceof jv3) {
            ck2 ck2VarD0 = chatMediaViewerScreen.D0();
            ck2VarD0.c1.o1(ck2VarD0, ck2.d1[3], j47.S(ck2VarD0.a, ((w9a) ck2VarD0.t0).b(), vx3.b, new jj2(ck2VarD0, ((jv3) mv3Var).a, null)));
        } else {
            if (!tpa.f(mv3Var, hv3.a)) {
                throw new NoWhenBranchMatchedException();
            }
            chatMediaViewerScreen.D0().E(k8a.c);
        }
        return e5f.a;
    }
}
