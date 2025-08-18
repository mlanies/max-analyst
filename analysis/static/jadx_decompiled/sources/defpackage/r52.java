package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r52 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ u52 s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r52(w7c w7cVar, Continuation continuation, u52 u52Var, long j) {
        super(2, continuation);
        this.Z = w7cVar;
        this.s0 = u52Var;
        this.t0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((r52) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        r52 r52Var = new r52((w7c) this.Z, continuation, this.s0, this.t0);
        r52Var.Y = obj;
        return r52Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            q52 q52Var = new q52((on5) this.Y, this.s0, this.t0);
            this.X = 1;
            if (this.Z.d(q52Var, this) == tx3Var) {
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
