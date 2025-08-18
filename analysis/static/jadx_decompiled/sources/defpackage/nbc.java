package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class nbc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        nbc nbcVar = (nbc) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        nbcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        nbc nbcVar = new nbc(continuation, this.Y);
        nbcVar.X = obj;
        return nbcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        qac qacVar = (qac) this.X;
        boolean zF = tpa.f(qacVar, oac.a);
        RecordControlsWidget recordControlsWidget = this.Y;
        if (zF) {
            bc7[] bc7VarArr = RecordControlsWidget.b1;
            eua euaVar = (eua) recordControlsWidget.o.getValue();
            String[] strArr = eua.h;
            boolean zB = euaVar.b(strArr);
            je7 je7Var = recordControlsWidget.o;
            if (!zB) {
                eua euaVar2 = (eua) je7Var.getValue();
                l5g l5gVar = new l5g(recordControlsWidget, 1);
                int i = oga.c;
                euaVar2.getClass();
                int i2 = j1c.permissions_audio_title;
                int i3 = oga.g;
                if (eua.i(l5gVar, strArr)) {
                    l5gVar.c(strArr, 160, i2, i, i3);
                } else {
                    euaVar2.f(l5gVar, strArr, 160);
                }
            }
            if (!((eua) je7Var.getValue()).b(eua.l)) {
                ((eua) je7Var.getValue()).h(new l5g(recordControlsWidget, 1));
            }
        } else {
            if (!tpa.f(qacVar, pac.a)) {
                throw new NoWhenBranchMatchedException();
            }
            bc7[] bc7VarArr2 = RecordControlsWidget.b1;
            recordControlsWidget.getClass();
            bc7[] bc7VarArr3 = BottomSheetWidget.x0;
            lg3 lg3VarE = wg0.e(mga.d, 6, null);
            lg3VarE.f(new eqe(mga.c));
            lg3VarE.a(new mg3(1, new eqe(mga.a), 3, false));
            lg3VarE.a(new mg3(2, new eqe(mga.b), 2, false));
            ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
            confirmationBottomSheetE.setTargetController(recordControlsWidget);
            uu3 parentController = recordControlsWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            znc zncVarT = focVar != null ? focVar.T() : null;
            confirmationBottomSheetE.z0(recordControlsWidget);
            if (zncVarT != null) {
                coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        }
        return e5f.a;
    }
}
