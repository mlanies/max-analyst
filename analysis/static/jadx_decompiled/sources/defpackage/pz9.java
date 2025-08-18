package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class pz9 implements f2a, zl4 {
    public zl4 X;
    public long Y;
    public boolean Z;
    public final f2a a;
    public final long b;
    public final Object c;
    public final boolean o;

    public pz9(f2a f2aVar, long j, Object obj, boolean z) {
        this.a = f2aVar;
        this.b = j;
        this.c = obj;
        this.o = z;
    }

    @Override // defpackage.f2a
    public final void b() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        f2a f2aVar = this.a;
        Object obj = this.c;
        if (obj == null && this.o) {
            f2aVar.onError(new NoSuchElementException());
            return;
        }
        if (obj != null) {
            f2aVar.e(obj);
        }
        f2aVar.b();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.X, zl4Var)) {
            this.X = zl4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (this.Z) {
            return;
        }
        long j = this.Y;
        if (j != this.b) {
            this.Y = j + 1;
            return;
        }
        this.Z = true;
        this.X.g();
        f2a f2aVar = this.a;
        f2aVar.e(obj);
        f2aVar.b();
    }

    @Override // defpackage.zl4
    public final void g() {
        this.X.g();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.X.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.Z) {
            j47.Z(th);
        } else {
            this.Z = true;
            this.a.onError(th);
        }
    }
}
