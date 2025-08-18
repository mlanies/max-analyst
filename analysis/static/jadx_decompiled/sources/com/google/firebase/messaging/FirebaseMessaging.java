package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.b9b;
import defpackage.bd;
import defpackage.bwf;
import defpackage.ckg;
import defpackage.cm9;
import defpackage.dc3;
import defpackage.fl5;
import defpackage.fp3;
import defpackage.goc;
import defpackage.gpb;
import defpackage.i0e;
import defpackage.ie5;
import defpackage.j1e;
import defpackage.jjf;
import defpackage.jl5;
import defpackage.m6d;
import defpackage.ml5;
import defpackage.ok4;
import defpackage.pkg;
import defpackage.re6;
import defpackage.sp3;
import defpackage.t8e;
import defpackage.tpa;
import defpackage.u00;
import defpackage.ukg;
import defpackage.us;
import defpackage.uxe;
import defpackage.w36;
import defpackage.wae;
import defpackage.y98;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static re6 k;
    public static ScheduledThreadPoolExecutor m;
    public final fl5 a;
    public final Context b;
    public final bwf c;
    public final b9b d;
    public final w36 e;
    public final Executor f;
    public final Executor g;
    public final jjf h;
    public boolean i;
    public static final long j = TimeUnit.HOURS.toSeconds(8);
    public static gpb l = new dc3(5);

    public FirebaseMessaging(fl5 fl5Var, gpb gpbVar, gpb gpbVar2, jl5 jl5Var, gpb gpbVar3, wae waeVar) {
        final int i = 1;
        final int i2 = 0;
        fl5Var.a();
        Context context = fl5Var.a;
        final jjf jjfVar = new jjf(context);
        final bwf bwfVar = new bwf(fl5Var, jjfVar, gpbVar, gpbVar2, jl5Var);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new cm9("Firebase-Messaging-Task", 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new cm9("Firebase-Messaging-Init", 0));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cm9("Firebase-Messaging-File-Io", 0));
        this.i = false;
        l = gpbVar3;
        this.a = fl5Var;
        w36 w36Var = new w36();
        w36Var.o = this;
        w36Var.b = waeVar;
        this.e = w36Var;
        fl5Var.a();
        final Context context2 = fl5Var.a;
        this.b = context2;
        ie5 ie5Var = new ie5();
        this.h = jjfVar;
        this.c = bwfVar;
        this.d = new b9b(executorServiceNewSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        fl5Var.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(ie5Var);
        } else {
            Objects.toString(context);
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: ll5
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ukg ukgVarQ;
                int i3;
                switch (i2) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.e.q() && firebaseMessaging.i(firebaseMessaging.e())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.h(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.b;
                        Context context3 = firebaseMessaging2.b;
                        tpa.x(context3);
                        boolean zG = firebaseMessaging2.g();
                        SharedPreferences sharedPreferencesQ = v3c.q(context3);
                        if (!sharedPreferencesQ.contains("proxy_retention") || sharedPreferencesQ.getBoolean("proxy_retention", false) != zG) {
                            goc gocVar = (goc) firebaseMessaging2.c.c;
                            if (gocVar.c.g() >= 241100000) {
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("proxy_retention", zG);
                                pkg pkgVarF = pkg.f(gocVar.b);
                                synchronized (pkgVarF) {
                                    i3 = pkgVarF.b;
                                    pkgVarF.b = i3 + 1;
                                }
                                ukgVarQ = pkgVarF.h(new ckg(i3, 4, bundle, 0));
                            } else {
                                ukgVarQ = j1e.q(new IOException("SERVICE_NOT_AVAILABLE"));
                            }
                            ukgVarQ.d(new cs(2), new npb(0, context3, zG));
                        }
                        if (firebaseMessaging2.g()) {
                            firebaseMessaging2.f();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new cm9("Firebase-Messaging-Topics-Io", 0));
        int i3 = uxe.j;
        j1e.g(new Callable() { // from class: txe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                sxe sxeVar;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                jjf jjfVar2 = jjfVar;
                bwf bwfVar2 = bwfVar;
                synchronized (sxe.class) {
                    try {
                        WeakReference weakReference = sxe.c;
                        sxeVar = weakReference != null ? (sxe) weakReference.get() : null;
                        if (sxeVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            sxe sxeVar2 = new sxe(sharedPreferences, (ScheduledThreadPoolExecutor) scheduledExecutorService);
                            synchronized (sxeVar2) {
                                sxeVar2.a = o23.f(sharedPreferences, (ScheduledThreadPoolExecutor) scheduledExecutorService);
                            }
                            sxe.c = new WeakReference(sxeVar2);
                            sxeVar = sxeVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new uxe(firebaseMessaging, jjfVar2, sxeVar, bwfVar2, context3, (ScheduledThreadPoolExecutor) scheduledExecutorService);
            }
        }, scheduledThreadPoolExecutor2).d(scheduledThreadPoolExecutor, new ml5(this, i2));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: ll5
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ukg ukgVarQ;
                int i32;
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.b;
                        if (firebaseMessaging.e.q() && firebaseMessaging.i(firebaseMessaging.e())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.h(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.b;
                        Context context3 = firebaseMessaging2.b;
                        tpa.x(context3);
                        boolean zG = firebaseMessaging2.g();
                        SharedPreferences sharedPreferencesQ = v3c.q(context3);
                        if (!sharedPreferencesQ.contains("proxy_retention") || sharedPreferencesQ.getBoolean("proxy_retention", false) != zG) {
                            goc gocVar = (goc) firebaseMessaging2.c.c;
                            if (gocVar.c.g() >= 241100000) {
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("proxy_retention", zG);
                                pkg pkgVarF = pkg.f(gocVar.b);
                                synchronized (pkgVarF) {
                                    i32 = pkgVarF.b;
                                    pkgVarF.b = i32 + 1;
                                }
                                ukgVarQ = pkgVarF.h(new ckg(i32, 4, bundle, 0));
                            } else {
                                ukgVarQ = j1e.q(new IOException("SERVICE_NOT_AVAILABLE"));
                            }
                            ukgVarQ.d(new cs(2), new npb(0, context3, zG));
                        }
                        if (firebaseMessaging2.g()) {
                            firebaseMessaging2.f();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new ScheduledThreadPoolExecutor(1, new cm9("TAG", 0));
                }
                m.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized re6 c(Context context) {
        try {
            if (k == null) {
                k = new re6(context, 29);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(fl5 fl5Var) {
        FirebaseMessaging firebaseMessaging;
        fl5Var.a();
        firebaseMessaging = (FirebaseMessaging) fl5Var.d.a(FirebaseMessaging.class);
        fp3.o(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        Task taskK;
        t8e t8eVarE = e();
        if (!i(t8eVarE)) {
            return t8eVarE.a;
        }
        String strH = jjf.h(this.a);
        b9b b9bVar = this.d;
        synchronized (b9bVar) {
            taskK = (Task) ((us) b9bVar.c).get(strH);
            if (taskK == null) {
                bwf bwfVar = this.c;
                taskK = bwfVar.g(bwfVar.n(jjf.h((fl5) bwfVar.a), "*", new Bundle())).l(this.g, new u00(this, strH, t8eVarE, 10)).k((Executor) b9bVar.b, new y98(b9bVar, 28, strH));
                ((us) b9bVar.c).put(strH, taskK);
            }
        }
        try {
            return (String) j1e.b(taskK);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final String d() {
        fl5 fl5Var = this.a;
        fl5Var.a();
        return "[DEFAULT]".equals(fl5Var.b) ? "" : fl5Var.c();
    }

    public final t8e e() {
        t8e t8eVarA;
        re6 re6VarC = c(this.b);
        String strD = d();
        String strH = jjf.h(this.a);
        synchronized (re6VarC) {
            t8eVarA = t8e.a(((SharedPreferences) re6VarC.b).getString(re6.m0(strD, strH), null));
        }
        return t8eVarA;
    }

    public final void f() {
        ukg ukgVarQ;
        int i;
        goc gocVar = (goc) this.c.c;
        if (gocVar.c.g() >= 241100000) {
            pkg pkgVarF = pkg.f(gocVar.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (pkgVarF) {
                i = pkgVarF.b;
                pkgVarF.b = i + 1;
            }
            ukgVarQ = pkgVarF.h(new ckg(i, 5, bundle, 1)).j(ok4.o, sp3.v0);
        } else {
            ukgVarQ = j1e.q(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        ukgVarQ.d(this.f, new ml5(this, 1));
    }

    public final boolean g() {
        Context context = this.b;
        tpa.x(context);
        if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
            context.getPackageName();
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        fl5 fl5Var = this.a;
        fl5Var.a();
        if (fl5Var.d.a(bd.class) != null) {
            return true;
        }
        return m6d.l() && l != null;
    }

    public final synchronized void h(long j2) {
        b(new i0e(this, Math.min(Math.max(30L, 2 * j2), j)), j2);
        this.i = true;
    }

    public final boolean i(t8e t8eVar) {
        if (t8eVar != null) {
            String strG = this.h.g();
            if (System.currentTimeMillis() <= t8eVar.c + t8e.d && strG.equals(t8eVar.b)) {
                return false;
            }
        }
        return true;
    }
}
