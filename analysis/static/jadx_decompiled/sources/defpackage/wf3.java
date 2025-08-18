package defpackage;

/* loaded from: classes2.dex */
public final class wf3 extends pnf implements fg3 {
    public static final /* synthetic */ bc7[] w0;
    public final je7 X;
    public final je7 Y;
    public final q0e Z;
    public final String b;
    public final je7 c;
    public final je7 o;
    public final t03 s0;
    public final w4d t0;
    public final s35 u0;
    public final s35 v0;

    static {
        oi9 oi9Var = new oi9(wf3.class, "codeInputJob", "getCodeInputJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        w0 = new bc7[]{oi9Var};
    }

    public wf3(String str) {
        ehd ehdVar = ehd.a;
        khe kheVarD = ehdVar.getAccessor().d(q33.class);
        khe kheVarD2 = ehdVar.getAccessor().d(q6f.class);
        je7 je7VarB = ehdVar.b();
        khe kheVarD3 = ehdVar.getAccessor().d(o45.class);
        this.b = str;
        this.c = kheVarD;
        this.o = kheVarD2;
        this.X = je7VarB;
        this.Y = kheVarD3;
        q0e q0eVarA = r0e.a(tf3.a);
        this.Z = q0eVarA;
        this.s0 = new t03(q0eVarA, 11);
        this.t0 = mqd.D();
        this.u0 = new s35(0);
        this.v0 = new s35(0);
    }

    @Override // defpackage.fg3
    public final void e(String str) {
        vxd vxdVarN = pnf.n(this, ((w9a) ((kke) this.X.getValue())).a().plus(new qj((o45) this.Y.getValue())), null, new vf3(str, this, null), 2);
        this.t0.o1(this, w0[0], vxdVarN);
    }
}
