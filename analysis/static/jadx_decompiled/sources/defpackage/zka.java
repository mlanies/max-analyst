package defpackage;

/* loaded from: classes2.dex */
public final class zka {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d = false;

    public zka(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zka)) {
            return false;
        }
        zka zkaVar = (zka) obj;
        return this.a == zkaVar.a && this.b == zkaVar.b && this.c == zkaVar.c && this.d == zkaVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuItem(id=");
        sb.append(this.a);
        sb.append(", titleRes=");
        sb.append(this.b);
        sb.append(", iconRes=");
        sb.append(this.c);
        sb.append(", isDisabled=");
        return au1.j(sb, this.d, ")");
    }
}
