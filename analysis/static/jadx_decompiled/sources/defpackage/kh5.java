package defpackage;

/* loaded from: classes.dex */
public final class kh5 {
    public final long a;
    public final long b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;

    public kh5(long j, long j2, String str, long j3, String str2, String str3) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = j3;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh5)) {
            return false;
        }
        kh5 kh5Var = (kh5) obj;
        return this.a == kh5Var.a && this.b == kh5Var.b && tpa.f(this.c, kh5Var.c) && this.d == kh5Var.d && tpa.f(this.e, kh5Var.e) && tpa.f(this.f, kh5Var.f);
    }

    public final int hashCode() {
        int iM = h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return this.f.hashCode() + rh4.d(h4f.m((iM + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileDownloadWidgetArgs(chatId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", attachId=");
        sb.append(this.c);
        sb.append(", fileId=");
        sb.append(this.d);
        sb.append(", fileName=");
        sb.append(this.e);
        sb.append(", fileUrl=");
        return zr6.l(sb, this.f, ")");
    }
}
