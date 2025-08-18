package defpackage;

/* loaded from: classes2.dex */
public final class df2 implements hf2 {
    public final long a;

    public df2(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df2) && this.a == ((df2) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("DownloadError(messageId="), this.a, ")");
    }
}
