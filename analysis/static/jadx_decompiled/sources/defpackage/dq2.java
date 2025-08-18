package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dq2 extends ffe implements a66 {
    public rq2 X;
    public s35 Y;
    public int Z;
    public final /* synthetic */ rq2 s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ fif u0;
    public final /* synthetic */ Long v0;
    public final /* synthetic */ cz5 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq2(rq2 rq2Var, long j, fif fifVar, Long l, cz5 cz5Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = rq2Var;
        this.t0 = j;
        this.u0 = fifVar;
        this.v0 = l;
        this.w0 = cz5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dq2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new dq2(this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        s35 s35Var;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        e5f e5fVar = e5f.a;
        rq2 rq2Var = this.s0;
        if (i == 0) {
            od2.a0(obj);
            hjf hjfVar = (hjf) rq2Var.K0.getValue();
            this.Z = 1;
            Object objT0 = j47.t0(((w9a) ((kke) hjfVar.a.getValue())).b(), new gjf(hjfVar, this.t0, this.v0, this.u0, this.w0, null), this);
            if (objT0 != tx3Var) {
                objT0 = e5fVar;
            }
            if (objT0 == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s35Var = this.Y;
                rq2Var = this.X;
                od2.a0(obj);
                bc7[] bc7VarArr = rq2.f1;
                rq2Var.getClass();
                pnf.o(s35Var, obj);
                return e5fVar;
            }
            od2.a0(obj);
        }
        s35 s35Var2 = rq2Var.b1;
        lu0 lu0Var = (lu0) rq2Var.E0.getValue();
        this.X = rq2Var;
        this.Y = s35Var2;
        this.Z = 2;
        Object objC = zo2.d.c(this.t0, 1, lu0Var, this.w0, false, this);
        if (objC == tx3Var) {
            return tx3Var;
        }
        s35Var = s35Var2;
        obj = objC;
        bc7[] bc7VarArr2 = rq2.f1;
        rq2Var.getClass();
        pnf.o(s35Var, obj);
        return e5fVar;
    }
}
