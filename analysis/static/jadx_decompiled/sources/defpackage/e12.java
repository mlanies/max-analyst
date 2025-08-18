package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class e12 {
    public static final e12 c = new e12(x53.H0(new ArrayList()), null);
    public final Set a;
    public final a14 b;

    public e12(Set set, a14 a14Var) {
        this.a = set;
        this.b = a14Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e12) {
            e12 e12Var = (e12) obj;
            if (tpa.f(e12Var.a, this.a) && tpa.f(e12Var.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        a14 a14Var = this.b;
        return iHashCode + (a14Var != null ? a14Var.hashCode() : 0);
    }
}
