package defpackage;

/* loaded from: classes2.dex */
public final class rgd {
    public final jqe a;
    public final int b;
    public final boolean c = false;

    public rgd(int i, eqe eqeVar) {
        this.a = eqeVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgd)) {
            return false;
        }
        rgd rgdVar = (rgd) obj;
        return tpa.f(this.a, rgdVar.a) && this.b == rgdVar.b && this.c == rgdVar.c;
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
