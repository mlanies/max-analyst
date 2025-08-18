package defpackage;

/* loaded from: classes.dex */
public final class lua implements m3f {
    public final cw4 a;
    public final s02 b = new s02(new byte[10], 10, 1, (byte) 0);
    public int c = 0;
    public int d;
    public sue e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public lua(cw4 cw4Var) {
        this.a = cw4Var;
    }

    @Override // defpackage.m3f
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    @Override // defpackage.m3f
    public final void b(int i, yaf yafVar) {
        int i2;
        int i3;
        np8.g(this.e);
        int i4 = i & 1;
        cw4 cw4Var = this.a;
        int i5 = 2;
        if (i4 != 0) {
            int i6 = this.c;
            if (i6 != 0 && i6 != 1 && i6 != 2) {
                if (i6 != 3) {
                    throw new IllegalStateException();
                }
                cw4Var.h();
            }
            this.c = 1;
            this.d = 0;
        }
        int i7 = i;
        while (yafVar.c() > 0) {
            int i8 = this.c;
            if (i8 != 0) {
                s02 s02Var = this.b;
                if (i8 != 1) {
                    if (i8 == i5) {
                        if (c(yafVar, s02Var.b, Math.min(10, this.i)) && c(yafVar, null, this.i)) {
                            s02Var.q(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                s02Var.t(4);
                                s02Var.t(1);
                                s02Var.t(1);
                                long jI = (s02Var.i(3) << 30) | (s02Var.i(15) << 15) | s02Var.i(15);
                                s02Var.t(1);
                                if (!this.h && this.g) {
                                    s02Var.t(4);
                                    s02Var.t(1);
                                    s02Var.t(1);
                                    s02Var.t(1);
                                    this.e.b((s02Var.i(15) << 15) | (s02Var.i(3) << 30) | s02Var.i(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(jI);
                            }
                            i7 |= this.k ? 4 : 0;
                            cw4Var.g(i7, this.l);
                            this.c = 3;
                            this.d = 0;
                            i5 = 2;
                        }
                    } else {
                        if (i8 != 3) {
                            throw new IllegalStateException();
                        }
                        int iC = yafVar.c();
                        int i9 = this.j;
                        int i10 = i9 == -1 ? 0 : iC - i9;
                        if (i10 > 0) {
                            iC -= i10;
                            yafVar.G(yafVar.b + iC);
                        }
                        cw4Var.f(yafVar);
                        int i11 = this.j;
                        if (i11 != -1) {
                            int i12 = i11 - iC;
                            this.j = i12;
                            if (i12 == 0) {
                                cw4Var.h();
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                    i2 = i5;
                } else if (c(yafVar, s02Var.b, 9)) {
                    s02Var.q(0);
                    if (s02Var.i(24) != 1) {
                        this.j = -1;
                        i3 = 0;
                        i2 = 2;
                    } else {
                        s02Var.t(8);
                        int i13 = s02Var.i(16);
                        s02Var.t(5);
                        this.k = s02Var.h();
                        i2 = 2;
                        s02Var.t(2);
                        this.f = s02Var.h();
                        this.g = s02Var.h();
                        s02Var.t(6);
                        int i14 = s02Var.i(8);
                        this.i = i14;
                        if (i13 == 0) {
                            this.j = -1;
                        } else {
                            int i15 = (i13 - 3) - i14;
                            this.j = i15;
                            if (i15 < 0) {
                                this.j = -1;
                            }
                        }
                        i3 = 2;
                    }
                    this.c = i3;
                    this.d = 0;
                } else {
                    i2 = 2;
                }
            } else {
                i2 = i5;
                yafVar.I(yafVar.c());
            }
            i5 = i2;
        }
    }

    public final boolean c(yaf yafVar, byte[] bArr, int i) {
        int iMin = Math.min(yafVar.c(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            yafVar.I(iMin);
        } else {
            yafVar.g(this.d, bArr, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.m3f
    public final void e(sue sueVar, oa5 oa5Var, l3f l3fVar) {
        this.e = sueVar;
        this.a.j(oa5Var, l3fVar);
    }
}
