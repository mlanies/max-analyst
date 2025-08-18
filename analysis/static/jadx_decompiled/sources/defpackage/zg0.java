package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zg0 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ bh0 Y;
    public final /* synthetic */ je7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg0(bh0 bh0Var, je7 je7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = bh0Var;
        this.Z = je7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        zg0 zg0Var = (zg0) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zg0Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zg0 zg0Var = new zg0(this.Y, this.Z, continuation);
        zg0Var.X = ((Boolean) obj).booleanValue();
        return zg0Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean z = this.X;
        bc7[] bc7VarArr = bh0.u0;
        bh0 bh0Var = this.Y;
        vxd vxdVarS = j47.S(bh0Var.a, ((w9a) bh0Var.b).b(), vx3.b, new yg0(bh0Var, this.Z, z, null));
        bh0Var.t0.o1(bh0Var, bh0.u0[0], vxdVarS);
        return e5f.a;
    }
}
