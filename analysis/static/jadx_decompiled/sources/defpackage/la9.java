package defpackage;

/* loaded from: classes2.dex */
public final class la9 {
    public final String a;
    public final String b;
    public final String c;

    public la9(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la9)) {
            return false;
        }
        la9 la9Var = (la9) obj;
        return tpa.f(this.a, la9Var.a) && tpa.f(this.b, la9Var.b) && tpa.f(this.c, la9Var.c);
    }

    public final int hashCode() {
        int iD = rh4.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MiniAppData(title=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", queryId=");
        return zr6.l(sb, this.c, ")");
    }
}
