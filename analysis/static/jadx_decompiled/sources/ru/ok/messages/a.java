package ru.ok.messages;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.a14;
import defpackage.ad;
import defpackage.aua;
import defpackage.bea;
import defpackage.bu9;
import defpackage.c64;
import defpackage.cn7;
import defpackage.cy7;
import defpackage.e52;
import defpackage.eoe;
import defpackage.ep;
import defpackage.fm7;
import defpackage.gh3;
import defpackage.gm7;
import defpackage.hle;
import defpackage.hm9;
import defpackage.je7;
import defpackage.jpc;
import defpackage.m7b;
import defpackage.nu0;
import defpackage.p7b;
import defpackage.p82;
import defpackage.p8g;
import defpackage.qj6;
import defpackage.qx9;
import defpackage.s8g;
import defpackage.t6b;
import defpackage.tda;
import defpackage.ti4;
import defpackage.tme;
import defpackage.u8e;
import defpackage.uaa;
import defpackage.v00;
import defpackage.vw7;
import defpackage.wp4;
import defpackage.xp4;
import defpackage.zqe;
import defpackage.zr6;
import defpackage.zt9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;
import ru.ok.messages.TimeChangeReceiver;
import ru.ok.messages.analytics.DailyAnalyticsWorker;
import ru.ok.messages.controllers.NotificationDraftScheduler$TaskNotificationDraftWorker;
import ru.ok.messages.location.StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker;
import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;
import ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker;

/* loaded from: classes2.dex */
public final class a extends p8g {
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final je7 n;
    public final je7 o;
    public final je7 p;
    public final je7 q;
    public final je7 r;

    public a(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9, je7 je7Var10, je7 je7Var11, je7 je7Var12, je7 je7Var13, je7 je7Var14, je7 je7Var15, je7 je7Var16, je7 je7Var17) {
        this.b = je7Var17;
        this.c = je7Var;
        this.d = je7Var2;
        this.e = je7Var3;
        this.f = je7Var4;
        this.g = je7Var5;
        this.h = je7Var6;
        this.i = je7Var7;
        this.j = je7Var8;
        this.k = je7Var9;
        this.l = je7Var10;
        this.m = je7Var11;
        this.n = je7Var12;
        this.o = je7Var13;
        this.p = je7Var14;
        this.q = je7Var15;
        this.r = je7Var16;
    }

