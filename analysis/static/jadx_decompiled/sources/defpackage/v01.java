package defpackage;

/* loaded from: classes2.dex */
public final class v01 implements w01 {
    public final long a;
    public final boolean b;

    public v01(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v01)) {
            return false;
        }
        v01 v01Var = (v01) obj;
        return this.a == v01Var.a && this.b == v01Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneToOne(opponentId=");
        sb.append(this.a);
        sb.append(", isVideo=");
        return au1.j(sb, this.b, ")");
    }
}
