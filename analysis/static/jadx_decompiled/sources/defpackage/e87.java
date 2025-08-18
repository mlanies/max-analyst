package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* loaded from: classes.dex */
public final class e87 implements d87 {
    public final /* synthetic */ int a;
    public final JobWorkItem b;
    public final /* synthetic */ JobServiceEngine c;

    public /* synthetic */ e87(JobServiceEngine jobServiceEngine, JobWorkItem jobWorkItem, int i) {
        this.a = i;
        this.c = jobServiceEngine;
        this.b = jobWorkItem;
    }

    @Override // defpackage.d87
    public final void a() {
        switch (this.a) {
            case 0:
                synchronized (((f87) this.c).c) {
                    try {
                        JobParameters jobParameters = ((f87) this.c).d;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (((f87) this.c).c) {
                    JobParameters jobParameters2 = ((f87) this.c).d;
                    if (jobParameters2 != null) {
                        try {
                            jobParameters2.completeWork(this.b);
                        } catch (IllegalArgumentException | SecurityException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return;
        }
    }

    @Override // defpackage.d87
    public final Intent getIntent() {
        switch (this.a) {
        }
        return this.b.getIntent();
    }
}
