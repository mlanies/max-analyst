package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public abstract class xhe {
    public static void a(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            a14.u().S(SystemForegroundService.Y, "Unable to start foreground service", e);
        }
    }
}
