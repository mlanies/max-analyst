package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.media.ui.SettingMediaScreen;

/* loaded from: classes2.dex */
public final class cdd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingMediaScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdd(Continuation continuation, SettingMediaScreen settingMediaScreen) {
        super(2, continuation);
        this.Y = settingMediaScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        cdd cddVar = (cdd) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        cddVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        cdd cddVar = new cdd(continuation, this.Y);
        cddVar.X = obj;
        return cddVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof sgd) {
            sgd sgdVar = (sgd) wm9Var;
            bc7[] bc7VarArr = SettingMediaScreen.Y;
            SettingMediaScreen settingMediaScreen = this.Y;
            settingMediaScreen.getClass();
            bc7[] bc7VarArr2 = BottomSheetWidget.x0;
            lg3 lg3VarA = od2.a(sgdVar.b, null, 4);
            for (rgd rgdVar : sgdVar.c) {
                boolean z = rgdVar.c;
                jqe jqeVar = rgdVar.a;
                int i = rgdVar.b;
                if (z) {
                    lg3VarA.b(i, (eqe) jqeVar);
                } else {
                    lg3VarA.d(i, (eqe) jqeVar);
                }
            }
            ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
            confirmationBottomSheetE.setTargetController(settingMediaScreen);
            uu3 parentController = settingMediaScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            znc zncVarT = focVar != null ? focVar.T() : null;
            confirmationBottomSheetE.z0(settingMediaScreen);
            if (zncVarT != null) {
                coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        } else if (wm9Var instanceof c64) {
            bdd.c.R1((c64) wm9Var);
        } else if (wm9Var instanceof qgd) {
            bdd.c.P1().b(":settings/caching", null);
        }
        return e5f.a;
    }
}
