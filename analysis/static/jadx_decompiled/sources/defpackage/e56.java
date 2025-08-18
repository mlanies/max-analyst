package defpackage;

/* loaded from: classes2.dex */
public final class e56 {
    public final String a;
    public final String b;
    public final e56 c;

    public e56(String str, String str2, e56 e56Var) {
        this.a = str;
        this.b = str2;
        this.c = e56Var;
    }

    public static e56 a(e56 e56Var, String str) {
        String str2 = e56Var.a;
        e56 e56Var2 = e56Var.c;
        e56Var.getClass();
        return new e56(str2, str, e56Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e56)) {
            return false;
        }
        e56 e56Var = (e56) obj;
        return tpa.f(this.a, e56Var.a) && tpa.f(this.b, e56Var.b) && tpa.f(this.c, e56Var.c);
    }

    public final int hashCode() {
        int iD = rh4.d(this.a.hashCode() * 31, 31, this.b);
        e56 e56Var = this.c;
        return iD + (e56Var == null ? 0 : e56Var.hashCode());
    }

    public final String toString() {
        return "Result(normalized=" + this.a + ", original=" + this.b + ", noEmoji=" + this.c + ")";
    }
}
