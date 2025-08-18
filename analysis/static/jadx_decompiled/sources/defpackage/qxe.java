package defpackage;

/* loaded from: classes2.dex */
public final class qxe {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public qxe(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxe)) {
            return false;
        }
        qxe qxeVar = (qxe) obj;
        return this.a == qxeVar.a && this.b == qxeVar.b && this.c == qxeVar.c && this.d == qxeVar.d && this.e == qxeVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopbarTextDisabledColors(contrast=");
        sb.append(this.a);
        sb.append(", contrastStatic=");
        sb.append(this.b);
        sb.append(", primary=");
        sb.append(this.c);
        sb.append(", secondary=");
        sb.append(this.d);
        sb.append(", themed=");
        return zr6.j(sb, this.e, ")");
    }
}