    @Override // defpackage.p8g
    public final gm7 a(final Context context, String str, final WorkerParameters workerParameters) {
        boolean zEquals = str.equals(DailyAnalyticsWorker.class.getName());
        je7 je7Var = this.d;
        if (zEquals) {
            return new DailyAnalyticsWorker(context, workerParameters, (ad) this.c.getValue(), (ep) je7Var.getValue(), (gh3) this.e.getValue(), (ti4) this.f.getValue(), (u8e) this.g.getValue(), (aua) this.r.getValue(), this.b);
        }
        boolean zEquals2 = str.equals(TaskMonitor$TaskMonitorWorker.class.getName());
        je7 je7Var2 = this.h;
        if (zEquals2) {
            return new TaskMonitor$TaskMonitorWorker(context, workerParameters, (eoe) this.i.getValue(), (hle) this.q.getValue(), (s8g) this.j.getValue(), ((p7b) ((m7b) je7Var2.getValue())).a);
        }
        if (str.equals(HeartbeatScheduler$TaskHeartbeatWorker.class.getName())) {
            return new HeartbeatScheduler$TaskHeartbeatWorker(context, workerParameters, (qj6) this.k.getValue());
        }
        if (str.equals(TimeChangeReceiver.TaskTimeChangeWorker.class.getName())) {
            return new TimeChangeReceiver.TaskTimeChangeWorker(context, workerParameters, (t6b) this.l.getValue(), (p82) this.m.getValue(), (cy7) this.n.getValue(), (tme) this.o.getValue());
        }
        if (str.equals(NotificationDraftScheduler$TaskNotificationDraftWorker.class.getName())) {
            final wp4 wp4Var = (wp4) ((ep) je7Var.getValue()).m.getValue();
            return new Worker(context, workerParameters, wp4Var) { // from class: ru.ok.messages.controllers.NotificationDraftScheduler$TaskNotificationDraftWorker
                public final wp4 b;

                {
                    this.b = wp4Var;
                }

                @Override // androidx.work.Worker
                public final fm7 b() {
                    String str2;
                    Intent intentK;
                    Handler handler = a14.i;
                    hm9.n("a14", "work " + getId() + " started");
                    xp4 xp4Var = (xp4) this.b;
                    xp4Var.getClass();
                    hm9.n("xp4", "notifyDrafts");
                    ArrayList arrayList = new ArrayList();
                    v00 v00Var = p82.I;
                    ArrayList arrayListD = xp4Var.e.D(p82.M, true, null);
                    Collections.sort(arrayListD, v00Var);
                    Iterator it = Collections.unmodifiableList(arrayListD).iterator();
                    while (it.hasNext()) {
                        uaa uaaVar = ((e52) it.next()).b.f0;
                    }
                    if (arrayList.isEmpty()) {
                        hm9.n("xp4", "notifyDrafts: no drafts");
                    } else {
                        p7b p7bVar = xp4Var.b;
                        p7bVar.a.j("app.draftsChanged", false);
                        int size = arrayList.size();
                        bea beaVar = xp4Var.c;
                        Context context2 = xp4Var.a;
                        if (size > 1) {
                            hm9.n("xp4", "notifyDrafts: multiple chats");
                            str2 = String.format(context2.getString(jpc.J1), Integer.valueOf(arrayList.size()));
                            intentK = beaVar.f(false);
                        } else {
                            e52 e52Var = (e52) arrayList.get(0);
                            if (!e52Var.M() || e52Var.l() == null) {
                                hm9.n("xp4", "notifyDrafts: chat");
                                String string = context2.getString(jpc.H1);
                                String str3 = e52Var.b.g;
                                int i = zqe.a;
                                str2 = String.format(string, (str3 == null || str3.length() == 0) ? "" : zr6.i("\"", str3, "\""));
                            } else {
                                hm9.n("xp4", "notifyDrafts: dialog");
                                str2 = String.format(context2.getString(jpc.I1), e52Var.l().d());
                            }
                            beaVar.getClass();
                            vw7.c.getClass();
                            intentK = beaVar.k(new c64(zr6.k(new StringBuilder(":chats?id="), e52Var.a, "&type=local")));
                        }
                        Intent intent = intentK;
                        xp4Var.d.getClass();
                        p7bVar.c.getClass();
                        bu9 bu9VarH = beaVar.h("ru.oneme.app.misc", false, false);
                        bu9VarH.e(str2);
                        zt9 zt9Var = new zt9(0);
                        zt9Var.f = bu9.c(str2);
                        bu9VarH.q(zt9Var);
                        ((tda) beaVar.d.getValue()).getClass();
                        beaVar.l(bu9VarH, intent, null, 2, null);
                    }
                    Handler handler2 = a14.i;
                    hm9.n("a14", "work " + getId() + " finished");
                    return fm7.b();
                }
            };
        }
        if (str.equals(StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker.class.getName())) {
            final cn7 cn7Var = (cn7) this.p.getValue();
            return new Worker(context, workerParameters, cn7Var) { // from class: ru.ok.messages.location.StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker
                public final cn7 b;

                {
                    this.b = cn7Var;
                }

                @Override // androidx.work.Worker
                public final fm7 b() {
                    int i = nu0.E0;
                    hm9.n("nu0", "work " + getId() + " started");
                    this.b.getClass();
                    hm9.n("nu0", "work " + getId() + " finished");
                    return fm7.b();
                }
            };
        }
        if (str.equals(NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker.class.getName())) {
            return new NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker(context, workerParameters, (qx9) ((ep) je7Var.getValue()).h.getValue(), ((p7b) ((m7b) je7Var2.getValue())).a);
        }
        return null;
    }
}
