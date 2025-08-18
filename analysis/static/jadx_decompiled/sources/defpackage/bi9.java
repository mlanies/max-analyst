package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class bi9 {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public bi9(int i) {
        this.a = usc.a;
        this.b = k37.b;
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        f(usc.e(i));
    }

    public final void a(int i) {
        this.b[d(i)] = i;
    }

    public final void b(bi9 bi9Var) {
        int[] iArr = bi9Var.b;
        long[] jArr = bi9Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        g(iArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r6 = r6[r7]
            int r12 = 64 - r8
            long r6 = r6 << r12
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L41:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L58
            goto L69
        L58:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L41
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            r4 = r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi9.c(int):boolean");
    }

    public final int d(int i) {
        int i2;
        long[] jArr;
        int[] iArr;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.c;
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
                int iE = e(i4);
                long j5 = 128;
                if (this.e == 0) {
                    long j6 = 254;
                    if (((this.a[iE >> 3] >> ((iE & 7) << 3)) & 255) != 254) {
                        int i12 = this.c;
                        if (i12 > 8) {
                            i2 = i4;
                            if (Long.compareUnsigned(this.d * 32, i12 * 25) <= 0) {
                                long[] jArr3 = this.a;
                                int i13 = this.c;
                                int i14 = 0;
                                int i15 = 0;
                                while (i14 < i13) {
                                    int i16 = i14 >> 3;
                                    int i17 = (i14 & 7) << 3;
                                    if (((jArr3[i16] >> i17) & 255) == j6) {
                                        long[] jArr4 = this.a;
                                        jArr4[i16] = (jArr4[i16] & (~(255 << i17))) | (j5 << i17);
                                        int i18 = this.c;
                                        int i19 = ((i14 - 7) & i18) + (i18 & 7);
                                        int i20 = i19 >> 3;
                                        int i21 = (i19 & 7) << 3;
                                        jArr4[i20] = ((~(255 << i21)) & jArr4[i20]) | (128 << i21);
                                        i15++;
                                    }
                                    i14++;
                                    j5 = 128;
                                    j6 = 254;
                                }
                                this.e += i15;
                            }
                            iE = e(i2);
                        } else {
                            i2 = i4;
                        }
                        int iC = usc.c(this.c);
                        long[] jArr5 = this.a;
                        int[] iArr2 = this.b;
                        int i22 = this.c;
                        f(iC);
                        int[] iArr3 = this.b;
                        int i23 = 0;
                        while (i23 < i22) {
                            if (((jArr5[i23 >> 3] >> ((i23 & 7) << 3)) & 255) < 128) {
                                int i24 = iArr2[i23];
                                int iHashCode2 = Integer.hashCode(i24) * (-862048943);
                                int i25 = iHashCode2 ^ (iHashCode2 << 16);
                                int iE2 = e(i25 >>> 7);
                                long j7 = i25 & 127;
                                long[] jArr6 = this.a;
                                int i26 = iE2 >> 3;
                                int i27 = (iE2 & 7) << 3;
                                jArr6[i26] = (jArr6[i26] & (~(255 << i27))) | (j7 << i27);
                                int i28 = this.c;
                                int i29 = ((iE2 - 7) & i28) + (i28 & 7);
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                jArr = jArr5;
                                iArr = iArr2;
                                jArr6[i30] = (jArr6[i30] & (~(255 << i31))) | (j7 << i31);
                                iArr3[iE2] = i24;
                            } else {
                                jArr = jArr5;
                                iArr = iArr2;
                            }
                            i23++;
                            jArr5 = jArr;
                            iArr2 = iArr;
                        }
                        iE = e(i2);
                    }
                }
                this.d++;
                int i32 = this.e;
                long[] jArr7 = this.a;
                int i33 = iE >> 3;
                long j8 = jArr7[i33];
                int i34 = (iE & 7) << 3;
                this.e = i32 - (((j8 >> i34) & 255) != 128 ? 0 : 1);
                jArr7[i33] = ((~(255 << i34)) & j8) | (j2 << i34);
                int i35 = this.c;
                int i36 = ((iE - 7) & i35) + (i35 & 7);
                int i37 = i36 >> 3;
                int i38 = (i36 & 7) << 3;
                jArr7[i37] = (j2 << i38) | (jArr7[i37] & (~(255 << i38)));
                return iE;
            }
            i8 = i11 + 8;
            i7 = (i7 + i8) & i6;
        }
    }

    public final int e(int i) {
        int i2 = this.c;
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 1
            if (r15 != r14) goto L4
            return r0
        L4:
            boolean r1 = r15 instanceof defpackage.bi9
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            bi9 r15 = (defpackage.bi9) r15
            int r1 = r15.d
            int r3 = r14.d
            if (r1 == r3) goto L13
            return r2
        L13:
            int[] r1 = r14.b
            long[] r14 = r14.a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L59
            r4 = r2
        L1d:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L37:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r10 = r15.c(r10)
            if (r10 != 0) goto L4e
            return r2
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L52:
            if (r7 != r8) goto L59
        L54:
            if (r4 == r3) goto L59
            int r4 = r4 + 1
            goto L1d
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi9.equals(java.lang.Object):boolean");
    }

    public final void f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, usc.d(i)) : 0;
        this.c = iMax;
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
        this.e = usc.a(this.c) - this.d;
        this.b = new int[iMax];
    }

    public final void g(int i) {
        this.b[d(i)] = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.c
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
            if (r4 == 0) goto L9f
            r10 = -1
        L63:
            if (r10 < 0) goto L9e
            int r14 = r13.d
            int r14 = r14 + (-1)
            r13.d = r14
            long[] r14 = r13.a
            int r0 = r10 >> 3
            r1 = r10 & 7
            int r1 = r1 << 3
            r2 = r14[r0]
            r4 = 255(0xff, double:1.26E-321)
            long r6 = r4 << r1
            long r6 = ~r6
            long r2 = r2 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r8 = r6 << r1
            long r1 = r2 | r8
            r14[r0] = r1
            int r13 = r13.c
            int r10 = r10 + (-7)
            r0 = r10 & r13
            r13 = r13 & 7
            int r0 = r0 + r13
            int r13 = r0 >> 3
            r0 = r0 & 7
            int r0 = r0 << 3
            r1 = r14[r13]
            long r3 = r4 << r0
            long r3 = ~r3
            long r1 = r1 & r3
            long r3 = r6 << r0
            long r0 = r1 | r3
            r14[r13] = r0
        L9e:
            return
        L9f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi9.h(int):void");
    }

    public final int hashCode() {
        int[] iArr = this.b;
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
                            iHashCode = Integer.hashCode(iArr[(i2 << 3) + i4]) + iHashCode;
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[PHI: r5
      0x005b: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0024, B:18:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r15 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            int[] r1 = r15.b
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L60
            r3 = 0
            r4 = r3
            r5 = r4
        L16:
            r6 = r15[r4]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L5b
            int r8 = r4 - r2
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r3
        L30:
            if (r10 >= r8) goto L59
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L55
            int r11 = r4 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            r12 = -1
            if (r5 != r12) goto L49
            java.lang.String r15 = "..."
            r0.append(r15)
            goto L65
        L49:
            if (r5 == 0) goto L50
            java.lang.String r12 = ", "
            r0.append(r12)
        L50:
            r0.append(r11)
            int r5 = r5 + 1
        L55:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L30
        L59:
            if (r8 != r9) goto L60
        L5b:
            if (r4 == r2) goto L60
            int r4 = r4 + 1
            goto L16
        L60:
            java.lang.String r15 = "]"
            r0.append(r15)
        L65:
            java.lang.String r15 = r0.toString()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi9.toString():java.lang.String");
    }

    public /* synthetic */ bi9() {
        this(6);
    }
}
