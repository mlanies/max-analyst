package defpackage;

/* loaded from: classes2.dex */
public final class n86 implements r86 {
    public final int a;
    public final String b;
    public final zp7 c;

    public n86(int i, String str, zp7 zp7Var) {
        this.a = i;
        this.b = str;
        this.c = zp7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n86)) {
            return false;
        }
        n86 n86Var = (n86) obj;
        return this.a == n86Var.a && tpa.f(this.b, n86Var.b) && tpa.f(this.c, n86Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rh4.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "OpenFullScreenMedia(uiPosition=" + this.a + ", albumId=" + this.b + ", item=" + this.c + ")";
    }
}
