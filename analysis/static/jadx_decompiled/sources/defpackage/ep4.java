package defpackage;

/* loaded from: classes2.dex */
public final class ep4 {
    public final long a;
    public final String b;

    public ep4(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep4)) {
            return false;
        }
        ep4 ep4Var = (ep4) obj;
        return this.a == ep4Var.a && tpa.f(this.b, ep4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftMediaUploadKey(chatId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return zr6.l(sb, this.b, ")");
    }
}
