package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class xq7 {
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static LocaleList b() {
        return LocaleList.getAdjustedDefault();
    }

    public static LocaleList c() {
        return LocaleList.getDefault();
    }
}
