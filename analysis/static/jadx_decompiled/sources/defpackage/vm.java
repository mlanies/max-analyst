package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class vm {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static yq7 b(Configuration configuration) {
        return yq7.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(yq7 yq7Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(yq7Var.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, yq7 yq7Var) {
        configuration.setLocales(LocaleList.forLanguageTags(yq7Var.a.a.toLanguageTags()));
    }
}
