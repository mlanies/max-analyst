package defpackage;

/* loaded from: classes2.dex */
public final class zdd {
    public final jqe a;
    public final int b;
    public final boolean c;

    public zdd(int i, eqe eqeVar, boolean z) {
        this.a = eqeVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdd)) {
            return false;
        }
        zdd zddVar = (zdd) obj;
        return tpa.f(this.a, zddVar.a) && this.b == zddVar.b && this.c == zddVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k7d.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(title=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", isNegative=");
        return au1.j(sb, this.c, ")");
    }
}
