package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* loaded from: classes.dex */
public final class uf1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallOpponentsListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf1(Continuation continuation, CallOpponentsListWidget callOpponentsListWidget) {
        super(2, continuation);
        this.Y = callOpponentsListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        uf1 uf1Var = (uf1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        uf1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        uf1 uf1Var = new uf1(continuation, this.Y);
        uf1Var.X = obj;
        return uf1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18, types: [uu3] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25, types: [uu3] */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        znc zncVarT;
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof wj1) {
            wj1 wj1Var = (wj1) wm9Var;
            bc7[] bc7VarArr = CallOpponentsListWidget.H0;
            CallOpponentsListWidget callOpponentsListWidget = this.Y;
            callOpponentsListWidget.getClass();
            if (wj1Var instanceof gj1) {
                bc7[] bc7VarArr2 = BottomSheetWidget.x0;
                ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet = new ConfirmAddOpponentToCallBottomSheet();
                confirmAddOpponentToCallBottomSheet.setTargetController(callOpponentsListWidget);
                ?? parentController = callOpponentsListWidget;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                zncVarT = focVar != null ? focVar.T() : null;
                confirmAddOpponentToCallBottomSheet.z0(callOpponentsListWidget);
                if (zncVarT != null) {
                    coc cocVar = new coc(confirmAddOpponentToCallBottomSheet, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                }
            } else if (wj1Var instanceof kj1) {
                bc7[] bc7VarArr3 = BottomSheetWidget.x0;
                ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = new ConfirmRemoveOpponentToCallBottomSheet(((kj1) wj1Var).D, 0, 2, null);
                confirmRemoveOpponentToCallBottomSheet.setTargetController(callOpponentsListWidget);
                ?? parentController2 = callOpponentsListWidget;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                foc focVar2 = parentController2 instanceof foc ? (foc) parentController2 : null;
                zncVarT = focVar2 != null ? focVar2.T() : null;
                confirmRemoveOpponentToCallBottomSheet.z0(callOpponentsListWidget);
                if (zncVarT != null) {
                    coc cocVar2 = new coc(confirmRemoveOpponentToCallBottomSheet, null, null, null, false, -1);
                    wg0.l(false, cocVar2, true, "BottomSheetWidget");
                    zncVarT.G(cocVar2);
                }
            } else if (wj1Var instanceof aj1) {
                callOpponentsListWidget.getRouter().B(callOpponentsListWidget);
            } else if (wj1Var instanceof qj1) {
                je1.c.Z1(((qj1) wj1Var).D, callOpponentsListWidget.getContext().getString(b8a.O1), CallOpponentsListWidget.class.getName());
            } else if (wj1Var instanceof ej1) {
                tpa.o(callOpponentsListWidget.getContext(), ((ej1) wj1Var).D);
                if (tpa.s()) {
                    String string = callOpponentsListWidget.getContext().getString(f0c.call_link_share_dialog_share_link_copy);
                    wha whaVar = new wha(callOpponentsListWidget);
                    whaVar.h(string);
                    whaVar.d(new ho1(3, null));
                    whaVar.c(new eia(0, 0, 0, 3));
                    whaVar.i();
                }
            } else {
                boolean z = wj1Var instanceof uj1;
                je7 je7Var = callOpponentsListWidget.o;
                if (z) {
                    ((tnd) je7Var.getValue()).getClass();
                    tnd.b(dj1.a, new s25((uj1) wj1Var, callOpponentsListWidget, 0, 2));
                } else if (wj1Var instanceof vj1) {
                    ((tnd) je7Var.getValue()).getClass();
                    tnd.b(dj1.b, new s25(callOpponentsListWidget, (vj1) wj1Var, 0, 1));
                }
            }
        } else if (wm9Var instanceof c64) {
            je1.c.R1((c64) wm9Var);
        }
        return e5f.a;
    }
}
