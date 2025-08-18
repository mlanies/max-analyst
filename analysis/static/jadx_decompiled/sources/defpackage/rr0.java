package defpackage;

/* loaded from: classes2.dex */
public final class rr0 extends dl {
    public final qr0 b;
    public final sr0 c;

    public rr0(qr0 qr0Var, sr0 sr0Var) {
        super(qr0Var.a);
        this.b = qr0Var;
        this.c = sr0Var;
    }

    @Override // defpackage.dl
    public final boolean a() {
        this.b.getClass();
        return this.c.canRepeat();
    }

    @Override // defpackage.dl
    public final boolean b() {
        return this.c.isSupplied();
    }

    @Override // defpackage.dl
    public final boolean c() {
        this.b.getClass();
        return this.c.shouldPost();
    }

    @Override // defpackage.dl
    public final void d(kb7 kb7Var) {
        sr0 sr0Var = this.c;
        if (sr0Var.shouldSkipParam()) {
            kb7Var.getClass();
        } else {
            kb7Var.g0(this.b.a);
            sr0Var.write(kb7Var);
        }
    }

    public final String toString() {
        return this.a + " = " + this.c;
    }
}
