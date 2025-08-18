package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class af7 {
    public static String a(Date date) {
        String str;
        synchronized (ay7.v) {
            if (ay7.u == null) {
                ay7.u = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH);
            }
            str = ay7.u.format(date);
        }
        return str;
    }
}
