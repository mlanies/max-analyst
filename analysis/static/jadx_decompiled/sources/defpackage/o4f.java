package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o4f extends xpa {
    public static final int Y0 = ya7.ALLOW_TRAILING_COMMA.b;
    public static final int Z0 = ya7.ALLOW_NUMERIC_LEADING_ZEROS.b;
    public static final int a1 = ya7.ALLOW_NON_NUMERIC_NUMBERS.b;
    public static final int b1 = ya7.ALLOW_MISSING_VALUES.b;
    public static final int c1 = ya7.ALLOW_SINGLE_QUOTES.b;
    public static final int d1 = ya7.ALLOW_UNQUOTED_FIELD_NAMES.b;
    public static final int e1 = ya7.ALLOW_COMMENTS.b;
    public static final int f1 = ya7.ALLOW_YAML_COMMENTS.b;
    public static final int[] g1 = w42.d;
    public static final int[] h1 = w42.c;
    public final wv0 S0;
    public int[] T0;
    public boolean U0;
    public InputStream V0;
    public byte[] W0;
    public final boolean X0;

    public o4f(wr6 wr6Var, int i, InputStream inputStream, wv0 wv0Var, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(wr6Var, i);
        this.T0 = new int[16];
        this.V0 = inputStream;
        this.S0 = wv0Var;
        this.W0 = bArr;
        this.X = i2;
        this.Y = i3;
        this.t0 = i2 - i4;
        this.Z = (-i2) + i4;
        this.X0 = z;
    }

    public static final int j1(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    public final void A1() throws JsonParseException {
        if (this.X >= this.Y) {
            d1();
        }
        byte[] bArr = this.W0;
        int i = this.X;
        int i2 = i + 1;
        this.X = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            s1(b & 255, i2);
            throw null;
        }
        if (i2 >= this.Y) {
            d1();
        }
        byte[] bArr2 = this.W0;
        int i3 = this.X;
        int i4 = i3 + 1;
        this.X = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            s1(b2 & 255, i4);
            throw null;
        }
        if (i4 >= this.Y) {
            d1();
        }
        byte[] bArr3 = this.W0;
        int i5 = this.X;
        int i6 = i5 + 1;
        this.X = i6;
        byte b3 = bArr3[i5];
        if ((b3 & 192) == 128) {
            return;
        }
        s1(b3 & 255, i6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int B1() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
        L0:
            int r0 = r3.X
            int r1 = r3.Y
            if (r0 < r1) goto L2c
            boolean r0 = r3.c1()
            if (r0 == 0) goto Ld
            goto L2c
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected end-of-input within/between "
            r0.<init>(r1)
            bb7 r1 = r3.w0
            java.lang.String r1 = r1.e()
            r0.append(r1)
            java.lang.String r1 = " entries"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.fasterxml.jackson.core.JsonParseException r1 = new com.fasterxml.jackson.core.JsonParseException
            r1.<init>(r3, r0)
            throw r1
        L2c:
            byte[] r0 = r3.W0
            int r1 = r3.X
            int r2 = r1 + 1
            r3.X = r2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 32
            if (r0 <= r1) goto L55
            r1 = 47
            if (r0 != r1) goto L44
            r3.w1()
            goto L0
        L44:
            r1 = 35
            if (r0 != r1) goto L54
            int r1 = r3.a
            int r2 = defpackage.o4f.f1
            r1 = r1 & r2
            if (r1 != 0) goto L50
            goto L54
        L50:
            r3.x1()
            goto L0
        L54:
            return r0
        L55:
            if (r0 == r1) goto L0
            r1 = 10
            if (r0 != r1) goto L64
            int r0 = r3.s0
            int r0 = r0 + 1
            r3.s0 = r0
            r3.t0 = r2
            goto L0
        L64:
            r1 = 13
            if (r0 != r1) goto L6c
            r3.u1()
            goto L0
        L6c:
            r1 = 9
            if (r0 != r1) goto L71
            goto L0
        L71:
            r3.J0(r0)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o4f.B1():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int C1() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
        L0:
            int r0 = r3.X
            int r1 = r3.Y
            if (r0 < r1) goto L12
            boolean r0 = r3.c1()
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            r3.y0()
            r3 = -1
            return r3
        L12:
            byte[] r0 = r3.W0
            int r1 = r3.X
            int r2 = r1 + 1
            r3.X = r2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 32
            if (r0 <= r1) goto L3b
            r1 = 47
            if (r0 != r1) goto L2a
            r3.w1()
            goto L0
        L2a:
            r1 = 35
            if (r0 != r1) goto L3a
            int r1 = r3.a
            int r2 = defpackage.o4f.f1
            r1 = r1 & r2
            if (r1 != 0) goto L36
            goto L3a
        L36:
            r3.x1()
            goto L0
        L3a:
            return r0
        L3b:
            if (r0 == r1) goto L0
            r1 = 10
            if (r0 != r1) goto L4a
            int r0 = r3.s0
            int r0 = r0 + 1
            r3.s0 = r0
            r3.t0 = r2
            goto L0
        L4a:
            r1 = 13
            if (r0 != r1) goto L52
            r3.u1()
            goto L0
        L52:
            r1 = 9
            if (r0 != r1) goto L57
            goto L0
        L57:
            r3.J0(r0)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o4f.C1():int");
    }

    @Override // defpackage.xpa
    public final void D0() {
        byte[] bArr;
        byte[] bArr2;
        super.D0();
        wv0 wv0Var = this.S0;
        wv0 wv0Var2 = wv0Var.a;
        if (wv0Var2 != null && (!wv0Var.o)) {
            vv0 vv0Var = new vv0(wv0Var);
            AtomicReference atomicReference = wv0Var2.b;
            vv0 vv0Var2 = (vv0) atomicReference.get();
            int i = vv0Var2.b;
            int i2 = vv0Var.b;
            if (i2 != i) {
                if (i2 > 6000) {
                    vv0Var = new vv0(64, 4, new int[512], new String[128], 448, 512);
                }
                while (!atomicReference.compareAndSet(vv0Var2, vv0Var) && atomicReference.get() == vv0Var2) {
                }
            }
            wv0Var.o = true;
        }
        if (!this.X0 || (bArr = this.W0) == null || bArr == (bArr2 = xpa.J0)) {
            return;
        }
        this.W0 = bArr2;
        this.c.a(bArr);
    }

    public final void D1() {
        this.u0 = this.s0;
        this.v0 = this.X - this.t0;
    }

    public final int E1() throws JsonParseException {
        if (this.X >= this.Y && !c1()) {
            return 48;
        }
        byte[] bArr = this.W0;
        int i = this.X;
        int i2 = bArr[i] & 255;
        if (i2 < 48 || i2 > 57) {
            return 48;
        }
        if ((this.a & Z0) == 0) {
            E0("Invalid numeric value: Leading zeroes not allowed");
            throw null;
        }
        this.X = i + 1;
        if (i2 == 48) {
            do {
                if (this.X >= this.Y && !c1()) {
                    break;
                }
                byte[] bArr2 = this.W0;
                int i3 = this.X;
                i2 = bArr2[i3] & 255;
                if (i2 < 48 || i2 > 57) {
                    return 48;
                }
                this.X = i3 + 1;
            } while (i2 == 48);
        }
        return i2;
    }

    public final void F1(int i) throws JsonParseException {
        int i2 = this.X + 1;
        this.X = i2;
        if (i != 9) {
            if (i == 10) {
                this.s0++;
                this.t0 = i2;
            } else if (i == 13) {
                u1();
            } else {
                if (i == 32) {
                    return;
                }
                I0(i, "Expected space separating root-level values");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String G1(int r23, int r24, int[] r25) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o4f.G1(int, int, int[]):java.lang.String");
    }

    public final String H1(int i, int i2) {
        int iJ1 = j1(i, i2);
        String strJ = this.S0.j(iJ1);
        if (strJ != null) {
            return strJ;
        }
        int[] iArr = this.T0;
        iArr[0] = iJ1;
        return G1(1, i2, iArr);
    }

    public final String I1(int i, int i2, int i3) {
        int iJ1 = j1(i2, i3);
        String strK = this.S0.k(i, iJ1);
        if (strK != null) {
            return strK;
        }
        int[] iArr = this.T0;
        iArr[0] = i;
        iArr[1] = iJ1;
        return G1(2, i3, iArr);
    }

    public final String J1(int i, int i2, int i3, int i4) {
        int iJ1 = j1(i3, i4);
        String strL = this.S0.l(i, i2, iJ1);
        if (strL != null) {
            return strL;
        }
        int[] iArr = this.T0;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = j1(iJ1, i4);
        return G1(3, i4, iArr);
    }

    public final String K1(int i, int i2, int i3, int[] iArr) {
        if (i >= iArr.length) {
            iArr = xpa.N0(iArr.length, iArr);
            this.T0 = iArr;
        }
        int i4 = i + 1;
        iArr[i] = j1(i2, i3);
        String strM = this.S0.m(i4, iArr);
        return strM == null ? G1(i4, i3, iArr) : strM;
    }

    public final int L1() throws JsonEOFException {
        if (this.X >= this.Y) {
            d1();
        }
        byte[] bArr = this.W0;
        int i = this.X;
        this.X = i + 1;
        return bArr[i] & 255;
    }

    public final String M1(int i, int i2, int i3, int i4, int[] iArr) throws JsonParseException {
        int i5;
        int i6;
        while (true) {
            if (h1[i3] != 0) {
                if (i3 == 34) {
                    if (i4 > 0) {
                        if (i >= iArr.length) {
                            iArr = xpa.N0(iArr.length, iArr);
                            this.T0 = iArr;
                        }
                        iArr[i] = j1(i2, i4);
                        i = 1 + i;
                    }
                    String strM = this.S0.m(i, iArr);
                    return strM == null ? G1(i, i4, iArr) : strM;
                }
                if (i3 != 92) {
                    K0(i3, "name");
                } else {
                    i3 = T0();
                }
                if (i3 > 127) {
                    int i7 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = xpa.N0(iArr.length, iArr);
                            this.T0 = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i5 = i2 << 8;
                        i6 = (i3 >> 6) | 192;
                    } else {
                        int i8 = (i2 << 8) | (i3 >> 12) | 224;
                        i4++;
                        if (i4 >= 4) {
                            if (i >= iArr.length) {
                                iArr = xpa.N0(iArr.length, iArr);
                                this.T0 = iArr;
                            }
                            iArr[i] = i8;
                            i++;
                            i4 = 0;
                        } else {
                            i7 = i8;
                        }
                        i5 = i7 << 8;
                        i6 = ((i3 >> 6) & 63) | 128;
                    }
                    i2 = i5 | i6;
                    i4++;
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = xpa.N0(iArr.length, iArr);
                    this.T0 = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.X >= this.Y && !c1()) {
                hb7 hb7Var = hb7.NOT_AVAILABLE;
                F0(" in field name");
                throw null;
            }
            byte[] bArr = this.W0;
            int i9 = this.X;
            this.X = i9 + 1;
            i3 = bArr[i9] & 255;
        }
    }

    public final String N1(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.T0;
        iArr[0] = i;
        iArr[1] = i2;
        return M1(2, i3, i4, i5, iArr);
    }

    public final int S0(int i) throws JsonParseException {
        int i2;
        char c;
        int i3 = i & 255;
        if (i3 <= 127) {
            return i3;
        }
        if ((i & 224) == 192) {
            i2 = i & 31;
            c = 1;
        } else if ((i & 240) == 224) {
            i2 = i & 15;
            c = 2;
        } else {
            if ((i & 248) != 240) {
                q1(i & 255);
                throw null;
            }
            i2 = i & 7;
            c = 3;
        }
        int iL1 = L1();
        if ((iL1 & 192) != 128) {
            r1(iL1 & 255);
            throw null;
        }
        int i4 = (i2 << 6) | (iL1 & 63);
        if (c > 1) {
            int iL12 = L1();
            if ((iL12 & 192) != 128) {
                r1(iL12 & 255);
                throw null;
            }
            i4 = (i4 << 6) | (iL12 & 63);
            if (c > 2) {
                int iL13 = L1();
                if ((iL13 & 192) == 128) {
                    return (i4 << 6) | (iL13 & 63);
                }
                r1(iL13 & 255);
                throw null;
            }
        }
        return i4;
    }

    public final char T0() throws JsonParseException {
        if (this.X >= this.Y && !c1()) {
            hb7 hb7Var = hb7.NOT_AVAILABLE;
            F0(" in character escape sequence");
            throw null;
        }
        byte[] bArr = this.W0;
        int i = this.X;
        this.X = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            char cS0 = (char) S0(b);
            z0(cS0);
            return cS0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.X >= this.Y && !c1()) {
                hb7 hb7Var2 = hb7.NOT_AVAILABLE;
                F0(" in character escape sequence");
                throw null;
            }
            byte[] bArr2 = this.W0;
            int i4 = this.X;
            this.X = i4 + 1;
            int i5 = bArr2[i4] & 255;
            int i6 = w42.i[i5];
            if (i6 < 0) {
                I0(i5, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i2 = (i2 << 4) | i6;
        }
        return (char) i2;
    }

    public final int U0(int i) throws JsonParseException {
        if (this.X >= this.Y) {
            d1();
        }
        byte[] bArr = this.W0;
        int i2 = this.X;
        int i3 = i2 + 1;
        this.X = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            return ((i & 31) << 6) | (b & 63);
        }
        s1(b & 255, i3);
        throw null;
    }

    public final int V0(int i) throws JsonParseException {
        if (this.X >= this.Y) {
            d1();
        }
        int i2 = i & 15;
        byte[] bArr = this.W0;
        int i3 = this.X;
        int i4 = i3 + 1;
        this.X = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            s1(b & 255, i4);
            throw null;
        }
        int i5 = (i2 << 6) | (b & 63);
        if (i4 >= this.Y) {
            d1();
        }
        byte[] bArr2 = this.W0;
        int i6 = this.X;
        int i7 = i6 + 1;
        this.X = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) == 128) {
            return (i5 << 6) | (b2 & 63);
        }
        s1(b2 & 255, i7);
        throw null;
    }

    public final int W0(int i) throws JsonParseException {
        int i2 = i & 15;
        byte[] bArr = this.W0;
        int i3 = this.X;
        int i4 = i3 + 1;
        this.X = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            s1(b & 255, i4);
            throw null;
        }
        int i5 = (i2 << 6) | (b & 63);
        int i6 = i3 + 2;
        this.X = i6;
        byte b2 = bArr[i4];
        if ((b2 & 192) == 128) {
            return (i5 << 6) | (b2 & 63);
        }
        s1(b2 & 255, i6);
        throw null;
    }

    public final int X0(int i) throws JsonParseException {
        if (this.X >= this.Y) {
            d1();
        }
        byte[] bArr = this.W0;
        int i2 = this.X;
        int i3 = i2 + 1;
        this.X = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            s1(b & 255, i3);
            throw null;
        }
        int i4 = ((i & 7) << 6) | (b & 63);
        if (i3 >= this.Y) {
            d1();
        }
        byte[] bArr2 = this.W0;
        int i5 = this.X;
        int i6 = i5 + 1;
        this.X = i6;
        byte b2 = bArr2[i5];
        if ((b2 & 192) != 128) {
            s1(b2 & 255, i6);
            throw null;
        }
        int i7 = (i4 << 6) | (b2 & 63);
        if (i6 >= this.Y) {
            d1();
        }
        byte[] bArr3 = this.W0;
        int i8 = this.X;
        int i9 = i8 + 1;
        this.X = i9;
        byte b3 = bArr3[i8];
        if ((b3 & 192) == 128) {
            return ((i7 << 6) | (b3 & 63)) - 65536;
        }
        s1(b3 & 255, i9);
        throw null;
    }

    public final void Y0() throws JsonParseException {
        int i = this.X;
        if (i >= this.Y) {
            d1();
            i = this.X;
        }
        woe woeVar = this.y0;
        char[] cArrM = woeVar.m();
        int iMin = Math.min(this.Y, cArrM.length + i);
        byte[] bArr = this.W0;
        int i2 = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (g1[i3] == 0) {
                i++;
                cArrM[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this.X = i + 1;
                woeVar.g = i2;
                return;
            }
        }
        this.X = i;
        Z0(cArrM, i2);
    }

    public final void Z0(char[] cArr, int i) throws JsonParseException {
        byte[] bArr = this.W0;
        while (true) {
            int i2 = this.X;
            if (i2 >= this.Y) {
                d1();
                i2 = this.X;
            }
            int length = cArr.length;
            int i3 = 0;
            woe woeVar = this.y0;
            if (i >= length) {
                cArr = woeVar.o();
                i = 0;
            }
            int iMin = Math.min(this.Y, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= iMin) {
                    this.X = i2;
                    break;
                }
                int i4 = i2 + 1;
                int iT0 = bArr[i2] & 255;
                int i5 = g1[iT0];
                if (i5 != 0) {
                    this.X = i4;
                    if (iT0 == 34) {
                        woeVar.g = i;
                        return;
                    }
                    if (i5 == 1) {
                        iT0 = T0();
                    } else if (i5 == 2) {
                        iT0 = U0(iT0);
                    } else if (i5 == 3) {
                        iT0 = this.Y - i4 >= 2 ? W0(iT0) : V0(iT0);
                    } else if (i5 == 4) {
                        int iX0 = X0(iT0);
                        int i6 = i + 1;
                        cArr[i] = (char) ((iX0 >> 10) | 55296);
                        if (i6 >= cArr.length) {
                            cArr = woeVar.o();
                            i = 0;
                        } else {
                            i = i6;
                        }
                        iT0 = (iX0 & 1023) | 56320;
                    } else {
                        if (iT0 >= 32) {
                            p1(iT0);
                            throw null;
                        }
                        K0(iT0, "string value");
                    }
                    if (i >= cArr.length) {
                        cArr = woeVar.o();
                    } else {
                        i3 = i;
                    }
                    i = i3 + 1;
                    cArr[i3] = (char) iT0;
                } else {
                    cArr[i] = (char) iT0;
                    i2 = i4;
                    i++;
                }
            }
        }
    }

    public final hb7 a1(int i, boolean z) throws JsonParseException {
        String str;
        if (i == 73) {
            if (this.X >= this.Y && !c1()) {
                G0(hb7.VALUE_NUMBER_FLOAT);
                throw null;
            }
            byte[] bArr = this.W0;
            int i2 = this.X;
            this.X = i2 + 1;
            i = bArr[i2];
            if (i == 78) {
                str = z ? "-INF" : "+INF";
            } else if (i == 110) {
                str = z ? "-Infinity" : "+Infinity";
            }
            g1(3, str);
            if ((this.a & a1) != 0) {
                return Q0(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            throw new JsonParseException(this, zr6.i("Non-standard token '", str, "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"));
        }
        P0(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r13 != 44) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r12.w0.b() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        if (r12.w0.d() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if ((defpackage.o4f.b1 & r2) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r12.X--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        return defpackage.hb7.VALUE_NULL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00df, code lost:
    
        if (r8 != 39) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        r2.g = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e5, code lost:
    
        return defpackage.hb7.VALUE_STRING;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e6, code lost:
    
        r7 = r10[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e8, code lost:
    
        if (r7 == 1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00eb, code lost:
    
        if (r7 == 2) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ee, code lost:
    
        if (r7 == 3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f1, code lost:
    
        if (r7 == 4) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f5, code lost:
    
        if (r8 >= 32) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f7, code lost:
    
        K0(r8, "string value");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fc, code lost:
    
        p1(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ff, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0100, code lost:
    
        r7 = X0(r8);
        r8 = r6 + 1;
        r13[r6] = (char) ((r7 >> 10) | 55296);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0110, code lost:
    
        if (r8 < r13.length) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0112, code lost:
    
        r13 = r2.o();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0118, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0119, code lost:
    
        r7 = (r7 & 1023) | 56320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0123, code lost:
    
        if ((r12.Y - r9) < 2) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0125, code lost:
    
        r7 = W0(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012a, code lost:
    
        r7 = V0(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x012f, code lost:
    
        r7 = U0(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0134, code lost:
    
        r7 = T0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0139, code lost:
    
        if (r6 < r13.length) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x013b, code lost:
    
        r13 = r2.o();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0140, code lost:
    
        r13[r6] = (char) r7;
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hb7 b1(int r13) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o4f.b1(int):hb7");
    }

    public final boolean c1() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this.V0;
        if (inputStream == null || (length = (bArr = this.W0).length) == 0) {
            return false;
        }
        int i = inputStream.read(bArr, 0, length);
        if (i <= 0) {
            v0();
            if (i == 0) {
                throw new IOException(zr6.j(new StringBuilder("InputStream.read() returned 0 characters when trying to read "), this.W0.length, " bytes"));
            }
            return false;
        }
        int i2 = this.Y;
        this.Z += i2;
        this.t0 -= i2;
        this.X = 0;
        this.Y = i;
        return true;
    }

    public final void d1() throws JsonEOFException {
        if (c1()) {
            return;
        }
        F0(" in " + this.b);
        throw null;
    }

    public final void e1() throws JsonParseException {
        int i;
        int i2 = this.X;
        if (i2 + 4 < this.Y) {
            byte[] bArr = this.W0;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 115) {
                        int i6 = i2 + 4;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || i == 93 || i == 125)) {
                            this.X = i6;
                            return;
                        }
                    }
                }
            }
        }
        h1(1, "false");
    }

    public final void f1() throws JsonParseException {
        int i;
        int i2 = this.X;
        if (i2 + 3 < this.Y) {
            byte[] bArr = this.W0;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.X = i5;
                        return;
                    }
                }
            }
        }
        h1(1, "null");
    }

    public final void g1(int i, String str) throws JsonParseException {
        int length = str.length();
        if (this.X + length >= this.Y) {
            h1(i, str);
            return;
        }
        while (this.W0[this.X] == str.charAt(i)) {
            int i2 = this.X + 1;
            this.X = i2;
            i++;
            if (i >= length) {
                int i3 = this.W0[i2] & 255;
                if (i3 < 48 || i3 == 93 || i3 == 125 || !Character.isJavaIdentifierPart((char) S0(i3))) {
                    return;
                }
                t1(str.substring(0, i), L0());
                throw null;
            }
        }
        t1(str.substring(0, i), L0());
        throw null;
    }

    public final void h1(int i, String str) throws JsonParseException {
        int i2;
        int i3;
        int length = str.length();
        do {
            if ((this.X >= this.Y && !c1()) || this.W0[this.X] != str.charAt(i)) {
                t1(str.substring(0, i), L0());
                throw null;
            }
            i2 = this.X + 1;
            this.X = i2;
            i++;
        } while (i < length);
        if ((i2 < this.Y || c1()) && (i3 = this.W0[this.X] & 255) >= 48 && i3 != 93 && i3 != 125 && Character.isJavaIdentifierPart((char) S0(i3))) {
            t1(str.substring(0, i), L0());
            throw null;
        }
    }

    public final void i1() throws JsonParseException {
        int i;
        int i2 = this.X;
        if (i2 + 3 < this.Y) {
            byte[] bArr = this.W0;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i2 + 2;
                if (bArr[i3] == 117) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.X = i5;
                        return;
                    }
                }
            }
        }
        h1(1, "true");
    }

    public final hb7 k1(char[] cArr, int i, int i2, boolean z, int i3) throws JsonParseException {
        boolean z2;
        woe woeVar = this.y0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = woeVar.o();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            int i4 = 0;
            while (true) {
                if (this.X >= this.Y && !c1()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.W0;
                int i5 = this.X;
                this.X = i5 + 1;
                i2 = bArr[i5] & 255;
                if (i2 < 48 || i2 > 57) {
                    break;
                }
                i4++;
                if (i >= cArr.length) {
                    cArr = woeVar.o();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i++;
            }
            z2 = false;
            if (i4 == 0) {
                P0(i2, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            z2 = false;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = woeVar.o();
                i = 0;
            }
            int i6 = i + 1;
            cArr[i] = (char) i2;
            if (this.X >= this.Y) {
                d1();
            }
            byte[] bArr2 = this.W0;
            int i7 = this.X;
            this.X = i7 + 1;
            int i8 = bArr2[i7] & 255;
            if (i8 == 45 || i8 == 43) {
                if (i6 >= cArr.length) {
                    cArr = woeVar.o();
                    i6 = 0;
                }
                int i9 = i6 + 1;
                cArr[i6] = (char) i8;
                if (this.X >= this.Y) {
                    d1();
                }
                byte[] bArr3 = this.W0;
                int i10 = this.X;
                this.X = i10 + 1;
                i8 = bArr3[i10] & 255;
                i6 = i9;
            }
            i2 = i8;
            int i11 = 0;
            while (true) {
                if (i2 >= 48 && i2 <= 57) {
                    i11++;
                    if (i6 >= cArr.length) {
                        cArr = woeVar.o();
                        i6 = 0;
                    }
                    int i12 = i6 + 1;
                    cArr[i6] = (char) i2;
                    if (this.X >= this.Y && !c1()) {
                        z2 = true;
                        i6 = i12;
                        break;
                    }
                    byte[] bArr4 = this.W0;
                    int i13 = this.X;
                    this.X = i13 + 1;
                    i2 = bArr4[i13] & 255;
                    i6 = i12;
                } else {
                    break;
                }
            }
            if (i11 == 0) {
                P0(i2, "Exponent indicator not followed by a digit");
                throw null;
            }
            i = i6;
        }
        if (!z2) {
            this.X--;
            if (this.w0.d()) {
                F1(i2);
            }
        }
        woeVar.g = i;
        this.H0 = z;
        this.I0 = i3;
        this.B0 = 0;
        return hb7.VALUE_NUMBER_FLOAT;
    }

    public final hb7 l1() {
        return !cb7.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.b.a(this.a) ? b1(46) : k1(this.y0.m(), 0, 46, false, 0);
    }

    public final hb7 m1() throws JsonParseException {
        int i;
        int i2;
        woe woeVar = this.y0;
        char[] cArrM = woeVar.m();
        cArrM[0] = '-';
        if (this.X >= this.Y) {
            d1();
        }
        byte[] bArr = this.W0;
        int i3 = this.X;
        this.X = i3 + 1;
        int iE1 = bArr[i3] & 255;
        if (iE1 <= 48) {
            if (iE1 != 48) {
                return a1(iE1, true);
            }
            iE1 = E1();
        } else if (iE1 > 57) {
            return a1(iE1, true);
        }
        cArrM[1] = (char) iE1;
        int i4 = 2;
        int iMin = Math.min(this.Y, (this.X + cArrM.length) - 2);
        int i5 = 1;
        while (true) {
            i = this.X;
            if (i >= iMin) {
                return n1(cArrM, i4, true, i5);
            }
            byte[] bArr2 = this.W0;
            this.X = i + 1;
            i2 = bArr2[i] & 255;
            if (i2 < 48 || i2 > 57) {
                break;
            }
            i5++;
            cArrM[i4] = (char) i2;
            i4++;
        }
        if (i2 == 46 || i2 == 101 || i2 == 69) {
            return k1(cArrM, i4, i2, true, i5);
        }
        this.X = i;
        woeVar.g = i4;
        if (this.w0.d()) {
            F1(i2);
        }
        return R0(i5, true);
    }

    public final hb7 n1(char[] cArr, int i, boolean z, int i2) throws JsonParseException {
        woe woeVar;
        int i3;
        int i4;
        char[] cArrO = cArr;
        int i5 = i;
        int i6 = i2;
        while (true) {
            int i7 = this.X;
            int i8 = this.Y;
            woeVar = this.y0;
            if (i7 >= i8 && !c1()) {
                woeVar.g = i5;
                return R0(i6, z);
            }
            byte[] bArr = this.W0;
            i3 = this.X;
            this.X = i3 + 1;
            i4 = bArr[i3] & 255;
            if (i4 > 57 || i4 < 48) {
                break;
            }
            if (i5 >= cArrO.length) {
                i5 = 0;
                cArrO = woeVar.o();
            }
            cArrO[i5] = (char) i4;
            i6++;
            i5++;
        }
        if (i4 == 46 || i4 == 101 || i4 == 69) {
            return k1(cArrO, i5, i4, z, i6);
        }
        this.X = i3;
        woeVar.g = i5;
        if (this.w0.d()) {
            F1(this.W0[this.X] & 255);
        }
        return R0(i6, z);
    }

    @Override // defpackage.ab7
    public final wa7 o() {
        return new wa7(this.s0, (this.X - this.t0) + 1, this.X + this.Z, -1L, x0());
    }

    public final hb7 o1(int i) throws JsonParseException {
        int i2;
        int i3;
        woe woeVar = this.y0;
        char[] cArrM = woeVar.m();
        if (i == 48) {
            i = E1();
        }
        cArrM[0] = (char) i;
        int i4 = 1;
        int iMin = Math.min(this.Y, (this.X + cArrM.length) - 1);
        int i5 = 1;
        while (true) {
            i2 = this.X;
            if (i2 >= iMin) {
                return n1(cArrM, i4, false, i5);
            }
            byte[] bArr = this.W0;
            this.X = i2 + 1;
            i3 = bArr[i2] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i5++;
            cArrM[i4] = (char) i3;
            i4++;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return k1(cArrM, i4, i3, false, i5);
        }
        this.X = i2;
        woeVar.g = i4;
        if (this.w0.d()) {
            F1(i3);
        }
        return R0(i5, false);
    }

    public final void p1(int i) throws JsonParseException {
        if (i < 32) {
            J0(i);
            throw null;
        }
        q1(i);
        throw null;
    }

    @Override // defpackage.ab7
    public final String q0() throws JsonParseException {
        hb7 hb7Var = this.b;
        hb7 hb7Var2 = hb7.VALUE_STRING;
        woe woeVar = this.y0;
        if (hb7Var != hb7Var2) {
            if (hb7Var == null) {
                return null;
            }
            int i = hb7Var.o;
            return i != 5 ? (i == 6 || i == 7 || i == 8) ? woeVar.g() : hb7Var.a : this.w0.f;
        }
        if (!this.U0) {
            return woeVar.g();
        }
        this.U0 = false;
        int i2 = this.X;
        if (i2 >= this.Y) {
            d1();
            i2 = this.X;
        }
        char[] cArrM = woeVar.m();
        int iMin = Math.min(this.Y, cArrM.length + i2);
        byte[] bArr = this.W0;
        int i3 = 0;
        while (true) {
            if (i2 >= iMin) {
                break;
            }
            int i4 = bArr[i2] & 255;
            if (g1[i4] == 0) {
                i2++;
                cArrM[i3] = (char) i4;
                i3++;
            } else if (i4 == 34) {
                this.X = i2 + 1;
                woeVar.g = i3;
                if (woeVar.f > 0) {
                    return woeVar.g();
                }
                String str = i3 == 0 ? "" : new String((char[]) woeVar.j, 0, i3);
                woeVar.c = str;
                return str;
            }
        }
        this.X = i2;
        Z0(cArrM, i3);
        return woeVar.g();
    }

    public final void q1(int i) throws JsonParseException {
        E0("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
        throw null;
    }

    @Override // defpackage.ab7
    public final char[] r0() throws JsonParseException {
        hb7 hb7Var = this.b;
        if (hb7Var == null) {
            return null;
        }
        int i = hb7Var.o;
        if (i != 5) {
            if (i != 6) {
                if (i != 7 && i != 8) {
                    return hb7Var.b;
                }
            } else if (this.U0) {
                this.U0 = false;
                Y0();
            }
            return this.y0.r();
        }
        if (!this.A0) {
            String str = this.w0.f;
            int length = str.length();
            char[] cArr = this.z0;
            if (cArr == null) {
                wr6 wr6Var = this.c;
                if (wr6Var.h != null) {
                    throw new IllegalStateException("Trying to call same allocXxx() method second time");
                }
                char[] cArrA = wr6Var.d.a(3, length);
                wr6Var.h = cArrA;
                this.z0 = cArrA;
            } else if (cArr.length < length) {
                this.z0 = new char[length];
            }
            str.getChars(0, length, this.z0, 0);
            this.A0 = true;
        }
        return this.z0;
    }

    public final void r1(int i) throws JsonParseException {
        E0("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
        throw null;
    }

    @Override // defpackage.ab7
    public final int s0() throws JsonParseException {
        hb7 hb7Var = this.b;
        if (hb7Var == null) {
            return 0;
        }
        int i = hb7Var.o;
        if (i == 5) {
            return this.w0.f.length();
        }
        if (i != 6) {
            if (i != 7 && i != 8) {
                return hb7Var.b.length;
            }
        } else if (this.U0) {
            this.U0 = false;
            Y0();
        }
        return this.y0.t();
    }

    public final void s1(int i, int i2) throws JsonParseException {
        this.X = i2;
        r1(i);
        throw null;
    }

    @Override // defpackage.ab7
    public final int t0() throws JsonParseException {
        hb7 hb7Var = this.b;
        if (hb7Var == null) {
            return 0;
        }
        int i = hb7Var.o;
        if (i != 6) {
            if (i != 7 && i != 8) {
                return 0;
            }
        } else if (this.U0) {
            this.U0 = false;
            Y0();
        }
        int i2 = this.y0.d;
        if (i2 >= 0) {
            return i2;
        }
        return 0;
    }

    public final void t1(String str, String str2) throws JsonParseException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.X >= this.Y && !c1()) {
                break;
            }
            byte[] bArr = this.W0;
            int i = this.X;
            this.X = i + 1;
            char cS0 = (char) S0(bArr[i]);
            if (!Character.isJavaIdentifierPart(cS0)) {
                break;
            }
            sb.append(cS0);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        throw new JsonParseException(this, "Unrecognized token '" + ((Object) sb) + "': was expecting " + str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01c2, code lost:
    
        if ((defpackage.o4f.Y0 & r13) == 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c4, code lost:
    
        if (r2 == 93) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01c6, code lost:
    
        if (r2 != 125) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01c8, code lost:
    
        if (r2 != 125) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01ca, code lost:
    
        D1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01d3, code lost:
    
        if (r21.w0.c() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01d5, code lost:
    
        r21.w0 = r21.w0.c;
        r0 = defpackage.hb7.END_OBJECT;
        r21.b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01e0, code lost:
    
        H0(']', 125);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01e3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01e4, code lost:
    
        D1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01ed, code lost:
    
        if (r21.w0.b() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01ef, code lost:
    
        r21.w0 = r21.w0.c;
        r0 = defpackage.hb7.END_ARRAY;
        r21.b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01f9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01fa, code lost:
    
        H0('}', 93);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01fd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:?, code lost:
    
        return r0;
     */
    @Override // defpackage.ab7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hb7 u0() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 2162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o4f.u0():hb7");
    }

    public final void u1() {
        if (this.X < this.Y || c1()) {
            byte[] bArr = this.W0;
            int i = this.X;
            if (bArr[i] == 10) {
                this.X = i + 1;
            }
        }
        this.s0++;
        this.t0 = this.X;
    }

    @Override // defpackage.xpa
    public final void v0() throws IOException {
        if (this.V0 != null) {
            if (this.c.c || ya7.AUTO_CLOSE_SOURCE.a(this.a)) {
                this.V0.close();
            }
            this.V0 = null;
        }
    }

    public final int v1(boolean z) throws JsonParseException {
        while (true) {
            if (this.X >= this.Y && !c1()) {
                F0(" within/between " + this.w0.e() + " entries");
                throw null;
            }
            byte[] bArr = this.W0;
            int i = this.X;
            int i2 = i + 1;
            this.X = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    w1();
                } else if (i3 == 35 && (this.a & f1) != 0) {
                    x1();
                } else {
                    if (z) {
                        return i3;
                    }
                    if (i3 != 58) {
                        I0(i3, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z = true;
                }
            } else if (i3 == 32) {
                continue;
            } else if (i3 == 10) {
                this.s0++;
                this.t0 = i2;
            } else if (i3 == 13) {
                u1();
            } else if (i3 != 9) {
                J0(i3);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        F0(" in a comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r9 = this;
            int r0 = r9.a
            int r1 = defpackage.o4f.e1
            r0 = r0 & r1
            r1 = 0
            r2 = 47
            if (r0 == 0) goto La3
            int r0 = r9.X
            int r3 = r9.Y
            java.lang.String r4 = " in a comment"
            if (r0 < r3) goto L1d
            boolean r0 = r9.c1()
            if (r0 == 0) goto L19
            goto L1d
        L19:
            r9.F0(r4)
            throw r1
        L1d:
            byte[] r0 = r9.W0
            int r3 = r9.X
            int r5 = r3 + 1
            r9.X = r5
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L2f
            r9.x1()
            goto L7f
        L2f:
            r3 = 42
            if (r0 != r3) goto L9d
            int[] r5 = defpackage.w42.g
        L35:
            int r0 = r9.X
            int r6 = r9.Y
            if (r0 < r6) goto L41
            boolean r0 = r9.c1()
            if (r0 == 0) goto L6f
        L41:
            byte[] r0 = r9.W0
            int r6 = r9.X
            int r7 = r6 + 1
            r9.X = r7
            r0 = r0[r6]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6 = r5[r0]
            if (r6 == 0) goto L35
            r8 = 2
            if (r6 == r8) goto L99
            r8 = 3
            if (r6 == r8) goto L95
            r8 = 4
            if (r6 == r8) goto L91
            r8 = 10
            if (r6 == r8) goto L88
            r8 = 13
            if (r6 == r8) goto L84
            if (r6 != r3) goto L80
            int r0 = r9.Y
            if (r7 < r0) goto L73
            boolean r0 = r9.c1()
            if (r0 == 0) goto L6f
            goto L73
        L6f:
            r9.F0(r4)
            throw r1
        L73:
            byte[] r0 = r9.W0
            int r6 = r9.X
            r0 = r0[r6]
            if (r0 != r2) goto L35
            int r6 = r6 + 1
            r9.X = r6
        L7f:
            return
        L80:
            r9.p1(r0)
            throw r1
        L84:
            r9.u1()
            goto L35
        L88:
            int r0 = r9.s0
            int r0 = r0 + 1
            r9.s0 = r0
            r9.t0 = r7
            goto L35
        L91:
            r9.A1()
            goto L35
        L95:
            r9.z1()
            goto L35
        L99:
            r9.y1()
            goto L35
        L9d:
            java.lang.String r2 = "was expecting either '*' or '/' for a comment"
            r9.I0(r0, r2)
            throw r1
        La3:
            java.lang.String r0 = "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)"
            r9.I0(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o4f.w1():void");
    }

    public final void x1() throws JsonParseException {
        int[] iArr = w42.g;
        while (true) {
            if (this.X >= this.Y && !c1()) {
                return;
            }
            byte[] bArr = this.W0;
            int i = this.X;
            int i2 = i + 1;
            this.X = i2;
            int i3 = bArr[i] & 255;
            int i4 = iArr[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    y1();
                } else if (i4 == 3) {
                    z1();
                } else if (i4 == 4) {
                    A1();
                } else if (i4 == 10) {
                    this.s0++;
                    this.t0 = i2;
                    return;
                } else if (i4 == 13) {
                    u1();
                    return;
                } else if (i4 != 42 && i4 < 0) {
                    p1(i3);
                    throw null;
                }
            }
        }
    }

    public final void y1() throws JsonParseException {
        if (this.X >= this.Y) {
            d1();
        }
        byte[] bArr = this.W0;
        int i = this.X;
        int i2 = i + 1;
        this.X = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            return;
        }
        s1(b & 255, i2);
        throw null;
    }

    public final void z1() throws JsonParseException {
        if (this.X >= this.Y) {
            d1();
        }
        byte[] bArr = this.W0;
        int i = this.X;
        int i2 = i + 1;
        this.X = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            s1(b & 255, i2);
            throw null;
        }
        if (i2 >= this.Y) {
            d1();
        }
        byte[] bArr2 = this.W0;
        int i3 = this.X;
        int i4 = i3 + 1;
        this.X = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) == 128) {
            return;
        }
        s1(b2 & 255, i4);
        throw null;
    }
}
