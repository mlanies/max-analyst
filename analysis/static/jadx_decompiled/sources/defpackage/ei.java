package defpackage;

/* loaded from: classes2.dex */
public final class ei {
    public final long a;
    public final int b;

    public ei(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei)) {
            return false;
        }
        ei eiVar = (ei) obj;
        return this.a == eiVar.a && this.b == eiVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Key(animojiId=" + this.a + ", size=" + this.b + ")";
    }
}
