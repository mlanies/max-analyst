package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class rbc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ lsf Y;
    public final /* synthetic */ RecordControlsWidget Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbc(Continuation continuation, lsf lsfVar, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = lsfVar;
        this.Z = recordControlsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rbc rbcVar = (rbc) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rbcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rbc rbcVar = new rbc(continuation, this.Y, this.Z);
        rbcVar.X = obj;
        return rbcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        zl7 zl7Var = (zl7) this.X;
        bc7[] bc7VarArr = RecordControlsWidget.b1;
        this.Y.d((Long) this.Z.I0().x0.a.getValue(), zl7Var);
        return e5f.a;
    }
}
