package defpackage;

/* loaded from: classes2.dex */
public final class ueb implements xeb {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;

    public ueb(Long l, String str, String str2, String str3) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ueb)) {
            return false;
        }
        ueb uebVar = (ueb) obj;
        return tpa.f(this.a, uebVar.a) && tpa.f(this.b, uebVar.b) && tpa.f(this.c, uebVar.c) && tpa.f(this.d, uebVar.d);
    }

    public final int hashCode() {
        Long l = this.a;
        int iD = rh4.d(rh4.d((l == null ? 0 : l.hashCode()) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ContactUpdate(requestId=" + this.a + ", fullName=" + this.b + ", nickName=" + this.c + ", avatarUrl=" + this.d + ")";
    }
}
