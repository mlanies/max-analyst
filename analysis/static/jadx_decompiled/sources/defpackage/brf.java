package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class brf extends a9e {
    public l0f o;
    public int p;
    public boolean q;
    public crf r;
    public mfe s;

    @Override // defpackage.a9e
    public final void a(long j) {
        this.d = j;
        this.q = j != 0;
        crf crfVar = this.r;
        this.p = crfVar != null ? crfVar.e : 0;
    }

    @Override // defpackage.a9e
    public final long b(wpa wpaVar) {
        byte b = wpaVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        l0f l0fVar = this.o;
        fm9.l(l0fVar);
        boolean z = ((ae3[]) l0fVar.c)[(b >> 1) & (255 >>> (8 - l0fVar.b))].b;
        crf crfVar = (crf) l0fVar.o;
        int i = !z ? crfVar.e : crfVar.f;
        long j = this.q ? (this.p + i) / 4 : 0;
        byte[] bArr = wpaVar.a;
        int length = bArr.length;
        int i2 = wpaVar.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            wpaVar.E(bArrCopyOf.length, bArrCopyOf);
        } else {
            wpaVar.F(i2);
        }
        byte[] bArr2 = wpaVar.a;
        int i3 = wpaVar.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.q = true;
        this.p = i;
        return j;
    }

    @Override // defpackage.a9e
    public final boolean d(wpa wpaVar, long j, djb djbVar) throws ParserException {
        l0f l0fVar;
        if (this.o != null) {
            ((qy5) djbVar.b).getClass();
            return false;
        }
        crf crfVar = this.r;
        int i = 4;
        if (crfVar == null) {
            m6d.T(1, wpaVar, false);
            wpaVar.m();
            int iU = wpaVar.u();
            int iM = wpaVar.m();
            int i2 = wpaVar.i();
            int i3 = i2 <= 0 ? -1 : i2;
            int i4 = wpaVar.i();
            int i5 = i4 <= 0 ? -1 : i4;
            wpaVar.i();
            int iU2 = wpaVar.u();
            int iPow = (int) Math.pow(2.0d, iU2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iU2 & 240) >> 4);
            wpaVar.u();
            this.r = new crf(iU, iM, i3, i5, iPow, iPow2, Arrays.copyOf(wpaVar.a, wpaVar.c));
        } else {
            mfe mfeVar = this.s;
            if (mfeVar == null) {
                this.s = m6d.J(wpaVar, true, true);
            } else {
                int i6 = wpaVar.c;
                byte[] bArr = new byte[i6];
                System.arraycopy(wpaVar.a, 0, bArr, 0, i6);
                int i7 = 5;
                m6d.T(5, wpaVar, false);
                int iU3 = wpaVar.u() + 1;
                s02 s02Var = new s02(6, wpaVar.a);
                s02Var.t(wpaVar.b * 8);
                int i8 = 0;
                while (true) {
                    int i9 = 16;
                    if (i8 >= iU3) {
                        int i10 = 6;
                        int i11 = s02Var.i(6) + 1;
                        for (int i12 = 0; i12 < i11; i12++) {
                            if (s02Var.i(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i13 = s02Var.i(6) + 1;
                        int i14 = 0;
                        while (true) {
                            int i15 = 3;
                            if (i14 < i13) {
                                int i16 = s02Var.i(i9);
                                if (i16 == 0) {
                                    int i17 = 8;
                                    s02Var.t(8);
                                    s02Var.t(16);
                                    s02Var.t(16);
                                    s02Var.t(6);
                                    s02Var.t(8);
                                    int i18 = s02Var.i(4) + 1;
                                    int i19 = 0;
                                    while (i19 < i18) {
                                        s02Var.t(i17);
                                        i19++;
                                        i17 = 8;
                                    }
                                } else {
                                    if (i16 != 1) {
                                        throw ParserException.a(null, "floor type greater than 1 not decodable: " + i16);
                                    }
                                    int i20 = s02Var.i(i7);
                                    int[] iArr = new int[i20];
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < i20; i22++) {
                                        int i23 = s02Var.i(i);
                                        iArr[i22] = i23;
                                        if (i23 > i21) {
                                            i21 = i23;
                                        }
                                    }
                                    int i24 = i21 + 1;
                                    int[] iArr2 = new int[i24];
                                    int i25 = 0;
                                    while (i25 < i24) {
                                        iArr2[i25] = s02Var.i(i15) + 1;
                                        int i26 = s02Var.i(2);
                                        int i27 = 8;
                                        if (i26 > 0) {
                                            s02Var.t(8);
                                        }
                                        int i28 = i24;
                                        int i29 = 0;
                                        while (i29 < (1 << i26)) {
                                            s02Var.t(i27);
                                            i29++;
                                            i27 = 8;
                                        }
                                        i25++;
                                        i24 = i28;
                                        i15 = 3;
                                    }
                                    s02Var.t(2);
                                    int i30 = s02Var.i(4);
                                    int i31 = 0;
                                    int i32 = 0;
                                    for (int i33 = 0; i33 < i20; i33++) {
                                        i31 += iArr2[iArr[i33]];
                                        while (i32 < i31) {
                                            s02Var.t(i30);
                                            i32++;
                                        }
                                    }
                                }
                                i14++;
                                i10 = 6;
                                i = 4;
                                i9 = 16;
                                i7 = 5;
                            } else {
                                int i34 = s02Var.i(i10) + 1;
                                int i35 = 0;
                                while (i35 < i34) {
                                    if (s02Var.i(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    s02Var.t(24);
                                    s02Var.t(24);
                                    s02Var.t(24);
                                    int i36 = s02Var.i(i10) + 1;
                                    int i37 = 8;
                                    s02Var.t(8);
                                    int[] iArr3 = new int[i36];
                                    for (int i38 = 0; i38 < i36; i38++) {
                                        iArr3[i38] = ((s02Var.h() ? s02Var.i(5) : 0) * 8) + s02Var.i(3);
                                    }
                                    int i39 = 0;
                                    while (i39 < i36) {
                                        int i40 = 0;
                                        while (i40 < i37) {
                                            if ((iArr3[i39] & (1 << i40)) != 0) {
                                                s02Var.t(i37);
                                            }
                                            i40++;
                                            i37 = 8;
                                        }
                                        i39++;
                                        i37 = 8;
                                    }
                                    i35++;
                                    i10 = 6;
                                }
                                int i41 = s02Var.i(i10) + 1;
                                for (int i42 = 0; i42 < i41; i42++) {
                                    int i43 = s02Var.i(16);
                                    if (i43 != 0) {
                                        z04.u("mapping type other than 0 not supported: " + i43);
                                    } else {
                                        int i44 = s02Var.h() ? s02Var.i(4) + 1 : 1;
                                        boolean zH = s02Var.h();
                                        int i45 = crfVar.a;
                                        if (zH) {
                                            int i46 = s02Var.i(8) + 1;
                                            for (int i47 = 0; i47 < i46; i47++) {
                                                int i48 = i45 - 1;
                                                s02Var.t(m6d.r(i48));
                                                s02Var.t(m6d.r(i48));
                                            }
                                        }
                                        if (s02Var.i(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i44 > 1) {
                                            for (int i49 = 0; i49 < i45; i49++) {
                                                s02Var.t(4);
                                            }
                                        }
                                        for (int i50 = 0; i50 < i44; i50++) {
                                            s02Var.t(8);
                                            s02Var.t(8);
                                            s02Var.t(8);
                                        }
                                    }
                                }
                                int i51 = s02Var.i(6);
                                int i52 = i51 + 1;
                                ae3[] ae3VarArr = new ae3[i52];
                                for (int i53 = 0; i53 < i52; i53++) {
                                    boolean zH2 = s02Var.h();
                                    s02Var.i(16);
                                    s02Var.i(16);
                                    s02Var.i(8);
                                    ae3VarArr[i53] = new ae3(10, zH2, false);
                                }
                                if (!s02Var.h()) {
                                    throw ParserException.a(null, "framing bit after modes not set as expected");
                                }
                                l0fVar = new l0f(crfVar, mfeVar, bArr, ae3VarArr, m6d.r(i51), 14);
                            }
                        }
                    } else {
                        if (s02Var.i(24) != 5653314) {
                            throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((s02Var.d * 8) + s02Var.e));
                        }
                        int i54 = s02Var.i(16);
                        int i55 = s02Var.i(24);
                        if (s02Var.h()) {
                            s02Var.t(5);
                            for (int i56 = 0; i56 < i55; i56 += s02Var.i(m6d.r(i55 - i56))) {
                            }
                        } else {
                            boolean zH3 = s02Var.h();
                            for (int i57 = 0; i57 < i55; i57++) {
                                if (!zH3) {
                                    s02Var.t(5);
                                } else if (s02Var.h()) {
                                    s02Var.t(5);
                                }
                            }
                        }
                        int i58 = s02Var.i(4);
                        if (i58 > 2) {
                            throw ParserException.a(null, "lookup type greater than 2 not decodable: " + i58);
                        }
                        if (i58 == 1 || i58 == 2) {
                            s02Var.t(32);
                            s02Var.t(32);
                            int i59 = s02Var.i(4) + 1;
                            s02Var.t(1);
                            s02Var.t((int) ((i58 == 1 ? i54 != 0 ? (long) Math.floor(Math.pow(i55, 1.0d / i54)) : 0L : i54 * i55) * i59));
                        }
                        i8++;
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
        f99 f99VarB = m6d.B(zw6.k((String[]) ((mfe) l0fVar.X).a));
        ny5 ny5Var = new ny5();
        ny5Var.m = ia9.l("audio/vorbis");
        ny5Var.g = crfVar2.d;
        ny5Var.h = crfVar2.c;
        ny5Var.A = crfVar2.a;
        ny5Var.B = crfVar2.b;
        ny5Var.p = arrayList;
        ny5Var.j = f99VarB;
        djbVar.b = new qy5(ny5Var);
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
