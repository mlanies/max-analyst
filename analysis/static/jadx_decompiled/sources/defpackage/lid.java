package defpackage;

/* loaded from: classes2.dex */
public final class lid {
    public final int a;
    public final jqe b;
    public final boolean c;

    public lid(int i, eqe eqeVar, boolean z) {
        this.a = i;
        this.b = eqeVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lid)) {
            return false;
        }
        lid lidVar = (lid) obj;
        return this.a == lidVar.a && tpa.f(this.b, lidVar.b) && this.c == lidVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k7d.f(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", isNegative=");
        return au1.j(sb, this.c, ")");
    }
}
