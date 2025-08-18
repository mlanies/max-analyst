package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class as3 implements qza {
    public static final /* synthetic */ bc7[] h;
    public final x3c a;
    public final je7 b;
    public final je7 c;
    public sx3 d;
    public final w4d e = mqd.D();
    public final kld f;
    public final v7c g;

    static {
        oi9 oi9Var = new oi9(as3.class, "collectJob", "getCollectJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        h = new bc7[]{oi9Var};
    }

    public as3(je7 je7Var, je7 je7Var2, x3c x3cVar) {
        this.a = x3cVar;
        this.b = je7Var;
        this.c = je7Var2;
        kld kldVarB = lld.b(0, Integer.MAX_VALUE, 0, 5);
        this.f = kldVarB;
        this.g = new v7c(kldVarB);
    }

    @Override // defpackage.qza
    public final void a() {
        this.d = null;
    }

    @Override // defpackage.qza
    public final void b(gza gzaVar) {
        ((AtomicReference) this.a.Y).updateAndGet(new iz0(9, gzaVar));
    }

    @Override // defpackage.qza
    public final void c(sx3 sx3Var) {
        this.d = sx3Var;
    }

    @Override // defpackage.qza
    public final void e(long j) {
        ((AtomicReference) this.a.Y).updateAndGet(new v79(j, 3));
    }
}
