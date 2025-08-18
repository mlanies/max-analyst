package defpackage;

/* loaded from: classes2.dex */
public final class ivc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public ivc(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivc)) {
            return false;
        }
        ivc ivcVar = (ivc) obj;
        return this.a == ivcVar.a && this.b == ivcVar.b && this.c == ivcVar.c && this.d == ivcVar.d && this.e == ivcVar.e && this.f == ivcVar.f && this.g == ivcVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ms2.d(ms2.d(k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenInfo(realHeight=");
        sb.append(this.a);
        sb.append(", realWidth=");
        sb.append(this.b);
        sb.append(", topInset=");
        sb.append(this.c);
        sb.append(", bottomInset=");
        sb.append(this.d);
        sb.append(", isWeakDevice=");
        sb.append(this.e);
        sb.append(", isLong=");
        sb.append(this.f);
        sb.append(", isWide=");
        return au1.j(sb, this.g, ")");
    }
}
