package defpackage;

/* loaded from: classes2.dex */
public final class qv9 {
    public final long a;
    public final long b;

    public qv9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv9)) {
            return false;
        }
        qv9 qv9Var = (qv9) obj;
        return this.a == qv9Var.a && this.b == qv9Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationReadMarkDb(chatServerId=");
        sb.append(this.a);
        sb.append(", mark=");
        return zr6.k(sb, this.b, ")");
    }
}
