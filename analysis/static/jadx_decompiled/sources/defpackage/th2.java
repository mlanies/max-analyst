package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class th2 extends ffe implements a66 {
    public final /* synthetic */ gi2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th2(gi2 gi2Var, Continuation continuation) {
        super(2, continuation);
        this.X = gi2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((th2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new th2(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = gi2.R0;
        wha whaVar = (wha) this.X.x0.getValue();
        whaVar.g(new eqe(yea.U1));
        whaVar.e(new kia(woc.n));
        return whaVar.i();
    }
}
