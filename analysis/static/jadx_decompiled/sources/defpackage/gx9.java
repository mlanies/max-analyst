package defpackage;

/* loaded from: classes2.dex */
public final class gx9 extends pnf {
    public static final /* synthetic */ bc7[] C0 = {new oi9(gx9.class, "resetDefaultsJob", "getResetDefaultsJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, gx9.class, "changeAllNotificationsEnabledJob", "getChangeAllNotificationsEnabledJob()Lkotlinx/coroutines/Job;"), new oi9(gx9.class, "changeShowContentJob", "getChangeShowContentJob()Lkotlinx/coroutines/Job;")};
    public final w4d A0;
    public final w4d B0;
    public final je7 X;
    public final je7 Y;
    public final q0e Z;
    public final lle b;
    public final je7 c;
    public final je7 o;
    public final w7c s0;
    public final q0e t0;
    public final w7c u0;
    public final w7c v0;
    public final q0e w0;
    public final q0e x0;
    public final s35 y0;
    public final w4d z0;

    public gx9() {
        sw9 sw9Var = sw9.a;
        lle lleVar = (lle) sw9Var.getAccessor().c(lle.class);
        khe kheVarD = sw9Var.getAccessor().d(hp.class);
        khe kheVarD2 = sw9Var.getAccessor().d(pk.class);
        khe kheVarD3 = sw9Var.getAccessor().d(kke.class);
        khe kheVarD4 = sw9Var.getAccessor().d(cea.class);
        this.b = lleVar;
        this.c = kheVarD;
        this.o = kheVarD2;
        this.X = kheVarD3;
        this.Y = kheVarD4;
        q0e q0eVarA = r0e.a(nz4.a);
        this.Z = q0eVarA;
        this.s0 = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(Boolean.valueOf(!lleVar.b()));
        this.t0 = q0eVarA2;
        this.u0 = new w7c(q0eVarA2);
        this.v0 = new w7c(r0e.a(Boolean.valueOf(lleVar.b())));
        q0e q0eVarA3 = r0e.a(Boolean.valueOf(lleVar.b()));
        this.w0 = q0eVarA3;
        q0e q0eVarA4 = r0e.a(0);
        this.x0 = q0eVarA4;
        this.y0 = new s35(0);
        this.z0 = mqd.D();
        this.A0 = mqd.D();
        this.B0 = mqd.D();
        od2.L(od2.F(new zn5(od2.s(c37.c(((kxc) q()).j), c37.c(((kxc) q()).k), new w7c(q0eVarA3), new w7c(q0eVarA4), new dx9(this, null)), new bx9(this, null), 5), ((w9a) ((kke) kheVarD3.getValue())).b()), this.a);
    }

    public static eqe r(int i) {
        return i != 0 ? i != 1 ? i != 2 ? new eqe(eea.t) : new eqe(eea.u) : new eqe(eea.s) : new eqe(eea.t);
    }

    public final hp q() {
        return (hp) this.c.getValue();
    }

    public final void s(long j) {
        long j2 = dea.m;
        je7 je7Var = this.X;
        bc7[] bc7VarArr = C0;
        if (j == j2) {
            this.A0.o1(this, bc7VarArr[1], j47.S(this.a, ((w9a) ((kke) je7Var.getValue())).b(), vx3.b, new ex9(this, null)));
            return;
        }
        long j3 = dea.k;
        s35 s35Var = this.y0;
        if (j == j3) {
            sv9.c.getClass();
            pnf.o(s35Var, new c64(":settings/notifications/dialog"));
            return;
        }
        if (j == dea.d) {
            sv9.c.getClass();
            pnf.o(s35Var, new c64(":settings/notifications/chat"));
            return;
        }
        if (j == dea.s) {
            sv9.c.getClass();
            pnf.o(s35Var, new c64(":settings/notifications/other"));
        } else if (j == dea.w) {
            this.B0.o1(this, bc7VarArr[2], pnf.n(this, ((w9a) ((kke) je7Var.getValue())).b(), null, new cx9(this, null), 2));
        } else if (j == dea.o) {
            pnf.o(s35Var, uw9.b);
        }
    }
}
