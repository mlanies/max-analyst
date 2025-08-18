package defpackage;

/* loaded from: classes2.dex */
public final class gxe {
    public final int a;
    public final int b;
    public final int c;

    public gxe(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxe)) {
            return false;
        }
        gxe gxeVar = (gxe) obj;
        return this.a == gxeVar.a && this.b == gxeVar.b && this.c == gxeVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopbarBackgroundDisabledColors(neutral=");
        sb.append(this.a);
        sb.append(", neutralFade=");
        sb.append(this.b);
        sb.append(", themed=");
        return zr6.j(sb, this.c, ")");
    }
}
