package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class rv0 extends zma implements Serializable {
    public final w56 a;
    public final zma b;

    public rv0(w56 w56Var, zma zmaVar) {
        this.a = w56Var;
        zmaVar.getClass();
        this.b = zmaVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        w56 w56Var = this.a;
        return this.b.compare(w56Var.mo131apply(obj), w56Var.mo131apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rv0)) {
            return false;
        }
        rv0 rv0Var = (rv0) obj;
        return this.a.equals(rv0Var.a) && this.b.equals(rv0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
