package defpackage;

import android.content.ActivityNotFoundException;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.SettingsListScreen;

/* loaded from: classes2.dex */
public final class hgd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsListScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgd(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = settingsListScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hgd) n((wm9) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hgd hgdVar = new hgd(this.Y, continuation);
        hgdVar.X = obj;
        return hgdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        boolean z = wm9Var instanceof wgd;
        e5f e5fVar = e5f.a;
        if (z) {
            cgd.c.P1().b(ey8.i(((wgd) wm9Var).b, ":profile/edit?id=", "&type=contact"), null);
        } else if (wm9Var instanceof xgd) {
            cgd.c.P1().b(ey8.i(((xgd) wm9Var).b, ":profile/avatars?id=", "&type=contact"), null);
        } else {
            boolean zF = tpa.f(wm9Var, tgd.b);
            SettingsListScreen settingsListScreen = this.Y;
            if (zF) {
                bc7[] bc7VarArr = SettingsListScreen.B0;
                settingsListScreen.getClass();
                bc7[] bc7VarArr2 = BottomSheetWidget.x0;
                lg3 lg3VarE = wg0.e(mha.s, 6, null);
                lg3VarE.a(new mg3(lha.d, new eqe(mha.v), 3, false));
                lg3VarE.a(new mg3(lha.c, new eqe(mha.u), 3, false));
                lg3VarE.a(new mg3(lha.b, new eqe(mha.t), 3, false));
                lg3VarE.a(new mg3(lha.a, new eqe(mha.p), 2, false));
                ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
                confirmationBottomSheetE.setTargetController(settingsListScreen);
                uu3 parentController = settingsListScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                znc zncVarT = focVar != null ? focVar.T() : null;
                confirmationBottomSheetE.z0(settingsListScreen);
                if (zncVarT != null) {
                    coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                }
            } else if (tpa.f(wm9Var, ugd.b)) {
                bc7[] bc7VarArr3 = SettingsListScreen.B0;
                ((eua) settingsListScreen.v0.getValue()).g(new l5g(settingsListScreen, 1));
            } else if (wm9Var instanceof vgd) {
                settingsListScreen.startActivityForResult(((vgd) wm9Var).b, 666);
            } else if (wm9Var instanceof ygd) {
                try {
                    settingsListScreen.startActivityForResult(((ygd) wm9Var).b, 333);
                    an9.g((an9) settingsListScreen.w0.getValue(), wuc.AVATAR_PICKER_CAMERA);
                } catch (ActivityNotFoundException unused) {
                    hm9.p(settingsListScreen.getClass().getName(), "failed open camera", null);
                    settingsListScreen.q0().v();
                }
            } else if (tpa.f(wm9Var, zgd.b)) {
                cgd.c.P1().b(":media-picker/select/photo", null);
            } else if (wm9Var instanceof ahd) {
                ahd ahdVar = (ahd) wm9Var;
                CharSequence charSequenceB = ahdVar.b.b(settingsListScreen.getContext());
                if (charSequenceB == null) {
                    return e5fVar;
                }
                wha whaVar = (wha) settingsListScreen.u0.getValue();
                whaVar.h(charSequenceB);
                Integer num = ahdVar.c;
                whaVar.e(num != null ? new kia(num.intValue()) : lia.a);
                whaVar.i();
            } else if (wm9Var instanceof c64) {
                cgd.c.R1((c64) wm9Var);
            }
        }
        return e5fVar;
    }
}
