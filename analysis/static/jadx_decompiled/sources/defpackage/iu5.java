package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class iu5 extends ffe implements a66 {
    public final /* synthetic */ nu5 X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu5(nu5 nu5Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = nu5Var;
        this.Y = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        iu5 iu5Var = (iu5) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        iu5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new iu5(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = nu5.D0;
        this.X.s(this.Y);
        return e5f.a;
    }
}
