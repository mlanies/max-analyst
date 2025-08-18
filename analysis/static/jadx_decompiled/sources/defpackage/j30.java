package defpackage;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class j30 {
    public static final /* synthetic */ int b = 0;
    public final i30 a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public j30(i30 i30Var) {
        this.a = i30Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j30)) {
            return false;
        }
        j30 j30Var = (j30) obj;
        i30 i30Var = this.a;
        return i30Var == null ? j30Var.a == null : i30Var.equals(j30Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
