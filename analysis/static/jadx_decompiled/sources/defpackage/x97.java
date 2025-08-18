package defpackage;

/* loaded from: classes2.dex */
public final class x97 implements z97 {
    public final String a;
    public final String b;

    public x97(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x97)) {
            return false;
        }
        x97 x97Var = (x97) obj;
        return tpa.f(this.a, x97Var.a) && tpa.f(this.b, x97Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsEvent(name=");
        sb.append(this.a);
        sb.append(", data=");
        return zr6.l(sb, this.b, ")");
    }
}
