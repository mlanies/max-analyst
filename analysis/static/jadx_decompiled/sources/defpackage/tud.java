package defpackage;

import java.util.Arrays;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class tud {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;
    public final short[] j;
    public short[] k;
    public int l;
    public short[] m;
    public int n;
    public short[] o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;

    public tud(int i, int i2, float f, float f2, int i3, int i4) {
        this.a = i4;
        switch (i4) {
            case 1:
                this.b = i;
                this.c = i2;
                this.d = f;
                this.e = f2;
                this.f = i / i3;
                this.g = i / HttpStatus.SC_BAD_REQUEST;
                int i5 = i / 65;
                this.h = i5;
                int i6 = i5 * 2;
                this.i = i6;
                this.j = new short[i6];
                this.k = new short[i6 * i2];
                this.m = new short[i6 * i2];
                this.o = new short[i6 * i2];
                break;
            default:
                this.b = i;
                this.c = i2;
                this.d = f;
                this.e = f2;
                this.f = i / i3;
                this.g = i / HttpStatus.SC_BAD_REQUEST;
                int i7 = i / 65;
                this.h = i7;
                int i8 = i7 * 2;
                this.i = i8;
                this.j = new short[i8];
                this.k = new short[i8 * i2];
                this.m = new short[i8 * i2];
                this.o = new short[i8 * i2];
                break;
        }
    }

    public static void e(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public static void f(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final void a(short[] sArr, int i, int i2) {
        switch (this.a) {
            case 0:
                short[] sArrC = c(this.m, this.n, i2);
                this.m = sArrC;
                int i3 = this.c;
                System.arraycopy(sArr, i * i3, sArrC, this.n * i3, i3 * i2);
                this.n += i2;
                break;
            default:
                short[] sArrC2 = c(this.m, this.n, i2);
                this.m = sArrC2;
                int i4 = this.c;
                System.arraycopy(sArr, i * i4, sArrC2, this.n * i4, i4 * i2);
                this.n += i2;
                break;
        }
    }

    public final void b(short[] sArr, int i, int i2) {
        switch (this.a) {
            case 0:
                int i3 = this.i / i2;
                int i4 = this.c;
                int i5 = i2 * i4;
                int i6 = i * i4;
                for (int i7 = 0; i7 < i3; i7++) {
                    int i8 = 0;
                    for (int i9 = 0; i9 < i5; i9++) {
                        i8 += sArr[(i7 * i5) + i6 + i9];
                    }
                    this.j[i7] = (short) (i8 / i5);
                }
                break;
            default:
                int i10 = this.i / i2;
                int i11 = this.c;
                int i12 = i2 * i11;
                int i13 = i * i11;
                for (int i14 = 0; i14 < i10; i14++) {
                    int i15 = 0;
                    for (int i16 = 0; i16 < i12; i16++) {
                        i15 += sArr[(i14 * i12) + i13 + i16];
                    }
                    this.j[i14] = (short) (i15 / i12);
                }
                break;
        }
    }

    public final short[] c(short[] sArr, int i, int i2) {
        switch (this.a) {
            case 0:
                int length = sArr.length;
                int i3 = this.c;
                int i4 = length / i3;
                return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
            default:
                int length2 = sArr.length;
                int i5 = this.c;
                int i6 = length2 / i5;
                return i + i2 <= i6 ? sArr : Arrays.copyOf(sArr, (((i6 * 3) / 2) + i2) * i5);
        }
    }

    public final int d(short[] sArr, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                int i4 = i * this.c;
                int i5 = 255;
                int i6 = 1;
                int i7 = 0;
                int i8 = 0;
                while (i2 <= i3) {
                    int iAbs = 0;
                    for (int i9 = 0; i9 < i2; i9++) {
                        iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
                    }
                    if (iAbs * i7 < i6 * i2) {
                        i7 = i2;
                        i6 = iAbs;
                    }
                    if (iAbs * i5 > i8 * i2) {
                        i5 = i2;
                        i8 = iAbs;
                    }
                    i2++;
                }
                this.v = i6 / i7;
                this.w = i8 / i5;
                return i7;
            default:
                int i10 = i * this.c;
                int i11 = 255;
                int i12 = 1;
                int i13 = 0;
                int i14 = 0;
                while (i2 <= i3) {
                    int iAbs2 = 0;
                    for (int i15 = 0; i15 < i2; i15++) {
                        iAbs2 += Math.abs(sArr[i10 + i15] - sArr[(i10 + i2) + i15]);
                    }
                    if (iAbs2 * i13 < i12 * i2) {
                        i13 = i2;
                        i12 = iAbs2;
                    }
                    if (iAbs2 * i11 > i14 * i2) {
                        i11 = i2;
                        i14 = iAbs2;
                    }
                    i2++;
                }
                this.v = i12 / i13;
                this.w = i14 / i11;
                return i13;
        }
    }

    public final void g() {
        int i;
        int i2;
        float f;
        int iD;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f2;
        int iD2;
        int i9;
        int i10;
        int i11;
        int i12;
        switch (this.a) {
            case 0:
                int i13 = this.n;
                float f3 = this.d;
                float f4 = this.e;
                float f5 = f3 / f4;
                float f6 = this.f * f4;
                double d = f5;
                int i14 = this.b;
                int i15 = this.c;
                int i16 = 1;
                if (d > 1.00001d || d < 0.99999d) {
                    int i17 = this.l;
                    int i18 = this.i;
                    if (i17 >= i18) {
                        int i19 = 0;
                        while (true) {
                            int i20 = this.s;
                            if (i20 > 0) {
                                int iMin = Math.min(i18, i20);
                                a(this.k, i19, iMin);
                                this.s -= iMin;
                                i19 += iMin;
                                i2 = i13;
                                f = f6;
                                i = i14;
                            } else {
                                short[] sArr = this.k;
                                int i21 = i14 > 4000 ? i14 / 4000 : i16;
                                int i22 = this.h;
                                int i23 = this.g;
                                if (i15 == i16 && i21 == i16) {
                                    iD = d(sArr, i19, i23, i22);
                                    i2 = i13;
                                    f = f6;
                                    i = i14;
                                } else {
                                    b(sArr, i19, i21);
                                    i = i14;
                                    i2 = i13;
                                    short[] sArr2 = this.j;
                                    f = f6;
                                    int iD3 = d(sArr2, 0, i23 / i21, i22 / i21);
                                    if (i21 != 1) {
                                        int i24 = iD3 * i21;
                                        int i25 = i21 * 4;
                                        int i26 = i24 - i25;
                                        int i27 = i24 + i25;
                                        if (i26 >= i23) {
                                            i23 = i26;
                                        }
                                        if (i27 <= i22) {
                                            i22 = i27;
                                        }
                                        if (i15 == 1) {
                                            iD = d(sArr, i19, i23, i22);
                                        } else {
                                            b(sArr, i19, 1);
                                            iD = d(sArr2, 0, i23, i22);
                                        }
                                    } else {
                                        iD = iD3;
                                    }
                                }
                                int i28 = this.v;
                                int i29 = this.w;
                                if (i28 == 0 || (i3 = this.t) == 0 || i29 > i28 * 3 || i28 * 2 <= this.u * 3) {
                                    i3 = iD;
                                }
                                this.u = i28;
                                this.t = iD;
                                if (d > 1.0d) {
                                    short[] sArr3 = this.k;
                                    if (f5 >= 2.0f) {
                                        i5 = (int) (i3 / (f5 - 1.0f));
                                    } else {
                                        this.s = (int) (((2.0f - f5) * i3) / (f5 - 1.0f));
                                        i5 = i3;
                                    }
                                    short[] sArrC = c(this.m, this.n, i5);
                                    this.m = sArrC;
                                    int i30 = i19;
                                    e(i5, this.c, sArrC, this.n, sArr3, i30, sArr3, i19 + i3);
                                    this.n += i5;
                                    i19 = i3 + i5 + i30;
                                } else {
                                    int i31 = i19;
                                    short[] sArr4 = this.k;
                                    if (f5 < 0.5f) {
                                        i4 = (int) ((i3 * f5) / (1.0f - f5));
                                    } else {
                                        this.s = (int) ((((2.0f * f5) - 1.0f) * i3) / (1.0f - f5));
                                        i4 = i3;
                                    }
                                    int i32 = i3 + i4;
                                    short[] sArrC2 = c(this.m, this.n, i32);
                                    this.m = sArrC2;
                                    System.arraycopy(sArr4, i31 * i15, sArrC2, this.n * i15, i3 * i15);
                                    e(i4, this.c, this.m, this.n + i3, sArr4, i31 + i3, sArr4, i31);
                                    this.n += i32;
                                    i19 = i31 + i4;
                                }
                            }
                            if (i19 + i18 > i17) {
                                int i33 = this.l - i19;
                                short[] sArr5 = this.k;
                                System.arraycopy(sArr5, i19 * i15, sArr5, 0, i33 * i15);
                                this.l = i33;
                            } else {
                                i14 = i;
                                i13 = i2;
                                f6 = f;
                                i16 = 1;
                            }
                        }
                    }
                    if (f == 1.0f && this.n != (i6 = i2)) {
                        int i34 = i;
                        int i35 = (int) (i34 / f);
                        int i36 = i34;
                        while (true) {
                            if (i35 <= 16384 && i36 <= 16384) {
                                int i37 = this.n - i6;
                                short[] sArrC3 = c(this.o, this.p, i37);
                                this.o = sArrC3;
                                System.arraycopy(this.m, i6 * i15, sArrC3, this.p * i15, i37 * i15);
                                this.n = i6;
                                this.p += i37;
                                int i38 = 0;
                                while (true) {
                                    int i39 = this.p;
                                    int i40 = i39 - 1;
                                    if (i38 < i40) {
                                        while (true) {
                                            int i41 = this.q + 1;
                                            int i42 = i41 * i35;
                                            int i43 = this.r;
                                            if (i42 > i43 * i36) {
                                                this.m = c(this.m, this.n, 1);
                                                for (int i44 = 0; i44 < i15; i44++) {
                                                    short[] sArr6 = this.m;
                                                    int i45 = (this.n * i15) + i44;
                                                    short[] sArr7 = this.o;
                                                    int i46 = (i38 * i15) + i44;
                                                    short s = sArr7[i46];
                                                    short s2 = sArr7[i46 + i15];
                                                    int i47 = this.r * i36;
                                                    int i48 = this.q;
                                                    int i49 = i48 * i35;
                                                    int i50 = (i48 + 1) * i35;
                                                    int i51 = i50 - i47;
                                                    int i52 = i50 - i49;
                                                    sArr6[i45] = (short) ((((i52 - i51) * s2) + (s * i51)) / i52);
                                                }
                                                this.r++;
                                                this.n++;
                                            } else {
                                                this.q = i41;
                                                if (i41 == i36) {
                                                    this.q = 0;
                                                    np8.f(i43 == i35);
                                                    this.r = 0;
                                                }
                                                i38++;
                                            }
                                        }
                                    } else if (i40 != 0) {
                                        short[] sArr8 = this.o;
                                        System.arraycopy(sArr8, i40 * i15, sArr8, 0, (i39 - i40) * i15);
                                        this.p -= i40;
                                        break;
                                    }
                                }
                            } else {
                                i35 /= 2;
                                i36 /= 2;
                            }
                        }
                    }
                } else {
                    a(this.k, 0, this.l);
                    this.l = 0;
                }
                i2 = i13;
                f = f6;
                i = i14;
                if (f == 1.0f) {
                }
                break;
            default:
                int i53 = this.n;
                float f7 = this.d;
                float f8 = this.e;
                float f9 = f7 / f8;
                float f10 = this.f * f8;
                double d2 = f9;
                int i54 = this.b;
                int i55 = this.c;
                int i56 = 1;
                if (d2 > 1.00001d || d2 < 0.99999d) {
                    int i57 = this.l;
                    int i58 = this.i;
                    if (i57 >= i58) {
                        int i59 = 0;
                        while (true) {
                            int i60 = this.s;
                            if (i60 > 0) {
                                int iMin2 = Math.min(i58, i60);
                                a(this.k, i59, iMin2);
                                this.s -= iMin2;
                                i59 += iMin2;
                                i8 = i53;
                                f2 = f10;
                                i7 = i54;
                            } else {
                                short[] sArr9 = this.k;
                                int i61 = i54 > 4000 ? i54 / 4000 : i56;
                                int i62 = this.h;
                                int i63 = this.g;
                                if (i55 == i56 && i61 == i56) {
                                    iD2 = d(sArr9, i59, i63, i62);
                                    i8 = i53;
                                    f2 = f10;
                                    i7 = i54;
                                } else {
                                    b(sArr9, i59, i61);
                                    i7 = i54;
                                    i8 = i53;
                                    short[] sArr10 = this.j;
                                    f2 = f10;
                                    int iD4 = d(sArr10, 0, i63 / i61, i62 / i61);
                                    if (i61 != 1) {
                                        int i64 = iD4 * i61;
                                        int i65 = i61 * 4;
                                        int i66 = i64 - i65;
                                        int i67 = i64 + i65;
                                        if (i66 >= i63) {
                                            i63 = i66;
                                        }
                                        if (i67 <= i62) {
                                            i62 = i67;
                                        }
                                        if (i55 == 1) {
                                            iD2 = d(sArr9, i59, i63, i62);
                                        } else {
                                            b(sArr9, i59, 1);
                                            iD2 = d(sArr10, 0, i63, i62);
                                        }
                                    } else {
                                        iD2 = iD4;
                                    }
                                }
                                int i68 = this.v;
                                int i69 = this.w;
                                if (i68 == 0 || (i9 = this.t) == 0 || i69 > i68 * 3 || i68 * 2 <= this.u * 3) {
                                    i9 = iD2;
                                }
                                this.u = i68;
                                this.t = iD2;
                                if (d2 > 1.0d) {
                                    short[] sArr11 = this.k;
                                    if (f9 >= 2.0f) {
                                        i11 = (int) (i9 / (f9 - 1.0f));
                                    } else {
                                        this.s = (int) (((2.0f - f9) * i9) / (f9 - 1.0f));
                                        i11 = i9;
                                    }
                                    short[] sArrC4 = c(this.m, this.n, i11);
                                    this.m = sArrC4;
                                    int i70 = i59;
                                    f(i11, this.c, sArrC4, this.n, sArr11, i70, sArr11, i59 + i9);
                                    this.n += i11;
                                    i59 = i9 + i11 + i70;
                                } else {
                                    int i71 = i59;
                                    short[] sArr12 = this.k;
                                    if (f9 < 0.5f) {
                                        i10 = (int) ((i9 * f9) / (1.0f - f9));
                                    } else {
                                        this.s = (int) ((((2.0f * f9) - 1.0f) * i9) / (1.0f - f9));
                                        i10 = i9;
                                    }
                                    int i72 = i9 + i10;
                                    short[] sArrC5 = c(this.m, this.n, i72);
                                    this.m = sArrC5;
                                    System.arraycopy(sArr12, i71 * i55, sArrC5, this.n * i55, i9 * i55);
                                    f(i10, this.c, this.m, this.n + i9, sArr12, i71 + i9, sArr12, i71);
                                    this.n += i72;
                                    i59 = i71 + i10;
                                }
                            }
                            if (i59 + i58 > i57) {
                                int i73 = this.l - i59;
                                short[] sArr13 = this.k;
                                System.arraycopy(sArr13, i59 * i55, sArr13, 0, i73 * i55);
                                this.l = i73;
                            } else {
                                i54 = i7;
                                i53 = i8;
                                f10 = f2;
                                i56 = 1;
                            }
                        }
                    }
                    if (f2 == 1.0f && this.n != (i12 = i8)) {
                        int i74 = i7;
                        int i75 = (int) (i74 / f2);
                        int i76 = i74;
                        while (true) {
                            if (i75 <= 16384 && i76 <= 16384) {
                                int i77 = this.n - i12;
                                short[] sArrC6 = c(this.o, this.p, i77);
                                this.o = sArrC6;
                                System.arraycopy(this.m, i12 * i55, sArrC6, this.p * i55, i77 * i55);
                                this.n = i12;
                                this.p += i77;
                                int i78 = 0;
                                while (true) {
                                    int i79 = this.p;
                                    int i80 = i79 - 1;
                                    if (i78 < i80) {
                                        while (true) {
                                            int i81 = this.q + 1;
                                            int i82 = i81 * i75;
                                            int i83 = this.r;
                                            if (i82 > i83 * i76) {
                                                this.m = c(this.m, this.n, 1);
                                                for (int i84 = 0; i84 < i55; i84++) {
                                                    short[] sArr14 = this.m;
                                                    int i85 = (this.n * i55) + i84;
                                                    short[] sArr15 = this.o;
                                                    int i86 = (i78 * i55) + i84;
                                                    short s3 = sArr15[i86];
                                                    short s4 = sArr15[i86 + i55];
                                                    int i87 = this.r * i76;
                                                    int i88 = this.q;
                                                    int i89 = i88 * i75;
                                                    int i90 = (i88 + 1) * i75;
                                                    int i91 = i90 - i87;
                                                    int i92 = i90 - i89;
                                                    sArr14[i85] = (short) ((((i92 - i91) * s4) + (s3 * i91)) / i92);
                                                }
                                                this.r++;
                                                this.n++;
                                            } else {
                                                this.q = i81;
                                                if (i81 == i76) {
                                                    this.q = 0;
                                                    fm9.k(i83 == i75);
                                                    this.r = 0;
                                                }
                                                i78++;
                                            }
                                        }
                                    } else if (i80 != 0) {
                                        short[] sArr16 = this.o;
                                        System.arraycopy(sArr16, i80 * i55, sArr16, 0, (i79 - i80) * i55);
                                        this.p -= i80;
                                        break;
                                    }
                                }
                            } else {
                                i75 /= 2;
                                i76 /= 2;
                            }
                        }
                    }
                } else {
                    a(this.k, 0, this.l);
                    this.l = 0;
                }
                i8 = i53;
                f2 = f10;
                i7 = i54;
                if (f2 == 1.0f) {
                }
                break;
        }
    }
}
