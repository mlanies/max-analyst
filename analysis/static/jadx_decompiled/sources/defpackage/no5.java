package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class no5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ mn5 s0;
    public final /* synthetic */ iab t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no5(long j, mn5 mn5Var, iab iabVar, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
        this.s0 = mn5Var;
        this.t0 = iabVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((no5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        no5 no5Var = new no5(this.Z, this.s0, this.t0, continuation);
        no5Var.Y = obj;
        return no5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            long jE = ft4.e(this.Z);
            lx3 coroutineContext = sx3Var.getCoroutineContext();
            mo5 mo5Var = new mo5(new lec(), jE, this.t0, new mec(), sx3Var, coroutineContext);
            this.X = 1;
            if (this.s0.d(mo5Var, this) == tx3Var) {
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
