package defpackage;

/* loaded from: classes.dex */
public final class qr5 implements f2a, xae {
    public final vae a;
    public zl4 b;

    public qr5(vae vaeVar) {
        this.a = vaeVar;
    }

    @Override // defpackage.f2a
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        this.b = zl4Var;
        this.a.f(this);
    }

    @Override // defpackage.xae
    public final void cancel() {
        this.b.g();
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // defpackage.xae
    public final void j(long j) {
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
