package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fh6 extends hj3 {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public oi3 t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public fh6() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.hj3
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.hj3
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.hj3
    public final void Q(zh7 zh7Var, boolean z) {
        if (this.T == null) {
            return;
        }
        oi3 oi3Var = this.t0;
        zh7Var.getClass();
        int iN = zh7.n(oi3Var);
        if (this.u0 == 1) {
            this.Y = iN;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = iN;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.u0 == i) {
            return;
        }
        this.u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.u0 == 1) {
            this.t0 = this.I;
        } else {
            this.t0 = this.J;
        }
        arrayList.add(this.t0);
        oi3[] oi3VarArr = this.Q;
        int length = oi3VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            oi3VarArr[i2] = this.t0;
        }
    }

    @Override // defpackage.hj3
    public final void b(zh7 zh7Var, boolean z) {
        ij3 ij3Var = (ij3) this.T;
        if (ij3Var == null) {
            return;
        }
        Object objI = ij3Var.i(2);
        Object objI2 = ij3Var.i(4);
        hj3 hj3Var = this.T;
        boolean z2 = hj3Var != null && hj3Var.p0[0] == 2;
        if (this.u0 == 0) {
            objI = ij3Var.i(3);
            objI2 = ij3Var.i(5);
            hj3 hj3Var2 = this.T;
            z2 = hj3Var2 != null && hj3Var2.p0[1] == 2;
        }
        if (this.v0) {
            oi3 oi3Var = this.t0;
            if (oi3Var.c) {
                sud sudVarK = zh7Var.k(oi3Var);
                zh7Var.d(sudVarK, this.t0.d());
                if (this.r0 != -1) {
                    if (z2) {
                        zh7Var.f(zh7Var.k(objI2), sudVarK, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    sud sudVarK2 = zh7Var.k(objI2);
                    zh7Var.f(sudVarK, zh7Var.k(objI), 0, 5);
                    zh7Var.f(sudVarK2, sudVarK, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            sud sudVarK3 = zh7Var.k(this.t0);
            zh7Var.e(sudVarK3, zh7Var.k(objI), this.r0, 8);
            if (z2) {
                zh7Var.f(zh7Var.k(objI2), sudVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            sud sudVarK4 = zh7Var.k(this.t0);
            sud sudVarK5 = zh7Var.k(objI2);
            zh7Var.e(sudVarK4, sudVarK5, -this.s0, 8);
            if (z2) {
                zh7Var.f(sudVarK4, zh7Var.k(objI), 0, 5);
                zh7Var.f(sudVarK5, sudVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            sud sudVarK6 = zh7Var.k(this.t0);
            sud sudVarK7 = zh7Var.k(objI2);
            float f = this.q0;
            ws wsVarL = zh7Var.l();
            wsVarL.d.j(sudVarK6, -1.0f);
            wsVarL.d.j(sudVarK7, f);
            zh7Var.c(wsVarL);
        }
    }

    @Override // defpackage.hj3
    public final boolean c() {
        return true;
    }

    @Override // defpackage.hj3
    public final oi3 i(int i) {
        int iS = au1.s(i);
        if (iS != 1) {
            if (iS != 2) {
                if (iS != 3) {
                    if (iS != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
