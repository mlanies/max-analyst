package defpackage;

/* loaded from: classes.dex */
public final class ie9 {
    public final /* synthetic */ int a;
    public int b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        switch (this.a) {
            case 0:
                if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                    return false;
                }
                this.b = i2;
                this.c = ay7.w[3 - i3];
                int i10 = ay7.x[i5];
                this.e = i10;
                if (i2 == 2) {
                    this.e = i10 / 2;
                } else if (i2 == 0) {
                    this.e = i10 / 4;
                }
                int i11 = (i >>> 9) & 1;
                int i12 = 1152;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalArgumentException();
                        }
                        i12 = 384;
                    }
                } else if (i2 != 3) {
                    i12 = 576;
                }
                this.h = i12;
                if (i3 == 3) {
                    int i13 = i2 == 3 ? ay7.y[i4 - 1] : ay7.z[i4 - 1];
                    this.g = i13;
                    this.d = (((i13 * 12) / this.e) + i11) * 4;
                } else {
                    if (i2 == 3) {
                        int i14 = i3 == 2 ? ay7.A[i4 - 1] : ay7.B[i4 - 1];
                        this.g = i14;
                        this.d = ((i14 * 144) / this.e) + i11;
                    } else {
                        int i15 = ay7.C[i4 - 1];
                        this.g = i15;
                        this.d = (((i3 == 1 ? 72 : 144) * i15) / this.e) + i11;
                    }
                }
                this.f = ((i >> 6) & 3) == 3 ? 1 : 2;
                return true;
            default:
                if (!((i & (-2097152)) == -2097152) || (i6 = (i >>> 19) & 3) == 1 || (i7 = (i >>> 17) & 3) == 0 || (i8 = (i >>> 12) & 15) == 0 || i8 == 15 || (i9 = (i >>> 10) & 3) == 3) {
                    return false;
                }
                this.b = i6;
                this.c = dy7.d[3 - i7];
                int i16 = dy7.e[i9];
                this.e = i16;
                if (i6 == 2) {
                    this.e = i16 / 2;
                } else if (i6 == 0) {
                    this.e = i16 / 4;
                }
                int i17 = (i >>> 9) & 1;
                int i18 = 1152;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalArgumentException();
                        }
                        i18 = 384;
                    }
                } else if (i6 != 3) {
                    i18 = 576;
                }
                this.h = i18;
                if (i7 == 3) {
                    int i19 = i6 == 3 ? dy7.f[i8 - 1] : dy7.g[i8 - 1];
                    this.g = i19;
                    this.d = (((i19 * 12) / this.e) + i17) * 4;
                } else {
                    if (i6 == 3) {
                        int i20 = i7 == 2 ? dy7.h[i8 - 1] : dy7.i[i8 - 1];
                        this.g = i20;
                        this.d = ((i20 * 144) / this.e) + i17;
                    } else {
                        int i21 = dy7.j[i8 - 1];
                        this.g = i21;
                        this.d = (((i7 == 1 ? 72 : 144) * i21) / this.e) + i17;
                    }
                }
                this.f = ((i >> 6) & 3) == 3 ? 1 : 2;
                return true;
        }
    }
}
