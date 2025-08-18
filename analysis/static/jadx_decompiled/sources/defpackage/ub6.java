package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ub6 extends ffe implements a66 {
    public iy2 X;
    public int Y;
    public final /* synthetic */ xb6 Z;
    public final /* synthetic */ ta3 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub6(xb6 xb6Var, ua3 ua3Var, Continuation continuation) {
        super(2, continuation);
        this.Z = xb6Var;
        this.s0 = ua3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ub6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ub6(this.Z, (ua3) this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        iy2 iy2Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            iy2Var = (iy2) this.Z.b.getValue();
            this.X = iy2Var;
            this.Y = 1;
            obj = ((ua3) this.s0).awaitInternal(this);
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
            iy2Var = this.X;
            od2.a0(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        this.X = null;
        this.Y = 2;
        obj = iy2Var.d(jLongValue, this);
        return obj == tx3Var ? tx3Var : obj;
    }
}
