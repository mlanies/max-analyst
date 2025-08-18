package defpackage;

/* loaded from: classes2.dex */
public final class w17 extends pnf implements dh3 {
    public static final /* synthetic */ bc7[] u0;
    public final w4d X;
    public final s35 Y;
    public final h35 Z;
    public final /* synthetic */ snf b;
    public final String c;
    public final String o;
    public final s35 s0;
    public final m32 t0;

    static {
        oi9 oi9Var = new oi9(w17.class, "registerJob", "getRegisterJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        u0 = new bc7[]{oi9Var};
    }

    public w17(String str, String str2, je7 je7Var) {
        snf snfVar = new snf(je7Var, new pz2(29));
        this.b = snfVar;
        this.c = str;
        this.o = str2;
        this.X = mqd.D();
        this.Y = new s35(0);
        this.Z = new h35(y53.M(new sf7(), new xc(), new kq9()));
        s35 s35Var = new s35(0);
        this.s0 = s35Var;
        this.t0 = od2.N(s35Var, new t03(new t03(snfVar.o, 11), 18));
    }

    @Override // defpackage.dh3
    public final v7c f() {
        return this.b.o;
    }

    @Override // defpackage.pnf
    public final void p() {
        bc7[] bc7VarArr = u0;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.X;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[0], null);
    }

    public final void q(String str, boolean z) {
        pnf.o(this.s0, (z || str.length() != 0) ? mnd.a : zj6.a);
    }

    public final boolean r(int i, String str) {
        a73 a73VarA = this.Z.a(i, str);
        jqe jqeVar = a73VarA != null ? (jqe) x53.i0(a73VarA.a) : null;
        if (jqeVar == null) {
            return true;
        }
        pnf.o(this.s0, new m17(i, jqeVar));
        return false;
    }
}
