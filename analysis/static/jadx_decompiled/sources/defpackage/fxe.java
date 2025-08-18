package defpackage;

/* loaded from: classes2.dex */
public final class fxe {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public fxe(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxe)) {
            return false;
        }
        fxe fxeVar = (fxe) obj;
        return this.a == fxeVar.a && this.b == fxeVar.b && this.c == fxeVar.c && this.d == fxeVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + k7d.e(this.c, k7d.e(-855638017, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopbarBackgroundDefaultColors(neutral=");
        sb.append(this.a);
        sb.append(", neutralFade=");
        sb.append(this.b);
        sb.append(", primary=-855638017, themed=");
        sb.append(this.c);
        sb.append(", topbar=");
        return zr6.j(sb, this.d, ")");
    }
}
