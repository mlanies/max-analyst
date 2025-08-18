package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class jk6 {
    public final long a;
    public final List b;

    public jk6(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk6)) {
            return false;
        }
        jk6 jk6Var = (jk6) obj;
        return this.a == jk6Var.a && tpa.f(this.b, jk6Var.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "HighlightTextState(messageLocalId=" + this.a + ", highlights=" + this.b + ")";
    }
}
