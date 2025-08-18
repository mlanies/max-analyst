package defpackage;

/* loaded from: classes2.dex */
public final class ybe {
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final CharSequence e;
    public final String f;
    public final r7b g;
    public final String h;

    public ybe(long j, int i, String str, String str2, CharSequence charSequence, String str3, r7b r7bVar, String str4) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = charSequence;
        this.f = str3;
        this.g = r7bVar;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybe)) {
            return false;
        }
        ybe ybeVar = (ybe) obj;
        return this.a == ybeVar.a && this.b == ybeVar.b && tpa.f(this.c, ybeVar.c) && tpa.f(this.d, ybeVar.d) && tpa.f(this.e, ybeVar.e) && tpa.f(this.f, ybeVar.f) && tpa.f(this.g, ybeVar.g) && tpa.f(this.h, ybeVar.h);
    }

    public final int hashCode() {
        int iG = ey8.g(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        r7b r7bVar = this.g;
        int iHashCode5 = (iHashCode4 + (r7bVar == null ? 0 : r7bVar.hashCode())) * 31;
        String str4 = this.h;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Suggest(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(k7d.t(this.b));
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", inputResult=");
        sb.append((Object) this.e);
        sb.append(", avatarUrl=");
        sb.append(this.f);
        sb.append(", presence=");
        sb.append(this.g);
        sb.append(", query=");
        return zr6.l(sb, this.h, ")");
    }
}
