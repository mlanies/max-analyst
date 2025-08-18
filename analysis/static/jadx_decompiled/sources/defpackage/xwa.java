package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class xwa implements qza {
    public static final /* synthetic */ bc7[] l;
    public final long a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final kld g;
    public final v7c h;
    public final AtomicLong i;
    public final w4d j;
    public sx3 k;

    static {
        oi9 oi9Var = new oi9(xwa.class, "addSubscribersJob", "getAddSubscribersJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        l = new bc7[]{oi9Var};
    }

    public xwa(long j, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5) {
        this.a = j;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
        this.e = je7Var4;
        this.f = je7Var5;
        kld kldVarB = lld.b(0, Integer.MAX_VALUE, 0, 5);
        this.g = kldVarB;
        this.h = new v7c(kldVarB);
        this.i = new AtomicLong();
        this.j = mqd.D();
    }

    @Override // defpackage.qza
    public final void a() {
        this.k = null;
    }

    @Override // defpackage.qza
    public final void b(gza gzaVar) {
    }

    @Override // defpackage.qza
    public final void c(sx3 sx3Var) {
        this.k = sx3Var;
        od2.L(new zn5(new v7c(((dxa) this.e.getValue()).a), new vwa(this, null), 5), sx3Var);
    }

    @Override // defpackage.qza
    public final void e(long j) {
    }
}
