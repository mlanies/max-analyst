package defpackage;

/* loaded from: classes.dex */
public final class gnc {
    public final int a;
    public final int b;

    public gnc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnc)) {
            return false;
        }
        gnc gncVar = (gnc) obj;
        return this.a == gncVar.a && this.b == gncVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconSize(width=");
        sb.append(this.a);
        sb.append(", height=");
        return zr6.j(sb, this.b, ")");
    }
}
