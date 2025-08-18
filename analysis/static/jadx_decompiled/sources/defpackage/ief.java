package defpackage;

import android.util.LruCache;

/* loaded from: classes2.dex */
public final class ief {
    public static final LruCache a = new LruCache(1000);

    public static gef a(String str) {
        LruCache lruCache = a;
        hef hefVar = (hef) lruCache.get(str);
        if (hefVar == null) {
            return null;
        }
        if (hefVar.b + 3600000 > System.currentTimeMillis()) {
            return hefVar.a;
        }
        lruCache.remove(str);
        return null;
    }
}
