package defpackage;

/* loaded from: classes2.dex */
public final class jh3 {
    public static final jh3 f = new jh3(false, false, true, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public jh3(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static jh3 a(jh3 jh3Var, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z2 = jh3Var.b;
        }
        boolean z3 = jh3Var.c;
        boolean z4 = jh3Var.d;
        boolean z5 = jh3Var.e;
        jh3Var.getClass();
        return new jh3(z, z2, z3, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh3)) {
            return false;
        }
        jh3 jh3Var = (jh3) obj;
        return this.a == jh3Var.a && this.b == jh3Var.b && this.c == jh3Var.c && this.d == jh3Var.d && this.e == jh3Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ms2.d(ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Inet(isConnected=");
        sb.append(this.a);
        sb.append(", isValidated=");
        sb.append(this.b);
        sb.append(", isMetered=");
        sb.append(this.c);
        sb.append(", isRoaming=");
        sb.append(this.d);
        sb.append(", hasVpn=");
        return au1.j(sb, this.e, ")");
    }
}
