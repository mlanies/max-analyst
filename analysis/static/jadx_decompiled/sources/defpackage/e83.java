package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e83 extends ffe implements a66 {
    public final /* synthetic */ m83 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e83(m83 m83Var, Continuation continuation) {
        super(2, continuation);
        this.X = m83Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        e83 e83Var = (e83) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        e83Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new e83(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        m83 m83Var = this.X;
        m83Var.getClass();
        vxd vxdVarT = j47.T(m83Var.k, null, vx3.b, new k83(m83Var, null), 1);
        m83Var.l.o1(m83Var, m83.m[0], vxdVarT);
        return e5f.a;
    }
}
