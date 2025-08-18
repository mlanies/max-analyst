package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* loaded from: classes.dex */
public final class z91 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallIndicatorWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z91(CallIndicatorWidget callIndicatorWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = callIndicatorWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        z91 z91Var = (z91) n((String) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        z91Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        z91 z91Var = new z91(this.Y, continuation);
        z91Var.X = obj;
        return z91Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        CallIndicatorWidget.m0(this.Y).setTime((String) this.X);
        return e5f.a;
    }
}
