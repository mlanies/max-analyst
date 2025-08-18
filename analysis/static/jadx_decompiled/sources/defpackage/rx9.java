package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class rx9 {
    public static final /* synthetic */ bc7[] c = {new hob(rx9.class, "exceptionHandler", "getExceptionHandler()Lru/ok/tamtam/ExceptionHandler;", 0), zr6.e(nec.a, rx9.class, "analytics", "getAnalytics()Lru/ok/tamtam/stats/Analytics;", 0)};
    public static final String d = rx9.class.getName();
    public final rm4 a;
    public final rm4 b;

    public rx9(rm4 rm4Var, rm4 rm4Var2) {
        this.a = rm4Var2;
        this.b = rm4Var;
    }

    public static void a(Map map, vd5 vd5Var) {
        map.put("trid", Long.valueOf(vd5Var.a));
        String str = vd5Var.h;
        if (str != null) {
            map.put("eKey", str);
        }
        Long l = vd5Var.g;
        if (l != null) {
            map.put("ttime", l);
            map.put("dtime", Long.valueOf(vd5Var.j - l.longValue()));
            map.put("fcmdtime", Long.valueOf(vd5Var.i - l.longValue()));
        }
        Long l2 = vd5Var.e;
        if (l2 != null) {
            map.put("suid", l2);
        }
    }

    public final ad b() {
        bc7 bc7Var = c[1];
        return (ad) this.b.get();
    }

    public final o45 c() {
        bc7 bc7Var = c[0];
        return (o45) this.a.get();
    }
}
