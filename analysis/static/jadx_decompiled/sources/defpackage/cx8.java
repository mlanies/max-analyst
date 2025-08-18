package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class cx8 implements Serializable {
    public final bx8 a;
    public final int b;

    public cx8(bx8 bx8Var, int i) {
        this.a = bx8Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx8)) {
            return false;
        }
        cx8 cx8Var = (cx8) obj;
        return tpa.f(this.a, cx8Var.a) && this.b == cx8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MessageReactionCounter(reaction=" + this.a + ", count=" + this.b + ")";
    }
}
