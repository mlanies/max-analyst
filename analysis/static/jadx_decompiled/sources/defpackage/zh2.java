package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zh2 extends ffe implements a66 {
    public final /* synthetic */ l20 X;
    public final /* synthetic */ gi2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh2(l20 l20Var, gi2 gi2Var, Continuation continuation) {
        super(2, continuation);
        this.X = l20Var;
        this.Y = gi2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zh2 zh2Var = (zh2) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zh2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zh2(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int i = this.X.d() ? yea.R1 : yea.S1;
        bc7[] bc7VarArr = gi2.R0;
        wha whaVar = (wha) this.Y.x0.getValue();
        whaVar.g(new eqe(i));
        whaVar.e(new kia(woc.n));
        whaVar.i();
        return e5f.a;
    }
}
