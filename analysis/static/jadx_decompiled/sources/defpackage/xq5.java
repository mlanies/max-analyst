package defpackage;

/* loaded from: classes.dex */
public final class xq5 extends dg4 implements gs5 {
    public xae X;
    public boolean Y;
    public final ol0 c;
    public final Object o;

    public xq5(vae vaeVar, Object obj, ol0 ol0Var) {
        super(vaeVar);
        this.c = ol0Var;
        this.o = obj;
    }

    @Override // defpackage.vae
    public final void b() {
        if (this.Y) {
            return;
        }
        this.Y = true;
        g(this.o);
    }

    @Override // defpackage.xae
    public final void cancel() {
        set(4);
        this.b = null;
        this.X.cancel();
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        if (this.Y) {
            return;
        }
        try {
            this.c.accept(this.o, obj);
        } catch (Throwable th) {
            c37.B(th);
            this.X.cancel();
            onError(th);
        }
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (zae.e(this.X, xaeVar)) {
            this.X = xaeVar;
            this.a.f(this);
            xaeVar.j(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        if (this.Y) {
            j47.Z(th);
        } else {
            this.Y = true;
            this.a.onError(th);
        }
    }
}
