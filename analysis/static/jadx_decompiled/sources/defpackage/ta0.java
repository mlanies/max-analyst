package defpackage;

/* loaded from: classes.dex */
public final class ta0 {
    public final String a;
    public final String b;
    public final String c;
    public final gc0 d;
    public final int e;

    public ta0(String str, String str2, String str3, gc0 gc0Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gc0Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ta0)) {
            return false;
        }
        ta0 ta0Var = (ta0) obj;
        String str = this.a;
        if (str != null ? str.equals(ta0Var.a) : ta0Var.a == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(ta0Var.b) : ta0Var.b == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(ta0Var.c) : ta0Var.c == null) {
                    gc0 gc0Var = this.d;
                    if (gc0Var != null ? gc0Var.equals(ta0Var.d) : ta0Var.d == null) {
                        int i = this.e;
                        if (i == 0) {
                            if (ta0Var.e == 0) {
                                return true;
                            }
                        } else if (au1.c(i, ta0Var.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        gc0 gc0Var = this.d;
        int iHashCode4 = (iHashCode3 ^ (gc0Var == null ? 0 : gc0Var.hashCode())) * 1000003;
        int i = this.e;
        return iHashCode4 ^ (i != 0 ? au1.s(i) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
