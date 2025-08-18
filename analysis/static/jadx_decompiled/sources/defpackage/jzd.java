package defpackage;

/* loaded from: classes2.dex */
public final class jzd extends pnf {
    public static final /* synthetic */ bc7[] A0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 b;
    public final y7d c;
    public final je7 o;
    public final w4d s0 = mqd.D();
    public final q0e t0;
    public final w7c u0;
    public final js3 v0;
    public final q0e w0;
    public final w7c x0;
    public final s35 y0;
    public final s35 z0;

    static {
        oi9 oi9Var = new oi9(jzd.class, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        A0 = new bc7[]{oi9Var};
    }

    public jzd(je7 je7Var, je7 je7Var2, je7 je7Var3, qn3 qn3Var, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, y7d y7dVar) {
        this.b = je7Var2;
        this.c = y7dVar;
        this.o = je7Var;
        this.X = je7Var5;
        this.Y = je7Var6;
        this.Z = je7Var7;
        q0e q0eVarA = r0e.a(dn3.d);
        this.t0 = q0eVarA;
        w7c w7cVar = new w7c(q0eVarA);
        this.u0 = w7cVar;
        this.v0 = new js3(this.a, w7cVar, new td((Object) je7Var4, je7Var2.getValue(), false, 8), je7Var, je7Var3);
        q0e q0eVarA2 = r0e.a(nz4.a);
        this.w0 = q0eVarA2;
        this.x0 = new w7c(q0eVarA2);
        this.y0 = new s35(0);
        this.z0 = new s35(0);
        od2.L(new zn5(qn3Var.a(), new dzd(this, null), 5), this.a);
        qn3Var.b();
        pnf.n(this, null, null, new ezd(this, null), 3);
    }

    public final void q() {
        bc7[] bc7VarArr = A0;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.s0;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var == null || !x77Var.isActive()) {
            w4dVar.o1(this, bc7VarArr[0], pnf.n(this, ((w9a) ((kke) this.o.getValue())).c(), null, new izd(this, null), 2));
        }
    }
}
