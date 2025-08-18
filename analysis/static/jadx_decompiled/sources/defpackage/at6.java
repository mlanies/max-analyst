package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class at6 extends j47 {
    public static final ig5 x0 = new ig5(22);
    public final xs6 w0;

    public at6(xs6 xs6Var) {
        super(17);
        this.w0 = xs6Var;
    }

    public static qa6 A0(int i, yaf yafVar) {
        int iV = yafVar.v();
        String strJ0 = J0(iV);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yafVar.g(0, bArr, i2);
        int iM0 = M0(0, bArr);
        String str = new String(bArr, 0, iM0, "ISO-8859-1");
        int i3 = iM0 + 1;
        int iL0 = L0(i3, bArr, iV);
        String strD0 = D0(bArr, i3, iL0, strJ0);
        int iI0 = I0(iV) + iL0;
        int iL02 = L0(iI0, bArr, iV);
        String strD02 = D0(bArr, iI0, iL02, strJ0);
        int iI02 = I0(iV) + iL02;
        return new qa6(str, i2 <= iI02 ? maf.f : Arrays.copyOfRange(bArr, iI02, i2), strD0, strD02);
    }

    public static zb9 B0(int i, yaf yafVar) {
        int iA = yafVar.A();
        int iX = yafVar.x();
        int iX2 = yafVar.x();
        int iV = yafVar.v();
        int iV2 = yafVar.v();
        s02 s02Var = new s02(1);
        s02Var.o(yafVar.c, yafVar.a);
        s02Var.q(yafVar.b * 8);
        int i2 = ((i - 10) * 8) / (iV + iV2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = s02Var.i(iV);
            int i5 = s02Var.i(iV2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new zb9(iA, iX, iX2, iArr, iArr2);
    }

    public static f9b C0(int i, yaf yafVar) {
        byte[] bArr = new byte[i];
        yafVar.g(0, bArr, i);
        int iM0 = M0(0, bArr);
        String str = new String(bArr, 0, iM0, "ISO-8859-1");
        int i2 = iM0 + 1;
        return new f9b(i <= i2 ? maf.f : Arrays.copyOfRange(bArr, i2, i), str);
    }

    public static String D0(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    public static ipe E0(int i, yaf yafVar, String str) {
        if (i < 1) {
            return null;
        }
        int iV = yafVar.v();
        String strJ0 = J0(iV);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yafVar.g(0, bArr, i2);
        return new ipe(str, null, new String(bArr, 0, L0(0, bArr, iV), strJ0));
    }

    public static ipe F0(int i, yaf yafVar) {
        if (i < 1) {
            return null;
        }
        int iV = yafVar.v();
        String strJ0 = J0(iV);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yafVar.g(0, bArr, i2);
        int iL0 = L0(0, bArr, iV);
        String str = new String(bArr, 0, iL0, strJ0);
        int iI0 = I0(iV) + iL0;
        return new ipe("TXXX", str, D0(bArr, iI0, L0(iI0, bArr, iV), strJ0));
    }

    public static h9f G0(int i, yaf yafVar, String str) {
        byte[] bArr = new byte[i];
        yafVar.g(0, bArr, i);
        return new h9f(str, null, new String(bArr, 0, M0(0, bArr), "ISO-8859-1"));
    }

    public static h9f H0(int i, yaf yafVar) {
        if (i < 1) {
            return null;
        }
        int iV = yafVar.v();
        String strJ0 = J0(iV);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yafVar.g(0, bArr, i2);
        int iL0 = L0(0, bArr, iV);
        String str = new String(bArr, 0, iL0, strJ0);
        int iI0 = I0(iV) + iL0;
        return new h9f("WXXX", str, D0(bArr, iI0, M0(iI0, bArr), "ISO-8859-1"));
    }

    public static int I0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static String J0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : HTTP.UTF_16;
    }

    public static String K0(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int L0(int i, byte[] bArr, int i2) {
        int iM0 = M0(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iM0;
        }
        while (iM0 < bArr.length - 1) {
            if ((iM0 - i) % 2 == 0 && bArr[iM0 + 1] == 0) {
                return iM0;
            }
            iM0 = M0(iM0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int M0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int N0(int i, yaf yafVar) {
        byte[] bArr = yafVar.a;
        int i2 = yafVar.b;
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
    public static boolean O0(defpackage.yaf r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r18.c()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.h()     // Catch: java.lang.Throwable -> L20
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
            r1.H(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.H(r2)
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
            r1.H(r2)
            return r6
        L99:
            int r3 = r18.c()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.H(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.I(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.H(r2)
            return r4
        Lb0:
            r1.H(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at6.O0(yaf, int, int, boolean):boolean");
    }

    public static tl v0(yaf yafVar, int i, int i2) {
        int iM0;
        String strT;
        int iV = yafVar.v();
        String strJ0 = J0(iV);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        yafVar.g(0, bArr, i3);
        if (i2 == 2) {
            String strValueOf = String.valueOf(lz7.T(new String(bArr, 0, 3, "ISO-8859-1")));
            strT = strValueOf.length() != 0 ? "image/".concat(strValueOf) : new String("image/");
            if ("image/jpg".equals(strT)) {
                strT = "image/jpeg";
            }
            iM0 = 2;
        } else {
            iM0 = M0(0, bArr);
            strT = lz7.T(new String(bArr, 0, iM0, "ISO-8859-1"));
            if (strT.indexOf(47) == -1) {
                strT = strT.length() != 0 ? "image/".concat(strT) : new String("image/");
            }
        }
        int i4 = bArr[iM0 + 1] & 255;
        int i5 = iM0 + 2;
        int iL0 = L0(i5, bArr, iV);
        String str = new String(bArr, i5, iL0 - i5, strJ0);
        int iI0 = I0(iV) + iL0;
        return new tl(strT, str, i4, i3 <= iI0 ? maf.f : Arrays.copyOfRange(bArr, iI0, i3));
    }

    public static l42 w0(yaf yafVar, int i, int i2, boolean z, int i3, xs6 xs6Var) {
        int i4 = yafVar.b;
        int iM0 = M0(i4, yafVar.a);
        String str = new String(yafVar.a, i4, iM0 - i4, "ISO-8859-1");
        yafVar.H(iM0 + 1);
        int iH = yafVar.h();
        int iH2 = yafVar.h();
        long jW = yafVar.w();
        long j = jW == 4294967295L ? -1L : jW;
        long jW2 = yafVar.w();
        long j2 = jW2 == 4294967295L ? -1L : jW2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (yafVar.b < i5) {
            ct6 ct6VarZ0 = z0(i2, yafVar, z, i3, xs6Var);
            if (ct6VarZ0 != null) {
                arrayList.add(ct6VarZ0);
            }
        }
        return new l42(str, iH, iH2, j, j2, (ct6[]) arrayList.toArray(new ct6[0]));
    }

    public static n42 x0(yaf yafVar, int i, int i2, boolean z, int i3, xs6 xs6Var) {
        int i4 = yafVar.b;
        int iM0 = M0(i4, yafVar.a);
        String str = new String(yafVar.a, i4, iM0 - i4, "ISO-8859-1");
        yafVar.H(iM0 + 1);
        int iV = yafVar.v();
        boolean z2 = (iV & 2) != 0;
        boolean z3 = (iV & 1) != 0;
        int iV2 = yafVar.v();
        String[] strArr = new String[iV2];
        for (int i5 = 0; i5 < iV2; i5++) {
            int i6 = yafVar.b;
            int iM02 = M0(i6, yafVar.a);
            strArr[i5] = new String(yafVar.a, i6, iM02 - i6, "ISO-8859-1");
            yafVar.H(iM02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (yafVar.b < i7) {
            ct6 ct6VarZ0 = z0(i2, yafVar, z, i3, xs6Var);
            if (ct6VarZ0 != null) {
                arrayList.add(ct6VarZ0);
            }
        }
        return new n42(str, z2, z3, strArr, (ct6[]) arrayList.toArray(new ct6[0]));
    }

    public static g73 y0(int i, yaf yafVar) {
        if (i < 4) {
            return null;
        }
        int iV = yafVar.v();
        String strJ0 = J0(iV);
        byte[] bArr = new byte[3];
        yafVar.g(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        yafVar.g(0, bArr2, i2);
        int iL0 = L0(0, bArr2, iV);
        String str2 = new String(bArr2, 0, iL0, strJ0);
        int iI0 = I0(iV) + iL0;
        return new g73(str, str2, D0(bArr2, iI0, L0(iI0, bArr2, iV), strJ0));
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c7 A[Catch: all -> 0x0101, UnsupportedEncodingException -> 0x01f0, TryCatch #2 {UnsupportedEncodingException -> 0x01f0, all -> 0x0101, blocks: (B:91:0x00fb, B:159:0x01d9, B:95:0x0106, B:102:0x011c, B:104:0x0124, B:112:0x013e, B:121:0x0156, B:132:0x0171, B:139:0x0183, B:145:0x0192, B:150:0x01a9, B:156:0x01c2, B:157:0x01c7), top: B:168:0x00f1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ct6 z0(int r17, defpackage.yaf r18, boolean r19, int r20, defpackage.xs6 r21) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at6.z0(int, yaf, boolean, int, xs6):ct6");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.e99 u0(int r12, byte[] r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            yaf r1 = new yaf
            r1.<init>(r12, r13)
            int r12 = r1.c()
            r13 = 2
            r2 = 10
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 4
            if (r12 >= r2) goto L1a
        L17:
            r9 = r5
            goto L88
        L1a:
            int r12 = r1.x()
            r7 = 4801587(0x494433, float:6.728456E-39)
            if (r12 == r7) goto L3d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r7 = "%06X"
            java.lang.String r12 = java.lang.String.format(r7, r12)
            int r7 = r12.length()
            if (r7 == 0) goto L17
            java.lang.String r7 = "Unexpected first three bytes of ID3 tag header: 0x"
            r7.concat(r12)
            goto L17
        L3d:
            int r12 = r1.v()
            r1.I(r4)
            int r7 = r1.v()
            int r8 = r1.u()
            if (r12 != r13) goto L53
            r9 = r7 & 64
            if (r9 == 0) goto L7a
            goto L17
        L53:
            r9 = 3
            if (r12 != r9) goto L64
            r9 = r7 & 64
            if (r9 == 0) goto L7a
            int r9 = r1.h()
            r1.I(r9)
            int r9 = r9 + r6
            int r8 = r8 - r9
            goto L7a
        L64:
            if (r12 != r6) goto L17
            r9 = r7 & 64
            if (r9 == 0) goto L74
            int r9 = r1.u()
            int r10 = r9 + (-4)
            r1.I(r10)
            int r8 = r8 - r9
        L74:
            r9 = r7 & 16
            if (r9 == 0) goto L7a
            int r8 = r8 + (-10)
        L7a:
            if (r12 >= r6) goto L82
            r7 = r7 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L82
            r7 = r4
            goto L83
        L82:
            r7 = r3
        L83:
            zs6 r9 = new zs6
            r9.<init>(r12, r8, r7)
        L88:
            if (r9 != 0) goto L8b
            return r5
        L8b:
            int r12 = r1.b
            int r7 = r9.a
            if (r7 != r13) goto L92
            r2 = 6
        L92:
            int r13 = r9.c
            boolean r8 = r9.b
            if (r8 == 0) goto L9c
            int r13 = N0(r13, r1)
        L9c:
            int r12 = r12 + r13
            r1.G(r12)
            boolean r12 = O0(r1, r7, r2, r3)
            if (r12 != 0) goto Lb1
            if (r7 != r6) goto Lb0
            boolean r12 = O0(r1, r6, r2, r4)
            if (r12 == 0) goto Lb0
            r3 = r4
            goto Lb1
        Lb0:
            return r5
        Lb1:
            int r12 = r1.c()
            if (r12 < r2) goto Lc3
            xs6 r12 = r11.w0
            ct6 r12 = z0(r7, r1, r3, r2, r12)
            if (r12 == 0) goto Lb1
            r0.add(r12)
            goto Lb1
        Lc3:
            e99 r11 = new e99
            r11.<init>(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at6.u0(int, byte[]):e99");
    }

    @Override // defpackage.j47
    public final e99 w(j99 j99Var, ByteBuffer byteBuffer) {
        return u0(byteBuffer.limit(), byteBuffer.array());
    }
}
