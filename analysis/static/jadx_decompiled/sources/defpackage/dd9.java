package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class dd9 extends fd9 {
    public final long a;
    public final TimeUnit b;

    public dd9(long j, TimeUnit timeUnit) {
        this.a = j;
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd9)) {
            return false;
        }
        dd9 dd9Var = (dd9) obj;
        return this.a == dd9Var.a && this.b == dd9Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Defined(position=" + this.a + ", timeUnit=" + this.b + ")";
    }
}
