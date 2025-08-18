package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rr1 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ wr1 Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr1(wr1 wr1Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = wr1Var;
        this.s0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rr1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rr1 rr1Var = new rr1(this.Z, this.s0, continuation);
        rr1Var.Y = obj;
        return rr1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        try {
            if (i == 0) {
                od2.a0(obj);
                wr1 wr1Var = this.Z;
                long j = this.s0;
                xb9 xb9Var = (xb9) wr1Var.z.getValue();
                int i2 = ft4.o;
                long jR = z7.R(10, kt4.SECONDS);
                this.X = 1;
                if (xb9Var.s(j, jR, this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
            njcVar = e5fVar;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            hm9.p("CallEngineTag", "fail to fetch missed user", thA);
        }
        return e5fVar;
    }
}
