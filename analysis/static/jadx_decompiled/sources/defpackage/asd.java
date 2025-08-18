package defpackage;

/* loaded from: classes.dex */
public final class asd extends dg4 implements erd {
    public zl4 c;

    @Override // defpackage.erd
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.c, zl4Var)) {
            this.c = zl4Var;
            this.a.f(this);
        }
    }

    @Override // defpackage.xae
    public final void cancel() {
        set(4);
        this.b = null;
        this.c.g();
    }

    @Override // defpackage.erd
    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
