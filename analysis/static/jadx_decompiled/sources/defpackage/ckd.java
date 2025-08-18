package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import ru.ok.tamtam.android.util.share.ShareData;

/* loaded from: classes2.dex */
public final class ckd implements qza {
    public final ShareData a;
    public final aea b;
    public final x3c c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final q0e g;
    public final w7c h;
    public final kld i;
    public final v7c j;
    public final h7b k;
    public sx3 l;
    public boolean m;

    public ckd(ShareData shareData, aea aeaVar, x3c x3cVar, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = shareData;
        this.b = aeaVar;
        this.c = x3cVar;
        this.d = je7Var;
        this.e = je7Var2;
        this.f = je7Var3;
        q0e q0eVarA = r0e.a(null);
        this.g = q0eVarA;
        this.h = new w7c(q0eVarA);
        kld kldVarB = lld.b(0, Integer.MAX_VALUE, 0, 5);
        this.i = kldVarB;
        this.j = new v7c(kldVarB);
        this.k = new h7b(17);
        if (shareData == null) {
            throw new IllegalStateException("ShareData is null".toString());
        }
    }

    @Override // defpackage.qza
    public final void a() {
        this.l = null;
    }

    @Override // defpackage.qza
    public final void b(gza gzaVar) {
        ((AtomicReference) this.c.Y).updateAndGet(new iz0(9, gzaVar));
    }

    @Override // defpackage.qza
    public final void c(sx3 sx3Var) {
        this.l = sx3Var;
        j47.T(sx3Var, ((w9a) ((kke) this.d.getValue())).b(), null, new akd(this, null), 2);
    }

    @Override // defpackage.qza
    public final void e(long j) {
        ((AtomicReference) this.c.Y).updateAndGet(new v79(j, 3));
    }
}
