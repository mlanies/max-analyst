package defpackage;

import android.app.LocaleManager;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class pm {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
