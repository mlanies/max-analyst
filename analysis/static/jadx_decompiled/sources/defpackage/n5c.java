package defpackage;

/* loaded from: classes2.dex */
public final class n5c extends r5c {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final Long e;
    public final Long f;

    public n5c(long j, long j2, float f, long j3, Long l, Long l2) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = l;
        this.f = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5c)) {
            return false;
        }
        n5c n5cVar = (n5c) obj;
        return this.a == n5cVar.a && this.b == n5cVar.b && Float.compare(this.c, n5cVar.c) == 0 && this.d == n5cVar.d && tpa.f(this.e, n5cVar.e) && tpa.f(this.f, n5cVar.f);
    }

    public final int hashCode() {
        int iM = h4f.m(ms2.c(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31), 31, this.d);
        Long l = this.e;
        int iHashCode = (iM + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "Downloading(messageId=" + this.a + ", totalBytes=" + this.b + ", progress=" + this.c + ", bytesDownloaded=" + this.d + ", fileId=" + this.e + ", fileSize=" + this.f + ")";
    }
}
