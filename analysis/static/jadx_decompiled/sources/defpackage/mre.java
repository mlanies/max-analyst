package defpackage;

import android.util.LruCache;

/* loaded from: classes2.dex */
public final class mre {
    public static final LruCache a = new LruCache(2);

    public static void a(ze0 ze0Var, rre rreVar) {
        if (ze0Var == null) {
            return;
        }
        hm9.n("ThemeBackgroundCache", "Save theme " + ze0Var + " to cache.");
        a.put(ze0Var, rreVar);
    }
}
