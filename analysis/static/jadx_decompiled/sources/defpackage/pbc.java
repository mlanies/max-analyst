package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class pbc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        pbc pbcVar = (pbc) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        pbcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        pbc pbcVar = new pbc(continuation, this.Y);
        pbcVar.X = obj;
        return pbcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (!tpa.f((cac) this.X, cac.a)) {
            throw new NoWhenBranchMatchedException();
        }
        bc7[] bc7VarArr = RecordControlsWidget.b1;
        cbc cbcVarI0 = this.Y.I0();
        if (cbcVarI0.v0.getValue() instanceof sac) {
            cbcVarI0.z();
        }
        pnf.o(cbcVarI0.A0, pac.a);
        return e5f.a;
    }
}
