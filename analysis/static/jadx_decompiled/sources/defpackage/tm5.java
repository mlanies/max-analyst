package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class tm5 {
    public final SparseBooleanArray a;

    public tm5(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final int b(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        fm9.g(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm5)) {
            return false;
        }
        tm5 tm5Var = (tm5) obj;
        int i = oaf.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.equals(tm5Var.a);
        }
        if (sparseBooleanArray.size() != tm5Var.a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (b(i2) != tm5Var.b(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = oaf.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + b(i2);
        }
        return size;
    }
}
