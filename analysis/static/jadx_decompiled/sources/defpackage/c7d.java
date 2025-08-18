package defpackage;

/* loaded from: classes.dex */
public final class c7d implements gs5, xae {
    public volatile boolean X;
    public final vae a;
    public xae b;
    public boolean c;
    public jn o;

    public c7d(vae vaeVar) {
        this.a = vaeVar;
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

    @Override // defpackage.xae
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        jn jnVar;
        if (this.X) {
            return;
        }
        if (obj == null) {
            this.b.cancel();
            onError(q45.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.X) {
                    return;
                }
                if (this.c) {
                    jn jnVar2 = this.o;
                    if (jnVar2 == null) {
                        jnVar2 = new jn(1, (byte) 0);
                        this.o = jnVar2;
                    }
                    jnVar2.c(obj);
                    return;
                }
                this.c = true;
                this.a.e(obj);
                do {
                    synchronized (this) {
                        try {
                            jnVar = this.o;
                            if (jnVar == null) {
                                this.c = false;
                                return;
                            }
                            this.o = null;
                        } finally {
                        }
                    }
                } while (!jnVar.b(this.a));
            } finally {
            }
        }
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (zae.e(this.b, xaeVar)) {
            this.b = xaeVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.xae
    public final void j(long j) {
        this.b.j(j);
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
