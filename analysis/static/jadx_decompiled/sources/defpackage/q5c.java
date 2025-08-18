package defpackage;

/* loaded from: classes2.dex */
public final class q5c extends r5c {
    public final long a;
    public final long b;
    public final float c;

    public q5c(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5c)) {
            return false;
        }
        q5c q5cVar = (q5c) obj;
        return this.a == q5cVar.a && this.b == q5cVar.b && Float.compare(this.c, q5cVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Uploading(messageId=" + this.a + ", totalBytes=" + this.b + ", progress=" + this.c + ")";
    }
}
