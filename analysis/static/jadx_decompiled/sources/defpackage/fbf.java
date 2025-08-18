package defpackage;

/* loaded from: classes2.dex */
public final class fbf {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public fbf(String str, int i, int i2, int i3, boolean z, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbf)) {
            return false;
        }
        fbf fbfVar = (fbf) obj;
        return tpa.f(this.a, fbfVar.a) && this.b == fbfVar.b && this.c == fbfVar.c && this.d == fbfVar.d && this.e == fbfVar.e && this.f == fbfVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ms2.d(k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pattern(image=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", opacity=");
        sb.append(this.d);
        sb.append(", isOverlay=");
        sb.append(this.e);
        sb.append(", color=");
        return zr6.j(sb, this.f, ")");
    }
}
