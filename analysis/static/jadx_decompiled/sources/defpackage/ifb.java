package defpackage;

/* loaded from: classes2.dex */
public final class ifb extends ka1 {
    public final long b;
    public final reb c;

    public ifb(long j, reb rebVar) {
        super(9);
        this.b = j;
        this.c = rebVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifb)) {
            return false;
        }
        ifb ifbVar = (ifb) obj;
        return this.b == ifbVar.b && this.c == ifbVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ChangeLink(id=" + this.b + ", type=" + this.c + ")";
    }
}
