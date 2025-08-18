package defpackage;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m9g extends ua7 {
    public static final char[] B0 = (char[]) w42.a.clone();
    public char[] A0;
    public final Writer u0;
    public final char v0;
    public char[] w0;
    public int x0;
    public int y0;
    public final int z0;

    public m9g(wr6 wr6Var, int i, Writer writer, char c) {
        super(wr6Var, i);
        this.u0 = writer;
        if (wr6Var.g != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
        char[] cArrA = wr6Var.d.a(1, 0);
        wr6Var.g = cArrA;
        this.w0 = cArrA;
        this.z0 = cArrA.length;
        this.v0 = c;
        if (c != '\"') {
            int[] iArrCopyOf = w42.h;
            if (c != '\"') {
                int[][] iArr = v42.b.a;
                int[] iArr2 = iArr[c];
                if (iArr2 == null) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, 128);
                    if (iArrCopyOf[c] == 0) {
                        iArrCopyOf[c] = -1;
                    }
                    iArr[c] = iArrCopyOf;
                } else {
                    iArrCopyOf = iArr2;
                }
            }
            this.X = iArrCopyOf;
        }
    }

    public final void A0(String str) throws IOException {
        char c;
        jb7 jb7Var = this.c;
        int i = jb7Var.a;
        char c2 = 0;
        if (i == 2) {
            if (jb7Var.g) {
                jb7Var.g = false;
                jb7Var.b++;
                c2 = 2;
            } else {
                c2 = 5;
            }
        } else if (i == 1) {
            int i2 = jb7Var.b;
            jb7Var.b = i2 + 1;
            if (i2 >= 0) {
                c2 = 1;
            }
        } else {
            int i3 = jb7Var.b + 1;
            jb7Var.b = i3;
            if (i3 != 0) {
                c2 = 3;
            }
        }
        if (c2 == 1) {
            c = ',';
        } else {
            if (c2 != 2) {
                if (c2 == 3) {
                    if (this.Z != null) {
                        E0(" ");
                        return;
                    }
                    return;
                } else {
                    if (c2 != 5) {
                        return;
                    }
                    ta7.d("Can not " + str + ", expecting field name (context: " + jb7Var.e() + ")");
                    throw null;
                }
            }
            c = ':';
        }
        if (this.y0 >= this.z0) {
            x0();
        }
        char[] cArr = this.w0;
        int i4 = this.y0;
        this.y0 = i4 + 1;
        cArr[i4] = c;
    }

    public final void B0() throws IOException {
        if (this.y0 + 4 >= this.z0) {
            x0();
        }
        int i = this.y0;
        char[] cArr = this.w0;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.y0 = i + 4;
    }

    public final void C0(String str) throws IOException {
        int i = this.y0;
        int i2 = this.z0;
        if (i >= i2) {
            x0();
        }
        char[] cArr = this.w0;
        int i3 = this.y0;
        this.y0 = i3 + 1;
        char c = this.v0;
        cArr[i3] = c;
        E0(str);
        if (this.y0 >= i2) {
            x0();
        }
        char[] cArr2 = this.w0;
        int i4 = this.y0;
        this.y0 = i4 + 1;
        cArr2[i4] = c;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0(java.lang.String r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9g.D0(java.lang.String):void");
    }

    public final void E0(String str) throws IOException {
        int length = str.length();
        int i = this.y0;
        int i2 = this.z0;
        int i3 = i2 - i;
        if (i3 == 0) {
            x0();
            i3 = i2 - this.y0;
        }
        if (i3 >= length) {
            str.getChars(0, length, this.w0, this.y0);
            this.y0 += length;
            return;
        }
        int i4 = this.y0;
        int i5 = i2 - i4;
        str.getChars(0, i5, this.w0, i4);
        this.y0 += i5;
        x0();
        int length2 = str.length() - i5;
        while (length2 > i2) {
            int i6 = i5 + i2;
            str.getChars(i5, i6, this.w0, 0);
            this.x0 = 0;
            this.y0 = i2;
            x0();
            length2 -= i2;
            i5 = i6;
        }
        str.getChars(i5, i5 + length2, this.w0, 0);
        this.x0 = 0;
        this.y0 = length2;
    }

    @Override // defpackage.ta7
    public final void S(double d) throws IOException {
        if (!this.b) {
            String str = dy9.a;
            if ((!Double.isNaN(d) && !Double.isInfinite(d)) || !u0(sa7.QUOTE_NON_NUMERIC_NUMBERS)) {
                A0("write a number");
                E0(String.valueOf(d));
                return;
            }
        }
        r0(String.valueOf(d));
    }

    @Override // defpackage.ta7
    public final void U(float f) throws IOException {
        if (!this.b) {
            String str = dy9.a;
            if ((!Float.isNaN(f) && !Float.isInfinite(f)) || !u0(sa7.QUOTE_NON_NUMERIC_NUMBERS)) {
                A0("write a number");
                E0(String.valueOf(f));
                return;
            }
        }
        r0(String.valueOf(f));
    }

    @Override // defpackage.ta7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.w0 != null && u0(sa7.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                jb7 jb7Var = this.c;
                if (!jb7Var.b()) {
                    if (!jb7Var.c()) {
                        break;
                    } else {
                        n();
                    }
                } else {
                    m();
                }
            }
        }
        x0();
        this.x0 = 0;
        this.y0 = 0;
        wr6 wr6Var = this.o;
        Writer writer = this.u0;
        if (writer != null) {
            if (wr6Var.c || u0(sa7.AUTO_CLOSE_TARGET)) {
                writer.close();
            } else if (u0(sa7.FLUSH_PASSED_TO_STREAM)) {
                writer.flush();
            }
        }
        char[] cArr = this.w0;
        if (cArr != null) {
            this.w0 = null;
            char[] cArr2 = wr6Var.g;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            wr6Var.g = null;
            wr6Var.d.b.set(1, cArr);
        }
    }

    @Override // defpackage.ta7
    public final void e0(int i) throws IOException {
        A0("write a number");
        boolean z = this.b;
        int i2 = this.z0;
        if (!z) {
            if (this.y0 + 11 >= i2) {
                x0();
            }
            this.y0 = dy9.d(this.w0, i, this.y0);
            return;
        }
        if (this.y0 + 13 >= i2) {
            x0();
        }
        char[] cArr = this.w0;
        int i3 = this.y0;
        int i4 = i3 + 1;
        this.y0 = i4;
        char c = this.v0;
        cArr[i3] = c;
        int iD = dy9.d(cArr, i, i4);
        char[] cArr2 = this.w0;
        this.y0 = iD + 1;
        cArr2[iD] = c;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        x0();
        Writer writer = this.u0;
        if (writer == null || !u0(sa7.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        writer.flush();
    }

    @Override // defpackage.ta7
    public final void g(boolean z) throws IOException {
        int i;
        A0("write a boolean value");
        if (this.y0 + 5 >= this.z0) {
            x0();
        }
        int i2 = this.y0;
        char[] cArr = this.w0;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.y0 = i + 1;
    }

    @Override // defpackage.ta7
    public final void m() throws IOException {
        if (!this.c.b()) {
            ta7.d("Current context not Array but ".concat(this.c.e()));
            throw null;
        }
        if (this.y0 >= this.z0) {
            x0();
        }
        char[] cArr = this.w0;
        int i = this.y0;
        this.y0 = i + 1;
        cArr[i] = ']';
        this.c = this.c.c;
    }

    @Override // defpackage.ta7
    public final void m0(long j) throws IOException {
        A0("write a number");
        boolean z = this.b;
        int i = this.z0;
        if (!z) {
            if (this.y0 + 21 >= i) {
                x0();
            }
            this.y0 = dy9.e(j, this.w0, this.y0);
            return;
        }
        if (this.y0 + 23 >= i) {
            x0();
        }
        char[] cArr = this.w0;
        int i2 = this.y0;
        int i3 = i2 + 1;
        this.y0 = i3;
        char c = this.v0;
        cArr[i2] = c;
        int iE = dy9.e(j, cArr, i3);
        char[] cArr2 = this.w0;
        this.y0 = iE + 1;
        cArr2[iE] = c;
    }

    @Override // defpackage.ta7
    public final void n() throws IOException {
        if (!this.c.c()) {
            ta7.d("Current context not Object but ".concat(this.c.e()));
            throw null;
        }
        if (this.y0 >= this.z0) {
            x0();
        }
        char[] cArr = this.w0;
        int i = this.y0;
        this.y0 = i + 1;
        cArr[i] = '}';
        this.c = this.c.c;
    }

    @Override // defpackage.ta7
    public final void n0(BigDecimal bigDecimal) throws IOException {
        A0("write a number");
        if (bigDecimal == null) {
            B0();
        } else if (this.b) {
            C0(t0(bigDecimal));
        } else {
            E0(t0(bigDecimal));
        }
    }

    @Override // defpackage.ta7
    public final void o(String str) throws IOException {
        char c;
        jb7 jb7Var = this.c;
        if (jb7Var.a != 2 || jb7Var.g) {
            c = 4;
        } else {
            jb7Var.g = true;
            jb7Var.f = str;
            m5d m5dVar = jb7Var.d;
            if (m5dVar != null && m5dVar.F(str)) {
                String strI = zr6.i("Duplicate field '", str, "'");
                boolean z = m5dVar.c instanceof ta7;
                throw new JsonGenerationException(strI, null, null);
            }
            c = jb7Var.b < 0 ? (char) 0 : (char) 1;
        }
        if (c == 4) {
            ta7.d("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z2 = c == 1;
        int i = this.y0 + 1;
        int i2 = this.z0;
        if (i >= i2) {
            x0();
        }
        if (z2) {
            char[] cArr = this.w0;
            int i3 = this.y0;
            this.y0 = i3 + 1;
            cArr[i3] = ',';
        }
        if (this.s0) {
            D0(str);
            return;
        }
        char[] cArr2 = this.w0;
        int i4 = this.y0;
        this.y0 = i4 + 1;
        char c2 = this.v0;
        cArr2[i4] = c2;
        D0(str);
        if (this.y0 >= i2) {
            x0();
        }
        char[] cArr3 = this.w0;
        int i5 = this.y0;
        this.y0 = i5 + 1;
        cArr3[i5] = c2;
    }

    @Override // defpackage.ta7
    public final void o0(BigInteger bigInteger) throws IOException {
        A0("write a number");
        if (bigInteger == null) {
            B0();
        } else if (this.b) {
            C0(bigInteger.toString());
        } else {
            E0(bigInteger.toString());
        }
    }

    @Override // defpackage.ta7
    public final void p0() throws IOException {
        A0("start an array");
        jb7 jb7Var = this.c;
        jb7 jb7Var2 = jb7Var.e;
        m5d m5dVar = null;
        if (jb7Var2 == null) {
            m5d m5dVar2 = jb7Var.d;
            if (m5dVar2 != null) {
                m5dVar = new m5d(8, m5dVar2.c);
            }
            jb7Var2 = new jb7(1, jb7Var, m5dVar);
            jb7Var.e = jb7Var2;
        } else {
            jb7Var2.a = 1;
            jb7Var2.b = -1;
            jb7Var2.f = null;
            jb7Var2.g = false;
            m5d m5dVar3 = jb7Var2.d;
            if (m5dVar3 != null) {
                m5dVar3.b = null;
                m5dVar3.o = null;
                m5dVar3.X = null;
            }
        }
        this.c = jb7Var2;
        if (this.y0 >= this.z0) {
            x0();
        }
        char[] cArr = this.w0;
        int i = this.y0;
        this.y0 = i + 1;
        cArr[i] = '[';
    }

    @Override // defpackage.ta7
    public final void q0() throws IOException {
        A0("start an object");
        jb7 jb7Var = this.c;
        jb7 jb7Var2 = jb7Var.e;
        m5d m5dVar = null;
        if (jb7Var2 == null) {
            m5d m5dVar2 = jb7Var.d;
            if (m5dVar2 != null) {
                m5dVar = new m5d(8, m5dVar2.c);
            }
            jb7Var2 = new jb7(2, jb7Var, m5dVar);
            jb7Var.e = jb7Var2;
        } else {
            jb7Var2.a = 2;
            jb7Var2.b = -1;
            jb7Var2.f = null;
            jb7Var2.g = false;
            m5d m5dVar3 = jb7Var2.d;
            if (m5dVar3 != null) {
                m5dVar3.b = null;
                m5dVar3.o = null;
                m5dVar3.X = null;
            }
        }
        this.c = jb7Var2;
        if (this.y0 >= this.z0) {
            x0();
        }
        char[] cArr = this.w0;
        int i = this.y0;
        this.y0 = i + 1;
        cArr[i] = '{';
    }

    @Override // defpackage.ta7
    public final void r0(String str) throws IOException {
        A0("write a string");
        if (str == null) {
            B0();
            return;
        }
        int i = this.y0;
        int i2 = this.z0;
        if (i >= i2) {
            x0();
        }
        char[] cArr = this.w0;
        int i3 = this.y0;
        this.y0 = i3 + 1;
        char c = this.v0;
        cArr[i3] = c;
        D0(str);
        if (this.y0 >= i2) {
            x0();
        }
        char[] cArr2 = this.w0;
        int i4 = this.y0;
        this.y0 = i4 + 1;
        cArr2[i4] = c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[PHI: r11
      0x0045: PHI (r11v6 int) = (r11v3 int), (r11v7 int) binds: [B:15:0x0041, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ta7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(char[] r17, int r18, int r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9g.s0(char[], int, int):void");
    }

    public final char[] v0() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.A0 = cArr;
        return cArr;
    }

    public final void w0(char c, int i) throws IOException {
        int i2;
        int i3 = this.z0;
        if (i >= 0) {
            if (this.y0 + 2 > i3) {
                x0();
            }
            char[] cArr = this.w0;
            int i4 = this.y0;
            int i5 = i4 + 1;
            this.y0 = i5;
            cArr[i4] = '\\';
            this.y0 = i4 + 2;
            cArr[i5] = (char) i;
            return;
        }
        if (i == -2) {
            throw null;
        }
        if (this.y0 + 5 >= i3) {
            x0();
        }
        int i6 = this.y0;
        char[] cArr2 = this.w0;
        cArr2[i6] = '\\';
        int i7 = i6 + 2;
        cArr2[i6 + 1] = 'u';
        char[] cArr3 = B0;
        if (c > 255) {
            int i8 = c >> '\b';
            int i9 = i6 + 3;
            cArr2[i7] = cArr3[(i8 & 255) >> 4];
            i2 = i6 + 4;
            cArr2[i9] = cArr3[i8 & 15];
            c = (char) (c & 255);
        } else {
            int i10 = i6 + 3;
            cArr2[i7] = '0';
            i2 = i6 + 4;
            cArr2[i10] = '0';
        }
        cArr2[i2] = cArr3[c >> 4];
        cArr2[i2 + 1] = cArr3[c & 15];
        this.y0 = i2 + 2;
    }

    public final void x0() throws IOException {
        int i = this.y0;
        int i2 = this.x0;
        int i3 = i - i2;
        if (i3 > 0) {
            this.x0 = 0;
            this.y0 = 0;
            this.u0.write(this.w0, i2, i3);
        }
    }

    public final int y0(char[] cArr, int i, int i2, char c, int i3) throws IOException {
        int i4;
        Writer writer = this.u0;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = '\\';
                cArr[i - 1] = (char) i3;
                return i5;
            }
            char[] cArrV0 = this.A0;
            if (cArrV0 == null) {
                cArrV0 = v0();
            }
            cArrV0[1] = (char) i3;
            writer.write(cArrV0, 0, 2);
            return i;
        }
        if (i3 == -2) {
            throw null;
        }
        char[] cArr2 = B0;
        if (i <= 5 || i >= i2) {
            char[] cArrV02 = this.A0;
            if (cArrV02 == null) {
                cArrV02 = v0();
            }
            this.x0 = this.y0;
            if (c <= 255) {
                cArrV02[6] = cArr2[c >> 4];
                cArrV02[7] = cArr2[c & 15];
                writer.write(cArrV02, 2, 6);
                return i;
            }
            int i6 = c >> '\b';
            cArrV02[10] = cArr2[(i6 & 255) >> 4];
            cArrV02[11] = cArr2[i6 & 15];
            cArrV02[12] = cArr2[(c & 255) >> 4];
            cArrV02[13] = cArr2[c & 15];
            writer.write(cArrV02, 8, 6);
            return i;
        }
        cArr[i - 6] = '\\';
        int i7 = i - 4;
        cArr[i - 5] = 'u';
        if (c > 255) {
            int i8 = c >> '\b';
            int i9 = i - 3;
            cArr[i7] = cArr2[(i8 & 255) >> 4];
            i4 = i - 2;
            cArr[i9] = cArr2[i8 & 15];
            c = (char) (c & 255);
        } else {
            int i10 = i - 3;
            cArr[i7] = '0';
            i4 = i - 2;
            cArr[i10] = '0';
        }
        cArr[i4] = cArr2[c >> 4];
        cArr[i4 + 1] = cArr2[c & 15];
        return i4 - 4;
    }

    public final void z0(char c, int i) throws IOException {
        int i2;
        Writer writer = this.u0;
        if (i >= 0) {
            int i3 = this.y0;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.x0 = i4;
                char[] cArr = this.w0;
                cArr[i4] = '\\';
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArrV0 = this.A0;
            if (cArrV0 == null) {
                cArrV0 = v0();
            }
            this.x0 = this.y0;
            cArrV0[1] = (char) i;
            writer.write(cArrV0, 0, 2);
            return;
        }
        if (i == -2) {
            throw null;
        }
        int i5 = this.y0;
        char[] cArr2 = B0;
        if (i5 < 6) {
            char[] cArrV02 = this.A0;
            if (cArrV02 == null) {
                cArrV02 = v0();
            }
            this.x0 = this.y0;
            if (c <= 255) {
                cArrV02[6] = cArr2[c >> 4];
                cArrV02[7] = cArr2[c & 15];
                writer.write(cArrV02, 2, 6);
                return;
            } else {
                int i6 = c >> '\b';
                cArrV02[10] = cArr2[(i6 & 255) >> 4];
                cArrV02[11] = cArr2[i6 & 15];
                cArrV02[12] = cArr2[(c & 255) >> 4];
                cArrV02[13] = cArr2[c & 15];
                writer.write(cArrV02, 8, 6);
                return;
            }
        }
        char[] cArr3 = this.w0;
        int i7 = i5 - 6;
        this.x0 = i7;
        cArr3[i7] = '\\';
        cArr3[i5 - 5] = 'u';
        if (c > 255) {
            int i8 = c >> '\b';
            cArr3[i5 - 4] = cArr2[(i8 & 255) >> 4];
            i2 = i5 - 3;
            cArr3[i2] = cArr2[i8 & 15];
            c = (char) (c & 255);
        } else {
            cArr3[i5 - 4] = '0';
            i2 = i5 - 3;
            cArr3[i2] = '0';
        }
        cArr3[i2 + 1] = cArr2[c >> 4];
        cArr3[i2 + 2] = cArr2[c & 15];
    }
}
