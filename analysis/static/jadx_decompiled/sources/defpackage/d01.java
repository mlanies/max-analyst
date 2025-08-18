package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* loaded from: classes.dex */
public final class d01 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallAdminSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d01(Continuation continuation, CallAdminSettingsScreen callAdminSettingsScreen) {
        super(2, continuation);
        this.Y = callAdminSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        d01 d01Var = (d01) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        d01Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        d01 d01Var = new d01(continuation, this.Y);
        d01Var.X = obj;
        return d01Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        boolean z = wm9Var instanceof pj1;
        int i = 0;
        CallAdminSettingsScreen callAdminSettingsScreen = this.Y;
        if (z) {
            bc7[] bc7VarArr = BottomSheetWidget.x0;
            RecordExitBottomSheet recordExitBottomSheet = new RecordExitBottomSheet(ccc.b, Boolean.FALSE);
            recordExitBottomSheet.setTargetController(callAdminSettingsScreen);
            uu3 parentController = callAdminSettingsScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            znc zncVarT = focVar != null ? focVar.T() : null;
            recordExitBottomSheet.z0(callAdminSettingsScreen);
            if (zncVarT != null) {
                coc cocVar = new coc(recordExitBottomSheet, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        } else if (wm9Var instanceof uj1) {
            bc7[] bc7VarArr2 = CallAdminSettingsScreen.t0;
            ((tnd) callAdminSettingsScreen.Y.getValue()).getClass();
            tnd.b(dj1.a, new s25((uj1) wm9Var, callAdminSettingsScreen, i, 2));
        }
        return e5f.a;
    }
}
