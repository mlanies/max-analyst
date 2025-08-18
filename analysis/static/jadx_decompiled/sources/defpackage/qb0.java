package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class qb0 {
    public final long a;
    public final long b;
    public final Set c;

    public qb0(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qb0)) {
            return false;
        }
        qb0 qb0Var = (qb0) obj;
        return this.a == qb0Var.a && this.b == qb0Var.b && this.c.equals(qb0Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
