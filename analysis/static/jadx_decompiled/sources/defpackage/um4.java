package defpackage;

/* loaded from: classes.dex */
public abstract class um4 {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (Math.getExponent(d) > 1023) {
            return false;
        }
        if (d != 0.0d) {
            if (!(Math.getExponent(d) <= 1023)) {
                throw new IllegalArgumentException("not a normal value");
            }
            int exponent = Math.getExponent(d);
            long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
            if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L) > Math.getExponent(d)) {
                return false;
            }
        }
        return true;
    }
}
