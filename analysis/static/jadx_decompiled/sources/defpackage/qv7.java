package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class qv7 {
    public int a;
    public long[] b;
    public long[] c;
    public Object[] d;
    public int e;
    public int f;

    public final int a(int i) {
        int i2 = this.e;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.b;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r14) {
        /*
            r13 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            int r0 = r0.hashCode()
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.e
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L17:
            long[] r4 = r13.b
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
        L42:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r13.c
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L59
            goto L69
        L59:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L42
        L5f:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L69:
            if (r10 < 0) goto L70
            java.lang.Object[] r13 = r13.d
            r13 = r13[r10]
            goto L71
        L70:
            r13 = 0
        L71:
            return r13
        L72:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv7.b(long):java.lang.Object");
    }

    public final void c(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            iMax = Math.max(7, i > 0 ? (-1) >>> Integer.numberOfLeadingZeros(i) : 0);
        } else {
            iMax = 0;
        }
        this.e = iMax;
        if (iMax == 0) {
            jArr = i24.c;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.b = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        int i4 = this.e;
        this.a = (i4 == 7 ? 6 : i4 - (i4 / 8)) - this.f;
        this.c = new long[iMax];
        this.d = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(long r14) {
        /*
            Method dump skipped, instructions count: 176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv7.d(long):void");
    }

    public final void e(int i) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3 = this.b;
        long[] jArr4 = this.c;
        Object[] objArr = this.d;
        int i2 = this.e;
        c(i);
        long[] jArr5 = this.c;
        Object[] objArr2 = this.d;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr3[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr4[i3];
                int iHashCode = Long.valueOf(j).hashCode() * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int iA = a(i4 >>> 7);
                long j2 = i4 & 127;
                long[] jArr6 = this.b;
                int i5 = iA >> 3;
                int i6 = (iA & 7) << 3;
                jArr = jArr3;
                jArr2 = jArr4;
                jArr6[i5] = (jArr6[i5] & (~(255 << i6))) | (j2 << i6);
                int i7 = this.e;
                int i8 = ((iA - 7) & i7) + (i7 & 7);
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                jArr6[i9] = (jArr6[i9] & (~(255 << i10))) | (j2 << i10);
                jArr5[iA] = j;
                objArr2[iA] = objArr[i3];
            } else {
                jArr = jArr3;
                jArr2 = jArr4;
            }
            i3++;
            jArr3 = jArr;
            jArr4 = jArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        r26 = r3;
        r7 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e8, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv7.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0072, code lost:
    
        r1 = a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        if (r25.a != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
    
        r15 = 254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        if (((r25.b[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        r1 = r25.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (r1 <= 8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (java.lang.Long.compareUnsigned(r25.f * 32, r1 * 25) > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        r1 = r25.b;
        r3 = r25.e;
        r6 = 0;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
    
        if (r6 >= r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        r12 = r6 >> 3;
        r17 = (r6 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        if (((r1[r12] >> r17) & 255) != r15) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        r13 = r25.b;
        r13[r12] = (r13[r12] & (~(255 << r17))) | (128 << r17);
        r4 = r25.e;
        r5 = ((r6 - 7) & r4) + (r4 & 7);
        r4 = r5 >> 3;
        r5 = (r5 & 7) << 3;
        r13[r4] = (r13[r4] & (~(255 << r5))) | (128 << r5);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
    
        r6 = r6 + 1;
        r15 = 254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f3, code lost:
    
        r25.a += r11;
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fa, code lost:
    
        r1 = r25.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fc, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fe, code lost:
    
        r3 = 1;
        r11 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0101, code lost:
    
        r3 = 1;
        r11 = (r1 * 2) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0106, code lost:
    
        e(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0109, code lost:
    
        r1 = a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010d, code lost:
    
        r15 = r1;
        r25.f += r3;
        r1 = r25.a;
        r2 = r25.b;
        r4 = r15 >> 3;
        r5 = r2[r4];
        r11 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0126, code lost:
    
        if (((r5 >> r11) & 255) != 128) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0128, code lost:
    
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012b, code lost:
    
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012d, code lost:
    
        r25.a = r1 - r18;
        r2[r4] = (r5 & (~(255 << r11))) | (r9 << r11);
        r1 = r25.e;
        r3 = ((r15 - 7) & r1) + (r1 & 7);
        r1 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r2[r1] = (r2[r1] & (~(255 << r3))) | (r9 << r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r26, defpackage.urf r28) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv7.f(long, urf):void");
    }

    public final int hashCode() {
        long[] jArr = this.c;
        Object[] objArr = this.d;
        long[] jArr2 = this.b;
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
        if (this.f == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.c;
        Object[] objArr = this.d;
        long[] jArr2 = this.b;
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
                            if (i4 < this.f) {
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
}
