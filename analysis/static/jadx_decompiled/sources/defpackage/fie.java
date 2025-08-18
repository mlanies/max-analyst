package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class fie implements auc {
    public static final String X = a14.O("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final s7g c;
    public final eie o;

    public fie(Context context, s7g s7gVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        eie eieVar = new eie(context);
        this.a = context;
        this.c = s7gVar;
        this.b = jobScheduler;
        this.o = eieVar;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            a14.u().r(X, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            a14.u().r(X, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static l7g f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new l7g(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.auc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.auc
    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList arrayListB = b(context, jobScheduler);
        if (arrayListB == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                l7g l7gVarF = f(jobInfo);
                if (l7gVarF != null && str.equals(l7gVarF.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a(jobScheduler, ((Integer) it2.next()).intValue());
        }
        die dieVarV = this.c.c.v();
        ilc ilcVar = (ilc) dieVarV.a;
        ilcVar.b();
        zkc zkcVar = (zkc) dieVarV.o;
        q36 q36VarF = zkcVar.f();
        if (str == null) {
            q36VarF.W(1);
        } else {
            q36VarF.f(1, str);
        }
        ilcVar.c();
        try {
            q36VarF.n();
            ilcVar.r();
        } finally {
            ilcVar.l();
            zkcVar.t(q36VarF);
        }
    }

    @Override // defpackage.auc
    public final void e(h8g... h8gVarArr) {
        int iIntValue;
        s7g s7gVar = this.c;
        WorkDatabase workDatabase = s7gVar.c;
        final re6 re6Var = new re6(16, workDatabase);
        for (h8g h8gVar : h8gVarArr) {
            workDatabase.c();
            try {
                h8g h8gVarL = workDatabase.y().l(h8gVar.a);
                String str = X;
                String str2 = h8gVar.a;
                if (h8gVarL == null) {
                    a14.u().R(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.r();
                } else if (h8gVarL.b != m7g.a) {
                    a14.u().R(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.r();
                } else {
                    l7g l7gVarN = ju0.n(h8gVar);
                    cie cieVarX = workDatabase.v().x(l7gVarN);
                    if (cieVarX != null) {
                        iIntValue = cieVarX.c;
                    } else {
                        s7gVar.b.getClass();
                        final int i = s7gVar.b.g;
                        iIntValue = ((Number) ((WorkDatabase) re6Var.b).p(new Callable() { // from class: ft6
                            public final /* synthetic */ int b = 0;

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = (WorkDatabase) re6Var.b;
                                Long lJ = workDatabase2.u().j("next_job_scheduler_id");
                                int iLongValue = lJ != null ? (int) lJ.longValue() : 0;
                                workDatabase2.u().p(new g7b("next_job_scheduler_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                                int i2 = this.b;
                                if (i2 > iLongValue || iLongValue > i) {
                                    workDatabase2.u().p(new g7b("next_job_scheduler_id", Long.valueOf(i2 + 1)));
                                    iLongValue = i2;
                                }
                                return Integer.valueOf(iLongValue);
                            }
                        })).intValue();
                    }
                    if (cieVarX == null) {
                        s7gVar.c.v().A(new cie(l7gVarN.a, l7gVarN.b, iIntValue));
                    }
                    g(h8gVar, iIntValue);
                    workDatabase.r();
                }
            } finally {
                workDatabase.l();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(h8g h8gVar, int i) {
        int i2;
        JobScheduler jobScheduler = this.b;
        eie eieVar = this.o;
        eieVar.getClass();
        kj3 kj3Var = h8gVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = h8gVar.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", h8gVar.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", h8gVar.d());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, eieVar.a).setRequiresCharging(kj3Var.b);
        boolean z = kj3Var.c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = kj3Var.a;
        if (i3 < 30 || i4 != 6) {
            int iS = au1.s(i4);
            if (iS == 0) {
                i2 = 0;
            } else if (iS != 1) {
                i2 = 2;
                if (iS != 2) {
                    i2 = 3;
                    if (iS != 3) {
                        i2 = 4;
                        if (iS != 4) {
                            a14.u().n(eie.b, "API version too low. Cannot convert network type value ".concat(ey8.t(i4)));
                            i2 = 1;
                        }
                    }
                }
            } else {
                i2 = 1;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z) {
            extras.setBackoffCriteria(h8gVar.m, h8gVar.l == mf0.b ? 0 : 1);
        }
        long jMax = Math.max(h8gVar.a() - System.currentTimeMillis(), 0L);
        if (jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!h8gVar.q) {
            extras.setImportantWhileForeground(true);
        }
        Set<jj3> set = kj3Var.h;
        if (!set.isEmpty()) {
            for (jj3 jj3Var : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(jj3Var.a, jj3Var.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(kj3Var.f);
            extras.setTriggerContentMaxDelay(kj3Var.g);
        }
        extras.setPersisted(false);
        int i5 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(kj3Var.d);
        extras.setRequiresStorageNotLow(kj3Var.e);
        Object[] objArr = h8gVar.k > 0;
        boolean z2 = jMax > 0;
        if (i5 >= 31 && h8gVar.q && objArr == false && !z2) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        String str2 = X;
        a14.u().n(str2, "Scheduling work ID " + str + "Job ID " + i);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                a14.u().R(str2, "Unable to schedule work ID " + str);
                if (h8gVar.q && h8gVar.r == jna.a) {
                    h8gVar.q = false;
                    a14.u().n(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(h8gVar, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList arrayListB = b(this.a, jobScheduler);
            int size = arrayListB != null ? arrayListB.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            s7g s7gVar = this.c;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(s7gVar.c.y().i().size()), Integer.valueOf(s7gVar.b.h));
            a14.u().q(str2, str3);
            IllegalStateException illegalStateException = new IllegalStateException(str3, e);
            s7gVar.b.getClass();
            throw illegalStateException;
        } catch (Throwable th) {
            a14.u().r(str2, "Unable to schedule " + h8gVar, th);
        }
    }
}
