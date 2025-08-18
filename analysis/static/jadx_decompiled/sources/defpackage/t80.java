package defpackage;

/* loaded from: classes.dex */
public final class t80 implements my9 {
    public static final t80 a = new t80();
    public static final kf5 b = kf5.a("requestTimeMs");
    public static final kf5 c = kf5.a("requestUptimeMs");
    public static final kf5 d = kf5.a("clientInfo");
    public static final kf5 e = kf5.a("logSource");
    public static final kf5 f = kf5.a("logSourceName");
    public static final kf5 g = kf5.a("logEvent");
    public static final kf5 h = kf5.a("qosTier");

    @Override // defpackage.m05
    public final void a(Object obj, Object obj2) {
        ny9 ny9Var = (ny9) obj2;
        ya0 ya0Var = (ya0) ((ws7) obj);
        ny9Var.e(b, ya0Var.a);
        ny9Var.e(c, ya0Var.b);
        ny9Var.a(d, ya0Var.c);
        ny9Var.a(e, ya0Var.d);
        ny9Var.a(f, ya0Var.e);
        ny9Var.a(g, ya0Var.f);
        ny9Var.a(h, ya0Var.g);
    }
}
