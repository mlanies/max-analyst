package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* loaded from: classes.dex */
public final class m21 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallBottomPanelWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m21(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.Y = callBottomPanelWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        m21 m21Var = (m21) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        m21Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        m21 m21Var = new m21(continuation, this.Y);
        m21Var.X = obj;
        return m21Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (((Boolean) this.X).booleanValue()) {
            bc7[] bc7VarArr = CallBottomPanelWidget.s0;
            CallBottomPanelWidget callBottomPanelWidget = this.Y;
            callBottomPanelWidget.m0().a();
            rt3 rt3Var = callBottomPanelWidget.Y;
            if (rt3Var != null) {
                rt3Var.dismiss();
            }
            callBottomPanelWidget.Y = null;
        }
        return e5f.a;
    }
}
