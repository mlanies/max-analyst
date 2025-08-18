package defpackage;

/* loaded from: classes.dex */
public final class dcf {
    public final int a;
    public final int b;

    public dcf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcf)) {
            return false;
        }
        dcf dcfVar = (dcf) obj;
        return this.a == dcfVar.a && this.b == dcfVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerificationMarkColors(markColor=");
        sb.append(this.a);
        sb.append(", bgColor=");
        return zr6.j(sb, this.b, ")");
    }
}
