package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.a14;
import defpackage.h76;
import defpackage.hh7;
import defpackage.ly1;
import defpackage.s7g;
import defpackage.the;
import defpackage.uhe;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends hh7 implements the {
    public static final String Y = a14.O("SystemFgService");
    public NotificationManager X;
    public Handler b;
    public boolean c;
    public uhe o;

    public final void a() {
        this.b = new Handler(Looper.getMainLooper());
        this.X = (NotificationManager) getApplicationContext().getSystemService("notification");
        uhe uheVar = new uhe(getApplicationContext());
        this.o = uheVar;
        if (uheVar.t0 != null) {
            a14.u().q(uhe.u0, "A callback already exists.");
        } else {
            uheVar.t0 = this;
        }
    }

    @Override // defpackage.hh7, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.hh7, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.o.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.c;
        String str = Y;
        if (z) {
            a14.u().x(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.o.g();
            a();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        uhe uheVar = this.o;
        uheVar.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = uhe.u0;
        if (zEquals) {
            a14.u().x(str2, "Started foreground service " + intent);
            uheVar.b.l(new h76((Object) uheVar, (Object) intent.getStringExtra("KEY_WORKSPEC_ID"), false, 26));
            uheVar.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            uheVar.e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            a14.u().x(str2, "Stopping foreground service");
            the theVar = uheVar.t0;
            if (theVar == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) theVar;
            systemForegroundService.c = true;
            a14.u().n(str, "All commands completed.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
        a14.u().x(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID uuidFromString = UUID.fromString(stringExtra);
        s7g s7gVar = uheVar.a;
        s7gVar.getClass();
        s7gVar.d.l(new ly1(s7gVar, uuidFromString));
        return 3;
    }
}
