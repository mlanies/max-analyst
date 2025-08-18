package defpackage;

/* loaded from: classes2.dex */
public final class g9 {
    public final int a;
    public final int b;
    public final int c;

    public g9(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9)) {
            return false;
        }
        g9 g9Var = (g9) obj;
        return this.a == g9Var.a && this.b == g9Var.b && this.c == g9Var.c;
    }

    public final int hashCode() {
        return au1.s(this.c) + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddAdminsTabState(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", type=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? "null" : "CONTACTS" : "CHAT_MEMBERS");
        sb.append(")");
        return sb.toString();
    }
}
