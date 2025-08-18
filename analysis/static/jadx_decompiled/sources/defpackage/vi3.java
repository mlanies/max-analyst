package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public abstract class vi3 extends BroadcastReceiver {
    public static final String a = a14.O("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a14.u().n(a, "onReceive : " + intent);
        String str = d73.X;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
