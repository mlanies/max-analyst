package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class au8 {
    public final c34 a;
    public final av0 b;
    public final m7b c;
    public final sna d;
    public final s8g e;
    public final t6b f;
    public final rm4 g;
    public final ztc h;
    public qj3 i;

    public au8(c34 c34Var, av0 av0Var, m7b m7bVar, sna snaVar, s8g s8gVar, t6b t6bVar, rm4 rm4Var, ztc ztcVar) {
        this.a = c34Var;
        this.b = av0Var;
        this.c = m7bVar;
        this.d = snaVar;
        this.e = s8gVar;
        this.f = t6bVar;
        this.g = rm4Var;
        this.h = ztcVar;
    }

    public final void A(long j, long j2) {
        t19 t19VarD = ((k24) this.a).c.d();
        ilc ilcVar = t19VarD.a;
        ilcVar.b();
        th thVar = t19VarD.k;
        q36 q36VarF = thVar.f();
        q36VarF.j(1, j2);
        q36VarF.j(2, j);
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
            } finally {
                ilcVar.l();
            }
        } finally {
            thVar.t(q36VarF);
        }
    }

    public final long a(long j, long j2) {
        hm9.m("au8", "countMessagesFrom chatId = %d, timeFrom = %d", Long.valueOf(j), Long.valueOf(j2));
        t19 t19VarD = ((k24) this.a).c.d();
        t19VarD.getClass();
        xlc xlcVarA = xlc.a(4, "SELECT COUNT(*) FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = ? AND status <> ?");
        xlcVarA.j(1, j);
        xlcVarA.j(2, j2);
        ey8.m(xlcVarA, 3, 0, t19VarD);
        xlcVarA.j(4, 10);
        ilc ilcVar = t19VarD.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            return cursorO.moveToFirst() ? cursorO.getLong(0) : 0L;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public final void b(long j, long j2, long j3) throws Throwable {
        xlc xlcVar;
        ilc ilcVar;
        String string;
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        String string2;
        int i4;
        String string3;
        int i5;
        int i6;
        byte[] blob;
        int i7;
        Long lValueOf;
        int i8;
        Boolean boolValueOf;
        k24 k24Var = (k24) this.a;
        vlc vlcVar = k24Var.c;
        t19 t19VarD = vlcVar.d();
        t19VarD.getClass();
        xlc xlcVarA = xlc.a(2, "SELECT * FROM messages WHERE time >= ? AND time <= ? AND msg_link_id > 0");
        xlcVarA.j(1, j2);
        xlcVarA.j(2, Long.MAX_VALUE);
        ilc ilcVar2 = t19VarD.a;
        ilcVar2.b();
        Cursor cursorO = ilcVar2.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "server_id");
            int iN3 = tfg.n(cursorO, "time");
            int iN4 = tfg.n(cursorO, "update_time");
            int iN5 = tfg.n(cursorO, "sender");
            int iN6 = tfg.n(cursorO, "cid");
            int iN7 = tfg.n(cursorO, "text");
            int iN8 = tfg.n(cursorO, "delivery_status");
            int iN9 = tfg.n(cursorO, "status");
            int iN10 = tfg.n(cursorO, "time_local");
            int iN11 = tfg.n(cursorO, "error");
            int iN12 = tfg.n(cursorO, "localized_error");
            int iN13 = tfg.n(cursorO, "attaches");
            xlcVar = xlcVarA;
            try {
                int iN14 = tfg.n(cursorO, "media_type");
                int iN15 = tfg.n(cursorO, "detect_share");
                int iN16 = tfg.n(cursorO, "msg_link_type");
                int iN17 = tfg.n(cursorO, "msg_link_id");
                int iN18 = tfg.n(cursorO, "inserted_from_msg_link");
                int iN19 = tfg.n(cursorO, "msg_link_chat_id");
                int iN20 = tfg.n(cursorO, "msg_link_chat_name");
                int iN21 = tfg.n(cursorO, "msg_link_chat_link");
                int iN22 = tfg.n(cursorO, "msg_link_out_chat_id");
                int iN23 = tfg.n(cursorO, "msg_link_out_msg_id");
                int iN24 = tfg.n(cursorO, "type");
                int iN25 = tfg.n(cursorO, "chat_id");
                int iN26 = tfg.n(cursorO, "ttl");
                int iN27 = tfg.n(cursorO, "channel_views");
                int iN28 = tfg.n(cursorO, "channel_forwards");
                int iN29 = tfg.n(cursorO, "view_time");
                int iN30 = tfg.n(cursorO, "zoom");
                int iN31 = tfg.n(cursorO, "options");
                int iN32 = tfg.n(cursorO, "live_until");
                int iN33 = tfg.n(cursorO, "elements");
                int iN34 = tfg.n(cursorO, "reactions");
                int iN35 = tfg.n(cursorO, "delayed_attrs_time_to_fire");
                int iN36 = tfg.n(cursorO, "delayed_attrs_notify_sender");
                int i9 = iN13;
                ArrayList arrayList = new ArrayList(cursorO.getCount());
                while (cursorO.moveToNext()) {
                    long j4 = cursorO.getLong(iN);
                    long j5 = cursorO.getLong(iN2);
                    long j6 = cursorO.getLong(iN3);
                    long j7 = cursorO.getLong(iN4);
                    long j8 = cursorO.getLong(iN5);
                    long j9 = cursorO.getLong(iN6);
                    String string4 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                    int i10 = cursorO.getInt(iN8);
                    t19VarD.a().getClass();
                    iu8.b.getClass();
                    iu8 iu8VarN = oz7.n(i10);
                    int i11 = cursorO.getInt(iN9);
                    t19VarD.a().getClass();
                    vx8 vx8VarB = v89.b(i11);
                    long j10 = cursorO.getLong(iN10);
                    String string5 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                    if (cursorO.isNull(iN12)) {
                        i = i9;
                        string = null;
                    } else {
                        string = cursorO.getString(iN12);
                        i = i9;
                    }
                    byte[] blob2 = cursorO.isNull(i) ? null : cursorO.getBlob(i);
                    t19VarD.a().getClass();
                    k8g k8gVarB = iz7.b(blob2);
                    int i12 = iN5;
                    int i13 = iN14;
                    int i14 = cursorO.getInt(i13);
                    iN14 = i13;
                    int i15 = iN15;
                    if (cursorO.getInt(i15) != 0) {
                        iN15 = i15;
                        i2 = iN16;
                        z = true;
                    } else {
                        iN15 = i15;
                        i2 = iN16;
                        z = false;
                    }
                    int i16 = cursorO.getInt(i2);
                    iN16 = i2;
                    int i17 = iN17;
                    long j11 = cursorO.getLong(i17);
                    iN17 = i17;
                    int i18 = iN18;
                    if (cursorO.getInt(i18) != 0) {
                        iN18 = i18;
                        i3 = iN19;
                        z2 = true;
                    } else {
                        iN18 = i18;
                        i3 = iN19;
                        z2 = false;
                    }
                    long j12 = cursorO.getLong(i3);
                    iN19 = i3;
                    int i19 = iN20;
                    if (cursorO.isNull(i19)) {
                        iN20 = i19;
                        i4 = iN21;
                        string2 = null;
                    } else {
                        string2 = cursorO.getString(i19);
                        iN20 = i19;
                        i4 = iN21;
                    }
                    if (cursorO.isNull(i4)) {
                        iN21 = i4;
                        i5 = iN22;
                        string3 = null;
                    } else {
                        string3 = cursorO.getString(i4);
                        iN21 = i4;
                        i5 = iN22;
                    }
                    long j13 = cursorO.getLong(i5);
                    iN22 = i5;
                    int i20 = iN23;
                    long j14 = cursorO.getLong(i20);
                    iN23 = i20;
                    int i21 = iN24;
                    int i22 = cursorO.getInt(i21);
                    t19VarD.a().getClass();
                    int iA = ey8.a(i22);
                    iN24 = i21;
                    int i23 = iN25;
                    long j15 = cursorO.getLong(i23);
                    iN25 = i23;
                    int i24 = iN26;
                    int i25 = cursorO.getInt(i24);
                    iN26 = i24;
                    int i26 = iN27;
                    int i27 = cursorO.getInt(i26);
                    iN27 = i26;
                    int i28 = iN28;
                    int i29 = cursorO.getInt(i28);
                    iN28 = i28;
                    int i30 = iN29;
                    long j16 = cursorO.getLong(i30);
                    iN29 = i30;
                    int i31 = iN30;
                    int i32 = cursorO.getInt(i31);
                    iN30 = i31;
                    int i33 = iN31;
                    int i34 = cursorO.getInt(i33);
                    iN31 = i33;
                    int i35 = iN32;
                    long j17 = cursorO.getLong(i35);
                    iN32 = i35;
                    int i36 = iN33;
                    byte[] blob3 = cursorO.isNull(i36) ? null : cursorO.getBlob(i36);
                    t19VarD.a().getClass();
                    List listA = v89.a(blob3);
                    iN33 = i36;
                    int i37 = iN34;
                    if (cursorO.isNull(i37)) {
                        i6 = i37;
                        i7 = iN12;
                        blob = null;
                    } else {
                        i6 = i37;
                        blob = cursorO.getBlob(i37);
                        i7 = iN12;
                    }
                    ix8 ix8VarC = t19VarD.a().c(blob);
                    int i38 = iN35;
                    if (cursorO.isNull(i38)) {
                        i8 = iN36;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(cursorO.getLong(i38));
                        i8 = iN36;
                    }
                    Integer numValueOf = cursorO.isNull(i8) ? null : Integer.valueOf(cursorO.getInt(i8));
                    if (numValueOf == null) {
                        iN35 = i38;
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        iN35 = i38;
                    }
                    arrayList.add(new ru8(j4, j5, j6, j7, j8, j9, string4, iu8VarN, vx8VarB, j10, string5, string, k8gVarB, i14, z, i16, j11, z2, j12, string2, string3, j13, j14, iA, j15, i25, i27, i29, j16, i32, i34, j17, listA, ix8VarC, lValueOf, boolValueOf));
                    iN36 = i8;
                    iN12 = i7;
                    iN5 = i12;
                    iN34 = i6;
                    i9 = i;
                }
                cursorO.close();
                xlcVar.n();
                ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(vlcVar.b((ru8) it.next()));
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        cu8 cu8Var = ((cu8) it2.next()).C0;
                        arrayList3.add(Long.valueOf(cu8Var != null ? cu8Var.b : 0L));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                vlc vlcVar2 = k24Var.c;
                mg4 mg4Var = mg4.REGULAR;
                vlcVar2.getClass();
                int iOrdinal = mg4Var.ordinal();
                int i39 = 4;
                if (iOrdinal == 0) {
                    ilcVar = vlcVar2.d().a;
                    ilcVar.b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("DELETE FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND id NOT IN (");
                    a14.c(sb, arrayList3.size());
                    sb.append(")");
                    q36 q36VarD = ilcVar.d(sb.toString());
                    q36VarD.j(1, j);
                    q36VarD.j(2, j2);
                    q36VarD.j(3, j3);
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Long l = (Long) it3.next();
                        if (l == null) {
                            q36VarD.W(i39);
                        } else {
                            q36VarD.j(i39, l.longValue());
                        }
                        i39++;
                    }
                    ilcVar.c();
                    try {
                        q36VarD.n();
                        ilcVar.r();
                    } finally {
                    }
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ilcVar = vlcVar2.d().a;
                    ilcVar.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DELETE FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND id NOT IN (");
                    a14.c(sb2, arrayList3.size());
                    sb2.append(")");
                    q36 q36VarD2 = ilcVar.d(sb2.toString());
                    q36VarD2.j(1, j);
                    q36VarD2.j(2, j2);
                    q36VarD2.j(3, j3);
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        Long l2 = (Long) it4.next();
                        if (l2 == null) {
                            q36VarD2.W(i39);
                        } else {
                            q36VarD2.j(i39, l2.longValue());
                        }
                        i39++;
                    }
                    ilcVar.c();
                    try {
                        q36VarD2.n();
                        ilcVar.r();
                        ilcVar.l();
                    } finally {
                    }
                }
                this.b.c(new re9(j, j2, j3, mg4.REGULAR));
            } catch (Throwable th2) {
                th = th2;
                cursorO.close();
                xlcVar.n();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xlcVar = xlcVarA;
        }
    }

    public final void c(long j, Collection collection) {
        Long lValueOf = Long.valueOf(j);
        jy2 jy2Var = new jy2(28, new hj8(10));
        StringBuilder sb = new StringBuilder();
        x53.l0(collection, sb, ",", "[", "]", -1, "", jy2Var);
        hm9.m("au8", "deleteMessages %d ids = %s", lValueOf, sb.toString());
        this.d.getClass();
        if (j != 0) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                sna.b(j, ((Long) it.next()).longValue());
            }
        }
        t6b t6bVar = this.f;
        t6bVar.getClass();
        Iterator it2 = x53.D0(collection).iterator();
        while (it2.hasNext()) {
            t6bVar.c.remove(Long.valueOf(((Number) it2.next()).longValue()));
        }
        t19 t19VarD = ((k24) this.a).c.d();
        List<Long> listD0 = x53.D0(collection);
        ilc ilcVar = t19VarD.a;
        ilcVar.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM messages WHERE chat_id = ? AND id in (");
        a14.c(sb2, listD0.size());
        sb2.append(")");
        q36 q36VarD = ilcVar.d(sb2.toString());
        q36VarD.j(1, j);
        int i = 2;
        for (Long l : listD0) {
            if (l == null) {
                q36VarD.W(i);
            } else {
                q36VarD.j(i, l.longValue());
            }
            i++;
        }
        ilcVar.c();
        try {
            q36VarD.n();
            ilcVar.r();
        } finally {
            ilcVar.l();
        }
    }

    public final int d(long j, long j2, mg4 mg4Var) {
        ConcurrentHashMap concurrentHashMap = this.f.c;
        Iterator it = x53.D0(concurrentHashMap.values()).iterator();
        int i = 0;
        while (it.hasNext()) {
            cu8 cu8Var = ((u6b) it.next()).d;
            if (cu8Var.t0 == j) {
                int i2 = mg4Var == null ? -1 : s6b.$EnumSwitchMapping$0[mg4Var.ordinal()];
                long j3 = cu8Var.b;
                if (i2 == -1 || i2 == 1) {
                    if (cu8Var.o <= j2) {
                        concurrentHashMap.remove(Long.valueOf(j3));
                        i++;
                    }
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ng4 ng4Var = cu8Var.T0;
                    if (ng4Var != null && ng4Var.a <= j2) {
                        concurrentHashMap.remove(Long.valueOf(j3));
                        i++;
                    }
                }
            }
        }
        if (i > 0) {
            hm9.m("t6b", "clearPreprocessedDataInChat: chatId = %d, itemType = %s, count = %d", Long.valueOf(j), mg4Var, Integer.valueOf(i));
        }
        return ((k24) this.a).c.a(j, j2, mg4Var);
    }

    public final boolean e(long j, long j2) {
        return ((k24) this.a).c.d().i(j, j2) != null;
    }

    public final long f(long j, long j2, fs8 fs8Var) {
        List listSingletonList = Collections.singletonList(fs8Var);
        qj3 qj3Var = this.i;
        if (qj3Var != null) {
            try {
                qj3Var.accept(listSingletonList);
            } catch (Throwable th) {
                hm9.p("au8", "validateMessages: exception", th);
            }
        }
        return ((k24) this.a).c.e(j, j2, fs8Var);
    }

    public final void g(long j, long j2, List list) {
        qj3 qj3Var = this.i;
        if (qj3Var != null) {
            try {
                qj3Var.accept(list);
            } catch (Throwable th) {
                hm9.p("au8", "validateMessages: exception", th);
            }
        }
        vlc vlcVar = ((k24) this.a).c;
        ((OneMeRoomDatabase) vlcVar.a.m()).q(new v60(list, vlcVar, j, j2, 2));
    }

    public final void h(Map map) {
        vlc vlcVar = ((k24) this.a).c;
        ((OneMeRoomDatabase) vlcVar.a.m()).q(new flc(map, 1, vlcVar));
    }

    public final ArrayList i(long j) throws Throwable {
        vlc vlcVar;
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
        ArrayList arrayList;
        String string;
        int i;
        int i2;
        boolean z;
        String string2;
        int i3;
        String string3;
        int i4;
        int i5;
        byte[] blob;
        int i6;
        Long lValueOf;
        int i7;
        Boolean boolValueOf;
        xlc xlcVar2;
        int iN14;
        int iN15;
        int iN16;
        int iN17;
        int iN18;
        int iN19;
        int iN20;
        int iN21;
        int iN22;
        int iN23;
        int iN24;
        int iN25;
        int iN26;
        String string4;
        int i8;
        int i9;
        boolean z2;
        String string5;
        int i10;
        String string6;
        int i11;
        int i12;
        byte[] blob2;
        int i13;
        Long lValueOf2;
        int i14;
        Boolean boolValueOf2;
        vlc vlcVar2 = ((k24) this.a).c;
        vlcVar2.getClass();
        int iOrdinal = mg4.REGULAR.ordinal();
        if (iOrdinal == 0) {
            vlcVar = vlcVar2;
            t19 t19VarD = vlcVar.d();
            t19VarD.getClass();
            xlc xlcVarA = xlc.a(2, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC LIMIT ?");
            xlcVarA.j(1, j);
            xlcVarA.j(2, -1);
            ilc ilcVar = t19VarD.a;
            ilcVar.b();
            Cursor cursorO = ilcVar.o(xlcVarA, null);
            try {
                iN = tfg.n(cursorO, "id");
                iN2 = tfg.n(cursorO, "server_id");
                iN3 = tfg.n(cursorO, "time");
                iN4 = tfg.n(cursorO, "update_time");
                iN5 = tfg.n(cursorO, "sender");
                iN6 = tfg.n(cursorO, "cid");
                iN7 = tfg.n(cursorO, "text");
                iN8 = tfg.n(cursorO, "delivery_status");
                iN9 = tfg.n(cursorO, "status");
                iN10 = tfg.n(cursorO, "time_local");
                iN11 = tfg.n(cursorO, "error");
                iN12 = tfg.n(cursorO, "localized_error");
                iN13 = tfg.n(cursorO, "attaches");
                xlcVar = xlcVarA;
            } catch (Throwable th) {
                th = th;
                xlcVar = xlcVarA;
            }
            try {
                int iN27 = tfg.n(cursorO, "media_type");
                int iN28 = tfg.n(cursorO, "detect_share");
                int iN29 = tfg.n(cursorO, "msg_link_type");
                int iN30 = tfg.n(cursorO, "msg_link_id");
                int iN31 = tfg.n(cursorO, "inserted_from_msg_link");
                int iN32 = tfg.n(cursorO, "msg_link_chat_id");
                int iN33 = tfg.n(cursorO, "msg_link_chat_name");
                int iN34 = tfg.n(cursorO, "msg_link_chat_link");
                int iN35 = tfg.n(cursorO, "msg_link_out_chat_id");
                int iN36 = tfg.n(cursorO, "msg_link_out_msg_id");
                int iN37 = tfg.n(cursorO, "type");
                int iN38 = tfg.n(cursorO, "chat_id");
                int iN39 = tfg.n(cursorO, "ttl");
                int iN40 = tfg.n(cursorO, "channel_views");
                int iN41 = tfg.n(cursorO, "channel_forwards");
                int iN42 = tfg.n(cursorO, "view_time");
                int iN43 = tfg.n(cursorO, "zoom");
                int iN44 = tfg.n(cursorO, "options");
                int iN45 = tfg.n(cursorO, "live_until");
                int iN46 = tfg.n(cursorO, "elements");
                int iN47 = tfg.n(cursorO, "reactions");
                int iN48 = tfg.n(cursorO, "delayed_attrs_time_to_fire");
                int iN49 = tfg.n(cursorO, "delayed_attrs_notify_sender");
                int i15 = iN13;
                ArrayList arrayList2 = new ArrayList(cursorO.getCount());
                while (cursorO.moveToNext()) {
                    long j2 = cursorO.getLong(iN);
                    long j3 = cursorO.getLong(iN2);
                    long j4 = cursorO.getLong(iN3);
                    long j5 = cursorO.getLong(iN4);
                    long j6 = cursorO.getLong(iN5);
                    long j7 = cursorO.getLong(iN6);
                    String string7 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                    int i16 = cursorO.getInt(iN8);
                    t19VarD.a().getClass();
                    iu8.b.getClass();
                    iu8 iu8VarN = oz7.n(i16);
                    int i17 = cursorO.getInt(iN9);
                    t19VarD.a().getClass();
                    vx8 vx8VarB = v89.b(i17);
                    long j8 = cursorO.getLong(iN10);
                    String string8 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                    if (cursorO.isNull(iN12)) {
                        i = i15;
                        string = null;
                    } else {
                        string = cursorO.getString(iN12);
                        i = i15;
                    }
                    byte[] blob3 = cursorO.isNull(i) ? null : cursorO.getBlob(i);
                    t19VarD.a().getClass();
                    k8g k8gVarB = iz7.b(blob3);
                    int i18 = iN;
                    int i19 = iN27;
                    int i20 = cursorO.getInt(i19);
                    iN27 = i19;
                    int i21 = iN28;
                    int i22 = cursorO.getInt(i21);
                    iN28 = i21;
                    int i23 = iN29;
                    boolean z3 = i22 != 0;
                    int i24 = cursorO.getInt(i23);
                    iN29 = i23;
                    int i25 = iN30;
                    long j9 = cursorO.getLong(i25);
                    iN30 = i25;
                    int i26 = iN31;
                    if (cursorO.getInt(i26) != 0) {
                        iN31 = i26;
                        i2 = iN32;
                        z = true;
                    } else {
                        iN31 = i26;
                        i2 = iN32;
                        z = false;
                    }
                    long j10 = cursorO.getLong(i2);
                    iN32 = i2;
                    int i27 = iN33;
                    if (cursorO.isNull(i27)) {
                        iN33 = i27;
                        i3 = iN34;
                        string2 = null;
                    } else {
                        string2 = cursorO.getString(i27);
                        iN33 = i27;
                        i3 = iN34;
                    }
                    if (cursorO.isNull(i3)) {
                        iN34 = i3;
                        i4 = iN35;
                        string3 = null;
                    } else {
                        string3 = cursorO.getString(i3);
                        iN34 = i3;
                        i4 = iN35;
                    }
                    long j11 = cursorO.getLong(i4);
                    iN35 = i4;
                    int i28 = iN36;
                    long j12 = cursorO.getLong(i28);
                    iN36 = i28;
                    int i29 = iN37;
                    int i30 = cursorO.getInt(i29);
                    t19VarD.a().getClass();
                    int iA = ey8.a(i30);
                    iN37 = i29;
                    int i31 = iN38;
                    long j13 = cursorO.getLong(i31);
                    iN38 = i31;
                    int i32 = iN39;
                    int i33 = cursorO.getInt(i32);
                    iN39 = i32;
                    int i34 = iN40;
                    int i35 = cursorO.getInt(i34);
                    iN40 = i34;
                    int i36 = iN41;
                    int i37 = cursorO.getInt(i36);
                    iN41 = i36;
                    int i38 = iN42;
                    long j14 = cursorO.getLong(i38);
                    iN42 = i38;
                    int i39 = iN43;
                    int i40 = cursorO.getInt(i39);
                    iN43 = i39;
                    int i41 = iN44;
                    int i42 = cursorO.getInt(i41);
                    iN44 = i41;
                    int i43 = iN45;
                    long j15 = cursorO.getLong(i43);
                    iN45 = i43;
                    int i44 = iN46;
                    byte[] blob4 = cursorO.isNull(i44) ? null : cursorO.getBlob(i44);
                    t19VarD.a().getClass();
                    List listA = v89.a(blob4);
                    iN46 = i44;
                    int i45 = iN47;
                    if (cursorO.isNull(i45)) {
                        i5 = i45;
                        i6 = i;
                        blob = null;
                    } else {
                        i5 = i45;
                        blob = cursorO.getBlob(i45);
                        i6 = i;
                    }
                    ix8 ix8VarC = t19VarD.a().c(blob);
                    int i46 = iN48;
                    if (cursorO.isNull(i46)) {
                        i7 = iN49;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(cursorO.getLong(i46));
                        i7 = iN49;
                    }
                    Integer numValueOf = cursorO.isNull(i7) ? null : Integer.valueOf(cursorO.getInt(i7));
                    if (numValueOf == null) {
                        iN48 = i46;
                        boolValueOf = null;
                    } else {
                        iN48 = i46;
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    arrayList2.add(new ru8(j2, j3, j4, j5, j6, j7, string7, iu8VarN, vx8VarB, j8, string8, string, k8gVarB, i20, z3, i24, j9, z, j10, string2, string3, j11, j12, iA, j13, i33, i35, i37, j14, i40, i42, j15, listA, ix8VarC, lValueOf, boolValueOf));
                    iN49 = i7;
                    iN = i18;
                    i15 = i6;
                    iN47 = i5;
                }
                cursorO.close();
                xlcVar.n();
                arrayList = arrayList2;
            } catch (Throwable th2) {
                th = th2;
                cursorO.close();
                xlcVar.n();
                throw th;
            }
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            t19 t19VarD2 = vlcVar2.d();
            t19VarD2.getClass();
            vlcVar = vlcVar2;
            xlc xlcVarA2 = xlc.a(2, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
            xlcVarA2.j(1, j);
            xlcVarA2.j(2, -1);
            ilc ilcVar2 = t19VarD2.a;
            ilcVar2.b();
            Cursor cursorO2 = ilcVar2.o(xlcVarA2, null);
            try {
                iN14 = tfg.n(cursorO2, "id");
                iN15 = tfg.n(cursorO2, "server_id");
                iN16 = tfg.n(cursorO2, "time");
                iN17 = tfg.n(cursorO2, "update_time");
                iN18 = tfg.n(cursorO2, "sender");
                iN19 = tfg.n(cursorO2, "cid");
                iN20 = tfg.n(cursorO2, "text");
                iN21 = tfg.n(cursorO2, "delivery_status");
                iN22 = tfg.n(cursorO2, "status");
                iN23 = tfg.n(cursorO2, "time_local");
                iN24 = tfg.n(cursorO2, "error");
                iN25 = tfg.n(cursorO2, "localized_error");
                iN26 = tfg.n(cursorO2, "attaches");
                xlcVar2 = xlcVarA2;
            } catch (Throwable th3) {
                th = th3;
                xlcVar2 = xlcVarA2;
            }
            try {
                int iN50 = tfg.n(cursorO2, "media_type");
                int iN51 = tfg.n(cursorO2, "detect_share");
                int iN52 = tfg.n(cursorO2, "msg_link_type");
                int iN53 = tfg.n(cursorO2, "msg_link_id");
                int iN54 = tfg.n(cursorO2, "inserted_from_msg_link");
                int iN55 = tfg.n(cursorO2, "msg_link_chat_id");
                int iN56 = tfg.n(cursorO2, "msg_link_chat_name");
                int iN57 = tfg.n(cursorO2, "msg_link_chat_link");
                int iN58 = tfg.n(cursorO2, "msg_link_out_chat_id");
                int iN59 = tfg.n(cursorO2, "msg_link_out_msg_id");
                int iN60 = tfg.n(cursorO2, "type");
                int iN61 = tfg.n(cursorO2, "chat_id");
                int iN62 = tfg.n(cursorO2, "ttl");
                int iN63 = tfg.n(cursorO2, "channel_views");
                int iN64 = tfg.n(cursorO2, "channel_forwards");
                int iN65 = tfg.n(cursorO2, "view_time");
                int iN66 = tfg.n(cursorO2, "zoom");
                int iN67 = tfg.n(cursorO2, "options");
                int iN68 = tfg.n(cursorO2, "live_until");
                int iN69 = tfg.n(cursorO2, "elements");
                int iN70 = tfg.n(cursorO2, "reactions");
                int iN71 = tfg.n(cursorO2, "delayed_attrs_time_to_fire");
                int iN72 = tfg.n(cursorO2, "delayed_attrs_notify_sender");
                int i47 = iN26;
                arrayList = new ArrayList(cursorO2.getCount());
                while (cursorO2.moveToNext()) {
                    long j16 = cursorO2.getLong(iN14);
                    long j17 = cursorO2.getLong(iN15);
                    long j18 = cursorO2.getLong(iN16);
                    long j19 = cursorO2.getLong(iN17);
                    long j20 = cursorO2.getLong(iN18);
                    long j21 = cursorO2.getLong(iN19);
                    String string9 = cursorO2.isNull(iN20) ? null : cursorO2.getString(iN20);
                    int i48 = cursorO2.getInt(iN21);
                    t19VarD2.a().getClass();
                    iu8.b.getClass();
                    iu8 iu8VarN2 = oz7.n(i48);
                    int i49 = cursorO2.getInt(iN22);
                    t19VarD2.a().getClass();
                    vx8 vx8VarB2 = v89.b(i49);
                    long j22 = cursorO2.getLong(iN23);
                    String string10 = cursorO2.isNull(iN24) ? null : cursorO2.getString(iN24);
                    if (cursorO2.isNull(iN25)) {
                        i8 = i47;
                        string4 = null;
                    } else {
                        string4 = cursorO2.getString(iN25);
                        i8 = i47;
                    }
                    byte[] blob5 = cursorO2.isNull(i8) ? null : cursorO2.getBlob(i8);
                    t19VarD2.a().getClass();
                    k8g k8gVarB2 = iz7.b(blob5);
                    int i50 = iN14;
                    int i51 = iN50;
                    int i52 = cursorO2.getInt(i51);
                    iN50 = i51;
                    int i53 = iN51;
                    int i54 = cursorO2.getInt(i53);
                    iN51 = i53;
                    int i55 = iN52;
                    boolean z4 = i54 != 0;
                    int i56 = cursorO2.getInt(i55);
                    iN52 = i55;
                    int i57 = iN53;
                    long j23 = cursorO2.getLong(i57);
                    iN53 = i57;
                    int i58 = iN54;
                    if (cursorO2.getInt(i58) != 0) {
                        iN54 = i58;
                        i9 = iN55;
                        z2 = true;
                    } else {
                        iN54 = i58;
                        i9 = iN55;
                        z2 = false;
                    }
                    long j24 = cursorO2.getLong(i9);
                    iN55 = i9;
                    int i59 = iN56;
                    if (cursorO2.isNull(i59)) {
                        iN56 = i59;
                        i10 = iN57;
                        string5 = null;
                    } else {
                        string5 = cursorO2.getString(i59);
                        iN56 = i59;
                        i10 = iN57;
                    }
                    if (cursorO2.isNull(i10)) {
                        iN57 = i10;
                        i11 = iN58;
                        string6 = null;
                    } else {
                        string6 = cursorO2.getString(i10);
                        iN57 = i10;
                        i11 = iN58;
                    }
                    long j25 = cursorO2.getLong(i11);
                    iN58 = i11;
                    int i60 = iN59;
                    long j26 = cursorO2.getLong(i60);
                    iN59 = i60;
                    int i61 = iN60;
                    int i62 = cursorO2.getInt(i61);
                    t19VarD2.a().getClass();
                    int iA2 = ey8.a(i62);
                    iN60 = i61;
                    int i63 = iN61;
                    long j27 = cursorO2.getLong(i63);
                    iN61 = i63;
                    int i64 = iN62;
                    int i65 = cursorO2.getInt(i64);
                    iN62 = i64;
                    int i66 = iN63;
                    int i67 = cursorO2.getInt(i66);
                    iN63 = i66;
                    int i68 = iN64;
                    int i69 = cursorO2.getInt(i68);
                    iN64 = i68;
                    int i70 = iN65;
                    long j28 = cursorO2.getLong(i70);
                    iN65 = i70;
                    int i71 = iN66;
                    int i72 = cursorO2.getInt(i71);
                    iN66 = i71;
                    int i73 = iN67;
                    int i74 = cursorO2.getInt(i73);
                    iN67 = i73;
                    int i75 = iN68;
                    long j29 = cursorO2.getLong(i75);
                    iN68 = i75;
                    int i76 = iN69;
                    byte[] blob6 = cursorO2.isNull(i76) ? null : cursorO2.getBlob(i76);
                    t19VarD2.a().getClass();
                    List listA2 = v89.a(blob6);
                    iN69 = i76;
                    int i77 = iN70;
                    if (cursorO2.isNull(i77)) {
                        i12 = i77;
                        i13 = iN15;
                        blob2 = null;
                    } else {
                        i12 = i77;
                        blob2 = cursorO2.getBlob(i77);
                        i13 = iN15;
                    }
                    ix8 ix8VarC2 = t19VarD2.a().c(blob2);
                    int i78 = iN71;
                    if (cursorO2.isNull(i78)) {
                        i14 = iN72;
                        lValueOf2 = null;
                    } else {
                        lValueOf2 = Long.valueOf(cursorO2.getLong(i78));
                        i14 = iN72;
                    }
                    Integer numValueOf2 = cursorO2.isNull(i14) ? null : Integer.valueOf(cursorO2.getInt(i14));
                    if (numValueOf2 == null) {
                        iN71 = i78;
                        boolValueOf2 = null;
                    } else {
                        iN71 = i78;
                        boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    arrayList.add(new ru8(j16, j17, j18, j19, j20, j21, string9, iu8VarN2, vx8VarB2, j22, string10, string4, k8gVarB2, i52, z4, i56, j23, z2, j24, string5, string6, j25, j26, iA2, j27, i65, i67, i69, j28, i72, i74, j29, listA2, ix8VarC2, lValueOf2, boolValueOf2));
                    iN72 = i14;
                    iN15 = i13;
                    iN14 = i50;
                    iN70 = i12;
                    i47 = i8;
                }
                cursorO2.close();
                xlcVar2.n();
            } catch (Throwable th4) {
                th = th4;
                cursorO2.close();
                xlcVar2.n();
                throw th;
            }
        }
        ArrayList arrayList3 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(vlcVar.b((ru8) it.next()));
        }
        return arrayList3;
    }

    public final cu8 j(long j, long j2) {
        vlc vlcVar = ((k24) this.a).c;
        ru8 ru8VarB = vlcVar.d().b(j, j2);
        if (ru8VarB != null) {
            return vlcVar.b(ru8VarB);
        }
        return null;
    }

    public final ArrayList k(long j, Collection collection) throws Throwable {
        xlc xlcVar;
        String string;
        int i;
        int i2;
        boolean z;
        String string2;
        int i3;
        String string3;
        int i4;
        int i5;
        byte[] blob;
        int i6;
        Long lValueOf;
        int i7;
        Boolean boolValueOf;
        vlc vlcVar = ((k24) this.a).c;
        t19 t19VarD = vlcVar.d();
        List<Long> listD0 = x53.D0(collection);
        t19VarD.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM messages WHERE chat_id = ? AND server_id in (");
        int size = listD0.size();
        a14.c(sb, size);
        sb.append(")");
        xlc xlcVarA = xlc.a(size + 1, sb.toString());
        xlcVarA.j(1, j);
        int i8 = 2;
        for (Long l : listD0) {
            if (l == null) {
                xlcVarA.W(i8);
            } else {
                xlcVarA.j(i8, l.longValue());
            }
            i8++;
        }
        ilc ilcVar = t19VarD.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "server_id");
            int iN3 = tfg.n(cursorO, "time");
            int iN4 = tfg.n(cursorO, "update_time");
            int iN5 = tfg.n(cursorO, "sender");
            int iN6 = tfg.n(cursorO, "cid");
            int iN7 = tfg.n(cursorO, "text");
            int iN8 = tfg.n(cursorO, "delivery_status");
            int iN9 = tfg.n(cursorO, "status");
            int iN10 = tfg.n(cursorO, "time_local");
            int iN11 = tfg.n(cursorO, "error");
            int iN12 = tfg.n(cursorO, "localized_error");
            int iN13 = tfg.n(cursorO, "attaches");
            xlcVar = xlcVarA;
            try {
                int iN14 = tfg.n(cursorO, "media_type");
                int iN15 = tfg.n(cursorO, "detect_share");
                int iN16 = tfg.n(cursorO, "msg_link_type");
                int iN17 = tfg.n(cursorO, "msg_link_id");
                int iN18 = tfg.n(cursorO, "inserted_from_msg_link");
                int iN19 = tfg.n(cursorO, "msg_link_chat_id");
                int iN20 = tfg.n(cursorO, "msg_link_chat_name");
                int iN21 = tfg.n(cursorO, "msg_link_chat_link");
                int iN22 = tfg.n(cursorO, "msg_link_out_chat_id");
                int iN23 = tfg.n(cursorO, "msg_link_out_msg_id");
                int iN24 = tfg.n(cursorO, "type");
                int iN25 = tfg.n(cursorO, "chat_id");
                int iN26 = tfg.n(cursorO, "ttl");
                int iN27 = tfg.n(cursorO, "channel_views");
                int iN28 = tfg.n(cursorO, "channel_forwards");
                int iN29 = tfg.n(cursorO, "view_time");
                int iN30 = tfg.n(cursorO, "zoom");
                int iN31 = tfg.n(cursorO, "options");
                int iN32 = tfg.n(cursorO, "live_until");
                int iN33 = tfg.n(cursorO, "elements");
                int iN34 = tfg.n(cursorO, "reactions");
                int iN35 = tfg.n(cursorO, "delayed_attrs_time_to_fire");
                int iN36 = tfg.n(cursorO, "delayed_attrs_notify_sender");
                int i9 = iN13;
                ArrayList arrayList = new ArrayList(cursorO.getCount());
                while (cursorO.moveToNext()) {
                    long j2 = cursorO.getLong(iN);
                    long j3 = cursorO.getLong(iN2);
                    long j4 = cursorO.getLong(iN3);
                    long j5 = cursorO.getLong(iN4);
                    long j6 = cursorO.getLong(iN5);
                    long j7 = cursorO.getLong(iN6);
                    String string4 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                    int i10 = cursorO.getInt(iN8);
                    t19VarD.a().getClass();
                    iu8.b.getClass();
                    iu8 iu8VarN = oz7.n(i10);
                    int i11 = cursorO.getInt(iN9);
                    t19VarD.a().getClass();
                    vx8 vx8VarB = v89.b(i11);
                    long j8 = cursorO.getLong(iN10);
                    String string5 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                    if (cursorO.isNull(iN12)) {
                        i = i9;
                        string = null;
                    } else {
                        string = cursorO.getString(iN12);
                        i = i9;
                    }
                    byte[] blob2 = cursorO.isNull(i) ? null : cursorO.getBlob(i);
                    t19VarD.a().getClass();
                    k8g k8gVarB = iz7.b(blob2);
                    i9 = i;
                    int i12 = iN14;
                    int i13 = cursorO.getInt(i12);
                    iN14 = i12;
                    int i14 = iN15;
                    int i15 = cursorO.getInt(i14);
                    iN15 = i14;
                    int i16 = iN16;
                    boolean z2 = i15 != 0;
                    int i17 = cursorO.getInt(i16);
                    int i18 = iN17;
                    long j9 = cursorO.getLong(i18);
                    iN17 = i18;
                    int i19 = iN18;
                    if (cursorO.getInt(i19) != 0) {
                        iN18 = i19;
                        i2 = iN19;
                        z = true;
                    } else {
                        iN18 = i19;
                        i2 = iN19;
                        z = false;
                    }
                    long j10 = cursorO.getLong(i2);
                    iN19 = i2;
                    int i20 = iN20;
                    if (cursorO.isNull(i20)) {
                        iN20 = i20;
                        i3 = iN21;
                        string2 = null;
                    } else {
                        string2 = cursorO.getString(i20);
                        iN20 = i20;
                        i3 = iN21;
                    }
                    if (cursorO.isNull(i3)) {
                        iN21 = i3;
                        i4 = iN22;
                        string3 = null;
                    } else {
                        string3 = cursorO.getString(i3);
                        iN21 = i3;
                        i4 = iN22;
                    }
                    long j11 = cursorO.getLong(i4);
                    iN22 = i4;
                    int i21 = iN23;
                    long j12 = cursorO.getLong(i21);
                    iN23 = i21;
                    int i22 = iN24;
                    int i23 = cursorO.getInt(i22);
                    t19VarD.a().getClass();
                    int iA = ey8.a(i23);
                    iN24 = i22;
                    int i24 = iN25;
                    long j13 = cursorO.getLong(i24);
                    iN25 = i24;
                    int i25 = iN26;
                    int i26 = cursorO.getInt(i25);
                    iN26 = i25;
                    int i27 = iN27;
                    int i28 = cursorO.getInt(i27);
                    iN27 = i27;
                    int i29 = iN28;
                    int i30 = cursorO.getInt(i29);
                    iN28 = i29;
                    int i31 = iN29;
                    long j14 = cursorO.getLong(i31);
                    iN29 = i31;
                    int i32 = iN30;
                    int i33 = cursorO.getInt(i32);
                    iN30 = i32;
                    int i34 = iN31;
                    int i35 = cursorO.getInt(i34);
                    iN31 = i34;
                    int i36 = iN32;
                    long j15 = cursorO.getLong(i36);
                    iN32 = i36;
                    int i37 = iN33;
                    byte[] blob3 = cursorO.isNull(i37) ? null : cursorO.getBlob(i37);
                    t19VarD.a().getClass();
                    List listA = v89.a(blob3);
                    iN33 = i37;
                    int i38 = iN34;
                    if (cursorO.isNull(i38)) {
                        i5 = i38;
                        i6 = iN11;
                        blob = null;
                    } else {
                        i5 = i38;
                        blob = cursorO.getBlob(i38);
                        i6 = iN11;
                    }
                    ix8 ix8VarC = t19VarD.a().c(blob);
                    int i39 = iN35;
                    if (cursorO.isNull(i39)) {
                        i7 = iN36;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(cursorO.getLong(i39));
                        i7 = iN36;
                    }
                    Integer numValueOf = cursorO.isNull(i7) ? null : Integer.valueOf(cursorO.getInt(i7));
                    if (numValueOf == null) {
                        iN35 = i39;
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        iN35 = i39;
                    }
                    arrayList.add(new ru8(j2, j3, j4, j5, j6, j7, string4, iu8VarN, vx8VarB, j8, string5, string, k8gVarB, i13, z2, i17, j9, z, j10, string2, string3, j11, j12, iA, j13, i26, i28, i30, j14, i33, i35, j15, listA, ix8VarC, lValueOf, boolValueOf));
                    iN36 = i7;
                    iN11 = i6;
                    iN16 = i16;
                    iN34 = i5;
                }
                cursorO.close();
                xlcVar.n();
                ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(vlcVar.b((ru8) it.next()));
                }
                return arrayList2;
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

    public final us l(ArrayList arrayList) throws Throwable {
        vlc vlcVar = ((k24) this.a).c;
        vlcVar.getClass();
        at atVar = new at(2, arrayList);
        np8.h(200, 200);
        um5 um5VarD0 = l6d.d0(new r1f(new dtd(atVar, 200, 200), new wz7(29, vlcVar)), n71.t0);
        us usVar = new us(0);
        pk5 pk5Var = new pk5(um5VarD0);
        while (pk5Var.hasNext()) {
            cu8 cu8VarB = vlcVar.b((ru8) pk5Var.next());
            usVar.put(Long.valueOf(cu8VarB.b), cu8VarB);
        }
        return usVar;
    }

    public final ArrayList m(long j, long j2) {
        xlc xlcVar;
        String string;
        int i;
        String string2;
        int i2;
        String string3;
        int i3;
        int i4;
        byte[] blob;
        int i5;
        Long lValueOf;
        int i6;
        Boolean boolValueOf;
        zu8 zu8Var = (zu8) this.g.get();
        vlc vlcVar = ((k24) this.a).c;
        t19 t19VarD = vlcVar.d();
        Set setSingleton = Collections.singleton(8);
        t19VarD.getClass();
        StringBuilder sbL = au1.l("SELECT * FROM messages WHERE media_type in (");
        int size = setSingleton.size();
        a14.c(sbL, size);
        sbL.append(") AND time >= ");
        sbL.append("?");
        sbL.append(" AND time <= ");
        sbL.append("?");
        sbL.append(" AND inserted_from_msg_link = 0 AND status <> ");
        sbL.append("?");
        sbL.append(" ORDER BY time DESC LIMIT ");
        sbL.append("?");
        int i7 = size + 4;
        xlc xlcVarA = xlc.a(i7, sbL.toString());
        Iterator it = setSingleton.iterator();
        int i8 = 1;
        while (it.hasNext()) {
            if (((Integer) it.next()) == null) {
                xlcVarA.W(i8);
            } else {
                xlcVarA.j(i8, r9.intValue());
            }
            i8++;
        }
        xlcVarA.j(size + 1, j);
        xlcVarA.j(size + 2, j2);
        t19VarD.a().getClass();
        xlcVarA.j(size + 3, 10);
        xlcVarA.j(i7, 100);
        ilc ilcVar = t19VarD.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "server_id");
            int iN3 = tfg.n(cursorO, "time");
            int iN4 = tfg.n(cursorO, "update_time");
            int iN5 = tfg.n(cursorO, "sender");
            int iN6 = tfg.n(cursorO, "cid");
            int iN7 = tfg.n(cursorO, "text");
            int iN8 = tfg.n(cursorO, "delivery_status");
            int iN9 = tfg.n(cursorO, "status");
            int iN10 = tfg.n(cursorO, "time_local");
            int iN11 = tfg.n(cursorO, "error");
            int iN12 = tfg.n(cursorO, "localized_error");
            int iN13 = tfg.n(cursorO, "attaches");
            xlcVar = xlcVarA;
            try {
                int iN14 = tfg.n(cursorO, "media_type");
                int iN15 = tfg.n(cursorO, "detect_share");
                int iN16 = tfg.n(cursorO, "msg_link_type");
                int iN17 = tfg.n(cursorO, "msg_link_id");
                int iN18 = tfg.n(cursorO, "inserted_from_msg_link");
                int iN19 = tfg.n(cursorO, "msg_link_chat_id");
                int iN20 = tfg.n(cursorO, "msg_link_chat_name");
                int iN21 = tfg.n(cursorO, "msg_link_chat_link");
                int iN22 = tfg.n(cursorO, "msg_link_out_chat_id");
                int iN23 = tfg.n(cursorO, "msg_link_out_msg_id");
                int iN24 = tfg.n(cursorO, "type");
                int iN25 = tfg.n(cursorO, "chat_id");
                int iN26 = tfg.n(cursorO, "ttl");
                int iN27 = tfg.n(cursorO, "channel_views");
                int iN28 = tfg.n(cursorO, "channel_forwards");
                int iN29 = tfg.n(cursorO, "view_time");
                int iN30 = tfg.n(cursorO, "zoom");
                int iN31 = tfg.n(cursorO, "options");
                int iN32 = tfg.n(cursorO, "live_until");
                int iN33 = tfg.n(cursorO, "elements");
                int iN34 = tfg.n(cursorO, "reactions");
                int iN35 = tfg.n(cursorO, "delayed_attrs_time_to_fire");
                int iN36 = tfg.n(cursorO, "delayed_attrs_notify_sender");
                int i9 = iN13;
                ArrayList arrayList = new ArrayList(cursorO.getCount());
                while (cursorO.moveToNext()) {
                    long j3 = cursorO.getLong(iN);
                    long j4 = cursorO.getLong(iN2);
                    long j5 = cursorO.getLong(iN3);
                    long j6 = cursorO.getLong(iN4);
                    long j7 = cursorO.getLong(iN5);
                    long j8 = cursorO.getLong(iN6);
                    String string4 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                    int i10 = cursorO.getInt(iN8);
                    t19VarD.a().getClass();
                    iu8.b.getClass();
                    iu8 iu8VarN = oz7.n(i10);
                    int i11 = cursorO.getInt(iN9);
                    t19VarD.a().getClass();
                    vx8 vx8VarB = v89.b(i11);
                    long j9 = cursorO.getLong(iN10);
                    String string5 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                    if (cursorO.isNull(iN12)) {
                        i = i9;
                        string = null;
                    } else {
                        string = cursorO.getString(iN12);
                        i = i9;
                    }
                    byte[] blob2 = cursorO.isNull(i) ? null : cursorO.getBlob(i);
                    t19VarD.a().getClass();
                    k8g k8gVarB = iz7.b(blob2);
                    i9 = i;
                    int i12 = iN14;
                    int i13 = cursorO.getInt(i12);
                    iN14 = i12;
                    int i14 = iN15;
                    iN15 = i14;
                    boolean z = cursorO.getInt(i14) != 0;
                    int i15 = iN16;
                    int i16 = cursorO.getInt(i15);
                    iN16 = i15;
                    int i17 = iN17;
                    long j10 = cursorO.getLong(i17);
                    iN17 = i17;
                    int i18 = iN18;
                    boolean z2 = cursorO.getInt(i18) != 0;
                    int i19 = iN19;
                    long j11 = cursorO.getLong(i19);
                    int i20 = iN20;
                    if (cursorO.isNull(i20)) {
                        iN20 = i20;
                        i2 = iN21;
                        string2 = null;
                    } else {
                        string2 = cursorO.getString(i20);
                        iN20 = i20;
                        i2 = iN21;
                    }
                    if (cursorO.isNull(i2)) {
                        iN21 = i2;
                        i3 = iN22;
                        string3 = null;
                    } else {
                        string3 = cursorO.getString(i2);
                        iN21 = i2;
                        i3 = iN22;
                    }
                    long j12 = cursorO.getLong(i3);
                    iN22 = i3;
                    int i21 = iN23;
                    long j13 = cursorO.getLong(i21);
                    iN23 = i21;
                    int i22 = iN24;
                    int i23 = cursorO.getInt(i22);
                    t19VarD.a().getClass();
                    int iA = ey8.a(i23);
                    iN24 = i22;
                    int i24 = iN25;
                    long j14 = cursorO.getLong(i24);
                    iN25 = i24;
                    int i25 = iN26;
                    int i26 = cursorO.getInt(i25);
                    iN26 = i25;
                    int i27 = iN27;
                    int i28 = cursorO.getInt(i27);
                    iN27 = i27;
                    int i29 = iN28;
                    int i30 = cursorO.getInt(i29);
                    iN28 = i29;
                    int i31 = iN29;
                    long j15 = cursorO.getLong(i31);
                    iN29 = i31;
                    int i32 = iN30;
                    int i33 = cursorO.getInt(i32);
                    iN30 = i32;
                    int i34 = iN31;
                    int i35 = cursorO.getInt(i34);
                    iN31 = i34;
                    int i36 = iN32;
                    long j16 = cursorO.getLong(i36);
                    iN32 = i36;
                    int i37 = iN33;
                    byte[] blob3 = cursorO.isNull(i37) ? null : cursorO.getBlob(i37);
                    t19VarD.a().getClass();
                    List listA = v89.a(blob3);
                    iN33 = i37;
                    int i38 = iN34;
                    if (cursorO.isNull(i38)) {
                        i4 = i38;
                        i5 = iN12;
                        blob = null;
                    } else {
                        i4 = i38;
                        blob = cursorO.getBlob(i38);
                        i5 = iN12;
                    }
                    ix8 ix8VarC = t19VarD.a().c(blob);
                    int i39 = iN35;
                    if (cursorO.isNull(i39)) {
                        i6 = iN36;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(cursorO.getLong(i39));
                        i6 = iN36;
                    }
                    Integer numValueOf = cursorO.isNull(i6) ? null : Integer.valueOf(cursorO.getInt(i6));
                    if (numValueOf == null) {
                        iN35 = i39;
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        iN35 = i39;
                    }
                    arrayList.add(new ru8(j3, j4, j5, j6, j7, j8, string4, iu8VarN, vx8VarB, j9, string5, string, k8gVarB, i13, z, i16, j10, z2, j11, string2, string3, j12, j13, iA, j14, i26, i28, i30, j15, i33, i35, j16, listA, ix8VarC, lValueOf, boolValueOf));
                    iN36 = i6;
                    iN18 = i18;
                    iN12 = i5;
                    iN19 = i19;
                    iN34 = i4;
                }
                cursorO.close();
                xlcVar.n();
                ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(vlcVar.b((ru8) it2.next()));
                }
                return zu8Var.b(arrayList2);
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

    public final ArrayList n(long j, long j2, long j3, boolean z, mg4 mg4Var) throws Throwable {
        vlc vlcVar;
        ArrayList arrayListD;
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
        String string;
        int i;
        String string2;
        int i2;
        String string3;
        int i3;
        int i4;
        byte[] blob;
        int i5;
        Long lValueOf;
        int i6;
        Boolean boolValueOf;
        xlc xlcVar2;
        String string4;
        int i7;
        String string5;
        int i8;
        String string6;
        int i9;
        int i10;
        byte[] blob2;
        int i11;
        Long lValueOf2;
        int i12;
        Boolean boolValueOf2;
        StringBuilder sbK = au1.k(j, "selectFromTo chatId = ", "; timeFrom = ");
        sbK.append(j2);
        au1.q(j3, "; timeTo = ", "; backwards = ", sbK);
        sbK.append(z);
        hm9.n("au8", sbK.toString());
        vlc vlcVar2 = ((k24) this.a).c;
        vlcVar2.getClass();
        int iOrdinal = mg4Var.ordinal();
        if (iOrdinal == 0) {
            vlcVar = vlcVar2;
            arrayListD = vlcVar.d().d(j, j2, z, j3);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            t19 t19VarD = vlcVar2.d();
            ilc ilcVar = t19VarD.a;
            vlcVar = vlcVar2;
            if (z) {
                xlc xlcVarA = xlc.a(5, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?");
                xlcVarA.j(1, j);
                xlcVarA.j(2, j2);
                ey8.m(xlcVarA, 3, j3, t19VarD);
                xlcVarA.j(4, 10);
                xlcVarA.j(5, 40);
                ilcVar.b();
                Cursor cursorO = ilcVar.o(xlcVarA, null);
                try {
                    int iN14 = tfg.n(cursorO, "id");
                    int iN15 = tfg.n(cursorO, "server_id");
                    int iN16 = tfg.n(cursorO, "time");
                    int iN17 = tfg.n(cursorO, "update_time");
                    int iN18 = tfg.n(cursorO, "sender");
                    int iN19 = tfg.n(cursorO, "cid");
                    int iN20 = tfg.n(cursorO, "text");
                    int iN21 = tfg.n(cursorO, "delivery_status");
                    int iN22 = tfg.n(cursorO, "status");
                    int iN23 = tfg.n(cursorO, "time_local");
                    int iN24 = tfg.n(cursorO, "error");
                    int iN25 = tfg.n(cursorO, "localized_error");
                    int iN26 = tfg.n(cursorO, "attaches");
                    xlcVar2 = xlcVarA;
                    try {
                        int iN27 = tfg.n(cursorO, "media_type");
                        int iN28 = tfg.n(cursorO, "detect_share");
                        int iN29 = tfg.n(cursorO, "msg_link_type");
                        int iN30 = tfg.n(cursorO, "msg_link_id");
                        int iN31 = tfg.n(cursorO, "inserted_from_msg_link");
                        int iN32 = tfg.n(cursorO, "msg_link_chat_id");
                        int iN33 = tfg.n(cursorO, "msg_link_chat_name");
                        int iN34 = tfg.n(cursorO, "msg_link_chat_link");
                        int iN35 = tfg.n(cursorO, "msg_link_out_chat_id");
                        int iN36 = tfg.n(cursorO, "msg_link_out_msg_id");
                        int iN37 = tfg.n(cursorO, "type");
                        int iN38 = tfg.n(cursorO, "chat_id");
                        int iN39 = tfg.n(cursorO, "ttl");
                        int iN40 = tfg.n(cursorO, "channel_views");
                        int iN41 = tfg.n(cursorO, "channel_forwards");
                        int iN42 = tfg.n(cursorO, "view_time");
                        int iN43 = tfg.n(cursorO, "zoom");
                        int iN44 = tfg.n(cursorO, "options");
                        int iN45 = tfg.n(cursorO, "live_until");
                        int iN46 = tfg.n(cursorO, "elements");
                        int iN47 = tfg.n(cursorO, "reactions");
                        int iN48 = tfg.n(cursorO, "delayed_attrs_time_to_fire");
                        int iN49 = tfg.n(cursorO, "delayed_attrs_notify_sender");
                        int i13 = iN26;
                        arrayListD = new ArrayList(cursorO.getCount());
                        while (cursorO.moveToNext()) {
                            long j4 = cursorO.getLong(iN14);
                            long j5 = cursorO.getLong(iN15);
                            long j6 = cursorO.getLong(iN16);
                            long j7 = cursorO.getLong(iN17);
                            long j8 = cursorO.getLong(iN18);
                            long j9 = cursorO.getLong(iN19);
                            String string7 = cursorO.isNull(iN20) ? null : cursorO.getString(iN20);
                            int i14 = cursorO.getInt(iN21);
                            t19VarD.a().getClass();
                            iu8.b.getClass();
                            iu8 iu8VarN = oz7.n(i14);
                            int i15 = cursorO.getInt(iN22);
                            t19VarD.a().getClass();
                            vx8 vx8VarB = v89.b(i15);
                            long j10 = cursorO.getLong(iN23);
                            String string8 = cursorO.isNull(iN24) ? null : cursorO.getString(iN24);
                            if (cursorO.isNull(iN25)) {
                                i7 = i13;
                                string4 = null;
                            } else {
                                string4 = cursorO.getString(iN25);
                                i7 = i13;
                            }
                            byte[] blob3 = cursorO.isNull(i7) ? null : cursorO.getBlob(i7);
                            t19VarD.a().getClass();
                            k8g k8gVarB = iz7.b(blob3);
                            int i16 = iN14;
                            int i17 = iN27;
                            int i18 = cursorO.getInt(i17);
                            iN27 = i17;
                            int i19 = iN28;
                            iN28 = i19;
                            boolean z2 = cursorO.getInt(i19) != 0;
                            int i20 = iN29;
                            int i21 = cursorO.getInt(i20);
                            iN29 = i20;
                            int i22 = iN30;
                            long j11 = cursorO.getLong(i22);
                            iN30 = i22;
                            int i23 = iN31;
                            iN31 = i23;
                            boolean z3 = cursorO.getInt(i23) != 0;
                            int i24 = iN32;
                            long j12 = cursorO.getLong(i24);
                            iN32 = i24;
                            int i25 = iN33;
                            if (cursorO.isNull(i25)) {
                                iN33 = i25;
                                i8 = iN34;
                                string5 = null;
                            } else {
                                string5 = cursorO.getString(i25);
                                iN33 = i25;
                                i8 = iN34;
                            }
                            if (cursorO.isNull(i8)) {
                                iN34 = i8;
                                i9 = iN35;
                                string6 = null;
                            } else {
                                string6 = cursorO.getString(i8);
                                iN34 = i8;
                                i9 = iN35;
                            }
                            long j13 = cursorO.getLong(i9);
                            iN35 = i9;
                            int i26 = iN36;
                            long j14 = cursorO.getLong(i26);
                            iN36 = i26;
                            int i27 = iN37;
                            int i28 = cursorO.getInt(i27);
                            t19VarD.a().getClass();
                            int iA = ey8.a(i28);
                            iN37 = i27;
                            int i29 = iN38;
                            long j15 = cursorO.getLong(i29);
                            iN38 = i29;
                            int i30 = iN39;
                            int i31 = cursorO.getInt(i30);
                            iN39 = i30;
                            int i32 = iN40;
                            int i33 = cursorO.getInt(i32);
                            iN40 = i32;
                            int i34 = iN41;
                            int i35 = cursorO.getInt(i34);
                            iN41 = i34;
                            int i36 = iN42;
                            long j16 = cursorO.getLong(i36);
                            iN42 = i36;
                            int i37 = iN43;
                            int i38 = cursorO.getInt(i37);
                            iN43 = i37;
                            int i39 = iN44;
                            int i40 = cursorO.getInt(i39);
                            iN44 = i39;
                            int i41 = iN45;
                            long j17 = cursorO.getLong(i41);
                            iN45 = i41;
                            int i42 = iN46;
                            byte[] blob4 = cursorO.isNull(i42) ? null : cursorO.getBlob(i42);
                            t19VarD.a().getClass();
                            List listA = v89.a(blob4);
                            iN46 = i42;
                            int i43 = iN47;
                            if (cursorO.isNull(i43)) {
                                i10 = i43;
                                i11 = iN15;
                                blob2 = null;
                            } else {
                                i10 = i43;
                                blob2 = cursorO.getBlob(i43);
                                i11 = iN15;
                            }
                            ix8 ix8VarC = t19VarD.a().c(blob2);
                            int i44 = iN48;
                            if (cursorO.isNull(i44)) {
                                i12 = iN49;
                                lValueOf2 = null;
                            } else {
                                lValueOf2 = Long.valueOf(cursorO.getLong(i44));
                                i12 = iN49;
                            }
                            Integer numValueOf = cursorO.isNull(i12) ? null : Integer.valueOf(cursorO.getInt(i12));
                            if (numValueOf == null) {
                                iN48 = i44;
                                boolValueOf2 = null;
                            } else {
                                iN48 = i44;
                                boolValueOf2 = Boolean.valueOf(numValueOf.intValue() != 0);
                            }
                            arrayListD.add(new ru8(j4, j5, j6, j7, j8, j9, string7, iu8VarN, vx8VarB, j10, string8, string4, k8gVarB, i18, z2, i21, j11, z3, j12, string5, string6, j13, j14, iA, j15, i31, i33, i35, j16, i38, i40, j17, listA, ix8VarC, lValueOf2, boolValueOf2));
                            iN49 = i12;
                            iN15 = i11;
                            iN14 = i16;
                            iN47 = i10;
                            i13 = i7;
                        }
                        cursorO.close();
                        xlcVar2.n();
                    } catch (Throwable th) {
                        th = th;
                        cursorO.close();
                        xlcVar2.n();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    xlcVar2 = xlcVarA;
                }
            } else {
                xlc xlcVarA2 = xlc.a(5, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
                xlcVarA2.j(1, j);
                xlcVarA2.j(2, j2);
                ey8.m(xlcVarA2, 3, j3, t19VarD);
                xlcVarA2.j(4, 10);
                xlcVarA2.j(5, 40);
                ilcVar.b();
                Cursor cursorO2 = ilcVar.o(xlcVarA2, null);
                try {
                    iN = tfg.n(cursorO2, "id");
                    iN2 = tfg.n(cursorO2, "server_id");
                    iN3 = tfg.n(cursorO2, "time");
                    iN4 = tfg.n(cursorO2, "update_time");
                    iN5 = tfg.n(cursorO2, "sender");
                    iN6 = tfg.n(cursorO2, "cid");
                    iN7 = tfg.n(cursorO2, "text");
                    iN8 = tfg.n(cursorO2, "delivery_status");
                    iN9 = tfg.n(cursorO2, "status");
                    iN10 = tfg.n(cursorO2, "time_local");
                    iN11 = tfg.n(cursorO2, "error");
                    iN12 = tfg.n(cursorO2, "localized_error");
                    iN13 = tfg.n(cursorO2, "attaches");
                    xlcVar = xlcVarA2;
                } catch (Throwable th3) {
                    th = th3;
                    xlcVar = xlcVarA2;
                }
                try {
                    int iN50 = tfg.n(cursorO2, "media_type");
                    int iN51 = tfg.n(cursorO2, "detect_share");
                    int iN52 = tfg.n(cursorO2, "msg_link_type");
                    int iN53 = tfg.n(cursorO2, "msg_link_id");
                    int iN54 = tfg.n(cursorO2, "inserted_from_msg_link");
                    int iN55 = tfg.n(cursorO2, "msg_link_chat_id");
                    int iN56 = tfg.n(cursorO2, "msg_link_chat_name");
                    int iN57 = tfg.n(cursorO2, "msg_link_chat_link");
                    int iN58 = tfg.n(cursorO2, "msg_link_out_chat_id");
                    int iN59 = tfg.n(cursorO2, "msg_link_out_msg_id");
                    int iN60 = tfg.n(cursorO2, "type");
                    int iN61 = tfg.n(cursorO2, "chat_id");
                    int iN62 = tfg.n(cursorO2, "ttl");
                    int iN63 = tfg.n(cursorO2, "channel_views");
                    int iN64 = tfg.n(cursorO2, "channel_forwards");
                    int iN65 = tfg.n(cursorO2, "view_time");
                    int iN66 = tfg.n(cursorO2, "zoom");
                    int iN67 = tfg.n(cursorO2, "options");
                    int iN68 = tfg.n(cursorO2, "live_until");
                    int iN69 = tfg.n(cursorO2, "elements");
                    int iN70 = tfg.n(cursorO2, "reactions");
                    int iN71 = tfg.n(cursorO2, "delayed_attrs_time_to_fire");
                    int iN72 = tfg.n(cursorO2, "delayed_attrs_notify_sender");
                    int i45 = iN13;
                    arrayListD = new ArrayList(cursorO2.getCount());
                    while (cursorO2.moveToNext()) {
                        long j18 = cursorO2.getLong(iN);
                        long j19 = cursorO2.getLong(iN2);
                        long j20 = cursorO2.getLong(iN3);
                        long j21 = cursorO2.getLong(iN4);
                        long j22 = cursorO2.getLong(iN5);
                        long j23 = cursorO2.getLong(iN6);
                        String string9 = cursorO2.isNull(iN7) ? null : cursorO2.getString(iN7);
                        int i46 = cursorO2.getInt(iN8);
                        t19VarD.a().getClass();
                        iu8.b.getClass();
                        iu8 iu8VarN2 = oz7.n(i46);
                        int i47 = cursorO2.getInt(iN9);
                        t19VarD.a().getClass();
                        vx8 vx8VarB2 = v89.b(i47);
                        long j24 = cursorO2.getLong(iN10);
                        String string10 = cursorO2.isNull(iN11) ? null : cursorO2.getString(iN11);
                        if (cursorO2.isNull(iN12)) {
                            i = i45;
                            string = null;
                        } else {
                            string = cursorO2.getString(iN12);
                            i = i45;
                        }
                        byte[] blob5 = cursorO2.isNull(i) ? null : cursorO2.getBlob(i);
                        t19VarD.a().getClass();
                        k8g k8gVarB2 = iz7.b(blob5);
                        int i48 = iN12;
                        int i49 = iN50;
                        int i50 = cursorO2.getInt(i49);
                        iN50 = i49;
                        int i51 = iN51;
                        iN51 = i51;
                        boolean z4 = cursorO2.getInt(i51) != 0;
                        int i52 = iN52;
                        int i53 = cursorO2.getInt(i52);
                        iN52 = i52;
                        int i54 = iN53;
                        long j25 = cursorO2.getLong(i54);
                        iN53 = i54;
                        int i55 = iN54;
                        iN54 = i55;
                        boolean z5 = cursorO2.getInt(i55) != 0;
                        int i56 = iN55;
                        long j26 = cursorO2.getLong(i56);
                        iN55 = i56;
                        int i57 = iN56;
                        if (cursorO2.isNull(i57)) {
                            iN56 = i57;
                            i2 = iN57;
                            string2 = null;
                        } else {
                            string2 = cursorO2.getString(i57);
                            iN56 = i57;
                            i2 = iN57;
                        }
                        if (cursorO2.isNull(i2)) {
                            iN57 = i2;
                            i3 = iN58;
                            string3 = null;
                        } else {
                            string3 = cursorO2.getString(i2);
                            iN57 = i2;
                            i3 = iN58;
                        }
                        long j27 = cursorO2.getLong(i3);
                        iN58 = i3;
                        int i58 = iN59;
                        long j28 = cursorO2.getLong(i58);
                        iN59 = i58;
                        int i59 = iN60;
                        int i60 = cursorO2.getInt(i59);
                        t19VarD.a().getClass();
                        int iA2 = ey8.a(i60);
                        iN60 = i59;
                        int i61 = iN61;
                        long j29 = cursorO2.getLong(i61);
                        iN61 = i61;
                        int i62 = iN62;
                        int i63 = cursorO2.getInt(i62);
                        iN62 = i62;
                        int i64 = iN63;
                        int i65 = cursorO2.getInt(i64);
                        iN63 = i64;
                        int i66 = iN64;
                        int i67 = cursorO2.getInt(i66);
                        iN64 = i66;
                        int i68 = iN65;
                        long j30 = cursorO2.getLong(i68);
                        iN65 = i68;
                        int i69 = iN66;
                        int i70 = cursorO2.getInt(i69);
                        iN66 = i69;
                        int i71 = iN67;
                        int i72 = cursorO2.getInt(i71);
                        iN67 = i71;
                        int i73 = iN68;
                        long j31 = cursorO2.getLong(i73);
                        iN68 = i73;
                        int i74 = iN69;
                        byte[] blob6 = cursorO2.isNull(i74) ? null : cursorO2.getBlob(i74);
                        t19VarD.a().getClass();
                        List listA2 = v89.a(blob6);
                        iN69 = i74;
                        int i75 = iN70;
                        if (cursorO2.isNull(i75)) {
                            i4 = i75;
                            i5 = i;
                            blob = null;
                        } else {
                            i4 = i75;
                            blob = cursorO2.getBlob(i75);
                            i5 = i;
                        }
                        ix8 ix8VarC2 = t19VarD.a().c(blob);
                        int i76 = iN71;
                        if (cursorO2.isNull(i76)) {
                            i6 = iN72;
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(cursorO2.getLong(i76));
                            i6 = iN72;
                        }
                        Integer numValueOf2 = cursorO2.isNull(i6) ? null : Integer.valueOf(cursorO2.getInt(i6));
                        if (numValueOf2 == null) {
                            iN71 = i76;
                            boolValueOf = null;
                        } else {
                            iN71 = i76;
                            boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                        }
                        arrayListD.add(new ru8(j18, j19, j20, j21, j22, j23, string9, iu8VarN2, vx8VarB2, j24, string10, string, k8gVarB2, i50, z4, i53, j25, z5, j26, string2, string3, j27, j28, iA2, j29, i63, i65, i67, j30, i70, i72, j31, listA2, ix8VarC2, lValueOf, boolValueOf));
                        iN72 = i6;
                        iN12 = i48;
                        i45 = i5;
                        iN70 = i4;
                    }
                    cursorO2.close();
                    xlcVar.n();
                } catch (Throwable th4) {
                    th = th4;
                    cursorO2.close();
                    xlcVar.n();
                    throw th;
                }
            }
        }
        ArrayList arrayList = new ArrayList(z53.S(arrayListD, 10));
        Iterator it = arrayListD.iterator();
        while (it.hasNext()) {
            arrayList.add(vlcVar.b((ru8) it.next()));
        }
        if (z) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public final cu8 o(long j) throws Throwable {
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
        String string;
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        String string2;
        int i4;
        String string3;
        int i5;
        int i6;
        byte[] blob;
        int i7;
        Long lValueOf;
        int i8;
        Boolean boolValueOf;
        vlc vlcVar = ((k24) this.a).c;
        t19 t19VarD = vlcVar.d();
        t19VarD.getClass();
        xlc xlcVarA = xlc.a(3, "SELECT * FROM messages WHERE chat_id = ? AND server_id > 0 AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC LIMIT ?");
        ey8.m(xlcVarA, 1, j, t19VarD);
        xlcVarA.j(2, 10);
        xlcVarA.j(3, 1);
        ilc ilcVar = t19VarD.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            iN = tfg.n(cursorO, "id");
            iN2 = tfg.n(cursorO, "server_id");
            iN3 = tfg.n(cursorO, "time");
            iN4 = tfg.n(cursorO, "update_time");
            iN5 = tfg.n(cursorO, "sender");
            iN6 = tfg.n(cursorO, "cid");
            iN7 = tfg.n(cursorO, "text");
            iN8 = tfg.n(cursorO, "delivery_status");
            iN9 = tfg.n(cursorO, "status");
            iN10 = tfg.n(cursorO, "time_local");
            iN11 = tfg.n(cursorO, "error");
            iN12 = tfg.n(cursorO, "localized_error");
            iN13 = tfg.n(cursorO, "attaches");
            xlcVar = xlcVarA;
        } catch (Throwable th) {
            th = th;
            xlcVar = xlcVarA;
        }
        try {
            int iN14 = tfg.n(cursorO, "media_type");
            int iN15 = tfg.n(cursorO, "detect_share");
            int iN16 = tfg.n(cursorO, "msg_link_type");
            int iN17 = tfg.n(cursorO, "msg_link_id");
            int iN18 = tfg.n(cursorO, "inserted_from_msg_link");
            int iN19 = tfg.n(cursorO, "msg_link_chat_id");
            int iN20 = tfg.n(cursorO, "msg_link_chat_name");
            int iN21 = tfg.n(cursorO, "msg_link_chat_link");
            int iN22 = tfg.n(cursorO, "msg_link_out_chat_id");
            int iN23 = tfg.n(cursorO, "msg_link_out_msg_id");
            int iN24 = tfg.n(cursorO, "type");
            int iN25 = tfg.n(cursorO, "chat_id");
            int iN26 = tfg.n(cursorO, "ttl");
            int iN27 = tfg.n(cursorO, "channel_views");
            int iN28 = tfg.n(cursorO, "channel_forwards");
            int iN29 = tfg.n(cursorO, "view_time");
            int iN30 = tfg.n(cursorO, "zoom");
            int iN31 = tfg.n(cursorO, "options");
            int iN32 = tfg.n(cursorO, "live_until");
            int iN33 = tfg.n(cursorO, "elements");
            int iN34 = tfg.n(cursorO, "reactions");
            int iN35 = tfg.n(cursorO, "delayed_attrs_time_to_fire");
            int iN36 = tfg.n(cursorO, "delayed_attrs_notify_sender");
            int i9 = iN13;
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                long j2 = cursorO.getLong(iN);
                long j3 = cursorO.getLong(iN2);
                long j4 = cursorO.getLong(iN3);
                long j5 = cursorO.getLong(iN4);
                long j6 = cursorO.getLong(iN5);
                long j7 = cursorO.getLong(iN6);
                String string4 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                int i10 = cursorO.getInt(iN8);
                t19VarD.a().getClass();
                iu8.b.getClass();
                iu8 iu8VarN = oz7.n(i10);
                int i11 = cursorO.getInt(iN9);
                t19VarD.a().getClass();
                vx8 vx8VarB = v89.b(i11);
                long j8 = cursorO.getLong(iN10);
                String string5 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                if (cursorO.isNull(iN12)) {
                    i = i9;
                    string = null;
                } else {
                    string = cursorO.getString(iN12);
                    i = i9;
                }
                byte[] blob2 = cursorO.isNull(i) ? null : cursorO.getBlob(i);
                t19VarD.a().getClass();
                k8g k8gVarB = iz7.b(blob2);
                i9 = i;
                int i12 = iN14;
                int i13 = cursorO.getInt(i12);
                iN14 = i12;
                int i14 = iN15;
                if (cursorO.getInt(i14) != 0) {
                    iN15 = i14;
                    i2 = iN16;
                    z = true;
                } else {
                    iN15 = i14;
                    i2 = iN16;
                    z = false;
                }
                int i15 = cursorO.getInt(i2);
                iN16 = i2;
                int i16 = iN17;
                long j9 = cursorO.getLong(i16);
                iN17 = i16;
                int i17 = iN18;
                if (cursorO.getInt(i17) != 0) {
                    iN18 = i17;
                    i3 = iN19;
                    z2 = true;
                } else {
                    iN18 = i17;
                    i3 = iN19;
                    z2 = false;
                }
                long j10 = cursorO.getLong(i3);
                iN19 = i3;
                int i18 = iN20;
                if (cursorO.isNull(i18)) {
                    iN20 = i18;
                    i4 = iN21;
                    string2 = null;
                } else {
                    string2 = cursorO.getString(i18);
                    iN20 = i18;
                    i4 = iN21;
                }
                if (cursorO.isNull(i4)) {
                    iN21 = i4;
                    i5 = iN22;
                    string3 = null;
                } else {
                    string3 = cursorO.getString(i4);
                    iN21 = i4;
                    i5 = iN22;
                }
                long j11 = cursorO.getLong(i5);
                iN22 = i5;
                int i19 = iN23;
                long j12 = cursorO.getLong(i19);
                iN23 = i19;
                int i20 = iN24;
                int i21 = cursorO.getInt(i20);
                t19VarD.a().getClass();
                int iA = ey8.a(i21);
                iN24 = i20;
                int i22 = iN25;
                long j13 = cursorO.getLong(i22);
                iN25 = i22;
                int i23 = iN26;
                int i24 = cursorO.getInt(i23);
                iN26 = i23;
                int i25 = iN27;
                int i26 = cursorO.getInt(i25);
                iN27 = i25;
                int i27 = iN28;
                int i28 = cursorO.getInt(i27);
                iN28 = i27;
                int i29 = iN29;
                long j14 = cursorO.getLong(i29);
                iN29 = i29;
                int i30 = iN30;
                int i31 = cursorO.getInt(i30);
                iN30 = i30;
                int i32 = iN31;
                int i33 = cursorO.getInt(i32);
                iN31 = i32;
                int i34 = iN32;
                long j15 = cursorO.getLong(i34);
                iN32 = i34;
                int i35 = iN33;
                byte[] blob3 = cursorO.isNull(i35) ? null : cursorO.getBlob(i35);
                t19VarD.a().getClass();
                List listA = v89.a(blob3);
                iN33 = i35;
                int i36 = iN34;
                if (cursorO.isNull(i36)) {
                    i6 = i36;
                    i7 = iN11;
                    blob = null;
                } else {
                    i6 = i36;
                    blob = cursorO.getBlob(i36);
                    i7 = iN11;
                }
                ix8 ix8VarC = t19VarD.a().c(blob);
                int i37 = iN35;
                if (cursorO.isNull(i37)) {
                    i8 = iN36;
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(cursorO.getLong(i37));
                    i8 = iN36;
                }
                Integer numValueOf = cursorO.isNull(i8) ? null : Integer.valueOf(cursorO.getInt(i8));
                if (numValueOf == null) {
                    iN35 = i37;
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    iN35 = i37;
                }
                arrayList.add(new ru8(j2, j3, j4, j5, j6, j7, string4, iu8VarN, vx8VarB, j8, string5, string, k8gVarB, i13, z, i15, j9, z2, j10, string2, string3, j11, j12, iA, j13, i24, i26, i28, j14, i31, i33, j15, listA, ix8VarC, lValueOf, boolValueOf));
                iN36 = i8;
                iN11 = i7;
                iN34 = i6;
            }
            cursorO.close();
            xlcVar.n();
            ru8 ru8Var = (ru8) x53.i0(arrayList);
            if (ru8Var != null) {
                return vlcVar.b(ru8Var);
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursorO.close();
            xlcVar.n();
            throw th;
        }
    }

    public final cu8 p(long j, mg4 mg4Var) throws Throwable {
        xlc xlcVar;
        vlc vlcVar;
        ArrayList arrayListJ;
        String string;
        int i;
        int i2;
        boolean z;
        String string2;
        int i3;
        String string3;
        int i4;
        int i5;
        byte[] blob;
        int i6;
        Long lValueOf;
        int i7;
        Boolean boolValueOf;
        vlc vlcVar2 = ((k24) this.a).c;
        vlcVar2.getClass();
        int iOrdinal = mg4Var.ordinal();
        if (iOrdinal == 0) {
            t19 t19VarD = vlcVar2.d();
            t19VarD.getClass();
            xlc xlcVarA = xlc.a(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC LIMIT ?");
            ey8.m(xlcVarA, 1, j, t19VarD);
            xlcVarA.j(2, 10);
            xlcVarA.j(3, 1L);
            ilc ilcVar = t19VarD.a;
            ilcVar.b();
            Cursor cursorO = ilcVar.o(xlcVarA, null);
            try {
                int iN = tfg.n(cursorO, "id");
                int iN2 = tfg.n(cursorO, "server_id");
                int iN3 = tfg.n(cursorO, "time");
                int iN4 = tfg.n(cursorO, "update_time");
                int iN5 = tfg.n(cursorO, "sender");
                int iN6 = tfg.n(cursorO, "cid");
                int iN7 = tfg.n(cursorO, "text");
                int iN8 = tfg.n(cursorO, "delivery_status");
                int iN9 = tfg.n(cursorO, "status");
                int iN10 = tfg.n(cursorO, "time_local");
                int iN11 = tfg.n(cursorO, "error");
                int iN12 = tfg.n(cursorO, "localized_error");
                vlcVar = vlcVar2;
                int iN13 = tfg.n(cursorO, "attaches");
                xlcVar = xlcVarA;
                try {
                    int iN14 = tfg.n(cursorO, "media_type");
                    int iN15 = tfg.n(cursorO, "detect_share");
                    int iN16 = tfg.n(cursorO, "msg_link_type");
                    int iN17 = tfg.n(cursorO, "msg_link_id");
                    int iN18 = tfg.n(cursorO, "inserted_from_msg_link");
                    int iN19 = tfg.n(cursorO, "msg_link_chat_id");
                    int iN20 = tfg.n(cursorO, "msg_link_chat_name");
                    int iN21 = tfg.n(cursorO, "msg_link_chat_link");
                    int iN22 = tfg.n(cursorO, "msg_link_out_chat_id");
                    int iN23 = tfg.n(cursorO, "msg_link_out_msg_id");
                    int iN24 = tfg.n(cursorO, "type");
                    int iN25 = tfg.n(cursorO, "chat_id");
                    int iN26 = tfg.n(cursorO, "ttl");
                    int iN27 = tfg.n(cursorO, "channel_views");
                    int iN28 = tfg.n(cursorO, "channel_forwards");
                    int iN29 = tfg.n(cursorO, "view_time");
                    int iN30 = tfg.n(cursorO, "zoom");
                    int iN31 = tfg.n(cursorO, "options");
                    int iN32 = tfg.n(cursorO, "live_until");
                    int iN33 = tfg.n(cursorO, "elements");
                    int iN34 = tfg.n(cursorO, "reactions");
                    int iN35 = tfg.n(cursorO, "delayed_attrs_time_to_fire");
                    int iN36 = tfg.n(cursorO, "delayed_attrs_notify_sender");
                    int i8 = iN13;
                    ArrayList arrayList = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        long j2 = cursorO.getLong(iN);
                        long j3 = cursorO.getLong(iN2);
                        long j4 = cursorO.getLong(iN3);
                        long j5 = cursorO.getLong(iN4);
                        long j6 = cursorO.getLong(iN5);
                        long j7 = cursorO.getLong(iN6);
                        String string4 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                        int i9 = cursorO.getInt(iN8);
                        t19VarD.a().getClass();
                        iu8.b.getClass();
                        iu8 iu8VarN = oz7.n(i9);
                        int i10 = cursorO.getInt(iN9);
                        t19VarD.a().getClass();
                        vx8 vx8VarB = v89.b(i10);
                        long j8 = cursorO.getLong(iN10);
                        String string5 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                        if (cursorO.isNull(iN12)) {
                            i = i8;
                            string = null;
                        } else {
                            string = cursorO.getString(iN12);
                            i = i8;
                        }
                        byte[] blob2 = cursorO.isNull(i) ? null : cursorO.getBlob(i);
                        t19VarD.a().getClass();
                        k8g k8gVarB = iz7.b(blob2);
                        int i11 = iN;
                        int i12 = iN14;
                        int i13 = cursorO.getInt(i12);
                        iN14 = i12;
                        int i14 = iN15;
                        int i15 = cursorO.getInt(i14);
                        iN15 = i14;
                        int i16 = iN16;
                        boolean z2 = i15 != 0;
                        int i17 = cursorO.getInt(i16);
                        int i18 = iN17;
                        long j9 = cursorO.getLong(i18);
                        iN17 = i18;
                        int i19 = iN18;
                        if (cursorO.getInt(i19) != 0) {
                            iN18 = i19;
                            i2 = iN19;
                            z = true;
                        } else {
                            iN18 = i19;
                            i2 = iN19;
                            z = false;
                        }
                        long j10 = cursorO.getLong(i2);
                        iN19 = i2;
                        int i20 = iN20;
                        if (cursorO.isNull(i20)) {
                            iN20 = i20;
                            i3 = iN21;
                            string2 = null;
                        } else {
                            string2 = cursorO.getString(i20);
                            iN20 = i20;
                            i3 = iN21;
                        }
                        if (cursorO.isNull(i3)) {
                            iN21 = i3;
                            i4 = iN22;
                            string3 = null;
                        } else {
                            string3 = cursorO.getString(i3);
                            iN21 = i3;
                            i4 = iN22;
                        }
                        long j11 = cursorO.getLong(i4);
                        iN22 = i4;
                        int i21 = iN23;
                        long j12 = cursorO.getLong(i21);
                        iN23 = i21;
                        int i22 = iN24;
                        int i23 = cursorO.getInt(i22);
                        t19VarD.a().getClass();
                        int iA = ey8.a(i23);
                        iN24 = i22;
                        int i24 = iN25;
                        long j13 = cursorO.getLong(i24);
                        iN25 = i24;
                        int i25 = iN26;
                        int i26 = cursorO.getInt(i25);
                        iN26 = i25;
                        int i27 = iN27;
                        int i28 = cursorO.getInt(i27);
                        iN27 = i27;
                        int i29 = iN28;
                        int i30 = cursorO.getInt(i29);
                        iN28 = i29;
                        int i31 = iN29;
                        long j14 = cursorO.getLong(i31);
                        iN29 = i31;
                        int i32 = iN30;
                        int i33 = cursorO.getInt(i32);
                        iN30 = i32;
                        int i34 = iN31;
                        int i35 = cursorO.getInt(i34);
                        iN31 = i34;
                        int i36 = iN32;
                        long j15 = cursorO.getLong(i36);
                        iN32 = i36;
                        int i37 = iN33;
                        byte[] blob3 = cursorO.isNull(i37) ? null : cursorO.getBlob(i37);
                        t19VarD.a().getClass();
                        List listA = v89.a(blob3);
                        iN33 = i37;
                        int i38 = iN34;
                        if (cursorO.isNull(i38)) {
                            i5 = i38;
                            i6 = iN10;
                            blob = null;
                        } else {
                            i5 = i38;
                            blob = cursorO.getBlob(i38);
                            i6 = iN10;
                        }
                        ix8 ix8VarC = t19VarD.a().c(blob);
                        int i39 = iN35;
                        if (cursorO.isNull(i39)) {
                            i7 = iN36;
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(cursorO.getLong(i39));
                            i7 = iN36;
                        }
                        Integer numValueOf = cursorO.isNull(i7) ? null : Integer.valueOf(cursorO.getInt(i7));
                        if (numValueOf == null) {
                            iN35 = i39;
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                            iN35 = i39;
                        }
                        arrayList.add(new ru8(j2, j3, j4, j5, j6, j7, string4, iu8VarN, vx8VarB, j8, string5, string, k8gVarB, i13, z2, i17, j9, z, j10, string2, string3, j11, j12, iA, j13, i26, i28, i30, j14, i33, i35, j15, listA, ix8VarC, lValueOf, boolValueOf));
                        iN36 = i7;
                        iN10 = i6;
                        iN = i11;
                        iN16 = i16;
                        iN34 = i5;
                        i8 = i;
                    }
                    cursorO.close();
                    xlcVar.n();
                    arrayListJ = arrayList;
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
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            arrayListJ = t19.j(vlcVar2.d(), j);
            vlcVar = vlcVar2;
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayListJ, 10));
        Iterator it = arrayListJ.iterator();
        while (it.hasNext()) {
            arrayList2.add(vlcVar.b((ru8) it.next()));
        }
        return (cu8) x53.i0(arrayList2);
    }

    public final cu8 q(long j) {
        vlc vlcVar = ((k24) this.a).c;
        ru8 ru8VarC = vlcVar.d().c(j);
        if (ru8VarC != null) {
            return vlcVar.b(ru8VarC);
        }
        return null;
    }

    public final cu8 r(long j, long j2) {
        vlc vlcVar;
        xlc xlcVar;
        ArrayList arrayList;
        String string;
        int i;
        int i2;
        boolean z;
        String string2;
        int i3;
        String string3;
        int i4;
        int i5;
        byte[] blob;
        int i6;
        Long lValueOf;
        int i7;
        Boolean boolValueOf;
        xlc xlcVar2;
        String string4;
        int i8;
        int i9;
        boolean z2;
        String string5;
        int i10;
        String string6;
        int i11;
        int i12;
        byte[] blob2;
        int i13;
        Long lValueOf2;
        int i14;
        Boolean boolValueOf2;
        mg4 mg4Var = mg4.REGULAR;
        vlc vlcVar2 = ((k24) this.a).c;
        vlcVar2.getClass();
        int iOrdinal = mg4Var.ordinal();
        if (iOrdinal == 0) {
            vlcVar = vlcVar2;
            t19 t19VarD = vlcVar.d();
            t19VarD.getClass();
            xlc xlcVarA = xlc.a(4, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC LIMIT ?");
            xlcVarA.j(1, j);
            ey8.m(xlcVarA, 2, j2, t19VarD);
            xlcVarA.j(3, 10);
            xlcVarA.j(4, 1);
            ilc ilcVar = t19VarD.a;
            ilcVar.b();
            Cursor cursorO = ilcVar.o(xlcVarA, null);
            try {
                int iN = tfg.n(cursorO, "id");
                int iN2 = tfg.n(cursorO, "server_id");
                int iN3 = tfg.n(cursorO, "time");
                int iN4 = tfg.n(cursorO, "update_time");
                int iN5 = tfg.n(cursorO, "sender");
                int iN6 = tfg.n(cursorO, "cid");
                int iN7 = tfg.n(cursorO, "text");
                int iN8 = tfg.n(cursorO, "delivery_status");
                int iN9 = tfg.n(cursorO, "status");
                int iN10 = tfg.n(cursorO, "time_local");
                int iN11 = tfg.n(cursorO, "error");
                int iN12 = tfg.n(cursorO, "localized_error");
                int iN13 = tfg.n(cursorO, "attaches");
                xlcVar = xlcVarA;
                try {
                    int iN14 = tfg.n(cursorO, "media_type");
                    int iN15 = tfg.n(cursorO, "detect_share");
                    int iN16 = tfg.n(cursorO, "msg_link_type");
                    int iN17 = tfg.n(cursorO, "msg_link_id");
                    int iN18 = tfg.n(cursorO, "inserted_from_msg_link");
                    int iN19 = tfg.n(cursorO, "msg_link_chat_id");
                    int iN20 = tfg.n(cursorO, "msg_link_chat_name");
                    int iN21 = tfg.n(cursorO, "msg_link_chat_link");
                    int iN22 = tfg.n(cursorO, "msg_link_out_chat_id");
                    int iN23 = tfg.n(cursorO, "msg_link_out_msg_id");
                    int iN24 = tfg.n(cursorO, "type");
                    int iN25 = tfg.n(cursorO, "chat_id");
                    int iN26 = tfg.n(cursorO, "ttl");
                    int iN27 = tfg.n(cursorO, "channel_views");
                    int iN28 = tfg.n(cursorO, "channel_forwards");
                    int iN29 = tfg.n(cursorO, "view_time");
                    int iN30 = tfg.n(cursorO, "zoom");
                    int iN31 = tfg.n(cursorO, "options");
                    int iN32 = tfg.n(cursorO, "live_until");
                    int iN33 = tfg.n(cursorO, "elements");
                    int iN34 = tfg.n(cursorO, "reactions");
                    int iN35 = tfg.n(cursorO, "delayed_attrs_time_to_fire");
                    int iN36 = tfg.n(cursorO, "delayed_attrs_notify_sender");
                    int i15 = iN13;
                    arrayList = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        long j3 = cursorO.getLong(iN);
                        long j4 = cursorO.getLong(iN2);
                        long j5 = cursorO.getLong(iN3);
                        long j6 = cursorO.getLong(iN4);
                        long j7 = cursorO.getLong(iN5);
                        long j8 = cursorO.getLong(iN6);
                        String string7 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                        int i16 = cursorO.getInt(iN8);
                        t19VarD.a().getClass();
                        iu8.b.getClass();
                        iu8 iu8VarN = oz7.n(i16);
                        int i17 = cursorO.getInt(iN9);
                        t19VarD.a().getClass();
                        vx8 vx8VarB = v89.b(i17);
                        long j9 = cursorO.getLong(iN10);
                        String string8 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                        if (cursorO.isNull(iN12)) {
                            i = i15;
                            string = null;
                        } else {
                            string = cursorO.getString(iN12);
                            i = i15;
                        }
                        byte[] blob3 = cursorO.isNull(i) ? null : cursorO.getBlob(i);
                        t19VarD.a().getClass();
                        k8g k8gVarB = iz7.b(blob3);
                        int i18 = iN;
                        int i19 = iN14;
                        int i20 = cursorO.getInt(i19);
                        iN14 = i19;
                        int i21 = iN15;
                        iN15 = i21;
                        boolean z3 = cursorO.getInt(i21) != 0;
                        int i22 = iN16;
                        int i23 = cursorO.getInt(i22);
                        iN16 = i22;
                        int i24 = iN17;
                        long j10 = cursorO.getLong(i24);
                        iN17 = i24;
                        int i25 = iN18;
                        if (cursorO.getInt(i25) != 0) {
                            iN18 = i25;
                            i2 = iN19;
                            z = true;
                        } else {
                            iN18 = i25;
                            i2 = iN19;
                            z = false;
                        }
                        long j11 = cursorO.getLong(i2);
                        iN19 = i2;
                        int i26 = iN20;
                        if (cursorO.isNull(i26)) {
                            iN20 = i26;
                            i3 = iN21;
                            string2 = null;
                        } else {
                            string2 = cursorO.getString(i26);
                            iN20 = i26;
                            i3 = iN21;
                        }
                        if (cursorO.isNull(i3)) {
                            iN21 = i3;
                            i4 = iN22;
                            string3 = null;
                        } else {
                            string3 = cursorO.getString(i3);
                            iN21 = i3;
                            i4 = iN22;
                        }
                        long j12 = cursorO.getLong(i4);
                        iN22 = i4;
                        int i27 = iN23;
                        long j13 = cursorO.getLong(i27);
                        iN23 = i27;
                        int i28 = iN24;
                        int i29 = cursorO.getInt(i28);
                        t19VarD.a().getClass();
                        int iA = ey8.a(i29);
                        iN24 = i28;
                        int i30 = iN25;
                        long j14 = cursorO.getLong(i30);
                        iN25 = i30;
                        int i31 = iN26;
                        int i32 = cursorO.getInt(i31);
                        iN26 = i31;
                        int i33 = iN27;
                        int i34 = cursorO.getInt(i33);
                        iN27 = i33;
                        int i35 = iN28;
                        int i36 = cursorO.getInt(i35);
                        iN28 = i35;
                        int i37 = iN29;
                        long j15 = cursorO.getLong(i37);
                        iN29 = i37;
                        int i38 = iN30;
                        int i39 = cursorO.getInt(i38);
                        iN30 = i38;
                        int i40 = iN31;
                        int i41 = cursorO.getInt(i40);
                        iN31 = i40;
                        int i42 = iN32;
                        long j16 = cursorO.getLong(i42);
                        iN32 = i42;
                        int i43 = iN33;
                        byte[] blob4 = cursorO.isNull(i43) ? null : cursorO.getBlob(i43);
                        t19VarD.a().getClass();
                        List listA = v89.a(blob4);
                        iN33 = i43;
                        int i44 = iN34;
                        if (cursorO.isNull(i44)) {
                            i5 = i44;
                            i6 = iN12;
                            blob = null;
                        } else {
                            i5 = i44;
                            blob = cursorO.getBlob(i44);
                            i6 = iN12;
                        }
                        ix8 ix8VarC = t19VarD.a().c(blob);
                        int i45 = iN35;
                        if (cursorO.isNull(i45)) {
                            i7 = iN36;
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(cursorO.getLong(i45));
                            i7 = iN36;
                        }
                        Integer numValueOf = cursorO.isNull(i7) ? null : Integer.valueOf(cursorO.getInt(i7));
                        if (numValueOf == null) {
                            iN35 = i45;
                            boolValueOf = null;
                        } else {
                            iN35 = i45;
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        arrayList.add(new ru8(j3, j4, j5, j6, j7, j8, string7, iu8VarN, vx8VarB, j9, string8, string, k8gVarB, i20, z3, i23, j10, z, j11, string2, string3, j12, j13, iA, j14, i32, i34, i36, j15, i39, i41, j16, listA, ix8VarC, lValueOf, boolValueOf));
                        iN36 = i7;
                        iN12 = i6;
                        iN = i18;
                        iN34 = i5;
                        i15 = i;
                    }
                    cursorO.close();
                    xlcVar.n();
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
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            t19 t19VarD2 = vlcVar2.d();
            t19VarD2.getClass();
            vlcVar = vlcVar2;
            xlc xlcVarA2 = xlc.a(4, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY time ASC LIMIT ?");
            xlcVarA2.j(1, j);
            ey8.m(xlcVarA2, 2, j2, t19VarD2);
            xlcVarA2.j(3, 10);
            xlcVarA2.j(4, 1);
            ilc ilcVar2 = t19VarD2.a;
            ilcVar2.b();
            Cursor cursorO2 = ilcVar2.o(xlcVarA2, null);
            try {
                int iN37 = tfg.n(cursorO2, "id");
                int iN38 = tfg.n(cursorO2, "server_id");
                int iN39 = tfg.n(cursorO2, "time");
                int iN40 = tfg.n(cursorO2, "update_time");
                int iN41 = tfg.n(cursorO2, "sender");
                int iN42 = tfg.n(cursorO2, "cid");
                int iN43 = tfg.n(cursorO2, "text");
                int iN44 = tfg.n(cursorO2, "delivery_status");
                int iN45 = tfg.n(cursorO2, "status");
                int iN46 = tfg.n(cursorO2, "time_local");
                int iN47 = tfg.n(cursorO2, "error");
                int iN48 = tfg.n(cursorO2, "localized_error");
                int iN49 = tfg.n(cursorO2, "attaches");
                xlcVar2 = xlcVarA2;
                try {
                    int iN50 = tfg.n(cursorO2, "media_type");
                    int iN51 = tfg.n(cursorO2, "detect_share");
                    int iN52 = tfg.n(cursorO2, "msg_link_type");
                    int iN53 = tfg.n(cursorO2, "msg_link_id");
                    int iN54 = tfg.n(cursorO2, "inserted_from_msg_link");
                    int iN55 = tfg.n(cursorO2, "msg_link_chat_id");
                    int iN56 = tfg.n(cursorO2, "msg_link_chat_name");
                    int iN57 = tfg.n(cursorO2, "msg_link_chat_link");
                    int iN58 = tfg.n(cursorO2, "msg_link_out_chat_id");
                    int iN59 = tfg.n(cursorO2, "msg_link_out_msg_id");
                    int iN60 = tfg.n(cursorO2, "type");
                    int iN61 = tfg.n(cursorO2, "chat_id");
                    int iN62 = tfg.n(cursorO2, "ttl");
                    int iN63 = tfg.n(cursorO2, "channel_views");
                    int iN64 = tfg.n(cursorO2, "channel_forwards");
                    int iN65 = tfg.n(cursorO2, "view_time");
                    int iN66 = tfg.n(cursorO2, "zoom");
                    int iN67 = tfg.n(cursorO2, "options");
                    int iN68 = tfg.n(cursorO2, "live_until");
                    int iN69 = tfg.n(cursorO2, "elements");
                    int iN70 = tfg.n(cursorO2, "reactions");
                    int iN71 = tfg.n(cursorO2, "delayed_attrs_time_to_fire");
                    int iN72 = tfg.n(cursorO2, "delayed_attrs_notify_sender");
                    int i46 = iN49;
                    arrayList = new ArrayList(cursorO2.getCount());
                    while (cursorO2.moveToNext()) {
                        long j17 = cursorO2.getLong(iN37);
                        long j18 = cursorO2.getLong(iN38);
                        long j19 = cursorO2.getLong(iN39);
                        long j20 = cursorO2.getLong(iN40);
                        long j21 = cursorO2.getLong(iN41);
                        long j22 = cursorO2.getLong(iN42);
                        String string9 = cursorO2.isNull(iN43) ? null : cursorO2.getString(iN43);
                        int i47 = cursorO2.getInt(iN44);
                        t19VarD2.a().getClass();
                        iu8.b.getClass();
                        iu8 iu8VarN2 = oz7.n(i47);
                        int i48 = cursorO2.getInt(iN45);
                        t19VarD2.a().getClass();
                        vx8 vx8VarB2 = v89.b(i48);
                        long j23 = cursorO2.getLong(iN46);
                        String string10 = cursorO2.isNull(iN47) ? null : cursorO2.getString(iN47);
                        if (cursorO2.isNull(iN48)) {
                            i8 = i46;
                            string4 = null;
                        } else {
                            string4 = cursorO2.getString(iN48);
                            i8 = i46;
                        }
                        byte[] blob5 = cursorO2.isNull(i8) ? null : cursorO2.getBlob(i8);
                        t19VarD2.a().getClass();
                        k8g k8gVarB2 = iz7.b(blob5);
                        int i49 = iN37;
                        int i50 = iN50;
                        int i51 = cursorO2.getInt(i50);
                        iN50 = i50;
                        int i52 = iN51;
                        iN51 = i52;
                        boolean z4 = cursorO2.getInt(i52) != 0;
                        int i53 = iN52;
                        int i54 = cursorO2.getInt(i53);
                        iN52 = i53;
                        int i55 = iN53;
                        long j24 = cursorO2.getLong(i55);
                        iN53 = i55;
                        int i56 = iN54;
                        if (cursorO2.getInt(i56) != 0) {
                            iN54 = i56;
                            i9 = iN55;
                            z2 = true;
                        } else {
                            iN54 = i56;
                            i9 = iN55;
                            z2 = false;
                        }
                        long j25 = cursorO2.getLong(i9);
                        iN55 = i9;
                        int i57 = iN56;
                        if (cursorO2.isNull(i57)) {
                            iN56 = i57;
                            i10 = iN57;
                            string5 = null;
                        } else {
                            string5 = cursorO2.getString(i57);
                            iN56 = i57;
                            i10 = iN57;
                        }
                        if (cursorO2.isNull(i10)) {
                            iN57 = i10;
                            i11 = iN58;
                            string6 = null;
                        } else {
                            string6 = cursorO2.getString(i10);
                            iN57 = i10;
                            i11 = iN58;
                        }
                        long j26 = cursorO2.getLong(i11);
                        iN58 = i11;
                        int i58 = iN59;
                        long j27 = cursorO2.getLong(i58);
                        iN59 = i58;
                        int i59 = iN60;
                        int i60 = cursorO2.getInt(i59);
                        t19VarD2.a().getClass();
                        int iA2 = ey8.a(i60);
                        iN60 = i59;
                        int i61 = iN61;
                        long j28 = cursorO2.getLong(i61);
                        iN61 = i61;
                        int i62 = iN62;
                        int i63 = cursorO2.getInt(i62);
                        iN62 = i62;
                        int i64 = iN63;
                        int i65 = cursorO2.getInt(i64);
                        iN63 = i64;
                        int i66 = iN64;
                        int i67 = cursorO2.getInt(i66);
                        iN64 = i66;
                        int i68 = iN65;
                        long j29 = cursorO2.getLong(i68);
                        iN65 = i68;
                        int i69 = iN66;
                        int i70 = cursorO2.getInt(i69);
                        iN66 = i69;
                        int i71 = iN67;
                        int i72 = cursorO2.getInt(i71);
                        iN67 = i71;
                        int i73 = iN68;
                        long j30 = cursorO2.getLong(i73);
                        iN68 = i73;
                        int i74 = iN69;
                        byte[] blob6 = cursorO2.isNull(i74) ? null : cursorO2.getBlob(i74);
                        t19VarD2.a().getClass();
                        List listA2 = v89.a(blob6);
                        iN69 = i74;
                        int i75 = iN70;
                        if (cursorO2.isNull(i75)) {
                            i12 = i75;
                            i13 = iN38;
                            blob2 = null;
                        } else {
                            i12 = i75;
                            blob2 = cursorO2.getBlob(i75);
                            i13 = iN38;
                        }
                        ix8 ix8VarC2 = t19VarD2.a().c(blob2);
                        int i76 = iN71;
                        if (cursorO2.isNull(i76)) {
                            i14 = iN72;
                            lValueOf2 = null;
                        } else {
                            lValueOf2 = Long.valueOf(cursorO2.getLong(i76));
                            i14 = iN72;
                        }
                        Integer numValueOf2 = cursorO2.isNull(i14) ? null : Integer.valueOf(cursorO2.getInt(i14));
                        if (numValueOf2 == null) {
                            iN71 = i76;
                            boolValueOf2 = null;
                        } else {
                            iN71 = i76;
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        }
                        arrayList.add(new ru8(j17, j18, j19, j20, j21, j22, string9, iu8VarN2, vx8VarB2, j23, string10, string4, k8gVarB2, i51, z4, i54, j24, z2, j25, string5, string6, j26, j27, iA2, j28, i63, i65, i67, j29, i70, i72, j30, listA2, ix8VarC2, lValueOf2, boolValueOf2));
                        iN72 = i14;
                        iN38 = i13;
                        iN37 = i49;
                        iN70 = i12;
                        i46 = i8;
                    }
                    cursorO2.close();
                    xlcVar2.n();
                } catch (Throwable th3) {
                    th = th3;
                    cursorO2.close();
                    xlcVar2.n();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                xlcVar2 = xlcVarA2;
            }
        }
        ru8 ru8Var = (ru8) x53.i0(arrayList);
        if (ru8Var != null) {
            return vlcVar.b(ru8Var);
        }
        return null;
    }

    public final ArrayList s() throws Throwable {
        xlc xlcVar;
        String string;
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        String string2;
        int i4;
        String string3;
        int i5;
        int i6;
        byte[] blob;
        int i7;
        Long lValueOf;
        int i8;
        Boolean boolValueOf;
        oz7 oz7Var = iu8.b;
        vlc vlcVar = ((k24) this.a).c;
        t19 t19VarD = vlcVar.d();
        t19VarD.getClass();
        xlc xlcVarA = xlc.a(2, "SELECT * FROM messages WHERE delivery_status = ? AND inserted_from_msg_link = 0 AND status <> ?");
        t19VarD.a().getClass();
        long j = 10;
        ey8.m(xlcVarA, 1, j, t19VarD);
        xlcVarA.j(2, j);
        ilc ilcVar = t19VarD.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "server_id");
            int iN3 = tfg.n(cursorO, "time");
            int iN4 = tfg.n(cursorO, "update_time");
            int iN5 = tfg.n(cursorO, "sender");
            int iN6 = tfg.n(cursorO, "cid");
            int iN7 = tfg.n(cursorO, "text");
            int iN8 = tfg.n(cursorO, "delivery_status");
            int iN9 = tfg.n(cursorO, "status");
            int iN10 = tfg.n(cursorO, "time_local");
            int iN11 = tfg.n(cursorO, "error");
            int iN12 = tfg.n(cursorO, "localized_error");
            int iN13 = tfg.n(cursorO, "attaches");
            xlcVar = xlcVarA;
            try {
                int iN14 = tfg.n(cursorO, "media_type");
                int iN15 = tfg.n(cursorO, "detect_share");
                int iN16 = tfg.n(cursorO, "msg_link_type");
                int iN17 = tfg.n(cursorO, "msg_link_id");
                int iN18 = tfg.n(cursorO, "inserted_from_msg_link");
                int iN19 = tfg.n(cursorO, "msg_link_chat_id");
                int iN20 = tfg.n(cursorO, "msg_link_chat_name");
                int iN21 = tfg.n(cursorO, "msg_link_chat_link");
                int iN22 = tfg.n(cursorO, "msg_link_out_chat_id");
                int iN23 = tfg.n(cursorO, "msg_link_out_msg_id");
                int iN24 = tfg.n(cursorO, "type");
                int iN25 = tfg.n(cursorO, "chat_id");
                int iN26 = tfg.n(cursorO, "ttl");
                int iN27 = tfg.n(cursorO, "channel_views");
                int iN28 = tfg.n(cursorO, "channel_forwards");
                int iN29 = tfg.n(cursorO, "view_time");
                int iN30 = tfg.n(cursorO, "zoom");
                int iN31 = tfg.n(cursorO, "options");
                int iN32 = tfg.n(cursorO, "live_until");
                int iN33 = tfg.n(cursorO, "elements");
                int iN34 = tfg.n(cursorO, "reactions");
                int iN35 = tfg.n(cursorO, "delayed_attrs_time_to_fire");
                int iN36 = tfg.n(cursorO, "delayed_attrs_notify_sender");
                int i9 = iN13;
                ArrayList arrayList = new ArrayList(cursorO.getCount());
                while (cursorO.moveToNext()) {
                    long j2 = cursorO.getLong(iN);
                    long j3 = cursorO.getLong(iN2);
                    long j4 = cursorO.getLong(iN3);
                    long j5 = cursorO.getLong(iN4);
                    long j6 = cursorO.getLong(iN5);
                    long j7 = cursorO.getLong(iN6);
                    String string4 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                    int i10 = cursorO.getInt(iN8);
                    t19VarD.a().getClass();
                    iu8.b.getClass();
                    iu8 iu8VarN = oz7.n(i10);
                    int i11 = cursorO.getInt(iN9);
                    t19VarD.a().getClass();
                    vx8 vx8VarB = v89.b(i11);
                    long j8 = cursorO.getLong(iN10);
                    String string5 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                    if (cursorO.isNull(iN12)) {
                        i = i9;
                        string = null;
                    } else {
                        string = cursorO.getString(iN12);
                        i = i9;
                    }
                    byte[] blob2 = cursorO.isNull(i) ? null : cursorO.getBlob(i);
                    t19VarD.a().getClass();
                    k8g k8gVarB = iz7.b(blob2);
                    i9 = i;
                    int i12 = iN14;
                    int i13 = cursorO.getInt(i12);
                    iN14 = i12;
                    int i14 = iN15;
                    if (cursorO.getInt(i14) != 0) {
                        iN15 = i14;
                        i2 = iN16;
                        z = true;
                    } else {
                        iN15 = i14;
                        i2 = iN16;
                        z = false;
                    }
                    int i15 = cursorO.getInt(i2);
                    iN16 = i2;
                    int i16 = iN17;
                    long j9 = cursorO.getLong(i16);
                    iN17 = i16;
                    int i17 = iN18;
                    if (cursorO.getInt(i17) != 0) {
                        iN18 = i17;
                        i3 = iN19;
                        z2 = true;
                    } else {
                        iN18 = i17;
                        i3 = iN19;
                        z2 = false;
                    }
                    long j10 = cursorO.getLong(i3);
                    iN19 = i3;
                    int i18 = iN20;
                    if (cursorO.isNull(i18)) {
                        iN20 = i18;
                        i4 = iN21;
                        string2 = null;
                    } else {
                        string2 = cursorO.getString(i18);
                        iN20 = i18;
                        i4 = iN21;
                    }
                    if (cursorO.isNull(i4)) {
                        iN21 = i4;
                        i5 = iN22;
                        string3 = null;
                    } else {
                        string3 = cursorO.getString(i4);
                        iN21 = i4;
                        i5 = iN22;
                    }
                    long j11 = cursorO.getLong(i5);
                    iN22 = i5;
                    int i19 = iN23;
                    long j12 = cursorO.getLong(i19);
                    iN23 = i19;
                    int i20 = iN24;
                    int i21 = cursorO.getInt(i20);
                    t19VarD.a().getClass();
                    int iA = ey8.a(i21);
                    iN24 = i20;
                    int i22 = iN25;
                    long j13 = cursorO.getLong(i22);
                    iN25 = i22;
                    int i23 = iN26;
                    int i24 = cursorO.getInt(i23);
                    iN26 = i23;
                    int i25 = iN27;
                    int i26 = cursorO.getInt(i25);
                    iN27 = i25;
                    int i27 = iN28;
                    int i28 = cursorO.getInt(i27);
                    iN28 = i27;
                    int i29 = iN29;
                    long j14 = cursorO.getLong(i29);
                    iN29 = i29;
                    int i30 = iN30;
                    int i31 = cursorO.getInt(i30);
                    iN30 = i30;
                    int i32 = iN31;
                    int i33 = cursorO.getInt(i32);
                    iN31 = i32;
                    int i34 = iN32;
                    long j15 = cursorO.getLong(i34);
                    iN32 = i34;
                    int i35 = iN33;
                    byte[] blob3 = cursorO.isNull(i35) ? null : cursorO.getBlob(i35);
                    t19VarD.a().getClass();
                    List listA = v89.a(blob3);
                    iN33 = i35;
                    int i36 = iN34;
                    if (cursorO.isNull(i36)) {
                        i6 = i36;
                        i7 = iN12;
                        blob = null;
                    } else {
                        i6 = i36;
                        blob = cursorO.getBlob(i36);
                        i7 = iN12;
                    }
                    ix8 ix8VarC = t19VarD.a().c(blob);
                    int i37 = iN35;
                    if (cursorO.isNull(i37)) {
                        i8 = iN36;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(cursorO.getLong(i37));
                        i8 = iN36;
                    }
                    Integer numValueOf = cursorO.isNull(i8) ? null : Integer.valueOf(cursorO.getInt(i8));
                    if (numValueOf == null) {
                        iN35 = i37;
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        iN35 = i37;
                    }
                    arrayList.add(new ru8(j2, j3, j4, j5, j6, j7, string4, iu8VarN, vx8VarB, j8, string5, string, k8gVarB, i13, z, i15, j9, z2, j10, string2, string3, j11, j12, iA, j13, i24, i26, i28, j14, i31, i33, j15, listA, ix8VarC, lValueOf, boolValueOf));
                    iN36 = i8;
                    iN12 = i7;
                    iN34 = i6;
                }
                cursorO.close();
                xlcVar.n();
                ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(vlcVar.b((ru8) it.next()));
                }
                return arrayList2;
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

    public final cu8 t(final cu8 cu8Var, final String str, final qj3 qj3Var) {
        cqc.a(new f6() { // from class: wt8
            public final /* synthetic */ boolean e = true;

            @Override // defpackage.f6
            public final void run() {
                au8 au8Var = this.a;
                au8Var.getClass();
                cu8 cu8Var2 = cu8Var;
                au8Var.v(cu8Var2.b, str, qj3Var);
                if (this.e) {
                    au8Var.b.c(new l6f(cu8Var2.t0, cu8Var2.b));
                }
            }
        }, (ztc) cqc.a.b, null, new m82(str, 3), null);
        try {
            m20 m20VarC = cu8Var.z0.C();
            tpa.K(m20VarC, str, qj3Var);
            bu8 bu8VarH = cu8Var.H();
            bu8VarH.n = m20VarC.c();
            return bu8VarH.a();
        } catch (Throwable unused) {
            hm9.p("au8", "Can't update attach localId = " + str, null);
            return cu8Var;
        }
    }

    public final es8 u(cu8 cu8Var, String str, d20 d20Var) {
        cu8 cu8VarT = t(cu8Var, str, new y98(this, 11, d20Var));
        zu8 zu8Var = (zu8) this.g.get();
        cu8 cu8VarA = cu8VarT.H().a();
        zu8Var.getClass();
        return zu8.a(zu8Var, cu8VarA);
    }

    public final void v(long j, String str, qj3 qj3Var) {
        ((k24) this.a).c.n(j, new y98(str, 10, qj3Var));
    }

    public final void w(cu8 cu8Var, k8g k8gVar) {
        ((k24) this.a).c.n(cu8Var.b, new xt8(cu8Var, k8gVar, 0));
    }

    public final void x(cu8 cu8Var, iu8 iu8Var) {
        k24 k24Var = (k24) this.a;
        vlc vlcVar = k24Var.c;
        vlcVar.d().n(cu8Var.b, iu8Var);
        if (iu8Var == iu8.s0 && cu8Var.n()) {
            k24Var.c.n(cu8Var.b, new yt8(0, this));
        }
    }

    public final void y(long j, long j2, vx8 vx8Var) {
        t19 t19VarD = ((k24) this.a).c.d();
        ilc ilcVar = t19VarD.a;
        ilcVar.b();
        th thVar = t19VarD.l;
        q36 q36VarF = thVar.f();
        t19VarD.a().getClass();
        q36VarF.j(1, vx8Var.a);
        q36VarF.j(2, j);
        q36VarF.j(3, j2);
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
            } finally {
                ilcVar.l();
            }
        } finally {
            thVar.t(q36VarF);
        }
    }

    public final void z(long j, String str, List list, p82 p82Var, vx8 vx8Var) {
        t19 t19VarD = ((k24) this.a).c.d();
        r6f r6fVar = new r6f(j, str, list, vx8Var);
        ilc ilcVar = t19VarD.a;
        ilcVar.b();
        ilcVar.c();
        try {
            t19VarD.f.B(r6fVar);
            ilcVar.r();
            ilcVar.l();
            cu8 cu8VarQ = q(j);
            if (cu8VarQ != null) {
                this.f.b(p82Var.C(cu8VarQ.t0), cu8VarQ);
            }
        } catch (Throwable th) {
            ilcVar.l();
            throw th;
        }
    }
}
