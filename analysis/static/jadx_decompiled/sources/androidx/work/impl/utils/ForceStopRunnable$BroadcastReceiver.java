package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.a14;
import defpackage.wx5;

/* loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String a = a14.O("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        a14.u().Q();
        wx5.c(context);
    }
}
