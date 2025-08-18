package defpackage;

/* loaded from: classes.dex */
public final class ln5 {
    public int a;
    public oi3 d;
    public oi3 e;
    public oi3 f;
    public oi3 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ nn5 r;
    public hj3 b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public ln5(nn5 nn5Var, int i, oi3 oi3Var, oi3 oi3Var2, oi3 oi3Var3, oi3 oi3Var4, int i2) {
        this.r = nn5Var;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.q = 0;
        this.a = i;
        this.d = oi3Var;
        this.e = oi3Var2;
        this.f = oi3Var3;
        this.g = oi3Var4;
        this.h = nn5Var.w0;
        this.i = nn5Var.s0;
        this.j = nn5Var.x0;
        this.k = nn5Var.t0;
        this.q = i2;
    }

    public final void a(hj3 hj3Var) {
        int i = this.a;
        nn5 nn5Var = this.r;
        if (i == 0) {
            int iU = nn5Var.U(hj3Var, this.q);
            if (hj3Var.p0[0] == 3) {
                this.p++;
                iU = 0;
            }
            this.l = iU + (hj3Var.g0 != 8 ? nn5Var.P0 : 0) + this.l;
            int iT = nn5Var.T(hj3Var, this.q);
            if (this.b == null || this.c < iT) {
                this.b = hj3Var;
                this.c = iT;
                this.m = iT;
            }
        } else {
            int iU2 = nn5Var.U(hj3Var, this.q);
            int iT2 = nn5Var.T(hj3Var, this.q);
            if (hj3Var.p0[1] == 3) {
                this.p++;
                iT2 = 0;
            }
            this.m = iT2 + (hj3Var.g0 != 8 ? nn5Var.Q0 : 0) + this.m;
            if (this.b == null || this.c < iU2) {
                this.b = hj3Var;
                this.c = iU2;
                this.l = iU2;
            }
        }
        this.o++;
    }

