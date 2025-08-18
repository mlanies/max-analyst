package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class kg4 implements e7g, l8g {
    public static final String x0 = a14.O("DelayMetCommandHandler");
    public final adb X;
    public final Object Y;
    public int Z;
    public final Context a;
    public final int b;
    public final l7g c;
    public final phe o;
    public final qm s0;
    public final k40 t0;
    public PowerManager.WakeLock u0;
    public boolean v0;
    public final yzd w0;

    public kg4(Context context, int i, phe pheVar, yzd yzdVar) {
        this.a = context;
        this.b = i;
        this.o = pheVar;
        this.c = yzdVar.a;
        this.w0 = yzdVar;
        c8d c8dVar = pheVar.X.j;
        bkb bkbVar = (bkb) pheVar.b;
        this.s0 = (qm) bkbVar.a;
        this.t0 = (k40) bkbVar.c;
        this.X = new adb(c8dVar, this);
        this.v0 = false;
        this.Z = 0;
        this.Y = new Object();
    }

    public static void b(kg4 kg4Var) {
        l7g l7gVar = kg4Var.c;
        String str = l7gVar.a;
        int i = kg4Var.Z;
        String str2 = x0;
        if (i >= 2) {
            a14.u().n(str2, "Already stopped work for " + str);
            return;
        }
        kg4Var.Z = 2;
        a14.u().n(str2, "Stopping work for WorkSpec " + str);
        Context context = kg4Var.a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        d73.d(intent, l7gVar);
        phe pheVar = kg4Var.o;
        int i2 = kg4Var.b;
        eo eoVar = new eo(pheVar, intent, i2, 4);
        k40 k40Var = kg4Var.t0;
        k40Var.execute(eoVar);
        if (!pheVar.o.d(l7gVar.a)) {
            a14.u().n(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        a14.u().n(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        d73.d(intent2, l7gVar);
        k40Var.execute(new eo(pheVar, intent2, i2, 4));
    }

    @Override // defpackage.e7g
    public final void a(List list) {
        this.s0.execute(new jg4(this, 0));
    }

    public final void c() {
        synchronized (this.Y) {
            try {
                this.X.x();
                this.o.c.a(this.c);
                PowerManager.WakeLock wakeLock = this.u0;
                if (wakeLock != null && wakeLock.isHeld()) {
                    a14.u().n(x0, "Releasing wakelock " + this.u0 + "for WorkSpec " + this.c);
                    this.u0.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str = this.c.a;
        this.u0 = qrf.a(this.a, zr6.j(rh4.o(str, " ("), this.b, ")"));
        a14 a14VarU = a14.u();
        String str2 = "Acquiring wakelock " + this.u0 + "for WorkSpec " + str;
        String str3 = x0;
        a14VarU.n(str3, str2);
        this.u0.acquire();
        h8g h8gVarL = this.o.X.c.y().l(str);
        if (h8gVarL == null) {
            this.s0.execute(new jg4(this, 0));
            return;
        }
        boolean zC = h8gVarL.c();
        this.v0 = zC;
        if (zC) {
            this.X.w(Collections.singletonList(h8gVarL));
            return;
        }
        a14.u().n(str3, "No constraints for " + str);
        f(Collections.singletonList(h8gVarL));
    }

    public final void e(boolean z) {
        a14 a14VarU = a14.u();
        StringBuilder sb = new StringBuilder("onExecuted ");
        l7g l7gVar = this.c;
        sb.append(l7gVar);
        sb.append(", ");
        sb.append(z);
        a14VarU.n(x0, sb.toString());
        c();
        int i = this.b;
        phe pheVar = this.o;
        k40 k40Var = this.t0;
        Context context = this.a;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            d73.d(intent, l7gVar);
            k40Var.execute(new eo(pheVar, intent, i, 4));
        }
        if (this.v0) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            k40Var.execute(new eo(pheVar, intent2, i, 4));
        }
    }

    @Override // defpackage.e7g
    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (ju0.n((h8g) it.next()).equals(this.c)) {
                this.s0.execute(new jg4(this, 1));
                return;
            }
        }
    }
}
