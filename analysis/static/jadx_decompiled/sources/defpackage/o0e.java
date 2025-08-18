package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o0e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ mec s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0e(cp5 cp5Var, mec mecVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = cp5Var;
        this.s0 = mecVar;
        this.t0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((o0e) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        o0e o0eVar = new o0e((cp5) this.Z, this.s0, this.t0, continuation);
        o0eVar.Y = obj;
        return o0eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            n0e n0eVar = new n0e(this.Z, this.s0, (on5) this.Y, this.t0, null);
            this.X = 1;
            if (j1e.k(n0eVar, this) == tx3Var) {
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
