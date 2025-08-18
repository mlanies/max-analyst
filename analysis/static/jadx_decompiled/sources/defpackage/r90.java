package defpackage;

/* loaded from: classes.dex */
public final class r90 {
    public final int a;
    public final long b;

    public r90(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r90)) {
            return false;
        }
        r90 r90Var = (r90) obj;
        return au1.c(this.a, r90Var.a) && this.b == r90Var.b;
    }

    public final int hashCode() {
        int iS = (au1.s(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ iS;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return zr6.k(sb, this.b, "}");
    }
}
