package defpackage;

import android.app.Notification;
import android.app.Service;

/* loaded from: classes.dex */
public abstract class laf {
    public static void a(Service service, int i, Notification notification, int i2, String str) {
        try {
            service.startForeground(i, notification, i2);
        } catch (RuntimeException e) {
            z04.u("The service must be declared with a foregroundServiceType that includes " + str);
            throw e;
        }
    }
}
