package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import one.me.android.MainActivity;
import ru.ok.tamtam.android.services.NotificationTamService;

/* loaded from: classes.dex */
public final class bea {
    public final Context a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public pv9 h;
    public NotificationManager i;
    public final String j;
    public final String k;

    public bea(String str, String str2, Context context, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6) {
        this.a = context;
        this.d = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.e = je7Var4;
        this.f = je7Var6;
        this.g = je7Var5;
        c();
        this.j = str;
        this.k = str2;
    }

    public final void a(int i) {
        ((tda) this.d.getValue()).getClass();
        b(i, null);
    }

    public final void b(int i, String str) {
        Locale locale = Locale.ENGLISH;
        hm9.n("bea", "cancel: notificationId = " + i + ", notificationTag = " + str);
        j(true).b.cancel(str, i);
    }

    public final void c() {
        try {
            ((lt9) this.e.getValue()).f();
        } catch (Throwable th) {
            hm9.p("bea", "fail to create missing channels", th);
            ((o45) this.f.getValue()).a(th);
        }
    }

    public final List d(String str) {
        try {
            List listAsList = Arrays.asList(i().getActiveNotifications());
            if (oag.t(str)) {
                return listAsList;
            }
            if ((listAsList instanceof Collection) && listAsList.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : listAsList) {
                try {
                    if (str.equals(((StatusBarNotification) obj).getTag())) {
                        arrayList.add(obj);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return Collections.emptyList();
        }
    }

    public final mt9 e(ql2 ql2Var, int i, int i2) {
        int i3 = NotificationTamService.u0;
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) NotificationTamService.class);
        intent.setAction("ru.ok.tamtam.action.DIRECT_REPLY");
        intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", ql2Var.c);
        intent.putExtra("ru.ok.tamtam.extra.PUSH_ID", ql2Var.a);
        intent.putExtra("ru.ok.tamtam.extra.EVENT_KEY", ql2Var.b);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", ql2Var.l);
        PendingIntent service = PendingIntent.getService(context, i, intent, oag.I(intent, oag.m(134217728)));
        HashSet hashSet = new HashSet();
        vfc vfcVar = new vfc("ru.ok.tamtam.extra.TEXT_REPLY", context.getString(c2c.tt_reply), null, true, 0, new Bundle(), hashSet);
        mt9 mt9Var = new mt9(i2, context.getString(c2c.tt_reply), service);
        mt9Var.f = new ArrayList();
        mt9Var.f.add(vfcVar);
        mt9Var.g = 1;
        mt9Var.h = false;
        return mt9Var;
    }

    public final Intent f(boolean z) {
        vw7.c.getClass();
        Intent intentK = k(vw7.a2(null, z));
        if (z) {
            intentK.putExtra("push_action", "push_action_open_chats");
        }
        return intentK;
    }

    public final mt9 g(ql2 ql2Var, int i, int i2) {
        int i3 = NotificationTamService.u0;
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) NotificationTamService.class);
        intent.setAction("ru.ok.tamtam.action.MARK_AS_READ");
        intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", ql2Var.c);
        intent.putExtra("ru.ok.tamtam.extra.MARK", ql2Var.m);
        intent.putExtra("ru.ok.tamtam.extra.PUSH_ID", ql2Var.a);
        intent.putExtra("ru.ok.tamtam.extra.EVENT_KEY", ql2Var.b);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", ql2Var.l);
        mt9 mt9Var = new mt9(i2, context.getString(c2c.tt_mark_as_read), PendingIntent.getService(context, i, intent, oag.I(intent, oag.m(201326592))));
        mt9Var.g = 2;
        mt9Var.h = false;
        return mt9Var;
    }

    public final bu9 h(String str, boolean z, boolean z2) {
        boolean zD;
        String strX;
        Uri uri;
        c();
        bu9 bu9Var = new bu9(this.a, str);
        je7 je7Var = this.d;
        ((tda) je7Var.getValue()).getClass();
        bu9Var.F.icon = avb.ic_notification;
        bu9Var.x = ((tda) je7Var.getValue()).d();
        bu9Var.i(16, true);
        bu9Var.f(((tda) je7Var.getValue()).a.getString(yzb.oneme_app_name));
        bu9Var.z = str;
        jp jpVar = ((p7b) ((m7b) this.b.getValue())).c;
        je7 je7Var2 = this.c;
        if (((lqf) ((zp) je7Var2.getValue())).c()) {
            zD = jpVar.g.getBoolean("app.notification.in.app.vibrate", true);
            strX = jpVar.d("app.notification.in.app.sound", true) ? jpVar.x("app.notification.ringtone") : null;
        } else {
            zD = jpVar.d("app.notification.vibrate", true);
            strX = jpVar.x("app.notification.ringtone");
        }
        int i = 0;
        boolean z3 = jpVar.g.getBoolean("app.notification.important.priority", true) && !((lqf) ((zp) je7Var2.getValue())).c();
        int iE = jpVar.e("app.notification.led.color", jpVar.v());
        if (z) {
            if (zD) {
                i = 2;
            } else {
                bu9Var.F.vibrate = new long[0];
            }
            if (strX == null || "_NONE_".equals(strX)) {
                bu9Var.p(null);
            } else {
                if ("DEFAULT".equals(strX)) {
                    ((tda) je7Var.getValue()).getClass();
                    uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                } else {
                    uri = Uri.parse(strX);
                }
                bu9Var.p(uri);
            }
            bu9Var.g(i);
        }
        if (iE != 0) {
            Notification notification = bu9Var.F;
            notification.ledARGB = iE;
            notification.ledOnMS = 1000;
            notification.ledOffMS = 1000;
            notification.flags = (notification.flags & (-2)) | 1;
        }
        if (z3) {
            bu9Var.k = 2;
        }
        bu9Var.u = z2;
        return bu9Var;
    }

    public final NotificationManager i() {
        if (this.i == null) {
            this.i = (NotificationManager) this.a.getSystemService("notification");
            c();
        }
        return this.i;
    }

    public final pv9 j(boolean z) {
        if (this.h == null) {
            this.h = new pv9(this.a);
        }
        if (z) {
            c();
        }
        return this.h;
    }

    public final Intent k(c64 c64Var) {
        vw7.c.getClass();
        Context context = this.a;
        String str = this.j;
        String str2 = this.k;
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("CUSTOM_DEEP_LINK");
        vw7.c.getClass();
        intent.setData(Uri.parse(str + "://" + str2 + "/" + c64Var.b));
        return intent;
    }

    public final void l(bu9 bu9Var, Intent intent, Intent intent2, int i, String str) {
        Context context = this.a;
        bu9Var.g = oag.p(context, i, intent);
        if (intent2 != null) {
            bu9Var.F.deleteIntent = PendingIntent.getService(context, i, intent2, oag.I(intent2, oag.m(134217728)));
        }
        Notification notificationB = bu9Var.b();
        ((tda) this.d.getValue()).e();
        j(true).a(str, i, notificationB);
        hm9.h0("bea", "notify: tag = %s, id = %d, %s", str, Integer.valueOf(i), notificationB);
    }

    public final void m() {
        try {
            lt9 lt9Var = (lt9) this.e.getValue();
            lt9Var.c.getClass();
            NotificationChannel notificationChannelG = lt9Var.g("ru.oneme.app.new.activeCalls");
            kt9 kt9VarA = lt9Var.a();
            if (notificationChannelG == null) {
                lt9Var.e(kt9VarA);
            } else if (notificationChannelG.getSound() != null || notificationChannelG.shouldVibrate() || notificationChannelG.getAudioAttributes() != null || notificationChannelG.getImportance() != 2) {
                lt9Var.i().deleteNotificationChannel("ru.oneme.app.new.activeCalls");
                lt9Var.e(kt9VarA);
            }
            hm9.n("bea", "recreateActiveCallChannelIfNeeded: created = $created");
        } catch (Throwable th) {
            hm9.p("bea", "recreateActiveCallChannelIfNeeded", th);
        }
    }
}
