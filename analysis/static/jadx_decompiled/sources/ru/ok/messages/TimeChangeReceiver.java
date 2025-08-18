package ru.ok.messages;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.WorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.av0;
import defpackage.ay7;
import defpackage.e52;
import defpackage.fm7;
import defpackage.h65;
import defpackage.hm9;
import defpackage.mf0;
import defpackage.n34;
import defpackage.p82;
import defpackage.qla;
import defpackage.rla;
import defpackage.su;
import defpackage.t6b;
import defpackage.tme;
import defpackage.v7g;
import defpackage.vl;
import defpackage.vz2;
import defpackage.y8a;
import java.util.Collections;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/messages/TimeChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "TaskTimeChangeWorker", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TimeChangeReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/messages/TimeChangeReceiver$TaskTimeChangeWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lt6b;", "preProcessDataCache", "Lp82;", "chatController", "Lav0;", "uiBus", "Ltme;", "themeController", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lt6b;Lp82;Lav0;Ltme;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
    public static final class TaskTimeChangeWorker extends Worker {
        public final tme X;
        public final t6b b;
        public final p82 c;
        public final av0 o;

        public TaskTimeChangeWorker(Context context, WorkerParameters workerParameters, t6b t6bVar, p82 p82Var, av0 av0Var, tme tmeVar) {
            super(context, workerParameters);
            this.b = t6bVar;
            this.c = p82Var;
            this.o = av0Var;
            this.X = tmeVar;
        }

        @Override // androidx.work.Worker
        public final fm7 b() {
            int i = TimeChangeReceiver.a;
            hm9.m("ru.ok.messages.TimeChangeReceiver", "work %s started", getId());
            synchronized (ay7.c) {
                ay7.b = null;
            }
            synchronized (ay7.e) {
                ay7.d = null;
            }
            synchronized (ay7.g) {
                ay7.f = null;
            }
            synchronized (ay7.i) {
                ay7.h = null;
            }
            synchronized (ay7.k) {
                ay7.j = null;
            }
            synchronized (ay7.m) {
                ay7.l = null;
            }
            synchronized (ay7.o) {
                ay7.n = null;
            }
            synchronized (ay7.p) {
            }
            synchronized (ay7.v) {
                ay7.u = null;
            }
            synchronized (ay7.t) {
                ay7.s = null;
            }
            this.b.a();
            p82 p82Var = this.c;
            if (p82Var.i) {
                Iterator it = p82Var.f.values().iterator();
                while (it.hasNext()) {
                    ((e52) it.next()).z0 = null;
                }
                p82Var.m.c(new vz2(Collections.emptyList(), true));
            }
            this.o.c(new su(12));
            this.X.f();
            new TimeChangeReceiver();
            TimeChangeReceiver.a(getApplicationContext());
            hm9.m("ru.ok.messages.TimeChangeReceiver", "work %s finished", getId());
            return fm7.b();
        }
    }

    public static void a(Context context) {
        v7g v7gVar = (v7g) ((y8a) vl.b()).getAccessor().c(v7g.class);
        qla qlaVar = new qla(TaskTimeChangeWorker.class);
        mf0 mf0Var = mf0.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qla qlaVar2 = (qla) qlaVar.setBackoffCriteria(mf0Var, WorkRequest.MIN_BACKOFF_MILLIS, timeUnit);
        n34 n34VarG = n34.g(System.currentTimeMillis(), TimeZone.getDefault());
        long jH = new n34(n34VarG.a, n34VarG.b, n34VarG.c, null, null, null, null).l(1).h(TimeZone.getDefault()) - n34.g(System.currentTimeMillis(), TimeZone.getDefault()).h(TimeZone.getDefault());
        if (jH > 0) {
            qlaVar2.setInitialDelay(jH, timeUnit);
        }
        rla rlaVar = (rla) ((qla) qlaVar2.addTag("TIME_CHANGE")).build();
        hm9.n("ru.ok.messages.TimeChangeReceiver", "work " + rlaVar.getId() + " try to add TIME_CHANGE request. Schedule on next date");
        v7gVar.b("TIME_CHANGE", h65.c, rlaVar, false).l();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        v7g v7gVar = (v7g) ((y8a) vl.b()).getAccessor().c(v7g.class);
        rla rlaVar = (rla) ((qla) ((qla) new qla(TaskTimeChangeWorker.class).setBackoffCriteria(mf0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("TIME_CHANGE")).build();
        hm9.n("ru.ok.messages.TimeChangeReceiver", "work " + rlaVar.getId() + " try to add TIME_CHANGE request. Schedule now");
        v7gVar.b("TIME_CHANGE", h65.a, rlaVar, false).l();
    }
}
