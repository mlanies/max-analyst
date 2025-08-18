package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bq2 extends ffe implements a66 {
    public long X;
    public int Y;
    public final /* synthetic */ rq2 Z;
    public final /* synthetic */ Long s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq2(rq2 rq2Var, Long l, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = rq2Var;
        this.s0 = l;
        this.t0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bq2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bq2(this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        long j;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        rq2 rq2Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            e52 e52Var = (e52) rq2Var.Y0.a.getValue();
            if (e52Var != null) {
                x19 x19Var = (x19) rq2Var.H0.getValue();
                long j2 = e52Var.a;
                this.X = j2;
                this.Y = 1;
                obj = x19Var.a(j2, this.s0, this);
                if (obj == tx3Var) {
                    return tx3Var;
                }
                j = j2;
            }
            return e5fVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j3 = this.X;
        od2.a0(obj);
        j = j3;
        u8d u8dVar = new u8d(j, this.t0, 1);
        u8dVar.b = (bw8) obj;
        rq2.r(rq2Var).a(new v8d(u8dVar));
        return e5fVar;
    }
}