    public final void b(int i, boolean z, boolean z2) {
        nn5 nn5Var;
        int i2;
        int i3;
        int i4;
        hj3 hj3Var;
        int i5;
        char c;
        int i6;
        float f;
        float f2;
        int i7;
        float f3;
        int i8;
        int i9 = this.o;
        int i10 = 0;
        while (true) {
            nn5Var = this.r;
            if (i10 >= i9 || (i8 = this.n + i10) >= nn5Var.b1) {
                break;
            }
            hj3 hj3Var2 = nn5Var.a1[i8];
            if (hj3Var2 != null) {
                hj3Var2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.b == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.n + (z ? (i9 - 1) - i13 : i13);
            if (i14 >= nn5Var.b1) {
                break;
            }
            hj3 hj3Var3 = nn5Var.a1[i14];
            if (hj3Var3 != null && hj3Var3.g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.a != 0) {
            hj3 hj3Var4 = this.b;
            hj3Var4.i0 = nn5Var.D0;
            int i15 = this.h;
            if (i > 0) {
                i15 += nn5Var.P0;
            }
            oi3 oi3Var = hj3Var4.I;
            oi3 oi3Var2 = hj3Var4.K;
            if (z) {
                oi3Var2.a(this.f, i15);
                if (z2) {
                    oi3Var.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.d.I.a(oi3Var2, 0);
                }
            } else {
                oi3Var.a(this.d, i15);
                if (z2) {
                    oi3Var2.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.d.K.a(oi3Var, 0);
                }
            }
            hj3 hj3Var5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.n + i16;
                if (i17 >= nn5Var.b1) {
                    return;
                }
                hj3 hj3Var6 = nn5Var.a1[i17];
                if (hj3Var6 != null) {
                    oi3 oi3Var3 = hj3Var6.J;
                    if (i16 == 0) {
                        hj3Var6.f(oi3Var3, this.e, this.i);
                        int i18 = nn5Var.E0;
                        float f4 = nn5Var.K0;
                        if (this.n == 0) {
                            i4 = nn5Var.G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f4 = nn5Var.M0;
                            }
                            hj3Var6.j0 = i4;
                            hj3Var6.e0 = f4;
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z2 || (i4 = nn5Var.I0) == i3) {
                            i4 = i2;
                        } else {
                            f4 = nn5Var.O0;
                        }
                        hj3Var6.j0 = i4;
                        hj3Var6.e0 = f4;
                    }
                    if (i16 == i9 - 1) {
                        hj3Var6.f(hj3Var6.L, this.g, this.k);
                    }
                    if (hj3Var5 != null) {
                        int i19 = nn5Var.Q0;
                        oi3 oi3Var4 = hj3Var5.L;
                        oi3Var3.a(oi3Var4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (oi3Var3.h()) {
                                oi3Var3.h = i20;
                            }
                        }
                        oi3Var4.a(oi3Var3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.k;
                            if (oi3Var4.h()) {
                                oi3Var4.h = i21;
                            }
                        }
                    }
                    if (hj3Var6 != hj3Var4) {
                        oi3 oi3Var5 = hj3Var6.K;
                        oi3 oi3Var6 = hj3Var6.I;
                        if (z) {
                            int i22 = nn5Var.R0;
                            if (i22 == 0) {
                                oi3Var5.a(oi3Var2, 0);
                            } else if (i22 == 1) {
                                oi3Var6.a(oi3Var, 0);
                            } else if (i22 == 2) {
                                oi3Var6.a(oi3Var, 0);
                                oi3Var5.a(oi3Var2, 0);
                            }
                            hj3Var5 = hj3Var6;
                        } else {
                            int i23 = nn5Var.R0;
                            if (i23 == 0) {
                                oi3Var6.a(oi3Var, 0);
                            } else if (i23 == 1) {
                                oi3Var5.a(oi3Var2, 0);
                            } else if (i23 == 2) {
                                if (z3) {
                                    oi3Var6.a(this.d, this.h);
                                    oi3Var5.a(this.f, this.j);
                                } else {
                                    oi3Var6.a(oi3Var, 0);
                                    oi3Var5.a(oi3Var2, 0);
                                }
                            }
                            hj3Var5 = hj3Var6;
                        }
                    } else {
                        hj3Var5 = hj3Var6;
                    }
                }
            }
            return;
        }
        hj3 hj3Var7 = this.b;
        hj3Var7.j0 = nn5Var.E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += nn5Var.Q0;
        }
        oi3 oi3Var7 = this.e;
        oi3 oi3Var8 = hj3Var7.J;
        oi3Var8.a(oi3Var7, i24);
        oi3 oi3Var9 = hj3Var7.L;
        if (z2) {
            oi3Var9.a(this.g, this.k);
        }
        if (i > 0) {
            this.e.d.L.a(oi3Var8, 0);
        }
        if (nn5Var.S0 != 3 || hj3Var7.E) {
            hj3Var = hj3Var7;
        } else {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.n + (z ? (i9 - 1) - i25 : i25);
                if (i26 >= nn5Var.b1) {
                    break;
                }
                hj3Var = nn5Var.a1[i26];
                if (hj3Var.E) {
                    break;
                }
            }
            hj3Var = hj3Var7;
        }
        int i27 = 0;
        hj3 hj3Var8 = null;
        while (i27 < i9) {
            int i28 = z ? (i9 - 1) - i27 : i27;
            int i29 = this.n + i28;
            if (i29 >= nn5Var.b1) {
                return;
            }
            hj3 hj3Var9 = nn5Var.a1[i29];
            if (hj3Var9 == null) {
                i5 = i9;
                c = 3;
            } else {
                oi3 oi3Var10 = hj3Var9.I;
                if (i27 == 0) {
                    hj3Var9.f(oi3Var10, this.d, this.h);
                }
                if (i28 == 0) {
                    int i30 = nn5Var.D0;
                    if (z) {
                        i6 = i30;
                        f = 1.0f - nn5Var.J0;
                    } else {
                        i6 = i30;
                        f = nn5Var.J0;
                    }
                    if (this.n == 0) {
                        int i31 = nn5Var.F0;
                        f2 = f;
                        if (i31 != -1) {
                            f3 = z ? 1.0f - nn5Var.L0 : nn5Var.L0;
                            i7 = i31;
                        }
                        hj3Var9.i0 = i7;
                        hj3Var9.d0 = f3;
                    } else {
                        f2 = f;
                    }
                    if (!z2 || (i7 = nn5Var.H0) == -1) {
                        i7 = i6;
                        f3 = f2;
                    } else {
                        f3 = z ? 1.0f - nn5Var.N0 : nn5Var.N0;
                    }
                    hj3Var9.i0 = i7;
                    hj3Var9.d0 = f3;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    hj3Var9.f(hj3Var9.K, this.f, this.j);
                } else {
                    i5 = i9;
                }
                if (hj3Var8 != null) {
                    int i32 = nn5Var.P0;
                    oi3 oi3Var11 = hj3Var8.K;
                    oi3Var10.a(oi3Var11, i32);
                    if (i27 == i11) {
                        int i33 = this.h;
                        if (oi3Var10.h()) {
                            oi3Var10.h = i33;
                        }
                    }
                    oi3Var11.a(oi3Var10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.j;
                        if (oi3Var11.h()) {
                            oi3Var11.h = i34;
                        }
                    }
                }
                if (hj3Var9 != hj3Var7) {
                    int i35 = nn5Var.S0;
                    c = 3;
                    if (i35 == 3 && hj3Var.E && hj3Var9 != hj3Var && hj3Var9.E) {
                        hj3Var9.M.a(hj3Var.M, 0);
                    } else {
                        oi3 oi3Var12 = hj3Var9.J;
                        if (i35 != 0) {
                            oi3 oi3Var13 = hj3Var9.L;
                            if (i35 == 1) {
                                oi3Var13.a(oi3Var9, 0);
                            } else if (z3) {
                                oi3Var12.a(this.e, this.i);
                                oi3Var13.a(this.g, this.k);
                            } else {
                                oi3Var12.a(oi3Var8, 0);
                                oi3Var13.a(oi3Var9, 0);
                            }
                        } else {
                            oi3Var12.a(oi3Var8, 0);
                        }
                    }
                } else {
                    c = 3;
                }
                hj3Var8 = hj3Var9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.a == 1 ? this.m - this.r.Q0 : this.m;
    }

    public final int d() {
        return this.a == 0 ? this.l - this.r.P0 : this.l;
    }

    public final void e(int i) {
        nn5 nn5Var;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            nn5Var = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= nn5Var.b1) {
                break;
            }
            hj3 hj3Var = nn5Var.a1[i2];
            if (this.a == 0) {
                if (hj3Var != null) {
                    int[] iArr = hj3Var.p0;
                    if (iArr[0] == 3 && hj3Var.r == 0) {
                        nn5Var.W(1, i5, iArr[1], hj3Var.k(), hj3Var);
                    }
                }
            } else if (hj3Var != null) {
                int[] iArr2 = hj3Var.p0;
                if (iArr2[1] == 3 && hj3Var.s == 0) {
                    nn5Var.W(iArr2[0], hj3Var.q(), 1, i5, hj3Var);
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i7 = this.o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.n + i8;
            if (i9 >= nn5Var.b1) {
                return;
            }
            hj3 hj3Var2 = nn5Var.a1[i9];
            if (this.a == 0) {
                int iQ = hj3Var2.q();
                int i10 = nn5Var.P0;
                if (hj3Var2.g0 == 8) {
                    i10 = 0;
                }
                this.l = iQ + i10 + this.l;
                int iT = nn5Var.T(hj3Var2, this.q);
                if (this.b == null || this.c < iT) {
                    this.b = hj3Var2;
                    this.c = iT;
                    this.m = iT;
                }
            } else {
                int iU = nn5Var.U(hj3Var2, this.q);
                int iT2 = nn5Var.T(hj3Var2, this.q);
                int i11 = nn5Var.Q0;
                if (hj3Var2.g0 == 8) {
                    i11 = 0;
                }
                this.m = iT2 + i11 + this.m;
                if (this.b == null || this.c < iU) {
                    this.b = hj3Var2;
                    this.c = iU;
                    this.l = iU;
                }
            }
        }
    }

    public final void f(int i, oi3 oi3Var, oi3 oi3Var2, oi3 oi3Var3, oi3 oi3Var4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = oi3Var;
        this.e = oi3Var2;
        this.f = oi3Var3;
        this.g = oi3Var4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
