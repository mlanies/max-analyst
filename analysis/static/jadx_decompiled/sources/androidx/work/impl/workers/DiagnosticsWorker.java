package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.a14;
import defpackage.d24;
import defpackage.die;
import defpackage.fj4;
import defpackage.fm7;
import defpackage.h8g;
import defpackage.i8g;
import defpackage.ilc;
import defpackage.jna;
import defpackage.k8g;
import defpackage.kj3;
import defpackage.m7g;
import defpackage.mf0;
import defpackage.nu0;
import defpackage.s7g;
import defpackage.tfg;
import defpackage.xlc;
import defpackage.y7g;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final fm7 b() throws Throwable {
        xlc xlcVar;
        die dieVar;
        y7g y7gVar;
        k8g k8gVar;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        WorkDatabase workDatabase = s7g.d(getApplicationContext()).c;
        i8g i8gVarY = workDatabase.y();
        y7g y7gVarW = workDatabase.w();
        k8g k8gVarZ = workDatabase.z();
        die dieVarV = workDatabase.v();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        i8gVarY.getClass();
        xlc xlcVarA = xlc.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        xlcVarA.j(1, jCurrentTimeMillis);
        ilc ilcVar = (ilc) i8gVarY.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "state");
            int iN3 = tfg.n(cursorO, "worker_class_name");
            int iN4 = tfg.n(cursorO, "input_merger_class_name");
            int iN5 = tfg.n(cursorO, "input");
            int iN6 = tfg.n(cursorO, "output");
            int iN7 = tfg.n(cursorO, "initial_delay");
            int iN8 = tfg.n(cursorO, "interval_duration");
            int iN9 = tfg.n(cursorO, "flex_duration");
            int iN10 = tfg.n(cursorO, "run_attempt_count");
            int iN11 = tfg.n(cursorO, "backoff_policy");
            int iN12 = tfg.n(cursorO, "backoff_delay_duration");
            int iN13 = tfg.n(cursorO, "last_enqueue_time");
            int iN14 = tfg.n(cursorO, "minimum_retention_duration");
            xlcVar = xlcVarA;
            try {
                int iN15 = tfg.n(cursorO, "schedule_requested_at");
                int iN16 = tfg.n(cursorO, "run_in_foreground");
                int iN17 = tfg.n(cursorO, "out_of_quota_policy");
                int iN18 = tfg.n(cursorO, "period_count");
                int iN19 = tfg.n(cursorO, "generation");
                int iN20 = tfg.n(cursorO, "required_network_type");
                int iN21 = tfg.n(cursorO, "requires_charging");
                int iN22 = tfg.n(cursorO, "requires_device_idle");
                int iN23 = tfg.n(cursorO, "requires_battery_not_low");
                int iN24 = tfg.n(cursorO, "requires_storage_not_low");
                int iN25 = tfg.n(cursorO, "trigger_content_update_delay");
                int iN26 = tfg.n(cursorO, "trigger_max_content_delay");
                int iN27 = tfg.n(cursorO, "content_uri_triggers");
                int i6 = iN14;
                ArrayList arrayList = new ArrayList(cursorO.getCount());
                while (cursorO.moveToNext()) {
                    String string = cursorO.isNull(iN) ? null : cursorO.getString(iN);
                    m7g m7gVarV = nu0.v(cursorO.getInt(iN2));
                    String string2 = cursorO.isNull(iN3) ? null : cursorO.getString(iN3);
                    String string3 = cursorO.isNull(iN4) ? null : cursorO.getString(iN4);
                    d24 d24VarA = d24.a(cursorO.isNull(iN5) ? null : cursorO.getBlob(iN5));
                    d24 d24VarA2 = d24.a(cursorO.isNull(iN6) ? null : cursorO.getBlob(iN6));
                    long j = cursorO.getLong(iN7);
                    long j2 = cursorO.getLong(iN8);
                    long j3 = cursorO.getLong(iN9);
                    int i7 = cursorO.getInt(iN10);
                    mf0 mf0VarS = nu0.s(cursorO.getInt(iN11));
                    long j4 = cursorO.getLong(iN12);
                    long j5 = cursorO.getLong(iN13);
                    int i8 = i6;
                    long j6 = cursorO.getLong(i8);
                    int i9 = iN11;
                    int i10 = iN15;
                    long j7 = cursorO.getLong(i10);
                    iN15 = i10;
                    int i11 = iN16;
                    if (cursorO.getInt(i11) != 0) {
                        iN16 = i11;
                        i = iN17;
                        z = true;
                    } else {
                        iN16 = i11;
                        i = iN17;
                        z = false;
                    }
                    jna jnaVarU = nu0.u(cursorO.getInt(i));
                    iN17 = i;
                    int i12 = iN18;
                    int i13 = cursorO.getInt(i12);
                    iN18 = i12;
                    int i14 = iN19;
                    int i15 = cursorO.getInt(i14);
                    iN19 = i14;
                    int i16 = iN20;
                    int iT = nu0.t(cursorO.getInt(i16));
                    iN20 = i16;
                    int i17 = iN21;
                    if (cursorO.getInt(i17) != 0) {
                        iN21 = i17;
                        i2 = iN22;
                        z2 = true;
                    } else {
                        iN21 = i17;
                        i2 = iN22;
                        z2 = false;
                    }
                    if (cursorO.getInt(i2) != 0) {
                        iN22 = i2;
                        i3 = iN23;
                        z3 = true;
                    } else {
                        iN22 = i2;
                        i3 = iN23;
                        z3 = false;
                    }
                    if (cursorO.getInt(i3) != 0) {
                        iN23 = i3;
                        i4 = iN24;
                        z4 = true;
                    } else {
                        iN23 = i3;
                        i4 = iN24;
                        z4 = false;
                    }
                    if (cursorO.getInt(i4) != 0) {
                        iN24 = i4;
                        i5 = iN25;
                        z5 = true;
                    } else {
                        iN24 = i4;
                        i5 = iN25;
                        z5 = false;
                    }
                    long j8 = cursorO.getLong(i5);
                    iN25 = i5;
                    int i18 = iN26;
                    long j9 = cursorO.getLong(i18);
                    iN26 = i18;
                    int i19 = iN27;
                    iN27 = i19;
                    arrayList.add(new h8g(string, m7gVarV, string2, string3, d24VarA, d24VarA2, j, j2, j3, new kj3(iT, z2, z3, z4, z5, j8, j9, nu0.c(cursorO.isNull(i19) ? null : cursorO.getBlob(i19))), i7, mf0VarS, j4, j5, j6, j7, z, jnaVarU, i13, i15));
                    iN11 = i9;
                    i6 = i8;
                }
                cursorO.close();
                xlcVar.n();
                ArrayList arrayListH = i8gVarY.h();
                ArrayList arrayListF = i8gVarY.f();
                if (!arrayList.isEmpty()) {
                    a14 a14VarU = a14.u();
                    String str = fj4.a;
                    a14VarU.x(str, "Recently completed work:\n\n");
                    dieVar = dieVarV;
                    y7gVar = y7gVarW;
                    k8gVar = k8gVarZ;
                    a14.u().x(str, fj4.a(y7gVar, k8gVar, dieVar, arrayList));
                } else {
                    dieVar = dieVarV;
                    y7gVar = y7gVarW;
                    k8gVar = k8gVarZ;
                }
                if (!arrayListH.isEmpty()) {
                    a14 a14VarU2 = a14.u();
                    String str2 = fj4.a;
                    a14VarU2.x(str2, "Running work:\n\n");
                    a14.u().x(str2, fj4.a(y7gVar, k8gVar, dieVar, arrayListH));
                }
                if (!arrayListF.isEmpty()) {
                    a14 a14VarU3 = a14.u();
                    String str3 = fj4.a;
                    a14VarU3.x(str3, "Enqueued work:\n\n");
                    a14.u().x(str3, fj4.a(y7gVar, k8gVar, dieVar, arrayListF));
                }
                return fm7.b();
            } catch (Throwable th) {
                th = th;
                cursorO.close();
                xlcVar.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlcVar = xlcVarA;
        }
    }
}
