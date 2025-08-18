package defpackage;

/* loaded from: classes2.dex */
public final class o25 extends pnf implements fg3 {
    public static final /* synthetic */ bc7[] u0;
    public final s35 X;
    public final s35 Y;
    public final s35 Z;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final w4d s0;
    public boolean t0;

    static {
        oi9 oi9Var = new oi9(o25.class, "codeJob", "getCodeJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        u0 = new bc7[]{oi9Var};
    }

    public o25() {
        ehd ehdVar = ehd.a;
        khe kheVarD = ehdVar.getAccessor().d(q33.class);
        je7 je7VarB = ehdVar.b();
        khe kheVarD2 = ehdVar.getAccessor().d(o45.class);
        this.b = kheVarD;
        this.c = je7VarB;
        this.o = kheVarD2;
        this.X = new s35(0);
        this.Y = new s35(0);
        this.Z = new s35(0);
        this.s0 = mqd.D();
    }

    @Override // defpackage.fg3
    public final void e(String str) {
        vxd vxdVarS = j47.S(this.a, ((w9a) ((kke) this.c.getValue())).a().plus(new qj((o45) this.o.getValue())), vx3.b, new n25(this, str, null));
        this.s0.o1(this, u0[0], vxdVarS);
    }
}
