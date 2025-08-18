package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class hd3 extends zma implements Serializable {
    public final Comparator[] a;

    public hd3(rv0 rv0Var, rv0 rv0Var2) {
        this.a = new Comparator[]{rv0Var, rv0Var2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hd3) {
            return Arrays.equals(this.a, ((hd3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return zr6.l(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
