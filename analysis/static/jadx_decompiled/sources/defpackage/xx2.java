package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes.dex */
public final class xx2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        xx2 xx2Var = (xx2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        xx2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xx2 xx2Var = new xx2(continuation, this.Y);
        xx2Var.X = obj;
        return xx2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        View view;
        int i = 3;
        int i2 = 0;
        od2.a0(obj);
        ln3 ln3Var = (ln3) this.X;
        boolean z = ln3Var instanceof end;
        ChatsListWidget chatsListWidget = this.Y;
        if (z) {
            end endVar = (end) ln3Var;
            bc7[] bc7VarArr = ChatsListWidget.M0;
            chatsListWidget.getClass();
            bc7[] bc7VarArr2 = BottomSheetWidget.x0;
            lg3 lg3VarA = od2.a(endVar.b, dy7.g(new kpa("selected.contactId.Action", Long.valueOf(endVar.a))), 4);
            lg3VarA.f(endVar.c);
            endVar.d.forEach(new hk2(new jk2(1, lg3VarA, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 4), i));
            ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
            confirmationBottomSheetE.setTargetController(chatsListWidget);
            uu3 parentController = chatsListWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            znc zncVarT = focVar != null ? focVar.T() : null;
            confirmationBottomSheetE.z0(chatsListWidget);
            if (zncVarT != null) {
                coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        } else if (ln3Var instanceof dnd) {
            dnd dndVar = (dnd) ln3Var;
            bc7[] bc7VarArr3 = ChatsListWidget.M0;
            chatsListWidget.getClass();
            CharSequence charSequenceB = dndVar.a.b(chatsListWidget.getContext());
            if (charSequenceB != null) {
                wha whaVar = new wha(chatsListWidget);
                whaVar.h(charSequenceB);
                whaVar.e(nia.a);
                whaVar.f(pia.a);
                uu3 parentController2 = chatsListWidget.getParentController();
                whaVar.c(new eia(0, 0, (parentController2 == null || (view = parentController2.getView()) == null) ? 0 : view.getPaddingBottom(), 3));
                whaVar.d(new px2(dndVar, i2));
                whaVar.i();
            }
        }
        return e5f.a;
    }
}
