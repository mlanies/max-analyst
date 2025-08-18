package defpackage;

/* loaded from: classes2.dex */
public final class me5 {
    public final long a;
    public final long b;

    public me5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me5)) {
            return false;
        }
        me5 me5Var = (me5) obj;
        return this.a == me5Var.a && this.b == me5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FcmNotificationHistoryDb(chatServerId=");
        sb.append(this.a);
        sb.append(", lastNotifyMessageId=");
        return zr6.k(sb, this.b, ")");
    }
}
