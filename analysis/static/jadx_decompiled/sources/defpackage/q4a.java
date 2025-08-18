package defpackage;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import one.me.android.OneMeApplication;
import one.me.android.di.ConcurrentComponent;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.RLottie;
import one.me.sdk.media.ffmpeg.WebmConfig;
import one.me.sdk.uikit.qr.QrCodeGenerator;
import org.apache.http.util.LangUtils;
import ru.ok.messages.analytics.DailyAnalyticsWorker;
import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;
import ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class q4a implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ q4a(int i) {
        this.a = i;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        int i = 10;
        int i2 = 27;
        int i3 = 9;
        boolean z = false;
        int i4 = 0;
        z = false;
        int i5 = 5;
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        switch (this.a) {
            case 0:
                int i9 = OneMeApplication.s0;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, "Concurrency", zr6.h(((Number) sd3.b.getValue()).intValue(), "ioPoolSize="), null);
                }
                return e5f.a;
            case 1:
                int i10 = OneMeApplication.s0;
                ((jy8) jyc.a.getAccessor().c(jy8.class)).a();
                return e5f.a;
            case 2:
                int i11 = OneMeApplication.s0;
                mp4 mp4Var = (mp4) jyc.a.getAccessor().c(mp4.class);
                if (mp4Var.e.compareAndSet(false, true)) {
                    mp4Var.a.b(new dd4(i5, mp4Var));
                }
                return e5f.a;
            case 3:
                int i12 = OneMeApplication.s0;
                jyc jycVar = jyc.a;
                jva jvaVar = (jva) ((bva) jycVar.getAccessor().c(bva.class));
                jvaVar.Z.add((lva) jycVar.getAccessor().c(lva.class));
                el3 el3VarG = jycVar.g();
                CopyOnWriteArraySet copyOnWriteArraySet = jvaVar.Z;
                copyOnWriteArraySet.add(el3VarG);
                copyOnWriteArraySet.add((ike) jycVar.getAccessor().c(ike.class));
                return e5f.a;
            case 4:
                int i13 = OneMeApplication.s0;
                jyc jycVar2 = jyc.a;
                if (jycVar2.d().d() && !jycVar2.d().e()) {
                    z = true;
                }
                xie xieVar = (xie) bcf.a.getAccessor().c(xie.class);
                j47.T(xieVar.s0, null, null, new wie(xieVar, z, null), 3);
                return e5f.a;
            case 5:
                int i14 = OneMeApplication.s0;
                return e5f.a;
            case 6:
                int i15 = OneMeApplication.s0;
                return e5f.a;
            case 7:
                int i16 = OneMeApplication.s0;
                fd1 fd1Var = (fd1) y8a.a.getAccessor().c(fd1.class);
                iq1 iq1Var = fd1Var.d;
                if (iq1Var == null || iq1Var.h()) {
                    s28 s28Var = new s28(new o28(((hd1) fd1Var.a.getValue()).a.n().h(yb9.a), 2, lq9.b), mq9.c, 1);
                    List listEmptyList = Collections.emptyList();
                    Objects.requireNonNull(listEmptyList, "defaultItem is null");
                    rqd rqdVar = new rqd(new e0a(new q28(new ib3(s28Var, i7, listEmptyList).m((ztc) fd1Var.b.getValue()), new jj9(i7), i6), new un0(8), i6).w(new v00(5)).i((ztc) fd1Var.c.getValue()), new un0(i3), i8);
                    un0 un0Var = new un0(i);
                    iq1 iq1Var2 = new iq1(new ync(16, fd1Var), 2, ft.f);
                    Objects.requireNonNull(iq1Var2, "observer is null");
                    try {
                        rqdVar.k(new tqd(i8, un0Var, iq1Var2));
                        fd1Var.d = iq1Var2;
                    } catch (NullPointerException e) {
                        throw e;
                    } catch (Throwable th) {
                        c37.B(th);
                        NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                        nullPointerException.initCause(th);
                        throw nullPointerException;
                    }
                }
                return e5f.a;
            case 8:
                int i17 = OneMeApplication.s0;
                return e5f.a;
            case 9:
                int i18 = OneMeApplication.s0;
                vl vlVar = (vl) y8a.a.getAccessor().c(vl.class);
                vlVar.getClass();
                sme.b0 = vlVar;
                hm9.n("vl", "onCreate finish");
                bcf.a.b().getClass();
                k7d.a = 1;
                o84.Z = new t7d();
                u7d.a.add(new r4a());
                return e5f.a;
            case 10:
                int i19 = OneMeApplication.s0;
                y8a y8aVar = y8a.a;
                zf0 zf0Var = (zf0) y8aVar.getAccessor().c(zf0.class);
                zn5 zn5VarB = zf0Var.c.b();
                int i20 = ft4.o;
                od2.L(new zn5(new ac(new qw(new zn5(nu0.Q(zn5VarB, z7.R(1, kt4.SECONDS)), new xf0(2, null)), i6), 3, zf0Var), new yf0(zf0Var, null), 5), zf0Var.o);
                ((and) y8aVar.getAccessor().c(and.class)).d();
                return e5f.a;
            case 11:
                int i21 = OneMeApplication.s0;
                sj6 sj6Var = (sj6) jyc.a.getAccessor().c(sj6.class);
                sj6Var.getClass();
                mta mtaVar = (mta) ((lta) new lta(HeartbeatScheduler$TaskHeartbeatWorker.class, 15L, TimeUnit.MINUTES).addTag("HEART_BEAT")).build();
                hm9.m("sj6", "work %s try to add %s request", mtaVar.getId(), "HEART_BEAT");
                v7g.e(sj6Var.a, "HEART_BEAT", 2, mtaVar, true, 8);
                return e5f.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                int i22 = OneMeApplication.s0;
                jyc jycVar3 = jyc.a;
                yle yleVar = (yle) jycVar3.getAccessor().c(yle.class);
                if (yleVar.Y.get() == null) {
                    yleVar.i();
                }
                yleVar.f(true);
                hbd hbdVar = (hbd) jycVar3.getAccessor().c(hbd.class);
                djc djcVar = (djc) y8a.a.getAccessor().c(djc.class);
                q0e q0eVar = djcVar.o;
                int i23 = ft4.o;
                nu0.z(new zn5(new m58(nu0.Q(q0eVar, z7.R(10, kt4.SECONDS)), 29), new cjc(djcVar, null), 5), djcVar.c);
                ((jbd) hbdVar).a(djcVar);
                return e5f.a;
            case 13:
                int i24 = OneMeApplication.s0;
                return e5f.a;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                int i25 = OneMeApplication.s0;
                n6a n6aVar = (n6a) y8a.a.getAccessor().c(n6a.class);
                t33 t33Var = (t33) n6aVar.b;
                String string = t33Var.g.getString("version.force.update.received", "");
                n6aVar.d.getClass();
                if (!tpa.f(string, "25.8.1")) {
                    t33Var.m("version.force.update.received", null);
                }
                return e5f.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                int i26 = OneMeApplication.s0;
                ((s8g) y8a.a.getAccessor().c(s8g.class)).a(new f8d());
                return e5f.a;
            case 16:
                int i27 = OneMeApplication.s0;
                rr3 rr3Var = (rr3) y8a.a.getAccessor().c(rr3.class);
                rr3Var.a.d(rr3Var);
                return e5f.a;
            case LangUtils.HASH_SEED /* 17 */:
                int i28 = OneMeApplication.s0;
                ks1 ks1Var = (ks1) y8a.a.getAccessor().c(ks1.class);
                ks1Var.getClass();
                ks1Var.z0.b(new is1(ks1Var, i6));
                return e5f.a;
            case 18:
                int i29 = OneMeApplication.s0;
                y8a y8aVar2 = y8a.a;
                y8aVar2.l().i = new sy4(22, y8aVar2.b());
                return e5f.a;
            case 19:
                int i30 = OneMeApplication.s0;
                jyc jycVar4 = jyc.a;
                jycVar4.g().b();
                jycVar4.f().e();
                return e5f.a;
            case 20:
                int i31 = OneMeApplication.s0;
                ((x6a) y8a.a.getAccessor().c(x6a.class)).getClass();
                return Boolean.FALSE;
            case 21:
                int i32 = OneMeApplication.s0;
                ConcurrentComponent.INSTANCE.getExecutors().c().execute(new nn6(27, new ey1(24, new khe(new q4a(i2)))));
                return e5f.a;
            case 22:
                int i33 = OneMeApplication.s0;
                ((tme) y8a.a.getAccessor().c(tme.class)).f();
                return e5f.a;
            case 23:
                int i34 = OneMeApplication.s0;
                qec qecVar = DailyAnalyticsWorker.t0;
                v7g v7gVar = (v7g) jyc.a.getAccessor().c(v7g.class);
                mta mtaVar2 = (mta) ((lta) ((lta) new lta(DailyAnalyticsWorker.class, 1L, TimeUnit.DAYS).setConstraints(new kj3(1, false, false, false, false, -1L, -1L, x53.H0(new LinkedHashSet())))).addTag("ru.ok.messages.analytics.DailyAnalyticsWorker")).build();
                hm9.n("ru.ok.messages.analytics.DailyAnalyticsWorker", "work " + mtaVar2.getId() + " try to add ru.ok.messages.analytics.DailyAnalyticsWorker request");
                v7g.e(v7gVar, "ru.ok.messages.analytics.DailyAnalyticsWorker", 2, mtaVar2, false, 24);
                return e5f.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                int i35 = OneMeApplication.s0;
                cw9 cw9Var = (cw9) jyc.a.getAccessor().c(cw9.class);
                cw9Var.getClass();
                hm9.n("NotificationTrackerCleanupScheduler", "schedule task");
                TimeUnit timeUnit = TimeUnit.DAYS;
                v7g.e(cw9Var.a, "NotificationTrackerCleanupScheduler", 2, (mta) ((lta) ((lta) new lta(NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker.class, 7L, timeUnit).setInitialDelay(7L, timeUnit)).addTag("NotificationTrackerCleanupScheduler")).build(), true, 8);
                return e5f.a;
            case 25:
                int i36 = OneMeApplication.s0;
                ((wc7) y8a.a.getAccessor().c(wc7.class)).a();
                return e5f.a;
            case 26:
                int i37 = OneMeApplication.s0;
                if (QrCodeGenerator.b) {
                    QrCodeGenerator.a.getClass();
                    hm9.n("QrCodeGenerator", "Native library (qrcode) was successfully loaded");
                }
                return e5f.a;
            case 27:
                int i38 = OneMeApplication.s0;
                return (hq7) y8a.a.getAccessor().c(hq7.class);
            case 28:
                int i39 = OneMeApplication.s0;
                y8a y8aVar3 = y8a.a;
                tu0.l = (jm9) y8aVar3.getAccessor().c(jm9.class);
                RLottie.init((RLottie.Config) y8aVar3.getAccessor().c(RLottie.Config.class));
                WebmConfig.init((WebmConfig.Config) y8aVar3.getAccessor().c(WebmConfig.Config.class));
                return e5f.a;
            default:
                int i40 = OneMeApplication.s0;
                cz4 cz4Var = (cz4) y8a.a.getAccessor().c(cz4.class);
                gy4 gy4Var = (gy4) cz4Var.e.getValue();
                int length = ((Bitmap[]) gy4Var.a.a).length - 1;
                if (length >= 0) {
                    while (true) {
                        gy4Var.g.computeIfAbsent(Integer.valueOf(i4), new di(i3, new m8(i4, i7, gy4Var)));
                        if (i4 != length) {
                            i4++;
                        }
                    }
                }
                return e5f.a;
        }
    }
}
