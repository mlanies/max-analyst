package defpackage;

/* loaded from: classes2.dex */
public final class kg2 extends pg2 {
    public final long b;
    public final long c;

    public kg2(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg2)) {
            return false;
        }
        kg2 kg2Var = (kg2) obj;
        return this.b == kg2Var.b && this.c == kg2Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenMessage(chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        return zr6.k(sb, this.c, ")");
    }
}
