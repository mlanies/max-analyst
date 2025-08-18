package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class uf6 implements auc, e7g, w45 {
    public static final String u0 = a14.O("GreedyScheduler");
    public final qg4 X;
    public boolean Y;
    public final Context a;
    public final s7g b;
    public final adb c;
    public Boolean t0;
    public final HashSet o = new HashSet();
    public final bdb s0 = new bdb(6);
    public final Object Z = new Object();

    public uf6(Context context, me3 me3Var, c8d c8dVar, s7g s7gVar) {
        this.a = context;
        this.b = s7gVar;
        this.c = new adb(c8dVar, this);
        this.X = new qg4(this, me3Var.e);
    }

    @Override // defpackage.e7g
    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l7g l7gVarN = ju0.n((h8g) it.next());
            a14.u().n(u0, "Constraints not met: Cancelling work ID " + l7gVarN);
            yzd yzdVarJ = this.s0.j(l7gVarN);
            if (yzdVarJ != null) {
                s7g s7gVar = this.b;
                s7gVar.d.l(new k8e(s7gVar, yzdVarJ, false));
            }
        }
    }

    @Override // defpackage.w45
    public final void b(l7g l7gVar, boolean z) {
        this.s0.j(l7gVar);
        synchronized (this.Z) {
            try {
                Iterator it = this.o.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    h8g h8gVar = (h8g) it.next();
                    if (ju0.n(h8gVar).equals(l7gVar)) {
                        a14.u().n(u0, "Stopping tracking for " + l7gVar);
                        this.o.remove(h8gVar);
                        this.c.w(this.o);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.auc
    public final boolean c() {
        return false;
    }

    @Override // defpackage.auc
    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.t0;
        s7g s7gVar = this.b;
        if (bool == null) {
            me3 me3Var = s7gVar.b;
            int i = t9b.a;
            this.t0 = Boolean.valueOf(tpa.f(rk.a.a(), this.a.getApplicationInfo().processName));
        }
        boolean zBooleanValue = this.t0.booleanValue();
        String str2 = u0;
        if (!zBooleanValue) {
            a14.u().x(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.Y) {
            s7gVar.f.a(this);
            this.Y = true;
        }
        a14.u().n(str2, "Cancelling work ID " + str);
        qg4 qg4Var = this.X;
        if (qg4Var != null && (runnable = (Runnable) qg4Var.c.remove(str)) != null) {
            ((Handler) qg4Var.b.a).removeCallbacks(runnable);
        }
        Iterator it = this.s0.k(str).iterator();
        while (it.hasNext()) {
            s7gVar.d.l(new k8e(s7gVar, (yzd) it.next(), false));
        }
    }

    @Override // defpackage.auc
    public final void e(h8g... h8gVarArr) {
        boolean zContainsKey;
        boolean zContainsKey2;
        boolean z = false;
        if (this.t0 == null) {
            me3 me3Var = this.b.b;
            int i = t9b.a;
            this.t0 = Boolean.valueOf(tpa.f(rk.a.a(), this.a.getApplicationInfo().processName));
        }
        if (!this.t0.booleanValue()) {
            a14.u().x(u0, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.Y) {
            this.b.f.a(this);
            this.Y = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (h8g h8gVar : h8gVarArr) {
            l7g l7gVarN = ju0.n(h8gVar);
            bdb bdbVar = this.s0;
            synchronized (bdbVar.b) {
                zContainsKey = ((LinkedHashMap) bdbVar.c).containsKey(l7gVarN);
            }
            if (!zContainsKey) {
                long jA = h8gVar.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (h8gVar.b != m7g.a) {
                    continue;
                } else if (jCurrentTimeMillis < jA) {
                    qg4 qg4Var = this.X;
                    if (qg4Var != null) {
                        HashMap map = qg4Var.c;
                        Runnable runnable = (Runnable) map.remove(h8gVar.a);
                        y8 y8Var = qg4Var.b;
                        if (runnable != null) {
                            ((Handler) y8Var.a).removeCallbacks(runnable);
                        }
                        h76 h76Var = new h76(qg4Var, h8gVar, z, 5);
                        map.put(h8gVar.a, h76Var);
                        ((Handler) y8Var.a).postDelayed(h76Var, h8gVar.a() - System.currentTimeMillis());
                    }
                } else if (h8gVar.c()) {
                    if (h8gVar.j.c) {
                        a14.u().n(u0, "Ignoring " + h8gVar + ". Requires device idle.");
                    } else if (!r7.h.isEmpty()) {
                        a14.u().n(u0, "Ignoring " + h8gVar + ". Requires ContentUri triggers.");
                    } else {
                        hashSet.add(h8gVar);
                        hashSet2.add(h8gVar.a);
                    }
                } else {
                    bdb bdbVar2 = this.s0;
                    l7g l7gVarN2 = ju0.n(h8gVar);
                    synchronized (bdbVar2.b) {
                        zContainsKey2 = ((LinkedHashMap) bdbVar2.c).containsKey(l7gVarN2);
                    }
                    if (!zContainsKey2) {
                        a14.u().n(u0, "Starting work for " + h8gVar.a);
                        this.b.h(this.s0.o(ju0.n(h8gVar)), null);
                    }
                }
            }
        }
        synchronized (this.Z) {
            try {
                if (!hashSet.isEmpty()) {
                    a14.u().n(u0, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.o.addAll(hashSet);
                    this.c.w(this.o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.e7g
    public final void f(List list) {
        boolean zContainsKey;
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            l7g l7gVarN = ju0.n((h8g) it.next());
            bdb bdbVar = this.s0;
            synchronized (bdbVar.b) {
                zContainsKey = ((LinkedHashMap) bdbVar.c).containsKey(l7gVarN);
            }
            if (!zContainsKey) {
                a14.u().n(u0, "Constraints met: Scheduling work ID " + l7gVarN);
                this.b.h(bdbVar.o(l7gVarN), null);
            }
        }
    }
}
