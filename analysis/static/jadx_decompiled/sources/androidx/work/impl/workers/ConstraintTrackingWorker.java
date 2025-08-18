package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.a14;
import defpackage.bm7;
import defpackage.cu1;
import defpackage.dcd;
import defpackage.e7g;
import defpackage.gj3;
import defpackage.gm7;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Lgm7;", "Le7g;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends gm7 implements e7g {
    public gm7 X;
    public final WorkerParameters a;
    public final Object b;
    public volatile boolean c;
    public final dcd o;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = workerParameters;
        this.b = new Object();
        this.o = new dcd();
    }

    @Override // defpackage.e7g
    public final void a(List list) {
        a14.u().n(gj3.a, "Constraints changed for " + list);
        synchronized (this.b) {
            this.c = true;
        }
    }

    @Override // defpackage.e7g
    public final void f(List list) {
    }

    @Override // defpackage.gm7
    public final void onStopped() {
        gm7 gm7Var = this.X;
        if (gm7Var == null || gm7Var.isStopped()) {
            return;
        }
        gm7Var.stop();
    }

    @Override // defpackage.gm7
    public final bm7 startWork() {
        getBackgroundExecutor().execute(new cu1(19, this));
        return this.o;
    }
}
