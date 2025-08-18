package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gl4 {
    public final long a;
    public final String b;
    public final boolean c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public gl4(long j, String str, boolean z, List list, boolean z2, boolean z3, int i) {
        z = (i & 4) != 0 ? false : z;
        list = (i & 8) != 0 ? nz4.a : list;
        z2 = (i & 16) != 0 ? false : z2;
        z3 = (i & 32) != 0 ? false : z3;
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl4)) {
            return false;
        }
        gl4 gl4Var = (gl4) obj;
        return this.a == gl4Var.a && tpa.f(this.b, gl4Var.b) && this.c == gl4Var.c && tpa.f(this.d, gl4Var.d) && this.e == gl4Var.e && this.f == gl4Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iD = rh4.d(Long.hashCode(this.a) * 31, 31, this.b);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iG = k7d.g(this.d, (iD + i) * 31, 31);
        boolean z2 = this.e;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (iG + i2) * 31;
        boolean z3 = this.f;
        return i3 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public final String toString() {
        return "SpaceConsumer(size=" + this.a + ", name=" + this.b + ", isDirectory=" + this.c + ", children=" + this.d + ", overflow=" + this.e + ", excluded=" + this.f + ')';
    }
}
