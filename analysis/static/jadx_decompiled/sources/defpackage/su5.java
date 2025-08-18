package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class su5 implements qza {
    public final x3c a;
    public final je7 b;
    public final je7 c;
    public final kld d;
    public final v7c e;
    public sx3 f;
    public boolean g;

    public su5(je7 je7Var, je7 je7Var2, x3c x3cVar) {
        this.a = x3cVar;
        this.b = je7Var;
        this.c = je7Var2;
        kld kldVarB = lld.b(0, Integer.MAX_VALUE, 0, 5);
        this.d = kldVarB;
        this.e = new v7c(kldVarB);
    }

    @Override // defpackage.qza
    public final void a() {
        this.f = null;
    }

    @Override // defpackage.qza
    public final void b(gza gzaVar) {
        ((AtomicReference) this.a.Y).updateAndGet(new iz0(9, gzaVar));
    }

    @Override // defpackage.qza
    public final void c(sx3 sx3Var) {
        this.f = sx3Var;
    }

    @Override // defpackage.qza
    public final void e(long j) {
        ((AtomicReference) this.a.Y).updateAndGet(new v79(j, 3));
    }
}
