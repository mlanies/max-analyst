package defpackage;

/* loaded from: classes2.dex */
public final class xua {
    public final long a;
    public final long b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;

    public xua(long j, long j2, int i, String str, long j3, String str2, String str3, String str4, String str5, int i2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = str;
        this.e = j3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xua)) {
            return false;
        }
        xua xuaVar = (xua) obj;
        return this.a == xuaVar.a && this.b == xuaVar.b && this.c == xuaVar.c && tpa.f(this.d, xuaVar.d) && this.e == xuaVar.e && tpa.f(this.f, xuaVar.f) && tpa.f(this.g, xuaVar.g) && tpa.f(this.h, xuaVar.h) && tpa.f(this.i, xuaVar.i) && this.j == xuaVar.j;
    }

    public final int hashCode() {
        int iM = h4f.m(rh4.d(k7d.e(this.c, h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        String str = this.f;
        int iD = rh4.d((iM + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return au1.s(this.j) + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PhoneEntity(id=" + this.a + ", phonebookId=" + this.b + ", contactId=" + this.c + ", phone=" + this.d + ", serverPhone=" + this.e + ", email=" + this.f + ", firstName=" + this.g + ", lastName=" + this.h + ", avatarPath=" + this.i + ", type=" + ey8.q(this.j) + ")";
    }
}
