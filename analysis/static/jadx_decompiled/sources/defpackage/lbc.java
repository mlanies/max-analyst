package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class lbc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        lbc lbcVar = (lbc) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        lbcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        lbc lbcVar = new lbc(continuation, this.Y);
        lbcVar.X = obj;
        return lbcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        uac uacVar = (uac) this.X;
        bc7[] bc7VarArr = RecordControlsWidget.b1;
        RecordControlsWidget recordControlsWidget = this.Y;
        View viewF0 = recordControlsWidget.F0();
        cc1 cc1Var = new cc1(uacVar, 4, recordControlsWidget);
        if (viewF0.isLaidOut()) {
            cc1Var.invoke();
        } else if (!viewF0.isLaidOut() || viewF0.isLayoutRequested()) {
            viewF0.addOnLayoutChangeListener(new qq0(11, cc1Var));
        } else {
            cc1Var.invoke();
        }
        return e5f.a;
    }
}
