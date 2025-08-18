package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes.dex */
public final class iv2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListSearchScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((iv2) n((tt2) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        iv2 iv2Var = new iv2(continuation, this.Y);
        iv2Var.X = obj;
        return iv2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i = 1;
        od2.a0(obj);
        tt2 tt2Var = (tt2) this.X;
        boolean z = tt2Var instanceof exc;
        e5f e5fVar = e5f.a;
        ChatsListSearchScreen chatsListSearchScreen = this.Y;
        if (z) {
            bc7[] bc7VarArr = ChatsListSearchScreen.J0;
            chatsListSearchScreen.q0();
            ((exc) tt2Var).getClass();
            xx6 xx6Var = (xx6) ys2.a.getAccessor().e();
            if (xx6Var != null) {
                xx6Var.f(Collections.singleton(new wx6(ux6.s0, 1)), wuc.CHATS_LIST_SEARCH_RESULT);
            }
        } else if (tt2Var instanceof rnd) {
            CharSequence charSequenceB = ((rnd) tt2Var).a.b(chatsListSearchScreen.getContext());
            if (charSequenceB == null) {
                return e5fVar;
            }
            vha vhaVar = chatsListSearchScreen.I0;
            if (vhaVar != null) {
                vhaVar.a();
            }
            wha whaVar = new wha(chatsListSearchScreen);
            whaVar.h(charSequenceB);
            chatsListSearchScreen.I0 = whaVar.i();
        } else if (tt2Var instanceof gnd) {
            gnd gndVar = (gnd) tt2Var;
            bc7[] bc7VarArr2 = ChatsListSearchScreen.J0;
            chatsListSearchScreen.getClass();
            bc7[] bc7VarArr3 = BottomSheetWidget.x0;
            lg3 lg3VarA = od2.a(gndVar.b, dy7.g(new kpa("selected.chatId.Action", Long.valueOf(gndVar.a))), 4);
            lg3VarA.f(gndVar.c);
            gndVar.d.forEach(new hk2(new jk2(1, lg3VarA, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 2), i));
            ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
            confirmationBottomSheetE.setTargetController(chatsListSearchScreen);
            uu3 parentController = chatsListSearchScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            znc zncVarT = focVar != null ? focVar.T() : null;
            confirmationBottomSheetE.z0(chatsListSearchScreen);
            if (zncVarT != null) {
                coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        }
        return e5fVar;
    }
}
