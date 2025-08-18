package defpackage;

/* loaded from: classes2.dex */
public final class etf {
    public static final dtf Companion = new dtf();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ etf(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            ju0.I(i, 7, ctf.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etf)) {
            return false;
        }
        etf etfVar = (etf) obj;
        return tpa.f(this.a, etfVar.a) && tpa.f(this.b, etfVar.b) && tpa.f(this.c, etfVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = rh4.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryAuthRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", reason=");
        return zr6.l(sb, this.c, ")");
    }
}
