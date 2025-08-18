package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* loaded from: classes2.dex */
public final class d5e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5e(Continuation continuation, StickersScreen stickersScreen) {
        super(2, continuation);
        this.Y = stickersScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        d5e d5eVar = (d5e) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        d5eVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        d5e d5eVar = new d5e(continuation, this.Y);
        d5eVar.X = obj;
        return d5eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ved vedVar = (ved) this.X;
        bc7[] bc7VarArr = StickersScreen.v0;
        StickersScreen stickersScreen = this.Y;
        stickersScreen.getClass();
        if (vedVar instanceof sed) {
            sed sedVar = (sed) vedVar;
            bc7[] bc7VarArr2 = BottomSheetWidget.x0;
            lg3 lg3VarA = od2.a(sedVar.a, null, 6);
            lg3VarA.f(sedVar.b);
            sedVar.c.forEach(new hk2(new jk2(1, lg3VarA, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 12), 10));
            ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
            confirmationBottomSheetE.setTargetController(stickersScreen);
            uu3 parentController = stickersScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            znc zncVarT = focVar != null ? focVar.T() : null;
            confirmationBottomSheetE.z0(stickersScreen);
            if (zncVarT != null) {
                coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        } else if (vedVar instanceof ued) {
            wha whaVar = new wha(stickersScreen);
            ued uedVar = (ued) vedVar;
            whaVar.e(new kia(uedVar.a));
            CharSequence charSequenceB = uedVar.b.b(stickersScreen.getContext());
            if (charSequenceB == null) {
                charSequenceB = "";
            }
            whaVar.h(charSequenceB);
            whaVar.i();
        }
        return e5f.a;
    }
}
