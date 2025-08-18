package defpackage;

/* loaded from: classes2.dex */
public final class ped extends pnf implements t15 {
    public static final /* synthetic */ bc7[] z0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final ep0 b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final q0e t0;
    public final w7c u0;
    public Long v0;
    public int w0;
    public final w4d x0;
    public final s35 y0;

    static {
        oi9 oi9Var = new oi9(ped.class, "openProfileJob", "getOpenProfileJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        z0 = new bc7[]{oi9Var};
    }

    public ped(ep0 ep0Var) {
        ehd ehdVar = ehd.a;
        khe kheVarD = ehdVar.getAccessor().d(pk.class);
        khe kheVarD2 = ehdVar.getAccessor().d(ds3.class);
        khe kheVarD3 = ehdVar.getAccessor().d(iy2.class);
        khe kheVarD4 = ehdVar.getAccessor().d(oq3.class);
        khe kheVarD5 = ehdVar.getAccessor().d(qq3.class);
        je7 je7VarB = ehdVar.b();
        this.b = ep0Var;
        this.c = kheVarD;
        this.o = kheVarD2;
        this.X = kheVarD3;
        this.Y = kheVarD4;
        this.Z = kheVarD5;
        this.s0 = je7VarB;
        q0e q0eVarA = r0e.a(oz4.a);
        this.t0 = q0eVarA;
        this.u0 = new w7c(q0eVarA);
        this.x0 = mqd.D();
        this.y0 = new s35(0);
        od2.L(new zn5(new v7c(ep0Var.b), new ked(this, kheVarD2, null), 5), this.a);
        pnf.n(this, null, null, new led(this, null), 3);
    }

    @Override // defpackage.t15
    public final boolean h() {
        return false;
    }

    @Override // defpackage.t15
    public final void l() {
        q(this.w0);
    }

    @Override // defpackage.t15
    public final boolean m() {
        return this.w0 < Integer.MAX_VALUE;
    }

    @Override // defpackage.pnf
    public final void p() {
        ep0 ep0Var = this.b;
        ((av0) ep0Var.a.getValue()).f(ep0Var);
    }

    public final void q(int i) {
        if (this.v0 == null) {
            k4a k4aVar = (k4a) ((pk) this.c.getValue());
            this.v0 = Long.valueOf(k4a.v(k4aVar, new gn3(((p7b) k4aVar.y()).a.o(), i)));
        }
    }
}
