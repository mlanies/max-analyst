package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.d9b;
import defpackage.hc0;
import defpackage.o2f;
import defpackage.t05;
import defpackage.t8f;
import defpackage.vq7;
import defpackage.vs5;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt(LogFactory.PRIORITY_KEY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        o2f.b(getApplicationContext());
        vq7 vq7VarA = hc0.a();
        vq7VarA.t(string);
        vq7VarA.o = d9b.b(i);
        if (string2 != null) {
            vq7VarA.c = Base64.decode(string2, 0);
        }
        t8f t8fVar = o2f.a().d;
        hc0 hc0VarJ = vq7VarA.j();
        vs5 vs5Var = new vs5(this, 9, jobParameters);
        t8fVar.getClass();
        t8fVar.e.execute(new t05(t8fVar, hc0VarJ, i2, vs5Var));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
