package defpackage;

/* loaded from: classes2.dex */
public final class yy3 implements zy3 {
    public final long a;
    public final long b;

    public yy3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy3)) {
            return false;
        }
        yy3 yy3Var = (yy3) obj;
        return this.a == yy3Var.a && this.b == yy3Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(requestId=");
        sb.append(this.a);
        sb.append(", chatId=");
        return zr6.k(sb, this.b, ")");
    }
}
