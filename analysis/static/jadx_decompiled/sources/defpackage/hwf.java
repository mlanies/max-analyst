package defpackage;

/* loaded from: classes2.dex */
public final class hwf {
    public static final gwf Companion = new gwf();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ hwf(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            ju0.I(i, 15, fwf.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwf)) {
            return false;
        }
        hwf hwfVar = (hwf) obj;
        return tpa.f(this.a, hwfVar.a) && tpa.f(this.b, hwfVar.b) && tpa.f(this.c, hwfVar.c) && tpa.f(this.d, hwfVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = rh4.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryUpdateTokenRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", reason=");
        sb.append(this.c);
        sb.append(", token=");
        return zr6.l(sb, this.d, ")");
    }
}
