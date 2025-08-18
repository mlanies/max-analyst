package defpackage;

/* loaded from: classes2.dex */
public final class k9 implements qza {
    public static final /* synthetic */ bc7[] i;
    public final long a;
    public final je7 b;
    public final je7 c;
    public sx3 d;
    public final kld e;
    public final v7c f;
    public final w4d g;
    public final boolean h;

    static {
        oi9 oi9Var = new oi9(k9.class, "processActionJob", "getProcessActionJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        i = new bc7[]{oi9Var};
    }

    public k9(long j, je7 je7Var, je7 je7Var2) {
        this.a = j;
        this.b = je7Var;
        this.c = je7Var2;
        boolean z = false;
        kld kldVarB = lld.b(0, Integer.MAX_VALUE, 0, 5);
        this.e = kldVarB;
        this.f = new v7c(kldVarB);
        this.g = mqd.D();
        e52 e52Var = (e52) ((jz2) ((iy2) je7Var.getValue())).m(j).a.getValue();
        if (e52Var != null && e52Var.I()) {
            z = true;
        }
        this.h = z;
    }

    @Override // defpackage.qza
    public final void a() {
        this.d = null;
    }

    @Override // defpackage.qza
    public final void b(gza gzaVar) {
    }

    @Override // defpackage.qza
    public final void c(sx3 sx3Var) {
        this.d = sx3Var;
    }

    @Override // defpackage.qza
    public final void e(long j) {
    }
}
