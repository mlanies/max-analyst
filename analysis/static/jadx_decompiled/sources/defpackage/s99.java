package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class s99 {
    public final SparseArray a;
    public b4f b;

    public s99(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(b4f b4fVar, int i, int i2) {
        int iA = b4fVar.a(i);
        SparseArray sparseArray = this.a;
        s99 s99Var = sparseArray == null ? null : (s99) sparseArray.get(iA);
        if (s99Var == null) {
            s99Var = new s99(1);
            sparseArray.put(b4fVar.a(i), s99Var);
        }
        if (i2 > i) {
            s99Var.a(b4fVar, i + 1, i2);
        } else {
            s99Var.b = b4fVar;
        }
    }
}
