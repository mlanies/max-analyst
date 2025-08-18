package defpackage;

/* loaded from: classes.dex */
public final class ai4 {
    public final String a;
    public final String b;
    public final String c;

    public ai4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ai4.class != obj.getClass()) {
            return false;
        }
        ai4 ai4Var = (ai4) obj;
        return oaf.a(this.a, ai4Var.a) && oaf.a(this.b, ai4Var.b) && oaf.a(this.c, ai4Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
