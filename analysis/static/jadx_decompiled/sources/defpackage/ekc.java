package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class ekc extends zma implements Serializable {
    public final zma a;

    public ekc(zma zmaVar) {
        zmaVar.getClass();
        this.a = zmaVar;
    }

    @Override // defpackage.zma
    public final zma b() {
        return this.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekc) {
            return this.a.equals(((ekc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}
