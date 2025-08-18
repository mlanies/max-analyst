package ru.ok.messages.analytics;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.ad;
import defpackage.aua;
import defpackage.dt2;
import defpackage.dua;
import defpackage.e47;
import defpackage.ep;
import defpackage.fm7;
import defpackage.gh3;
import defpackage.hm9;
import defpackage.ilc;
import defpackage.j1e;
import defpackage.je7;
import defpackage.jv9;
import defpackage.k24;
import defpackage.kl7;
import defpackage.ky7;
import defpackage.qec;
import defpackage.rh4;
import defpackage.ti4;
import defpackage.u8e;
import defpackage.xe6;
import defpackage.xlc;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ok/messages/analytics/DailyAnalyticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lad;", "analytics", "Lep;", "appNotifications", "Lgh3;", "connectionInfo", "Lti4;", "deviceInfo", "Lu8e;", "storeServicesInfo", "Laua;", "permissionStats", "Lje7;", "Lk24;", "dataManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lad;Lep;Lgh3;Lti4;Lu8e;Laua;Lje7;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class DailyAnalyticsWorker extends Worker {
    public static final qec t0 = new qec("\\s+");
    public final ti4 X;
    public final u8e Y;
    public final aua Z;
    public final ad b;
    public final ep c;
    public final gh3 o;
    public final je7 s0;

    public DailyAnalyticsWorker(Context context, WorkerParameters workerParameters, ad adVar, ep epVar, gh3 gh3Var, ti4 ti4Var, u8e u8eVar, aua auaVar, je7 je7Var) {
        super(context, workerParameters);
        this.b = adVar;
        this.c = epVar;
        this.o = gh3Var;
        this.X = ti4Var;
        this.Y = u8eVar;
        this.Z = auaVar;
        this.s0 = je7Var;
    }

    @Override // androidx.work.Worker
    public final fm7 b() {
        hm9.n("ru.ok.messages.analytics.DailyAnalyticsWorker", "work " + getId() + " started");
        aua auaVar = this.Z;
        auaVar.getClass();
        ky7 ky7Var = new ky7();
        kl7 kl7VarL = j1e.l();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            ky7 ky7Var2 = new ky7();
            ky7Var2.put("pType", "push");
            ky7Var2.put("pStatus", aua.c(auaVar.d));
            kl7VarL.add(ky7Var2.b());
        }
        ky7 ky7Var3 = new ky7();
        ky7Var3.put("pType", "contacts");
        ky7Var3.put("pStatus", aua.c(auaVar.e));
        kl7VarL.add(ky7Var3.b());
        ky7 ky7Var4 = new ky7();
        ky7Var4.put("pType", "gallery");
        dua duaVar = auaVar.f;
        ky7Var4.put("pStatus", i < 34 ? aua.c(duaVar) : duaVar.j() ? "allowed" : auaVar.g.j() ? "partial" : "denied");
        kl7VarL.add(ky7Var4.b());
        ky7 ky7Var5 = new ky7();
        ky7Var5.put("pType", "camera");
        ky7Var5.put("pStatus", aua.c(auaVar.h));
        kl7VarL.add(ky7Var5.b());
        ky7 ky7Var6 = new ky7();
        ky7Var6.put("pType", "microphone");
        ky7Var6.put("pStatus", aua.c(auaVar.i));
        kl7VarL.add(ky7Var6.b());
        ky7 ky7Var7 = new ky7();
        ky7Var7.put("pType", "geo");
        ky7Var7.put("pStatus", aua.c(auaVar.j));
        kl7VarL.add(ky7Var7.b());
        ky7Var.put("permissions", j1e.d(kl7VarL));
        auaVar.d("permission_status", ky7Var.b());
        String str = jv9.a(this.c.a().j(false).b) ? "1" : "0";
        ad adVar = this.b;
        adVar.g("ACTION_ARE_NOTIFICATIONS_ENABLED", str);
        dt2 dt2VarC = ((k24) this.s0.getValue()).b.c();
        dt2VarC.getClass();
        xlc xlcVarA = xlc.a(0, "SELECT COUNT(*) FROM chats");
        ilc ilcVar = dt2VarC.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            long j = cursorO.moveToFirst() ? cursorO.getLong(0) : 0L;
            cursorO.close();
            xlcVarA.n();
            String str2 = this.o.a() ? "1" : "0";
            String strValueOf = String.valueOf(j);
            if (!adVar.a().c()) {
                e47 e47Var = new e47();
                e47Var.c = "ACTION";
                e47Var.o = "ACTION_IS_BACKGROUND_DATA_ENABLED";
                e47Var.a(str2, "value");
                e47Var.a(strValueOf, "param1");
                adVar.j(e47Var.c());
            }
            ti4 ti4Var = this.X;
            Context context = ti4Var.a;
            if (ti4Var.d == null) {
                ti4Var.d = (PowerManager) context.getSystemService("power");
            }
            boolean zIsIgnoringBatteryOptimizations = ti4Var.d.isIgnoringBatteryOptimizations(context.getPackageName());
            hm9.n("ri4", "isIgnoringBatteryOptimizations: " + zIsIgnoringBatteryOptimizations);
            adVar.g("ACTION_IS_IGNORING_BATTERY_OPTIMIZATIONS", zIsIgnoringBatteryOptimizations ? "1" : "0");
            xe6 xe6Var = (xe6) this.Y;
            adVar.g("ARE_SERVICES_AVAILABLE", t0.b("_", rh4.j(xe6Var.f, "-", xe6Var.a() ? "1" : "0").toLowerCase(Locale.ENGLISH)));
            hm9.n("ru.ok.messages.analytics.DailyAnalyticsWorker", "work " + getId() + " finished");
            return fm7.b();
        } catch (Throwable th) {
            cursorO.close();
            xlcVarA.n();
            throw th;
        }
    }
}
