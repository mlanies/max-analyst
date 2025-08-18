package defpackage;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class yf {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static final AtomicInteger b = new AtomicInteger(0);
    public static final AtomicInteger c = new AtomicInteger(0);
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final khe e;
    public static final kc f;
    public static final kc g;

    static {
        khe kheVar = new khe(new m(4));
        e = kheVar;
        kc kcVar = new kc(1);
        f = kcVar;
        kc kcVar2 = new kc(2);
        g = kcVar2;
        ((Handler) kheVar.getValue()).post(kcVar);
        ((Handler) kheVar.getValue()).post(kcVar2);
    }

    public static void a(v26 v26Var, int i) {
        int iB = (int) ote.b(v26Var.a * 0.5f, 1.0f);
        woe woeVar = v26Var.b;
        int iE = ote.e(woeVar.g + i, iB, v26Var.a);
        int i2 = woeVar.g;
        if (iE == i2 || iE == i2) {
            return;
        }
        woeVar.g = ote.e(iE, 1, woeVar.f);
        ht0 ht0VarQ = woeVar.q();
        if (ht0VarQ != null) {
            ht0VarQ.a(woeVar.g);
        }
    }
}
