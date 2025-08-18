package defpackage;

/* loaded from: classes.dex */
public final class ou6 {
    public static final ou6 c = new ou6("UNKNOWN", null);
    public final String a;
    public final String b;

    public ou6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou6)) {
            return false;
        }
        ou6 ou6Var = (ou6) obj;
        return tpa.f(this.a, ou6Var.a) && tpa.f(this.b, ou6Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.a;
    }
}
