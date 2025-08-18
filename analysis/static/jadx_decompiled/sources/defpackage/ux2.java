package defpackage;

import android.view.View;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes.dex */
public final class ux2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ux2 ux2Var = (ux2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ux2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ux2 ux2Var = new ux2(continuation, this.Y);
        ux2Var.X = obj;
        return ux2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [uu3] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        znc zncVarT;
        View view;
        od2.a0(obj);
        tt2 tt2Var = (tt2) this.X;
        boolean z = tt2Var instanceof exc;
        ChatsListWidget chatsListWidget = this.Y;
        if (z) {
            bc7[] bc7VarArr = ChatsListWidget.M0;
            chatsListWidget.o0().x0(0);
            ((exc) tt2Var).getClass();
            xx6 xx6Var = (xx6) ys2.a.getAccessor().e();
            if (xx6Var != null) {
                xx6Var.f(Collections.singleton(new wx6(ux6.s0, 1)), wuc.CHATS_LIST_TAB);
            }
        } else if (tt2Var instanceof rnd) {
            CharSequence charSequenceB = ((rnd) tt2Var).a.b(chatsListWidget.getContext());
            if (charSequenceB != null) {
                wha whaVar = new wha(chatsListWidget);
                whaVar.h(charSequenceB);
                whaVar.i();
            }
        } else {
            if (tt2Var instanceof gnd) {
                gnd gndVar = (gnd) tt2Var;
                bc7[] bc7VarArr2 = ChatsListWidget.M0;
                chatsListWidget.getClass();
                bc7[] bc7VarArr3 = BottomSheetWidget.x0;
                lg3 lg3VarA = od2.a(gndVar.b, dy7.g(new kpa("selected.chatId.Action", Long.valueOf(gndVar.a))), 4);
                lg3VarA.f(gndVar.c);
                gndVar.d.forEach(new hk2(new jk2(1, lg3VarA, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 3), 2));
                ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
                confirmationBottomSheetE.setTargetController(chatsListWidget);
                ?? parentController = chatsListWidget;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                zncVarT = focVar != null ? focVar.T() : null;
                confirmationBottomSheetE.z0(chatsListWidget);
                if (zncVarT != null) {
                    coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                }
            } else if (tt2Var instanceof cnd) {
                CharSequence charSequenceB2 = ((cnd) tt2Var).a.b(chatsListWidget.getContext());
                if (charSequenceB2 != null) {
                    wha whaVar2 = new wha(chatsListWidget);
                    whaVar2.e(nia.a);
                    whaVar2.h(charSequenceB2);
                    whaVar2.f(pia.a);
                    uu3 parentController2 = chatsListWidget.getParentController();
                    whaVar2.c(new eia(0, 0, (parentController2 == null || (view = parentController2.getView()) == null) ? 0 : view.getPaddingBottom(), 3));
                    whaVar2.d(new rxd(9, tt2Var));
                    whaVar2.i();
                }
            } else if (tt2Var instanceof knd) {
                ((cn3) chatsListWidget.y0.getValue()).a(chatsListWidget.requireActivity(), ((knd) tt2Var).a);
            } else {
                if (!(tt2Var instanceof d33)) {
                    throw new NoWhenBranchMatchedException();
                }
                bc7[] bc7VarArr4 = BottomSheetWidget.x0;
                lg3 lg3VarE = wg0.e(j0c.chat_list_confirm_clear_saved_messages_history_title, 6, null);
                lg3VarE.f(new eqe(j0c.chat_list_confirm_clear_saved_messages_history_subtitle));
                lg3VarE.b(uvb.oneme_saved_messages_clear_history, new eqe(j0c.chat_list_confirm_clear_saved_messages_history_negative_button));
                lg3VarE.c(hpc.a, new eqe(jpc.r));
                ConfirmationBottomSheet confirmationBottomSheetE2 = lg3VarE.e();
                confirmationBottomSheetE2.setTargetController(chatsListWidget);
                ?? parentController3 = chatsListWidget;
                while (parentController3.getParentController() != null) {
                    parentController3 = parentController3.getParentController();
                }
                foc focVar2 = parentController3 instanceof foc ? (foc) parentController3 : null;
                zncVarT = focVar2 != null ? focVar2.T() : null;
                confirmationBottomSheetE2.z0(chatsListWidget);
                if (zncVarT != null) {
                    coc cocVar2 = new coc(confirmationBottomSheetE2, null, null, null, false, -1);
                    wg0.l(false, cocVar2, true, "BottomSheetWidget");
                    zncVarT.G(cocVar2);
                }
            }
        }
        return e5f.a;
    }
}
