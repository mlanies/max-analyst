package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class cj2 {
    public static final cj2 c = new cj2(null, 3, 0);
    public final List a;
    public final int b;

    public cj2(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj2)) {
            return false;
        }
        cj2 cj2Var = (cj2) obj;
        return tpa.f(this.a, cj2Var.a) && this.b == cj2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaState(items=" + this.a + ", initialPosition=" + this.b + ")";
    }

    public /* synthetic */ cj2(List list, int i, int i2) {
        this(-1, (i & 1) != 0 ? nz4.a : list);
    }
}
