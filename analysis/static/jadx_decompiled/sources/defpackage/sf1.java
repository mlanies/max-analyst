package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* loaded from: classes.dex */
public final class sf1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallOpponentsListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf1(Continuation continuation, CallOpponentsListWidget callOpponentsListWidget) {
        super(2, continuation);
        this.Y = callOpponentsListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sf1 sf1Var = (sf1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sf1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sf1 sf1Var = new sf1(continuation, this.Y);
        sf1Var.X = obj;
        return sf1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        na naVar = (na) this.X;
        bc7[] bc7VarArr = CallOpponentsListWidget.H0;
        CallOpponentsListWidget callOpponentsListWidget = this.Y;
        callOpponentsListWidget.getClass();
        ft.g((TextView) callOpponentsListWidget.z0.T0(callOpponentsListWidget, CallOpponentsListWidget.H0[7]), !naVar.b.isEmpty(), 0L, null, 6);
        ((ja) callOpponentsListWidget.E0.getValue()).E(naVar.b);
        return e5f.a;
    }
}
