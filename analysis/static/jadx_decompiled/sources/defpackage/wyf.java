package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class wyf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppRootScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyf(Continuation continuation, WebAppRootScreen webAppRootScreen) {
        super(2, continuation);
        this.Y = webAppRootScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        wyf wyfVar = (wyf) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        wyfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wyf wyfVar = new wyf(continuation, this.Y);
        wyfVar.X = obj;
        return wyfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [uu3] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        znc zncVarT;
        od2.a0(obj);
        rtf rtfVar = (rtf) this.X;
        bc7[] bc7VarArr = WebAppRootScreen.G0;
        WebAppRootScreen webAppRootScreen = this.Y;
        webAppRootScreen.getClass();
        if (rtfVar instanceof ntf) {
            bwf bwfVar = webAppRootScreen.z0;
            if (bwfVar != null) {
                ntf ntfVar = (ntf) rtfVar;
                bwfVar.e(ntfVar.c, ntfVar.a, ntfVar.b);
            }
        } else {
            if (tpa.f(rtfVar, otf.a)) {
                zxf zxfVar = zxf.c;
                bc7 bc7Var = WebAppRootScreen.G0[1];
                long jLongValue = ((Number) webAppRootScreen.t0.a(webAppRootScreen)).longValue();
                zxfVar.P1().d();
                zxfVar.P1().b(":settings/webapp?bot_id=" + jLongValue, null);
            } else if (rtfVar instanceof ptf) {
                Bundle bundleG = zr6.g(4, "dialog_id");
                bc7[] bc7VarArr2 = BottomSheetWidget.x0;
                ptf ptfVar = (ptf) rtfVar;
                lg3 lg3VarA = od2.a(ptfVar.a, bundleG, 4);
                lg3VarA.f(ptfVar.b);
                lg3VarA.a.putInt("icon", woc.A);
                ptfVar.c.forEach(new hk2(new jk2(1, lg3VarA, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 14), 12));
                ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
                confirmationBottomSheetE.setTargetController(webAppRootScreen);
                ?? parentController = webAppRootScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                zncVarT = focVar != null ? focVar.T() : null;
                confirmationBottomSheetE.z0(webAppRootScreen);
                if (zncVarT != null) {
                    coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                }
            } else {
                if (!(rtfVar instanceof qtf)) {
                    throw new NoWhenBranchMatchedException();
                }
                Bundle bundleG2 = zr6.g(5, "dialog_id");
                bc7[] bc7VarArr3 = BottomSheetWidget.x0;
                qtf qtfVar = (qtf) rtfVar;
                lg3 lg3VarA2 = od2.a(qtfVar.a, bundleG2, 4);
                qtfVar.b.forEach(new hk2(new jk2(1, lg3VarA2, lg3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 15), 13));
                ConfirmationBottomSheet confirmationBottomSheetE2 = lg3VarA2.e();
                confirmationBottomSheetE2.setTargetController(webAppRootScreen);
                ?? parentController2 = webAppRootScreen;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                foc focVar2 = parentController2 instanceof foc ? (foc) parentController2 : null;
                zncVarT = focVar2 != null ? focVar2.T() : null;
                confirmationBottomSheetE2.z0(webAppRootScreen);
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
