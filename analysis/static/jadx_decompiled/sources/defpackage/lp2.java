package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class lp2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ rq2 Z;
    public final /* synthetic */ cz5 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp2(long j, rq2 rq2Var, cz5 cz5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = rq2Var;
        this.s0 = cz5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((lp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new lp2(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        rq2 rq2Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            lu0 lu0VarQ = rq2.q(rq2Var);
            this.X = 1;
            obj = zo2.d.c(this.Y, 1, lu0VarQ, this.s0, false, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        pnf.o(rq2Var.b1, (zo2) obj);
        return e5f.a;
    }
}
