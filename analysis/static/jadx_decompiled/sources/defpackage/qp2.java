package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qp2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ e52 Y;
    public final /* synthetic */ rq2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp2(e52 e52Var, rq2 rq2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = e52Var;
        this.Z = rq2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new qp2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        c64 c64Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            rq2 rq2Var = this.Z;
            long jT = ((hyc) ((q33) rq2Var.x0.getValue())).t();
            e52 e52Var = this.Y;
            boolean zF = e52Var.b.f(jT);
            long j = e52Var.a;
            if (zF) {
                vo2.c.getClass();
                c64Var = new c64(":profile/attaches?id=" + j);
            } else {
                vo2 vo2Var = vo2.c;
                boolean zW = rq2Var.w();
                vo2Var.getClass();
                c64Var = new c64(":profile?id=" + j + "&type=local_chat&is_opened_from_dialog=" + zW);
            }
            kld kldVar = rq2Var.a1;
            this.X = 1;
            if (kldVar.a(c64Var, this) == tx3Var) {
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
