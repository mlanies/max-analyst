package defpackage;

/* loaded from: classes2.dex */
public final class hg2 extends pg2 {
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;

    public hg2(long j, long j2, String str, boolean z) {
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg2)) {
            return false;
        }
        hg2 hg2Var = (hg2) obj;
        return this.b == hg2Var.b && this.c == hg2Var.c && tpa.f(this.d, hg2Var.d) && this.e == hg2Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rh4.d(h4f.m(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenImage(chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", attachLocalId=");
        sb.append(this.d);
        sb.append(", isSingleAttach=");
        return au1.j(sb, this.e, ")");
    }
}
