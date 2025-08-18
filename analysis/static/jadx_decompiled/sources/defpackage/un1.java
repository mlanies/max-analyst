package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* loaded from: classes.dex */
public final class un1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallTopPanelWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un1(Continuation continuation, CallTopPanelWidget callTopPanelWidget) {
        super(2, continuation);
        this.Y = callTopPanelWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        un1 un1Var = (un1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        un1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        un1 un1Var = new un1(continuation, this.Y);
        un1Var.X = obj;
        return un1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        dxe dxeVar = (dxe) this.X;
        bc7[] bc7VarArr = CallTopPanelWidget.o;
        on1 on1VarM0 = this.Y.m0();
        on1VarM0.setVisibility(dxeVar.d ? 0 : 8);
        if (on1VarM0.getVisibility() == 0) {
            on1VarM0.setMode(dxeVar.c);
            on1VarM0.c(dxeVar.e);
            on1VarM0.d(dxeVar.f, dxeVar.i);
            on1VarM0.setMoreState(dxeVar.g);
            on1VarM0.setAddUserState(dxeVar.h);
            on1VarM0.e(dxeVar.b);
        }
        return e5f.a;
    }
}
