package defpackage;

import java.util.Collection;

/* loaded from: classes.dex */
public final class js5 extends dg4 implements gs5 {
    public xae c;

    @Override // defpackage.vae
    public final void b() {
        g(this.b);
    }

    @Override // defpackage.xae
    public final void cancel() {
        set(4);
        this.b = null;
        this.c.cancel();
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        Collection collection = (Collection) this.b;
        if (collection != null) {
            collection.add(obj);
        }
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (zae.e(this.c, xaeVar)) {
            this.c = xaeVar;
            this.a.f(this);
            xaeVar.j(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        this.b = null;
        this.a.onError(th);
    }
}
