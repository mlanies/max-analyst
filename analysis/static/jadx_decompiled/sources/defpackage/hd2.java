package defpackage;

/* loaded from: classes.dex */
public final class hd2 {
    public final long a;
    public final fi9 b;

    public hd2(long j, fi9 fi9Var) {
        this.a = j;
        this.b = fi9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd2)) {
            return false;
        }
        hd2 hd2Var = (hd2) obj;
        return this.a == hd2Var.a && tpa.f(this.b, hd2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TypingCacheKey(chatId=" + this.a + ", notifs=" + this.b + ")";
    }
}
