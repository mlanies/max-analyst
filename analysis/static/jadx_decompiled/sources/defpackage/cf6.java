package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class cf6 {
    public final ze6 a;
    public final bf6 b;
    public final df6 c;
    public final ef6 d;
    public final ff6 e;
    public final nf6 f;
    public final of6 g;
    public final qf6 h;

    public cf6(ze6 ze6Var, bf6 bf6Var, df6 df6Var, ef6 ef6Var, ff6 ff6Var, nf6 nf6Var, of6 of6Var, qf6 qf6Var) {
        this.a = ze6Var;
        this.b = bf6Var;
        this.c = df6Var;
        this.d = ef6Var;
        this.e = ff6Var;
        this.f = nf6Var;
        this.g = of6Var;
        this.h = qf6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf6)) {
            return false;
        }
        cf6 cf6Var = (cf6) obj;
        return tpa.f(this.a, cf6Var.a) && tpa.f(this.b, cf6Var.b) && tpa.f(this.c, cf6Var.c) && tpa.f(this.d, cf6Var.d) && tpa.f(this.e, cf6Var.e) && tpa.f(this.f, cf6Var.f) && tpa.f(this.g, cf6Var.g) && tpa.f(this.h, cf6Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((Arrays.hashCode(this.f.a) + ((this.e.hashCode() + ((this.d.hashCode() + ((Arrays.hashCode(this.c.a) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GradientsColors(bannerDK=" + this.a + ", buttonTextPromo=" + this.b + ", complex=" + this.c + ", emptyBlockIconWrapper=" + this.d + ", loadingIcon=" + this.e + ", local=" + this.f + ", overlay=" + this.g + ", skeletonGradient=" + this.h + ")";
    }
}
