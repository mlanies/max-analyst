package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class bt6 extends nd7 {
    public static final ig5 l = new ig5(23);
    public final ys6 k;

    public bt6(ys6 ys6Var) {
        this.k = ys6Var;
    }

    public static ul Y(wpa wpaVar, int i, int i2) {
        int iQ0;
        String strConcat;
        int iU = wpaVar.u();
        Charset charsetN0 = n0(iU);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        wpaVar.e(0, bArr, i3);
        if (i2 == 2) {
            strConcat = "image/" + lz7.T(new String(bArr, 0, 3, b52.b));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iQ0 = 2;
        } else {
            iQ0 = q0(0, bArr);
            String strT = lz7.T(new String(bArr, 0, iQ0, b52.b));
            strConcat = strT.indexOf(47) == -1 ? "image/".concat(strT) : strT;
        }
        int i4 = bArr[iQ0 + 1] & 255;
        int i5 = iQ0 + 2;
        int iP0 = p0(i5, bArr, iU);
        String str = new String(bArr, i5, iP0 - i5, charsetN0);
        int iM0 = m0(iU) + iP0;
        return new ul(strConcat, str, i4, i3 <= iM0 ? oaf.f : Arrays.copyOfRange(bArr, iM0, i3));
    }

    public static m42 Z(wpa wpaVar, int i, int i2, boolean z, int i3, ys6 ys6Var) {
        int i4 = wpaVar.b;
        int iQ0 = q0(i4, wpaVar.a);
        String str = new String(wpaVar.a, i4, iQ0 - i4, b52.b);
        wpaVar.G(iQ0 + 1);
        int iG = wpaVar.g();
        int iG2 = wpaVar.g();
        long jW = wpaVar.w();
        long j = jW == 4294967295L ? -1L : jW;
        long jW2 = wpaVar.w();
        long j2 = jW2 == 4294967295L ? -1L : jW2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (wpaVar.b < i5) {
            dt6 dt6VarC0 = c0(i2, wpaVar, z, i3, ys6Var);
            if (dt6VarC0 != null) {
                arrayList.add(dt6VarC0);
            }
        }
        return new m42(str, iG, iG2, j, j2, (dt6[]) arrayList.toArray(new dt6[0]));
    }

    public static o42 a0(wpa wpaVar, int i, int i2, boolean z, int i3, ys6 ys6Var) {
        int i4 = wpaVar.b;
        int iQ0 = q0(i4, wpaVar.a);
        String str = new String(wpaVar.a, i4, iQ0 - i4, b52.b);
        wpaVar.G(iQ0 + 1);
        int iU = wpaVar.u();
        boolean z2 = (iU & 2) != 0;
        boolean z3 = (iU & 1) != 0;
        int iU2 = wpaVar.u();
        String[] strArr = new String[iU2];
        for (int i5 = 0; i5 < iU2; i5++) {
            int i6 = wpaVar.b;
            int iQ02 = q0(i6, wpaVar.a);
            strArr[i5] = new String(wpaVar.a, i6, iQ02 - i6, b52.b);
            wpaVar.G(iQ02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (wpaVar.b < i7) {
            dt6 dt6VarC0 = c0(i2, wpaVar, z, i3, ys6Var);
            if (dt6VarC0 != null) {
                arrayList.add(dt6VarC0);
            }
        }
        return new o42(str, z2, z3, strArr, (dt6[]) arrayList.toArray(new dt6[0]));
    }

    public static h73 b0(int i, wpa wpaVar) {
        if (i < 4) {
            return null;
        }
        int iU = wpaVar.u();
        Charset charsetN0 = n0(iU);
        byte[] bArr = new byte[3];
        wpaVar.e(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        wpaVar.e(0, bArr2, i2);
        int iP0 = p0(0, bArr2, iU);
        String str2 = new String(bArr2, 0, iP0, charsetN0);
        int iM0 = m0(iU) + iP0;
        return new h73(str, str2, g0(bArr2, iM0, p0(iM0, bArr2, iU), charsetN0));
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d8 A[Catch: all -> 0x010d, Exception | OutOfMemoryError -> 0x0110, TRY_LEAVE, TryCatch #2 {Exception | OutOfMemoryError -> 0x0110, all -> 0x010d, blocks: (B:91:0x0107, B:97:0x0115, B:104:0x012b, B:106:0x0133, B:114:0x014d, B:123:0x0165, B:134:0x0180, B:141:0x0192, B:147:0x01a1, B:152:0x01b9, B:158:0x01d3, B:159:0x01d8), top: B:170:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dt6 c0(int r18, defpackage.wpa r19, boolean r20, int r21, defpackage.ys6 r22) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt6.c0(int, wpa, boolean, int, ys6):dt6");
    }

    public static ra6 d0(int i, wpa wpaVar) {
        int iU = wpaVar.u();
        Charset charsetN0 = n0(iU);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        wpaVar.e(0, bArr, i2);
        int iQ0 = q0(0, bArr);
        String strL = ia9.l(new String(bArr, 0, iQ0, b52.b));
        int i3 = iQ0 + 1;
        int iP0 = p0(i3, bArr, iU);
        String strG0 = g0(bArr, i3, iP0, charsetN0);
        int iM0 = m0(iU) + iP0;
        int iP02 = p0(iM0, bArr, iU);
        String strG02 = g0(bArr, iM0, iP02, charsetN0);
        int iM02 = m0(iU) + iP02;
        return new ra6(strL, i2 <= iM02 ? oaf.f : Arrays.copyOfRange(bArr, iM02, i2), strG0, strG02);
    }

    public static ac9 e0(int i, wpa wpaVar) {
        int iA = wpaVar.A();
        int iX = wpaVar.x();
        int iX2 = wpaVar.x();
        int iU = wpaVar.u();
        int iU2 = wpaVar.u();
        s02 s02Var = new s02(2);
        s02Var.p(wpaVar);
        int i2 = ((i - 10) * 8) / (iU + iU2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = s02Var.i(iU);
            int i5 = s02Var.i(iU2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new ac9(iA, iX, iX2, iArr, iArr2);
    }

    public static g9b f0(int i, wpa wpaVar) {
        byte[] bArr = new byte[i];
        wpaVar.e(0, bArr, i);
        int iQ0 = q0(0, bArr);
        String str = new String(bArr, 0, iQ0, b52.b);
        int i2 = iQ0 + 1;
        return new g9b(i <= i2 ? oaf.f : Arrays.copyOfRange(bArr, i2, i), str);
    }

    public static String g0(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static jpe h0(int i, wpa wpaVar, String str) {
        if (i < 1) {
            return null;
        }
        int iU = wpaVar.u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        wpaVar.e(0, bArr, i2);
        return new jpe(str, null, i0(iU, bArr, 0));
    }

    public static ffc i0(int i, byte[] bArr, int i2) {
        if (i2 >= bArr.length) {
            return zw6.n("");
        }
        ww6 ww6VarI = zw6.i();
        int iP0 = p0(i2, bArr, i);
        while (i2 < iP0) {
            ww6VarI.a(new String(bArr, i2, iP0 - i2, n0(i)));
            i2 = m0(i) + iP0;
            iP0 = p0(i2, bArr, i);
        }
        ffc ffcVarJ = ww6VarI.j();
        return ffcVarJ.isEmpty() ? zw6.n("") : ffcVarJ;
    }

    public static jpe j0(int i, wpa wpaVar) {
        if (i < 1) {
            return null;
        }
        int iU = wpaVar.u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        wpaVar.e(0, bArr, i2);
        int iP0 = p0(0, bArr, iU);
        return new jpe("TXXX", new String(bArr, 0, iP0, n0(iU)), i0(iU, bArr, m0(iU) + iP0));
    }

    public static i9f k0(int i, wpa wpaVar, String str) {
        byte[] bArr = new byte[i];
        wpaVar.e(0, bArr, i);
        return new i9f(str, null, new String(bArr, 0, q0(0, bArr), b52.b));
    }

    public static i9f l0(int i, wpa wpaVar) {
        if (i < 1) {
            return null;
        }
        int iU = wpaVar.u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        wpaVar.e(0, bArr, i2);
        int iP0 = p0(0, bArr, iU);
        String str = new String(bArr, 0, iP0, n0(iU));
        int iM0 = m0(iU) + iP0;
        return new i9f("WXXX", str, g0(bArr, iM0, q0(iM0, bArr), b52.b));
    }

    public static int m0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset n0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? b52.b : b52.c : b52.d : b52.f;
    }

    public static String o0(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int p0(int i, byte[] bArr, int i2) {
        int iQ0 = q0(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iQ0;
        }
        while (iQ0 < bArr.length - 1) {
            if ((iQ0 - i) % 2 == 0 && bArr[iQ0 + 1] == 0) {
                return iQ0;
            }
            iQ0 = q0(iQ0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int q0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int r0(int i, wpa wpaVar) {
        byte[] bArr = wpaVar.a;
        int i2 = wpaVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s0(defpackage.wpa r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.g()     // Catch: java.lang.Throwable -> L20
            long r8 = r18.w()     // Catch: java.lang.Throwable -> L20
            int r10 = r18.A()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r18.x()     // Catch: java.lang.Throwable -> L20
            int r8 = r18.x()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.G(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.G(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.G(r2)
            return r6
        L99:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.G(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.H(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.G(r2)
            return r4
        Lb0:
            r1.G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt6.s0(wpa, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.f99 X(int r12, byte[] r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            wpa r1 = new wpa
            r1.<init>(r12, r13)
            int r12 = r1.a()
            r13 = 4
            r2 = 2
            r3 = 10
            r4 = 0
            r5 = 1
            r6 = 0
            if (r12 >= r3) goto L1f
            java.lang.String r12 = "Data too short to be an ID3 tag"
            defpackage.z04.c0(r12)
        L1c:
            r9 = r6
            goto L97
        L1f:
            int r12 = r1.x()
            r7 = 4801587(0x494433, float:6.728456E-39)
            if (r12 == r7) goto L40
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r7 = "%06X"
            java.lang.String r12 = java.lang.String.format(r7, r12)
            java.lang.String r7 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.String r12 = r7.concat(r12)
            defpackage.z04.c0(r12)
            goto L1c
        L40:
            int r12 = r1.u()
            r1.H(r5)
            int r7 = r1.u()
            int r8 = r1.t()
            if (r12 != r2) goto L5b
            r9 = r7 & 64
            if (r9 == 0) goto L82
            java.lang.String r12 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            defpackage.z04.c0(r12)
            goto L1c
        L5b:
            r9 = 3
            if (r12 != r9) goto L6c
            r9 = r7 & 64
            if (r9 == 0) goto L82
            int r9 = r1.g()
            r1.H(r9)
            int r9 = r9 + r13
            int r8 = r8 - r9
            goto L82
        L6c:
            if (r12 != r13) goto L91
            r9 = r7 & 64
            if (r9 == 0) goto L7c
            int r9 = r1.t()
            int r10 = r9 + (-4)
            r1.H(r10)
            int r8 = r8 - r9
        L7c:
            r9 = r7 & 16
            if (r9 == 0) goto L82
            int r8 = r8 + (-10)
        L82:
            if (r12 >= r13) goto L8a
            r7 = r7 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L8a
            r7 = r5
            goto L8b
        L8a:
            r7 = r4
        L8b:
            zs6 r9 = new zs6
            r9.<init>(r12, r8, r7)
            goto L97
        L91:
            java.lang.String r7 = "Skipped ID3 tag with unsupported majorVersion="
            defpackage.ey8.k(r12, r7)
            goto L1c
        L97:
            if (r9 != 0) goto L9a
            return r6
        L9a:
            int r12 = r1.b
            int r7 = r9.a
            if (r7 != r2) goto La1
            r3 = 6
        La1:
            boolean r2 = r9.b
            int r8 = r9.c
            if (r2 == 0) goto Lab
            int r8 = r0(r8, r1)
        Lab:
            int r12 = r12 + r8
            r1.F(r12)
            boolean r12 = s0(r1, r7, r3, r4)
            if (r12 != 0) goto Lc5
            if (r7 != r13) goto Lbf
            boolean r12 = s0(r1, r13, r3, r5)
            if (r12 == 0) goto Lbf
            r4 = r5
            goto Lc5
        Lbf:
            java.lang.String r11 = "Failed to validate ID3 tag with majorVersion="
            defpackage.ey8.k(r7, r11)
            return r6
        Lc5:
            int r12 = r1.a()
            if (r12 < r3) goto Ld7
            ys6 r12 = r11.k
            dt6 r12 = c0(r7, r1, r4, r3, r12)
            if (r12 == 0) goto Lc5
            r0.add(r12)
            goto Lc5
        Ld7:
            f99 r11 = new f99
            r11.<init>(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt6.X(int, byte[]):f99");
    }

    @Override // defpackage.nd7
    public final f99 n(k99 k99Var, ByteBuffer byteBuffer) {
        return X(byteBuffer.limit(), byteBuffer.array());
    }
}
