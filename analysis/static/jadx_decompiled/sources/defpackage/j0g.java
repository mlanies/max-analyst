package defpackage;

/* loaded from: classes2.dex */
public final class j0g {
    public final String a;
    public final a8g b;

    public j0g(String str, a8g a8gVar) {
        this.a = str;
        this.b = a8gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0g)) {
            return false;
        }
        j0g j0gVar = (j0g) obj;
        return tpa.f(this.a, j0gVar.a) && tpa.f(this.b, j0gVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        a8g a8gVar = this.b;
        return iHashCode + (a8gVar == null ? 0 : a8gVar.hashCode());
    }

    public final String toString() {
        return "AuthBiometry(title=" + this.a + ", cryptoObject=" + this.b + ")";
    }
}
