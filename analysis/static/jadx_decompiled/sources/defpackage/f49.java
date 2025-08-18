package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class f49 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ kv0 t0;
    public final /* synthetic */ fv0 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f49(n59 n59Var, Long l, String str, kv0 kv0Var, fv0 fv0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = n59Var;
        this.Z = l;
        this.s0 = str;
        this.t0 = kv0Var;
        this.u0 = fv0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((f49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new f49(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            m5d m5dVar = this.Y.x0;
            long jLongValue = this.Z.longValue();
            this.X = 1;
            if (m5dVar.D(jLongValue, this.s0, this.t0, this.u0, this) == tx3Var) {
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
