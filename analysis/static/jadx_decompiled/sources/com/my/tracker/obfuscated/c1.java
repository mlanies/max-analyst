package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class c1 {
    private static volatile String a;

    public static String a(Context context) {
        String strJ;
        String str = a;
        if (str != null) {
            return str;
        }
        synchronized (c1.class) {
            try {
                strJ = a;
                if (strJ == null) {
                    strJ = p0.a(context).j();
                    if (TextUtils.isEmpty(strJ)) {
                        strJ = UUID.randomUUID().toString();
                        p0.a(context).k(strJ);
                        a = strJ;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strJ;
    }
}
