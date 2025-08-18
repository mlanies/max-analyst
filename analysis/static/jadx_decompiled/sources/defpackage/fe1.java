package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fe1 extends ffe implements a66 {
    public final /* synthetic */ ie1 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe1(ie1 ie1Var, Continuation continuation) {
        super(2, continuation);
        this.X = ie1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fe1 fe1Var = (fe1) n((wvc) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fe1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fe1(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        pnf.o(this.X.u0, cj1.D);
        return e5f.a;
    }
}
