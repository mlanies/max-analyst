package defpackage;

/* loaded from: classes2.dex */
public final class ajd extends pnf implements fg3 {
    public static final /* synthetic */ bc7[] Y;
    public final s35 X;
    public final je7 b;
    public final je7 c;
    public final w4d o;

    static {
        oi9 oi9Var = new oi9(ajd.class, "codeJob", "getCodeJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        Y = new bc7[]{oi9Var};
    }

    public ajd() {
        ehd ehdVar = ehd.a;
        je7 je7VarB = ehdVar.b();
        khe kheVarD = ehdVar.getAccessor().d(o45.class);
        this.b = je7VarB;
        this.c = kheVarD;
        this.o = mqd.D();
        this.X = new s35(0);
    }

    @Override // defpackage.fg3
    public final void e(String str) {
        vxd vxdVarS = j47.S(this.a, ((w9a) ((kke) this.b.getValue())).a().plus(new qj((o45) this.c.getValue())), vx3.b, new zid(str, this, null));
        this.o.o1(this, Y[0], vxdVarS);
    }
}
