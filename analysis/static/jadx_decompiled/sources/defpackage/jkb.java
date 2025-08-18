package defpackage;

/* loaded from: classes2.dex */
public final class jkb extends ka1 {
    public final long b;
    public final hdb c;

    public jkb(long j, hdb hdbVar) {
        super(11);
        this.b = j;
        this.c = hdbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkb)) {
            return false;
        }
        jkb jkbVar = (jkb) obj;
        return this.b == jkbVar.b && this.c == jkbVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "EditProfile(id=" + this.b + ", type=" + this.c + ")";
    }
}
