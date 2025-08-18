package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class pb0 {
    public final d9f a;
    public final Map b;

    public pb0(d9f d9fVar, HashMap map) {
        this.a = d9fVar;
        this.b = map;
    }

    public final long a(z8b z8bVar, long j, int i) {
        long jA = j - this.a.a();
        qb0 qb0Var = (qb0) this.b.get(z8bVar);
        long j2 = qb0Var.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), jA), qb0Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pb0)) {
            return false;
        }
        pb0 pb0Var = (pb0) obj;
        return this.a.equals(pb0Var.a) && this.b.equals(pb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
