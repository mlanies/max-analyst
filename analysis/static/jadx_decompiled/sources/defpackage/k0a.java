package defpackage;

/* loaded from: classes.dex */
public final class k0a implements gs5, zl4 {
    public final f2a a;
    public xae b;

    public k0a(f2a f2aVar) {
        this.a = f2aVar;
    }

    @Override // defpackage.vae
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        this.a.e(obj);
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
        this.a.onError(th);
    }
}
