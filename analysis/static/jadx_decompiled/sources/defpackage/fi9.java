package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fi9 {
    public long[] a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

    public fi9(int i) {
        this.a = usc.a;
        this.b = vv7.b;
        this.c = j47.o;
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        e(usc.e(i));
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != usc.a) {
            ys.b0(jArr);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.c, 0, this.d, (Object) null);
        this.f = usc.a(this.d) - this.e;
    }

    public final int b(long j) {
        long j2;
        int i;
        long[] jArr;
        long[] jArr2;
        long j3;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.d;
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
                int iC = c(i3);
                long j8 = 128;
                long j9 = 255;
                if (this.f != 0 || ((this.a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j2 = j5;
                } else {
                    int i11 = this.d;
                    if (i11 > 8) {
                        i = i3;
                        if (Long.compareUnsigned(this.e * 32, i11 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i12 = this.d;
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < i12) {
                                int i15 = i13 >> 3;
                                int i16 = (i13 & 7) << 3;
                                if (((jArr4[i15] >> i16) & 255) == 254) {
                                    long[] jArr5 = this.a;
                                    jArr5[i15] = (jArr5[i15] & (~(255 << i16))) | (j8 << i16);
                                    int i17 = this.d;
                                    int i18 = ((i13 - 7) & i17) + (i17 & 7);
                                    int i19 = i18 >> 3;
                                    int i20 = (i18 & 7) << 3;
                                    jArr5[i19] = ((~(255 << i20)) & jArr5[i19]) | (128 << i20);
                                    i14++;
                                }
                                i13++;
                                j8 = 128;
                            }
                            this.f += i14;
                        }
                        j2 = j5;
                        iC = c(i);
                    } else {
                        i = i3;
                    }
                    int iC2 = usc.c(this.d);
                    long[] jArr6 = this.a;
                    long[] jArr7 = this.b;
                    Object[] objArr = this.c;
                    int i21 = this.d;
                    e(iC2);
                    long[] jArr8 = this.b;
                    Object[] objArr2 = this.c;
                    int i22 = 0;
                    while (i22 < i21) {
                        if (((jArr6[i22 >> 3] >> ((i22 & 7) << 3)) & j9) < 128) {
                            long j10 = jArr7[i22];
                            int iHashCode2 = Long.hashCode(j10) * (-862048943);
                            int i23 = iHashCode2 ^ (iHashCode2 << 16);
                            int iC3 = c(i23 >>> 7);
                            long j11 = i23 & 127;
                            long[] jArr9 = this.a;
                            int i24 = iC3 >> 3;
                            int i25 = (iC3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr7;
                            jArr9[i24] = (jArr9[i24] & (~(255 << i25))) | (j11 << i25);
                            int i26 = this.d;
                            int i27 = ((iC3 - 7) & i26) + (i26 & 7);
                            int i28 = i27 >> 3;
                            int i29 = (i27 & 7) << 3;
                            j3 = j5;
                            jArr9[i28] = (j11 << i29) | (jArr9[i28] & (~(255 << i29)));
                            jArr8[iC3] = j10;
                            objArr2[iC3] = objArr[i22];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr7;
                            j3 = j5;
                        }
                        i22++;
                        jArr6 = jArr;
                        jArr7 = jArr2;
                        j5 = j3;
                        j9 = 255;
                    }
                    j2 = j5;
                    iC = c(i);
                }
                this.e++;
                int i30 = this.f;
                long[] jArr10 = this.a;
                int i31 = iC >> 3;
                long j12 = jArr10[i31];
                int i32 = (iC & 7) << 3;
                this.f = i30 - (((j12 >> i32) & 255) != 128 ? 0 : 1);
                jArr10[i31] = ((~(255 << i32)) & j12) | (j2 << i32);
                int i33 = this.d;
                int i34 = ((iC - 7) & i33) + (i33 & 7);
                int i35 = i34 >> 3;
                int i36 = (i34 & 7) << 3;
                jArr10[i35] = (j2 << i36) | (jArr10[i35] & (~(255 << i36)));
                return iC;
            }
            i7 = i10 + 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final int c(int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r14) {
        /*
            r13 = this;
            int r0 = java.lang.Long.hashCode(r14)
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
            if (r4 == 0) goto L6e
            r10 = -1
        L65:
            if (r10 < 0) goto L6c
            java.lang.Object[] r13 = r13.c
            r13 = r13[r10]
            goto L6d
        L6c:
            r13 = 0
        L6d:
            return r13
        L6e:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi9.d(long):java.lang.Object");
    }

    public final void e(int i) {
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
        this.c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
    
        r26 = r3;
        r7 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e4, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi9.equals(java.lang.Object):boolean");
    }

    public final Object f(long j, Object obj) {
        int iB = b(j);
        Object[] objArr = this.c;
        Object obj2 = objArr[iB];
        this.b[iB] = j;
        objArr[iB] = obj;
        return obj2;
    }

    public final void g(long j, Object obj) {
        int iB = b(j);
        this.b[iB] = j;
        this.c[iB] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.b;
        Object[] objArr = this.c;
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
                            int i5 = (i2 << 3) + i4;
                            long j2 = jArr[i5];
                            Object obj = objArr[i5];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
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
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ fi9() {
        this(6);
    }
}
