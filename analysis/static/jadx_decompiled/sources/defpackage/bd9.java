package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class bd9 extends kp {
    public final long e;
    public final TimeUnit f;

    public bd9(long j, TimeUnit timeUnit) {
        this.e = j;
        this.f = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd9)) {
            return false;
        }
        bd9 bd9Var = (bd9) obj;
        return this.e == bd9Var.e && this.f == bd9Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + (Long.hashCode(this.e) * 31);
    }

    public final String toString() {
        return "Value(value=" + this.e + ", timeUnit=" + this.f + ")";
    }
}
