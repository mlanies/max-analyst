package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class y12 {
    public final m22 a;
    public final List b;

    public y12(m22 m22Var, List list) {
        this.a = m22Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y12)) {
            return false;
        }
        y12 y12Var = (y12) obj;
        return tpa.f(this.a, y12Var.a) && tpa.f(this.b, y12Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(screenState=" + this.a + ", items=" + this.b + ")";
    }
}
