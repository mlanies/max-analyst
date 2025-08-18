package defpackage;

/* loaded from: classes.dex */
public final class jh5 extends pnf {
    public static final /* synthetic */ bc7[] Z;
    public final je7 X;
    public final w4d Y;
    public final kh5 b;
    public final je7 c;
    public final je7 o;

    static {
        oi9 oi9Var = new oi9(jh5.class, "downloadJob", "getDownloadJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        Z = new bc7[]{oi9Var};
    }

    public jh5(kh5 kh5Var) {
        dh5 dh5Var = dh5.a;
        khe kheVarD = dh5Var.getAccessor().d(kke.class);
        khe kheVarD2 = dh5Var.getAccessor().d(no4.class);
        khe kheVarD3 = dh5Var.getAccessor().d(k6f.class);
        this.b = kh5Var;
        this.c = kheVarD;
        this.o = kheVarD2;
        this.X = kheVarD3;
        this.Y = mqd.D();
    }

    @Override // defpackage.pnf
    public final void p() {
        bc7[] bc7VarArr = Z;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.Y;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[0], null);
    }
}
