package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* loaded from: classes2.dex */
public final class m25 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ EnterPinCodeScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m25(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.Y = enterPinCodeScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        m25 m25Var = (m25) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        m25Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        m25 m25Var = new m25(continuation, this.Y);
        m25Var.X = obj;
        return m25Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = BottomSheetWidget.x0;
        ForgotPinCodeDialog forgotPinCodeDialog = new ForgotPinCodeDialog();
        EnterPinCodeScreen enterPinCodeScreen = this.Y;
        forgotPinCodeDialog.setTargetController(enterPinCodeScreen);
        uu3 parentController = enterPinCodeScreen;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        foc focVar = parentController instanceof foc ? (foc) parentController : null;
        znc zncVarT = focVar != null ? focVar.T() : null;
        forgotPinCodeDialog.z0(enterPinCodeScreen);
        if (zncVarT != null) {
            coc cocVar = new coc(forgotPinCodeDialog, null, null, null, false, -1);
            wg0.l(false, cocVar, true, "forgot-pin");
            zncVarT.G(cocVar);
        }
        return e5f.a;
    }
}
