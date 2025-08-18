package defpackage;

/* loaded from: classes2.dex */
public final class j2b implements l2b {
    public final String a;
    public final long b;
    public final int c;

    public j2b(long j, String str, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2b)) {
            return false;
        }
        j2b j2bVar = (j2b) obj;
        return tpa.f(this.a, j2bVar.a) && this.b == j2bVar.b && this.c == j2bVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + h4f.m(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeuroAvatar(url=");
        sb.append(this.a);
        sb.append(", photoId=");
        sb.append(this.b);
        sb.append(", categoryId=");
        return zr6.j(sb, this.c, ")");
    }
}
