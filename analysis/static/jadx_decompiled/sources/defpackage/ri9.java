package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ri9 {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;

    public ri9(int i) {
        this.a = usc.a;
        this.b = j47.o;
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        e(usc.e(i));
    }

    public final void a(Object obj) {
        this.b[c(obj)] = obj;
    }

    public final void b() {
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
        Arrays.fill(this.b, 0, this.c, (Object) null);
        this.e = usc.a(this.c) - this.d;
    }

    public final int c(Object obj) {
        long j;
        int i;
        long[] jArr;
        Object[] objArr;
        int i2;
        long j2;
        long[] jArr2;
        int i3;
        int i4 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.c;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j3 = ((jArr3[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr3[i11] >>> i12);
            long j4 = i7;
            int i13 = i7;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j6) >> 3)) & i8;
                if (tpa.f(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j3) << 6) & j3 & (-9187201950435737472L)) != 0) {
                int iD = d(i6);
                if (this.e != 0 || ((this.a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j = j4;
                } else {
                    int i14 = this.c;
                    if (i14 <= 8 || Long.compareUnsigned(this.d * 32, i14 * 25) > 0) {
                        int iC = usc.c(this.c);
                        long[] jArr4 = this.a;
                        Object[] objArr2 = this.b;
                        int i15 = this.c;
                        e(iC);
                        Object[] objArr3 = this.b;
                        int i16 = 0;
                        while (i16 < i15) {
                            if (((jArr4[i16 >> 3] >> ((i16 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i16];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i4;
                                int i17 = iHashCode2 ^ (iHashCode2 << 16);
                                int iD2 = d(i17 >>> 7);
                                i2 = i6;
                                long j7 = i17 & 127;
                                long[] jArr5 = this.a;
                                int i18 = iD2 >> 3;
                                int i19 = (iD2 & 7) << 3;
                                jArr = jArr4;
                                objArr = objArr2;
                                jArr5[i18] = (jArr5[i18] & (~(255 << i19))) | (j7 << i19);
                                int i20 = this.c;
                                int i21 = ((iD2 - 7) & i20) + (i20 & 7);
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                j2 = j4;
                                jArr5[i22] = (j7 << i23) | (jArr5[i22] & (~(255 << i23)));
                                objArr3[iD2] = obj2;
                            } else {
                                jArr = jArr4;
                                objArr = objArr2;
                                i2 = i6;
                                j2 = j4;
                            }
                            i16++;
                            jArr4 = jArr;
                            i6 = i2;
                            j4 = j2;
                            objArr2 = objArr;
                            i4 = -862048943;
                        }
                        j = j4;
                        i = i6;
                    } else {
                        long[] jArr6 = this.a;
                        int i24 = this.c;
                        int i25 = 0;
                        int i26 = 0;
                        while (i25 < i24) {
                            int i27 = i25 >> 3;
                            int i28 = (i25 & 7) << 3;
                            if (((jArr6[i27] >> i28) & 255) == 254) {
                                long[] jArr7 = this.a;
                                jArr7[i27] = (jArr7[i27] & (~(255 << i28))) | (128 << i28);
                                int i29 = this.c;
                                int i30 = ((i25 - 7) & i29) + (i29 & 7);
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                jArr2 = jArr6;
                                i3 = i24;
                                jArr7[i31] = ((~(255 << i32)) & jArr7[i31]) | (128 << i32);
                                i26++;
                            } else {
                                jArr2 = jArr6;
                                i3 = i24;
                            }
                            i25++;
                            jArr6 = jArr2;
                            i24 = i3;
                        }
                        this.e += i26;
                        i = i6;
                        j = j4;
                    }
                    iD = d(i);
                }
                this.d++;
                int i33 = this.e;
                long[] jArr8 = this.a;
                int i34 = iD >> 3;
                long j8 = jArr8[i34];
                int i35 = (iD & 7) << 3;
                this.e = i33 - (((j8 >> i35) & 255) != 128 ? 0 : 1);
                jArr8[i34] = ((~(255 << i35)) & j8) | (j << i35);
                int i36 = this.c;
                int i37 = ((iD - 7) & i36) + (i36 & 7);
                int i38 = i37 >> 3;
                int i39 = (i37 & 7) << 3;
                jArr8[i38] = (j << i39) | (jArr8[i38] & (~(255 << i39)));
                return iD;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
            i7 = i13;
            i4 = -862048943;
        }
    }

    public final int d(int i) {
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

    public final void e(int i) {
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
        this.b = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        r2 = ((~r11) << 6) & r11;
        r11 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
    
        if ((r2 & (-9187201950435737472L)) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        r20 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri9.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L42:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L61
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.b
            r11 = r11[r10]
            boolean r11 = defpackage.tpa.f(r11, r14)
            if (r11 == 0) goto L5b
            goto L6b
        L5b:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L42
        L61:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L71
            r10 = -1
        L6b:
            if (r10 < 0) goto L70
            r13.g(r10)
        L70:
            return
        L71:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri9.f(java.lang.Object):void");
    }

    public final void g(int i) {
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
        this.b[i] = null;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
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
                            Object obj = objArr[(i2 << 3) + i4];
                            iHashCode += obj != null ? obj.hashCode() : 0;
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[PHI: r7
      0x0069: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x002c, B:18:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            c0 r1 = new c0
            r2 = 6
            r1.<init>(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "["
            r2.append(r3)
            java.lang.Object[] r3 = r0.b
            long[] r0 = r0.a
            int r4 = r0.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L6e
            r5 = 0
            r6 = r5
            r7 = r6
        L1e:
            r8 = r0[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L69
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L38:
            if (r12 >= r10) goto L67
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L63
            int r13 = r6 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            r14 = -1
            if (r7 != r14) goto L51
            java.lang.String r0 = "..."
            r2.append(r0)
            goto L73
        L51:
            if (r7 == 0) goto L58
            java.lang.String r14 = ", "
            r2.append(r14)
        L58:
            java.lang.Object r13 = r1.invoke(r13)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r2.append(r13)
            int r7 = r7 + 1
        L63:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L38
        L67:
            if (r10 != r11) goto L6e
        L69:
            if (r6 == r4) goto L6e
            int r6 = r6 + 1
            goto L1e
        L6e:
            java.lang.String r0 = "]"
            r2.append(r0)
        L73:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri9.toString():java.lang.String");
    }

    public /* synthetic */ ri9() {
        this(6);
    }
}
