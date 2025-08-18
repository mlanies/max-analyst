package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class nt3 {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if ((i & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (ngg.m(context, str2) == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException(zr6.i("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
