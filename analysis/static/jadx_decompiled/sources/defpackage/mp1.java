package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class mp1 {
    public final int a;
    public final List b;
    public final List c;

    public mp1(int i, List list, List list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp1)) {
            return false;
        }
        mp1 mp1Var = (mp1) obj;
        return this.a == mp1Var.a && tpa.f(this.b, mp1Var.b) && tpa.f(this.c, mp1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.g(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Attendee(totalCount=");
        sb.append(this.a);
        sb.append(", addedParticipantIds=");
        sb.append(this.b);
        sb.append(", removedParticipantIds=");
        return au1.i(sb, this.c, ")");
    }
}
