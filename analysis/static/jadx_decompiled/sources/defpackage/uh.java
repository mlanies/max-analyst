package defpackage;

import android.database.Cursor;
import android.os.Binder;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class uh implements Callable {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uh(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    private final Object a() {
        alc alcVar = (alc) this.c;
        ilc ilcVar = alcVar.a;
        ilcVar.c();
        try {
            alcVar.c.B((List) this.b);
            ilcVar.r();
            ilcVar.l();
            return e5f.a;
        } catch (Throwable th) {
            ilcVar.l();
            throw th;
        }
    }

    private final Object b() {
        Cursor cursorO = ((ilc) ((w4d) this.c).b).o((xlc) this.b, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "selectedMentionType");
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                long j = cursorO.getLong(iN);
                int i = cursorO.getInt(iN2);
                int i2 = 1;
                if (i != 0 && i == 1) {
                    i2 = 2;
                }
                arrayList.add(new v4d(j, i2));
            }
            return arrayList;
        } finally {
            cursorO.close();
        }
    }

    private final Object c() {
        b4e b4eVar = (b4e) this.c;
        ilc ilcVar = b4eVar.a;
        ilcVar.c();
        try {
            b4eVar.b.B((List) this.b);
            ilcVar.r();
            ilcVar.l();
            return null;
        } catch (Throwable th) {
            ilcVar.l();
            throw th;
        }
    }

    private final Object d() {
        Cursor cursorO = ((b4e) this.c).a.o((xlc) this.b, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "name");
            int iN3 = tfg.n(cursorO, "icon_url");
            int iN4 = tfg.n(cursorO, "author_id");
            int iN5 = tfg.n(cursorO, "created_time");
            int iN6 = tfg.n(cursorO, "updated_time");
            int iN7 = tfg.n(cursorO, "link");
            int iN8 = tfg.n(cursorO, "stickers");
            int iN9 = tfg.n(cursorO, "draft");
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                r3e r3eVar = new r3e();
                r3eVar.a = cursorO.getLong(iN);
                if (cursorO.isNull(iN2)) {
                    r3eVar.b = null;
                } else {
                    r3eVar.b = cursorO.getString(iN2);
                }
                if (cursorO.isNull(iN3)) {
                    r3eVar.c = null;
                } else {
                    r3eVar.c = cursorO.getString(iN3);
                }
                r3eVar.d = cursorO.getLong(iN4);
                r3eVar.e = cursorO.getLong(iN5);
                r3eVar.f = cursorO.getLong(iN6);
                if (cursorO.isNull(iN7)) {
                    r3eVar.g = null;
                } else {
                    r3eVar.g = cursorO.getString(iN7);
                }
                r3eVar.h = ngg.I(cursorO.isNull(iN8) ? null : cursorO.getString(iN8));
                r3eVar.i = cursorO.getInt(iN9) != 0;
                arrayList.add(r3eVar);
            }
            cursorO.close();
            return arrayList;
        } catch (Throwable th) {
            cursorO.close();
            throw th;
        }
    }

    private final Object e() {
        w8f w8fVar = (w8f) this.c;
        ilc ilcVar = w8fVar.a;
        ilcVar.c();
        try {
            w8fVar.b.C((e7f) this.b);
            ilcVar.r();
            ilcVar.l();
            return null;
        } catch (Throwable th) {
            ilcVar.l();
            throw th;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        xlc xlcVar;
        int i;
        xlc xlcVar2;
        ks4 ks4Var;
        e5f e5fVar = e5f.a;
        vx9 vx9Var = null;
        String string = null;
        z6c z6cVar = null;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                wh whVar = (wh) obj;
                ilc ilcVar = whVar.a;
                ilcVar.c();
                try {
                    whVar.b.B((List) this.b);
                    ilcVar.r();
                    return e5fVar;
                } finally {
                    ilcVar.l();
                }
            case 1:
                oj ojVar = (oj) obj;
                ilc ilcVar2 = ojVar.a;
                ilcVar2.c();
                try {
                    ojVar.b.B((List) this.b);
                    ilcVar2.r();
                    return e5fVar;
                } finally {
                    ilcVar2.l();
                }
            case 2:
                Cursor cursorO = ((oj) obj).a.o((xlc) this.b, null);
                try {
                    int iN = tfg.n(cursorO, "id");
                    int iN2 = tfg.n(cursorO, "name");
                    int iN3 = tfg.n(cursorO, "icon_url");
                    int iN4 = tfg.n(cursorO, "icon_lottie_url");
                    int iN5 = tfg.n(cursorO, "update_time");
                    int iN6 = tfg.n(cursorO, "animoji_ids");
                    ArrayList arrayList = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        arrayList.add(new nj(cursorO.getLong(iN), cursorO.isNull(iN2) ? null : cursorO.getString(iN2), cursorO.isNull(iN3) ? null : cursorO.getString(iN3), cursorO.isNull(iN4) ? null : cursorO.getString(iN4), cursorO.getLong(iN5), ngg.I(cursorO.isNull(iN6) ? null : cursorO.getString(iN6))));
                    }
                    return arrayList;
                } finally {
                }
            case 3:
                ed1 ed1Var = (ed1) obj;
                th thVar = ed1Var.b;
                ilc ilcVar3 = ed1Var.a;
                q36 q36VarF = thVar.f();
                String str = (String) this.b;
                if (str == null) {
                    q36VarF.W(1);
                } else {
                    q36VarF.f(1, str);
                }
                try {
                    ilcVar3.c();
                    try {
                        q36VarF.n();
                        ilcVar3.r();
                        thVar.t(q36VarF);
                        return null;
                    } finally {
                        ilcVar3.l();
                    }
                } catch (Throwable th) {
                    thVar.t(q36VarF);
                    throw th;
                }
            case 4:
                Cursor cursorO2 = ((ed1) obj).a.o((xlc) this.b, null);
                try {
                    int iN7 = tfg.n(cursorO2, "conversation_id");
                    int iN8 = tfg.n(cursorO2, ApiProtocol.KEY_JOIN_LINK);
                    int iN9 = tfg.n(cursorO2, "started_at");
                    ArrayList arrayList2 = new ArrayList(cursorO2.getCount());
                    while (cursorO2.moveToNext()) {
                        String string2 = cursorO2.isNull(iN7) ? null : cursorO2.getString(iN7);
                        String string3 = cursorO2.isNull(iN8) ? null : cursorO2.getString(iN8);
                        long j = cursorO2.getLong(iN9);
                        ec1 ec1Var = new ec1();
                        ec1Var.a = string2;
                        ec1Var.b = string3;
                        ec1Var.c = j;
                        arrayList2.add(ec1Var);
                    }
                    return arrayList2;
                } finally {
                }
            case 5:
                tp4 tp4Var = (tp4) obj;
                ilc ilcVar4 = tp4Var.a;
                ilcVar4.c();
                try {
                    tp4Var.b.C((np4) this.b);
                    ilcVar4.r();
                    ilcVar4.l();
                    return null;
                } catch (Throwable th2) {
                    ilcVar4.l();
                    throw th2;
                }
            case 6:
                Cursor cursorO3 = ((fd5) obj).a.o((xlc) this.b, null);
                try {
                    ArrayList arrayList3 = new ArrayList(cursorO3.getCount());
                    while (cursorO3.moveToNext()) {
                        arrayList3.add(cursorO3.isNull(0) ? null : Long.valueOf(cursorO3.getLong(0)));
                    }
                    return arrayList3;
                } finally {
                }
            case 7:
                Cursor cursorO4 = ((od5) obj).a.o((xlc) this.b, null);
                try {
                    ArrayList arrayList4 = new ArrayList(cursorO4.getCount());
                    while (cursorO4.moveToNext()) {
                        arrayList4.add(cursorO4.isNull(0) ? null : Long.valueOf(cursorO4.getLong(0)));
                    }
                    return arrayList4;
                } finally {
                }
            case 8:
                ud5 ud5Var = (ud5) obj;
                ilc ilcVar5 = ud5Var.a;
                ilcVar5.c();
                try {
                    ud5Var.b.B((Iterable) this.b);
                    ilcVar5.r();
                    return e5fVar;
                } finally {
                    ilcVar5.l();
                }
            case 9:
                ilc ilcVar6 = ((ud5) obj).a;
                xlc xlcVar3 = (xlc) this.b;
                Cursor cursorO5 = ilcVar6.o(xlcVar3, null);
                try {
                    int iN10 = tfg.n(cursorO5, "push_id");
                    int iN11 = tfg.n(cursorO5, "chat_id");
                    int iN12 = tfg.n(cursorO5, "msg_id");
                    int iN13 = tfg.n(cursorO5, "analytics_status");
                    int iN14 = tfg.n(cursorO5, "suid");
                    int iN15 = tfg.n(cursorO5, "content_length");
                    int iN16 = tfg.n(cursorO5, "sent_time");
                    int iN17 = tfg.n(cursorO5, "event_key");
                    int iN18 = tfg.n(cursorO5, "fcm_sent_time");
                    int iN19 = tfg.n(cursorO5, "received_time");
                    int iN20 = tfg.n(cursorO5, "push_type");
                    int iN21 = tfg.n(cursorO5, "time");
                    int iN22 = tfg.n(cursorO5, "created_time");
                    xlcVar = xlcVar3;
                    try {
                        ArrayList arrayList5 = new ArrayList(cursorO5.getCount());
                        while (cursorO5.moveToNext()) {
                            long j2 = cursorO5.getLong(iN10);
                            long j3 = cursorO5.getLong(iN11);
                            long j4 = cursorO5.getLong(iN12);
                            int i2 = cursorO5.getInt(iN13);
                            int i3 = iN10;
                            int[] iArrV = au1.v(3);
                            int i4 = iN11;
                            int length = iArrV.length;
                            int i5 = iN12;
                            int i6 = 0;
                            while (true) {
                                if (i6 < length) {
                                    i = iArrV[i6];
                                    int[] iArr = iArrV;
                                    if (au1.s(i) != i2) {
                                        i6++;
                                        iArrV = iArr;
                                    }
                                } else {
                                    i = 0;
                                }
                            }
                            arrayList5.add(new vd5(j2, j3, j4, i == 0 ? 1 : i, cursorO5.isNull(iN14) ? null : Long.valueOf(cursorO5.getLong(iN14)), cursorO5.getLong(iN15), cursorO5.isNull(iN16) ? null : Long.valueOf(cursorO5.getLong(iN16)), cursorO5.isNull(iN17) ? null : cursorO5.getString(iN17), cursorO5.getLong(iN18), cursorO5.getLong(iN19), cursorO5.isNull(iN20) ? null : cursorO5.getString(iN20), cursorO5.getLong(iN21), cursorO5.getLong(iN22)));
                            iN10 = i3;
                            iN11 = i4;
                            iN12 = i5;
                        }
                        cursorO5.close();
                        xlcVar.n();
                        return arrayList5;
                    } catch (Throwable th3) {
                        th = th3;
                        cursorO5.close();
                        xlcVar.n();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    xlcVar = xlcVar3;
                }
            case 10:
                le5 le5Var = (le5) obj;
                ilc ilcVar7 = le5Var.a;
                ilcVar7.c();
                try {
                    le5Var.b.B((Iterable) this.b);
                    ilcVar7.r();
                    return e5fVar;
                } finally {
                    ilcVar7.l();
                }
            case 11:
                Cursor cursorO6 = ((le5) obj).a.o((xlc) this.b, null);
                try {
                    int iN23 = tfg.n(cursorO6, "chat_id");
                    int iN24 = tfg.n(cursorO6, "last_notify_msg_id");
                    ArrayList arrayList6 = new ArrayList(cursorO6.getCount());
                    while (cursorO6.moveToNext()) {
                        arrayList6.add(new me5(cursorO6.getLong(iN23), cursorO6.getLong(iN24)));
                    }
                    return arrayList6;
                } finally {
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                oy8 oy8Var = (oy8) obj;
                ilc ilcVar8 = oy8Var.a;
                ilcVar8.c();
                try {
                    oy8Var.b.C((ky8) this.b);
                    ilcVar8.r();
                    ilcVar8.l();
                    return null;
                } catch (Throwable th5) {
                    ilcVar8.l();
                    throw th5;
                }
            case 13:
                sx sxVar = (sx) obj;
                sxVar.X.set(true);
                try {
                    Process.setThreadPriority(10);
                    sxVar.a();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ilc ilcVar9 = ((ew9) obj).a;
                xlc xlcVar4 = (xlc) this.b;
                Cursor cursorO7 = ilcVar9.o(xlcVar4, null);
                try {
                    int iN25 = tfg.n(cursorO7, "chat_id");
                    int iN26 = tfg.n(cursorO7, "message_id");
                    int iN27 = tfg.n(cursorO7, "type");
                    int iN28 = tfg.n(cursorO7, "chat_title");
                    int iN29 = tfg.n(cursorO7, "sender_user_name");
                    int iN30 = tfg.n(cursorO7, "sender_user_id");
                    int iN31 = tfg.n(cursorO7, "time");
                    int iN32 = tfg.n(cursorO7, "text");
                    int iN33 = tfg.n(cursorO7, "push_id");
                    int iN34 = tfg.n(cursorO7, "event_key");
                    int iN35 = tfg.n(cursorO7, "large_image_url");
                    int iN36 = tfg.n(cursorO7, "fire_m");
                    int iN37 = tfg.n(cursorO7, "has_any_error");
                    xlcVar2 = xlcVar4;
                    try {
                        ArrayList arrayList7 = new ArrayList(cursorO7.getCount());
                        while (cursorO7.moveToNext()) {
                            long j5 = cursorO7.getLong(iN25);
                            long j6 = cursorO7.getLong(iN26);
                            String string4 = cursorO7.isNull(iN27) ? null : cursorO7.getString(iN27);
                            ne5[] ne5VarArr = ne5.b;
                            arrayList7.add(new je5(j5, j6, np8.q(string4), cursorO7.isNull(iN28) ? null : cursorO7.getString(iN28), cursorO7.isNull(iN29) ? null : cursorO7.getString(iN29), cursorO7.getLong(iN30), cursorO7.getLong(iN31), cursorO7.isNull(iN32) ? null : cursorO7.getString(iN32), cursorO7.getLong(iN33), cursorO7.isNull(iN34) ? null : cursorO7.getString(iN34), cursorO7.isNull(iN35) ? null : cursorO7.getString(iN35), cursorO7.getInt(iN36) != 0, cursorO7.getInt(iN37) != 0));
                        }
                        cursorO7.close();
                        xlcVar2.n();
                        return arrayList7;
                    } catch (Throwable th6) {
                        th = th6;
                        cursorO7.close();
                        xlcVar2.n();
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    xlcVar2 = xlcVar4;
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ew9 ew9Var = (ew9) obj;
                ilc ilcVar10 = ew9Var.a;
                ilcVar10.c();
                try {
                    ew9Var.b.C((je5) this.b);
                    ilcVar10.r();
                    return e5fVar;
                } finally {
                    ilcVar10.l();
                }
            case 16:
                Cursor cursorO8 = ((kw9) obj).a.o((xlc) this.b, null);
                try {
                    int iN38 = tfg.n(cursorO8, "chat_id");
                    int iN39 = tfg.n(cursorO8, "mark");
                    ArrayList arrayList8 = new ArrayList(cursorO8.getCount());
                    while (cursorO8.moveToNext()) {
                        arrayList8.add(new qv9(cursorO8.getLong(iN38), cursorO8.getLong(iN39)));
                    }
                    return arrayList8;
                } finally {
                }
            case LangUtils.HASH_SEED /* 17 */:
                Cursor cursorO9 = ((yx9) obj).a.o((xlc) this.b, null);
                try {
                    int iN40 = tfg.n(cursorO9, "chat_id");
                    int iN41 = tfg.n(cursorO9, "message_id");
                    int iN42 = tfg.n(cursorO9, "time");
                    int iN43 = tfg.n(cursorO9, "fcm");
                    int iN44 = tfg.n(cursorO9, "drop_reason");
                    if (cursorO9.moveToFirst()) {
                        long j7 = cursorO9.getLong(iN40);
                        long j8 = cursorO9.getLong(iN41);
                        long j9 = cursorO9.getLong(iN42);
                        Integer numValueOf = cursorO9.isNull(iN43) ? null : Integer.valueOf(cursorO9.getInt(iN43));
                        Boolean boolValueOf = numValueOf == null ? null : Boolean.valueOf(numValueOf.intValue() != 0);
                        String string5 = cursorO9.isNull(iN44) ? null : cursorO9.getString(iN44);
                        ks4[] ks4VarArr = ks4.b;
                        if (string5 == null) {
                            ks4Var = null;
                            vx9Var = new vx9(j7, j8, j9, boolValueOf, ks4Var);
                        } else {
                            for (ks4 ks4Var2 : ks4.b) {
                                if (eae.k0(ks4Var2.a, string5, true)) {
                                    ks4Var = ks4Var2;
                                    vx9Var = new vx9(j7, j8, j9, boolValueOf, ks4Var);
                                }
                            }
                            ks4Var = null;
                            vx9Var = new vx9(j7, j8, j9, boolValueOf, ks4Var);
                        }
                    }
                    return vx9Var;
                } finally {
                }
            case 18:
                adb adbVar = (adb) obj;
                ilc ilcVar11 = (ilc) adbVar.a;
                ilcVar11.c();
                try {
                    ((sh) adbVar.b).C((wgb) this.b);
                    ilcVar11.r();
                    return e5fVar;
                } finally {
                    ilcVar11.l();
                }
            case 19:
                Cursor cursorO10 = ((ilc) ((adb) obj).a).o((xlc) this.b, null);
                try {
                    int iN45 = tfg.n(cursorO10, "id");
                    int iN46 = tfg.n(cursorO10, "server_id");
                    int iN47 = tfg.n(cursorO10, "profile");
                    ArrayList arrayList9 = new ArrayList(cursorO10.getCount());
                    while (cursorO10.moveToNext()) {
                        arrayList9.add(new wgb(cursorO10.getLong(iN45), cursorO10.getLong(iN46), fm9.L(cursorO10.isNull(iN47) ? null : cursorO10.getBlob(iN47))));
                    }
                    return arrayList9;
                } finally {
                }
            case 20:
                a7c a7cVar = (a7c) obj;
                ilc ilcVar12 = a7cVar.a;
                ilcVar12.c();
                try {
                    a7cVar.b.C((z6c) this.b);
                    ilcVar12.r();
                    return e5fVar;
                } finally {
                    ilcVar12.l();
                }
            case 21:
                Cursor cursorO11 = ((a7c) obj).a.o((xlc) this.b, null);
                try {
                    int iN48 = tfg.n(cursorO11, "id");
                    int iN49 = tfg.n(cursorO11, "update_time");
                    int iN50 = tfg.n(cursorO11, "reactions");
                    if (cursorO11.moveToFirst()) {
                        String string6 = cursorO11.isNull(iN48) ? null : cursorO11.getString(iN48);
                        long j10 = cursorO11.getLong(iN49);
                        if (!cursorO11.isNull(iN50)) {
                            string = cursorO11.getString(iN50);
                        }
                        z6cVar = new z6c(j10, string6, ngg.I(string));
                    }
                    return z6cVar;
                } finally {
                }
            case 22:
                d9c d9cVar = (d9c) obj;
                ilc ilcVar13 = d9cVar.a;
                ilcVar13.c();
                try {
                    d9cVar.b.C((e9c) this.b);
                    ilcVar13.r();
                    return null;
                } finally {
                    ilcVar13.l();
                }
            case 23:
                alc alcVar = (alc) obj;
                ilc ilcVar14 = alcVar.a;
                ilcVar14.c();
                try {
                    Long lValueOf = Long.valueOf(alcVar.b.D((nkc) this.b));
                    ilcVar14.r();
                    return lValueOf;
                } finally {
                    ilcVar14.l();
                }
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return a();
            case 25:
                return b();
            case 26:
                return c();
            case 27:
                return d();
            case 28:
                return e();
            default:
                w8f w8fVar = (w8f) obj;
                zkc zkcVar = w8fVar.e;
                ilc ilcVar15 = w8fVar.a;
                q36 q36VarF2 = zkcVar.f();
                String str2 = (String) this.b;
                if (str2 == null) {
                    q36VarF2.W(1);
                } else {
                    q36VarF2.f(1, str2);
                }
                try {
                    ilcVar15.c();
                    try {
                        q36VarF2.n();
                        ilcVar15.r();
                        return null;
                    } finally {
                        ilcVar15.l();
                    }
                } finally {
                    zkcVar.t(q36VarF2);
                }
        }
    }

    public void finalize() throws Throwable {
        switch (this.a) {
            case 4:
                ((xlc) this.b).n();
                break;
            case 6:
                ((xlc) this.b).n();
                break;
            case 7:
                ((xlc) this.b).n();
                break;
            case 19:
                ((xlc) this.b).n();
                break;
            case 25:
                ((xlc) this.b).n();
                break;
            case 27:
                ((xlc) this.b).n();
                break;
            default:
                super.finalize();
                break;
        }
    }

    public uh(sx sxVar) {
        this.a = 13;
        this.c = sxVar;
    }
}
