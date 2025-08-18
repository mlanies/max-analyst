package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class dx8 implements Serializable {
    public final long a;
    public final bx8 b;

    public dx8(long j, bx8 bx8Var) {
        this.a = j;
        this.b = bx8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx8)) {
            return false;
        }
        dx8 dx8Var = (dx8) obj;
        return this.a == dx8Var.a && tpa.f(this.b, dx8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MessageReactionEntry(userId=" + this.a + ", reaction=" + this.b + ")";
    }
}
