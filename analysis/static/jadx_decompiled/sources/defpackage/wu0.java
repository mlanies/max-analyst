package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class wu0 implements oa5 {
    public static final lh4 u0 = new lh4();
    public boolean X;
    public ph4 Y;
    public long Z;
    public final ka5 a;
    public final int b;
    public final oy5 c;
    public final SparseArray o = new SparseArray();
    public u1d s0;
    public oy5[] t0;

    public wu0(ka5 ka5Var, int i, oy5 oy5Var) {
        this.a = ka5Var;
        this.b = i;
        this.c = oy5Var;
    }

    @Override // defpackage.oa5
    public final xze B(int i, int i2) {
        xze dt4Var;
        SparseArray sparseArray = this.o;
        uu0 uu0Var = (uu0) sparseArray.get(i);
        if (uu0Var == null) {
            int i3 = 0;
            np8.f(this.t0 == null);
            uu0Var = new uu0(i, i2, i2 == this.b ? this.c : null);
            ph4 ph4Var = this.Y;
            long j = this.Z;
            if (ph4Var == null) {
                uu0Var.e = uu0Var.c;
            } else {
                uu0Var.f = j;
                while (true) {
                    int[] iArr = (int[]) ph4Var.a;
                    if (i3 >= iArr.length) {
                        dt4Var = new dt4();
                        break;
                    }
                    if (uu0Var.a == iArr[i3]) {
                        dt4Var = ((drc[]) ph4Var.b)[i3];
                        break;
                    }
                    i3++;
                }
                uu0Var.e = dt4Var;
                oy5 oy5Var = uu0Var.d;
                if (oy5Var != null) {
                    dt4Var.d(oy5Var);
                }
            }
            sparseArray.put(i, uu0Var);
        }
        return uu0Var;
    }

    @Override // defpackage.oa5
    public final void M(u1d u1dVar) {
        this.s0 = u1dVar;
    }

    public final l13 a() {
        u1d u1dVar = this.s0;
        if (u1dVar instanceof l13) {
            return (l13) u1dVar;
        }
        return null;
    }

    public final void b(ph4 ph4Var, long j, long j2) {
        xze dt4Var;
        this.Y = ph4Var;
        this.Z = j2;
        boolean z = this.X;
        ka5 ka5Var = this.a;
        if (!z) {
            ka5Var.g(this);
            if (j != -9223372036854775807L) {
                ka5Var.d(0L, j);
            }
            this.X = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        ka5Var.d(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.o;
            if (i >= sparseArray.size()) {
                return;
            }
            uu0 uu0Var = (uu0) sparseArray.valueAt(i);
            if (ph4Var == null) {
                uu0Var.e = uu0Var.c;
            } else {
                uu0Var.f = j2;
                int i2 = 0;
                while (true) {
                    int[] iArr = (int[]) ph4Var.a;
                    if (i2 >= iArr.length) {
                        dt4Var = new dt4();
                        break;
                    }
                    if (uu0Var.a == iArr[i2]) {
                        dt4Var = ((drc[]) ph4Var.b)[i2];
                        break;
                    }
                    i2++;
                }
                uu0Var.e = dt4Var;
                oy5 oy5Var = uu0Var.d;
                if (oy5Var != null) {
                    dt4Var.d(oy5Var);
                }
            }
            i++;
        }
    }

    public final void c() {
        this.a.release();
    }

    @Override // defpackage.oa5, defpackage.pa5
    public final void w() {
        SparseArray sparseArray = this.o;
        oy5[] oy5VarArr = new oy5[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            oy5 oy5Var = ((uu0) sparseArray.valueAt(i)).d;
            np8.g(oy5Var);
            oy5VarArr[i] = oy5Var;
        }
        this.t0 = oy5VarArr;
    }
}
