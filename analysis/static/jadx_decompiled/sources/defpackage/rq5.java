package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rq5 extends ffe implements a66 {
    public final /* synthetic */ xm7 X;
    public final /* synthetic */ g2a Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq5(xm7 xm7Var, gu1 gu1Var, Continuation continuation) {
        super(2, continuation);
        this.X = xm7Var;
        this.Y = gu1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rq5 rq5Var = (rq5) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rq5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rq5(this.X, (gu1) this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.X.f(this.Y);
        return e5f.a;
    }
}
