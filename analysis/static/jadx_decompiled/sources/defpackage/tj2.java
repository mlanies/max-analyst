package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tj2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ck2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ long u0;
    public final /* synthetic */ boolean v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj2(ck2 ck2Var, long j, String str, long j2, long j3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = ck2Var;
        this.Z = j;
        this.s0 = str;
        this.t0 = j2;
        this.u0 = j3;
        this.v0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tj2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new tj2(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            wrc wrcVar = (wrc) this.Y.C0.getValue();
            this.X = 1;
            if (wrcVar.a(this.Z, this.s0, this.t0, this.u0, this.v0, this) == tx3Var) {
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
