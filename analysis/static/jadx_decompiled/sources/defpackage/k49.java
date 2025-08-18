package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k49 extends ffe implements a66 {
    public final /* synthetic */ n59 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k49(n59 n59Var, Continuation continuation) {
        super(2, continuation);
        this.X = n59Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        k49 k49Var = (k49) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        k49Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new k49(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        n59.u(this.X);
        return e5f.a;
    }
}
