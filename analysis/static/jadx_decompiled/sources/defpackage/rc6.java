package defpackage;

/* loaded from: classes2.dex */
public final class rc6 {
    public final String a;
    public final String b;
    public final uc0 c;

    public rc6(String str, String str2, uc0 uc0Var) {
        this.a = str;
        this.b = str2;
        this.c = uc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc6)) {
            return false;
        }
        rc6 rc6Var = (rc6) obj;
        return tpa.f(this.a, rc6Var.a) && tpa.f(this.b, rc6Var.b) && tpa.f(this.c, rc6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rh4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WebAppContactData(displayName=" + this.a + ", avatarUrl=" + this.b + ", abbreviationModel=" + this.c + ")";
    }
}
