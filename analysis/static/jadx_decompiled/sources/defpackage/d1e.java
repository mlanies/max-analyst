package defpackage;

/* loaded from: classes2.dex */
public final class d1e {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public d1e(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1e)) {
            return false;
        }
        d1e d1eVar = (d1e) obj;
        d1eVar.getClass();
        return this.a == d1eVar.a && this.b == d1eVar.b && this.c == d1eVar.c && this.d == d1eVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + k7d.e(this.c, k7d.e(this.b, k7d.e(this.a, Integer.hashCode(-4473925) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatesTextActiveColors(contrastStatic=-4473925, negative=");
        sb.append(this.a);
        sb.append(", neutralThemed=");
        sb.append(this.b);
        sb.append(", primary=");
        sb.append(this.c);
        sb.append(", themed=");
        return zr6.j(sb, this.d, ")");
    }
}
