package defpackage;

/* loaded from: classes.dex */
public final class zh4 {
    public final String a;
    public final String b;
    public final String c;

    public zh4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zh4.class != obj.getClass()) {
            return false;
        }
        zh4 zh4Var = (zh4) obj;
        return maf.a(this.a, zh4Var.a) && maf.a(this.b, zh4Var.b) && maf.a(this.c, zh4Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
