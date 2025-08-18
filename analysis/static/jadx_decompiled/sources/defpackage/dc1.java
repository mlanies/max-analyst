package defpackage;

/* loaded from: classes2.dex */
public final class dc1 {
    public final String a;
    public final String b;
    public final long c;

    public dc1(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc1)) {
            return false;
        }
        dc1 dc1Var = (dc1) obj;
        return tpa.f(this.a, dc1Var.a) && tpa.f(this.b, dc1Var.b) && this.c == dc1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rh4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallLink(conversationId=");
        sb.append(this.a);
        sb.append(", joinLink=");
        sb.append(this.b);
        sb.append(", startedAt=");
        return zr6.k(sb, this.c, ")");
    }
}
