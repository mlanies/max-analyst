package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class dkc extends zma implements Serializable {
    public static final dkc a = new dkc();

    @Override // defpackage.zma
    public final zma b() {
        return sm9.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
