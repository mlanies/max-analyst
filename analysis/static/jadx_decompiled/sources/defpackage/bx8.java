package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class bx8 implements Serializable {
    public final gx8 a;
    public final String b;

    public bx8(gx8 gx8Var, String str) {
        this.a = gx8Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx8)) {
            return false;
        }
        bx8 bx8Var = (bx8) obj;
        return this.a == bx8Var.a && tpa.f(this.b, bx8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageReaction(reactionType=");
        sb.append(this.a);
        sb.append(", id=");
        return zr6.l(sb, this.b, ")");
    }
}
