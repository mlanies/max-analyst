package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class fx8 implements Serializable {
    public final List a;
    public final int b;
    public final bx8 c;

    public fx8(ArrayList arrayList, int i, bx8 bx8Var) {
        this.a = arrayList;
        this.b = i;
        this.c = bx8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx8)) {
            return false;
        }
        fx8 fx8Var = (fx8) obj;
        return tpa.f(this.a, fx8Var.a) && this.b == fx8Var.b && tpa.f(this.c, fx8Var.c);
    }

    public final int hashCode() {
        int iE = k7d.e(this.b, this.a.hashCode() * 31, 31);
        bx8 bx8Var = this.c;
        return iE + (bx8Var == null ? 0 : bx8Var.hashCode());
    }

    public final String toString() {
        return "MessageReactionInfo(counters=" + this.a + ", totalCount=" + this.b + ", yourReaction=" + this.c + ")";
    }
}
