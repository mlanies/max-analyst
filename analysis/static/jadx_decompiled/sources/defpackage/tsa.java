package defpackage;

/* loaded from: classes2.dex */
public final class tsa {
    public final int a;
    public final int b;

    public tsa(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsa)) {
            return false;
        }
        tsa tsaVar = (tsa) obj;
        return this.a == tsaVar.a && this.b == tsaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bitrate(dimension=");
        sb.append(this.a);
        sb.append(", bitrate=");
        return zr6.j(sb, this.b, ")");
    }
}
