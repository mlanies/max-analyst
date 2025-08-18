package defpackage;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public abstract class om9 {
    public static final AtomicReference a = new AtomicReference(new HashMap());
    public static final je7 b;
    public static final gaa c;
    public static final khe d;
    public static final khe e;

    static {
        jm9 jm9Var = tu0.l;
        b = (jm9Var != null ? jm9Var : null).a;
        if (jm9Var == null) {
            jm9Var = null;
        }
        c = jm9Var.c;
        d = new khe(new j78(14));
        e = new khe(new j78(15));
    }

    public static final mm9 a(String str, int i, boolean z) {
        sc4 sc4Var;
        while (true) {
            AtomicReference atomicReference = a;
            HashMap map = (HashMap) atomicReference.get();
            HashMap map2 = new HashMap(map);
            mm9 mm9Var = (mm9) map2.get(str);
            if (mm9Var == null) {
                jm9 jm9Var = tu0.l;
                if (jm9Var == null) {
                    jm9Var = null;
                }
                aea aeaVar = jm9Var.b;
                int iS = au1.s(i);
                if (iS == 0) {
                    sc4Var = (sc4) d.getValue();
                } else {
                    if (iS != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sc4Var = (sc4) e.getValue();
                }
                mm9Var = new mm9(aeaVar, sc4Var, (ExecutorService) b.getValue(), str, z);
                map2.put(str, mm9Var);
                mm9Var.d();
                map2.put(str, mm9Var);
            }
            while (!atomicReference.compareAndSet(map, map2)) {
                if (atomicReference.get() != map) {
                    break;
                }
            }
            if (z) {
                boolean z2 = mm9Var.e;
                mm9Var.e = true;
                if (!z2 && mm9Var.e) {
                    mm9Var.d();
                }
            }
            return mm9Var;
        }
    }
}
