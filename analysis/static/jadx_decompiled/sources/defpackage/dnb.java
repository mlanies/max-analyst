package defpackage;

/* loaded from: classes.dex */
public final class dnb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public dnb(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnb)) {
            return false;
        }
        dnb dnbVar = (dnb) obj;
        return maf.a(this.a, dnbVar.a) && maf.a(this.b, dnbVar.b) && maf.a(this.c, dnbVar.c) && maf.a(this.d, dnbVar.d) && maf.a(this.e, dnbVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
