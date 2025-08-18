package defpackage;

/* loaded from: classes2.dex */
public final class ph {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ph(long j, String str, String str2, String str3, String str4) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph)) {
            return false;
        }
        ph phVar = (ph) obj;
        return this.a == phVar.a && tpa.f(this.b, phVar.b) && tpa.f(this.c, phVar.c) && tpa.f(this.d, phVar.d) && tpa.f(this.e, phVar.e);
    }

    public final int hashCode() {
        int iD = rh4.d(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Animoji(id=");
        sb.append(this.a);
        sb.append(", emoji=");
        sb.append(this.b);
        sb.append(", lottieUrl=");
        sb.append(this.c);
        sb.append(", effectLottieUrl=");
        sb.append(this.d);
        sb.append(", iconUrl=");
        return zr6.l(sb, this.e, ")");
    }
}
