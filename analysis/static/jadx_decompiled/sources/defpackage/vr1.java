package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vr1 extends ffe implements a66 {
    public final /* synthetic */ wr1 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr1(wr1 wr1Var, Continuation continuation) {
        super(2, continuation);
        this.X = wr1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        vr1 vr1Var = (vr1) n((fqa) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        vr1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vr1(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = wr1.K;
        wr1 wr1Var = this.X;
        bt1 bt1VarM = wr1Var.m();
        String str = wr1Var.j().c;
        boolean z = wr1Var.j().h;
        bt1VarM.getClass();
        bt1.c(bt1VarM, "BAD_CONNECTION_ALERT", str, "BAD_NETWORK", null, null, null, z, 56);
        return e5f.a;
    }
}
