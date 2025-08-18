package defpackage;

/* loaded from: classes.dex */
public final class nh0 extends uj6 {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    @Override // defpackage.hj3
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.hj3
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            hj3 hj3Var = this.q0[i4];
            if ((this.t0 || hj3Var.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !hj3Var.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !hj3Var.B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.r0; i5++) {
            hj3 hj3Var2 = this.q0[i5];
            if (this.t0 || hj3Var2.c()) {
                if (!z2) {
                    int i6 = this.s0;
                    if (i6 == 0) {
                        iMax = hj3Var2.i(2).d();
                    } else if (i6 == 1) {
                        iMax = hj3Var2.i(4).d();
                    } else if (i6 == 2) {
                        iMax = hj3Var2.i(3).d();
                    } else if (i6 == 3) {
                        iMax = hj3Var2.i(5).d();
                    }
                    z2 = true;
                }
                int i7 = this.s0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, hj3Var2.i(2).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, hj3Var2.i(4).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, hj3Var2.i(3).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, hj3Var2.i(5).d());
                }
            }
        }
        int i8 = iMax + this.u0;
        int i9 = this.s0;
        if (i9 == 0 || i9 == 1) {
            J(i8, i8);
        } else {
            K(i8, i8);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.hj3
    public final void b(zh7 zh7Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        oi3[] oi3VarArr = this.Q;
        oi3 oi3Var = this.I;
        oi3VarArr[0] = oi3Var;
        oi3 oi3Var2 = this.J;
        int i3 = 2;
        oi3VarArr[2] = oi3Var2;
        oi3 oi3Var3 = this.K;
        oi3VarArr[1] = oi3Var3;
        oi3 oi3Var4 = this.L;
        oi3VarArr[3] = oi3Var4;
        for (oi3 oi3Var5 : oi3VarArr) {
            oi3Var5.i = zh7Var.k(oi3Var5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        oi3 oi3Var6 = oi3VarArr[i4];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                zh7Var.d(oi3Var.i, this.Y);
                zh7Var.d(oi3Var3.i, this.Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    zh7Var.d(oi3Var2.i, this.Z);
                    zh7Var.d(oi3Var4.i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.r0; i6++) {
            hj3 hj3Var = this.q0[i6];
            if ((this.t0 || hj3Var.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && hj3Var.p0[0] == 3 && hj3Var.I.f != null && hj3Var.K.f != null) || ((i2 == 2 || i2 == 3) && hj3Var.p0[1] == 3 && hj3Var.J.f != null && hj3Var.L.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = oi3Var.g() || oi3Var3.g();
        boolean z4 = oi3Var2.g() || oi3Var4.g();
        int i7 = (z2 || !(((i = this.s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            hj3 hj3Var2 = this.q0[i8];
            if (this.t0 || hj3Var2.c()) {
                sud sudVarK = zh7Var.k(hj3Var2.Q[this.s0]);
                int i9 = this.s0;
                oi3 oi3Var7 = hj3Var2.Q[i9];
                oi3Var7.i = sudVarK;
                oi3 oi3Var8 = oi3Var7.f;
                int i10 = (oi3Var8 == null || oi3Var8.d != this) ? 0 : oi3Var7.g;
                if (i9 == 0 || i9 == i3) {
                    sud sudVar = oi3Var6.i;
                    int i11 = this.u0 - i10;
                    ws wsVarL = zh7Var.l();
                    sud sudVarM = zh7Var.m();
                    sudVarM.o = 0;
                    wsVarL.c(sudVar, sudVarK, sudVarM, i11);
                    zh7Var.c(wsVarL);
                } else {
                    sud sudVar2 = oi3Var6.i;
                    int i12 = this.u0 + i10;
                    ws wsVarL2 = zh7Var.l();
                    sud sudVarM2 = zh7Var.m();
                    sudVarM2.o = 0;
                    wsVarL2.b(sudVar2, sudVarK, sudVarM2, i12);
                    zh7Var.c(wsVarL2);
                }
                zh7Var.e(oi3Var6.i, sudVarK, this.u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            zh7Var.e(oi3Var3.i, oi3Var.i, 0, 8);
            zh7Var.e(oi3Var.i, this.T.K.i, 0, 4);
            zh7Var.e(oi3Var.i, this.T.I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            zh7Var.e(oi3Var.i, oi3Var3.i, 0, 8);
            zh7Var.e(oi3Var.i, this.T.I.i, 0, 4);
            zh7Var.e(oi3Var.i, this.T.K.i, 0, 0);
        } else if (i13 == 2) {
            zh7Var.e(oi3Var4.i, oi3Var2.i, 0, 8);
            zh7Var.e(oi3Var2.i, this.T.L.i, 0, 4);
            zh7Var.e(oi3Var2.i, this.T.J.i, 0, 0);
        } else if (i13 == 3) {
            zh7Var.e(oi3Var2.i, oi3Var4.i, 0, 8);
            zh7Var.e(oi3Var2.i, this.T.J.i, 0, 4);
            zh7Var.e(oi3Var2.i, this.T.L.i, 0, 0);
        }
    }

    @Override // defpackage.hj3
    public final boolean c() {
        return true;
    }

    @Override // defpackage.hj3
    public final String toString() {
        String strL = zr6.l(new StringBuilder("[Barrier] "), this.h0, " {");
        for (int i = 0; i < this.r0; i++) {
            hj3 hj3Var = this.q0[i];
            if (i > 0) {
                strL = au1.g(strL, ", ");
            }
            StringBuilder sbL = au1.l(strL);
            sbL.append(hj3Var.h0);
            strL = sbL.toString();
        }
        return au1.g(strL, "}");
    }
}
