package defpackage;

import android.app.Service;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class i87 extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    h87 mCompatWorkEnqueuer;
    a87 mCurProcessor;
    b87 mJobImpl;
    static final Object sLock = new Object();
    static final HashMap<ComponentName, h87> sClassWorkEnqueuer = new HashMap<>();
    boolean mInterruptIfStopped = false;
    boolean mStopped = false;
    boolean mDestroyed = false;
    final ArrayList<c87> mCompatQueue = null;

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static h87 getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        HashMap<ComponentName, h87> map = sClassWorkEnqueuer;
        h87 h87Var = map.get(componentName);
        if (h87Var != null) {
            return h87Var;
        }
        if (!z) {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        g87 g87Var = new g87(context, componentName, i);
        map.put(componentName, g87Var);
        return g87Var;
    }

    public abstract d87 dequeueWork();

    public boolean doStopCurrentWork() {
        a87 a87Var = this.mCurProcessor;
        if (a87Var != null) {
            a87Var.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new a87(this);
            h87 h87Var = this.mCompatWorkEnqueuer;
            if (h87Var != null && z) {
                h87Var.getClass();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b87 b87Var = this.mJobImpl;
        if (b87Var != null) {
            return b87Var.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new f87(this, 0);
        this.mCompatWorkEnqueuer = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<c87> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.getClass();
            }
        }
    }

    public abstract void onHandleWork(Intent intent);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.getClass();
        synchronized (this.mCompatQueue) {
            ArrayList<c87> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new c87(this, intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void processorFinished() {
        ArrayList<c87> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<c87> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.getClass();
                    }
                } finally {
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (sLock) {
            h87 workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
            workEnqueuer.a(i);
            g87 g87Var = (g87) workEnqueuer;
            g87Var.d.enqueue(g87Var.c, new JobWorkItem(intent));
        }
    }
}
