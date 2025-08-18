package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class lt9 {
    public final Context a;
    public final tda b;
    public final p84 c;
    public final kaa d;
    public final m7b e;
    public NotificationManager f;

    public lt9(Context context, tda tdaVar, p84 p84Var, kaa kaaVar, m7b m7bVar) {
        this.a = context;
        this.b = tdaVar;
        this.c = p84Var;
        this.d = kaaVar;
        this.e = m7bVar;
    }

    public final kt9 a() {
        this.c.getClass();
        return new kt9("ru.oneme.app.new.activeCalls", this.a.getString(c2c.tt_notif_category_active_calls), false, false, null, false, null, false, 2, false);
    }

    public final kt9 b() {
        p7b p7bVar = (p7b) this.e;
        boolean z = !p7bVar.c.x("app.notification.chats.ringtone").equals("_NONE_");
        Uri uriH = h(false);
        this.c.getClass();
        return new kt9("ru.oneme.app.chats", this.a.getString(c2c.tt_notif_category_chats), z, p7bVar.c.g.getBoolean("app.notification.chats.vibrate", true), uriH, p7bVar.c.g.getBoolean("app.notification.important.priority", true), null, false, -1000, true);
    }

    public final kt9 c() {
        p7b p7bVar = (p7b) this.e;
        boolean z = !p7bVar.c.x("app.notification.ringtone").equals("_NONE_");
        Uri uriH = h(true);
        this.c.getClass();
        return new kt9("ru.oneme.app.dialogs", this.a.getString(c2c.tt_notif_category_dialogs), z, p7bVar.c.d("app.notification.vibrate", true), uriH, p7bVar.c.g.getBoolean("app.notification.important.priority", true), null, false, -1000, true);
    }

    public final kt9 d() {
        this.b.getClass();
        this.c.getClass();
        return new kt9("ru.oneme.app.inapp.2", this.a.getString(c2c.tt_notif_category_inapp), true, ((p7b) this.e).c.g.getBoolean("app.notification.in.app.vibrate", true), null, false, new long[]{0, 100}, false, -1000, true);
    }

    public final void e(kt9 kt9Var) {
        StringBuilder sb = new StringBuilder("createChannel: ");
        String str = kt9Var.a;
        sb.append(str);
        hm9.n("lt9", sb.toString());
        int i = kt9Var.c ? kt9Var.f ? 4 : 3 : 2;
        if (kt9Var.h) {
            i = 5;
        }
        int i2 = kt9Var.i;
        if (i2 != -1000) {
            i = i2;
        }
        NotificationChannel notificationChannel = new NotificationChannel(str, kt9Var.b, i);
        Uri uri = kt9Var.e;
        if (uri != null) {
            this.c.getClass();
            notificationChannel.setSound(uri, new AudioAttributes.Builder().setContentType(4).setUsage(str.equals("ru.oneme.app.new.incomingCalls.") ? 6 : 5).build());
        } else {
            notificationChannel.setSound(null, null);
        }
        notificationChannel.enableVibration(kt9Var.d);
        long[] jArr = kt9Var.g;
        if (jArr != null && jArr.length > 0) {
            notificationChannel.setVibrationPattern(jArr);
        }
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(this.b.d());
        String strB = this.d.b(str);
        if (strB != null) {
            notificationChannel.setGroup(strB);
        }
        notificationChannel.setShowBadge(kt9Var.j);
        i().createNotificationChannel(notificationChannel);
    }

    public final void f() {
        kaa kaaVar = this.d;
        List<NotificationChannelGroup> notificationChannelGroups = ((NotificationManager) kaaVar.e.getValue()).getNotificationChannelGroups();
        if (notificationChannelGroups != null) {
            xs xsVar = new xs(0);
            Iterator<T> it = notificationChannelGroups.iterator();
            while (it.hasNext()) {
                xsVar.add(((NotificationChannelGroup) it.next()).getId());
            }
            if (!xsVar.contains("ru.oneme.app.notifications.group.chats")) {
                kaaVar.a(dpc.z, "ru.oneme.app.notifications.group.chats");
            }
            if (!xsVar.contains("ru.oneme.app.notifications.group.other")) {
                kaaVar.a(dpc.A, "ru.oneme.app.notifications.group.other");
            }
            if (!xsVar.contains("ru.oneme.app.notifications.group.calls")) {
                kaaVar.a(dpc.y, "ru.oneme.app.notifications.group.calls");
            }
        }
        List<NotificationChannel> notificationChannels = i().getNotificationChannels();
        HashSet hashSet = new HashSet();
        Iterator<NotificationChannel> it2 = notificationChannels.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().getId());
        }
        this.c.getClass();
        if (!hashSet.contains("ru.oneme.app.chats")) {
            e(b());
            hashSet.add("ru.oneme.app.chats");
        }
        if (!hashSet.contains("ru.oneme.app.dialogs")) {
            e(c());
            hashSet.add("ru.oneme.app.dialogs");
        }
        boolean zContains = hashSet.contains("ru.oneme.app.misc");
        m7b m7bVar = this.e;
        Context context = this.a;
        if (!zContains) {
            e(new kt9("ru.oneme.app.misc", context.getString(c2c.tt_notif_category_misc), !r3.c.x("app.notification.ringtone").equals("_NONE_"), ((p7b) m7bVar).c.d("app.notification.vibrate", true), h(true), false, null, false, -1000, false));
            hashSet.add("ru.oneme.app.misc");
        }
        if (!hashSet.contains("ru.oneme.app.inapp.2")) {
            e(d());
            hashSet.add("ru.oneme.app.inapp.2");
        }
        if (!hashSet.contains("ru.oneme.app.fileUpload")) {
            e(new kt9("ru.oneme.app.fileUpload", context.getString(c2c.tt_notif_category_file_loading), false, false, null, false, null, false, -1000, false));
            hashSet.add("ru.oneme.app.fileUpload");
        }
        if (!hashSet.contains("ru.oneme.app.media")) {
            e(new kt9("ru.oneme.app.media", context.getString(c2c.tt_notif_category_media), true, false, null, false, null, false, -1000, false));
            hashSet.add("ru.oneme.app.media");
        }
        if (hashSet.contains("ru.oneme.app.incomingCalls")) {
            try {
                i().deleteNotificationChannel("ru.oneme.app.incomingCalls");
            } catch (Throwable unused) {
            }
        }
        if (hashSet.contains("ru.oneme.app.activeCalls")) {
            try {
                i().deleteNotificationChannel("ru.oneme.app.activeCalls");
            } catch (Throwable unused2) {
            }
        }
        if (!hashSet.contains("ru.oneme.app.new.incomingCalls.")) {
            e(new kt9("ru.oneme.app.new.incomingCalls.", context.getString(c2c.tt_notif_category_incoming_calls), false, ((p7b) m7bVar).c.d("app.notification.vibrate", true), null, true, null, true, -1000, false));
            hashSet.add("ru.oneme.app.new.incomingCalls.");
        }
        if (!hashSet.contains("ru.oneme.app.new.activeCalls")) {
            e(a());
            hashSet.add("ru.oneme.app.new.activeCalls");
        }
        if (hashSet.contains("ru.oneme.app.liveLocation")) {
            return;
        }
        e(new kt9("ru.oneme.app.liveLocation", context.getString(c2c.tt_notif_category_live_location), false, false, null, false, null, false, -1000, false));
        hashSet.add("ru.oneme.app.liveLocation");
    }

    public final NotificationChannel g(String str) {
        if (oag.t(str)) {
            return null;
        }
        for (NotificationChannel notificationChannel : i().getNotificationChannels()) {
            if (str.equals(notificationChannel.getId())) {
                return notificationChannel;
            }
        }
        return null;
    }

    public final Uri h(boolean z) {
        p7b p7bVar = (p7b) this.e;
        String strX = z ? p7bVar.c.x("app.notification.ringtone") : p7bVar.c.x("app.notification.chats.ringtone");
        if (!"DEFAULT".equals(strX)) {
            return Uri.parse(strX);
        }
        this.b.getClass();
        return Settings.System.DEFAULT_NOTIFICATION_URI;
    }

    public final NotificationManager i() {
        if (this.f == null) {
            this.f = (NotificationManager) this.a.getSystemService("notification");
        }
        return this.f;
    }
}
