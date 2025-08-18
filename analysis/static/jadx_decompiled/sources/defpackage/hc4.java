package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;

/* loaded from: classes.dex */
public abstract class hc4 {
    public static void a(NotificationManager notificationManager, String str, String str2) {
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, 2);
        if (oaf.a <= 27) {
            notificationChannel.setShowBadge(false);
        }
        notificationManager.createNotificationChannel(notificationChannel);
    }
}
