package defpackage;

/* loaded from: classes2.dex */
public final class dfc implements z4d, dh3 {
    public static final /* synthetic */ bc7[] z0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final /* synthetic */ snf a;
    public afc b;
    public final sx3 c;
    public final k56 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final w4d v0 = mqd.D();
    public final kld w0;
    public final v7c x0;
    public final w7c y0;

    static {
        oi9 oi9Var = new oi9(dfc.class, "registerJob", "getRegisterJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        z0 = new bc7[]{oi9Var};
    }

    public dfc(afc afcVar, sx3 sx3Var, rp9 rp9Var, khe kheVar, je7 je7Var, khe kheVar2, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5) {
        this.a = new snf(je7Var, new w8c(1));
        this.b = afcVar;
        this.c = sx3Var;
        this.o = rp9Var;
        this.X = je7Var2;
        this.Y = kheVar2;
        this.Z = kheVar;
        this.s0 = je7Var3;
        this.t0 = je7Var4;
        this.u0 = je7Var5;
        kld kldVarA = lld.a(1, 1, 2);
        this.w0 = kldVarA;
        this.x0 = new v7c(kldVarA);
        this.y0 = new w7c(r0e.a(i2b.a));
    }

    @Override // defpackage.z4d
    public final void a(h4d h4dVar) {
        this.w0.g(h4dVar);
    }

    @Override // defpackage.z4d
    public final void b(j4d j4dVar) {
        x77 x77VarA = this.a.a(this.c, ((w9a) ((kke) this.X.getValue())).b(), vx3.b, new cfc(j4dVar, this, null));
        this.v0.o1(this, z0[0], x77VarA);
    }

    @Override // defpackage.z4d
    public final w7c c() {
        return this.y0;
    }

    @Override // defpackage.z4d
    public final void d(qo9 qo9Var) {
        this.w0.g(new h4d(qo9Var.a, qo9Var.b, qo9Var.c));
    }

    @Override // defpackage.z4d
    public final v7c e() {
        return this.x0;
    }

    @Override // defpackage.dh3
    public final v7c f() {
        return this.a.o;
    }

    @Override // defpackage.z4d
    public final dre g() {
        return new dre(v0c.oneme_login_neuro_avatars_title, v0c.oneme_login_neuro_avatars_description, v0c.oneme_login_neuro_avatars_continue_button);
    }
}
