package defpackage;

/* loaded from: classes2.dex */
public final class o5c extends r5c {
    public final long a;
    public final long b;

    public o5c(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5c)) {
            return false;
        }
        o5c o5cVar = (o5c) obj;
        return this.a == o5cVar.a && this.b == o5cVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeedDownload(messageId=");
        sb.append(this.a);
        sb.append(", totalBytes=");
        return zr6.k(sb, this.b, ")");
    }
}
