package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v0b extends ffe implements a66 {
    public int X;
    public final /* synthetic */ y0b Y;
    public final /* synthetic */ e52 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0b(y0b y0bVar, e52 e52Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = y0bVar;
        this.Z = e52Var;
        this.s0 = j;
        this.t0 = j2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((v0b) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new v0b(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            mm2 mm2Var = (mm2) this.Y.f.getValue();
            long j = this.Z.a;
            this.X = 1;
            if (mm2Var.a(j, this.s0, this.t0, false, this) == tx3Var) {
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
