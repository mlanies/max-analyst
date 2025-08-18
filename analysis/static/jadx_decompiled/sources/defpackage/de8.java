package defpackage;

/* loaded from: classes.dex */
public final class de8 {
    public final xj8 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public de8(xj8 xj8Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        np8.d(!z4 || z2);
        np8.d(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        np8.d(z5);
        this.a = xj8Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final de8 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new de8(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final de8 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new de8(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || de8.class != obj.getClass()) {
            return false;
        }
        de8 de8Var = (de8) obj;
        return this.b == de8Var.b && this.c == de8Var.c && this.d == de8Var.d && this.e == de8Var.e && this.f == de8Var.f && this.g == de8Var.g && this.h == de8Var.h && this.i == de8Var.i && maf.a(this.a, de8Var.a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
