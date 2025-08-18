package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class phe implements w45 {
    public static final String u0 = a14.O("SystemAlarmDispatcher");
    public final s7g X;
    public final d73 Y;
    public final ArrayList Z;
    public final Context a;
    public final wne b;
    public final n8g c;
    public final y9b o;
    public Intent s0;
    public ohe t0;

    public phe(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.Y = new d73(applicationContext, new bdb(6));
        s7g s7gVarD = s7g.d(context);
        this.X = s7gVarD;
        this.c = new n8g(s7gVarD.b.e);
        y9b y9bVar = s7gVarD.f;
        this.o = y9bVar;
        this.b = s7gVarD.d;
        y9bVar.a(this);
        this.Z = new ArrayList();
        this.s0 = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(Intent intent, int i) {
        a14 a14VarU = a14.u();
        String str = u0;
        a14VarU.n(str, "Adding command " + intent + " (" + i + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            a14.u().R(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.Z) {
                try {
                    Iterator it = this.Z.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.Z) {
            try {
                boolean z = !this.Z.isEmpty();
                this.Z.add(intent);
                if (!z) {
                    d();
                }
            } finally {
            }
        }
    }

    @Override // defpackage.w45
    public final void b(l7g l7gVar, boolean z) {
        k40 k40Var = (k40) ((bkb) this.b).c;
        String str = d73.X;
        Intent intent = new Intent(this.a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        d73.d(intent, l7gVar);
        k40Var.execute(new eo(this, intent, 0, 4));
    }

    public final void d() {
        c();
        PowerManager.WakeLock wakeLockA = qrf.a(this.a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.X.d.l(new nhe(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
