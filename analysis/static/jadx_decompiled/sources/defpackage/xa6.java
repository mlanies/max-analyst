package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xa6 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ sx3 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ ab6 t0;
    public final /* synthetic */ long u0;
    public final /* synthetic */ boolean v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa6(sx3 sx3Var, long j, ab6 ab6Var, long j2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Z = sx3Var;
        this.s0 = j;
        this.t0 = ab6Var;
        this.u0 = j2;
        this.v0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xa6) n((uj3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xa6 xa6Var = new xa6(this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
        xa6Var.Y = obj;
        return xa6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v17 */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        sx3 sx3Var = this.Z;
        ab6 ab6Var = this.t0;
        long j = this.s0;
        try {
            if (i == 0) {
                od2.a0(obj);
                if (i24.r((uj3) this.Y)) {
                    hm9.n(sx3Var.getClass().getName(), "try to request info for #" + j);
                    xb9 xb9Var = (xb9) ab6Var.b.getValue();
                    long j2 = this.s0;
                    long j3 = this.u0;
                    this.X = 1;
                    Object objS = xb9Var.s(j2, j3, this);
                    this = objS;
                    if (objS == tx3Var) {
                        return tx3Var;
                    }
                }
                return ((ds3) ab6Var.a.getValue()).c(j);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            this = this;
            return ((ds3) ab6Var.a.getValue()).c(j);
        } catch (Throwable th) {
            hm9.p(sx3Var.getClass().getName(), "fail to fetch noncontact #" + j, th);
            return new qn5(3, this.v0 ? ((ds3) ab6Var.a.getValue()).a(j) : null);
        }
    }
}
