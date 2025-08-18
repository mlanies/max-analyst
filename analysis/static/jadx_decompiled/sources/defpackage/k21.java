package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* loaded from: classes.dex */
public final class k21 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallBottomPanelWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k21(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.Y = callBottomPanelWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        k21 k21Var = (k21) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        k21Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        k21 k21Var = new k21(continuation, this.Y);
        k21Var.X = obj;
        return k21Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean zBooleanValue = ((Boolean) this.X).booleanValue();
        CallBottomPanelWidget callBottomPanelWidget = this.Y;
        if (zBooleanValue) {
            bc7[] bc7VarArr = CallBottomPanelWidget.s0;
            callBottomPanelWidget.m0().h();
        } else {
            bc7[] bc7VarArr2 = CallBottomPanelWidget.s0;
            callBottomPanelWidget.m0().c();
        }
        return e5f.a;
    }
}
