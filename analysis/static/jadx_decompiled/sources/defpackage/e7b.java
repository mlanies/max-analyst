package defpackage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class e7b implements a7b, Serializable {
    public final List a;

    public e7b(List list) {
        this.a = list;
    }

    @Override // defpackage.a7b
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return true;
            }
            if (!((a7b) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e7b) {
            return this.a.equals(((e7b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
