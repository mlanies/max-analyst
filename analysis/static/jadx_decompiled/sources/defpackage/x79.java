package defpackage;

/* loaded from: classes2.dex */
public final class x79 {
    public final long a;
    public final boolean b;

    public x79(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x79)) {
            return false;
        }
        x79 x79Var = (x79) obj;
        return this.a == x79Var.a && this.b == x79Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorState(anchor=");
        sb.append(this.a);
        sb.append(", byChatReadMark=");
        return au1.j(sb, this.b, ")");
    }
}
