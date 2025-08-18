package defpackage;

import android.content.Intent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.stickerssettings.StickersSettingsScreen;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class o6e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6e(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.Y = stickersSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        o6e o6eVar = (o6e) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        o6eVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        o6e o6eVar = new o6e(continuation, this.Y);
        o6eVar.X = obj;
        return o6eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ved vedVar = (ved) this.X;
        bc7[] bc7VarArr = StickersSettingsScreen.Y;
        StickersSettingsScreen stickersSettingsScreen = this.Y;
        stickersSettingsScreen.getClass();
        if (vedVar instanceof ted) {
            dy7.c(2).I(((ted) vedVar).a).d0().build().q(stickersSettingsScreen);
        } else {
            if (vedVar instanceof qed) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", ((qed) vedVar).a);
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                coc cocVar = (coc) x53.q0(stickersSettingsScreen.getRouter().e());
                l6e.c.Z1(intent, cocVar != null ? cocVar.b : null);
            } else if (vedVar instanceof red) {
                String str = o37.a;
                o37.d(stickersSettingsScreen.getContext(), ((red) vedVar).a, null);
            } else if (vedVar instanceof sed) {
                sed sedVar = (sed) vedVar;
                bc7[] bc7VarArr2 = BottomSheetWidget.x0;
                lg3 lg3VarA = od2.a(sedVar.a, null, 6);
                lg3VarA.f(sedVar.b);
                sedVar.c.forEach(new hk2(new jk2(1, lg3VarA, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 13), 11));
                ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
                confirmationBottomSheetE.setTargetController(stickersSettingsScreen);
                uu3 parentController = stickersSettingsScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                znc zncVarT = focVar != null ? focVar.T() : null;
                confirmationBottomSheetE.z0(stickersSettingsScreen);
                if (zncVarT != null) {
                    coc cocVar2 = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                    wg0.l(false, cocVar2, true, "BottomSheetWidget");
                    zncVarT.G(cocVar2);
                }
            } else {
                if (!(vedVar instanceof ued)) {
                    throw new NoWhenBranchMatchedException();
                }
                wha whaVar = new wha(stickersSettingsScreen);
                ued uedVar = (ued) vedVar;
                whaVar.e(new kia(uedVar.a));
                CharSequence charSequenceB = uedVar.b.b(stickersSettingsScreen.getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                whaVar.h(charSequenceB);
                whaVar.i();
            }
        }
        return e5f.a;
    }
}
