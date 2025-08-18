package defpackage;

import android.view.View;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class g69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        g69 g69Var = (g69) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        g69Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        g69 g69Var = new g69(continuation, this.Y);
        g69Var.X = obj;
        return g69Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [uu3] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [uu3] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        znc zncVarT;
        od2.a0(obj);
        s29 s29Var = (s29) this.X;
        bc7[] bc7VarArr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.Y;
        messagesListWidget.getClass();
        if (s29Var instanceof fnd) {
            fnd fndVar = (fnd) s29Var;
            bc7[] bc7VarArr2 = BottomSheetWidget.x0;
            lg3 lg3VarA = od2.a(fndVar.b, dy7.g(new kpa("selected.messageIds.Action", x53.E0(fndVar.a))), 4);
            lg3VarA.f(fndVar.c);
            fndVar.d.forEach(new hk2(new jk2(1, lg3VarA, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 6), 6));
            ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
            confirmationBottomSheetE.setTargetController(messagesListWidget);
            ?? parentController = messagesListWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            zncVarT = focVar != null ? focVar.T() : null;
            confirmationBottomSheetE.z0(messagesListWidget);
            if (zncVarT != null) {
                coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        } else if (s29Var instanceof ond) {
            ond ondVar = (ond) s29Var;
            bc7[] bc7VarArr3 = BottomSheetWidget.x0;
            lg3 lg3VarA2 = od2.a(ondVar.e, dy7.g(new kpa("selected.messageIds.Action", new long[]{ondVar.a}), new kpa("bot.shareContact.confirm.keyboardId", ondVar.b), new kpa("bot.shareContact.confirm.button", ondVar.d), new kpa("bot.shareContact.confirm.buttonPosition", ondVar.c)), 4);
            lg3VarA2.f(ondVar.f);
            ondVar.g.forEach(new hk2(new jk2(1, lg3VarA2, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 7), 5));
            ConfirmationBottomSheet confirmationBottomSheetE2 = lg3VarA2.e();
            confirmationBottomSheetE2.setTargetController(messagesListWidget);
            ?? parentController2 = messagesListWidget;
            while (parentController2.getParentController() != null) {
                parentController2 = parentController2.getParentController();
            }
            foc focVar2 = parentController2 instanceof foc ? (foc) parentController2 : null;
            zncVarT = focVar2 != null ? focVar2.T() : null;
            confirmationBottomSheetE2.z0(messagesListWidget);
            if (zncVarT != null) {
                coc cocVar2 = new coc(confirmationBottomSheetE2, null, null, null, false, -1);
                wg0.l(false, cocVar2, true, "BottomSheetWidget");
                zncVarT.G(cocVar2);
            }
        } else if (s29Var instanceof nnd) {
            g39 g39VarV0 = messagesListWidget.v0();
            long j = ((nnd) s29Var).a;
            g39VarV0.getClass();
            pnf.o(g39VarV0.t0, new e39(j));
        } else if (s29Var instanceof hnd) {
            g39 g39VarV02 = messagesListWidget.v0();
            long j2 = ((hnd) s29Var).a;
            g39VarV02.getClass();
            pnf.o(g39VarV02.t0, new d39(j2));
        } else if (s29Var instanceof pnd) {
            pnd pndVar = (pnd) s29Var;
            CharSequence charSequenceB = pndVar.a.b(messagesListWidget.getContext());
            if (charSequenceB != null) {
                wha whaVar = new wha(messagesListWidget);
                whaVar.h(charSequenceB);
                whaVar.a(pndVar.c);
                whaVar.e(new kia(pndVar.b));
                whaVar.i();
            }
        } else if (s29Var instanceof ax8) {
            xx6 xx6Var = (xx6) o19.a.getAccessor().e();
            if (xx6Var != null) {
                xx6Var.f(Collections.singleton(new wx6(ux6.s0, 1)), wuc.CHAT);
            }
        } else if (s29Var instanceof x9) {
            y6c y6cVar = messagesListWidget.W0;
            if (y6cVar != null) {
                x9 x9Var = (x9) s29Var;
                y6cVar.e(x9Var.c, x9Var.a, x9Var.b);
            }
        } else {
            if (!tpa.f(s29Var, fta.a)) {
                throw new NoWhenBranchMatchedException();
            }
            View view = messagesListWidget.getView();
            if (view != null) {
                pag.F(view, mi6.CONFIRM);
            }
        }
        return e5f.a;
    }
}
