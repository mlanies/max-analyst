package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class rr3 {
    public final av0 a;
    public final ztc b;
    public final el3 c;
    public final oq3 d;
    public final b0d e;
    public final ztc h;
    public final xpb i;
    public volatile List f = Collections.emptyList();
    public volatile List g = Collections.emptyList();
    public final HashSet j = new HashSet();
    public volatile String k = "";
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final AtomicBoolean n = new AtomicBoolean(true);

    public rr3(o45 o45Var, av0 av0Var, ztc ztcVar, ztc ztcVar2, el3 el3Var, oq3 oq3Var, b0d b0dVar) {
        this.a = av0Var;
        this.b = ztcVar;
        this.c = el3Var;
        this.d = oq3Var;
        this.e = b0dVar;
        this.h = ztcVar2;
        xpb xpbVar = new xpb();
        this.i = xpbVar;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ztc ztcVarA = muc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(ztcVarA, "scheduler is null");
        new o1a(xpbVar, 1L, timeUnit, ztcVarA, false).n(ztcVar2).a(new sd7(new v02(23, this), new v02(24, o45Var), ft.d));
        a();
    }

    public final void a() {
        if (this.l.get()) {
            this.i.e(0);
            return;
        }
        String str = this.k;
        if (!oag.d(this.k, str)) {
            this.n.set(true);
        }
        this.k = str;
        cqc.a(new e5(5, this), this.h, null, new un0(29), null);
        this.l.set(true);
    }

    public final void b() {
        hm9.n("rr3", "updateDataWorker: start");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.c.b();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        List listK = this.c.k();
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        if (oag.t(this.k)) {
            oq3 oq3Var = this.d;
            oq3Var.getClass();
            Collections.sort(listK, new ca3(2, oq3Var));
            hm9.m("rr3", "updateDataWorker: update %d contacts. fetchTime=%dms, sortTime=%dms", Integer.valueOf(listK.size()), Long.valueOf(jCurrentTimeMillis4 - jCurrentTimeMillis3), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis4));
            this.f = listK;
        } else if (this.n.compareAndSet(true, false)) {
            String str = this.k;
            b0d b0dVar = this.e;
            if (!oag.t(str)) {
                if ((listK instanceof Collection) && listK.isEmpty()) {
                    listK = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listK) {
                        try {
                            if (b0dVar.g((uj3) obj, str)) {
                                arrayList.add(obj);
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    listK = arrayList;
                }
            }
            this.d.b(listK);
            this.g = listK;
        }
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        hm9.m("rr3", "updateDataWorker: done. awaitLoading=%dms, update=%dms, total=%dms", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis2), Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis));
        this.m.set(true);
        this.b.b(new cu1(20, this));
    }

    @uae
    public void onEvent(ut7 ut7Var) {
        a();
    }

    @uae
    public void onEvent(ps3 ps3Var) {
        this.n.set(true);
        a();
    }

    @uae
    public void onEvent(c6f c6fVar) {
        a();
    }
}
