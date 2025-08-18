package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gi9 {
    public long[] a;
    public long[] b;
    public int c;
    public int d;
    public int e;

    public gi9(int i) {
        this.a = usc.a;
        this.b = vv7.b;
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        h(usc.e(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[PHI: r7
      0x006f: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:14:0x0038, B:26:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String k(defpackage.gi9 r17, java.lang.String r18, java.lang.String r19, int r20) {
        /*
            r0 = r17
            r1 = r20 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lc
        La:
            r1 = r18
        Lc:
            r3 = r20 & 4
            if (r3 == 0) goto L11
            goto L13
        L11:
            r2 = r19
        L13:
            r17.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            long[] r1 = r0.b
            long[] r0 = r0.a
            int r4 = r0.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L74
            r5 = 0
            r6 = r5
            r7 = r6
        L2a:
            r8 = r0[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6f
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L44:
            if (r12 >= r10) goto L6d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L69
            int r13 = r6 << 3
            int r13 = r13 + r12
            r13 = r1[r13]
            r15 = -1
            if (r7 != r15) goto L5d
            java.lang.String r0 = "..."
            r3.append(r0)
            goto L77
        L5d:
            if (r7 == 0) goto L64
            java.lang.String r15 = ", "
            r3.append(r15)
        L64:
            r3.append(r13)
            int r7 = r7 + 1
        L69:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L44
        L6d:
            if (r10 != r11) goto L74
        L6f:
            if (r6 == r4) goto L74
            int r6 = r6 + 1
            goto L2a
        L74:
            r3.append(r2)
        L77:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi9.k(gi9, java.lang.String, java.lang.String, int):java.lang.String");
    }

    public final boolean a(long j) {
        int i = this.d;
        this.b[e(j)] = j;
        return this.d != i;
    }

    public final void b(gi9 gi9Var) {
        long[] jArr = gi9Var.b;
        long[] jArr2 = gi9Var.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        long j2 = jArr[(i << 3) + i3];
                        this.b[e(j2)] = j2;
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

    public final void c() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != usc.a) {
            ys.b0(jArr);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.e = usc.a(this.c) - this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(long r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Long.hashCode(r17)
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
            if (r10 == 0) goto L5e
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.b
            r14 = r14[r10]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L58
            goto L68
        L58:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L41
        L5e:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6c
            r10 = -1
        L68:
            if (r10 < 0) goto L6b
            r4 = r11
        L6b:
            return r4
        L6c:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi9.d(long):boolean");
    }

    public final int e(long j) {
        long j2;
        int i;
        long[] jArr;
        long[] jArr2;
        long j3;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.c;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j4 = ((jArr3[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr3[i8] >>> i9);
            long j5 = i4;
            int i10 = i7;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int iNumberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j7) >> 3)) & i5;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iF = f(i3);
                long j8 = 128;
                if (this.e != 0 || ((this.a[iF >> 3] >> ((iF & 7) << 3)) & 255) == 254) {
                    j2 = j5;
                } else {
                    int i11 = this.c;
                    if (i11 > 8) {
                        i = i3;
                        if (Long.compareUnsigned(this.d * 32, i11 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i12 = this.c;
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < i12) {
                                int i15 = i13 >> 3;
                                int i16 = (i13 & 7) << 3;
                                if (((jArr4[i15] >> i16) & 255) == 254) {
                                    long[] jArr5 = this.a;
                                    jArr5[i15] = (jArr5[i15] & (~(255 << i16))) | (j8 << i16);
                                    int i17 = this.c;
                                    int i18 = ((i13 - 7) & i17) + (i17 & 7);
                                    int i19 = i18 >> 3;
                                    int i20 = (i18 & 7) << 3;
                                    jArr5[i19] = ((~(255 << i20)) & jArr5[i19]) | (128 << i20);
                                    i14++;
                                }
                                i13++;
                                j8 = 128;
                            }
                            this.e += i14;
                        }
                        j2 = j5;
                        iF = f(i);
                    } else {
                        i = i3;
                    }
                    int iC = usc.c(this.c);
                    long[] jArr6 = this.a;
                    long[] jArr7 = this.b;
                    int i21 = this.c;
                    h(iC);
                    long[] jArr8 = this.b;
                    int i22 = 0;
                    while (i22 < i21) {
                        if (((jArr6[i22 >> 3] >> ((i22 & 7) << 3)) & 255) < 128) {
                            long j9 = jArr7[i22];
                            int iHashCode2 = Long.hashCode(j9) * (-862048943);
                            int i23 = iHashCode2 ^ (iHashCode2 << 16);
                            int iF2 = f(i23 >>> 7);
                            long j10 = i23 & 127;
                            long[] jArr9 = this.a;
                            int i24 = iF2 >> 3;
                            int i25 = (iF2 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr7;
                            jArr9[i24] = (jArr9[i24] & (~(255 << i25))) | (j10 << i25);
                            int i26 = this.c;
                            int i27 = ((iF2 - 7) & i26) + (i26 & 7);
                            int i28 = i27 >> 3;
                            int i29 = (i27 & 7) << 3;
                            j3 = j5;
                            jArr9[i28] = (jArr9[i28] & (~(255 << i29))) | (j10 << i29);
                            jArr8[iF2] = j9;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr7;
                            j3 = j5;
                        }
                        i22++;
                        jArr6 = jArr;
                        jArr7 = jArr2;
                        j5 = j3;
                    }
                    j2 = j5;
                    iF = f(i);
                }
                this.d++;
                int i30 = this.e;
                long[] jArr10 = this.a;
                int i31 = iF >> 3;
                long j11 = jArr10[i31];
                int i32 = (iF & 7) << 3;
                this.e = i30 - (((j11 >> i32) & 255) != 128 ? 0 : 1);
                jArr10[i31] = ((~(255 << i32)) & j11) | (j2 << i32);
                int i33 = this.c;
                int i34 = ((iF - 7) & i33) + (i33 & 7);
                int i35 = i34 >> 3;
                int i36 = (i34 & 7) << 3;
                jArr10[i35] = (j2 << i36) | (jArr10[i35] & (~(255 << i36)));
                return iF;
            }
            i7 = i10 + 8;
            i6 = (i6 + i7) & i5;
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
            boolean r1 = r15 instanceof defpackage.gi9
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gi9 r15 = (defpackage.gi9) r15
            int r1 = r15.d
            int r3 = r14.d
            if (r1 == r3) goto L13
            return r2
        L13:
            long[] r1 = r14.b
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
            boolean r10 = r15.d(r10)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi9.equals(java.lang.Object):boolean");
    }

    public final int f(int i) {
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g() {
        /*
            r13 = this;
            long[] r0 = r13.b
            long[] r13 = r13.a
            int r1 = r13.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L41
            r2 = 0
            r3 = r2
        Lb:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L3c
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L3a
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L36
            int r13 = r3 << 3
            int r13 = r13 + r8
            r0 = r0[r13]
            return r0
        L36:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L3a:
            if (r6 != r7) goto L41
        L3c:
            if (r3 == r1) goto L41
            int r3 = r3 + 1
            goto Lb
        L41:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            java.lang.String r0 = "The LongSet is empty"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi9.g():long");
    }

    public final void h(int i) {
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
        this.b = new long[iMax];
    }

    public final int hashCode() {
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int iHashCode = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            iHashCode = Long.hashCode(jArr[(i2 << 3) + i4]) + iHashCode;
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

    public final boolean i() {
        return this.d == 0;
    }

    public final boolean j() {
        return this.d != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(long r14) {
        /*
            r13 = this;
            int r0 = java.lang.Long.hashCode(r14)
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
            if (r12 == 0) goto L5b
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r13.b
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L55
            goto L65
        L55:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3e
        L5b:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6b
            r10 = -1
        L65:
            if (r10 < 0) goto L6a
            r13.n(r10)
        L6a:
            return
        L6b:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi9.l(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00af, code lost:
    
        r24 = r4;
        r1 = ((~r10) << 6) & r10;
        r10 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        if ((r1 & (-9187201950435737472L)) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bf, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.gi9 r26) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi9.m(gi9):void");
    }

    public final void n(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.c;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
    }

    public final String toString() {
        return k(this, "[", "]", 25);
    }

    public /* synthetic */ gi9(Object obj) {
        this(6);
    }
}
