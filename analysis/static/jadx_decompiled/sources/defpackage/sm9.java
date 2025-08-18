package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class sm9 extends zma implements Serializable {
    public static final sm9 a = new sm9();

    @Override // defpackage.zma
    public final zma b() {
        return dkc.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
