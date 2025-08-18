package one.me.sdk.tasks;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.aoe;
import defpackage.b2a;
import defpackage.c37;
import defpackage.dm7;
import defpackage.eoe;
import defpackage.f0a;
import defpackage.fm7;
import defpackage.hle;
import defpackage.hm9;
import defpackage.hyc;
import defpackage.j47;
import defpackage.jle;
import defpackage.lp0;
import defpackage.q33;
import defpackage.q45;
import defpackage.r9d;
import defpackage.s8g;
import defpackage.ty9;
import defpackage.w8c;
import defpackage.x53;
import defpackage.xpb;
import defpackage.ztc;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"one/me/sdk/tasks/TaskMonitor$TaskMonitorWorker", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Leoe;", "taskRepository", "Lhle;", "schedulers", "Ls8g;", "workerService", "Lq33;", "clientPrefs", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Leoe;Lhle;Ls8g;Lq33;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TaskMonitor$TaskMonitorWorker extends Worker {
    public final q33 X;
    public final lp0 Y;
    public final eoe b;
    public final hle c;
    public final s8g o;

    public TaskMonitor$TaskMonitorWorker(Context context, WorkerParameters workerParameters, eoe eoeVar, hle hleVar, s8g s8gVar, q33 q33Var) {
        super(context, workerParameters);
        this.b = eoeVar;
        this.c = hleVar;
        this.o = s8gVar;
        this.X = q33Var;
        this.Y = new lp0(1);
    }

    @Override // androidx.work.Worker
    public final fm7 b() {
        Boolean bool;
        Throwable th;
        hm9.m("boe", "work %s started at %s", getId(), Integer.valueOf(System.identityHashCode(this)));
        if (!c()) {
            hm9.n("boe", "work " + getId() + " No tasks to be executed");
            return fm7.b();
        }
        ((hyc) this.X).y(true);
        r9d.y(this.o);
        xpb xpbVar = this.b.c;
        aoe aoeVar = new aoe(this);
        xpbVar.getClass();
        ty9 ty9Var = new ty9(xpbVar, aoeVar, 2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ztc ztcVar = (ztc) ((jle) this.c).c.getValue();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(ztcVar, "scheduler is null");
        b2a b2aVar = new b2a(ty9Var, 15000L, timeUnit, ztcVar);
        aoe aoeVar2 = new aoe(this);
        lp0 lp0Var = this.Y;
        Objects.requireNonNull(lp0Var, "observer is null");
        try {
            b2aVar.a(new f0a(lp0Var, aoeVar2, 1));
            try {
                if (lp0Var.getCount() != 0) {
                    try {
                        lp0Var.await();
                    } catch (InterruptedException e) {
                        lp0Var.g();
                        throw q45.f(e);
                    }
                }
                th = lp0Var.b;
            } catch (Throwable th2) {
                hm9.p("boe", "work " + getId() + " Exception", th2);
                bool = null;
            }
            if (th != null) {
                throw q45.f(th);
            }
            bool = (Boolean) lp0Var.a;
            if (bool == null) {
                hm9.p("boe", "work " + getId() + " result null. Set failure state", null);
                return fm7.a();
            }
            if (bool.booleanValue()) {
                hm9.n("boe", "work " + getId() + " finished");
                return fm7.b();
            }
            hm9.m0("boe", "work " + getId() + " Timeout. Set retry state", new Object[0]);
            return new dm7();
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th3) {
            c37.B(th3);
            j47.Z(th3);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    public final boolean c() {
        eoe eoeVar = this.b;
        int iK = eoeVar.k();
        hm9.n("boe", "work " + getId() + " Task count to be executed = " + iK);
        if (1 <= iK && iK < 10) {
            String strN0 = x53.n0(eoeVar.m(), "; ", null, null, new w8c(18), 30);
            hm9.n("boe", "work " + getId() + " Last task to execute: " + strN0);
        }
        return iK > 0;
    }

    @Override // defpackage.gm7
    public final void onStopped() {
        hm9.n("boe", "work " + getId() + " requested to stop " + System.identityHashCode(this));
        lp0 lp0Var = this.Y;
        lp0Var.g();
        lp0Var.countDown();
        hm9.n("boe", "work " + getId() + " stopped " + System.identityHashCode(this));
    }
}
