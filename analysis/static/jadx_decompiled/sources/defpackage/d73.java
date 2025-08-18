package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d73 implements w45 {
    public static final String X = a14.O("CommandHandler");
    public final Context a;
    public final HashMap b = new HashMap();
    public final Object c = new Object();
    public final bdb o;

    public d73(Context context, bdb bdbVar) {
        this.a = context;
        this.o = bdbVar;
    }

    public static l7g c(Intent intent) {
        return new l7g(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, l7g l7gVar) {
        intent.putExtra("KEY_WORKSPEC_ID", l7gVar.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", l7gVar.b);
    }

    public final void a(Intent intent, int i, phe pheVar) {
        List<yzd> listK;
        int i2 = 4;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            a14.u().n(X, "Handling constraints changed " + intent);
            mj3 mj3Var = new mj3(this.a, i, pheVar);
            ArrayList arrayListI = pheVar.X.c.y().i();
            String str = vi3.a;
            Iterator it = arrayListI.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                kj3 kj3Var = ((h8g) it.next()).j;
                z |= kj3Var.d;
                z2 |= kj3Var.b;
                z3 |= kj3Var.e;
                z4 |= kj3Var.a != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = mj3Var.a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            adb adbVar = mj3Var.c;
            adbVar.w(arrayListI);
            ArrayList arrayList = new ArrayList(arrayListI.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = arrayListI.iterator();
            while (it2.hasNext()) {
                h8g h8gVar = (h8g) it2.next();
                String str3 = h8gVar.a;
                if (jCurrentTimeMillis >= h8gVar.a() && (!h8gVar.c() || adbVar.b(str3))) {
                    arrayList.add(h8gVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                h8g h8gVar2 = (h8g) it3.next();
                String str4 = h8gVar2.a;
                l7g l7gVarN = ju0.n(h8gVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, l7gVarN);
                a14.u().n(mj3.d, zr6.i("Creating a delay_met command for workSpec with id (", str4, ")"));
                ((k40) ((bkb) pheVar.b).c).execute(new eo(pheVar, intent3, mj3Var.b, i2));
            }
            adbVar.x();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            a14.u().n(X, "Handling reschedule " + intent + ", " + i);
            pheVar.X.g();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            a14.u().q(X, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l7g l7gVarC = c(intent);
            String str5 = X;
            a14.u().n(str5, "Handling schedule work for " + l7gVarC);
            WorkDatabase workDatabase = pheVar.X.c;
            workDatabase.c();
            try {
                h8g h8gVarL = workDatabase.y().l(l7gVarC.a);
                if (h8gVarL == null) {
                    a14.u().R(str5, "Skipping scheduling " + l7gVarC + " because it's no longer in the DB");
                } else if (h8gVarL.b.a()) {
                    a14.u().R(str5, "Skipping scheduling " + l7gVarC + "because it is finished.");
                } else {
                    long jA = h8gVarL.a();
                    boolean zC = h8gVarL.c();
                    Context context2 = this.a;
                    if (zC) {
                        a14.u().n(str5, "Opportunistically setting an alarm for " + l7gVarC + "at " + jA);
                        mc.b(context2, workDatabase, l7gVarC, jA);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        ((k40) ((bkb) pheVar.b).c).execute(new eo(pheVar, intent4, i, i2));
                    } else {
                        a14.u().n(str5, "Setting up Alarms for " + l7gVarC + "at " + jA);
                        mc.b(context2, workDatabase, l7gVarC, jA);
                    }
                    workDatabase.r();
                }
                return;
            } finally {
                workDatabase.l();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.c) {
                try {
                    l7g l7gVarC2 = c(intent);
                    a14 a14VarU = a14.u();
                    String str6 = X;
                    a14VarU.n(str6, "Handing delay met for " + l7gVarC2);
                    if (this.b.containsKey(l7gVarC2)) {
                        a14.u().n(str6, "WorkSpec " + l7gVarC2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        kg4 kg4Var = new kg4(this.a, i, pheVar, this.o.o(l7gVarC2));
                        this.b.put(l7gVarC2, kg4Var);
                        kg4Var.d();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                a14.u().R(X, "Ignoring intent " + intent);
                return;
            }
            l7g l7gVarC3 = c(intent);
            boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            a14.u().n(X, "Handling onExecutionCompleted " + intent + ", " + i);
            b(l7gVarC3, z5);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        bdb bdbVar = this.o;
        if (zContainsKey) {
            int i3 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            yzd yzdVarJ = bdbVar.j(new l7g(string, i3));
            listK = arrayList2;
            if (yzdVarJ != null) {
                arrayList2.add(yzdVarJ);
                listK = arrayList2;
            }
        } else {
            listK = bdbVar.k(string);
        }
        for (yzd yzdVar : listK) {
            a14.u().n(X, wg0.i("Handing stopWork work for ", string));
            s7g s7gVar = pheVar.X;
            s7gVar.d.l(new k8e(s7gVar, yzdVar, false));
            WorkDatabase workDatabase2 = pheVar.X.c;
            l7g l7gVar = yzdVar.a;
            String str7 = mc.a;
            die dieVarV = workDatabase2.v();
            cie cieVarX = dieVarV.x(l7gVar);
            if (cieVarX != null) {
                mc.a(this.a, l7gVar, cieVarX.c);
                a14.u().n(mc.a, "Removing SystemIdInfo for workSpecId (" + l7gVar + ")");
                ilc ilcVar = (ilc) dieVarV.a;
                ilcVar.b();
                zkc zkcVar = (zkc) dieVarV.c;
                q36 q36VarF = zkcVar.f();
                String str8 = l7gVar.a;
                if (str8 == null) {
                    q36VarF.W(1);
                } else {
                    q36VarF.f(1, str8);
                }
                q36VarF.j(2, l7gVar.b);
                ilcVar.c();
                try {
                    q36VarF.n();
                    ilcVar.r();
                } finally {
                    ilcVar.l();
                    zkcVar.t(q36VarF);
                }
            }
            pheVar.b(yzdVar.a, false);
        }
    }

    @Override // defpackage.w45
    public final void b(l7g l7gVar, boolean z) {
        synchronized (this.c) {
            try {
                kg4 kg4Var = (kg4) this.b.remove(l7gVar);
                this.o.j(l7gVar);
                if (kg4Var != null) {
                    kg4Var.e(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
