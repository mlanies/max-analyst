package defpackage;

/* loaded from: classes2.dex */
public final class wka implements yka {
    public final int a;
    public final int b;
    public final float c;
    public final int d;
    public final m56 e;

    public wka(int i, int i2, m56 m56Var, int i3) {
        i2 = (i3 & 8) != 0 ? wfa.O : i2;
        this.a = i;
        this.b = 4;
        this.c = 12.0f;
        this.d = i2;
        this.e = m56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wka)) {
            return false;
        }
        wka wkaVar = (wka) obj;
        return this.a == wkaVar.a && this.b == wkaVar.b && Float.compare(this.c, wkaVar.c) == 0 && this.d == wkaVar.d && tpa.f(this.e, wkaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k7d.e(this.d, ms2.c(k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), 31);
    }

    public final String toString() {
        return "CustomIcon(iconRes=" + this.a + ", padding=" + this.b + ", cornersRadius=" + this.c + ", iconColor=" + this.d + ", onClick=" + this.e + ")";
    }
}
