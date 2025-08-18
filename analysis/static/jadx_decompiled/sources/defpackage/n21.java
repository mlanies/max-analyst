package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* loaded from: classes.dex */
public final class n21 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallBottomPanelWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n21(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.Y = callBottomPanelWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        n21 n21Var = (n21) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        n21Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        n21 n21Var = new n21(continuation, this.Y);
        n21Var.X = obj;
        return n21Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int iIntValue = ((Number) this.X).intValue();
        bc7[] bc7VarArr = CallBottomPanelWidget.s0;
        this.Y.m0().setChatUnreadMessageCount(iIntValue);
        return e5f.a;
    }
}
