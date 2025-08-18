package defpackage;

/* loaded from: classes.dex */
public final class gc0 {
    public final String a;
    public final long b;
    public final int c;

    public gc0(long j, String str, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static jn a() {
        jn jnVar = new jn((char) 0, 2);
        jnVar.o = 0L;
        return jnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gc0)) {
            return false;
        }
        gc0 gc0Var = (gc0) obj;
        String str = this.a;
        if (str != null ? str.equals(gc0Var.a) : gc0Var.a == null) {
            if (this.b == gc0Var.b) {
                int i = gc0Var.c;
                int i2 = this.c;
                if (i2 == 0) {
                    if (i == 0) {
                        return true;
                    }
                } else if (au1.c(i2, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i2 = this.c;
        return i ^ (i2 != 0 ? au1.s(i2) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
