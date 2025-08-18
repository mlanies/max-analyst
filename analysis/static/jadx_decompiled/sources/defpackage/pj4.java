package defpackage;

/* loaded from: classes2.dex */
public final class pj4 extends pnf {
    public static final /* synthetic */ bc7[] s0;
    public final q0e X;
    public final w7c Y;
    public final w4d Z;
    public final je7 b;
    public final je7 c;
    public final je7 o;

    static {
        oi9 oi9Var = new oi9(pj4.class, "changeDialogNotificationsJob", "getChangeDialogNotificationsJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        s0 = new bc7[]{oi9Var};
    }

    public pj4() {
        sw9 sw9Var = sw9.a;
        khe kheVarD = sw9Var.getAccessor().d(hp.class);
        khe kheVarD2 = sw9Var.getAccessor().d(pk.class);
        khe kheVarD3 = sw9Var.getAccessor().d(kke.class);
        this.b = kheVarD2;
        this.c = kheVarD;
        this.o = kheVarD3;
        q0e q0eVarA = r0e.a(nz4.a);
        this.X = q0eVarA;
        this.Y = new w7c(q0eVarA);
        this.Z = mqd.D();
        q0eVarA.setValue(q());
    }

    public final kl7 q() {
        kl7 kl7VarL = j1e.l();
        kl7VarL.add(new vfd(dea.h, 0, new eqe(eea.g), null, null, null, new ffd(((kxc) ((hp) this.c.getValue())).p() != 1, true), null, null, 0, null, 1976));
        return j1e.d(kl7VarL);
    }

    public final void r(long j) {
        if (j == dea.h) {
            this.Z.o1(this, s0[0], j47.S(this.a, ((w9a) ((kke) this.o.getValue())).b(), vx3.b, new oj4(this, null)));
        }
    }
}
