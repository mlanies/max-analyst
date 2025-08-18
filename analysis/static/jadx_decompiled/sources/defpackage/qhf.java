package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qhf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ vhf Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhf(Object obj, Continuation continuation, vhf vhfVar, long j) {
        super(2, continuation);
        this.Y = obj;
        this.Z = vhfVar;
        this.s0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qhf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new qhf(this.Y, continuation, this.Z, this.s0);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Exception {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long jLongValue = ((Number) this.Y).longValue();
            this.X = 1;
            obj = vhf.a(this.Z, this.s0, jLongValue, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
