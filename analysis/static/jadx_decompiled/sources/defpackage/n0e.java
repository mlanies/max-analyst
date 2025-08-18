package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n0e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ mec s0;
    public final /* synthetic */ on5 t0;
    public final /* synthetic */ long u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0e(mn5 mn5Var, mec mecVar, on5 on5Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = mn5Var;
        this.s0 = mecVar;
        this.t0 = on5Var;
        this.u0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((n0e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        n0e n0eVar = new n0e(this.Z, this.s0, this.t0, this.u0, continuation);
        n0eVar.Y = obj;
        return n0eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            m0e m0eVar = new m0e(this.s0, this.t0, sx3Var, this.u0);
            this.X = 1;
            if (this.Z.d(m0eVar, this) == tx3Var) {
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
