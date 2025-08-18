package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class l22 extends pnf {
    public static final /* synthetic */ bc7[] u0;
    public final q0e X;
    public final w7c Y;
    public final s35 Z;
    public final z12 b;
    public final q0e c;
    public final w7c o;
    public final s35 s0;
    public final w4d t0;

    static {
        oi9 oi9Var = new oi9(l22.class, "submitChangesJob", "getSubmitChangesJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        u0 = new bc7[]{oi9Var};
    }

    public l22(long j, reb rebVar, qeb qebVar) {
        z12 k72Var;
        int iOrdinal = rebVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            k72Var = new k72(j, this.a, qebVar);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            k72Var = new zk3(j, this.a);
        }
        this.b = k72Var;
        je7 je7VarD = neb.a.d();
        q0e q0eVarA = r0e.a(nz4.a);
        this.c = q0eVarA;
        this.o = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(null);
        this.X = q0eVarA2;
        this.Y = new w7c(q0eVarA2);
        this.Z = new s35(0);
        this.s0 = new s35(0);
        this.t0 = mqd.D();
        od2.L(od2.F(new zn5(new t03(k72Var.f(), 11), new g22(this, null), 5), ((w9a) ((kke) je7VarD.getValue())).a()), this.a);
        od2.L(od2.F(new zn5(k72Var.e, new h22(this, null), 5), ((w9a) ((kke) je7VarD.getValue())).a()), this.a);
        od2.L(od2.F(new zn5(k72Var.f, new i22(this, null), 5), ((w9a) ((kke) je7VarD.getValue())).c()), this.a);
    }

    @Override // defpackage.pnf
    public final void p() {
        this.b.b();
    }
}
