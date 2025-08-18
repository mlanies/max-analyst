package defpackage;

/* loaded from: classes2.dex */
public final class b86 {
    public final a86 a;
    public int b;
    public boolean c;
    public final boolean d;

    public b86(a86 a86Var, int i, boolean z, boolean z2) {
        this.a = a86Var;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static b86 a(b86 b86Var, int i, boolean z, int i2) {
        a86 a86Var = b86Var.a;
        if ((i2 & 4) != 0) {
            z = b86Var.c;
        }
        boolean z2 = b86Var.d;
        b86Var.getClass();
        return new b86(a86Var, i, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b86)) {
            return false;
        }
        b86 b86Var = (b86) obj;
        return tpa.f(this.a, b86Var.a) && this.b == b86Var.b && this.c == b86Var.c && this.d == b86Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ms2.d(k7d.e(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "GalleryAlbum(type=" + this.a + ", totalCount=" + this.b + ", isLoaded=" + this.c + ", hasImages=" + this.d + ")";
    }
}
