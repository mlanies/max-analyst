package defpackage;

/* loaded from: classes2.dex */
public final class yrc {
    public final long a;
    public final long b;

    public yrc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrc)) {
            return false;
        }
        yrc yrcVar = (yrc) obj;
        return this.a == yrcVar.a && this.b == yrcVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedMessagesChatEntity(userId=");
        sb.append(this.a);
        sb.append(", chatId=");
        return zr6.k(sb, this.b, ")");
    }
}
