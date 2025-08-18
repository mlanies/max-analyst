package defpackage;

/* loaded from: classes2.dex */
public final class ntf implements rtf {
    public final String a;
    public final String b;
    public final a8g c;

    public ntf(a8g a8gVar, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = a8gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntf)) {
            return false;
        }
        ntf ntfVar = (ntf) obj;
        return tpa.f(this.a, ntfVar.a) && tpa.f(this.b, ntfVar.b) && tpa.f(this.c, ntfVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a8g a8gVar = this.c;
        return iHashCode2 + (a8gVar != null ? a8gVar.hashCode() : 0);
    }

    public final String toString() {
        return "AuthBiometry(title=" + this.a + ", reason=" + this.b + ", cryptoObject=" + this.c + ")";
    }
}
