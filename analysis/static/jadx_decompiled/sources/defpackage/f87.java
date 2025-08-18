package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class f87 extends JobServiceEngine implements b87 {
    public final /* synthetic */ int a;
    public final i87 b;
    public final Object c;
    public JobParameters d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f87(i87 i87Var, int i) {
        super(i87Var);
        this.a = i;
        switch (i) {
            case 1:
                super(i87Var);
                this.c = new Object();
                this.b = i87Var;
                break;
            default:
                this.c = new Object();
                this.b = i87Var;
                break;
        }
    }

    @Override // defpackage.b87
    public final IBinder a() {
        switch (this.a) {
        }
        return getBinder();
    }

    @Override // defpackage.b87
    public final d87 b() {
        JobWorkItem jobWorkItemDequeueWork;
        switch (this.a) {
            case 0:
                synchronized (this.c) {
                    try {
                        JobParameters jobParameters = this.d;
                        if (jobParameters == null) {
                            return null;
                        }
                        JobWorkItem jobWorkItemDequeueWork2 = jobParameters.dequeueWork();
                        if (jobWorkItemDequeueWork2 == null) {
                            return null;
                        }
                        jobWorkItemDequeueWork2.getIntent().setExtrasClassLoader(this.b.getClassLoader());
                        return new e87(this, jobWorkItemDequeueWork2, 0);
                    } finally {
                    }
                }
            default:
                synchronized (this.c) {
                    JobParameters jobParameters2 = this.d;
                    if (jobParameters2 == null) {
                        return null;
                    }
                    try {
                        jobWorkItemDequeueWork = jobParameters2.dequeueWork();
                    } catch (SecurityException e) {
                        e.printStackTrace();
                        jobWorkItemDequeueWork = null;
                    }
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.b.getClassLoader());
                    return new e87(this, jobWorkItemDequeueWork, 1);
                }
        }
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        switch (this.a) {
            case 0:
                this.d = jobParameters;
                this.b.ensureProcessorRunningLocked(false);
                break;
            default:
                this.d = jobParameters;
                this.b.ensureProcessorRunningLocked(false);
                break;
        }
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        switch (this.a) {
            case 0:
                boolean zDoStopCurrentWork = this.b.doStopCurrentWork();
                synchronized (this.c) {
                    this.d = null;
                }
                return zDoStopCurrentWork;
            default:
                boolean zDoStopCurrentWork2 = this.b.doStopCurrentWork();
                synchronized (this.c) {
                    this.d = null;
                }
                return zDoStopCurrentWork2;
        }
    }
}
