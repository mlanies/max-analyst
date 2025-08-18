package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c49 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c49(n59 n59Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = n59Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((c49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new c49(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        long j = this.Z;
        n59 n59Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            ab6 ab6Var = (ab6) n59Var.Y0.getValue();
            this.X = 1;
            obj = ab6.a(ab6Var, j, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        uj3 uj3Var = (uj3) obj;
        long jT = ((hyc) n59Var.y0).t();
        s35 s35Var = n59Var.u1;
        if (j == jT) {
            pnf.o(s35Var, new pnd(new eqe(jpc.A2), 0, null, 6));
        } else if (uj3Var == null || uj3Var.k() != 0 || uj3Var.w()) {
            pnf.o(s35Var, new pnd(new eqe(oda.Q0), 0, null, 6));
        } else {
            u29.c.getClass();
            pnf.o(n59Var.v1, new c64(":profile?id=" + j + "&type=contact"));
        }
        return e5f.a;
    }
}
