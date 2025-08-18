package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public abstract class sl {
    public static final Uri a = Uri.parse("https://api.ok.ru");

    public static final Uri a(String str) {
        return Uri.parse("ok://api/api/".concat(str.replace('.', '/')));
    }

    public static final String b(Uri uri) {
        String string = uri.toString();
        if (eae.o0(string, "ok://api/api/", false)) {
            return string.substring(13).replace('/', '.');
        }
        throw new IllegalArgumentException("Unknown uri " + uri);
    }
}
