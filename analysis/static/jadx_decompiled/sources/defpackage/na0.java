package defpackage;

/* loaded from: classes.dex */
public final class na0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public na0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof na0)) {
            return false;
        }
        na0 na0Var = (na0) obj;
        return this.a.equals(na0Var.a) && this.b.equals(na0Var.b) && this.c.equals(na0Var.c) && this.d.equals(na0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.a);
        sb.append(", eglVersion=");
        sb.append(this.b);
        sb.append(", glExtensions=");
        sb.append(this.c);
        sb.append(", eglExtensions=");
        return zr6.l(sb, this.d, "}");
    }
}
