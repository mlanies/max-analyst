package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class yy8 {
    public final Set a;
    public final Long b;
    public final boolean c;

    public yy8(Set set, Long l, boolean z) {
        this.a = set;
        this.b = l;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy8)) {
            return false;
        }
        yy8 yy8Var = (yy8) obj;
        return tpa.f(this.a, yy8Var.a) && tpa.f(this.b, yy8Var.b) && this.c == yy8Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForwardIds(messageIds=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", isForwardAttach=");
        return au1.j(sb, this.c, ")");
    }
}
