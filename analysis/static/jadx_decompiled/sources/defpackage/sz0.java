package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sz0 extends ffe implements a66 {
    public final /* synthetic */ yz0 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(yz0 yz0Var, Continuation continuation) {
        super(2, continuation);
        this.X = yz0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sz0 sz0Var = (sz0) n((mm3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sz0Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sz0(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = yz0.G0;
        this.X.l();
        return e5f.a;
    }
}
