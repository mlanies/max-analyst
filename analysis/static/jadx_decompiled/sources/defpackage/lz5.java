package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class lz5 implements nz5 {
    public final Set a = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lz5) && tpa.f(this.a, ((lz5) obj).a);
    }

    public final int hashCode() {
        Set set = this.a;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public final String toString() {
        return "MultiselectEnabled(selectedIds=" + this.a + ")";
    }
}
