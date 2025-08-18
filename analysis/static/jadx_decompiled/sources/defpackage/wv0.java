package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class wv0 {
    public final wv0 a;
    public final AtomicReference b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public int[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public String[] l;
    public int m;
    public int n;
    public boolean o;

    public wv0(int i) {
        this.a = null;
        this.c = i;
        this.d = true;
        this.e = true;
        this.b = new AtomicReference(new vv0(64, 4, new int[512], new String[128], 448, 512));
    }

    public final int a(int i) {
        return ((this.g - 1) & i) << 2;
    }

    public final int b(int i) {
        int iA = a(i);
        int[] iArr = this.f;
        if (iArr[iA + 3] == 0) {
            return iA;
        }
        if (this.k > (this.g >> 1)) {
            int iD = (this.m - d()) >> 2;
            int i2 = this.k;
            if (iD > ((i2 + 1) >> 7) || i2 > this.g * 0.8d) {
                return c(i);
            }
        }
        int i3 = this.h + ((iA >> 3) << 2);
        if (iArr[i3 + 3] == 0) {
            return i3;
        }
        int i4 = this.i;
        int i5 = this.j;
        int i6 = i4 + ((iA >> (i5 + 2)) << i5);
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            if (iArr[i6 + 3] == 0) {
                return i6;
            }
            i6 += 4;
        }
        int i8 = this.m;
        int i9 = i8 + 4;
        this.m = i9;
        int i10 = this.g;
        if (i9 < (i10 << 3)) {
            return i8;
        }
        if (!this.e || i10 <= 1024) {
            return c(i);
        }
        StringBuilder sb = new StringBuilder("Spill-over slots in symbol table with ");
        sb.append(this.k);
        sb.append(" entries, hash area of ");
        sb.append(this.g);
        sb.append(" slots is now full (all ");
        throw new IllegalStateException(zr6.j(sb, this.g >> 3, " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`"));
    }

    public final int c(int i) {
        this.o = false;
        int[] iArr = this.f;
        String[] strArr = this.l;
        int i2 = this.g;
        int i3 = this.k;
        int i4 = i2 + i2;
        int i5 = this.m;
        if (i4 > 65536) {
            n(true);
        } else {
            this.f = new int[iArr.length + (i2 << 3)];
            this.g = i4;
            int i6 = i4 << 2;
            this.h = i6;
            this.i = i6 + (i6 >> 1);
            int i7 = i4 >> 2;
            this.j = i7 < 64 ? 4 : i7 <= 256 ? 5 : i7 <= 1024 ? 6 : 7;
            this.l = new String[strArr.length << 1];
            n(false);
            int[] iArr2 = new int[16];
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9 += 4) {
                int i10 = iArr[i9 + 3];
                if (i10 != 0) {
                    i8++;
                    String str = strArr[i9 >> 2];
                    if (i10 == 1) {
                        iArr2[0] = iArr[i9];
                        f(str, iArr2, 1);
                    } else if (i10 == 2) {
                        iArr2[0] = iArr[i9];
                        iArr2[1] = iArr[i9 + 1];
                        f(str, iArr2, 2);
                    } else if (i10 != 3) {
                        if (i10 > iArr2.length) {
                            iArr2 = new int[i10];
                        }
                        System.arraycopy(iArr, iArr[i9 + 1], iArr2, 0, i10);
                        f(str, iArr2, i10);
                    } else {
                        iArr2[0] = iArr[i9];
                        iArr2[1] = iArr[i9 + 1];
                        iArr2[2] = iArr[i9 + 2];
                        f(str, iArr2, 3);
                    }
                }
            }
            if (i8 != i3) {
                throw new IllegalStateException(rh4.h("Failed rehash(): old count=", i3, i8, ", copyCount="));
            }
        }
        int iA = a(i);
        int[] iArr3 = this.f;
        if (iArr3[iA + 3] == 0) {
            return iA;
        }
        int i11 = this.h + ((iA >> 3) << 2);
        if (iArr3[i11 + 3] == 0) {
            return i11;
        }
        int i12 = this.i;
        int i13 = this.j;
        int i14 = i12 + ((iA >> (i13 + 2)) << i13);
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            if (iArr3[i14 + 3] == 0) {
                return i14;
            }
            i14 += 4;
        }
        int i16 = this.m;
        this.m = i16 + 4;
        return i16;
    }

    public final int d() {
        int i = this.g;
        return (i << 3) - i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int r7, int r8, int[] r9) {
        /*
            r6 = this;
            int[] r0 = r6.f
            r1 = 1
            r2 = 0
            switch(r7) {
                case 4: goto L52;
                case 5: goto L44;
                case 6: goto L36;
                case 7: goto L28;
                case 8: goto L1c;
                default: goto L7;
            }
        L7:
            r0 = r2
        L8:
            int r3 = r0 + 1
            r0 = r9[r0]
            int[] r4 = r6.f
            int r5 = r8 + 1
            r8 = r4[r8]
            if (r0 == r8) goto L16
            r1 = r2
            goto L18
        L16:
            if (r3 < r7) goto L19
        L18:
            return r1
        L19:
            r0 = r3
            r8 = r5
            goto L8
        L1c:
            r6 = r9[r2]
            int r7 = r8 + 1
            r8 = r0[r8]
            if (r6 == r8) goto L25
            return r2
        L25:
            r8 = r7
            r6 = r1
            goto L29
        L28:
            r6 = r2
        L29:
            int r7 = r6 + 1
            r6 = r9[r6]
            int r3 = r8 + 1
            r8 = r0[r8]
            if (r6 == r8) goto L34
            return r2
        L34:
            r8 = r3
            goto L37
        L36:
            r7 = r2
        L37:
            int r6 = r7 + 1
            r7 = r9[r7]
            int r3 = r8 + 1
            r8 = r0[r8]
            if (r7 == r8) goto L42
            return r2
        L42:
            r8 = r3
            goto L45
        L44:
            r6 = r2
        L45:
            int r7 = r6 + 1
            r6 = r9[r6]
            int r3 = r8 + 1
            r8 = r0[r8]
            if (r6 == r8) goto L50
            return r2
        L50:
            r8 = r3
            goto L53
        L52:
            r7 = r2
        L53:
            int r6 = r7 + 1
            r3 = r9[r7]
            int r4 = r8 + 1
            r5 = r0[r8]
            if (r3 == r5) goto L5e
            return r2
        L5e:
            int r3 = r7 + 2
            r6 = r9[r6]
            int r5 = r8 + 2
            r4 = r0[r4]
            if (r6 == r4) goto L69
            return r2
        L69:
            int r7 = r7 + 3
            r6 = r9[r3]
            int r8 = r8 + 3
            r3 = r0[r5]
            if (r6 == r3) goto L74
            return r2
        L74:
            r6 = r9[r7]
            r7 = r0[r8]
            if (r6 == r7) goto L7b
            return r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv0.e(int, int, int[]):boolean");
    }

    public final String f(String str, int[] iArr, int i) {
        int iB;
        if (this.o) {
            int[] iArr2 = this.f;
            this.f = Arrays.copyOf(iArr2, iArr2.length);
            String[] strArr = this.l;
            this.l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.o = false;
        }
        if (this.d) {
            str = q37.b.a(str);
        }
        if (i == 1) {
            int i2 = iArr[0] ^ this.c;
            int i3 = i2 + (i2 >>> 16);
            int i4 = i3 ^ (i3 << 3);
            iB = b(i4 + (i4 >>> 12));
            int[] iArr3 = this.f;
            iArr3[iB] = iArr[0];
            iArr3[iB + 3] = 1;
        } else if (i == 2) {
            iB = b(g(iArr[0], iArr[1]));
            int[] iArr4 = this.f;
            iArr4[iB] = iArr[0];
            iArr4[iB + 1] = iArr[1];
            iArr4[iB + 3] = 2;
        } else if (i != 3) {
            int i5 = i(i, iArr);
            iB = b(i5);
            int[] iArr5 = this.f;
            iArr5[iB] = i5;
            int i6 = this.n;
            int i7 = i6 + i;
            if (i7 > iArr5.length) {
                this.f = Arrays.copyOf(this.f, Math.max(i7 - iArr5.length, Math.min(4096, this.g)) + this.f.length);
            }
            System.arraycopy(iArr, 0, this.f, i6, i);
            this.n += i;
            int[] iArr6 = this.f;
            iArr6[iB + 1] = i6;
            iArr6[iB + 3] = i;
        } else {
            iB = b(h(iArr[0], iArr[1], iArr[2]));
            int[] iArr7 = this.f;
            iArr7[iB] = iArr[0];
            iArr7[iB + 1] = iArr[1];
            iArr7[iB + 2] = iArr[2];
            iArr7[iB + 3] = 3;
        }
        this.l[iB >> 2] = str;
        this.k++;
        return str;
    }

    public final int g(int i, int i2) {
        int i3 = i + (i >>> 15);
        int i4 = this.c;
        int i5 = i4 ^ ((i2 * 33) + (i3 ^ (i3 >>> 9)));
        int i6 = i5 + (i5 >>> 16);
        int i7 = i6 ^ (i6 >>> 4);
        return i7 + (i7 << 3);
    }

    public final int h(int i, int i2, int i3) {
        int i4 = this.c ^ i;
        int i5 = (((i4 + (i4 >>> 9)) * 31) + i2) * 33;
        int i6 = (i5 + (i5 >>> 15)) ^ i3;
        int i7 = i6 + (i6 >>> 4);
        int i8 = i7 + (i7 >>> 15);
        return i8 ^ (i8 << 9);
    }

    public final int i(int i, int[] iArr) {
        if (i < 4) {
            throw new IllegalArgumentException();
        }
        int i2 = this.c ^ iArr[0];
        int i3 = i2 + (i2 >>> 9) + iArr[1];
        int i4 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
        int i5 = i4 + (i4 >>> 4);
        for (int i6 = 3; i6 < i; i6++) {
            int i7 = iArr[i6];
            i5 += i7 ^ (i7 >> 21);
        }
        int i8 = i5 * 65599;
        int i9 = i8 + (i8 >>> 19);
        return i9 ^ (i9 << 5);
    }

    public final String j(int i) {
        int i2 = this.c ^ i;
        int i3 = i2 + (i2 >>> 16);
        int i4 = i3 ^ (i3 << 3);
        int iA = a(i4 + (i4 >>> 12));
        int[] iArr = this.f;
        int i5 = iArr[iA + 3];
        if (i5 == 1) {
            if (iArr[iA] == i) {
                return this.l[iA >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this.h + ((iA >> 3) << 2);
        int i7 = iArr[i6 + 3];
        if (i7 == 1) {
            if (iArr[i6] == i) {
                return this.l[i6 >> 2];
            }
        } else if (i7 == 0) {
            return null;
        }
        int i8 = this.i;
        int i9 = this.j;
        int i10 = i8 + ((iA >> (i9 + 2)) << i9);
        int i11 = (1 << i9) + i10;
        while (i10 < i11) {
            int i12 = iArr[i10 + 3];
            if (i == iArr[i10] && 1 == i12) {
                return this.l[i10 >> 2];
            }
            if (i12 == 0) {
                return null;
            }
            i10 += 4;
        }
        for (int iD = d(); iD < this.m; iD += 4) {
            if (i == iArr[iD] && 1 == iArr[iD + 3]) {
                return this.l[iD >> 2];
            }
        }
        return null;
    }

    public final String k(int i, int i2) {
        int iA = a(g(i, i2));
        int[] iArr = this.f;
        int i3 = iArr[iA + 3];
        if (i3 == 2) {
            if (i == iArr[iA] && i2 == iArr[iA + 1]) {
                return this.l[iA >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this.h + ((iA >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 2) {
            if (i == iArr[i4] && i2 == iArr[i4 + 1]) {
                return this.l[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this.i;
        int i7 = this.j;
        int i8 = i6 + ((iA >> (i7 + 2)) << i7);
        int i9 = (1 << i7) + i8;
        while (i8 < i9) {
            int i10 = iArr[i8 + 3];
            if (i == iArr[i8] && i2 == iArr[i8 + 1] && 2 == i10) {
                return this.l[i8 >> 2];
            }
            if (i10 == 0) {
                return null;
            }
            i8 += 4;
        }
        for (int iD = d(); iD < this.m; iD += 4) {
            if (i == iArr[iD] && i2 == iArr[iD + 1] && 2 == iArr[iD + 3]) {
                return this.l[iD >> 2];
            }
        }
        return null;
    }

    public final String l(int i, int i2, int i3) {
        int iA = a(h(i, i2, i3));
        int[] iArr = this.f;
        int i4 = iArr[iA + 3];
        if (i4 == 3) {
            if (i == iArr[iA] && iArr[iA + 1] == i2 && iArr[iA + 2] == i3) {
                return this.l[iA >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.h + ((iA >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 3) {
            if (i == iArr[i5] && iArr[i5 + 1] == i2 && iArr[i5 + 2] == i3) {
                return this.l[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        int i7 = this.i;
        int i8 = this.j;
        int i9 = i7 + ((iA >> (i8 + 2)) << i8);
        int i10 = (1 << i8) + i9;
        while (i9 < i10) {
            int i11 = iArr[i9 + 3];
            if (i == iArr[i9] && i2 == iArr[i9 + 1] && i3 == iArr[i9 + 2] && 3 == i11) {
                return this.l[i9 >> 2];
            }
            if (i11 == 0) {
                return null;
            }
            i9 += 4;
        }
        for (int iD = d(); iD < this.m; iD += 4) {
            if (i == iArr[iD] && i2 == iArr[iD + 1] && i3 == iArr[iD + 2] && 3 == iArr[iD + 3]) {
                return this.l[iD >> 2];
            }
        }
        return null;
    }

    public final String m(int i, int[] iArr) {
        if (i < 4) {
            return i != 1 ? i != 2 ? i != 3 ? "" : l(iArr[0], iArr[1], iArr[2]) : k(iArr[0], iArr[1]) : j(iArr[0]);
        }
        int i2 = i(i, iArr);
        int iA = a(i2);
        int[] iArr2 = this.f;
        int i3 = iArr2[iA + 3];
        if (i2 == iArr2[iA] && i3 == i && e(i, iArr2[iA + 1], iArr)) {
            return this.l[iA >> 2];
        }
        if (i3 == 0) {
            return null;
        }
        int i4 = this.h + ((iA >> 3) << 2);
        int i5 = iArr2[i4 + 3];
        if (i2 == iArr2[i4] && i5 == i && e(i, iArr2[i4 + 1], iArr)) {
            return this.l[i4 >> 2];
        }
        int i6 = this.i;
        int i7 = this.j;
        int i8 = i6 + ((iA >> (i7 + 2)) << i7);
        int[] iArr3 = this.f;
        int i9 = (1 << i7) + i8;
        while (i8 < i9) {
            int i10 = iArr3[i8 + 3];
            if (i2 == iArr3[i8] && i == i10 && e(i, iArr3[i8 + 1], iArr)) {
                return this.l[i8 >> 2];
            }
            if (i10 == 0) {
                return null;
            }
            i8 += 4;
        }
        for (int iD = d(); iD < this.m; iD += 4) {
            if (i2 == iArr3[iD] && i == iArr3[iD + 3] && e(i, iArr3[iD + 1], iArr)) {
                return this.l[iD >> 2];
            }
        }
        return null;
    }

    public final void n(boolean z) {
        this.k = 0;
        this.m = d();
        this.n = this.g << 3;
        if (z) {
            Arrays.fill(this.f, 0);
            Arrays.fill(this.l, (Object) null);
        }
    }

    public final String toString() {
        int i = this.h;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 3; i4 < i; i4 += 4) {
            if (this.f[i4] != 0) {
                i3++;
            }
        }
        int i5 = this.i;
        int i6 = 0;
        for (int i7 = this.h + 3; i7 < i5; i7 += 4) {
            if (this.f[i7] != 0) {
                i6++;
            }
        }
        int i8 = this.i + 3;
        int i9 = this.g + i8;
        int i10 = 0;
        while (i8 < i9) {
            if (this.f[i8] != 0) {
                i10++;
            }
            i8 += 4;
        }
        int iD = (this.m - d()) >> 2;
        int i11 = this.g << 3;
        for (int i12 = 3; i12 < i11; i12 += 4) {
            if (this.f[i12] != 0) {
                i2++;
            }
        }
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", wv0.class.getName(), Integer.valueOf(this.k), Integer.valueOf(this.g), Integer.valueOf(i3), Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(iD), Integer.valueOf(i3 + i6 + i10 + iD), Integer.valueOf(i2));
    }

    public wv0(wv0 wv0Var, boolean z, int i, boolean z2, vv0 vv0Var) {
        this.a = wv0Var;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.b = null;
        this.k = vv0Var.b;
        int i2 = vv0Var.a;
        this.g = i2;
        int i3 = i2 << 2;
        this.h = i3;
        this.i = i3 + (i3 >> 1);
        this.j = vv0Var.c;
        this.f = vv0Var.d;
        this.l = vv0Var.e;
        this.m = vv0Var.f;
        this.n = vv0Var.g;
        this.o = true;
    }
}
