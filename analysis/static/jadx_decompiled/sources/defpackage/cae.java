package defpackage;

/* loaded from: classes.dex */
public abstract class cae extends bae {
    public static Double d0(String str) {
        try {
            if (hvc.a.a(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
