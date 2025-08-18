package defpackage;

/* loaded from: classes2.dex */
public final class ml {
    public final String a;
    public final String b;
    public final String c;

    public ml(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml)) {
            return false;
        }
        ml mlVar = (ml) obj;
        return tpa.f(this.a, mlVar.a) && tpa.f(this.b, mlVar.b) && tpa.f(this.c, mlVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionKey=");
        sb.append(this.a);
        sb.append(", sessionSecret=");
        sb.append(this.b);
        sb.append(", apiEndpoint=");
        return zr6.l(sb, this.c, ")");
    }
}
