package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* loaded from: classes.dex */
public final class y91 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallIndicatorWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y91(CallIndicatorWidget callIndicatorWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = callIndicatorWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        y91 y91Var = (y91) n((m91) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        y91Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        y91 y91Var = new y91(this.Y, continuation);
        y91Var.X = obj;
        return y91Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        m91 m91Var = (m91) this.X;
        o91 o91VarM0 = CallIndicatorWidget.m0(this.Y);
        o91VarM0.setTitle(m91Var.a);
        o91VarM0.setIndicatorState(m91Var.b);
        return e5f.a;
    }
}
