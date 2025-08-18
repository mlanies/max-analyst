package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class tle implements mle {
    public static final String B0 = mle.class.getName();
    public final je7 A0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public volatile CountDownLatch b;
    public final je7 s0;
    public final o45 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public volatile khe y0;
    public final khe z0;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final AtomicLong c = new AtomicLong(0);
    public final CopyOnWriteArraySet o = new CopyOnWriteArraySet();

    public tle(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, o45 o45Var, je7 je7Var5, je7 je7Var6, je7 je7Var7, wle wleVar, je7 je7Var8, hbd hbdVar, je7 je7Var9) {
        this.X = je7Var;
        this.Y = je7Var2;
        this.Z = je7Var3;
        this.s0 = je7Var4;
        this.t0 = o45Var;
        this.u0 = je7Var5;
        this.v0 = je7Var6;
        this.w0 = je7Var7;
        this.x0 = je7Var8;
        this.A0 = je7Var9;
        this.z0 = new khe(new ile(4, je7Var5));
        this.y0 = new khe(new ile(5, je7Var5));
        ((jbd) hbdVar).a(this);
        wleVar.o = this;
    }

    public static void a(tle tleVar, ol olVar) {
        tleVar.getClass();
        String str = B0;
        String name = olVar.getClass().getName();
        long j = olVar.a;
        hm9.m(str, "onTaskSuccess: %s, requestId: %s", name, Long.valueOf(j));
        boolean z = olVar instanceof ht7;
        je7 je7Var = tleVar.v0;
        je7 je7Var2 = tleVar.x0;
        if (z) {
            yle yleVar = (yle) je7Var2.getValue();
            AtomicLong atomicLong = yleVar.Z;
            ((ri4) yleVar.o.getValue()).getClass();
            atomicLong.set(SystemClock.elapsedRealtime());
            r9d.y((s8g) je7Var.getValue());
        }
        if (olVar instanceof hua) {
            ((eoe) tleVar.X.getValue()).d(j);
        }
        if (olVar instanceof jf9) {
            r9d.y((s8g) je7Var.getValue());
        }
        t33 t33Var = ((p7b) ((m7b) tleVar.Y.getValue())).a;
        t33Var.getClass();
        if (t33Var.g.getBoolean("app.forceConnection", false) && olVar.s().V()) {
            hm9.n(str, "onTaskSuccess: set force connection to false after success tam task");
            t33Var.y(false);
        }
        if (olVar.s().V()) {
            ((ri4) tleVar.Z.getValue()).getClass();
            t33Var.l("app.lastSuccessfulRequestTime", Long.valueOf(SystemClock.elapsedRealtime()));
        }
        ((yle) je7Var2.getValue()).h();
    }

    public final long b(ol olVar, lme lmeVar, boolean z) {
        hm9.n(B0, "executeTask: " + olVar.getClass().getName() + " isRetry=" + z);
        ((yle) this.x0.getValue()).f(false);
        if (olVar instanceof ju7) {
            this.b = new CountDownLatch(1);
        }
        ((ExecutorService) this.z0.getValue()).execute(new nd8(this, olVar, z, new bkb(false, this, olVar, lmeVar), lmeVar));
        return olVar.a;
    }

    @Override // defpackage.gbd
    public final void c(int i) {
        if (i == 2) {
            lad ladVar = new lad(((p7b) ((m7b) this.Y.getValue())).a.o(), 0);
            b(ladVar, ladVar, false);
        }
    }

    public final long d(dle dleVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        sle sleVar = (sle) this.a.get(dleVar.getClass().getName());
        if (sleVar == null) {
            return jCurrentTimeMillis;
        }
        n4c.a.getClass();
        float fE = n4c.b.e() * 0.2f;
        return dleVar.P().p(sleVar.a, sleVar.b, fE);
    }

    public final void e(boolean z) {
        x9d x9dVar;
        AtomicLong atomicLong = this.c;
        ((ri4) this.Z.getValue()).getClass();
        atomicLong.set(SystemClock.elapsedRealtime());
        if (z) {
            this.a.clear();
            je7 je7Var = this.x0;
            if (!je7Var.a() || (x9dVar = (x9d) ((yle) je7Var.getValue()).Y.get()) == null) {
                return;
            }
            x9dVar.i.set(0L);
            x9dVar.h.set(0);
            hm9.n(x9dVar.a, "resetConnectionTimeout");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(ol olVar, pke pkeVar) {
        String str = B0;
        yje yjeVar = pkeVar.X;
        String name = olVar.getClass().getName();
        long j = olVar.a;
        hm9.r(str, yjeVar, "onTaskFailed: %s, requestId: %s, error %s", name, Long.valueOf(j), pkeVar);
        String str2 = pkeVar.b;
        if ("proto.ver".equals(str2)) {
            hm9.n(str, "got version error: mark current version as deprecated, close connection");
            x9d x9dVar = (x9d) ((yle) this.x0.getValue()).Y.get();
            if (x9dVar != null) {
                x9dVar.q(false);
            }
            ((av0) this.s0.getValue()).c(new su(5));
        }
        if (olVar instanceof hua) {
            ((eoe) this.X.getValue()).c(j);
            if ("proto.payload".equals(str2)) {
                hua huaVar = (hua) olVar;
                try {
                    huaVar.d();
                } catch (Throwable th) {
                    ((cba) this.t0).c(new HandledException("TaskRunnable: failed to execute onMaxFailCount method for task " + huaVar.getId() + " type " + huaVar.getType(), th), true);
                }
            }
            ((boe) this.w0.getValue()).a();
            r9d.y((s8g) this.v0.getValue());
        }
        if (!(olVar instanceof ju7) || this.b == null) {
            return;
        }
        hm9.k(str, "countDownSyncLogoutLatch");
        this.b.countDown();
    }
}
