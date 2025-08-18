package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class pe3 {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, yq7 yq7Var) {
        configuration.setLocales(yq7Var.a.a);
    }
}
