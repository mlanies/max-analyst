package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s27 {
    public final Context a;
    public final i63 b;
    public final va8 c;
    public final nx0 d;
    public final dd6 e;
    public final Executor f;
    public final SparseArray g;
    public final int h;
    public final boolean i;
    public gd6 j;
    public v2 k;

    public s27(Context context, i63 i63Var, va8 va8Var, nx0 nx0Var, Executor executor, lf4 lf4Var, int i, boolean z, boolean z2, boolean z3) {
        this.a = context;
        this.b = i63Var;
        this.c = va8Var;
        this.d = nx0Var;
        this.f = executor;
        this.e = lf4Var;
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.h = i;
        this.i = z2;
        sparseArray.put(1, new r27(new fa5(va8Var, nx0Var, z, z2)));
        sparseArray.put(2, new r27(new no0(va8Var, nx0Var, z3)));
        sparseArray.put(3, new r27(new soe(va8Var, nx0Var)));
    }

    public final void a() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.g;
            if (i >= sparseArray.size()) {
                return;
            }
            r27 r27Var = (r27) sparseArray.get(sparseArray.keyAt(i));
            r27Var.a.release();
            ba5 ba5Var = r27Var.b;
            if (ba5Var != null) {
                ((od4) ba5Var).release();
            }
            i++;
        }
    }
}
