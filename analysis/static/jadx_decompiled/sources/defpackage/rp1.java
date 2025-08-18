package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class rp1 implements up1 {
    public final jqe a;
    public final jqe b;
    public final List c;
    public final long d;

    public rp1(gqe gqeVar, iqe iqeVar, kl7 kl7Var, long j) {
        this.a = gqeVar;
        this.b = iqeVar;
        this.c = kl7Var;
        this.d = j;
    }

    @Override // defpackage.up1
    public final long a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp1)) {
            return false;
        }
        rp1 rp1Var = (rp1) obj;
        return tpa.f(this.a, rp1Var.a) && tpa.f(this.b, rp1Var.b) && tpa.f(this.c, rp1Var.c) && this.d == rp1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + k7d.g(this.c, k7d.f(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "Multi(title=" + this.a + ", subtitle=" + this.b + ", avatarInfo=" + this.c + ", lastUpdate=" + this.d + ")";
    }
}
