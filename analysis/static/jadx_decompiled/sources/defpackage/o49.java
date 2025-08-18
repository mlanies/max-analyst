package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o49 extends ffe implements a66 {
    public final /* synthetic */ n59 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o49(n59 n59Var, Continuation continuation) {
        super(2, continuation);
        this.X = n59Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        o49 o49Var = (o49) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        o49Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new o49(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = n59.D1;
        n59 n59Var = this.X;
        wha whaVarC = n59Var.C();
        whaVarC.e(new kia(woc.n));
        whaVarC.g(new eqe(oda.x0));
        n59Var.M(whaVarC);
        whaVarC.i();
        return e5f.a;
    }
}
