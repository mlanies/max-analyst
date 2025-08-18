package defpackage;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public abstract class ha6 extends ta7 {
    public int a;
    public boolean b;
    public jb7 c;

    static {
        int i = sa7.WRITE_NUMBERS_AS_STRINGS.b;
        int i2 = sa7.ESCAPE_NON_ASCII.b;
        int i3 = sa7.STRICT_DUPLICATE_DETECTION.b;
    }

    public final String t0(BigDecimal bigDecimal) {
        if (!sa7.WRITE_BIGDECIMAL_AS_PLAIN.a(this.a)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale >= -9999 && iScale <= 9999) {
            return bigDecimal.toPlainString();
        }
        ta7.d(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        throw null;
    }

    public final boolean u0(sa7 sa7Var) {
        return (this.a & sa7Var.b) != 0;
    }
}
