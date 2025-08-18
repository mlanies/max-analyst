package defpackage;

/* loaded from: classes2.dex */
public final class fz {
    public final String a;
    public final String b;
    public final Integer c;

    public fz(String str, Integer num, String str2) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz)) {
            return false;
        }
        fz fzVar = (fz) obj;
        return tpa.f(this.a, fzVar.a) && tpa.f(this.b, fzVar.b) && tpa.f(this.c, fzVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "AttachData(attachName=" + this.a + ", image=" + this.b + ", placeholder=" + this.c + ")";
    }
}
