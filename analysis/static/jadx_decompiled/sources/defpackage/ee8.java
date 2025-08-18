package defpackage;

/* loaded from: classes.dex */
public final class ee8 {
    public final yj8 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public ee8(yj8 yj8Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        fm9.f(!z4 || z2);
        fm9.f(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        fm9.f(z5);
        this.a = yj8Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final ee8 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new ee8(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final ee8 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new ee8(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ee8.class != obj.getClass()) {
            return false;
        }
        ee8 ee8Var = (ee8) obj;
        return this.b == ee8Var.b && this.c == ee8Var.c && this.d == ee8Var.d && this.e == ee8Var.e && this.f == ee8Var.f && this.g == ee8Var.g && this.h == ee8Var.h && this.i == ee8Var.i && oaf.a(this.a, ee8Var.a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
