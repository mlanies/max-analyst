package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class xpa extends ab7 {
    public static final byte[] J0 = new byte[0];
    public static final BigInteger K0;
    public static final BigInteger L0;
    public static final BigInteger M0;
    public static final BigInteger N0;
    public static final BigDecimal O0;
    public static final BigDecimal P0;
    public static final BigDecimal Q0;
    public static final BigDecimal R0;
    public boolean A0;
    public int B0;
    public int C0;
    public long D0;
    public double E0;
    public BigInteger F0;
    public BigDecimal G0;
    public boolean H0;
    public int I0;
    public int X;
    public int Y;
    public long Z;
    public hb7 b;
    public final wr6 c;
    public boolean o;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public bb7 w0;
    public hb7 x0;
    public final woe y0;
    public char[] z0;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        K0 = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        L0 = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        M0 = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        N0 = bigIntegerValueOf4;
        O0 = new BigDecimal(bigIntegerValueOf3);
        P0 = new BigDecimal(bigIntegerValueOf4);
        Q0 = new BigDecimal(bigIntegerValueOf);
        R0 = new BigDecimal(bigIntegerValueOf2);
    }

    public xpa(wr6 wr6Var, int i) {
        this.a = i;
        this.s0 = 1;
        this.u0 = 1;
        this.B0 = 0;
        this.c = wr6Var;
        this.y0 = new woe(wr6Var.d);
        this.w0 = new bb7(null, ya7.STRICT_DUPLICATE_DETECTION.a(i) ? new m5d(8, this) : null, 0, 1, 0);
    }

    public static String A0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    public static String B0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    public static int[] N0(int i, int[] iArr) {
        return iArr == null ? new int[i] : Arrays.copyOf(iArr, iArr.length + i);
    }

    public static final String w0(int i) {
        char c = (char) i;
        if (Character.isISOControl(c)) {
            return wg0.g(i, "(CTRL-CHAR, code ", ")");
        }
        if (i <= 255) {
            return "'" + c + "' (code " + i + ")";
        }
        return "'" + c + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
    }

    public final void C0(int i) throws JsonParseException, InputCoercionException {
        long jC;
        long jC2;
        char[] cArr;
        if (this.o) {
            E0("Internal error: _parseNumericValue called when parser instance closed");
            throw null;
        }
        hb7 hb7Var = this.b;
        hb7 hb7Var2 = hb7.VALUE_NUMBER_INT;
        woe woeVar = this.y0;
        if (hb7Var != hb7Var2) {
            if (hb7Var != hb7.VALUE_NUMBER_FLOAT) {
                throw new JsonParseException(this, "Current token (" + hb7Var + ") not numeric, can not use numeric value accessors");
            }
            try {
                if (i == 16) {
                    this.G0 = woeVar.e();
                    this.B0 = 16;
                    return;
                } else {
                    String strG = woeVar.g();
                    String str = cy9.a;
                    this.E0 = "2.2250738585072012e-308".equals(strG) ? Double.MIN_VALUE : Double.parseDouble(strG);
                    this.B0 = 8;
                    return;
                }
            } catch (NumberFormatException e) {
                throw new JsonParseException("Malformed numeric value (" + B0(woeVar.g()) + ")", o(), e);
            }
        }
        int i2 = this.I0;
        if (i2 <= 9) {
            this.C0 = woeVar.f(this.H0);
            this.B0 = 1;
            return;
        }
        if (i2 <= 18) {
            boolean z = this.H0;
            int i3 = woeVar.d;
            if (i3 < 0 || (cArr = (char[]) woeVar.i) == null) {
                if (z) {
                    jC2 = cy9.c((char[]) woeVar.j, 1, woeVar.g - 1);
                    jC = -jC2;
                } else {
                    jC = cy9.c((char[]) woeVar.j, 0, woeVar.g);
                }
            } else if (z) {
                jC2 = cy9.c(cArr, i3 + 1, woeVar.e - 1);
                jC = -jC2;
            } else {
                jC = cy9.c(cArr, i3, woeVar.e);
            }
            if (i2 == 10) {
                if (this.H0) {
                    if (jC >= -2147483648L) {
                        this.C0 = (int) jC;
                        this.B0 = 1;
                        return;
                    }
                } else if (jC <= 2147483647L) {
                    this.C0 = (int) jC;
                    this.B0 = 1;
                    return;
                }
            }
            this.D0 = jC;
            this.B0 = 2;
            return;
        }
        String strG2 = woeVar.g();
        try {
            int i4 = this.I0;
            char[] cArrR = woeVar.r();
            int i5 = woeVar.d;
            if (i5 < 0) {
                i5 = 0;
            }
            boolean z2 = this.H0;
            if (z2) {
                i5++;
            }
            String str2 = z2 ? cy9.a : cy9.b;
            int length = str2.length();
            if (i4 >= length) {
                if (i4 <= length) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        int iCharAt = cArrR[i5 + i6] - str2.charAt(i6);
                        if (iCharAt == 0) {
                            i6++;
                        } else if (iCharAt < 0) {
                        }
                    }
                }
                if (i != 1 && i != 2) {
                    if (i != 8 && i != 32) {
                        this.F0 = new BigInteger(strG2);
                        this.B0 = 4;
                        return;
                    }
                    String str3 = cy9.a;
                    this.E0 = "2.2250738585072012e-308".equals(strG2) ? Double.MIN_VALUE : Double.parseDouble(strG2);
                    this.B0 = 8;
                    return;
                }
                if (i == 1) {
                    throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", A0(strG2), Integer.MIN_VALUE, Integer.MAX_VALUE));
                }
                O0(strG2);
                throw null;
            }
            this.D0 = Long.parseLong(strG2);
            this.B0 = 2;
        } catch (NumberFormatException e2) {
            throw new JsonParseException("Malformed numeric value (" + B0(strG2) + ")", o(), e2);
        }
    }

    public void D0() {
        char[] cArr;
        woe woeVar = this.y0;
        woeVar.d = -1;
        woeVar.g = 0;
        woeVar.e = 0;
        woeVar.i = null;
        woeVar.k = null;
        if (woeVar.b) {
            woeVar.c();
        }
        mt0 mt0Var = (mt0) woeVar.h;
        if (mt0Var != null && (cArr = (char[]) woeVar.j) != null) {
            woeVar.j = null;
            mt0Var.b.set(2, cArr);
        }
        char[] cArr2 = this.z0;
        if (cArr2 != null) {
            this.z0 = null;
            wr6 wr6Var = this.c;
            char[] cArr3 = wr6Var.h;
            if (cArr2 != cArr3 && cArr2.length < cArr3.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            wr6Var.h = null;
            wr6Var.d.b.set(3, cArr2);
        }
    }

    public final void E0(String str) throws JsonParseException {
        throw new JsonParseException(this, str);
    }

    public final void F0(String str) throws JsonEOFException {
        throw new JsonEOFException(this, wg0.i("Unexpected end-of-input", str));
    }

    public final void G0(hb7 hb7Var) throws JsonEOFException {
        F0(hb7Var != hb7.VALUE_STRING ? (hb7Var == hb7.VALUE_NUMBER_INT || hb7Var == hb7.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value" : " in a String value");
        throw null;
    }

    public final void H0(char c, int i) throws JsonParseException {
        bb7 bb7Var = this.w0;
        E0(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c), bb7Var.e(), new wa7(bb7Var.g, bb7Var.h, -1L, -1L, x0())));
        throw null;
    }

    public final void I0(int i, String str) throws JsonParseException {
        if (i < 0) {
            F0(" in " + this.b);
            throw null;
        }
        String strI = zr6.i("Unexpected character (", w0(i), ")");
        if (str != null) {
            strI = rh4.j(strI, ": ", str);
        }
        E0(strI);
        throw null;
    }

    public final void J0(int i) throws JsonParseException {
        E0("Illegal character (" + w0((char) i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        throw null;
    }

    public final void K0(int i, String str) throws JsonParseException {
        if (!ya7.ALLOW_UNQUOTED_CONTROL_CHARS.a(this.a) || i > 32) {
            E0("Illegal unquoted character (" + w0((char) i) + "): has to be escaped using backslash to be included in " + str);
            throw null;
        }
    }

    public final String L0() {
        return ya7.ALLOW_NON_NUMERIC_NUMBERS.a(this.a) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public final void M0() throws InputCoercionException {
        int i = this.B0;
        if ((i & 2) != 0) {
            long j = this.D0;
            int i2 = (int) j;
            if (i2 != j) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", A0(q0()), Integer.MIN_VALUE, Integer.MAX_VALUE));
            }
            this.C0 = i2;
        } else if ((i & 4) != 0) {
            if (K0.compareTo(this.F0) > 0 || L0.compareTo(this.F0) < 0) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", A0(q0()), Integer.MIN_VALUE, Integer.MAX_VALUE));
            }
            this.C0 = this.F0.intValue();
        } else if ((i & 8) != 0) {
            double d = this.E0;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", A0(q0()), Integer.MIN_VALUE, Integer.MAX_VALUE));
            }
            this.C0 = (int) d;
        } else {
            if ((i & 16) == 0) {
                icf.a();
                throw null;
            }
            if (Q0.compareTo(this.G0) > 0 || R0.compareTo(this.G0) < 0) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", A0(q0()), Integer.MIN_VALUE, Integer.MAX_VALUE));
            }
            this.C0 = this.G0.intValue();
        }
        this.B0 |= 1;
    }

    public final void O0(String str) throws InputCoercionException {
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of long (%d - %s)", A0(str), Long.MIN_VALUE, Long.MAX_VALUE));
    }

    public final void P0(int i, String str) throws JsonParseException {
        E0(zr6.i("Unexpected character (", w0(i), ") in numeric value") + ": " + str);
        throw null;
    }

    public final hb7 Q0(String str, double d) {
        woe woeVar = this.y0;
        woeVar.i = null;
        woeVar.d = -1;
        woeVar.e = 0;
        woeVar.c = str;
        woeVar.k = null;
        if (woeVar.b) {
            woeVar.c();
        }
        woeVar.g = 0;
        this.E0 = d;
        this.B0 = 8;
        return hb7.VALUE_NUMBER_FLOAT;
    }

    public final hb7 R0(int i, boolean z) {
        this.H0 = z;
        this.I0 = i;
        this.B0 = 0;
        return hb7.VALUE_NUMBER_INT;
    }

    @Override // defpackage.ab7
    public final String S() {
        bb7 bb7Var;
        hb7 hb7Var = this.b;
        return ((hb7Var == hb7.START_OBJECT || hb7Var == hb7.START_ARRAY) && (bb7Var = this.w0.c) != null) ? bb7Var.f : this.w0.f;
    }

    @Override // defpackage.ab7
    public final BigDecimal U() throws JsonParseException, InputCoercionException {
        int i = this.B0;
        if ((i & 16) == 0) {
            if (i == 0) {
                C0(16);
            }
            int i2 = this.B0;
            if ((i2 & 16) == 0) {
                if ((i2 & 8) != 0) {
                    String strQ0 = q0();
                    String str = cy9.a;
                    try {
                        this.G0 = new BigDecimal(strQ0);
                    } catch (NumberFormatException unused) {
                        throw new NumberFormatException(zr6.i("Value \"", strQ0, "\" can not be represented as BigDecimal"));
                    }
                } else if ((i2 & 4) != 0) {
                    this.G0 = new BigDecimal(this.F0);
                } else if ((i2 & 2) != 0) {
                    this.G0 = BigDecimal.valueOf(this.D0);
                } else {
                    if ((i2 & 1) == 0) {
                        icf.a();
                        throw null;
                    }
                    this.G0 = BigDecimal.valueOf(this.C0);
                }
                this.B0 |= 16;
            }
        }
        return this.G0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.o) {
            return;
        }
        this.X = Math.max(this.X, this.Y);
        this.o = true;
        try {
            v0();
        } finally {
            D0();
        }
    }

    @Override // defpackage.ab7
    public final double e0() throws JsonParseException, InputCoercionException {
        int i = this.B0;
        if ((i & 8) == 0) {
            if (i == 0) {
                C0(8);
            }
            int i2 = this.B0;
            if ((i2 & 8) == 0) {
                if ((i2 & 16) != 0) {
                    this.E0 = this.G0.doubleValue();
                } else if ((i2 & 4) != 0) {
                    this.E0 = this.F0.doubleValue();
                } else if ((i2 & 2) != 0) {
                    this.E0 = this.D0;
                } else {
                    if ((i2 & 1) == 0) {
                        icf.a();
                        throw null;
                    }
                    this.E0 = this.C0;
                }
                this.B0 |= 8;
            }
        }
        return this.E0;
    }

    @Override // defpackage.ab7
    public final int m() {
        hb7 hb7Var = this.b;
        if (hb7Var == null) {
            return 0;
        }
        return hb7Var.o;
    }

    @Override // defpackage.ab7
    public final int m0() throws JsonParseException, InputCoercionException {
        int i = this.B0;
        if ((i & 1) == 0) {
            if (i == 0) {
                if (this.o) {
                    E0("Internal error: _parseNumericValue called when parser instance closed");
                    throw null;
                }
                if (this.b != hb7.VALUE_NUMBER_INT || this.I0 > 9) {
                    C0(1);
                    if ((this.B0 & 1) == 0) {
                        M0();
                    }
                    return this.C0;
                }
                int iF = this.y0.f(this.H0);
                this.C0 = iF;
                this.B0 = 1;
                return iF;
            }
            if ((i & 1) == 0) {
                M0();
            }
        }
        return this.C0;
    }

    @Override // defpackage.ab7
    public final BigInteger n() throws JsonParseException, InputCoercionException {
        int i = this.B0;
        if ((i & 4) == 0) {
            if (i == 0) {
                C0(4);
            }
            int i2 = this.B0;
            if ((i2 & 4) == 0) {
                if ((i2 & 16) != 0) {
                    this.F0 = this.G0.toBigInteger();
                } else if ((i2 & 2) != 0) {
                    this.F0 = BigInteger.valueOf(this.D0);
                } else if ((i2 & 1) != 0) {
                    this.F0 = BigInteger.valueOf(this.C0);
                } else {
                    if ((i2 & 8) == 0) {
                        icf.a();
                        throw null;
                    }
                    this.F0 = BigDecimal.valueOf(this.E0).toBigInteger();
                }
                this.B0 |= 4;
            }
        }
        return this.F0;
    }

    @Override // defpackage.ab7
    public final long n0() throws JsonParseException, InputCoercionException {
        int i = this.B0;
        if ((i & 2) == 0) {
            if (i == 0) {
                C0(2);
            }
            int i2 = this.B0;
            if ((i2 & 2) == 0) {
                if ((i2 & 1) != 0) {
                    this.D0 = this.C0;
                } else if ((i2 & 4) != 0) {
                    if (M0.compareTo(this.F0) > 0 || N0.compareTo(this.F0) < 0) {
                        O0(q0());
                        throw null;
                    }
                    this.D0 = this.F0.longValue();
                } else if ((i2 & 8) != 0) {
                    double d = this.E0;
                    if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                        O0(q0());
                        throw null;
                    }
                    this.D0 = (long) d;
                } else {
                    if ((i2 & 16) == 0) {
                        icf.a();
                        throw null;
                    }
                    if (O0.compareTo(this.G0) > 0 || P0.compareTo(this.G0) < 0) {
                        O0(q0());
                        throw null;
                    }
                    this.D0 = this.G0.longValue();
                }
                this.B0 |= 2;
            }
        }
        return this.D0;
    }

    @Override // defpackage.ab7
    public final int o0() throws JsonParseException, InputCoercionException {
        if (this.B0 == 0) {
            C0(0);
        }
        if (this.b != hb7.VALUE_NUMBER_INT) {
            return (this.B0 & 16) != 0 ? 6 : 5;
        }
        int i = this.B0;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 2) != 0 ? 2 : 3;
    }

    @Override // defpackage.ab7
    public final Number p0() throws JsonParseException, InputCoercionException {
        if (this.B0 == 0) {
            C0(0);
        }
        if (this.b != hb7.VALUE_NUMBER_INT) {
            int i = this.B0;
            if ((i & 16) != 0) {
                return this.G0;
            }
            if ((i & 8) != 0) {
                return Double.valueOf(this.E0);
            }
            icf.a();
            throw null;
        }
        int i2 = this.B0;
        if ((i2 & 1) != 0) {
            return Integer.valueOf(this.C0);
        }
        if ((i2 & 2) != 0) {
            return Long.valueOf(this.D0);
        }
        if ((i2 & 4) != 0) {
            return this.F0;
        }
        icf.a();
        throw null;
    }

    public abstract void v0();

    public final Object x0() {
        if (ya7.INCLUDE_SOURCE_IN_LOCATION.a(this.a)) {
            return this.c.a;
        }
        return null;
    }

    public final void y0() throws JsonEOFException {
        if (this.w0.d()) {
            return;
        }
        String str = this.w0.b() ? "Array" : "Object";
        bb7 bb7Var = this.w0;
        F0(": expected close marker for " + str + " (start marker at " + new wa7(bb7Var.g, bb7Var.h, -1L, -1L, x0()) + ")");
        throw null;
    }

    public final void z0(char c) throws JsonParseException {
        ya7 ya7Var = ya7.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        int i = this.a;
        if (ya7Var.a(i)) {
            return;
        }
        if (c == '\'' && ya7.ALLOW_SINGLE_QUOTES.a(i)) {
            return;
        }
        E0("Unrecognized character escape " + w0(c));
        throw null;
    }
}
