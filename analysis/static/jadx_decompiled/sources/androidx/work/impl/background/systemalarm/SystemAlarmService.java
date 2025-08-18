package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import defpackage.a14;
import defpackage.hh7;
import defpackage.ohe;
import defpackage.phe;
import defpackage.qrf;
import defpackage.rrf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemAlarmService extends hh7 implements ohe {
    public static final String o = a14.O("SystemAlarmService");
    public phe b;
    public boolean c;

    public final void a() {
        this.c = true;
        a14.u().n(o, "All commands completed in dispatcher");
        String str = qrf.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (rrf.a) {
            linkedHashMap.putAll(rrf.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                a14.u().R(qrf.a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // defpackage.hh7, android.app.Service
    public final void onCreate() {
        super.onCreate();
        phe pheVar = new phe(this);
        this.b = pheVar;
        if (pheVar.t0 != null) {
            a14.u().q(phe.u0, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            pheVar.t0 = this;
        }
        this.c = false;
    }

    @Override // defpackage.hh7, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        phe pheVar = this.b;
        pheVar.getClass();
        a14.u().n(phe.u0, "Destroying SystemAlarmDispatcher");
        pheVar.o.e(pheVar);
        pheVar.t0 = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            a14.u().x(o, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            phe pheVar = this.b;
            pheVar.getClass();
            a14 a14VarU = a14.u();
            String str = phe.u0;
            a14VarU.n(str, "Destroying SystemAlarmDispatcher");
            pheVar.o.e(pheVar);
            pheVar.t0 = null;
            phe pheVar2 = new phe(this);
            this.b = pheVar2;
            if (pheVar2.t0 != null) {
                a14.u().q(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                pheVar2.t0 = this;
            }
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.a(intent, i2);
        return 3;
    }
}
