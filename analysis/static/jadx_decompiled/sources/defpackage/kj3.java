package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class kj3 {
    public static final kj3 i = new kj3(1, false, false, false, false, -1, -1, wz4.a);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final Set h;

    public kj3(int i2, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j;
        this.g = j2;
        this.h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kj3.class.equals(obj.getClass())) {
            return false;
        }
        kj3 kj3Var = (kj3) obj;
        if (this.b == kj3Var.b && this.c == kj3Var.c && this.d == kj3Var.d && this.e == kj3Var.e && this.f == kj3Var.f && this.g == kj3Var.g && this.a == kj3Var.a) {
            return tpa.f(this.h, kj3Var.h);
        }
        return false;
    }

    public final int hashCode() {
        int iS = ((((((((au1.s(this.a) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (iS + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return this.h.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
