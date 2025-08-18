package androidx.work.impl.model;

import android.database.Cursor;
import defpackage.a14;
import defpackage.d24;
import defpackage.h65;
import defpackage.h8g;
import defpackage.ilc;
import defpackage.jna;
import defpackage.kj3;
import defpackage.lz7;
import defpackage.m7g;
import defpackage.mf0;
import defpackage.nu0;
import defpackage.q36;
import defpackage.q8g;
import defpackage.r25;
import defpackage.tfg;
import defpackage.x8g;
import defpackage.xlc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkersQueueDao_Impl implements WorkersQueueDao {
    private final ilc __db;
    private final r25 __insertionAdapterOfWorkerQueueItem;
    private final r25 __insertionAdapterOfWorkerQueueItem_1;

    public WorkersQueueDao_Impl(ilc ilcVar) {
        this.__db = ilcVar;
        this.__insertionAdapterOfWorkerQueueItem = new x8g(this, ilcVar, 0);
        this.__insertionAdapterOfWorkerQueueItem_1 = new x8g(this, ilcVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String __ExistingWorkPolicy_enumToString(h65 h65Var) {
        int iOrdinal = h65Var.ordinal();
        if (iOrdinal == 0) {
            return "REPLACE";
        }
        if (iOrdinal == 1) {
            return "KEEP";
        }
        if (iOrdinal == 2) {
            return "APPEND";
        }
        if (iOrdinal == 3) {
            return "APPEND_OR_REPLACE";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + h65Var);
    }

    private h65 __ExistingWorkPolicy_stringToEnum(String str) {
        str.getClass();
        switch (str) {
            case "APPEND_OR_REPLACE":
                return h65.o;
            case "KEEP":
                return h65.b;
            case "REPLACE":
                return h65.a;
            case "APPEND":
                return h65.c;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public boolean contains(List<String> list) {
        this.__db.c();
        try {
            boolean zContains = super.contains(list);
            this.__db.r();
            return zContains;
        } finally {
            this.__db.l();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public int count(int i) {
        xlc xlcVarA = xlc.a(1, "SELECT COUNT(*) FROM WorkerQueueItem WHERE state = ?");
        xlcVarA.j(1, i);
        this.__db.b();
        Cursor cursorO = this.__db.o(xlcVarA, null);
        try {
            return cursorO.moveToFirst() ? cursorO.getInt(0) : 0;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void delete(List<String> list) {
        this.__db.b();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM WorkerQueueItem WHERE uuid IN (");
        a14.c(sb, list.size());
        sb.append(")");
        q36 q36VarD = this.__db.d(sb.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                q36VarD.W(i);
            } else {
                q36VarD.f(i, str);
            }
            i++;
        }
        this.__db.c();
        try {
            q36VarD.n();
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public List<q8g> getItemsForRunning(int i) {
        this.__db.c();
        try {
            List<q8g> itemsForRunning = super.getItemsForRunning(i);
            this.__db.r();
            return itemsForRunning;
        } finally {
            this.__db.l();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void insert(q8g q8gVar) {
        this.__db.c();
        try {
            super.insert(q8gVar);
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void insertOrIgnore(q8g q8gVar) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfWorkerQueueItem.C(q8gVar);
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void insertOrReplace(q8g q8gVar) {
        this.__db.b();
        this.__db.c();
        try {
            this.__insertionAdapterOfWorkerQueueItem_1.C(q8gVar);
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public List<q8g> select(int i) throws Throwable {
        xlc xlcVar;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        WorkersQueueDao_Impl workersQueueDao_Impl = this;
        xlc xlcVarA = xlc.a(1, "SELECT * FROM WorkerQueueItem ORDER BY time ASC LIMIT ?");
        xlcVarA.j(1, i);
        workersQueueDao_Impl.__db.b();
        Cursor cursorO = workersQueueDao_Impl.__db.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "uuid");
            int iN2 = tfg.n(cursorO, "uniqueWorkName");
            int iN3 = tfg.n(cursorO, "existingWorkPolicy");
            int iN4 = tfg.n(cursorO, "tags");
            int iN5 = tfg.n(cursorO, "time");
            int iN6 = tfg.n(cursorO, "state");
            int iN7 = tfg.n(cursorO, "work_spec_id");
            int iN8 = tfg.n(cursorO, "work_spec_state");
            int iN9 = tfg.n(cursorO, "work_spec_worker_class_name");
            int iN10 = tfg.n(cursorO, "work_spec_input_merger_class_name");
            int iN11 = tfg.n(cursorO, "work_spec_input");
            int iN12 = tfg.n(cursorO, "work_spec_output");
            int iN13 = tfg.n(cursorO, "work_spec_initial_delay");
            xlcVar = xlcVarA;
            try {
                int iN14 = tfg.n(cursorO, "work_spec_interval_duration");
                int iN15 = tfg.n(cursorO, "work_spec_flex_duration");
                int iN16 = tfg.n(cursorO, "work_spec_run_attempt_count");
                int iN17 = tfg.n(cursorO, "work_spec_backoff_policy");
                int iN18 = tfg.n(cursorO, "work_spec_backoff_delay_duration");
                int iN19 = tfg.n(cursorO, "work_spec_last_enqueue_time");
                int iN20 = tfg.n(cursorO, "work_spec_minimum_retention_duration");
                int iN21 = tfg.n(cursorO, "work_spec_schedule_requested_at");
                int iN22 = tfg.n(cursorO, "work_spec_run_in_foreground");
                int iN23 = tfg.n(cursorO, "work_spec_out_of_quota_policy");
                int iN24 = tfg.n(cursorO, "work_spec_period_count");
                int iN25 = tfg.n(cursorO, "work_spec_generation");
                int iN26 = tfg.n(cursorO, "work_spec_required_network_type");
                int iN27 = tfg.n(cursorO, "work_spec_requires_charging");
                int iN28 = tfg.n(cursorO, "work_spec_requires_device_idle");
                int iN29 = tfg.n(cursorO, "work_spec_requires_battery_not_low");
                int iN30 = tfg.n(cursorO, "work_spec_requires_storage_not_low");
                int iN31 = tfg.n(cursorO, "work_spec_trigger_content_update_delay");
                int iN32 = tfg.n(cursorO, "work_spec_trigger_max_content_delay");
                int iN33 = tfg.n(cursorO, "work_spec_content_uri_triggers");
                int i7 = iN13;
                ArrayList arrayList = new ArrayList(cursorO.getCount());
                while (cursorO.moveToNext()) {
                    String string = cursorO.isNull(iN) ? null : cursorO.getString(iN);
                    String string2 = cursorO.isNull(iN2) ? null : cursorO.getString(iN2);
                    h65 h65Var__ExistingWorkPolicy_stringToEnum = workersQueueDao_Impl.__ExistingWorkPolicy_stringToEnum(cursorO.getString(iN3));
                    HashSet hashSetL = lz7.l(cursorO.isNull(iN4) ? null : cursorO.getString(iN4));
                    long j = cursorO.getLong(iN5);
                    int i8 = cursorO.getInt(iN6);
                    String string3 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                    m7g m7gVarV = nu0.v(cursorO.getInt(iN8));
                    String string4 = cursorO.isNull(iN9) ? null : cursorO.getString(iN9);
                    String string5 = cursorO.isNull(iN10) ? null : cursorO.getString(iN10);
                    d24 d24VarA = d24.a(cursorO.isNull(iN11) ? null : cursorO.getBlob(iN11));
                    d24 d24VarA2 = d24.a(cursorO.isNull(iN12) ? null : cursorO.getBlob(iN12));
                    int i9 = i7;
                    long j2 = cursorO.getLong(i9);
                    int i10 = iN14;
                    long j3 = cursorO.getLong(i10);
                    iN14 = i10;
                    int i11 = iN15;
                    long j4 = cursorO.getLong(i11);
                    iN15 = i11;
                    int i12 = iN16;
                    int i13 = cursorO.getInt(i12);
                    iN16 = i12;
                    int i14 = iN17;
                    mf0 mf0VarS = nu0.s(cursorO.getInt(i14));
                    iN17 = i14;
                    int i15 = iN18;
                    long j5 = cursorO.getLong(i15);
                    iN18 = i15;
                    int i16 = iN19;
                    long j6 = cursorO.getLong(i16);
                    iN19 = i16;
                    int i17 = iN20;
                    long j7 = cursorO.getLong(i17);
                    iN20 = i17;
                    int i18 = iN21;
                    long j8 = cursorO.getLong(i18);
                    iN21 = i18;
                    int i19 = iN22;
                    if (cursorO.getInt(i19) != 0) {
                        iN22 = i19;
                        i2 = iN23;
                        z = true;
                    } else {
                        iN22 = i19;
                        i2 = iN23;
                        z = false;
                    }
                    jna jnaVarU = nu0.u(cursorO.getInt(i2));
                    iN23 = i2;
                    int i20 = iN24;
                    int i21 = cursorO.getInt(i20);
                    iN24 = i20;
                    int i22 = iN25;
                    int i23 = cursorO.getInt(i22);
                    iN25 = i22;
                    int i24 = iN26;
                    int iT = nu0.t(cursorO.getInt(i24));
                    iN26 = i24;
                    int i25 = iN27;
                    if (cursorO.getInt(i25) != 0) {
                        iN27 = i25;
                        i3 = iN28;
                        z2 = true;
                    } else {
                        iN27 = i25;
                        i3 = iN28;
                        z2 = false;
                    }
                    if (cursorO.getInt(i3) != 0) {
                        iN28 = i3;
                        i4 = iN29;
                        z3 = true;
                    } else {
                        iN28 = i3;
                        i4 = iN29;
                        z3 = false;
                    }
                    if (cursorO.getInt(i4) != 0) {
                        iN29 = i4;
                        i5 = iN30;
                        z4 = true;
                    } else {
                        iN29 = i4;
                        i5 = iN30;
                        z4 = false;
                    }
                    if (cursorO.getInt(i5) != 0) {
                        iN30 = i5;
                        i6 = iN31;
                        z5 = true;
                    } else {
                        iN30 = i5;
                        i6 = iN31;
                        z5 = false;
                    }
                    long j9 = cursorO.getLong(i6);
                    iN31 = i6;
                    int i26 = iN32;
                    long j10 = cursorO.getLong(i26);
                    iN32 = i26;
                    int i27 = iN33;
                    iN33 = i27;
                    arrayList.add(new q8g(string, string2, h65Var__ExistingWorkPolicy_stringToEnum, new h8g(string3, m7gVarV, string4, string5, d24VarA, d24VarA2, j2, j3, j4, new kj3(iT, z2, z3, z4, z5, j9, j10, nu0.c(cursorO.isNull(i27) ? null : cursorO.getBlob(i27))), i13, mf0VarS, j5, j6, j7, j8, z, jnaVarU, i21, i23), hashSetL, j, i8));
                    workersQueueDao_Impl = this;
                    i7 = i9;
                }
                cursorO.close();
                xlcVar.n();
                return arrayList;
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

    @Override // androidx.work.impl.model.WorkersQueueDao
    public void updateState(int i, List<String> list) {
        this.__db.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE WorkerQueueItem SET state = ? WHERE uuid IN (");
        a14.c(sb, list.size());
        sb.append(")");
        q36 q36VarD = this.__db.d(sb.toString());
        q36VarD.j(1, i);
        int i2 = 2;
        for (String str : list) {
            if (str == null) {
                q36VarD.W(i2);
            } else {
                q36VarD.f(i2, str);
            }
            i2++;
        }
        this.__db.c();
        try {
            q36VarD.n();
            this.__db.r();
        } finally {
            this.__db.l();
        }
    }

    @Override // androidx.work.impl.model.WorkersQueueDao
    public List<q8g> select(int i, int i2) throws Throwable {
        xlc xlcVar;
        int iN;
        int iN2;
        int iN3;
        int iN4;
        int iN5;
        int iN6;
        int iN7;
        int iN8;
        int iN9;
        int iN10;
        int iN11;
        int iN12;
        int iN13;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        WorkersQueueDao_Impl workersQueueDao_Impl = this;
        xlc xlcVarA = xlc.a(2, "SELECT * FROM WorkerQueueItem WHERE state = ? ORDER BY time ASC LIMIT ?");
        xlcVarA.j(1, i2);
        xlcVarA.j(2, i);
        workersQueueDao_Impl.__db.b();
        Cursor cursorO = workersQueueDao_Impl.__db.o(xlcVarA, null);
        try {
            iN = tfg.n(cursorO, "uuid");
            iN2 = tfg.n(cursorO, "uniqueWorkName");
            iN3 = tfg.n(cursorO, "existingWorkPolicy");
            iN4 = tfg.n(cursorO, "tags");
            iN5 = tfg.n(cursorO, "time");
            iN6 = tfg.n(cursorO, "state");
            iN7 = tfg.n(cursorO, "work_spec_id");
            iN8 = tfg.n(cursorO, "work_spec_state");
            iN9 = tfg.n(cursorO, "work_spec_worker_class_name");
            iN10 = tfg.n(cursorO, "work_spec_input_merger_class_name");
            iN11 = tfg.n(cursorO, "work_spec_input");
            iN12 = tfg.n(cursorO, "work_spec_output");
            iN13 = tfg.n(cursorO, "work_spec_initial_delay");
            xlcVar = xlcVarA;
        } catch (Throwable th) {
            th = th;
            xlcVar = xlcVarA;
        }
        try {
            int iN14 = tfg.n(cursorO, "work_spec_interval_duration");
            int iN15 = tfg.n(cursorO, "work_spec_flex_duration");
            int iN16 = tfg.n(cursorO, "work_spec_run_attempt_count");
            int iN17 = tfg.n(cursorO, "work_spec_backoff_policy");
            int iN18 = tfg.n(cursorO, "work_spec_backoff_delay_duration");
            int iN19 = tfg.n(cursorO, "work_spec_last_enqueue_time");
            int iN20 = tfg.n(cursorO, "work_spec_minimum_retention_duration");
            int iN21 = tfg.n(cursorO, "work_spec_schedule_requested_at");
            int iN22 = tfg.n(cursorO, "work_spec_run_in_foreground");
            int iN23 = tfg.n(cursorO, "work_spec_out_of_quota_policy");
            int iN24 = tfg.n(cursorO, "work_spec_period_count");
            int iN25 = tfg.n(cursorO, "work_spec_generation");
            int iN26 = tfg.n(cursorO, "work_spec_required_network_type");
            int iN27 = tfg.n(cursorO, "work_spec_requires_charging");
            int iN28 = tfg.n(cursorO, "work_spec_requires_device_idle");
            int iN29 = tfg.n(cursorO, "work_spec_requires_battery_not_low");
            int iN30 = tfg.n(cursorO, "work_spec_requires_storage_not_low");
            int iN31 = tfg.n(cursorO, "work_spec_trigger_content_update_delay");
            int iN32 = tfg.n(cursorO, "work_spec_trigger_max_content_delay");
            int iN33 = tfg.n(cursorO, "work_spec_content_uri_triggers");
            int i8 = iN13;
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                String string = cursorO.isNull(iN) ? null : cursorO.getString(iN);
                String string2 = cursorO.isNull(iN2) ? null : cursorO.getString(iN2);
                h65 h65Var__ExistingWorkPolicy_stringToEnum = workersQueueDao_Impl.__ExistingWorkPolicy_stringToEnum(cursorO.getString(iN3));
                HashSet hashSetL = lz7.l(cursorO.isNull(iN4) ? null : cursorO.getString(iN4));
                long j = cursorO.getLong(iN5);
                int i9 = cursorO.getInt(iN6);
                String string3 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                m7g m7gVarV = nu0.v(cursorO.getInt(iN8));
                String string4 = cursorO.isNull(iN9) ? null : cursorO.getString(iN9);
                String string5 = cursorO.isNull(iN10) ? null : cursorO.getString(iN10);
                d24 d24VarA = d24.a(cursorO.isNull(iN11) ? null : cursorO.getBlob(iN11));
                d24 d24VarA2 = d24.a(cursorO.isNull(iN12) ? null : cursorO.getBlob(iN12));
                int i10 = i8;
                long j2 = cursorO.getLong(i10);
                int i11 = iN14;
                long j3 = cursorO.getLong(i11);
                iN14 = i11;
                int i12 = iN15;
                long j4 = cursorO.getLong(i12);
                iN15 = i12;
                int i13 = iN16;
                int i14 = cursorO.getInt(i13);
                iN16 = i13;
                int i15 = iN17;
                mf0 mf0VarS = nu0.s(cursorO.getInt(i15));
                iN17 = i15;
                int i16 = iN18;
                long j5 = cursorO.getLong(i16);
                iN18 = i16;
                int i17 = iN19;
                long j6 = cursorO.getLong(i17);
                iN19 = i17;
                int i18 = iN20;
                long j7 = cursorO.getLong(i18);
                iN20 = i18;
                int i19 = iN21;
                long j8 = cursorO.getLong(i19);
                iN21 = i19;
                int i20 = iN22;
                if (cursorO.getInt(i20) != 0) {
                    iN22 = i20;
                    i3 = iN23;
                    z = true;
                } else {
                    iN22 = i20;
                    i3 = iN23;
                    z = false;
                }
                jna jnaVarU = nu0.u(cursorO.getInt(i3));
                iN23 = i3;
                int i21 = iN24;
                int i22 = cursorO.getInt(i21);
                iN24 = i21;
                int i23 = iN25;
                int i24 = cursorO.getInt(i23);
                iN25 = i23;
                int i25 = iN26;
                int iT = nu0.t(cursorO.getInt(i25));
                iN26 = i25;
                int i26 = iN27;
                if (cursorO.getInt(i26) != 0) {
                    iN27 = i26;
                    i4 = iN28;
                    z2 = true;
                } else {
                    iN27 = i26;
                    i4 = iN28;
                    z2 = false;
                }
                if (cursorO.getInt(i4) != 0) {
                    iN28 = i4;
                    i5 = iN29;
                    z3 = true;
                } else {
                    iN28 = i4;
                    i5 = iN29;
                    z3 = false;
                }
                if (cursorO.getInt(i5) != 0) {
                    iN29 = i5;
                    i6 = iN30;
                    z4 = true;
                } else {
                    iN29 = i5;
                    i6 = iN30;
                    z4 = false;
                }
                if (cursorO.getInt(i6) != 0) {
                    iN30 = i6;
                    i7 = iN31;
                    z5 = true;
                } else {
                    iN30 = i6;
                    i7 = iN31;
                    z5 = false;
                }
                long j9 = cursorO.getLong(i7);
                iN31 = i7;
                int i27 = iN32;
                long j10 = cursorO.getLong(i27);
                iN32 = i27;
                int i28 = iN33;
                iN33 = i28;
                arrayList.add(new q8g(string, string2, h65Var__ExistingWorkPolicy_stringToEnum, new h8g(string3, m7gVarV, string4, string5, d24VarA, d24VarA2, j2, j3, j4, new kj3(iT, z2, z3, z4, z5, j9, j10, nu0.c(cursorO.isNull(i28) ? null : cursorO.getBlob(i28))), i14, mf0VarS, j5, j6, j7, j8, z, jnaVarU, i22, i24), hashSetL, j, i9));
                workersQueueDao_Impl = this;
                i8 = i10;
            }
            cursorO.close();
            xlcVar.n();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorO.close();
            xlcVar.n();
            throw th;
        }
    }
}
