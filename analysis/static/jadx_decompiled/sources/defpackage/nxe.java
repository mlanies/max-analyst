package defpackage;

/* loaded from: classes2.dex */
public final class nxe {
    public final int a;
    public final int b;

    public nxe(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxe)) {
            return false;
        }
        nxe nxeVar = (nxe) obj;
        return this.a == nxeVar.a && this.b == nxeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopbarStrokeSeparatorDefaultColors(primary=");
        sb.append(this.a);
        sb.append(", secondary=");
        return zr6.j(sb, this.b, ")");
    }
}
