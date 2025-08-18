package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ei9 {
    public long[] a = usc.a;
    public long[] b;
    public long[] c;
    public int d;
    public int e;
    public int f;

    public ei9(int i) {
        long[] jArr = vv7.b;
        this.b = jArr;
        this.c = jArr;
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        c(usc.e(i));
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

    public final int b(long j) {
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (i2 * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final void c(int i) {
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
        this.b = new long[iMax];
        this.c = new long[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        r1 = a(r3);
        r5 = 128;
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        if (r32.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008f, code lost:
    
        if (((r32.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        r30 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        r1 = r32.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0097, code lost:
    
        if (r1 <= 8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        if (java.lang.Long.compareUnsigned(r32.e * 32, r1 * 25) > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        r1 = r32.a;
        r2 = r32.d;
        r3 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b3, code lost:
    
        if (r3 >= r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b5, code lost:
    
        r7 = r3 >> 3;
        r12 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        if (((r1[r7] >> r12) & 255) != 254) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        r14 = r32.a;
        r14[r7] = (r14[r7] & (~(255 << r12))) | (r5 << r12);
        r7 = r32.d;
        r12 = ((r3 - 7) & r7) + (r7 & 7);
        r7 = r12 >> 3;
        r12 = (r12 & 7) << 3;
        r14[r7] = ((~(255 << r12)) & r14[r7]) | (128 << r12);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f2, code lost:
    
        r3 = r3 + 1;
        r5 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f8, code lost:
    
        r32.f += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fd, code lost:
    
        r30 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0103, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0105, code lost:
    
        r1 = defpackage.usc.c(r32.d);
        r2 = r32.a;
        r3 = r32.b;
        r4 = r32.c;
        r5 = r32.d;
        c(r1);
        r1 = r32.b;
        r6 = r32.c;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011b, code lost:
    
        if (r7 >= r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012c, code lost:
    
        if (((r2[r7 >> 3] >> ((r7 & 7) << 3)) & r8) >= 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012e, code lost:
    
        r13 = r3[r7];
        r16 = java.lang.Long.hashCode(r13) * (-862048943);
        r16 = r16 ^ (r16 << 16);
        r12 = a(r16 >>> 7);
        r8 = r16 & 127;
        r15 = r32.a;
        r16 = r12 >> 3;
        r25 = (r12 & 7) << 3;
        r28 = r2;
        r29 = r3;
        r15[r16] = (r15[r16] & (~(255 << r25))) | (r8 << r25);
        r2 = r32.d;
        r3 = ((r12 - 7) & r2) + (r2 & 7);
        r2 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r30 = r10;
        r15[r2] = (r8 << r3) | (r15[r2] & (~(255 << r3)));
        r1[r12] = r13;
        r6[r12] = r4[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0185, code lost:
    
        r28 = r2;
        r29 = r3;
        r30 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x018b, code lost:
    
        r7 = r7 + 1;
        r2 = r28;
        r3 = r29;
        r10 = r30;
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0196, code lost:
    
        r1 = a(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x019a, code lost:
    
        r3 = 1;
        r32.e++;
        r2 = r32.f;
        r4 = r32.a;
        r5 = r1 >> 3;
        r6 = r4[r5];
        r8 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b5, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b8, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b9, code lost:
    
        r32.f = r2 - r3;
        r4[r5] = ((~(255 << r8)) & r6) | (r30 << r8);
        r2 = r32.d;
        r3 = ((r1 - 7) & r2) + (r2 & 7);
        r2 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r4[r2] = (r4[r2] & (~(255 << r3))) | (r30 << r3);
        r1 = ~r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(long r33, long r35) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei9.d(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof defpackage.ei9
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            ei9 r1 = (defpackage.ei9) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.b
            long[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L75
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
            if (r10 == 0) goto L70
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3d:
            if (r12 >= r10) goto L6e
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6a
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r16 = r5[r13]
            int r13 = r1.b(r14)
            if (r13 < 0) goto L5e
            long[] r14 = r1.c
            r13 = r14[r13]
            int r13 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r13 == 0) goto L6a
            return r4
        L5e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Cannot find value for key "
            java.lang.String r1 = defpackage.ey8.h(r14, r1)
            r0.<init>(r1)
            throw r0
        L6a:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3d
        L6e:
            if (r10 != r11) goto L75
        L70:
            if (r7 == r6) goto L75
            int r7 = r7 + 1
            goto L23
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        long[] jArr3 = this.a;
        int length = jArr3.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int iHashCode = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            iHashCode += Long.hashCode(jArr[i5]) ^ Long.hashCode(jArr2[i5]);
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

    public final String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        long[] jArr3 = this.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j = jArr3[i5];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i5 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((255 & j) < 128) {
                            int i10 = (i5 << 3) + i9;
                            i2 = i5;
                            long j2 = jArr[i10];
                            i3 = i9;
                            long j3 = jArr2[i10];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(j3);
                            i6++;
                            if (i6 < this.e) {
                                sb.append(", ");
                            }
                            i4 = 8;
                        } else {
                            i2 = i5;
                            i3 = i9;
                            i4 = i7;
                        }
                        j >>= i4;
                        i9 = i3 + 1;
                        i7 = i4;
                        i5 = i2;
                    }
                    int i11 = i5;
                    if (i8 != i7) {
                        break;
                    }
                    i = i11;
                } else {
                    i = i5;
                }
                if (i == length) {
                    break;
                }
                i5 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
