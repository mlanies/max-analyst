package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.IBinder;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class xo4 extends Service {
    public static final HashMap t0 = new HashMap();
    public int X;
    public boolean Y;
    public boolean Z;
    public final String a = null;
    public final int b = 0;
    public final int c = 0;
    public wo4 o;
    public boolean s0;

    public static void a(xo4 xo4Var, List list) {
        xo4Var.getClass();
    }

    public static boolean b(int i) {
        return i == 2 || i == 5 || i == 7;
    }

    public final void c() {
        this.o.getClass();
        if (!r0.b.k) {
            if (oaf.a >= 28 || !this.Z) {
                this.s0 |= stopSelfResult(this.X);
            } else {
                stopSelf();
                this.s0 = true;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        String str = this.a;
        if (str != null && oaf.a >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            notificationManager.getClass();
            NotificationChannel notificationChannel = new NotificationChannel(str, getString(this.b), 2);
            int i = this.c;
            if (i != 0) {
                notificationChannel.setDescription(getString(i));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Class<?> cls = getClass();
        HashMap map = t0;
        wo4 wo4Var = (wo4) map.get(cls);
        if (wo4Var == null) {
            int i2 = oaf.a;
            so4 so4Var = (so4) u88.a.getAccessor().c(so4.class);
            so4Var.c(false);
            wo4 wo4Var2 = new wo4(getApplicationContext(), so4Var, false, cls);
            map.put(cls, wo4Var2);
            wo4Var = wo4Var2;
        }
        this.o = wo4Var;
        fm9.k(wo4Var.e == null);
        wo4Var.e = this;
        if (wo4Var.b.h) {
            oaf.p(null).postAtFrontOfQueue(new kl4(wo4Var, 2, this));
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        wo4 wo4Var = this.o;
        wo4Var.getClass();
        fm9.k(wo4Var.e == this);
        wo4Var.e = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action;
        String stringExtra;
        so4 so4Var;
        this.X = i2;
        this.Z = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.Y |= intent.getBooleanExtra("foreground", false) || "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        wo4 wo4Var = this.o;
        wo4Var.getClass();
        so4Var = wo4Var.b;
        switch (action) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    z04.u("Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    int intExtra = intent.getIntExtra("stop_reason", 0);
                    so4Var.f++;
                    so4Var.c.obtainMessage(4, intExtra, 0, stringExtra).sendToTarget();
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    so4Var.f++;
                    so4Var.c.obtainMessage(8, stringExtra).sendToTarget();
                    break;
                } else {
                    z04.u("Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                so4Var.c(false);
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                so4Var.f++;
                so4Var.c.obtainMessage(9).sendToTarget();
                break;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                vo4 vo4Var = (vo4) intent.getParcelableExtra("download_request");
                if (vo4Var != null) {
                    int intExtra2 = intent.getIntExtra("stop_reason", 0);
                    so4Var.f++;
                    so4Var.c.obtainMessage(7, intExtra2, 0, vo4Var).sendToTarget();
                    break;
                } else {
                    z04.u("Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                zhc zhcVar = (zhc) intent.getParcelableExtra("requirements");
                if (zhcVar != null) {
                    if (!zhcVar.equals((zhc) so4Var.m.d)) {
                        gb0 gb0Var = so4Var.m;
                        an anVar = (an) gb0Var.f;
                        anVar.getClass();
                        Context context = (Context) gb0Var.a;
                        context.unregisterReceiver(anVar);
                        gb0Var.f = null;
                        if (oaf.a >= 24 && ((bic) gb0Var.g) != null) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            connectivityManager.getClass();
                            bic bicVar = (bic) gb0Var.g;
                            bicVar.getClass();
                            connectivityManager.unregisterNetworkCallback(bicVar);
                            gb0Var.g = null;
                        }
                        gb0 gb0Var2 = new gb0(so4Var.a, so4Var.d, zhcVar);
                        so4Var.m = gb0Var2;
                        so4Var.b(so4Var.m, gb0Var2.d());
                        break;
                    }
                } else {
                    z04.u("Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                so4Var.c(true);
                break;
            default:
                z04.u("Ignored unrecognized action: ".concat(action));
                break;
        }
        int i3 = oaf.a;
        this.s0 = false;
        if (so4Var.g == 0 && so4Var.f == 0) {
            c();
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.Z = true;
    }
}
