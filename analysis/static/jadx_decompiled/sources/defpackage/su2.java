package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class su2 implements tu2 {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Map e;
    public final m56 f;
    public final Comparator g;

    public su2(Set set, Set set2, Set set3, Set set4, Map map) {
        we1 we1Var = xxc.o;
        v00 v00Var = p82.I;
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = set4;
        this.e = map;
        this.f = we1Var;
        this.g = v00Var;
    }

    @Override // defpackage.tu2
    public final Comparator a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su2)) {
            return false;
        }
        su2 su2Var = (su2) obj;
        return tpa.f(this.a, su2Var.a) && tpa.f(this.b, su2Var.b) && tpa.f(this.c, su2Var.c) && tpa.f(this.d, su2Var.d) && tpa.f(this.e, su2Var.e) && tpa.f(this.f, su2Var.f) && tpa.f(this.g, su2Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Filter(includedChats=" + this.a + ", includedFilters=" + this.b + ", excludedChats=" + this.c + ", excludedFilters=" + this.d + ", subjects=" + this.e + ", filterPredicate=" + this.f + ", comparator=" + this.g + ")";
    }
}
