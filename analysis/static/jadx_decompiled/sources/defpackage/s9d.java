package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class s9d extends d8d {
    public final /* synthetic */ int b;
    public final long c;
    public final Object o;

    public s9d(long j) {
        this.b = 0;
        this.c = j;
        this.o = s9d.class.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d8d
    public final void x() throws Throwable {
        long j;
        String str;
        String str2;
        nz4<cu8> nz4Var;
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
        long j2 = 0;
        long j3 = this.c;
        switch (this.b) {
            case 0:
                nz4 nz4Var2 = nz4.a;
                e52 e52VarC = g().C(j3);
                String str3 = (String) this.o;
                if (e52VarC != null) {
                    k92 k92Var = e52VarC.b;
                    if (!k92Var.e.isEmpty()) {
                        for (Map.Entry entry : k92Var.e.entrySet()) {
                            long jLongValue = ((Number) entry.getKey()).longValue();
                            long jLongValue2 = ((Number) entry.getValue()).longValue();
                            if (jLongValue != ((p7b) p()).a.t() && jLongValue2 > j2) {
                                j2 = jLongValue2;
                            }
                        }
                    } else {
                        es8 es8Var = e52VarC.c;
                        if (es8Var != null) {
                            j2 = es8Var.a.o;
                        }
                    }
                    au8 au8VarO = o();
                    vlc vlcVar = ((k24) au8VarO.a).c;
                    long jT = ((p7b) au8VarO.c).a.t();
                    t19 t19VarD = vlcVar.d();
                    oz7 oz7Var = iu8.b;
                    t19VarD.getClass();
                    xlc xlcVarA = xlc.a(5, "SELECT * FROM messages WHERE chat_id = ? AND sender = ? AND time <= ? AND delivery_status = ? AND inserted_from_msg_link = 0 AND status <> ?");
                    xlcVarA.j(1, j3);
                    xlcVarA.j(2, jT);
                    ey8.m(xlcVarA, 3, j2, t19VarD);
                    ey8.m(xlcVarA, 4, 20, t19VarD);
                    xlcVarA.j(5, 10);
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
                                int i12 = iN7;
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
                                    i7 = iN6;
                                    blob = null;
                                } else {
                                    i6 = i37;
                                    blob = cursorO.getBlob(i37);
                                    i7 = iN6;
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
                                iN6 = i7;
                                iN7 = i12;
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
                            if (!arrayList2.isEmpty()) {
                                int size = arrayList2.size();
                                str2 = "messages for chat ";
                                StringBuilder sb = new StringBuilder(str2);
                                j = j3;
                                sb.append(j);
                                str = " to update = ";
                                sb.append(str);
                                sb.append(size);
                                str3 = str3;
                                hm9.n(str3, sb.toString());
                                nz4Var = arrayList2;
                            } else {
                                str3 = str3;
                                str = " to update = ";
                                j = j3;
                                str2 = "messages for chat ";
                                nz4Var = arrayList2;
                            }
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
                    j = j3;
                    str = " to update = ";
                    str2 = "messages for chat ";
                    nz4Var = nz4Var2;
                }
                hm9.n(str3, str2 + j + str + nz4Var.size());
                if (!nz4Var.isEmpty()) {
                    au8 au8VarO2 = o();
                    oz7 oz7Var2 = iu8.b;
                    vlc vlcVar2 = ((k24) au8VarO2.a).c;
                    ((OneMeRoomDatabase) vlcVar2.a.m()).q(new v05(nz4Var, vlcVar2));
                    e52 e52VarC2 = g().C(j);
                    for (cu8 cu8Var : nz4Var) {
                        if ((e52VarC2 != null ? e52VarC2.c : null) != null && e52VarC2.c.a.b == cu8Var.b) {
                            g().k0(j, cu8Var, false);
                        }
                        e8d e8dVar = this.a;
                        if (e8dVar == null) {
                            e8dVar = null;
                        }
                        ((av0) e8dVar.c.getValue()).c(new l6f(cu8Var.t0, cu8Var.b, 0));
                    }
                    hm9.n(str3, "records updated " + nz4Var.size());
                    return;
                }
                return;
            default:
                if (j3 > 0) {
                    y(b().C(j3));
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i39 = 0;
                for (e52 e52Var : b().E(p82.I)) {
                    if (jCurrentTimeMillis - e52Var.b.k < 1209600000) {
                        if (y(e52Var)) {
                            i39++;
                        }
                        if (i39 >= 10) {
                            return;
                        }
                    }
                }
                return;
        }
    }

    public boolean y(e52 e52Var) throws Throwable {
        long jN;
        Iterable<es8> iterableB;
        Object obj = this.o;
        if (e52Var == null) {
            return false;
        }
        k92 k92Var = e52Var.b;
        mg4 mg4Var = (mg4) obj;
        if (k92Var.n.c(mg4Var) == 0) {
            return false;
        }
        int iOrdinal = mg4Var.ordinal();
        if (iOrdinal == 0) {
            b().getClass();
            jN = e52Var.n();
            es8 es8Var = e52Var.c;
            if (es8Var != null) {
                long j = es8Var.a.o;
                if (jN > j) {
                    jN = j;
                }
            }
        } else {
            if (iOrdinal != 1) {
                throw new IllegalStateException("Unexpected value: " + mg4Var);
            }
            jN = System.currentTimeMillis();
        }
        au8 au8VarN = n();
        ArrayList arrayListD = k92Var.n.d(mg4Var);
        au8VarN.getClass();
        hm9.n("au8", "loadInitialToReadMark " + nu0.G(Long.valueOf(jN)) + "; chunks count = " + arrayListD.size());
        d92 d92Var = (d92) hm9.u(jN, arrayListD).b;
        mg4 mg4Var2 = (mg4) obj;
        rm4 rm4Var = au8VarN.g;
        if (d92Var == null) {
            d92 d92VarV = hm9.v(jN, arrayListD);
            iterableB = d92VarV != null ? ((zu8) rm4Var.get()).b(au8VarN.n(e52Var.a, d92VarV.a, d92VarV.b, true, mg4Var2)) : null;
        } else {
            ArrayList arrayListN = au8VarN.n(e52Var.a, d92Var.a, jN, true, mg4Var2);
            ArrayList arrayListN2 = au8VarN.n(e52Var.a, jN, d92Var.b, false, mg4Var2);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListN.iterator();
            while (it.hasNext()) {
                cu8 cu8Var = (cu8) it.next();
                arrayList.add(cu8Var);
                hashSet.add(Long.valueOf(cu8Var.b));
            }
            Iterator it2 = arrayListN2.iterator();
            while (it2.hasNext()) {
                cu8 cu8Var2 = (cu8) it2.next();
                if (!hashSet.contains(Long.valueOf(cu8Var2.b))) {
                    arrayList.add(cu8Var2);
                    hashSet.add(Long.valueOf(cu8Var2.b));
                }
            }
            hm9.n("au8", "result record count = " + hashSet.size());
            iterableB = ((zu8) rm4Var.get()).b(arrayList);
        }
        if (iterableB == null) {
            iterableB = nz4.a;
        }
        for (es8 es8Var2 : iterableB) {
            e8d e8dVar = this.a;
            if (e8dVar == null) {
                e8dVar = null;
            }
            t6b t6bVar = (t6b) e8dVar.H.getValue();
            cu8 cu8Var3 = es8Var2.a;
            ((u6b) t6bVar.c.computeIfAbsent(Long.valueOf(cu8Var3.b), new di(16, new lr1(t6bVar, cu8Var3, e52Var, 10)))).h(e52Var);
            cu8 cu8Var4 = es8Var2.a;
            if (cu8Var4.n()) {
                k8g k8gVar = cu8Var4.z0;
                int i = k8gVar.i();
                for (int i2 = 0; i2 < i; i2++) {
                    e8d e8dVar2 = this.a;
                    if (e8dVar2 == null) {
                        e8dVar2 = null;
                    }
                    af8 af8Var = (af8) e8dVar2.A.getValue();
                    k8gVar.h(i2);
                    af8Var.getClass();
                }
            }
        }
        return true;
    }

    public s9d(long j, mg4 mg4Var) {
        this.b = 1;
        this.c = j;
        this.o = mg4Var;
    }
}
