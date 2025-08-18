package defpackage;

/* loaded from: classes.dex */
public final class y6d implements f2a, zl4 {
    public volatile boolean X;
    public final f2a a;
    public zl4 b;
    public boolean c;
    public jn o;

    public y6d(f2a f2aVar) {
        this.a = f2aVar;
    }

    @Override // defpackage.f2a
    public final void b() {
        if (this.X) {
            return;
        }
        synchronized (this) {
            try {
                if (this.X) {
                    return;
                }
                if (!this.c) {
                    this.X = true;
                    this.c = true;
                    this.a.b();
                } else {
                    jn jnVar = this.o;
                    if (jnVar == null) {
                        jnVar = new jn(1, (byte) 0);
                        this.o = jnVar;
                    }
                    jnVar.c(hv9.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.b, zl4Var)) {
            this.b = zl4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        Object[] objArr;
        if (this.X) {
            return;
        }
        if (obj == null) {
            this.b.g();
            onError(q45.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.X) {
                    return;
                }
                if (this.c) {
                    jn jnVar = this.o;
                    if (jnVar == null) {
                        jnVar = new jn(1, (byte) 0);
                        this.o = jnVar;
                    }
                    jnVar.c(obj);
                    return;
                }
                this.c = true;
                this.a.e(obj);
                while (true) {
                    synchronized (this) {
                        try {
                            jn jnVar2 = this.o;
                            if (jnVar2 == null) {
                                this.c = false;
                                return;
                            }
                            this.o = null;
                            f2a f2aVar = this.a;
                            for (Object[] objArr2 = (Object[]) jnVar2.c; objArr2 != null; objArr2 = objArr2[4]) {
                                for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                                    if (hv9.b(f2aVar, objArr)) {
                                        return;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        this.X = true;
        this.b.g();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.b.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.X) {
            j47.Z(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.X) {
                    if (this.c) {
                        this.X = true;
                        jn jnVar = this.o;
                        if (jnVar == null) {
                            jnVar = new jn(1, (byte) 0);
                            this.o = jnVar;
                        }
                        ((Object[]) jnVar.c)[0] = new fv9(th);
                        return;
                    }
                    this.X = true;
                    this.c = true;
                    z = false;
                }
                if (z) {
                    j47.Z(th);
                } else {
                    this.a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
