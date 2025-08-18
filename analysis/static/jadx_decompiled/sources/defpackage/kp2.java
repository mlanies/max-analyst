package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kp2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rq2 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ Long s0;
    public final /* synthetic */ CharSequence t0;
    public final /* synthetic */ List u0;
    public final /* synthetic */ boolean v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp2(rq2 rq2Var, Long l, Long l2, CharSequence charSequence, List list, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = rq2Var;
        this.Z = l;
        this.s0 = l2;
        this.t0 = charSequence;
        this.u0 = list;
        this.v0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((kp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new kp2(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            dv4 dv4Var = this.Y.Y;
            long jLongValue = this.Z.longValue();
            long jLongValue2 = this.s0.longValue();
            this.X = 1;
            if (dv4Var.a(jLongValue, jLongValue2, this.t0, this.u0, this.v0, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
