package defpackage;

/* loaded from: classes.dex */
public final class mua implements n3f {
    public final dw4 a;
    public final s02 b = new s02(new byte[10], 10, 2, (byte) 0);
    public int c = 0;
    public int d;
    public tue e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public mua(dw4 dw4Var) {
        this.a = dw4Var;
    }

    @Override // defpackage.n3f
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    @Override // defpackage.n3f
    public final void b(tue tueVar, pa5 pa5Var, l3f l3fVar) {
        this.e = tueVar;
        this.a.i(pa5Var, l3fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [s02] */
    /* JADX WARN: Type inference failed for: r4v0, types: [dw4] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // defpackage.n3f
    public final void c(int i, wpa wpaVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        fm9.l(this.e);
        int i7 = i & 1;
        ?? r4 = this.a;
        int i8 = -1;
        int i9 = 3;
        int i10 = 2;
        ?? r8 = 0;
        if (i7 != 0) {
            int i11 = this.c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    z04.c0("Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        z04.c0("Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    r4.e(wpaVar.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i12 = i;
        while (wpaVar.a() > 0) {
            int i13 = this.c;
            if (i13 != 0) {
                ?? r10 = this.b;
                if (i13 == 1) {
                    i3 = i9;
                    int i14 = r8;
                    if (d(wpaVar, r10.b, 9)) {
                        r10.q(i14);
                        int i15 = r10.i(24);
                        if (i15 != 1) {
                            ey8.k(i15, "Unexpected start code prefix: ");
                            this.j = -1;
                            i2 = -1;
                            i6 = 0;
                            i4 = 2;
                        } else {
                            r10.t(8);
                            int i16 = r10.i(16);
                            r10.t(5);
                            this.k = r10.h();
                            i4 = 2;
                            r10.t(2);
                            this.f = r10.h();
                            this.g = r10.h();
                            r10.t(6);
                            int i17 = r10.i(8);
                            this.i = i17;
                            if (i16 == 0) {
                                this.j = -1;
                                i2 = -1;
                            } else {
                                int i18 = (i16 - 3) - i17;
                                this.j = i18;
                                if (i18 < 0) {
                                    z04.c0("Found negative packet payload size: " + this.j);
                                    i2 = -1;
                                    this.j = -1;
                                } else {
                                    i2 = -1;
                                }
                            }
                            i6 = 2;
                        }
                        this.c = i6;
                        i5 = 0;
                        this.d = 0;
                    } else {
                        i5 = i14;
                        i2 = -1;
                        i4 = 2;
                    }
                } else if (i13 == i10) {
                    if (d(wpaVar, r10.b, Math.min(10, this.i)) && d(wpaVar, null, this.i)) {
                        r10.q(r8);
                        this.l = -9223372036854775807L;
                        if (this.f) {
                            r10.t(4);
                            r10.t(1);
                            r10.t(1);
                            long jI = (r10.i(15) << 15) | (r10.i(i9) << 30) | r10.i(15);
                            r10.t(1);
                            if (!this.h && this.g) {
                                r10.t(4);
                                r10.t(1);
                                r10.t(1);
                                r10.t(1);
                                this.e.b((r10.i(15) << 15) | (r10.i(i9) << 30) | r10.i(15));
                                this.h = true;
                            }
                            this.l = this.e.b(jI);
                        }
                        i12 |= this.k ? 4 : 0;
                        r4.g(i12, this.l);
                        this.c = 3;
                        this.d = 0;
                        r8 = 0;
                        i10 = 2;
                        i9 = 3;
                        i8 = -1;
                    } else {
                        i3 = i9;
                        i2 = -1;
                        int i19 = r8;
                        i4 = i10;
                        i5 = i19;
                    }
                } else {
                    if (i13 != i9) {
                        throw new IllegalStateException();
                    }
                    int iA = wpaVar.a();
                    int i20 = this.j;
                    int i21 = i20 == i8 ? r8 : iA - i20;
                    if (i21 > 0) {
                        iA -= i21;
                        wpaVar.F(wpaVar.b + iA);
                    }
                    r4.d(wpaVar);
                    int i22 = this.j;
                    if (i22 != i8) {
                        int i23 = i22 - iA;
                        this.j = i23;
                        if (i23 == 0) {
                            r4.e(r8);
                            this.c = 1;
                            this.d = r8;
                        }
                    }
                    int i24 = i9;
                    i2 = i8;
                    i3 = i24;
                    int i25 = r8;
                    i4 = i10;
                    i5 = i25;
                }
            } else {
                int i26 = i9;
                i2 = i8;
                i3 = i26;
                int i27 = r8;
                i4 = i10;
                i5 = i27;
                wpaVar.H(wpaVar.a());
            }
            int i28 = i2;
            i9 = i3;
            i8 = i28;
            int i29 = i4;
            r8 = i5;
            i10 = i29;
        }
    }

    public final boolean d(wpa wpaVar, byte[] bArr, int i) {
        int iMin = Math.min(wpaVar.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            wpaVar.H(iMin);
        } else {
            wpaVar.e(this.d, bArr, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }
}
