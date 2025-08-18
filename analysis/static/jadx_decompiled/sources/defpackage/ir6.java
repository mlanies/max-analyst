package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public interface ir6 {
    default void a(us7 us7Var, String str, String str2, Object[] objArr, Throwable th) {
        String strConcat;
        String strG = str2 == null ? "" : str2;
        if (str2 != null && objArr != null) {
            try {
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                strConcat = String.format(locale, str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            } catch (Throwable unused) {
                strConcat = str2.concat(ys.j0(objArr, null, 63));
            }
            strG = strConcat;
        }
        if (th != null) {
            strG = au1.g(strG, xxc.m(th));
        }
        if (strG.length() > 0) {
            d(us7Var, str, strG, th);
        }
    }

    boolean c();

    void d(us7 us7Var, String str, String str2, Throwable th);
}
