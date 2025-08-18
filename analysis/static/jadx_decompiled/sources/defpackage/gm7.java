package defpackage;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class gm7 {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public gm7(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public bm7 getForegroundInfoAsync() {
        dcd dcdVar = new dcd();
        dcdVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return dcdVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final d24 getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.d.o;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public wne getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.d.b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.d.c;
    }

    public p8g getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final bm7 setForegroundAsync(ay5 ay5Var) {
        dy5 dy5Var = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        k7g k7gVar = (k7g) dy5Var;
        k7gVar.getClass();
        dcd dcdVar = new dcd();
        k7gVar.a.l(new z68(k7gVar, dcdVar, id, ay5Var, applicationContext, 2));
        return dcdVar;
    }

    public bm7 setProgressAsync(d24 d24Var) {
        hnb hnbVar = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        b8g b8gVar = (b8g) hnbVar;
        b8gVar.getClass();
        dcd dcdVar = new dcd();
        b8gVar.b.l(new r8g(b8gVar, id, d24Var, dcdVar, 7));
        return dcdVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract bm7 startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
