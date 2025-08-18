package defpackage;

/* loaded from: classes2.dex */
public final class w86 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final jic f;
    public final boolean g = false;
    public final jic h;

    public w86(int i, int i2, int i3, int i4, int i5, jic jicVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = jicVar;
        this.h = i5 <= 0 ? null : new jic(0.0f, i5, i5, 12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w86)) {
            return false;
        }
        w86 w86Var = (w86) obj;
        return this.a == w86Var.a && this.b == w86Var.b && this.c == w86Var.c && this.d == w86Var.d && this.e == w86Var.e && tpa.f(this.f, w86Var.f) && this.g == w86Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryUiOptions(cellSize=");
        sb.append(this.a);
        sb.append(", threshold=");
        sb.append(this.b);
        sb.append(", spanCount=");
        sb.append(this.c);
        sb.append(", spanSpacing=");
        sb.append(this.d);
        sb.append(", thumbnailSize=");
        sb.append(this.e);
        sb.append(", albumsCoverResizeOptions=");
        sb.append(this.f);
        sb.append(", isItemAnimatorEnabled=");
        return au1.j(sb, this.g, ")");
    }
}
