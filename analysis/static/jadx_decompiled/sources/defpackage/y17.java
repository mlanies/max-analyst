package defpackage;

import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.phoneutils.SelectCountryBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class y17 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputPhoneScreen b;

    public /* synthetic */ y17(InputPhoneScreen inputPhoneScreen, int i) {
        this.a = i;
        this.b = inputPhoneScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k56
    public final Object invoke() {
        InputPhoneScreen inputPhoneScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = InputPhoneScreen.E0;
                return new x37(inputPhoneScreen.getRouter());
            default:
                bc7[] bc7VarArr2 = InputPhoneScreen.E0;
                bc7[] bc7VarArr3 = BottomSheetWidget.x0;
                SelectCountryBottomSheet selectCountryBottomSheet = new SelectCountryBottomSheet(dy7.g(new kpa("is_narnia_available", Boolean.FALSE)));
                selectCountryBottomSheet.setTargetController(inputPhoneScreen);
                uu3 parentController = inputPhoneScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                znc zncVarT = focVar != null ? focVar.T() : null;
                selectCountryBottomSheet.z0(inputPhoneScreen);
                if (zncVarT != null) {
                    coc cocVar = new coc(selectCountryBottomSheet, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                }
                return e5f.a;
        }
    }
}
