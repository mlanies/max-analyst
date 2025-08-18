package defpackage;

/* loaded from: classes2.dex */
public final class og2 extends pg2 {
    public final long b;
    public final long c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;

    public og2(long j, long j2, String str, long j3, String str2, String str3) {
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = j3;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og2)) {
            return false;
        }
        og2 og2Var = (og2) obj;
        return this.b == og2Var.b && this.c == og2Var.c && tpa.f(this.d, og2Var.d) && this.e == og2Var.e && tpa.f(this.f, og2Var.f) && tpa.f(this.g, og2Var.g);
    }

    public final int hashCode() {
        int iM = h4f.m(Long.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        return this.g.hashCode() + rh4.d(h4f.m((iM + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowFileDownloadWarningBottomSheet(chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", attachLocalId=");
        sb.append(this.d);
        sb.append(", fileId=");
        sb.append(this.e);
        sb.append(", fileName=");
        sb.append(this.f);
        sb.append(", fileUrl=");
        return zr6.l(sb, this.g, ")");
    }
}
