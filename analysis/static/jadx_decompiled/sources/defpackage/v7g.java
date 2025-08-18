package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import androidx.work.impl.model.WorkersQueueDao;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class v7g {
    public static final /* synthetic */ int l = 0;
    public final Context a;
    public final ztc b;
    public final y7d c;
    public final je7 e;
    public volatile zl4 g;
    public volatile boolean h;
    public final tz9 j;
    public final ml0 d = ml0.z(Boolean.TRUE);
    public final Set f = bcd.a0("ru.ok.tamtam.", "ru.ok.messages.");
    public final je7 i = tu0.r(1, new rzd(20, this));
    public volatile int k = 999;

    public v7g(Context context, ztc ztcVar, ztc ztcVar2, khe kheVar, y7d y7dVar) {
        this.a = context;
        this.b = ztcVar2;
        this.c = y7dVar;
        this.e = kheVar;
        this.j = new tz9(new e0a(new ty9(new iz9(new ld5(1, this), 0).r(ztcVar).n(ztcVar), nd2.Y, 1), new gd1(22, this), 3));
        d();
    }

    public static ae3 e(v7g v7gVar, String str, int i, mta mtaVar, boolean z, int i2) {
        if ((i2 & 16) != 0) {
            z = false;
        }
        if (v7gVar.k < v7gVar.f()) {
            hm9.m("v7g", "enqueueUniquePeriodicWork %s", str);
            v7gVar.k++;
            v7gVar.h().b(str, i, mtaVar);
            return new ae3(2, false, false);
        }
        hm9.k0("v7g", null, "enqueueUniquePeriodicWork: put %s in backlog", Arrays.copyOf(new Object[]{str}, 1));
        q8g q8gVar = new q8g(str, i == 2 ? h65.b : h65.a, mtaVar);
        v7gVar.a(q8gVar, z);
        p7g p7gVarH = v7gVar.h();
        qyc qycVar = (qyc) v7gVar.c;
        qycVar.getClass();
        int iQ = (int) qycVar.q(PmsKey.f137wmbacklogworkerbackoffdelaysec, 10);
        if (iQ < 1) {
            iQ = 1;
        }
        xfg.B(p7gVarH, Integer.valueOf(iQ), q8gVar).l();
        return new ae3(2, true, false);
    }

    public final void a(q8g q8gVar, boolean z) {
        if (z || tpa.f(Looper.getMainLooper(), Looper.myLooper())) {
            this.b.b(new fre(this, 21, q8gVar));
        } else {
            try {
                g().insert(q8gVar);
            } catch (Throwable th) {
                hm9.r("v7g", th, "fail to add item %s", q8gVar.b);
            }
        }
    }

    public final mh7 b(String str, h65 h65Var, rla rlaVar, boolean z) {
        if (!z && this.k >= f()) {
            hm9.k0("v7g", null, "beginUniqueWork: put %s in backlog", Arrays.copyOf(new Object[]{str}, 1));
            q8g q8gVar = new q8g(str, h65Var, rlaVar);
            a(q8gVar, false);
            p7g p7gVarH = h();
            qyc qycVar = (qyc) this.c;
            qycVar.getClass();
            int iQ = (int) qycVar.q(PmsKey.f137wmbacklogworkerbackoffdelaysec, 10);
            if (iQ < 1) {
                iQ = 1;
            }
            return new mh7(true, xfg.B(p7gVarH, Integer.valueOf(iQ), q8gVar));
        }
        hm9.m("v7g", "beginUniqueWork %s", str);
        if (z) {
            hm9.k0("v7g", null, "ATTENTION! run NOT LIMITED WORK %s", Arrays.copyOf(new Object[]{str}, 1));
        }
        this.k++;
        p7g p7gVarH2 = h();
        p7gVarH2.getClass();
        List listSingletonList = Collections.singletonList(rlaVar);
        s7g s7gVar = (s7g) p7gVarH2;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new mh7(false, new g7g(s7gVar, str, h65Var, listSingletonList));
    }

    public final void c(String str) {
        hm9.m("v7g", "cancelUniqueWork %s", str);
        s7g s7gVar = (s7g) h();
        s7gVar.getClass();
        s7gVar.d.l(new my1(s7gVar, str, true));
    }

    public final void d() {
        hm9.n("v7g", "enableWorkManager");
        this.d.e(Boolean.TRUE);
        if (this.h) {
            return;
        }
        tz9 tz9Var = this.j;
        qje qjeVar = new qje(4, this);
        c32 c32Var = c32.Z;
        tz9Var.getClass();
        tz9Var.k(new iq1(qjeVar, 2, c32Var));
    }

    public final int f() {
        y7d y7dVar = this.c;
        qyc qycVar = (qyc) y7dVar;
        qycVar.getClass();
        int iQ = (int) qycVar.q(PmsKey.f140wmworkerslimit, 16);
        if (iQ < 1) {
            iQ = 1;
        }
        qyc qycVar2 = (qyc) y7dVar;
        qycVar2.getClass();
        int iQ2 = (int) qycVar2.q(PmsKey.f141wmworkersoffset, 2);
        if (iQ2 < 0) {
            iQ2 = 0;
        }
        int i = iQ - iQ2;
        if (i < 1) {
            return 1;
        }
        return i;
    }

    public final WorkersQueueDao g() {
        return (WorkersQueueDao) this.e.getValue();
    }

    public final p7g h() {
        return (p7g) this.i.getValue();
    }

    public final void i(p7g p7gVar) {
        zl4 zl4Var = this.g;
        if (zl4Var != null) {
            zl4Var.g();
        }
        String strN0 = x53.n0(this.f, " OR ", "(", ")", new w8c(29), 24);
        Cursor cursorQ0 = ((s7g) p7gVar).c.h().getReadableDatabase().q0("SELECT COUNT(*) FROM workspec WHERE " + strN0 + " AND state=0 AND schedule_requested_at<>-1");
        try {
            cursorQ0.moveToFirst();
            Integer numValueOf = cursorQ0.isNull(0) ? null : Integer.valueOf(cursorQ0.getInt(0));
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            v3c.i(cursorQ0, null);
            this.k = iIntValue;
            hm9.m("v7g", "scheduleWorkersCountChecking: workersCount = %d", Integer.valueOf(this.k));
            ztc ztcVar = this.b;
            fre freVar = new fre(this, 20, p7gVar);
            qyc qycVar = (qyc) this.c;
            qycVar.getClass();
            int iQ = (int) qycVar.q(PmsKey.f139wmcheckworkerscountintervalsec, 10);
            if (iQ < 1) {
                iQ = 1;
            }
            this.g = ztcVar.c(freVar, iQ, TimeUnit.SECONDS);
        } finally {
        }
    }
}
