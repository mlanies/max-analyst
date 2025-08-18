package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class f79 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n79 Z;
    public final /* synthetic */ je7 s0;
    public final /* synthetic */ je7 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f79(je7 je7Var, je7 je7Var2, n79 n79Var, Continuation continuation) {
        super(2, continuation);
        this.Z = n79Var;
        this.s0 = je7Var;
        this.t0 = je7Var2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((f79) n((kua) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        f79 f79Var = new f79(this.s0, this.t0, this.Z, continuation);
        f79Var.Y = obj;
        return f79Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        n79 n79Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            kua kuaVar = (kua) this.Y;
            q0e q0eVar = n79Var.v0;
            this.X = 1;
            q0eVar.setValue(kuaVar);
            if (e5fVar == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        j47.T(n79Var.u0, null, null, new e79(this.s0, this.t0, n79Var, null), 3);
        return e5fVar;
    }
}
