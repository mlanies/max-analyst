package defpackage;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class vhe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Notification b;
    public final /* synthetic */ int c;
    public final /* synthetic */ SystemForegroundService o;

    public vhe(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.o = systemForegroundService;
        this.a = i;
        this.b = notification;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        int i2 = this.c;
        Notification notification = this.b;
        int i3 = this.a;
        SystemForegroundService systemForegroundService = this.o;
        if (i >= 31) {
            xhe.a(systemForegroundService, i3, notification, i2);
        } else {
            whe.a(systemForegroundService, i3, notification, i2);
        }
    }
}
