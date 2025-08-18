package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nn5 extends uj6 {
    public int A0;
    public xk0 B0;
    public dob C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public hj3[] X0;
    public hj3[] Y0;
    public int[] Z0;
    public hj3[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.uj6
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            hj3 hj3Var = this.q0[i];
            if (hj3Var != null) {
                hj3Var.F = true;
            }
        }
    }

    public final int T(hj3 hj3Var, int i) {
        if (hj3Var == null) {
            return 0;
        }
        int[] iArr = hj3Var.p0;
        if (iArr[1] == 3) {
            int i2 = hj3Var.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (hj3Var.z * i);
                if (i3 != hj3Var.k()) {
                    hj3Var.g = true;
                    W(iArr[0], hj3Var.q(), 1, i3, hj3Var);
                }
                return i3;
            }
            if (i2 == 1) {
                return hj3Var.k();
            }
            if (i2 == 3) {
                return (int) ((hj3Var.q() * hj3Var.W) + 0.5f);
            }
        }
        return hj3Var.k();
    }

    public final int U(hj3 hj3Var, int i) {
        if (hj3Var == null) {
            return 0;
        }
        int[] iArr = hj3Var.p0;
        if (iArr[0] == 3) {
            int i2 = hj3Var.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (hj3Var.w * i);
                if (i3 != hj3Var.q()) {
                    hj3Var.g = true;
                    W(1, i3, iArr[1], hj3Var.k(), hj3Var);
                }
                return i3;
            }
            if (i2 == 1) {
                return hj3Var.q();
            }
            if (i2 == 3) {
                return (int) ((hj3Var.k() * hj3Var.W) + 0.5f);
            }
        }
        return hj3Var.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:282:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(int r40, int r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 1960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn5.V(int, int, int, int):void");
    }

    public final void W(int i, int i2, int i3, int i4, hj3 hj3Var) {
        dob dobVar;
        hj3 hj3Var2;
        while (true) {
            dobVar = this.C0;
            if (dobVar != null || (hj3Var2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((ij3) hj3Var2).u0;
            }
        }
        xk0 xk0Var = this.B0;
        xk0Var.b = i;
        xk0Var.d = i3;
        xk0Var.e = i2;
        xk0Var.f = i4;
        dobVar.c(hj3Var, xk0Var);
        hj3Var.O(xk0Var.g);
        hj3Var.L(xk0Var.h);
        hj3Var.E = xk0Var.c;
        hj3Var.I(xk0Var.i);
    }

    @Override // defpackage.hj3
    public final void b(zh7 zh7Var, boolean z) {
        hj3 hj3Var;
        float f;
        int i;
        super.b(zh7Var, z);
        hj3 hj3Var2 = this.T;
        boolean z2 = hj3Var2 != null && ((ij3) hj3Var2).v0;
        int i2 = this.T0;
        ArrayList arrayList = this.W0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((ln5) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((ln5) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i5 = 0; i5 < this.b1; i5++) {
                    this.a1[i5].D();
                }
                int[] iArr = this.Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.J0;
                hj3 hj3Var3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    hj3 hj3Var4 = this.Y0[i];
                    if (hj3Var4 != null && hj3Var4.g0 != 8) {
                        oi3 oi3Var = hj3Var4.I;
                        if (i8 == 0) {
                            hj3Var4.f(oi3Var, this.I, this.w0);
                            hj3Var4.i0 = this.D0;
                            hj3Var4.d0 = f;
                        }
                        if (i8 == i6 - 1) {
                            hj3Var4.f(hj3Var4.K, this.K, this.x0);
                        }
                        if (i8 > 0 && hj3Var3 != null) {
                            int i9 = this.P0;
                            oi3 oi3Var2 = hj3Var3.K;
                            hj3Var4.f(oi3Var, oi3Var2, i9);
                            hj3Var3.f(oi3Var2, oi3Var, 0);
                        }
                        hj3Var3 = hj3Var4;
                    }
                    i8++;
                    f2 = f;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    hj3 hj3Var5 = this.X0[i10];
                    if (hj3Var5 != null && hj3Var5.g0 != 8) {
                        oi3 oi3Var3 = hj3Var5.J;
                        if (i10 == 0) {
                            hj3Var5.f(oi3Var3, this.J, this.s0);
                            hj3Var5.j0 = this.E0;
                            hj3Var5.e0 = this.K0;
                        }
                        if (i10 == i7 - 1) {
                            hj3Var5.f(hj3Var5.L, this.L, this.t0);
                        }
                        if (i10 > 0 && hj3Var3 != null) {
                            int i11 = this.Q0;
                            oi3 oi3Var4 = hj3Var3.L;
                            hj3Var5.f(oi3Var3, oi3Var4, i11);
                            hj3Var3.f(oi3Var4, oi3Var3, 0);
                        }
                        hj3Var3 = hj3Var5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        hj3[] hj3VarArr = this.a1;
                        if (i14 < hj3VarArr.length && (hj3Var = hj3VarArr[i14]) != null && hj3Var.g0 != 8) {
                            hj3 hj3Var6 = this.Y0[i12];
                            hj3 hj3Var7 = this.X0[i13];
                            if (hj3Var != hj3Var6) {
                                hj3Var.f(hj3Var.I, hj3Var6.I, 0);
                                hj3Var.f(hj3Var.K, hj3Var6.K, 0);
                            }
                            if (hj3Var != hj3Var7) {
                                hj3Var.f(hj3Var.J, hj3Var7.J, 0);
                                hj3Var.f(hj3Var.L, hj3Var7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((ln5) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
