package defpackage;

/* loaded from: classes.dex */
public final class s80 implements my9 {
    public static final s80 a = new s80();
    public static final kf5 b = kf5.a("eventTimeMs");
    public static final kf5 c = kf5.a("eventCode");
    public static final kf5 d = kf5.a("eventUptimeMs");
    public static final kf5 e = kf5.a("sourceExtension");
    public static final kf5 f = kf5.a("sourceExtensionJsonProto3");
    public static final kf5 g = kf5.a("timezoneOffsetSeconds");
    public static final kf5 h = kf5.a("networkConnectionInfo");

    @Override // defpackage.m05
    public final void a(Object obj, Object obj2) {
        ny9 ny9Var = (ny9) obj2;
        xa0 xa0Var = (xa0) ((qs7) obj);
        ny9Var.e(b, xa0Var.a);
        ny9Var.a(c, xa0Var.b);
        ny9Var.e(d, xa0Var.c);
        ny9Var.a(e, xa0Var.d);
        ny9Var.a(f, xa0Var.e);
        ny9Var.e(g, xa0Var.f);
        ny9Var.a(h, xa0Var.g);
    }
}
