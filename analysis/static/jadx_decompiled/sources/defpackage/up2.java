package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class up2 extends ffe implements a66 {
    public qp4 X;
    public int Y;
    public final /* synthetic */ rq2 Z;
    public final /* synthetic */ CharSequence s0;
    public final /* synthetic */ Long t0;
    public final /* synthetic */ Long u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up2(rq2 rq2Var, CharSequence charSequence, Long l, Long l2, Continuation continuation) {
        super(2, continuation);
        this.Z = rq2Var;
        this.s0 = charSequence;
        this.t0 = l;
        this.u0 = l2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((up2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new up2(this.Z, this.s0, this.t0, this.u0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        qp4 qp4Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            rq2 rq2Var = this.Z;
            qp4Var = rq2Var.t0;
            this.X = qp4Var;
            this.Y = 1;
            obj = rq2Var.y(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qp4Var = this.X;
            od2.a0(obj);
        }
        qp4 qp4Var2 = qp4Var;
        long jLongValue = ((Number) obj).longValue();
        this.X = null;
        this.Y = 2;
        Object objT0 = j47.t0(((w9a) ((kke) ((je7) qp4Var2.t0).getValue())).b(), new pp4(qp4Var2, jLongValue, this.s0, this.u0, this.t0, null), this);
        if (objT0 != tx3Var) {
            objT0 = e5fVar;
        }
        return objT0 == tx3Var ? tx3Var : e5fVar;
    }
}
