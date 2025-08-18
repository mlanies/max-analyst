package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tg0 extends ffe implements a66 {
    public final /* synthetic */ ug0 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg0(ug0 ug0Var, Continuation continuation) {
        super(2, continuation);
        this.X = ug0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        tg0 tg0Var = (tg0) n((on5) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        tg0Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new tg0(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ug0 ug0Var = this.X;
        ug0Var.a.registerActivityLifecycleCallbacks(ug0Var.f);
        return e5f.a;
    }
}
