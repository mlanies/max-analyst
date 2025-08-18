package defpackage;

/* loaded from: classes2.dex */
public final class od9 {
    public final String a;
    public final int b;
    public final int c;

    public od9(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od9)) {
            return false;
        }
        od9 od9Var = (od9) obj;
        return tpa.f(this.a, od9Var.a) && this.b == od9Var.b && this.c == od9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + s36.c(this.b, this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Quality(link=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return zr6.j(sb, this.c, ")");
    }
}
