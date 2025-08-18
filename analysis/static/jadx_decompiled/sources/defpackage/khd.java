package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class khd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsPrivacyScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khd(Continuation continuation, SettingsPrivacyScreen settingsPrivacyScreen) {
        super(2, continuation);
        this.Y = settingsPrivacyScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        khd khdVar = (khd) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        khdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        khd khdVar = new khd(continuation, this.Y);
        khdVar.X = obj;
        return khdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [uu3] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        znc zncVarT;
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        boolean z = wm9Var instanceof aed;
        SettingsPrivacyScreen settingsPrivacyScreen = this.Y;
        if (z) {
            aed aedVar = (aed) wm9Var;
            bc7[] bc7VarArr = SettingsPrivacyScreen.Z;
            settingsPrivacyScreen.getClass();
            bc7[] bc7VarArr2 = BottomSheetWidget.x0;
            jqe jqeVar = aedVar.b;
            Bundle bundle = new Bundle();
            bundle.putParcelable("title", jqeVar);
            bundle.putBundle(ApiProtocol.PARAM_PAYLOAD, null);
            wuc wucVar = aedVar.d;
            if (wucVar != null) {
                bundle.putString("stat_screen", wucVar.name());
            }
            for (zdd zddVar : aedVar.c) {
                boolean z2 = zddVar.c;
                jqe jqeVar2 = zddVar.a;
                int i = zddVar.b;
                if (z2) {
                    ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
                    if (parcelableArrayList == null) {
                        parcelableArrayList = new ArrayList<>();
                    }
                    parcelableArrayList.add(new mg3(i, jqeVar2, 1, false));
                    bundle.putParcelableArrayList("buttons", parcelableArrayList);
                } else {
                    ArrayList<? extends Parcelable> parcelableArrayList2 = bundle.getParcelableArrayList("buttons");
                    if (parcelableArrayList2 == null) {
                        parcelableArrayList2 = new ArrayList<>();
                    }
                    parcelableArrayList2.add(new mg3(i, jqeVar2, 3, false));
                    bundle.putParcelableArrayList("buttons", parcelableArrayList2);
                }
            }
            ConfirmationBottomSheet confirmationBottomSheet = new ConfirmationBottomSheet(bundle);
            confirmationBottomSheet.setTargetController(settingsPrivacyScreen);
            ?? parentController = settingsPrivacyScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            zncVarT = focVar != null ? focVar.T() : null;
            confirmationBottomSheet.z0(settingsPrivacyScreen);
            if (zncVarT != null) {
                coc cocVar = new coc(confirmationBottomSheet, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        } else if (wm9Var instanceof c64) {
            ihd.c.R1((c64) wm9Var);
        } else if (wm9Var instanceof bed) {
            wha whaVar = new wha(settingsPrivacyScreen);
            whaVar.g(((bed) wm9Var).b);
            whaVar.i();
        } else if (wm9Var instanceof ydd) {
            EnterPinCodeScreen enterPinCodeScreen = new EnterPinCodeScreen();
            enterPinCodeScreen.setTargetController(settingsPrivacyScreen);
            settingsPrivacyScreen.getRouter().G(i24.e(enterPinCodeScreen, new mcf(), new mcf()));
        } else if (wm9Var instanceof xdd) {
            bc7[] bc7VarArr3 = BottomSheetWidget.x0;
            ChangeDisabledDialog changeDisabledDialog = new ChangeDisabledDialog();
            changeDisabledDialog.setTargetController(settingsPrivacyScreen);
            ?? parentController2 = settingsPrivacyScreen;
            while (parentController2.getParentController() != null) {
                parentController2 = parentController2.getParentController();
            }
            foc focVar2 = parentController2 instanceof foc ? (foc) parentController2 : null;
            zncVarT = focVar2 != null ? focVar2.T() : null;
            changeDisabledDialog.z0(settingsPrivacyScreen);
            if (zncVarT != null) {
                coc cocVar2 = new coc(changeDisabledDialog, null, null, null, false, -1);
                wg0.l(false, cocVar2, true, "change-disabled");
                zncVarT.G(cocVar2);
            }
        }
        bc7[] bc7VarArr4 = SettingsPrivacyScreen.Z;
        settingsPrivacyScreen.m0().L0.f();
        return e5f.a;
    }
}
