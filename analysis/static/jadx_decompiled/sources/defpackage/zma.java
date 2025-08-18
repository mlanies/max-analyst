package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class zma implements Comparator {
    public static zma a(Comparator comparator) {
        return comparator instanceof zma ? (zma) comparator : new w93(comparator);
    }

    public zma b() {
        return new ekc(this);
    }
}
