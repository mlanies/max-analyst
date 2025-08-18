package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class kr9 {
    public final long a;
    public final b10 b;

    public kr9(long j, b10 b10Var) {
        this.a = j;
        this.b = b10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr9)) {
            return false;
        }
        kr9 kr9Var = (kr9) obj;
        return this.a == kr9Var.a && this.b == kr9Var.b;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
