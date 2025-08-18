package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class wx5 implements Runnable {
    public static final String X = a14.O("ForceStopRunnable");
    public static final long Y = TimeUnit.DAYS.toMillis(3650);
    public final Context a;
    public final s7g b;
    public final wmc c;
    public int o = 0;

    public wx5(Context context, s7g s7gVar) {
        this.a = context.getApplicationContext();
        this.b = s7gVar;
        this.c = s7gVar.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + Y;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx5.a():void");
    }

    public final boolean b() {
        this.b.b.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = X;
        if (zIsEmpty) {
            a14.u().n(str, "The default process name was not specified.");
            return true;
        }
        int i = t9b.a;
        boolean zF = tpa.f(rk.a.a(), this.a.getApplicationInfo().processName);
        a14.u().n(str, "Is default app process = " + zF);
        return zF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = X;
        s7g s7gVar = this.b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    mr0.O(this.a);
                    a14.u().n(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e) {
                        int i = this.o + 1;
                        this.o = i;
                        if (i >= 3) {
                            a14.u().r(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            s7gVar.b.getClass();
                            throw illegalStateException;
                        }
                        a14.u().o(str, "Retrying after " + (i * 300), e);
                        try {
                            Thread.sleep(this.o * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    a14.u().q(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    s7gVar.b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            s7gVar.f();
        }
    }
}
