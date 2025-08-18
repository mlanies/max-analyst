package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class op1 {
    public final int a;
    public final List b;
    public final List c;

    public op1(int i, List list, List list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op1)) {
            return false;
        }
        op1 op1Var = (op1) obj;
        return this.a == op1Var.a && tpa.f(this.b, op1Var.b) && tpa.f(this.c, op1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.g(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandUp(totalCount=");
        sb.append(this.a);
        sb.append(", addedParticipantIds=");
        sb.append(this.b);
        sb.append(", removedParticipantIds=");
        return au1.i(sb, this.c, ")");
    }
}
