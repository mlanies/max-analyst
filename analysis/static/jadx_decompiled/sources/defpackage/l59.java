package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l59 extends ffe implements a66 {
    public final /* synthetic */ n59 X;
    public final /* synthetic */ ta3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l59(n59 n59Var, ua3 ua3Var, Continuation continuation) {
        super(2, continuation);
        this.X = n59Var;
        this.Y = ua3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        l59 l59Var = (l59) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        l59Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new l59(this.X, (ua3) this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = n59.D1;
        n59 n59Var = this.X;
        wha whaVarC = n59Var.C();
        whaVarC.e(nia.a);
        whaVarC.g(new eqe(oda.m0));
        whaVarC.f(new sia(new eqe(oda.n0)));
        whaVarC.d(new yt8(4, (ua3) this.Y));
        n59Var.M(whaVarC);
        whaVarC.i();
        return e5f.a;
    }
}
