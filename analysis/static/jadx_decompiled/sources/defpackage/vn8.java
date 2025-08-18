package defpackage;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class vn8 implements yn8 {
    public final long a;
    public final ek2 b;
    public final Collection c;

    public vn8(long j, ek2 ek2Var, Collection collection) {
        this.a = j;
        this.b = ek2Var;
        this.c = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn8)) {
            return false;
        }
        vn8 vn8Var = (vn8) obj;
        return this.a == vn8Var.a && this.b == vn8Var.b && tpa.f(this.c, vn8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Add(chatId=" + this.a + ", chatMemberType=" + this.b + ", ids=" + this.c + ")";
    }
}
