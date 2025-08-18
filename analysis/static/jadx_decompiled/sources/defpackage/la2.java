package defpackage;

/* loaded from: classes2.dex */
public final class la2 {
    public final long a;
    public final long b;
    public final k92 c;
    public final long d;
    public final long e;
    public final long f;

    public la2(long j, long j2, k92 k92Var, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = k92Var;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la2)) {
            return false;
        }
        la2 la2Var = (la2) obj;
        return this.a == la2Var.a && this.b == la2Var.b && tpa.f(this.c, la2Var.c) && this.d == la2Var.d && this.e == la2Var.e && this.f == la2Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + h4f.m(h4f.m((this.c.hashCode() + h4f.m(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatEntity(id=");
        sb.append(this.a);
        sb.append(", serverId=");
        sb.append(this.b);
        sb.append(", chatData=");
        sb.append(this.c);
        sb.append(", favouriteIndex=");
        sb.append(this.d);
        sb.append(", sortTime=");
        sb.append(this.e);
        sb.append(", cid=");
        return zr6.k(sb, this.f, ")");
    }
}
