package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class arf extends a9e {
    public l0f o;
    public int p;
    public boolean q;
    public crf r;
    public hgf s;

    @Override // defpackage.a9e
    public final void a(long j) {
        this.d = j;
        this.q = j != 0;
        crf crfVar = this.r;
        this.p = crfVar != null ? crfVar.e : 0;
    }

    @Override // defpackage.a9e
    public final long c(yaf yafVar) {
        byte b = yafVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        l0f l0fVar = this.o;
        np8.g(l0fVar);
        boolean z = ((ae3[]) l0fVar.c)[(b >> 1) & (255 >>> (8 - l0fVar.b))].b;
        crf crfVar = (crf) l0fVar.o;
        int i = !z ? crfVar.e : crfVar.f;
        long j = this.q ? (this.p + i) / 4 : 0;
        byte[] bArr = yafVar.a;
        int length = bArr.length;
        int i2 = yafVar.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            yafVar.F(bArrCopyOf.length, bArrCopyOf);
        } else {
            yafVar.G(i2);
        }
        byte[] bArr2 = yafVar.a;
        int i3 = yafVar.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.q = true;
        this.p = i;
        return j;
    }

    @Override // defpackage.a9e
    public final boolean e(yaf yafVar, long j, l7b l7bVar) throws ParserException {
        l0f l0fVar;
        byte[] bArr;
        int i;
        byte[] bArr2;
        if (this.o != null) {
            ((oy5) l7bVar.b).getClass();
            return false;
        }
        crf crfVar = this.r;
        if (crfVar == null) {
            f8.F(1, yafVar, false);
            yafVar.n();
            int iV = yafVar.v();
            int iN = yafVar.n();
            int iJ = yafVar.j();
            int i2 = iJ <= 0 ? -1 : iJ;
            int iJ2 = yafVar.j();
            int i3 = iJ2 <= 0 ? -1 : iJ2;
            yafVar.j();
            int iV2 = yafVar.v();
            int iPow = (int) Math.pow(2.0d, iV2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iV2 & 240) >> 4);
            yafVar.v();
            this.r = new crf(iV, iN, i2, i3, iPow, iPow2, Arrays.copyOf(yafVar.a, yafVar.c));
        } else {
            hgf hgfVar = this.s;
            if (hgfVar == null) {
                this.s = f8.y(yafVar, true, true);
            } else {
                int i4 = yafVar.c;
                byte[] bArr3 = new byte[i4];
                System.arraycopy(yafVar.a, 0, bArr3, 0, i4);
                int i5 = 5;
                f8.F(5, yafVar, false);
                int iV3 = yafVar.v() + 1;
                s02 s02Var = new s02(5, yafVar.a);
                s02Var.t(yafVar.b * 8);
                int i6 = 0;
                while (i6 < iV3) {
                    if (s02Var.i(24) != 5653314) {
                        int i7 = (s02Var.d * 8) + s02Var.e;
                        StringBuilder sb = new StringBuilder(66);
                        sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        sb.append(i7);
                        throw ParserException.a(null, sb.toString());
                    }
                    int i8 = s02Var.i(16);
                    int i9 = s02Var.i(24);
                    long[] jArr = new long[i9];
                    long jFloor = 0;
                    if (s02Var.h()) {
                        bArr = bArr3;
                        int i10 = s02Var.i(i5) + 1;
                        int i11 = 0;
                        while (i11 < i9) {
                            int i12 = s02Var.i(f8.l(i9 - i11));
                            int i13 = 0;
                            while (i13 < i12 && i11 < i9) {
                                jArr[i11] = i10;
                                i11++;
                                i13++;
                                i12 = i12;
                                hgfVar = hgfVar;
                            }
                            i10++;
                            hgfVar = hgfVar;
                        }
                    } else {
                        boolean zH = s02Var.h();
                        int i14 = 0;
                        while (i14 < i9) {
                            if (zH) {
                                if (s02Var.h()) {
                                    bArr2 = bArr3;
                                    jArr[i14] = s02Var.i(i5) + 1;
                                } else {
                                    bArr2 = bArr3;
                                    jArr[i14] = 0;
                                }
                                i = 5;
                            } else {
                                i = i5;
                                bArr2 = bArr3;
                                jArr[i14] = s02Var.i(i) + 1;
                            }
                            i14++;
                            i5 = i;
                            bArr3 = bArr2;
                        }
                        bArr = bArr3;
                    }
                    hgf hgfVar2 = hgfVar;
                    int i15 = s02Var.i(4);
                    if (i15 > 2) {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("lookup type greater than 2 not decodable: ");
                        sb2.append(i15);
                        throw ParserException.a(null, sb2.toString());
                    }
                    if (i15 == 1 || i15 == 2) {
                        s02Var.t(32);
                        s02Var.t(32);
                        int i16 = s02Var.i(4) + 1;
                        s02Var.t(1);
                        if (i15 != 1) {
                            jFloor = i9 * i8;
                        } else if (i8 != 0) {
                            jFloor = (long) Math.floor(Math.pow(i9, 1.0d / i8));
                        }
                        s02Var.t((int) (i16 * jFloor));
                    }
                    i6++;
                    bArr3 = bArr;
                    hgfVar = hgfVar2;
                    i5 = 5;
                }
                hgf hgfVar3 = hgfVar;
                byte[] bArr4 = bArr3;
                int i17 = 6;
                int i18 = s02Var.i(6) + 1;
                for (int i19 = 0; i19 < i18; i19++) {
                    if (s02Var.i(16) != 0) {
                        throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                    }
                }
                int i20 = s02Var.i(6) + 1;
                int i21 = 0;
                while (true) {
                    int i22 = 3;
                    if (i21 < i20) {
                        int i23 = s02Var.i(16);
                        if (i23 == 0) {
                            int i24 = 8;
                            s02Var.t(8);
                            s02Var.t(16);
                            s02Var.t(16);
                            s02Var.t(6);
                            s02Var.t(8);
                            int i25 = s02Var.i(4) + 1;
                            int i26 = 0;
                            while (i26 < i25) {
                                s02Var.t(i24);
                                i26++;
                                i24 = 8;
                            }
                        } else {
                            if (i23 != 1) {
                                StringBuilder sb3 = new StringBuilder(52);
                                sb3.append("floor type greater than 1 not decodable: ");
                                sb3.append(i23);
                                throw ParserException.a(null, sb3.toString());
                            }
                            int i27 = s02Var.i(5);
                            int[] iArr = new int[i27];
                            int i28 = -1;
                            for (int i29 = 0; i29 < i27; i29++) {
                                int i30 = s02Var.i(4);
                                iArr[i29] = i30;
                                if (i30 > i28) {
                                    i28 = i30;
                                }
                            }
                            int i31 = i28 + 1;
                            int[] iArr2 = new int[i31];
                            int i32 = 0;
                            while (i32 < i31) {
                                iArr2[i32] = s02Var.i(i22) + 1;
                                int i33 = s02Var.i(2);
                                int i34 = 8;
                                if (i33 > 0) {
                                    s02Var.t(8);
                                }
                                int i35 = 0;
                                while (i35 < (1 << i33)) {
                                    s02Var.t(i34);
                                    i35++;
                                    i34 = 8;
                                }
                                i32++;
                                i22 = 3;
                            }
                            s02Var.t(2);
                            int i36 = s02Var.i(4);
                            int i37 = 0;
                            int i38 = 0;
                            for (int i39 = 0; i39 < i27; i39++) {
                                i37 += iArr2[iArr[i39]];
                                while (i38 < i37) {
                                    s02Var.t(i36);
                                    i38++;
                                }
                            }
                        }
                        i21++;
                        i17 = 6;
                    } else {
                        int i40 = s02Var.i(i17) + 1;
                        int i41 = 0;
                        while (i41 < i40) {
                            if (s02Var.i(16) > 2) {
                                throw ParserException.a(null, "residueType greater than 2 is not decodable");
                            }
                            s02Var.t(24);
                            s02Var.t(24);
                            s02Var.t(24);
                            int i42 = s02Var.i(i17) + 1;
                            int i43 = 8;
                            s02Var.t(8);
                            int[] iArr3 = new int[i42];
                            for (int i44 = 0; i44 < i42; i44++) {
                                iArr3[i44] = ((s02Var.h() ? s02Var.i(5) : 0) * 8) + s02Var.i(3);
                            }
                            int i45 = 0;
                            while (i45 < i42) {
                                int i46 = 0;
                                while (i46 < i43) {
                                    if ((iArr3[i45] & (1 << i46)) != 0) {
                                        s02Var.t(i43);
                                    }
                                    i46++;
                                    i43 = 8;
                                }
                                i45++;
                                i43 = 8;
                            }
                            i41++;
                            i17 = 6;
                        }
                        int i47 = s02Var.i(i17) + 1;
                        for (int i48 = 0; i48 < i47; i48++) {
                            if (s02Var.i(16) == 0) {
                                int i49 = s02Var.h() ? s02Var.i(4) + 1 : 1;
                                boolean zH2 = s02Var.h();
                                int i50 = crfVar.a;
                                if (zH2) {
                                    int i51 = s02Var.i(8) + 1;
                                    for (int i52 = 0; i52 < i51; i52++) {
                                        int i53 = i50 - 1;
                                        s02Var.t(f8.l(i53));
                                        s02Var.t(f8.l(i53));
                                    }
                                }
                                if (s02Var.i(2) != 0) {
                                    throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                }
                                if (i49 > 1) {
                                    for (int i54 = 0; i54 < i50; i54++) {
                                        s02Var.t(4);
                                    }
                                }
                                for (int i55 = 0; i55 < i49; i55++) {
                                    s02Var.t(8);
                                    s02Var.t(8);
                                    s02Var.t(8);
                                }
                            }
                        }
                        int i56 = s02Var.i(6);
                        int i57 = i56 + 1;
                        ae3[] ae3VarArr = new ae3[i57];
                        for (int i58 = 0; i58 < i57; i58++) {
                            boolean zH3 = s02Var.h();
                            s02Var.i(16);
                            s02Var.i(16);
                            s02Var.i(8);
                            ae3VarArr[i58] = new ae3(9, zH3, false);
                        }
                        if (!s02Var.h()) {
                            throw ParserException.a(null, "framing bit after modes not set as expected");
                        }
                        l0fVar = new l0f(crfVar, hgfVar3, bArr4, ae3VarArr, f8.l(i56), 13);
                    }
                }
            }
        }
        l0fVar = null;
        this.o = l0fVar;
        if (l0fVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        crf crfVar2 = (crf) l0fVar.o;
        arrayList.add(crfVar2.g);
        arrayList.add((byte[]) l0fVar.Y);
        e99 e99VarV = f8.v(zw6.k((String[]) ((hgf) l0fVar.X).a));
        my5 my5Var = new my5();
        my5Var.k = "audio/vorbis";
        my5Var.f = crfVar2.d;
        my5Var.g = crfVar2.c;
        my5Var.x = crfVar2.a;
        my5Var.y = crfVar2.b;
        my5Var.m = arrayList;
        my5Var.i = e99VarV;
        l7bVar.b = new oy5(my5Var);
        return true;
    }

    @Override // defpackage.a9e
    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = null;
            this.r = null;
            this.s = null;
        }
        this.p = 0;
        this.q = false;
    }
}
