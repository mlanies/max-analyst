package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public abstract class mc {
    public static final String a = a14.O("Alarms");

    public static void a(Context context, l7g l7gVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = d73.X;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        d73.d(intent, l7gVar);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        a14.u().n(a, "Cancelling existing alarm with (workSpecId, systemId) (" + l7gVar + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, l7g l7gVar, long j) {
        die dieVarV = workDatabase.v();
        cie cieVarX = dieVarV.x(l7gVar);
        if (cieVarX != null) {
            int i = cieVarX.c;
            a(context, l7gVar, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = d73.X;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            d73.d(intent, l7gVar);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                lc.a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        int iIntValue = ((Number) workDatabase.p(new l5(6, new re6(16, workDatabase)))).intValue();
        dieVarV.A(new cie(l7gVar.a, l7gVar.b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = d73.X;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        d73.d(intent2, l7gVar);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            lc.a(alarmManager2, 0, j, service2);
        }
    }
}
