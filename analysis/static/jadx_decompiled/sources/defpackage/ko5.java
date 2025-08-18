package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ko5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ lec Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ lx3 u0;
    public final /* synthetic */ iab v0;
    public final /* synthetic */ Object w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko5(lec lecVar, long j, long j2, long j3, lx3 lx3Var, iab iabVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Y = lecVar;
        this.Z = j;
        this.s0 = j2;
        this.t0 = j3;
        this.u0 = lx3Var;
        this.v0 = iabVar;
        this.w0 = obj;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ko5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ko5(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        lec lecVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            long j = lecVar.a - this.Z;
            this.X = 1;
            if (j47.x(j, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            od2.a0(obj);
        }
        if (this.s0 == lecVar.a) {
            int i2 = ft4.o;
            lecVar.a = ft4.e(z7.S(System.nanoTime(), kt4.NANOSECONDS)) + this.t0;
            jo5 jo5Var = new jo5(this.v0, this.w0, null);
            this.X = 2;
            if (j47.t0(this.u0, jo5Var, this) == tx3Var) {
                return tx3Var;
            }
        }
        return e5f.a;
    }
}
