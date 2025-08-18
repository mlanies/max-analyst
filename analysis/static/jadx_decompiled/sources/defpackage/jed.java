package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;

/* loaded from: classes2.dex */
public final class jed extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsBlacklistScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jed(Continuation continuation, SettingsBlacklistScreen settingsBlacklistScreen) {
        super(2, continuation);
        this.Y = settingsBlacklistScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jed jedVar = (jed) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jedVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jed jedVar = new jed(continuation, this.Y);
        jedVar.X = obj;
        return jedVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof c64) {
            ihd.c.R1((c64) wm9Var);
        } else {
            boolean z = wm9Var instanceof aed;
            SettingsBlacklistScreen settingsBlacklistScreen = this.Y;
            if (z) {
                aed aedVar = (aed) wm9Var;
                bc7[] bc7VarArr = SettingsBlacklistScreen.Z;
                settingsBlacklistScreen.getClass();
                bc7[] bc7VarArr2 = BottomSheetWidget.x0;
                lg3 lg3VarA = od2.a(aedVar.b, aedVar.e, 4);
                for (zdd zddVar : aedVar.c) {
                    boolean z2 = zddVar.c;
                    jqe jqeVar = zddVar.a;
                    int i = zddVar.b;
                    if (z2) {
                        lg3VarA.d(i, (eqe) jqeVar);
                    } else {
                        lg3VarA.c(i, (eqe) jqeVar);
                    }
                }
                ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
                confirmationBottomSheetE.setTargetController(settingsBlacklistScreen);
                uu3 parentController = settingsBlacklistScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                znc zncVarT = focVar != null ? focVar.T() : null;
                confirmationBottomSheetE.z0(settingsBlacklistScreen);
                if (zncVarT != null) {
                    coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                }
            } else if (wm9Var instanceof bed) {
                wha whaVar = new wha(settingsBlacklistScreen);
                whaVar.g(((bed) wm9Var).b);
                whaVar.i();
            } else if (wm9Var instanceof ced) {
                wha whaVar2 = new wha(settingsBlacklistScreen);
                whaVar2.e(new kia(hha.b));
                whaVar2.g(((ced) wm9Var).b);
                whaVar2.i();
            }
        }
        return e5f.a;
    }
}
