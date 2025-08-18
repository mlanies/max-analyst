package defpackage;

/* loaded from: classes.dex */
public final class tte implements grc {
    public final grc a;
    public final long b;

    public tte(grc grcVar, long j) {
        this.a = grcVar;
        this.b = j;
    }

    @Override // defpackage.grc
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.grc
    public final boolean d() {
        return this.a.d();
    }

    @Override // defpackage.grc
    public final int e(long j) {
        return this.a.e(j - this.b);
    }

    @Override // defpackage.grc
    public final int j(y7g y7gVar, p54 p54Var, int i) {
        int iJ = this.a.j(y7gVar, p54Var, i);
        if (iJ == -4) {
            p54Var.Z += this.b;
        }
        return iJ;
    }
}
