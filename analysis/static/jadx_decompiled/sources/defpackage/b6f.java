package defpackage;

/* loaded from: classes2.dex */
public final class b6f {
    public final long a;
    public final k8g b;
    public final int c;

    public b6f(long j, k8g k8gVar, int i) {
        this.a = j;
        this.b = k8gVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6f)) {
            return false;
        }
        b6f b6fVar = (b6f) obj;
        return this.a == b6fVar.a && tpa.f(this.b, b6fVar.b) && this.c == b6fVar.c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        k8g k8gVar = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (k8gVar == null ? 0 : k8gVar.hashCode())) * 31);
    }

    public final String toString() {
        return "UpdateAttachesEntity(id=" + this.a + ", attaches=" + this.b + ", mediaType=" + this.c + ")";
    }
}
