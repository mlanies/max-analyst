package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ki9 {
    public long[] a = usc.a;
    public Object[] b = j47.o;
    public int[] c = k37.b;
    public int d;
    public int e;
    public int f;

    public ki9(int i) {
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

    public final int b(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (tpa.f(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
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
        this.b = new Object[iMax];
        this.c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        r2 = r0.a(r5);
        r9 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if (r0.f != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        if (((r0.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        r25 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        r2 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
    
        if (r2 <= 8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (java.lang.Long.compareUnsigned(r0.e * 32, r2 * 25) > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
    
        r2 = r0.a;
        r3 = r0.d;
        r4 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        if (r4 >= r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        r13 = r4 >> 3;
        r18 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        if (((r2[r13] >> r18) & 255) != 254) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
    
        r14 = r0.a;
        r14[r13] = (r14[r13] & (~(255 << r18))) | (128 << r18);
        r7 = r0.d;
        r8 = ((r4 - 7) & r7) + (r7 & 7);
        r7 = r8 >> 3;
        r8 = (r8 & 7) << 3;
        r13 = r2;
        r15 = r3;
        r14[r7] = (r14[r7] & (~(255 << r8))) | (128 << r8);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fb, code lost:
    
        r13 = r2;
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fd, code lost:
    
        r4 = r4 + 1;
        r2 = r13;
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0102, code lost:
    
        r0.f += r6;
        r25 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010b, code lost:
    
        r2 = defpackage.usc.c(r0.d);
        r3 = r0.a;
        r6 = r0.b;
        r7 = r0.c;
        r8 = r0.d;
        r0.c(r2);
        r2 = r0.b;
        r13 = r0.c;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0121, code lost:
    
        if (r14 >= r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0133, code lost:
    
        if (((r3[r14 >> 3] >> ((r14 & 7) << 3)) & r9) >= 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0135, code lost:
    
        r15 = r6[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r15 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0139, code lost:
    
        r16 = r15.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013e, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0140, code lost:
    
        r16 = r16 * r4;
        r16 = r16 ^ (r16 << 16);
        r4 = r0.a(r16 >>> 7);
        r9 = r16 & 127;
        r16 = r3;
        r3 = r0.a;
        r18 = r4 >> 3;
        r22 = (r4 & 7) << 3;
        r25 = r11;
        r3[r18] = (r3[r18] & (~(255 << r22))) | (r9 << r22);
        r11 = r0.d;
        r12 = ((r4 - 7) & r11) + (r11 & 7);
        r11 = r12 >> 3;
        r12 = (r12 & 7) << 3;
        r3[r11] = (r3[r11] & (~(255 << r12))) | (r9 << r12);
        r2[r4] = r15;
        r13[r4] = r7[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x018c, code lost:
    
        r16 = r3;
        r25 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0190, code lost:
    
        r14 = r14 + 1;
        r0 = r27;
        r3 = r16;
        r11 = r25;
        r4 = -862048943;
        r9 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a0, code lost:
    
        r25 = r11;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a4, code lost:
    
        r2 = r0.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a8, code lost:
    
        r3 = 1;
        r0.e++;
        r1 = r0.f;
        r4 = r0.a;
        r5 = r2 >> 3;
        r6 = r4[r5];
        r8 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c3, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c6, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c7, code lost:
    
        r0.f = r1 - r3;
        r4[r5] = (r6 & (~(255 << r8))) | (r25 << r8);
        r1 = r0.d;
        r3 = ((r2 - 7) & r1) + (r1 & 7);
        r1 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r4[r1] = (r4[r1] & (~(255 << r3))) | (r25 << r3);
        r1 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki9.d(int, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
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
            boolean r3 = r1 instanceof defpackage.ki9
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            ki9 r1 = (defpackage.ki9) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.b
            int[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L80
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
            if (r10 == 0) goto L7b
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3d:
            if (r12 >= r10) goto L79
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L75
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            int r15 = r1.b(r14)
            if (r15 < 0) goto L5c
            int[] r14 = r1.c
            r14 = r14[r15]
            if (r13 == r14) goto L75
            return r4
        L5c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "There is no key "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r2 = " in the map"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L75:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3d
        L79:
            if (r10 != r11) goto L80
        L7b:
            if (r7 == r6) goto L80
            int r7 = r7 + 1
            goto L23
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        int[] iArr = this.c;
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
                            Object obj = objArr[i5];
                            iHashCode += Integer.hashCode(iArr[i5]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
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
            java.lang.Object[] r2 = r0.b
            int[] r3 = r0.c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
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
            if (r11 == 0) goto L6a
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L64
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            if (r15 != r0) goto L4e
            java.lang.String r15 = "(this)"
        L4e:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.e
            if (r8 >= r14) goto L64
            java.lang.String r14 = ", "
            r1.append(r14)
        L64:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L68:
            if (r11 != r12) goto L6f
        L6a:
            if (r7 == r5) goto L6f
            int r7 = r7 + 1
            goto L1e
        L6f:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki9.toString():java.lang.String");
    }
}
