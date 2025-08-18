package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class dc2 extends gle {
    public final Set X;
    public final List c;
    public final f52 o;

    public dc2(List list, f52 f52Var, LinkedHashSet linkedHashSet) {
        this.c = list;
        this.o = f52Var;
        this.X = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc2)) {
            return false;
        }
        dc2 dc2Var = (dc2) obj;
        return tpa.f(this.c, dc2Var.c) && tpa.f(this.o, dc2Var.o) && tpa.f(this.X, dc2Var.X);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        f52 f52Var = this.o;
        return this.X.hashCode() + ((iHashCode + (f52Var == null ? 0 : f52Var.hashCode())) * 31);
    }

    @Override // defpackage.zje
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatHistory.Response(messages=");
        sb.append(x53.n0(this.c, ",", "[", "]", new we1(9), 24));
        sb.append(", chat=");
        sb.append(this.o);
        if (this.c.isEmpty()) {
            sb.append(", messageIds=");
            sb.append(this.X);
        }
        sb.append(")");
        return sb.toString();
    }
}
