package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.a14;
import defpackage.s7g;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = a14.O("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a14.u().n(a, "Received intent " + intent);
        try {
            s7g s7gVarD = s7g.d(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            s7gVarD.getClass();
            synchronized (s7g.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = s7gVarD.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    s7gVarD.i = pendingResultGoAsync;
                    if (s7gVarD.h) {
                        pendingResultGoAsync.finish();
                        s7gVarD.i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e) {
            a14.u().r(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
