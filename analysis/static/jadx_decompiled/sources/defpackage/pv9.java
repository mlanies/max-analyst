package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class pv9 {
    public static String d;
    public static ov9 g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public pv9(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(str, i, notification);
            return;
        }
        lv9 lv9Var = new lv9(this.a.getPackageName(), i, str, notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new ov9(this.a.getApplicationContext());
                }
                g.b.obtainMessage(0, lv9Var).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(str, i);
    }
}
