package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class mt2 {
    public static final mt2 c = new mt2(nz4.a, true);
    public final List a;
    public final boolean b;

    public mt2(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt2)) {
            return false;
        }
        mt2 mt2Var = (mt2) obj;
        return tpa.f(this.a, mt2Var.a) && this.b == mt2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatsList(chats=" + this.a + ", hasMore=" + this.b + ")";
    }
}
