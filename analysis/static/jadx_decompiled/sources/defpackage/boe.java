package defpackage;

import androidx.work.WorkRequest;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;

/* loaded from: classes2.dex */
public final class boe {
    public static final /* synthetic */ int b = 0;
    public final v7g a;

    public boe(v7g v7gVar) {
        this.a = v7gVar;
        mta mtaVar = (mta) ((lta) ((lta) new lta(TaskMonitor$TaskMonitorWorker.class, 6L, TimeUnit.HOURS).setConstraints(new kj3(1, false, true, false, false, -1L, -1L, x53.H0(new LinkedHashSet())))).addTag("TASK_MONITOR_PERIODIC_TASK")).build();
        hm9.n("boe", "work " + mtaVar.getId() + " try to add TASK_MONITOR_PERIODIC_TASK request");
        v7g.e(v7gVar, "TASK_MONITOR_PERIODIC_TASK", 2, mtaVar, false, 24);
    }

    public final void a() {
        rla rlaVar = (rla) ((qla) ((qla) new qla(TaskMonitor$TaskMonitorWorker.class).setBackoffCriteria(mf0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("TASK_MONITOR_ONE_TIME_TASK")).build();
        hm9.n("boe", "work " + rlaVar.getId() + " try to add TASK_MONITOR_ONE_TIME_TASK request");
        this.a.b("TASK_MONITOR_ONE_TIME_TASK", h65.b, rlaVar, false).l();
    }
}
