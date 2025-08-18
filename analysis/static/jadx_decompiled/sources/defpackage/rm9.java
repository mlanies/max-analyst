package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class rm9 implements Comparator {
    public static final rm9 b = new rm9(0);
    public static final rm9 c = new rm9(1);
    public final /* synthetic */ int a;

    public /* synthetic */ rm9(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return ((Comparable) obj2).compareTo((Comparable) obj);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.a) {
            case 0:
                return c;
            default:
                return b;
        }
    }
}
