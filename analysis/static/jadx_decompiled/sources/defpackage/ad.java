package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ad {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public ad(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var3;
        this.b = je7Var;
        this.c = je7Var2;
    }

    public final js7 a() {
        return (js7) this.b.getValue();
    }

    public final void b(String str, Map map) {
        if (a().c()) {
            return;
        }
        e47 e47Var = new e47();
        e47Var.a = System.currentTimeMillis();
        e47Var.c = "PUSH";
        e47Var.o = str;
        e47Var.b(mz7.d0(map));
        j(e47Var.c());
    }

    public final void c(kt7 kt7Var, q33 q33Var, ri4 ri4Var) {
        fs8 fs8Var;
        if (!a().c() && ((xe6) ((ti4) ri4Var).g).a()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            hyc hycVar = (hyc) q33Var;
            long j = hycVar.g.getLong("app.last.firebase_push_time", 0L);
            if (j == 0) {
                hycVar.l("app.last.firebase_push_time", Long.valueOf(jCurrentTimeMillis));
                return;
            }
            if (jCurrentTimeMillis - j < 86400000) {
                return;
            }
            boolean z = false;
            for (f52 f52Var : kt7Var.o) {
                if (f52Var.w0 != 0 && (fs8Var = f52Var.t0) != null) {
                    long j2 = fs8Var.b;
                    if (j2 > j && j2 < jCurrentTimeMillis - (86400000 / 2)) {
                        z = true;
                    }
                }
            }
            if (z) {
                String str = Build.MANUFACTURER;
                if (str == null || str.length() == 0) {
                    str = "UNKNOWN";
                }
                g("FIREBASE_PUSH_SKIPPED", str);
            }
        }
    }

    public final void d(int i, String str) {
        if (a().c()) {
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        us usVar = new us(1);
        usVar.put("value", numValueOf);
        if (oag.t("ACTION") || oag.t(str)) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        if (usVar.c > 10) {
            throw new IllegalArgumentException("params can't be greater than limit = 10");
        }
        j(new ms7(System.currentTimeMillis(), 0L, 0L, "ACTION", str, usVar));
    }

    public final void e(long j, String str, String str2) {
        if (a().c()) {
            return;
        }
        e47 e47Var = new e47();
        e47Var.c = "ACTION";
        e47Var.o = str;
        e47Var.a(Long.valueOf(j), "duration");
        if (str2 != null) {
            e47Var.a(str2, "value");
        }
        j(e47Var.c());
    }

    public final void f(String str) {
        if (a().c()) {
            return;
        }
        if (oag.t("ACTION") || oag.t(str)) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        j(new ms7(System.currentTimeMillis(), 0L, 0L, "ACTION", str, null));
    }

    public final void g(String str, String str2) {
        if (a().c()) {
            return;
        }
        us usVar = new us(1);
        usVar.put("value", str2);
        if (oag.t("ACTION") || oag.t(str)) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        if (usVar.c > 10) {
            throw new IllegalArgumentException("params can't be greater than limit = 10");
        }
        j(new ms7(System.currentTimeMillis(), 0L, 0L, "ACTION", str, usVar));
    }

    public final void h(String str, HashMap map) {
        if (a().c()) {
            return;
        }
        e47 e47Var = new e47();
        e47Var.c = "ACTION";
        e47Var.o = str;
        e47Var.b(map);
        j(e47Var.c());
    }

    public final void i(long j, String str) {
        if (a().c()) {
            return;
        }
        Long lValueOf = Long.valueOf(j);
        us usVar = new us(1);
        usVar.put("duration", lValueOf);
        if (oag.t("ACTION") || oag.t(str)) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        if (usVar.c > 10) {
            throw new IllegalArgumentException("params can't be greater than limit = 10");
        }
        j(new ms7(System.currentTimeMillis(), 0L, 0L, "ACTION", str, usVar));
    }

    public final boolean j(ms7 ms7Var) {
        if (a().c()) {
            return false;
        }
        long j = ms7Var.b;
        if (j == 0) {
            e47 e47Var = new e47();
            e47Var.a = ms7Var.a;
            e47Var.b = j;
            e47Var.c = ms7Var.c;
            e47Var.o = ms7Var.d;
            e47Var.X = ms7Var.f;
            e47Var.b(ms7Var.e);
            e47Var.b = ((hyc) ((q33) this.a.getValue())).t();
            ms7Var = e47Var.c();
        }
        js7 js7VarA = a();
        if (js7VarA.c()) {
            return true;
        }
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "LogController", "store " + ms7Var, null);
        }
        ix ixVar = js7VarA.Z;
        if (((AtomicBoolean) ixVar.k).get()) {
            kld kldVar = (kld) ixVar.j;
            if (((Number) ((yae) kldVar.i()).getValue()).intValue() != 0) {
                kldVar.g(ms7Var);
                return true;
            }
        }
        ((CopyOnWriteArrayList) ixVar.m).add(ms7Var);
        return true;
    }

    public final Object k(ms7 ms7Var, Continuation continuation) {
        Object objF;
        boolean zC = a().c();
        e5f e5fVar = e5f.a;
        return (!zC && j(ms7Var) && (objF = a().f(true, continuation)) == tx3.a) ? objF : e5fVar;
    }

    public final void l(long j, String str) {
        if (a().c() || str.length() == 0) {
            return;
        }
        Long lValueOf = Long.valueOf(j);
        us usVar = new us(1);
        usVar.put("duration", lValueOf);
        if (oag.t("SCREEN") || oag.t(str)) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        if (usVar.c > 10) {
            throw new IllegalArgumentException("params can't be greater than limit = 10");
        }
        j(new ms7(System.currentTimeMillis(), 0L, 0L, "SCREEN", str, usVar));
    }
}
