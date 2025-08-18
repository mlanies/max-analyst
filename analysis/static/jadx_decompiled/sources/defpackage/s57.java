package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class s57 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InviteByPhoneScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s57(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.Y = inviteByPhoneScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        s57 s57Var = (s57) n((k57) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        s57Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        s57 s57Var = new s57(continuation, this.Y);
        s57Var.X = obj;
        return s57Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16, types: [uu3] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [uu3] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Integer numE;
        od2.a0(obj);
        k57 k57Var = (k57) this.X;
        bc7[] bc7VarArr = InviteByPhoneScreen.B0;
        InviteByPhoneScreen inviteByPhoneScreen = this.Y;
        OneMeButton oneMeButtonN0 = inviteByPhoneScreen.n0();
        oneMeButtonN0.setProgressEnabled(false);
        oneMeButtonN0.setClickable(true);
        if (k57Var instanceof g57) {
            InviteByPhoneScreen.m0(inviteByPhoneScreen, ((g57) k57Var).a.b(inviteByPhoneScreen.getContext()));
        } else {
            if (k57Var instanceof h57) {
                h57 h57Var = (h57) k57Var;
                jqe jqeVar = h57Var.a;
                inviteByPhoneScreen.a.getClass();
                CharSequence charSequenceB = jqeVar.b(inviteByPhoneScreen.getContext());
                if (charSequenceB != null) {
                    jqe jqeVar2 = h57Var.b;
                    CharSequence charSequenceB2 = jqeVar2 != null ? jqeVar2.b(inviteByPhoneScreen.getContext()) : null;
                    wha whaVar = new wha(inviteByPhoneScreen);
                    whaVar.h(charSequenceB);
                    whaVar.b(charSequenceB2);
                    View view = inviteByPhoneScreen.getView();
                    whaVar.c(new eia(1, (view == null || (numE = br7.E(view)) == null) ? 0 : numE.intValue(), 0, 4));
                    whaVar.i();
                }
            } else if (k57Var instanceof i57) {
                bc7[] bc7VarArr2 = BottomSheetWidget.x0;
                lg3 lg3VarE = wg0.e(hca.c, 6, null);
                lg3VarE.f(new eqe(hca.b));
                lg3VarE.d(gca.b, new eqe(yoc.s0));
                lg3VarE.d(gca.a, new eqe(hca.a));
                ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
                confirmationBottomSheetE.setTargetController(inviteByPhoneScreen);
                ?? parentController = inviteByPhoneScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                znc zncVarT = focVar != null ? focVar.T() : null;
                confirmationBottomSheetE.z0(inviteByPhoneScreen);
                if (zncVarT != null) {
                    coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                }
            } else if (k57Var instanceof j57) {
                bc7[] bc7VarArr3 = BottomSheetWidget.x0;
                lg3 lg3VarE2 = wg0.e(vfa.c, 6, null);
                lg3VarE2.f(new eqe(vfa.b));
                lg3VarE2.d(ufa.d, new eqe(vfa.a));
                ConfirmationBottomSheet confirmationBottomSheetE2 = lg3VarE2.e();
                confirmationBottomSheetE2.setTargetController(inviteByPhoneScreen);
                ?? parentController2 = inviteByPhoneScreen;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                foc focVar2 = parentController2 instanceof foc ? (foc) parentController2 : null;
                znc zncVarT2 = focVar2 != null ? focVar2.T() : null;
                confirmationBottomSheetE2.z0(inviteByPhoneScreen);
                if (zncVarT2 != null) {
                    coc cocVar2 = new coc(confirmationBottomSheetE2, null, null, null, false, -1);
                    wg0.l(false, cocVar2, true, "BottomSheetWidget");
                    zncVarT2.G(cocVar2);
                }
            } else {
                if (k57Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                InviteByPhoneScreen.m0(inviteByPhoneScreen, null);
            }
        }
        return e5f.a;
    }
}
