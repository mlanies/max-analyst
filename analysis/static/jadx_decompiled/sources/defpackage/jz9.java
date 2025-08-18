package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jz9 implements f2a, zl4 {
    public final boolean X = false;
    public zl4 Y;
    public final f2a a;
    public final long b;
    public final TimeUnit c;
    public final xtc o;

    public jz9(f2a f2aVar, long j, TimeUnit timeUnit, xtc xtcVar) {
        this.a = f2aVar;
        this.b = j;
        this.c = timeUnit;
        this.o = xtcVar;
    }

    @Override // defpackage.f2a
    public final void b() {
        this.o.c(new q57(14, this), this.b, this.c);
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.Y, zl4Var)) {
            this.Y = zl4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        this.o.c(new h76((Object) this, obj, false, 14), this.b, this.c);
    }

    @Override // defpackage.zl4
    public final void g() {
        this.Y.g();
        this.o.g();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.o.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        this.o.c(new i76((Object) this, (Object) th, false, 11), this.X ? this.b : 0L, this.c);
    }
}
