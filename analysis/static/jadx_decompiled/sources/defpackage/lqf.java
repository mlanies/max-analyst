package defpackage;

import android.app.Application;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class lqf implements zp {
    public static final /* synthetic */ int n = 0;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final nx3 d;
    public final je7 e;
    public long g;
    public int h;
    public final jvc j;
    public int f = 0;
    public final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    public volatile boolean k = false;
    public volatile boolean l = true;
    public final kqf m = new kqf(this);

    public lqf(Application application, jvc jvcVar, je7 je7Var, je7 je7Var2, je7 je7Var3, nx3 nx3Var, je7 je7Var4) {
        this.j = jvcVar;
        this.a = je7Var;
        this.b = je7Var2;
        this.d = nx3Var;
        this.c = je7Var3;
        this.e = je7Var4;
        application.registerActivityLifecycleCallbacks(new mg0(1, this));
    }

    public final void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.g;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "lqf", "app enter background, time=" + nu0.G(Long.valueOf(System.currentTimeMillis())) + ", interactiveTime=" + jElapsedRealtime, null);
        }
        ((ad) this.b.getValue()).i(jElapsedRealtime, "INTERACTIVE_SESSION");
        this.d.mo20dispatch(hz4.a, new jqf(this, 1));
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((yp) it.next()).a();
        }
    }

    public final void b() {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "lqf", "app enter foreground, time = " + nu0.G(Long.valueOf(System.currentTimeMillis())), null);
        }
        this.g = SystemClock.elapsedRealtime();
        this.d.mo20dispatch(hz4.a, new jqf(this, 2));
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((yp) it.next()).c();
        }
    }

    public final boolean c() {
        return this.k && this.l;
    }
}
