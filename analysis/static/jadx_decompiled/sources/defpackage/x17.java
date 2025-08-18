package defpackage;

/* loaded from: classes2.dex */
public final class x17 extends wm9 {
    public final String b;
    public final String c;
    public final int d;

    public x17(String str, String str2, int i) {
        super(e5f.a);
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x17)) {
            return false;
        }
        x17 x17Var = (x17) obj;
        return tpa.f(this.b, x17Var.b) && tpa.f(this.c, x17Var.c) && this.d == x17Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rh4.d(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneConfirmScreen(verifyToken=");
        sb.append(this.b);
        sb.append(", phone=");
        sb.append(this.c);
        sb.append(", codeLength=");
        return zr6.j(sb, this.d, ")");
    }
}
