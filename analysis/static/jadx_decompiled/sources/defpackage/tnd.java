package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class tnd {
    public static final tnd a = new tnd();
    public static kpa b;

    public static void a() {
        vha vhaVar;
        kpa kpaVar = b;
        if (kpaVar != null && (vhaVar = (vha) kpaVar.b) != null) {
            i50 i50Var = vhaVar.a;
            i50Var.getClass();
            Handler handler = cia.a;
            cia.b((zha) i50Var.s0, yha.o);
        }
        b = null;
    }

    public static void b(dj1 dj1Var, k56 k56Var) {
        kpa kpaVar = b;
        if (kpaVar == null || ((dj1) kpaVar.a).compareTo(dj1Var) <= 0) {
            a();
            vha vhaVar = (vha) k56Var.invoke();
            if (vhaVar != null) {
                b = new kpa(dj1Var, vhaVar);
            }
        }
    }
}
