package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class xu0 implements pa5, k13 {
    public static final cb4 u0;
    public static final lh4 v0;
    public boolean X;
    public qz7 Y;
    public long Z;
    public final la5 a;
    public final int b;
    public final qy5 c;
    public final SparseArray o = new SparseArray();
    public v1d s0;
    public qy5[] t0;

    static {
        cb4 cb4Var = new cb4();
        cb4Var.b = new b46();
        u0 = cb4Var;
        v0 = new lh4();
    }

    public xu0(la5 la5Var, int i, qy5 qy5Var) {
        this.a = la5Var;
        this.b = i;
        this.c = qy5Var;
    }

    @Override // defpackage.pa5
    /* renamed from: B */
    public final yze mo6B(int i, int i2) {
        SparseArray sparseArray = this.o;
        vu0 vu0Var = (vu0) sparseArray.get(i);
        if (vu0Var == null) {
            fm9.k(this.t0 == null);
            vu0Var = new vu0(i, i2, i2 == this.b ? this.c : null);
            qz7 qz7Var = this.Y;
            long j = this.Z;
            if (qz7Var == null) {
                vu0Var.e = vu0Var.c;
            } else {
                vu0Var.f = j;
                yze yzeVarY = qz7Var.Y(i2);
                vu0Var.e = yzeVarY;
                qy5 qy5Var = vu0Var.d;
                if (qy5Var != null) {
                    yzeVarY.e(qy5Var);
                }
            }
            sparseArray.put(i, vu0Var);
        }
        return vu0Var;
    }

    @Override // defpackage.pa5
    public final void J(v1d v1dVar) {
        this.s0 = v1dVar;
    }

    public final m13 a() {
        v1d v1dVar = this.s0;
        if (v1dVar instanceof m13) {
            return (m13) v1dVar;
        }
        return null;
    }

    public final void b(qz7 qz7Var, long j, long j2) {
        this.Y = qz7Var;
        this.Z = j2;
        boolean z = this.X;
        la5 la5Var = this.a;
        if (!z) {
            la5Var.S(this);
            if (j != -9223372036854775807L) {
                la5Var.d(0L, j);
            }
            this.X = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        la5Var.d(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.o;
            if (i >= sparseArray.size()) {
                return;
            }
            vu0 vu0Var = (vu0) sparseArray.valueAt(i);
            if (qz7Var == null) {
                vu0Var.e = vu0Var.c;
            } else {
                vu0Var.f = j2;
                yze yzeVarY = qz7Var.Y(vu0Var.a);
                vu0Var.e = yzeVarY;
                qy5 qy5Var = vu0Var.d;
                if (qy5Var != null) {
                    yzeVarY.e(qy5Var);
                }
            }
            i++;
        }
    }

    public final void c() {
        this.a.release();
    }

    @Override // defpackage.pa5
    public final void w() {
        SparseArray sparseArray = this.o;
        qy5[] qy5VarArr = new qy5[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            qy5 qy5Var = ((vu0) sparseArray.valueAt(i)).d;
            fm9.l(qy5Var);
            qy5VarArr[i] = qy5Var;
        }
        this.t0 = qy5VarArr;
    }
}
