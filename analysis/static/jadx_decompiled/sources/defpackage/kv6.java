package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.Set;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class kv6 {
    public final m84 a;
    public final oz7 b;
    public final o84 c;
    public final Context d;
    public final bp4 e;
    public final cl4 f;
    public final la4 g;
    public final o55 h;
    public final pq9 i;
    public final nde j;
    public final uk4 k;
    public final qq9 l;
    public final mr0 m;
    public final m5b n;
    public final ey1 o;
    public final Set p;
    public final wz4 q;
    public final wz4 r;
    public final boolean s;
    public final uk4 t;
    public final va8 u;
    public final ho9 v;
    public final boolean w;
    public final yxc x;
    public final nd2 y;

    public kv6(jv6 jv6Var) {
        pq9 pq9Var;
        f46.I();
        jn jnVar = jv6Var.k;
        jnVar.getClass();
        ho9 ho9Var = new ho9();
        jnVar.getClass();
        ho9Var.a = jnVar.b;
        ho9Var.b = new b46();
        ho9Var.c = (x24) jnVar.c;
        ho9Var.d = (oq0) jnVar.o;
        this.v = ho9Var;
        Object systemService = jv6Var.b.getSystemService("activity");
        if (systemService == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.a = new m84((ActivityManager) systemService);
        this.b = new oz7();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        o84 o84Var = jv6Var.a;
        this.c = o84Var == null ? o84.g() : o84Var;
        Context context = jv6Var.b;
        if (context == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.d = context;
        this.e = jv6Var.c;
        this.g = new la4();
        synchronized (pq9.class) {
            try {
                if (pq9.a == null) {
                    pq9.a = new pq9();
                }
                pq9Var = pq9.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = pq9Var;
        this.j = fp3.d;
        uk4 uk4Var = jv6Var.e;
        if (uk4Var == null) {
            Context context2 = jv6Var.b;
            f46.I();
            uk4Var = new uk4(new tk4(context2));
        }
        this.k = uk4Var;
        this.l = qq9.j();
        f46.I();
        mr0 mr0Var = jv6Var.f;
        this.m = mr0Var == null ? new zq6() : mr0Var;
        m5b m5bVar = jv6Var.g;
        m5bVar = m5bVar == null ? new m5b(new bg7(new h7b(29, false))) : m5bVar;
        this.n = m5bVar;
        this.o = new ey1(28);
        Set set = jv6Var.h;
        this.p = set == null ? wz4.a : set;
        wz4 wz4Var = wz4.a;
        this.q = wz4Var;
        this.r = wz4Var;
        this.s = true;
        uk4 uk4Var2 = jv6Var.i;
        this.t = uk4Var2 != null ? uk4Var2 : uk4Var;
        this.u = jv6Var.j;
        int i = ((n5b) m5bVar.a.d).d;
        o55 o55Var = jv6Var.d;
        o55 o55Var2 = o55Var;
        if (o55Var == null) {
            jc6 jc6Var = new jc6();
            jc6Var.a = Executors.newFixedThreadPool(2, new cm9("FrescoIoBoundExecutor", 1));
            jc6Var.b = Executors.newFixedThreadPool(i, new cm9("FrescoDecodeExecutor", 1));
            jc6Var.c = Executors.newFixedThreadPool(i, new cm9("FrescoBackgroundExecutor", 1));
            jc6Var.o = Executors.newFixedThreadPool(1, new cm9("FrescoLightWeightBackgroundExecutor", 1));
            jc6Var.X = Executors.newScheduledThreadPool(i, new cm9("FrescoBackgroundExecutor", 1));
            o55Var2 = jc6Var;
        }
        this.h = o55Var2;
        this.w = true;
        this.x = jv6Var.l;
        this.y = new nd2(9);
        o84 o84Var2 = new o84(10);
        ey1 ey1Var = new ey1(13);
        ey1Var.b = o84Var2;
        this.f = new cl4(ey1Var, this);
        f46.I();
    }
}
