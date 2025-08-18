package defpackage;

/* loaded from: classes2.dex */
public final class dre {
    public final int a;
    public final int b;
    public final int c;

    public dre(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dre)) {
            return false;
        }
        dre dreVar = (dre) obj;
        return this.a == dreVar.a && this.b == dreVar.b && this.c == dreVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextsUiModel(titleRes=");
        sb.append(this.a);
        sb.append(", descriptionRes=");
        sb.append(this.b);
        sb.append(", buttonRes=");
        return zr6.j(sb, this.c, ")");
    }
}
