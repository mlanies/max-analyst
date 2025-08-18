package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bn2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ sx3 s0;
    public final /* synthetic */ cn2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn2(t03 t03Var, Continuation continuation, sx3 sx3Var, cn2 cn2Var) {
        super(2, continuation);
        this.Z = t03Var;
        this.s0 = sx3Var;
        this.t0 = cn2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bn2) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bn2 bn2Var = new bn2((t03) this.Z, continuation, this.s0, this.t0);
        bn2Var.Y = obj;
        return bn2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            an2 an2Var = new an2((on5) this.Y, this.s0, this.t0);
            this.X = 1;
            if (this.Z.d(an2Var, this) == tx3Var) {
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
