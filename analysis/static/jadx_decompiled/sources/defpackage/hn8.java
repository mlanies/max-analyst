package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hn8 {
    public final List a;
    public final List b;

    public hn8(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn8)) {
            return false;
        }
        hn8 hn8Var = (hn8) obj;
        return tpa.f(this.a, hn8Var.a) && tpa.f(this.b, hn8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MemberListActionsWrapper(topActions=" + this.a + ", bottomActions=" + this.b + ")";
    }
}
