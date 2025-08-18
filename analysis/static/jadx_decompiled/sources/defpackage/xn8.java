package defpackage;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class xn8 implements yn8 {
    public final long a;
    public final ek2 b;
    public final Collection c;

    public xn8(long j, ek2 ek2Var, Collection collection) {
        this.a = j;
        this.b = ek2Var;
        this.c = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn8)) {
            return false;
        }
        xn8 xn8Var = (xn8) obj;
        return this.a == xn8Var.a && this.b == xn8Var.b && tpa.f(this.c, xn8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Remove(chatId=" + this.a + ", chatMemberType=" + this.b + ", ids=" + this.c + ")";
    }
}
