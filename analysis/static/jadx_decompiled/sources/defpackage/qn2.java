package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes.dex */
public final class qn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qn2 qn2Var = (qn2) n((p35) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qn2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qn2 qn2Var = new qn2(continuation, this.Y);
        qn2Var.X = obj;
        return qn2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        hc8 hc8Var;
        od2.a0(obj);
        uy8 uy8Var = (uy8) ((p35) this.X).a;
        bc7[] bc7VarArr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        chatScreen.getClass();
        int iS = au1.s(uy8Var.a);
        if (iS != 0) {
            x29 x29Var = x29.a;
            if (iS == 1) {
                e52 e52Var = (e52) chatScreen.P0().Y0.a.getValue();
                if (e52Var != null) {
                    bc7[] bc7VarArr2 = ChatScreen.k1;
                    bc7 bc7Var = bc7VarArr2[14];
                    q7c q7cVar = chatScreen.T0;
                    if (!((znc) q7cVar.T0(chatScreen, bc7Var)).n()) {
                        znc zncVar = (znc) q7cVar.T0(chatScreen, bc7VarArr2[14]);
                        MediaKeyboardWidget mediaKeyboardWidget = new MediaKeyboardWidget(chatScreen.L0, e52Var.a, false, 4, null);
                        mediaKeyboardWidget.o = chatScreen.Z0;
                        zncVar.R(i24.e(mediaKeyboardWidget, null, null));
                    }
                    int i = vc7.a;
                    if (vc7.b(vc7.c)) {
                        pnf.o(chatScreen.H0().s0, x29Var);
                    }
                    if (chatScreen.Q0()) {
                        zmf.l(chatScreen.z0(), null);
                        zmf.l((w12) chatScreen.M0.T0(chatScreen, bc7VarArr2[7]), null);
                        omf.u(chatScreen.z0(), null);
                    }
                    chatScreen.M0().a();
                    hc8 hc8Var2 = chatScreen.U0;
                    if (hc8Var2 != null) {
                        hc8Var2.f();
                    }
                }
            } else if (iS == 2) {
                hc8 hc8Var3 = chatScreen.U0;
                if (hc8Var3 != null && hc8Var3.l) {
                    pnf.o(chatScreen.H0().s0, x29Var);
                }
                MessageWriteWidget messageWriteWidgetG0 = chatScreen.G0();
                if (messageWriteWidgetG0 != null) {
                    messageWriteWidgetG0.q0().e(true);
                }
                i24.s(new zn5(od2.Z(new xk1(vc7.f, 15), 1), new wn2(null, chatScreen), 5), chatScreen.getViewLifecycleScope());
            } else if (iS == 3 && (hc8Var = chatScreen.U0) != null && hc8Var.l) {
                pnf.o(chatScreen.H0().s0, x29Var);
            }
        } else {
            hc8 hc8Var4 = chatScreen.U0;
            if (hc8Var4 != null) {
                bc7[] bc7VarArr3 = hc8.m;
                hc8Var4.e(true);
            }
        }
        return e5f.a;
    }
}
