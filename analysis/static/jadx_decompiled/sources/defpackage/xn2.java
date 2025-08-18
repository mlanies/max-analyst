package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes.dex */
public final class xn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        xn2 xn2Var = (xn2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        xn2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xn2 xn2Var = new xn2(continuation, this.Y);
        xn2Var.X = obj;
        return xn2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        xx6 xx6Var;
        final int i = 1;
        final int i2 = 0;
        od2.a0(obj);
        gp2 gp2Var = (gp2) this.X;
        boolean z = gp2Var instanceof dp2;
        ChatScreen chatScreen = this.Y;
        if (z) {
            dp2 dp2Var = (dp2) gp2Var;
            List list = dp2Var.a;
            bc7[] bc7VarArr = ChatScreen.k1;
            chatScreen.getClass();
            dy7.c(1).I(list).S(dp2Var.b).Y(dp2Var.c).s().build().q(chatScreen);
        } else if (gp2Var instanceof fp2) {
            final fp2 fp2Var = (fp2) gp2Var;
            chatScreen.Y.e(zs1.CHAT_HEAD, false);
            if (fp2Var.a != 0) {
                chatScreen.C0().l(fp2Var.a, false, new k56() { // from class: in2
                    @Override // defpackage.k56
                    public final Object invoke() {
                        e5f e5fVar = e5f.a;
                        fp2 fp2Var2 = fp2Var;
                        switch (i2) {
                            case 0:
                                bc7[] bc7VarArr2 = ChatScreen.k1;
                                vo2.c.Z1(fp2Var2.a, false);
                                break;
                            case 1:
                                bc7[] bc7VarArr3 = ChatScreen.k1;
                                vo2.c.P1().b(":call-join-link?link=".concat(fp2Var2.c), null);
                                break;
                            default:
                                bc7[] bc7VarArr4 = ChatScreen.k1;
                                vo2.c.P1().b(zr6.k(new StringBuilder(":call-chat?chat_id="), fp2Var2.b, "&video_enabled=false"), null);
                                break;
                        }
                        return e5fVar;
                    }
                });
            } else {
                String str = fp2Var.c;
                if (!(str == null || str.length() == 0)) {
                    rg1 rg1VarC0 = chatScreen.C0();
                    if (str == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    rg1VarC0.j(str, true, false, false, new k56() { // from class: in2
                        @Override // defpackage.k56
                        public final Object invoke() {
                            e5f e5fVar = e5f.a;
                            fp2 fp2Var2 = fp2Var;
                            switch (i) {
                                case 0:
                                    bc7[] bc7VarArr2 = ChatScreen.k1;
                                    vo2.c.Z1(fp2Var2.a, false);
                                    break;
                                case 1:
                                    bc7[] bc7VarArr3 = ChatScreen.k1;
                                    vo2.c.P1().b(":call-join-link?link=".concat(fp2Var2.c), null);
                                    break;
                                default:
                                    bc7[] bc7VarArr4 = ChatScreen.k1;
                                    vo2.c.P1().b(zr6.k(new StringBuilder(":call-chat?chat_id="), fp2Var2.b, "&video_enabled=false"), null);
                                    break;
                            }
                            return e5fVar;
                        }
                    });
                } else {
                    long j = fp2Var.b;
                    if (j != 0) {
                        final int i3 = 2;
                        chatScreen.C0().i(j, false, new k56() { // from class: in2
                            @Override // defpackage.k56
                            public final Object invoke() {
                                e5f e5fVar = e5f.a;
                                fp2 fp2Var2 = fp2Var;
                                switch (i3) {
                                    case 0:
                                        bc7[] bc7VarArr2 = ChatScreen.k1;
                                        vo2.c.Z1(fp2Var2.a, false);
                                        break;
                                    case 1:
                                        bc7[] bc7VarArr3 = ChatScreen.k1;
                                        vo2.c.P1().b(":call-join-link?link=".concat(fp2Var2.c), null);
                                        break;
                                    default:
                                        bc7[] bc7VarArr4 = ChatScreen.k1;
                                        vo2.c.P1().b(zr6.k(new StringBuilder(":call-chat?chat_id="), fp2Var2.b, "&video_enabled=false"), null);
                                        break;
                                }
                                return e5fVar;
                            }
                        });
                    }
                }
            }
        } else if (gp2Var instanceof ep2) {
            ep2 ep2Var = (ep2) gp2Var;
            ChatScreen.U0(this.Y, new Integer(ep2Var.a), null, ep2Var.b, ep2Var.c, 2);
        } else {
            if (gp2Var instanceof bp2) {
                bc7[] bc7VarArr2 = BottomSheetWidget.x0;
                bp2 bp2Var = (bp2) gp2Var;
                lg3 lg3VarA = od2.a(bp2Var.a, null, 6);
                bp2Var.b.forEach(new oo2(new jk2(1, lg3VarA, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 1), 0));
                ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
                confirmationBottomSheetE.setTargetController(chatScreen);
                uu3 parentController = chatScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                znc zncVarT = focVar != null ? focVar.T() : null;
                confirmationBottomSheetE.z0(chatScreen);
                if (zncVarT != null) {
                    coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                }
            } else if (gp2Var instanceof cp2) {
                cp2 cp2Var = (cp2) gp2Var;
                bc7[] bc7VarArr3 = ChatScreen.k1;
                MessageWriteWidget messageWriteWidgetG0 = chatScreen.G0();
                if (messageWriteWidgetG0 != null) {
                    CharSequence charSequence = cp2Var.a;
                    messageWriteWidgetG0.q0().setText(charSequence);
                    if (charSequence != null && charSequence.length() != 0) {
                        messageWriteWidgetG0.q0().h(charSequence.length());
                    }
                }
                ((yce) chatScreen.G0.getValue()).r(cp2Var.a);
                Long l = cp2Var.b;
                if (l != null) {
                    chatScreen.F0().D(l);
                } else {
                    Long l2 = cp2Var.c;
                    if (l2 != null) {
                        xz8.C(chatScreen.F0(), l2, null, null, 6);
                    }
                }
            } else if (gp2Var instanceof zo2) {
                zo2 zo2Var = (zo2) gp2Var;
                int i4 = zo2Var.a;
                bc7[] bc7VarArr4 = ChatScreen.k1;
                chatScreen.F0().D(null);
                if (!zo2Var.c) {
                    chatScreen.F0().s();
                }
                chatScreen.H0().q(null);
                je7 je7Var = chatScreen.h1;
                xx6 xx6Var2 = (xx6) je7Var.getValue();
                if (xx6Var2 != null) {
                    xx6Var2.f(Collections.singleton(new wx6(ux6.b, i4)), wuc.CHAT);
                }
                zy5 zy5Var = zo2Var.b;
                if (zy5Var != null && (xx6Var = (xx6) je7Var.getValue()) != null) {
                    xx6Var.f(zy5Var.a, zy5Var.b);
                }
            } else if (gp2Var instanceof xo2) {
                bc7[] bc7VarArr5 = ChatScreen.k1;
                chatScreen.F0().s();
                if (!((xo2) gp2Var).a) {
                    chatScreen.getRouter().C();
                }
            } else {
                if (!tpa.f(gp2Var, ap2.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bc7[] bc7VarArr6 = ChatScreen.k1;
                chatScreen.J0().r(true);
            }
        }
        return e5f.a;
    }
}
