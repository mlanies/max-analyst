package defpackage;

/* loaded from: classes.dex */
public final class b7d extends vg3 implements as {
    public final vg3 a;
    public boolean b;
    public jn c;
    public volatile boolean o;

    public b7d(xpb xpbVar) {
        this.a = xpbVar;
    }

    @Override // defpackage.f2a
    public final void b() {
        if (this.o) {
            return;
        }
        synchronized (this) {
            try {
                if (this.o) {
                    return;
                }
                this.o = true;
                if (!this.b) {
                    this.b = true;
                    this.a.b();
                    return;
                }
                jn jnVar = this.c;
                if (jnVar == null) {
                    jnVar = new jn(1, (byte) 0);
                    this.c = jnVar;
                }
                jnVar.c(hv9.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        boolean z = true;
        if (!this.o) {
            synchronized (this) {
                try {
                    if (!this.o) {
                        if (this.b) {
                            jn jnVar = this.c;
                            if (jnVar == null) {
                                jnVar = new jn(1, (byte) 0);
                                this.c = jnVar;
                            }
                            jnVar.c(new ev9(zl4Var));
                            return;
                        }
                        this.b = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            zl4Var.g();
        } else {
            this.a.c(zl4Var);
            z();
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (this.o) {
            return;
        }
        synchronized (this) {
            try {
                if (this.o) {
                    return;
                }
                if (!this.b) {
                    this.b = true;
                    this.a.e(obj);
                    z();
                } else {
                    jn jnVar = this.c;
                    if (jnVar == null) {
                        jnVar = new jn(1, (byte) 0);
                        this.c = jnVar;
                    }
                    jnVar.c(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.o) {
            j47.Z(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.o) {
                    this.o = true;
                    if (this.b) {
                        jn jnVar = this.c;
                        if (jnVar == null) {
                            jnVar = new jn(1, (byte) 0);
                            this.c = jnVar;
                        }
                        ((Object[]) jnVar.c)[0] = new fv9(th);
                        return;
                    }
                    this.b = true;
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

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        this.a.a(f2aVar);
    }

    @Override // defpackage.b7b
    public final boolean test(Object obj) {
        return hv9.b(this.a, obj);
    }

    public final void z() {
        jn jnVar;
        while (true) {
            synchronized (this) {
                try {
                    jnVar = this.c;
                    if (jnVar == null) {
                        this.b = false;
                        return;
                    }
                    this.c = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            jnVar.p(this);
        }
    }
}
