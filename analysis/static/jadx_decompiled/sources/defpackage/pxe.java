package defpackage;

/* loaded from: classes2.dex */
public final class pxe {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public pxe(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxe)) {
            return false;
        }
        pxe pxeVar = (pxe) obj;
        return this.a == pxeVar.a && this.b == pxeVar.b && this.c == pxeVar.c && this.d == pxeVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + k7d.e(this.c, k7d.e(this.b, k7d.e(-1, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopbarTextDefaultColors(contrast=");
        sb.append(this.a);
        sb.append(", contrastStatic=-1, primary=");
        sb.append(this.b);
        sb.append(", secondary=");
        sb.append(this.c);
        sb.append(", themed=");
        return zr6.j(sb, this.d, ")");
    }
}
