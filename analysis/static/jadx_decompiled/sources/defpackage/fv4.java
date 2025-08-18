package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fv4 {
    public final meb a;
    public final List b;

    public fv4(meb mebVar, List list) {
        this.a = mebVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv4)) {
            return false;
        }
        fv4 fv4Var = (fv4) obj;
        return tpa.f(this.a, fv4Var.a) && tpa.f(this.b, fv4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(appBarState=" + this.a + ", items=" + this.b + ")";
    }
}
