package defpackage;

import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class s7g extends p7g {
    public static s7g k;
    public static s7g l;
    public static final Object m;
    public final Context a;
    public final me3 b;
    public final WorkDatabase c;
    public final wne d;
    public final List e;
    public final y9b f;
    public final wmc g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public final c8d j;

    static {
        a14.O("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s7g(Context context, me3 me3Var, bkb bkbVar) throws Resources.NotFoundException {
        hlc hlcVarU;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        boolean z = context.getResources().getBoolean(xsb.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        qm qmVar = (qm) bkbVar.a;
        if (z) {
            hlcVarU = new hlc(applicationContext, null, WorkDatabase.class);
            hlcVarU.j = true;
        } else {
            hlcVarU = fp3.u(applicationContext, "androidx.work.workdb", WorkDatabase.class);
            hlcVarU.i = new dp(applicationContext);
        }
        hlcVarU.g = qmVar;
        hlcVarU.d.add(m23.b);
        hlcVarU.a(ea9.g);
        hlcVarU.a(new dic(2, 3, applicationContext));
        hlcVarU.a(ea9.h);
        hlcVarU.a(ea9.i);
        hlcVarU.a(new dic(5, 6, applicationContext));
        hlcVarU.a(ea9.j);
        hlcVarU.a(ea9.k);
        hlcVarU.a(ea9.l);
        hlcVarU.a(new dic(applicationContext));
        hlcVarU.a(new dic(10, 11, applicationContext));
        hlcVarU.a(ea9.d);
        hlcVarU.a(ea9.e);
        hlcVarU.a(ea9.f);
        hlcVarU.l = false;
        hlcVarU.m = true;
        WorkDatabase workDatabase = (WorkDatabase) hlcVarU.b();
        Context applicationContext2 = context.getApplicationContext();
        int i2 = me3Var.f;
        et7 et7Var = new et7(i, objArr2 == true ? 1 : 0);
        synchronized (a14.e) {
            a14.f = et7Var;
        }
        il0 il0Var = new il0(applicationContext2.getApplicationContext(), bkbVar, 0);
        il0 il0Var2 = new il0(applicationContext2.getApplicationContext(), bkbVar, 1);
        Context applicationContext3 = applicationContext2.getApplicationContext();
        String str = zn9.a;
        yn9 yn9Var = new yn9(applicationContext3, bkbVar);
        il0 il0Var3 = new il0(applicationContext2.getApplicationContext(), bkbVar, 2);
        c8d c8dVar = new c8d();
        c8dVar.a = il0Var;
        c8dVar.b = il0Var2;
        c8dVar.c = yn9Var;
        c8dVar.o = il0Var3;
        this.j = c8dVar;
        String str2 = nuc.a;
        fie fieVar = new fie(applicationContext2, this);
        woa.a(applicationContext2, SystemJobService.class, true);
        a14.u().n(nuc.a, "Created SystemJobScheduler and enabled SystemJobService");
        List listAsList = Arrays.asList(fieVar, new uf6(applicationContext2, me3Var, c8dVar, this));
        y9b y9bVar = new y9b(context, me3Var, bkbVar, workDatabase, listAsList);
        Context applicationContext4 = context.getApplicationContext();
        this.a = applicationContext4;
        this.b = me3Var;
        this.d = bkbVar;
        this.c = workDatabase;
        this.e = listAsList;
        this.f = y9bVar;
        this.g = new wmc(workDatabase, objArr == true ? 1 : 0);
        this.h = false;
        if (r7g.a(applicationContext4)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.d.l(new wx5(applicationContext4, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static s7g d(Context context) {
        s7g s7gVarD;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    s7gVarD = k;
                    if (s7gVarD == null) {
                        s7gVarD = l;
                    }
                }
                return s7gVarD;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (s7gVarD == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof ke3)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            e(applicationContext, ((ke3) applicationContext).a());
            s7gVarD = d(applicationContext);
        }
        return s7gVarD;
    }

    public static void e(Context context, me3 me3Var) {
        synchronized (m) {
            try {
                s7g s7gVar = k;
                if (s7gVar != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (s7gVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        l = new s7g(applicationContext, me3Var, new bkb(me3Var.b));
                    }
                    k = l;
                }
            } finally {
            }
        }
    }

    @Override // defpackage.p7g
    public final pma b(String str, int i, mta mtaVar) {
        if (i != 3) {
            return new g7g(this, str, i == 2 ? h65.b : h65.a, Collections.singletonList(mtaVar)).l();
        }
        imc imcVar = new imc(28);
        ((qm) ((bkb) this.d).a).execute(new vq1(this, str, imcVar, new t8g(mtaVar, this, str, imcVar), mtaVar));
        return imcVar;
    }

    public final PendingIntent c(UUID uuid) {
        Context context = this.a;
        String string = uuid.toString();
        String str = uhe.u0;
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse("workspec://" + string));
        intent.putExtra("KEY_WORKSPEC_ID", string);
        return PendingIntent.getService(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    public final void f() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayListB;
        WorkDatabase workDatabase = this.c;
        Context context = this.a;
        String str = fie.X;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListB = fie.b(context, jobScheduler)) != null && !arrayListB.isEmpty()) {
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                fie.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        i8g i8gVarY = workDatabase.y();
        ilc ilcVar = (ilc) i8gVarY.a;
        ilcVar.b();
        ktf ktfVar = (ktf) i8gVarY.l;
        q36 q36VarF = ktfVar.f();
        ilcVar.c();
        try {
            q36VarF.n();
            ilcVar.r();
            ilcVar.l();
            ktfVar.t(q36VarF);
            nuc.a(this.b, workDatabase, this.e);
        } catch (Throwable th) {
            ilcVar.l();
            ktfVar.t(q36VarF);
            throw th;
        }
    }

    public final void h(yzd yzdVar, glc glcVar) {
        wne wneVar = this.d;
        wi3 wi3Var = new wi3(6);
        wi3Var.b = this;
        wi3Var.c = yzdVar;
        wi3Var.o = glcVar;
        wneVar.l(wi3Var);
    }
}
