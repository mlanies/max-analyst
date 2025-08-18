package one.me.calls.impl.service;

import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import defpackage.b31;
import defpackage.b95;
import defpackage.bea;
import defpackage.bu9;
import defpackage.c95;
import defpackage.d04;
import defpackage.d95;
import defpackage.dk1;
import defpackage.eua;
import defpackage.gcf;
import defpackage.gl1;
import defpackage.gu9;
import defpackage.hl1;
import defpackage.hm9;
import defpackage.hz4;
import defpackage.i95;
import defpackage.il1;
import defpackage.j1e;
import defpackage.j47;
import defpackage.je7;
import defpackage.jl1;
import defpackage.k8;
import defpackage.khe;
import defpackage.kr1;
import defpackage.l31;
import defpackage.l40;
import defpackage.p84;
import defpackage.tpa;
import defpackage.ts1;
import defpackage.us1;
import defpackage.v25;
import defpackage.vs1;
import defpackage.wbd;
import defpackage.wr1;
import defpackage.xa1;
import defpackage.xuc;
import defpackage.y21;
import defpackage.ya1;
import defpackage.z7;
import kotlin.Metadata;
import one.me.android.calls.CallNotifierBroadcastReceiver;
import one.me.android.calls.CallNotifierFixActivity;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lone/me/calls/impl/service/CallServiceImpl;", "Landroid/app/Service;", "<init>", "()V", "gl1", "hl1", "calls-impl_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallServiceImpl extends Service {
    public static final hl1 s0 = new hl1();
    public static Handler t0;
    public static final wbd u0;
    public MediaSession Z;
    public final khe a = new khe(new dk1(2));
    public final khe b = new khe(new dk1(3));
    public final khe c = new khe(new dk1(4));
    public final khe o = new khe(new dk1(5));
    public final khe X = new khe(new dk1(6));
    public final khe Y = new khe(new dk1(7));

    static {
        wbd wbdVar = new wbd();
        wbdVar.add(-1);
        wbdVar.add(2);
        wbdVar.add(32);
        if (Build.VERSION.SDK_INT >= 30) {
            wbdVar.add(128);
            wbdVar.add(64);
        }
        u0 = z7.a(wbdVar);
    }

    public final vs1 a() {
        return (vs1) this.a.getValue();
    }

    public final void b(int i, Notification notification, boolean z, boolean z2) {
        int i2;
        khe kheVar = this.X;
        try {
            if (Build.VERSION.SDK_INT < 34) {
                i2 = -1;
            } else {
                i2 = ((eua) kheVar.getValue()).b(eua.h) ? 130 : 2;
                if (((eua) kheVar.getValue()).b(eua.l)) {
                    i2 |= 64;
                }
                if (((xuc) this.o.getValue()).c() || z2) {
                    i2 |= 32;
                }
            }
            hm9.n("CallServiceTag", "CallService start foreground with particular types: ".concat(hl1.a(i2)));
            a().a();
            startForeground(i, notification, i2);
            hm9.n("CallServiceTag", "CallService crosscheck types: ".concat(hl1.a(getForegroundServiceType())));
        } catch (Throwable th) {
            hm9.p("CallServiceTag", "CallService can't start foreground service due to " + th.getMessage() + ". Try to start with simple permissions.", th);
            try {
                startForeground(i, notification, Build.VERSION.SDK_INT < 34 ? -1 : 2);
                hm9.n("CallServiceTag", "CallService started with types: ".concat(hl1.a(getForegroundServiceType())));
            } catch (Exception unused) {
                hm9.p("CallServiceTag", "CallService can't start foreground service. Try show usual notification isIncoming=" + z + ".", th);
                if (z) {
                    vs1 vs1VarA = a();
                    vs1VarA.getClass();
                    hm9.n("CallsNotification", "showNotification id=" + i + " notification");
                    vs1VarA.e().a(null, i, notification);
                }
            }
        }
    }

    public final void c(d04 d04Var, y21 y21Var, boolean z) {
        PendingIntent broadcast;
        boolean z2;
        PendingIntent broadcast2;
        PendingIntent broadcast3;
        boolean zF = tpa.f(y21Var, y21.h);
        boolean z3 = d04Var.g;
        j1e j1eVar = d04Var.a;
        if (zF) {
            hm9.n("CallServiceTag", "CallService show default push due to chat info is empty.");
            b(239, a().c(this, y21Var, j1eVar != null ? j1eVar.A() : false, z3), true, z);
            return;
        }
        hz4 hz4Var = hz4.a;
        if (!z3 || d04Var.f) {
            hm9.n("CallServiceTag", "CallService show active notification.");
            vs1 vs1VarA = a();
            CharSequence charSequence = y21Var.c;
            String string = charSequence != null ? charSequence.toString() : null;
            vs1VarA.getClass();
            hm9.n("CallsNotification", "showActiveCallNotification");
            ((bea) vs1VarA.d.getValue()).m();
            if (string == null) {
                string = (String) vs1VarA.f.getValue();
            }
            Bitmap bitmap = (Bitmap) j47.f0(hz4Var, new ts1(vs1VarA, y21Var.d, null));
            ((p84) vs1VarA.c.getValue()).getClass();
            bu9 bu9Var = new bu9(this, "ru.oneme.app.new.activeCalls");
            bu9Var.k = -1;
            bu9Var.v = "call";
            bu9Var.F.icon = ((Number) vs1VarA.j.getValue()).intValue();
            je7 je7Var = vs1VarA.i;
            bu9Var.f = bu9.c((String) je7Var.getValue());
            bu9Var.e = bu9.c(string);
            ya1 ya1VarD = vs1VarA.d();
            bu9Var.g = ya1VarD.a(ya1VarD.c(), new k8(22));
            bu9Var.i(2, true);
            ya1 ya1VarD2 = vs1VarA.d();
            bu9Var.h = ya1VarD2.a(ya1VarD2.c(), new k8(22));
            bu9Var.i(128, false);
            Application applicationC = vs1VarA.d().c();
            if (gcf.a >= 31) {
                Intent intent = new Intent(applicationC, (Class<?>) CallNotifierFixActivity.class);
                intent.setAction("action-finished-call");
                broadcast = PendingIntent.getActivity(applicationC, 0, intent, 201326592);
            } else {
                Intent intent2 = new Intent(applicationC, (Class<?>) CallNotifierBroadcastReceiver.class);
                intent2.setAction("action-finished-call");
                broadcast = PendingIntent.getBroadcast(applicationC, 0, intent2, 201326592);
            }
            PendingIntent pendingIntent = broadcast;
            if (pendingIntent != null) {
                bu9Var.q(new gu9(2, vs1.b(string, (String) je7Var.getValue(), bitmap), pendingIntent, null, null));
            }
            b(239, bu9Var.b(), false, z);
            return;
        }
        hm9.n("CallServiceTag", "CallService show incoming notification.");
        vs1 vs1VarA2 = a();
        boolean zA = j1eVar != null ? j1eVar.A() : false;
        vs1VarA2.getClass();
        hm9.n("CallsNotification", "showIncomingCallNotification");
        CharSequence charSequence2 = y21Var.c;
        if (charSequence2 == null) {
            charSequence2 = (String) vs1VarA2.f.getValue();
        }
        Bitmap bitmap2 = (Bitmap) j47.f0(hz4Var, new us1(vs1VarA2, y21Var, null));
        ((p84) vs1VarA2.c.getValue()).getClass();
        bu9 bu9Var2 = new bu9(this, "ru.oneme.app.new.incomingCalls.");
        bu9Var2.F.icon = zA ? ((Number) vs1VarA2.k.getValue()).intValue() : ((Number) vs1VarA2.j.getValue()).intValue();
        bu9Var2.e = bu9.c(charSequence2);
        je7 je7Var2 = vs1VarA2.g;
        je7 je7Var3 = vs1VarA2.h;
        bu9Var2.f = bu9.c(zA ? (String) je7Var3.getValue() : (String) je7Var2.getValue());
        bu9Var2.k = 2;
        bu9Var2.i(2, true);
        bu9Var2.i(16, true);
        Application applicationC2 = vs1VarA2.d().c();
        int i = gcf.a;
        if (i >= 31) {
            Intent intent3 = new Intent(applicationC2, (Class<?>) CallNotifierFixActivity.class);
            ya1.b(intent3, y21Var, zA);
            z2 = false;
            broadcast2 = PendingIntent.getActivity(applicationC2, 0, intent3, 201326592);
        } else {
            z2 = false;
            Intent intent4 = new Intent(applicationC2, (Class<?>) CallNotifierBroadcastReceiver.class);
            ya1.b(intent4, y21Var, zA);
            broadcast2 = PendingIntent.getBroadcast(applicationC2, 0, intent4, 201326592);
        }
        bu9Var2.h = broadcast2;
        bu9Var2.i(128, true);
        bu9Var2.l = z2;
        bu9Var2.v = "call";
        ya1 ya1VarD3 = vs1VarA2.d();
        PendingIntent pendingIntentA = ya1VarD3.a(ya1VarD3.c(), new xa1(ya1VarD3, y21Var, zA));
        if (pendingIntentA != null) {
            Application applicationC3 = vs1VarA2.d().c();
            if (i >= 31) {
                Intent intent5 = new Intent(applicationC3, (Class<?>) CallNotifierFixActivity.class);
                intent5.setAction("action-decline-call");
                broadcast3 = PendingIntent.getActivity(applicationC3, 0, intent5, 201326592);
            } else {
                Intent intent6 = new Intent(applicationC3, (Class<?>) CallNotifierBroadcastReceiver.class);
                intent6.setAction("action-decline-call");
                broadcast3 = PendingIntent.getBroadcast(applicationC3, 0, intent6, 201326592);
            }
            PendingIntent pendingIntent2 = broadcast3;
            if (pendingIntent2 != null) {
                bu9Var2.q(new gu9(1, vs1.b(charSequence2, zA ? (String) je7Var3.getValue() : (String) je7Var2.getValue(), bitmap2), null, pendingIntent2, pendingIntentA));
            }
        }
        b(240, bu9Var2.b(), true, z);
    }

    @Override // android.app.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        hm9.n("CallServiceTag", "CallService onCreate");
        d04 d04Var = (d04) ((wr1) ((kr1) this.b.getValue())).I.getValue();
        y21 y21Var = (y21) ((l31) ((b31) this.c.getValue())).k.getValue();
        vs1 vs1VarA = a();
        j1e j1eVar = d04Var.a;
        b(239, vs1VarA.c(this, y21Var, j1eVar != null ? j1eVar.A() : false, d04Var.g), true, false);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        hm9.n("CallServiceTag", "service call onDestroy");
        a().a();
        MediaSession mediaSession = this.Z;
        if (mediaSession != null) {
            mediaSession.release();
            hm9.n("CallServiceTag", "media session stop");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        hm9.n("CallServiceTag", "CallService onStartCommand");
        khe kheVar = this.b;
        d04 d04Var = (d04) ((wr1) ((kr1) kheVar.getValue())).I.getValue();
        y21 y21Var = (y21) ((l31) ((b31) this.c.getValue())).k.getValue();
        if (!d04Var.g || ((wr1) ((kr1) kheVar.getValue())).q()) {
            MediaSession mediaSession = this.Z;
            if (mediaSession != null) {
                mediaSession.release();
                hm9.n("CallServiceTag", "media session stop");
            }
        } else if (this.Z == null) {
            jl1 jl1Var = new jl1(this);
            MediaSession mediaSession2 = new MediaSession(this, "CallServiceTag");
            mediaSession2.setFlags(3);
            mediaSession2.setPlaybackState(new PlaybackState.Builder().setState(3, 0L, 0.0f).build());
            mediaSession2.setPlaybackToRemote(jl1Var);
            mediaSession2.setCallback(new il1());
            mediaSession2.setActive(true);
            this.Z = mediaSession2;
            hm9.n("CallServiceTag", "media session started");
        }
        if (intent != null) {
            v25 v25Var = gl1.Y;
            if (v25Var.get(intent.getIntExtra("ACTION", 0)) != gl1.b) {
                if (v25Var.get(intent.getIntExtra("ACTION", 0)) == gl1.a) {
                    hm9.n("CallServiceTag", "CallService start.");
                    return 2;
                }
                i95 i95Var = d04Var.j;
                if ((i95Var instanceof c95) || (i95Var instanceof b95) || (i95Var instanceof d95)) {
                    hm9.n("CallServiceTag", "CallService finished due to call is failed or finished.");
                    hl1.c().postDelayed(new l40(i2, 3, this), 500L);
                    return 2;
                }
                if (v25Var.get(intent.getIntExtra("ACTION", 0)) == gl1.c) {
                    hm9.n("CallServiceTag", "CallService restart.");
                    c(d04Var, y21Var, false);
                    return 2;
                }
                if (v25Var.get(intent.getIntExtra("ACTION", 0)) != gl1.o) {
                    hm9.n("CallServiceTag", "CallService simple start, no action.");
                    return 2;
                }
                hm9.n("CallServiceTag", "CallService restart for screen sharing.");
                c(d04Var, y21Var, true);
                return 2;
            }
        }
        hm9.n("CallServiceTag", "CallService finished.");
        hl1.c().postDelayed(new l40(-1, 3, this), 500L);
        return 2;
    }
}
