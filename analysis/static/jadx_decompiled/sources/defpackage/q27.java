package defpackage;

/* loaded from: classes2.dex */
public final class q27 extends pnf implements dh3 {
    public static final /* synthetic */ bc7[] B0 = {new oi9(q27.class, "authJob", "getAuthJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, q27.class, "jobPhoneValidation", "getJobPhoneValidation()Lkotlinx/coroutines/Job;")};
    public final qec A0;
    public final je7 X;
    public final s35 Y;
    public final kld Z;
    public final /* synthetic */ snf b;
    public final je7 c;
    public final je7 o;
    public final s35 s0;
    public final m32 t0;
    public final w4d u0;
    public final w4d v0;
    public final q0e w0;
    public final w7c x0;
    public final q0e y0;
    public final mn5 z0;

    public q27(khe kheVar, je7 je7Var, je7 je7Var2) {
        lt7 lt7Var = lt7.a;
        khe kheVarD = lt7Var.getAccessor().d(ty3.class);
        khe kheVarD2 = lt7Var.getAccessor().d(zua.class);
        snf snfVar = new snf(je7Var2, new g27(0));
        this.b = snfVar;
        this.c = kheVar;
        this.o = je7Var;
        this.X = kheVarD2;
        this.Y = new s35(0);
        kld kldVarB = lld.b(0, 0, 0, 7);
        this.Z = kldVarB;
        this.s0 = new s35(0);
        m32 m32VarN = od2.N(kldVarB, new t03(snfVar.o, 11));
        this.t0 = m32VarN;
        this.u0 = mqd.D();
        this.v0 = mqd.D();
        q0e q0eVarA = r0e.a(daa.b);
        this.w0 = q0eVarA;
        this.x0 = od2.X(new sb1(q0eVarA, this, je7Var, kheVarD2, 2), this.a, wld.a, new my3((eaa) q0eVarA.getValue(), Integer.MAX_VALUE, new eqe(v0c.oneme_login_input_default_phone_hint)));
        q0e q0eVarA2 = r0e.a("");
        this.y0 = q0eVarA2;
        this.z0 = od2.F(new j31(new ac(q0eVarA2, 26, this), new e21(q0eVarA, kheVarD2, 2), new j27(3, null, 0), 4), ((w9a) ((kke) je7Var.getValue())).a());
        this.A0 = new qec("[^0-9+]");
        od2.L(od2.F(new zn5(m32VarN, new h27(this, kheVarD, null), 5), ((w9a) ((kke) je7Var.getValue())).a()), this.a);
    }

    @Override // defpackage.dh3
    public final v7c f() {
        return this.b.o;
    }

    @Override // defpackage.pnf
    public final void p() {
        bc7[] bc7VarArr = B0;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.u0;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[0], null);
        bc7 bc7Var2 = bc7VarArr[1];
        w4d w4dVar2 = this.v0;
        x77 x77Var2 = (x77) w4dVar2.T0(this, bc7Var2);
        if (x77Var2 != null) {
            x77Var2.cancel(null);
        }
        w4dVar2.o1(this, bc7VarArr[1], null);
    }
}
