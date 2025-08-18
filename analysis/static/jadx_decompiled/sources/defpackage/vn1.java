package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* loaded from: classes.dex */
public final class vn1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallTopPanelWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn1(Continuation continuation, CallTopPanelWidget callTopPanelWidget) {
        super(2, continuation);
        this.Y = callTopPanelWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        vn1 vn1Var = (vn1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        vn1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vn1 vn1Var = new vn1(continuation, this.Y);
        vn1Var.X = obj;
        return vn1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int iIntValue = ((Number) this.X).intValue();
        bc7[] bc7VarArr = CallTopPanelWidget.o;
        this.Y.m0().setAddUserCount(iIntValue);
        return e5f.a;
    }
}
