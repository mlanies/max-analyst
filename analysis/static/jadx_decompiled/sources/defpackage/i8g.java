package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i8g {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public i8g(ilc ilcVar) {
        this.a = ilcVar;
        this.b = new x7g(ilcVar, 2);
        this.c = new ha4(ilcVar, 7);
        this.d = new ktf(ilcVar, 7);
        this.e = new ktf(ilcVar, 8);
        this.f = new ktf(ilcVar, 9);
        this.g = new ktf(ilcVar, 10);
        this.h = new ktf(ilcVar, 11);
        this.i = new ktf(ilcVar, 12);
        this.j = new ktf(ilcVar, 13);
        this.k = new ktf(ilcVar, 3);
        this.l = new ktf(ilcVar, 4);
        new ktf(ilcVar, 5);
        new ktf(ilcVar, 6);
    }

    public static void d(hm9 hm9Var) {
        if (hm9Var instanceof rnc) {
            ((rnc) hm9Var).getClass();
        } else if (hm9Var instanceof w04) {
            ((w04) hm9Var).getClass();
        }
    }

    public void a(us usVar) {
        rs rsVar = (rs) usVar.keySet();
        us usVar2 = rsVar.a;
        if (usVar2.isEmpty()) {
            return;
        }
        if (usVar.c > 999) {
            us usVar3 = new us(999);
            int i = usVar.c;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                usVar3.put((String) usVar.f(i2), (ArrayList) usVar.i(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    a(usVar3);
                    usVar3 = new us(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                a(usVar3);
                return;
            }
            return;
        }
        StringBuilder sbL = au1.l("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int i4 = usVar2.c;
        a14.c(sbL, i4);
        sbL.append(")");
        xlc xlcVarA = xlc.a(i4, sbL.toString());
        Iterator it = rsVar.iterator();
        int i5 = 1;
        while (true) {
            qs qsVar = (qs) it;
            if (!qsVar.hasNext()) {
                break;
            }
            String str = (String) qsVar.next();
            if (str == null) {
                xlcVarA.W(i5);
            } else {
                xlcVarA.f(i5, str);
            }
            i5++;
        }
        Cursor cursorO = ((ilc) this.a).o(xlcVarA, null);
        try {
            int iM = tfg.m(cursorO, "work_spec_id");
            if (iM == -1) {
                return;
            }
            while (cursorO.moveToNext()) {
                ArrayList arrayList = (ArrayList) usVar.get(cursorO.getString(iM));
                if (arrayList != null) {
                    arrayList.add(d24.a(cursorO.isNull(0) ? null : cursorO.getBlob(0)));
                }
            }
        } finally {
            cursorO.close();
        }
    }

    public void b(us usVar) {
        rs rsVar = (rs) usVar.keySet();
        us usVar2 = rsVar.a;
        if (usVar2.isEmpty()) {
            return;
        }
        if (usVar.c > 999) {
            us usVar3 = new us(999);
            int i = usVar.c;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                usVar3.put((String) usVar.f(i2), (ArrayList) usVar.i(i2));
                i2++;
                i3++;
                if (i3 == 999) {
                    b(usVar3);
                    usVar3 = new us(999);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                b(usVar3);
                return;
            }
            return;
        }
        StringBuilder sbL = au1.l("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int i4 = usVar2.c;
        a14.c(sbL, i4);
        sbL.append(")");
        xlc xlcVarA = xlc.a(i4, sbL.toString());
        Iterator it = rsVar.iterator();
        int i5 = 1;
        while (true) {
            qs qsVar = (qs) it;
            if (!qsVar.hasNext()) {
                break;
            }
            String str = (String) qsVar.next();
            if (str == null) {
                xlcVarA.W(i5);
            } else {
                xlcVarA.f(i5, str);
            }
            i5++;
        }
        Cursor cursorO = ((ilc) this.a).o(xlcVarA, null);
        try {
            int iM = tfg.m(cursorO, "work_spec_id");
            if (iM == -1) {
                return;
            }
            while (cursorO.moveToNext()) {
                ArrayList arrayList = (ArrayList) usVar.get(cursorO.getString(iM));
                if (arrayList != null) {
                    arrayList.add(cursorO.isNull(0) ? null : cursorO.getString(0));
                }
            }
        } finally {
            cursorO.close();
        }
    }

    public gjd c() {
        gjd gjdVar = new gjd();
        gjdVar.a = (hm9) this.a;
        gjdVar.b = (hm9) this.b;
        gjdVar.c = (hm9) this.c;
        gjdVar.d = (hm9) this.d;
        gjdVar.e = (hx3) this.e;
        gjdVar.f = (hx3) this.f;
        gjdVar.g = (hx3) this.g;
        gjdVar.h = (hx3) this.h;
        gjdVar.i = (vu4) this.i;
        gjdVar.j = (vu4) this.j;
        gjdVar.k = (vu4) this.k;
        gjdVar.l = (vu4) this.l;
        return gjdVar;
    }

    public void e(String str) {
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        ktf ktfVar = (ktf) this.d;
        q36 q36VarF = ktfVar.f();
        if (str == null) {
            q36VarF.W(1);
        } else {
            q36VarF.f(1, str);
        }
        ilcVar.c();
        try {
            q36VarF.n();
            ilcVar.r();
        } finally {
            ilcVar.l();
            ktfVar.t(q36VarF);
        }
    }

    public ArrayList f() throws Throwable {
        xlc xlcVar;
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
        xlc xlcVarA = xlc.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        xlcVarA.j(1, 200);
        ilc ilcVar = (ilc) this.a;
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
                    int i9 = iN;
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
                    iN = i9;
                    i6 = i8;
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

    public ArrayList g(int i) throws Throwable {
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
        xlc xlcVarA = xlc.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        xlcVarA.j(1, i);
        ilc ilcVar = (ilc) this.a;
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
                int i7 = iN14;
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
                    int i8 = cursorO.getInt(iN10);
                    mf0 mf0VarS = nu0.s(cursorO.getInt(iN11));
                    long j4 = cursorO.getLong(iN12);
                    long j5 = cursorO.getLong(iN13);
                    int i9 = i7;
                    long j6 = cursorO.getLong(i9);
                    int i10 = iN;
                    int i11 = iN15;
                    long j7 = cursorO.getLong(i11);
                    iN15 = i11;
                    int i12 = iN16;
                    if (cursorO.getInt(i12) != 0) {
                        iN16 = i12;
                        i2 = iN17;
                        z = true;
                    } else {
                        iN16 = i12;
                        i2 = iN17;
                        z = false;
                    }
                    jna jnaVarU = nu0.u(cursorO.getInt(i2));
                    iN17 = i2;
                    int i13 = iN18;
                    int i14 = cursorO.getInt(i13);
                    iN18 = i13;
                    int i15 = iN19;
                    int i16 = cursorO.getInt(i15);
                    iN19 = i15;
                    int i17 = iN20;
                    int iT = nu0.t(cursorO.getInt(i17));
                    iN20 = i17;
                    int i18 = iN21;
                    if (cursorO.getInt(i18) != 0) {
                        iN21 = i18;
                        i3 = iN22;
                        z2 = true;
                    } else {
                        iN21 = i18;
                        i3 = iN22;
                        z2 = false;
                    }
                    if (cursorO.getInt(i3) != 0) {
                        iN22 = i3;
                        i4 = iN23;
                        z3 = true;
                    } else {
                        iN22 = i3;
                        i4 = iN23;
                        z3 = false;
                    }
                    if (cursorO.getInt(i4) != 0) {
                        iN23 = i4;
                        i5 = iN24;
                        z4 = true;
                    } else {
                        iN23 = i4;
                        i5 = iN24;
                        z4 = false;
                    }
                    if (cursorO.getInt(i5) != 0) {
                        iN24 = i5;
                        i6 = iN25;
                        z5 = true;
                    } else {
                        iN24 = i5;
                        i6 = iN25;
                        z5 = false;
                    }
                    long j8 = cursorO.getLong(i6);
                    iN25 = i6;
                    int i19 = iN26;
                    long j9 = cursorO.getLong(i19);
                    iN26 = i19;
                    int i20 = iN27;
                    iN27 = i20;
                    arrayList.add(new h8g(string, m7gVarV, string2, string3, d24VarA, d24VarA2, j, j2, j3, new kj3(iT, z2, z3, z4, z5, j8, j9, nu0.c(cursorO.isNull(i20) ? null : cursorO.getBlob(i20))), i8, mf0VarS, j4, j5, j6, j7, z, jnaVarU, i14, i16));
                    iN = i10;
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

    public ArrayList h() throws Throwable {
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
        int iN14;
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
        xlc xlcVarA = xlc.a(0, "SELECT * FROM workspec WHERE state=1");
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            iN = tfg.n(cursorO, "id");
            iN2 = tfg.n(cursorO, "state");
            iN3 = tfg.n(cursorO, "worker_class_name");
            iN4 = tfg.n(cursorO, "input_merger_class_name");
            iN5 = tfg.n(cursorO, "input");
            iN6 = tfg.n(cursorO, "output");
            iN7 = tfg.n(cursorO, "initial_delay");
            iN8 = tfg.n(cursorO, "interval_duration");
            iN9 = tfg.n(cursorO, "flex_duration");
            iN10 = tfg.n(cursorO, "run_attempt_count");
            iN11 = tfg.n(cursorO, "backoff_policy");
            iN12 = tfg.n(cursorO, "backoff_delay_duration");
            iN13 = tfg.n(cursorO, "last_enqueue_time");
            iN14 = tfg.n(cursorO, "minimum_retention_duration");
            xlcVar = xlcVarA;
        } catch (Throwable th) {
            th = th;
            xlcVar = xlcVarA;
        }
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
                int i9 = iN;
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
                iN = i9;
                i6 = i8;
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

    public ArrayList i() {
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
        int iN14;
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
        xlc xlcVarA = xlc.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            iN = tfg.n(cursorO, "id");
            iN2 = tfg.n(cursorO, "state");
            iN3 = tfg.n(cursorO, "worker_class_name");
            iN4 = tfg.n(cursorO, "input_merger_class_name");
            iN5 = tfg.n(cursorO, "input");
            iN6 = tfg.n(cursorO, "output");
            iN7 = tfg.n(cursorO, "initial_delay");
            iN8 = tfg.n(cursorO, "interval_duration");
            iN9 = tfg.n(cursorO, "flex_duration");
            iN10 = tfg.n(cursorO, "run_attempt_count");
            iN11 = tfg.n(cursorO, "backoff_policy");
            iN12 = tfg.n(cursorO, "backoff_delay_duration");
            iN13 = tfg.n(cursorO, "last_enqueue_time");
            iN14 = tfg.n(cursorO, "minimum_retention_duration");
            xlcVar = xlcVarA;
        } catch (Throwable th) {
            th = th;
            xlcVar = xlcVarA;
        }
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
                int i9 = iN;
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
                iN = i9;
                i6 = i8;
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

    public m7g j(String str) {
        xlc xlcVarA = xlc.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            xlcVarA.W(1);
        } else {
            xlcVarA.f(1, str);
        }
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        m7g m7gVarV = null;
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            if (cursorO.moveToFirst()) {
                Integer numValueOf = cursorO.isNull(0) ? null : Integer.valueOf(cursorO.getInt(0));
                if (numValueOf != null) {
                    m7gVarV = nu0.v(numValueOf.intValue());
                }
            }
            return m7gVarV;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public ArrayList k(String str) {
        xlc xlcVarA = xlc.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            xlcVarA.W(1);
        } else {
            xlcVarA.f(1, str);
        }
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                arrayList.add(cursorO.isNull(0) ? null : cursorO.getString(0));
            }
            return arrayList;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public h8g l(String str) {
        xlc xlcVar;
        h8g h8gVar;
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        xlc xlcVarA = xlc.a(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            xlcVarA.W(1);
        } else {
            xlcVarA.f(1, str);
        }
        ilc ilcVar = (ilc) this.a;
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
                if (cursorO.moveToFirst()) {
                    String string = cursorO.isNull(iN) ? null : cursorO.getString(iN);
                    m7g m7gVarV = nu0.v(cursorO.getInt(iN2));
                    String string2 = cursorO.isNull(iN3) ? null : cursorO.getString(iN3);
                    String string3 = cursorO.isNull(iN4) ? null : cursorO.getString(iN4);
                    d24 d24VarA = d24.a(cursorO.isNull(iN5) ? null : cursorO.getBlob(iN5));
                    d24 d24VarA2 = d24.a(cursorO.isNull(iN6) ? null : cursorO.getBlob(iN6));
                    long j = cursorO.getLong(iN7);
                    long j2 = cursorO.getLong(iN8);
                    long j3 = cursorO.getLong(iN9);
                    int i6 = cursorO.getInt(iN10);
                    mf0 mf0VarS = nu0.s(cursorO.getInt(iN11));
                    long j4 = cursorO.getLong(iN12);
                    long j5 = cursorO.getLong(iN13);
                    long j6 = cursorO.getLong(iN14);
                    long j7 = cursorO.getLong(iN15);
                    if (cursorO.getInt(iN16) != 0) {
                        i = iN17;
                        z = true;
                    } else {
                        z = false;
                        i = iN17;
                    }
                    jna jnaVarU = nu0.u(cursorO.getInt(i));
                    int i7 = cursorO.getInt(iN18);
                    int i8 = cursorO.getInt(iN19);
                    int iT = nu0.t(cursorO.getInt(iN20));
                    if (cursorO.getInt(iN21) != 0) {
                        i2 = iN22;
                        z2 = true;
                    } else {
                        z2 = false;
                        i2 = iN22;
                    }
                    if (cursorO.getInt(i2) != 0) {
                        i3 = iN23;
                        z3 = true;
                    } else {
                        z3 = false;
                        i3 = iN23;
                    }
                    if (cursorO.getInt(i3) != 0) {
                        i4 = iN24;
                        z4 = true;
                    } else {
                        z4 = false;
                        i4 = iN24;
                    }
                    if (cursorO.getInt(i4) != 0) {
                        i5 = iN25;
                        z5 = true;
                    } else {
                        z5 = false;
                        i5 = iN25;
                    }
                    h8gVar = new h8g(string, m7gVarV, string2, string3, d24VarA, d24VarA2, j, j2, j3, new kj3(iT, z2, z3, z4, z5, cursorO.getLong(i5), cursorO.getLong(iN26), nu0.c(cursorO.isNull(iN27) ? null : cursorO.getBlob(iN27))), i6, mf0VarS, j4, j5, j6, j7, z, jnaVarU, i7, i8);
                } else {
                    h8gVar = null;
                }
                cursorO.close();
                xlcVar.n();
                return h8gVar;
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

    public ArrayList m(String str) {
        xlc xlcVarA = xlc.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            xlcVarA.W(1);
        } else {
            xlcVarA.f(1, str);
        }
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                String string = cursorO.isNull(0) ? null : cursorO.getString(0);
                m7g m7gVarV = nu0.v(cursorO.getInt(1));
                f8g f8gVar = new f8g();
                f8gVar.a = string;
                f8gVar.b = m7gVarV;
                arrayList.add(f8gVar);
            }
            return arrayList;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public void n(long j, String str) {
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        ktf ktfVar = (ktf) this.k;
        q36 q36VarF = ktfVar.f();
        q36VarF.j(1, j);
        if (str == null) {
            q36VarF.W(2);
        } else {
            q36VarF.f(2, str);
        }
        ilcVar.c();
        try {
            q36VarF.n();
            ilcVar.r();
        } finally {
            ilcVar.l();
            ktfVar.t(q36VarF);
        }
    }

    public void o(long j, String str) {
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        ktf ktfVar = (ktf) this.h;
        q36 q36VarF = ktfVar.f();
        q36VarF.j(1, j);
        if (str == null) {
            q36VarF.W(2);
        } else {
            q36VarF.f(2, str);
        }
        ilcVar.c();
        try {
            q36VarF.n();
            ilcVar.r();
        } finally {
            ilcVar.l();
            ktfVar.t(q36VarF);
        }
    }

    public void p(String str, d24 d24Var) {
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        ktf ktfVar = (ktf) this.g;
        q36 q36VarF = ktfVar.f();
        byte[] bArrF = d24.f(d24Var);
        if (bArrF == null) {
            q36VarF.W(1);
        } else {
            q36VarF.k(1, bArrF);
        }
        if (str == null) {
            q36VarF.W(2);
        } else {
            q36VarF.f(2, str);
        }
        ilcVar.c();
        try {
            q36VarF.n();
            ilcVar.r();
        } finally {
            ilcVar.l();
            ktfVar.t(q36VarF);
        }
    }

    public void q(m7g m7gVar, String str) {
        ilc ilcVar = (ilc) this.a;
        ilcVar.b();
        ktf ktfVar = (ktf) this.e;
        q36 q36VarF = ktfVar.f();
        q36VarF.j(1, nu0.O(m7gVar));
        if (str == null) {
            q36VarF.W(2);
        } else {
            q36VarF.f(2, str);
        }
        ilcVar.c();
        try {
            q36VarF.n();
            ilcVar.r();
        } finally {
            ilcVar.l();
            ktfVar.t(q36VarF);
        }
    }

    public i8g() {
        this.a = new rnc();
        this.b = new rnc();
        this.c = new rnc();
        this.d = new rnc();
        this.e = new a0(0.0f);
        this.f = new a0(0.0f);
        this.g = new a0(0.0f);
        this.h = new a0(0.0f);
        this.i = new vu4();
        this.j = new vu4();
        this.k = new vu4();
        this.l = new vu4();
    }
}
