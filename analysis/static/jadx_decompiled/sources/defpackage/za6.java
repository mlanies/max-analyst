package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class za6 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ab6 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ boolean u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za6(ab6 ab6Var, long j, long j2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Z = ab6Var;
        this.s0 = j;
        this.t0 = j2;
        this.u0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((za6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        za6 za6Var = new za6(this.Z, this.s0, this.t0, this.u0, continuation);
        za6Var.Y = obj;
        return za6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            ac acVarH = nu0.h(od2.D(((ds3) this.Z.a.getValue()).c(this.s0), new xa6(sx3Var, this.s0, this.Z, this.t0, this.u0, null)), ft4.e(this.t0), new ya6(2, null));
            this.X = 1;
            obj = od2.A(acVarH, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        Object obj2 = ((pjc) obj).a;
        if (obj2 instanceof njc) {
            return null;
        }
        return obj2;
    }
}
