package defpackage;

/* loaded from: classes.dex */
public final class z6d extends vr5 {
    public volatile boolean X;
    public final vr5 b;
    public boolean c;
    public jn o;

    public z6d(c5f c5fVar) {
        this.b = c5fVar;
    }

    @Override // defpackage.vae
    public final void b() {
        if (this.X) {
            return;
        }
        synchronized (this) {
            try {
                if (this.X) {
                    return;
                }
                this.X = true;
                if (!this.c) {
                    this.c = true;
                    this.b.b();
                    return;
                }
                jn jnVar = this.o;
                if (jnVar == null) {
                    jnVar = new jn(1, (byte) 0);
                    this.o = jnVar;
                }
                jnVar.c(hv9.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        if (this.X) {
            return;
        }
        synchronized (this) {
            try {
                if (this.X) {
                    return;
                }
                if (!this.c) {
                    this.c = true;
                    this.b.e(obj);
                    h();
                } else {
                    jn jnVar = this.o;
                    if (jnVar == null) {
                        jnVar = new jn(1, (byte) 0);
                        this.o = jnVar;
                    }
                    jnVar.c(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        boolean z = true;
        if (!this.X) {
            synchronized (this) {
                try {
                    if (!this.X) {
                        if (this.c) {
                            jn jnVar = this.o;
                            if (jnVar == null) {
                                jnVar = new jn(1, (byte) 0);
                                this.o = jnVar;
                            }
                            jnVar.c(new gv9(xaeVar));
                            return;
                        }
                        this.c = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            xaeVar.cancel();
        } else {
            this.b.f(xaeVar);
            h();
        }
    }

    @Override // defpackage.wq5
    public final void g(vae vaeVar) {
        this.b.d(vaeVar);
    }

    public final void h() {
        jn jnVar;
        while (true) {
            synchronized (this) {
                try {
                    jnVar = this.o;
                    if (jnVar == null) {
                        this.c = false;
                        return;
                    }
                    this.o = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            jnVar.b(this.b);
        }
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        if (this.X) {
            j47.Z(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.X) {
                    this.X = true;
                    if (this.c) {
                        jn jnVar = this.o;
                        if (jnVar == null) {
                            jnVar = new jn(1, (byte) 0);
                            this.o = jnVar;
                        }
                        ((Object[]) jnVar.c)[0] = new fv9(th);
                        return;
                    }
                    this.c = true;
                    z = false;
                }
                if (z) {
                    j47.Z(th);
                } else {
                    this.b.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
