package defpackage;

/* loaded from: classes2.dex */
public final class ff6 {
    public final gf6 a;
    public final hf6 b;
    public final if6 c;
    public final jf6 d;
    public final kf6 e;
    public final lf6 f;
    public final mf6 g;

    public ff6(gf6 gf6Var, hf6 hf6Var, if6 if6Var, jf6 jf6Var, kf6 kf6Var, lf6 lf6Var, mf6 mf6Var) {
        this.a = gf6Var;
        this.b = hf6Var;
        this.c = if6Var;
        this.d = jf6Var;
        this.e = kf6Var;
        this.f = lf6Var;
        this.g = mf6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff6)) {
            return false;
        }
        ff6 ff6Var = (ff6) obj;
        return tpa.f(this.a, ff6Var.a) && tpa.f(this.b, ff6Var.b) && tpa.f(this.c, ff6Var.c) && tpa.f(this.d, ff6Var.d) && tpa.f(this.e, ff6Var.e) && tpa.f(this.f, ff6Var.f) && tpa.f(this.g, ff6Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GradientsLoadingIconColors(contrast=" + this.a + ", contrastStatic=" + this.b + ", negative=" + this.c + ", neutralThemed=" + this.d + ", primary=" + this.e + ", primaryStatic=" + this.f + ", themed=" + this.g + ")";
    }
}
