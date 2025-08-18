package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ai9 {
    public long[] a = usc.a;
    public int[] b = k37.b;
    public Object[] c = j47.o;
    public int d;
    public int e;
    public int f;

    public ai9(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        d(usc.e(i));
    }

    public final int a(int i) {
        int i2;
        long[] jArr;
        int[] iArr;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j = ((jArr2[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr2[i9] >>> i10);
            long j2 = i5;
            int i11 = i8;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j4) >> 3)) & i6;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iB = b(i4);
                long j5 = 128;
                long j6 = 255;
                if (this.f == 0) {
                    long j7 = 254;
                    if (((this.a[iB >> 3] >> ((iB & 7) << 3)) & 255) != 254) {
                        int i12 = this.d;
                        if (i12 > 8) {
                            i2 = i4;
                            if (Long.compareUnsigned(this.e * 32, i12 * 25) <= 0) {
                                long[] jArr3 = this.a;
                                int i13 = this.d;
                                int i14 = 0;
                                int i15 = 0;
                                while (i14 < i13) {
                                    int i16 = i14 >> 3;
                                    int i17 = (i14 & 7) << 3;
                                    if (((jArr3[i16] >> i17) & 255) == j7) {
                                        long[] jArr4 = this.a;
                                        jArr4[i16] = (jArr4[i16] & (~(255 << i17))) | (j5 << i17);
                                        int i18 = this.d;
                                        int i19 = ((i14 - 7) & i18) + (i18 & 7);
                                        int i20 = i19 >> 3;
                                        int i21 = (i19 & 7) << 3;
                                        jArr4[i20] = ((~(255 << i21)) & jArr4[i20]) | (128 << i21);
                                        i15++;
                                    }
                                    i14++;
                                    j5 = 128;
                                    j7 = 254;
                                }
                                this.f += i15;
                            }
                            iB = b(i2);
                        } else {
                            i2 = i4;
                        }
                        int iC = usc.c(this.d);
                        long[] jArr5 = this.a;
                        int[] iArr2 = this.b;
                        Object[] objArr = this.c;
                        int i22 = this.d;
                        d(iC);
                        int[] iArr3 = this.b;
                        Object[] objArr2 = this.c;
                        int i23 = 0;
                        while (i23 < i22) {
                            if (((jArr5[i23 >> 3] >> ((i23 & 7) << 3)) & j6) < 128) {
                                int i24 = iArr2[i23];
                                int iHashCode2 = Integer.hashCode(i24) * (-862048943);
                                int i25 = iHashCode2 ^ (iHashCode2 << 16);
                                int iB2 = b(i25 >>> 7);
                                long j8 = i25 & 127;
                                long[] jArr6 = this.a;
                                int i26 = iB2 >> 3;
                                int i27 = (iB2 & 7) << 3;
                                jArr6[i26] = (jArr6[i26] & (~(255 << i27))) | (j8 << i27);
                                int i28 = this.d;
                                int i29 = ((iB2 - 7) & i28) + (i28 & 7);
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                jArr = jArr5;
                                iArr = iArr2;
                                jArr6[i30] = (jArr6[i30] & (~(255 << i31))) | (j8 << i31);
                                iArr3[iB2] = i24;
                                objArr2[iB2] = objArr[i23];
                            } else {
                                jArr = jArr5;
                                iArr = iArr2;
                            }
                            i23++;
                            jArr5 = jArr;
                            iArr2 = iArr;
                            j6 = 255;
                        }
                        iB = b(i2);
                    }
                }
                this.e++;
                int i32 = this.f;
                long[] jArr7 = this.a;
                int i33 = iB >> 3;
                long j9 = jArr7[i33];
                int i34 = (iB & 7) << 3;
                this.f = i32 - (((j9 >> i34) & 255) != 128 ? 0 : 1);
                jArr7[i33] = ((~(255 << i34)) & j9) | (j2 << i34);
                int i35 = this.d;
                int i36 = ((iB - 7) & i35) + (i35 & 7);
                int i37 = i36 >> 3;
                int i38 = (i36 & 7) << 3;
                jArr7[i37] = (j2 << i38) | (jArr7[i37] & (~(255 << i38)));
                return iB;
            }
            i8 = i11 + 8;
            i7 = (i7 + i8) & i6;
        }
    }

    public final int b(int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3e:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L59
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.b
            r11 = r11[r10]
            if (r11 != r14) goto L53
            goto L63
        L53:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3e
        L59:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6c
            r10 = -1
        L63:
            if (r10 < 0) goto L6a
            java.lang.Object[] r13 = r13.c
            r13 = r13[r10]
            goto L6b
        L6a:
            r13 = 0
        L6b:
            return r13
        L6c:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai9.c(int):java.lang.Object");
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
        this.c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        r24 = r0;
        r5 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
    
        if (((r2 & ((~r2) << 6)) & (-9187201950435737472L)) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        r22 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.b;
        Object[] objArr = this.c;
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
                            Object obj = objArr[i5];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i6);
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
            int[] r2 = r0.b
            java.lang.Object[] r3 = r0.c
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
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L56
            java.lang.String r14 = "(this)"
        L56:
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai9.toString():java.lang.String");
    }
}
