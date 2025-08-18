package defpackage;

/* loaded from: classes.dex */
public final class i0a implements ab3, vqb, tqb {
    public final f2a a;
    public zl4 b;

    public i0a(f2a f2aVar) {
        this.a = f2aVar;
    }

    @Override // defpackage.ab3
    public final void b() {
        this.b = dm4.a;
        this.a.b();
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.b, zl4Var)) {
            this.b = zl4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.xae
    public final void cancel() {
    }

    @Override // defpackage.dqd
    public final void clear() {
    }

    @Override // defpackage.zl4
    public final void g() {
        this.b.g();
        this.b = dm4.a;
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.b.h();
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.xae
    public final void j(long j) {
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        return 2;
    }

    @Override // defpackage.dqd
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public final void onError(Throwable th) {
        this.b = dm4.a;
        this.a.onError(th);
    }

    @Override // defpackage.dqd
    public final Object poll() {
        return null;
    }
}
