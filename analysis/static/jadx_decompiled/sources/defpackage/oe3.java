package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class oe3 {
    public static final int c;
    public static final int d;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public Configuration b;

    static {
        int i = Build.VERSION.SDK_INT;
        c = i >= 31 ? 268451204 : 15748;
        d = i >= 31 ? 1342177280 : 1073741824;
    }

    public oe3(Context context) {
        this.b = new Configuration(context.getResources().getConfiguration());
        context.registerComponentCallbacks(new fd2(this, context));
    }

    public final void a(int i, ne3 ne3Var) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = this.a;
        Integer numValueOf = Integer.valueOf(i);
        Object hashSet = concurrentHashMap.get(numValueOf);
        if (hashSet == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (hashSet = new HashSet()))) != null) {
            hashSet = objPutIfAbsent;
        }
        ((Set) hashSet).add(ne3Var);
    }
}
