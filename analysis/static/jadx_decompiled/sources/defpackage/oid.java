package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.storage.ui.SettingsStorageScreen;

/* loaded from: classes2.dex */
public final class oid extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsStorageScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oid(Continuation continuation, SettingsStorageScreen settingsStorageScreen) {
        super(2, continuation);
        this.Y = settingsStorageScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        oid oidVar = (oid) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        oidVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        oid oidVar = new oid(continuation, this.Y);
        oidVar.X = obj;
        return oidVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        boolean z = wm9Var instanceof mid;
        SettingsStorageScreen settingsStorageScreen = this.Y;
        if (z) {
            mid midVar = (mid) wm9Var;
            bc7[] bc7VarArr = SettingsStorageScreen.X;
            settingsStorageScreen.getClass();
            bc7[] bc7VarArr2 = BottomSheetWidget.x0;
            lg3 lg3VarA = od2.a(midVar.b, null, 4);
            jqe jqeVar = midVar.d;
            if (jqeVar != null) {
                lg3VarA.f(jqeVar);
            }
            for (lid lidVar : midVar.c) {
                boolean z2 = lidVar.c;
                jqe jqeVar2 = lidVar.b;
                int i = lidVar.a;
                if (z2) {
                    lg3VarA.b(i, (eqe) jqeVar2);
                } else {
                    lg3VarA.d(i, (eqe) jqeVar2);
                }
            }
            ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
            confirmationBottomSheetE.setTargetController(settingsStorageScreen);
            uu3 parentController = settingsStorageScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            znc zncVarT = focVar != null ? focVar.T() : null;
            confirmationBottomSheetE.z0(settingsStorageScreen);
            if (zncVarT != null) {
                coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        } else if (wm9Var instanceof nid) {
            wha whaVar = new wha(settingsStorageScreen);
            whaVar.g(((nid) wm9Var).b);
            whaVar.e(new kia(gpc.c));
            whaVar.i();
        }
        return e5f.a;
    }
}
