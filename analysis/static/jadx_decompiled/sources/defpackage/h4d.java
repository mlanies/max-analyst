package defpackage;

/* loaded from: classes2.dex */
public final class h4d extends j4d {
    public final String b;
    public final long c;
    public final int d;

    public h4d(long j, String str, int i) {
        super(str);
        this.b = str;
        this.c = j;
        this.d = i;
    }

    @Override // defpackage.j4d
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4d)) {
            return false;
        }
        h4d h4dVar = (h4d) obj;
        return tpa.f(this.b, h4dVar.b) && this.c == h4dVar.c && this.d == h4dVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + h4f.m(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Neuro(uri=");
        sb.append(this.b);
        sb.append(", photoId=");
        sb.append(this.c);
        sb.append(", categoryId=");
        return zr6.j(sb, this.d, ")");
    }
}
