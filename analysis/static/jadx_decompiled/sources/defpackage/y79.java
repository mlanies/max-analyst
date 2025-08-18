package defpackage;

/* loaded from: classes2.dex */
public final class y79 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final long f;

    public y79(int i, boolean z, boolean z2, boolean z3, long j, long j2, int i2) {
        z = (i2 & 2) != 0 ? false : z;
        z2 = (i2 & 4) != 0 ? false : z2;
        z3 = (i2 & 8) != 0 ? false : z3;
        j = (i2 & 16) != 0 ? 0L : j;
        j2 = (i2 & 32) != 0 ? 0L : j2;
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y79)) {
            return false;
        }
        y79 y79Var = (y79) obj;
        return this.a == y79Var.a && this.b == y79Var.b && this.c == y79Var.c && this.d == y79Var.d && this.e == y79Var.e && this.f == y79Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + h4f.m(ms2.d(ms2.d(ms2.d(au1.s(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollWork(scrollType=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "TO_ANCHOR" : "TO_LAST_NEW" : "TO_LAST" : "TO_UNREAD");
        sb.append(", highlight=");
        sb.append(this.b);
        sb.append(", instant=");
        sb.append(this.c);
        sb.append(", alignToBottom=");
        sb.append(this.d);
        sb.append(", msgId=");
        sb.append(this.e);
        sb.append(", time=");
        return zr6.k(sb, this.f, ")");
    }
}
