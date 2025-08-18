package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class wq7 {
    public static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = a;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String strC = er6.c(er6.a(er6.b(locale)));
                if (!strC.isEmpty()) {
                    return strC.equals(er6.c(er6.a(er6.b(locale2))));
                }
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            if (localeArr[i].equals(locale)) {
                break;
            }
            i++;
        }
        return false;
    }
}
