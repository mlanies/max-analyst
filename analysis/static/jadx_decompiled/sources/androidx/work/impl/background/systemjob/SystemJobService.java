package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import defpackage.a14;
import defpackage.bdb;
import defpackage.gie;
import defpackage.glc;
import defpackage.hie;
import defpackage.k8e;
import defpackage.l7g;
import defpackage.s7g;
import defpackage.w45;
import defpackage.y9b;
import defpackage.yzd;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements w45 {
    public static final String o = a14.O("SystemJobService");
    public s7g a;
    public final HashMap b = new HashMap();
    public final bdb c = new bdb(6);

    public static l7g a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new l7g(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.w45
    public final void b(l7g l7gVar, boolean z) {
        JobParameters jobParameters;
        a14.u().n(o, l7gVar.a + " executed on JobScheduler");
        synchronized (this.b) {
            jobParameters = (JobParameters) this.b.remove(l7gVar);
        }
        this.c.j(l7gVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            s7g s7gVarD = s7g.d(getApplicationContext());
            this.a = s7gVarD;
            s7gVarD.f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            a14.u().R(o, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        s7g s7gVar = this.a;
        if (s7gVar != null) {
            s7gVar.f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.a == null) {
            a14.u().n(o, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        l7g l7gVarA = a(jobParameters);
        if (l7gVarA == null) {
            a14.u().q(o, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.b) {
            try {
                if (this.b.containsKey(l7gVarA)) {
                    a14.u().n(o, "Job is already being executed by SystemJobService: " + l7gVarA);
                    return false;
                }
                a14.u().n(o, "onStartJob for " + l7gVarA);
                this.b.put(l7gVarA, jobParameters);
                glc glcVar = new glc(14);
                if (gie.b(jobParameters) != null) {
                    glcVar.c = Arrays.asList(gie.b(jobParameters));
                }
                if (gie.a(jobParameters) != null) {
                    glcVar.b = Arrays.asList(gie.a(jobParameters));
                }
                glcVar.o = hie.a(jobParameters);
                this.a.h(this.c.o(l7gVarA), glcVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.a == null) {
            a14.u().n(o, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        l7g l7gVarA = a(jobParameters);
        if (l7gVarA == null) {
            a14.u().q(o, "WorkSpec id not found!");
            return false;
        }
        a14.u().n(o, "onStopJob for " + l7gVarA);
        synchronized (this.b) {
            this.b.remove(l7gVarA);
        }
        yzd yzdVarJ = this.c.j(l7gVarA);
        if (yzdVarJ != null) {
            s7g s7gVar = this.a;
            s7gVar.d.l(new k8e(s7gVar, yzdVarJ, false));
        }
        y9b y9bVar = this.a.f;
        String str = l7gVarA.a;
        synchronized (y9bVar.w0) {
            zContains = y9bVar.u0.contains(str);
        }
        return !zContains;
    }
}
