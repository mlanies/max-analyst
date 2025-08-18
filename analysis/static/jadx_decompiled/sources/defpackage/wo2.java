package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wo2 extends ffe implements a66 {
    public final /* synthetic */ rq2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo2(rq2 rq2Var, Continuation continuation) {
        super(2, continuation);
        this.X = rq2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        wo2 wo2Var = (wo2) n((aj5) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        wo2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wo2(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        pnf.o(this.X.b1, new ep2(u8a.m, new Integer(u8a.l), null, 4));
        return e5f.a;
    }
}
