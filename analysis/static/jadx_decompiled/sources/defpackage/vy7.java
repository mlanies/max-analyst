package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class vy7 {
    public final xke f;
    public final qx7 g;
    public final Map a = Collections.synchronizedMap(new i56(10, 0));
    public final Map b = Collections.synchronizedMap(new i56(10, 0));
    public final Map c = Collections.synchronizedMap(new i56(10, 0));
    public final Map d = Collections.synchronizedMap(new i56(10, 0));
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final boolean h = true;

    public vy7(xke xkeVar, qx7 qx7Var) {
        this.f = xkeVar;
        this.g = qx7Var;
    }

    public static void a() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new RuntimeException("This thread is main!");
        }
    }

    public final sy7 b(Context context, i08 i08Var, boolean z, boolean z2) {
        sy7 sy7Var;
        int iA;
        a();
        Map map = this.a;
        Map map2 = this.c;
        Map map3 = this.b;
        xke xkeVar = this.f;
        if (!z) {
            sy7Var = (sy7) map.get(i08Var);
            int iOrdinal = i08Var.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                throw new IllegalStateException("Wrong marker weight");
            }
            xkeVar.getClass();
            iA = gpc.L;
        } else if (z2) {
            sy7Var = (sy7) map3.get(i08Var);
            int iOrdinal2 = i08Var.ordinal();
            if (iOrdinal2 == 0) {
                xkeVar.getClass();
                iA = xke.a(false, true);
            } else {
                if (iOrdinal2 != 1) {
                    throw new IllegalStateException("Wrong marker weight");
                }
                xkeVar.getClass();
                iA = xke.a(true, true);
            }
        } else {
            sy7Var = (sy7) map2.get(i08Var);
            int iOrdinal3 = i08Var.ordinal();
            if (iOrdinal3 == 0) {
                xkeVar.getClass();
                iA = gpc.K;
            } else {
                if (iOrdinal3 != 1) {
                    throw new IllegalStateException("Wrong marker weight");
                }
                xkeVar.getClass();
                iA = xke.a(true, false);
            }
        }
        if (sy7Var == null) {
            Bitmap bitmapO0 = j47.o0(iA, k7d.h(qp4.u0, xkeVar.a).k, context);
            this.g.getClass();
            sy7Var = new sy7(bitmapO0, qx7.i(bitmapO0));
            if (!z) {
                map.put(i08Var, sy7Var);
            } else if (z2) {
                map3.put(i08Var, sy7Var);
            } else {
                map2.put(i08Var, sy7Var);
            }
        }
        return sy7Var;
    }
}
