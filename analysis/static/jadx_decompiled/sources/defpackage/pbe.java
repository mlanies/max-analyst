package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class pbe implements la5 {
    public final la5 a;
    public final mbe b;
    public k8g c;

    public pbe(la5 la5Var, mbe mbeVar) {
        this.a = la5Var;
        this.b = mbeVar;
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        k8g k8gVar = new k8g(pa5Var, this.b);
        this.c = k8gVar;
        this.a.S(k8gVar);
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        k8g k8gVar = this.c;
        if (k8gVar != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) k8gVar.c;
                if (i >= sparseArray.size()) {
                    break;
                }
                obe obeVar = ((qbe) sparseArray.valueAt(i)).h;
                if (obeVar != null) {
                    obeVar.reset();
                }
                i++;
            }
        }
        this.a.d(j, j2);
    }

    @Override // defpackage.la5
    public final int g(na5 na5Var, lh4 lh4Var) {
        return this.a.g(na5Var, lh4Var);
    }

    @Override // defpackage.la5
    public final la5 m() {
        return this.a;
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) {
        return this.a.n(na5Var);
    }

    @Override // defpackage.la5
    public final void release() {
        this.a.release();
    }
}
