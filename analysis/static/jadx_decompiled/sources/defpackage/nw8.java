package defpackage;

/* loaded from: classes2.dex */
public final class nw8 {
    public final long a;
    public final long b;
    public final String c;

    public nw8(long j, String str, long j2) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nw8.class != obj.getClass()) {
            return false;
        }
        nw8 nw8Var = (nw8) obj;
        if (this.a != nw8Var.a || this.b != nw8Var.b) {
            return false;
        }
        String str = nw8Var.c;
        String str2 = this.c;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageMediaUploadKey{messageId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", attachLocalId='");
        return zr6.l(sb, this.c, "'}");
    }
}
