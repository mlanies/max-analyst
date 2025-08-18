package defpackage;

import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;

/* loaded from: classes2.dex */
public final class aoe implements b7b, b66 {
    public final /* synthetic */ TaskMonitor$TaskMonitorWorker a;

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        hm9.p("boe", "work " + this.a.getId() + " on error", (Throwable) obj);
        return Boolean.FALSE;
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        TaskMonitor$TaskMonitorWorker taskMonitor$TaskMonitorWorker = this.a;
        hm9.n("boe", "work " + taskMonitor$TaskMonitorWorker.getId() + " Receive task remove callback");
        return taskMonitor$TaskMonitorWorker.c();
    }
}
