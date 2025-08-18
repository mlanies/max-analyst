package defpackage;

/* loaded from: classes.dex */
public final class t1a implements f2a, zl4 {
    public final f2a a;
    public boolean b;
    public zl4 c;
    public long o;

    public t1a(f2a f2aVar, long j) {
        this.a = f2aVar;
        this.o = j;
    }

    @Override // defpackage.f2a
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.g();
        this.a.b();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.c, zl4Var)) {
            this.c = zl4Var;
            long j = this.o;
            f2a f2aVar = this.a;
            if (j != 0) {
                f2aVar.c(this);
                return;
            }
            this.b = true;
            zl4Var.g();
            iz4.a(f2aVar);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (this.b) {
            return;
        }
        long j = this.o;
        long j2 = j - 1;
        this.o = j2;
        if (j > 0) {
            boolean z = j2 == 0;
            this.a.e(obj);
            if (z) {
                b();
            }
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        this.c.g();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.c.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.b) {
            j47.Z(th);
            return;
        }
        this.b = true;
        this.c.g();
        this.a.onError(th);
    }
}
