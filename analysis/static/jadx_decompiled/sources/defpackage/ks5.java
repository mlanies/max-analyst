package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class ks5 implements gs5, zl4 {
    public final erd a;
    public xae b;
    public Collection c;

    public ks5(erd erdVar, ArrayList arrayList) {
        this.a = erdVar;
        this.c = arrayList;
    }

    @Override // defpackage.vae
    public final void b() {
        this.b = zae.a;
        this.a.a(this.c);
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        this.c.add(obj);
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (zae.e(this.b, xaeVar)) {
            this.b = xaeVar;
            this.a.c(this);
            xaeVar.j(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        this.b.cancel();
        this.b = zae.a;
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.b == zae.a;
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        this.c = null;
        this.b = zae.a;
        this.a.onError(th);
    }
}
