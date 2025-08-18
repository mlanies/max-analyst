package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class iu6 {
    public final p7b a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public iu6(p7b p7bVar, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = p7bVar;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
    }

    public static String a(Uri uri) {
        if (!uri.isHierarchical()) {
            return uri.toString();
        }
        String queryParameter = uri.getQueryParameter("bid");
        String queryParameter2 = uri.getQueryParameter("t");
        return (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) ? uri.toString() : rh4.k("ok-image-cache:bid=", queryParameter, "&t=", queryParameter2);
    }
}
