package defpackage;

/* loaded from: classes2.dex */
public final class cf2 implements hf2 {
    public final long a;
    public final String b;

    public cf2(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf2)) {
            return false;
        }
        cf2 cf2Var = (cf2) obj;
        return this.a == cf2Var.a && tpa.f(this.b, cf2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadComplete(messageId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return zr6.l(sb, this.b, ")");
    }
}
