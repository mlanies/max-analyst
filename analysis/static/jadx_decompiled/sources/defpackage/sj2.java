package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sj2 extends ffe implements a66 {
    public final /* synthetic */ ck2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj2(ck2 ck2Var, Continuation continuation) {
        super(2, continuation);
        this.X = ck2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sj2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sj2(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = ck2.d1;
        ck2 ck2Var = this.X;
        sb8 sb8VarX = ck2Var.x();
        w7c w7cVar = ck2Var.W0;
        sb8 sb8Var = ((ej2) w7cVar.a.getValue()).a;
        boolean z = sb8VarX instanceof qb8;
        e5f e5fVar = e5f.a;
        kld kldVar = ck2Var.X0;
        if (!z || !tpa.f(sb8Var, sb8VarX)) {
            kldVar.g(Boolean.FALSE);
            return e5fVar;
        }
        ej2 ej2Var = (ej2) w7cVar.a.getValue();
        ej2 ej2Var2 = new ej2((qb8) null, 3);
        q0e q0eVar = ck2Var.V0;
        q0eVar.m(null, ej2Var2);
        q0eVar.setValue(ej2Var);
        kldVar.g(Boolean.TRUE);
        return e5fVar;
    }
}
