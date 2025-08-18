package defpackage;

import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public final class b90 implements my9 {
    public static final b90 a = new b90();
    public static final kf5 b = new kf5("projectNumber", au1.o(au1.n(pob.class, new jy(1))));
    public static final kf5 c = new kf5("messageId", au1.o(au1.n(pob.class, new jy(2))));
    public static final kf5 d = new kf5("instanceId", au1.o(au1.n(pob.class, new jy(3))));
    public static final kf5 e = new kf5("messageType", au1.o(au1.n(pob.class, new jy(4))));
    public static final kf5 f = new kf5("sdkPlatform", au1.o(au1.n(pob.class, new jy(5))));
    public static final kf5 g = new kf5("packageName", au1.o(au1.n(pob.class, new jy(6))));
    public static final kf5 h = new kf5("collapseKey", au1.o(au1.n(pob.class, new jy(7))));
    public static final kf5 i = new kf5(LogFactory.PRIORITY_KEY, au1.o(au1.n(pob.class, new jy(8))));
    public static final kf5 j = new kf5("ttl", au1.o(au1.n(pob.class, new jy(9))));
    public static final kf5 k = new kf5("topic", au1.o(au1.n(pob.class, new jy(10))));
    public static final kf5 l = new kf5("bulkId", au1.o(au1.n(pob.class, new jy(11))));
    public static final kf5 m = new kf5("event", au1.o(au1.n(pob.class, new jy(12))));
    public static final kf5 n = new kf5("analyticsLabel", au1.o(au1.n(pob.class, new jy(13))));
    public static final kf5 o = new kf5("campaignId", au1.o(au1.n(pob.class, new jy(14))));
    public static final kf5 p = new kf5("composerLabel", au1.o(au1.n(pob.class, new jy(15))));

    @Override // defpackage.m05
    public final void a(Object obj, Object obj2) {
        z89 z89Var = (z89) obj;
        ny9 ny9Var = (ny9) obj2;
        ny9Var.e(b, z89Var.a);
        ny9Var.a(c, z89Var.b);
        ny9Var.a(d, z89Var.c);
        ny9Var.a(e, z89Var.d);
        ny9Var.a(f, z89Var.e);
        ny9Var.a(g, z89Var.f);
        ny9Var.a(h, z89Var.g);
        ny9Var.d(i, 0);
        ny9Var.d(j, z89Var.h);
        ny9Var.a(k, z89Var.i);
        ny9Var.e(l, 0L);
        ny9Var.a(m, z89Var.j);
        ny9Var.a(n, z89Var.k);
        ny9Var.e(o, 0L);
        ny9Var.a(p, z89Var.l);
    }
}
