package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hp2 extends ffe implements a66 {
    public z23 X;
    public int Y;
    public final /* synthetic */ rq2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp2(rq2 rq2Var, Continuation continuation) {
        super(2, continuation);
        this.Z = rq2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hp2(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        z23 z23Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            rq2 rq2Var = this.Z;
            z23Var = rq2Var.s0;
            this.X = z23Var;
            this.Y = 1;
            obj = rq2Var.y(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            z23Var = this.X;
            od2.a0(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        this.X = null;
        this.Y = 2;
        if (z23Var.f(jLongValue, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
