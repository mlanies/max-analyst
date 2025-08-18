package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ze6 {
    public final ye6 a;
    public final af6 b;

    public ze6(ye6 ye6Var, af6 af6Var) {
        this.a = ye6Var;
        this.b = af6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze6)) {
            return false;
        }
        ze6 ze6Var = (ze6) obj;
        return tpa.f(this.a, ze6Var.a) && tpa.f(this.b, ze6Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GradientsBannerDKColors(background=" + this.a + ", stroke=" + this.b + ")";
    }
}
