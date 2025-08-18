package defpackage;

/* loaded from: classes2.dex */
public final class mpb extends di0 {
    public final int j;

    public mpb(cjg cjgVar, eh3 eh3Var, zwd zwdVar, ai3 ai3Var, int i) {
        super(cjgVar, eh3Var, zwdVar, ai3Var);
        this.j = i;
    }

    @Override // defpackage.k33
    public final void close() {
    }

    @Override // defpackage.k33
    public final int d() {
        return ((Number) this.f.d.getValue()).intValue();
    }

    @Override // defpackage.k33
    public final void g(boolean z) {
    }

    @Override // defpackage.k33
    public final String i() {
        return this.f.a;
    }

    @Override // defpackage.k33
    public final int j() {
        return this.j;
    }

    public final String toString() {
        return "ProxyClient{connectionHost=" + this.f + "}";
    }
}
