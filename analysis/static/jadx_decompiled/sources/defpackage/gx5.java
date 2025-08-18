package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gx5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ lec Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx5(lec lecVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = lecVar;
        this.s0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gx5) n((aj6) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gx5 gx5Var = new gx5(this.Z, this.s0, continuation);
        gx5Var.Y = obj;
        return gx5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        aj6 aj6Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            aj6 aj6Var2 = (aj6) this.Y;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.Z.a;
            long j = this.s0;
            if (jCurrentTimeMillis > j) {
                return aj6Var2;
            }
            this.Y = aj6Var2;
            this.X = 1;
            if (j47.x(j - jCurrentTimeMillis, this) == tx3Var) {
                return tx3Var;
            }
            aj6Var = aj6Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj6Var = (aj6) this.Y;
            od2.a0(obj);
        }
        return aj6Var;
    }
}
