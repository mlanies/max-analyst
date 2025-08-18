package defpackage;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class yh9 {
    public long[] a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public yh9(int i) {
        this.a = usc.a;
        int[] iArr = k37.b;
        this.b = iArr;
        this.c = iArr;
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        d(usc.e(i));
    }

    public final int a(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int b(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int c(int i) {
        int iB = b(i);
        if (iB >= 0) {
            return this.c[iB];
        }
        throw new NoSuchElementException(zr6.h(i, "Cannot find value for key "));
    }

    public final void d(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, usc.d(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = usc.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = usc.a(this.d) - this.e;
        this.b = new int[iMax];
        this.c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        r2 = a(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if (r30.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        if (((r30.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008f, code lost:
    
        r28 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
    
        r2 = r30.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        if (r2 <= 8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (java.lang.Long.compareUnsigned(r30.e * 32, r2 * 25) > 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        r2 = r30.a;
        r3 = r30.d;
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b1, code lost:
    
        if (r4 >= r3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
    
        r8 = r4 >> 3;
        r17 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        if (((r2[r8] >> r17) & 255) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c2, code lost:
    
        r13 = r30.a;
        r13[r8] = (r13[r8] & (~(255 << r17))) | (128 << r17);
        r6 = r30.d;
        r7 = ((r4 - 7) & r6) + (r6 & 7);
        r6 = r7 >> 3;
        r7 = (r7 & 7) << 3;
        r8 = r2;
        r14 = r3;
        r13[r6] = (r13[r6] & (~(255 << r7))) | (128 << r7);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        r8 = r2;
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f7, code lost:
    
        r4 = r4 + 1;
        r2 = r8;
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fc, code lost:
    
        r30.f += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0101, code lost:
    
        r28 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0107, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0109, code lost:
    
        r2 = defpackage.usc.c(r30.d);
        r3 = r30.a;
        r4 = r30.b;
        r5 = r30.c;
        r6 = r30.d;
        d(r2);
        r2 = r30.b;
        r7 = r30.c;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011f, code lost:
    
        if (r8 >= r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012f, code lost:
    
        if (((r3[r8 >> 3] >> ((r8 & 7) << 3)) & r11) >= 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0131, code lost:
    
        r13 = r4[r8];
        r14 = java.lang.Integer.hashCode(r13) * (-862048943);
        r14 = r14 ^ (r14 << 16);
        r15 = a(r14 >>> 7);
        r11 = r14 & 127;
        r14 = r30.a;
        r16 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r26 = r3;
        r27 = r4;
        r14[r16] = (r14[r16] & (~(255 << r23))) | (r11 << r23);
        r3 = r30.d;
        r4 = ((r15 - 7) & r3) + (r3 & 7);
        r3 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r28 = r9;
        r14[r3] = (r14[r3] & (~(255 << r4))) | (r11 << r4);
        r2[r15] = r13;
        r7[r15] = r5[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0187, code lost:
    
        r26 = r3;
        r27 = r4;
        r28 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x018d, code lost:
    
        r8 = r8 + 1;
        r3 = r26;
        r4 = r27;
        r9 = r28;
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0198, code lost:
    
        r2 = a(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x019c, code lost:
    
        r30.e++;
        r3 = r30.f;
        r5 = r30.a;
        r6 = r2 >> 3;
        r7 = r5[r6];
        r9 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b7, code lost:
    
        if (((r7 >> r9) & 255) != 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b9, code lost:
    
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01bc, code lost:
    
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01be, code lost:
    
        r30.f = r3 - r19;
        r5[r6] = ((~(255 << r9)) & r7) | (r28 << r9);
        r3 = r30.d;
        r4 = ((r2 - 7) & r3) + (r3 & 7);
        r3 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r5[r3] = (r5[r3] & (~(255 << r4))) | (r28 << r4);
        r2 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh9.e(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof defpackage.yh9
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            yh9 r1 = (defpackage.yh9) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.b
            int[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L61
            r7 = r4
        L23:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3d:
            if (r12 >= r10) goto L5a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L56
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            int r14 = r1.c(r14)
            if (r13 == r14) goto L56
            return r4
        L56:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3d
        L5a:
            if (r10 != r11) goto L61
        L5c:
            if (r7 == r6) goto L61
            int r7 = r7 + 1
            goto L23
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int iHashCode = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            int i6 = iArr[i5];
                            iHashCode += Integer.hashCode(iArr2[i5]) ^ Integer.hashCode(i6);
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return iHashCode;
                    }
                }
                if (i2 == length) {
                    i = iHashCode;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.e
            if (r1 != 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.b
            int[] r3 = r0.c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
            r6 = 0
            r7 = r6
            r8 = r7
        L1e:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.e
            if (r8 >= r14) goto L60
            java.lang.String r14 = ", "
            r1.append(r14)
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1e
        L6b:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh9.toString():java.lang.String");
    }

    public /* synthetic */ yh9() {
        this(6);
    }
}
