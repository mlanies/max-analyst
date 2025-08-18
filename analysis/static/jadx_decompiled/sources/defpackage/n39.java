package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n39 extends ffe implements a66 {
    public final /* synthetic */ n59 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n39(n59 n59Var, Continuation continuation) {
        super(2, continuation);
        this.X = n59Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        n39 n39Var = (n39) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        n39Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new n39(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        i00 i00Var = this.X.z0;
        vxd vxdVarL = od2.L(new zn5(new t03(i00Var.a.c, 11), new h00(i00Var, null), 5), i00Var.c);
        i00Var.d.o1(i00Var, i00.f[0], vxdVarL);
        return e5f.a;
    }
}
