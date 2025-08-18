package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class aq3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cq3 Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq3(cq3 cq3Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = cq3Var;
        this.s0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((aq3) n((uj3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        aq3 aq3Var = new aq3(this.Z, this.s0, continuation);
        aq3Var.Y = obj;
        return aq3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        long j = this.s0;
        cq3 cq3Var = this.Z;
        try {
            if (i == 0) {
                od2.a0(obj);
                if (i24.r((uj3) this.Y)) {
                    hm9.n(cq3Var.getClass().getName(), "try to request info for #" + j);
                    xb9 xb9Var = (xb9) cq3Var.r.getValue();
                    long j2 = this.s0;
                    int i2 = ft4.o;
                    long jR = z7.R(3, kt4.SECONDS);
                    this.X = 1;
                    if (xb9Var.s(j2, jR, this) == tx3Var) {
                        return tx3Var;
                    }
                }
                return ((ds3) cq3Var.g.getValue()).c(j);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            return ((ds3) cq3Var.g.getValue()).c(j);
        } catch (Throwable th) {
            hm9.p(cq3Var.getClass().getName(), "fail to fetch noncontact #" + j, th);
            return new qn5(3, ((ds3) cq3Var.g.getValue()).a(j));
        }
    }
}
