package defpackage;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ng4 implements Serializable {
    public final long a;
    public final boolean b;

    public ng4(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final Map a() {
        return mz7.a0(new kpa("timeToFire", Long.valueOf(this.a)), new kpa("notifySender", Boolean.valueOf(this.b)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng4)) {
            return false;
        }
        ng4 ng4Var = (ng4) obj;
        return this.a == ng4Var.a && this.b == ng4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DelayedAttributes(timeToFire=" + nu0.G(Long.valueOf(this.a)) + ", notifySender=" + this.b + ")";
    }
}
