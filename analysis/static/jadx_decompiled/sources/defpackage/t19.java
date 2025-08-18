package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class t19 {
    public final ilc a;
    public final ct2 b;
    public v89 c;
    public final s19 d;
    public final s19 e;
    public final s19 f;
    public final p19 g;
    public final p19 h;
    public final th i;
    public final th j;
    public final th k;
    public final th l;
    public final p19 m;
    public final p19 n;
    public final p19 o;
    public final p19 p;
    public final p19 q;
    public final p19 r;
    public final p19 s;
    public final p19 t;

    public t19(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ct2(this, oneMeRoomDatabase, 1);
        this.d = new s19(this, oneMeRoomDatabase, 0);
        new s19(this, oneMeRoomDatabase, 1);
        new ha4(oneMeRoomDatabase, 1);
        this.e = new s19(this, oneMeRoomDatabase, 2);
        new ha4(oneMeRoomDatabase, 2);
        this.f = new s19(this, oneMeRoomDatabase, 3);
        this.g = new p19(oneMeRoomDatabase, 10);
        this.h = new p19(oneMeRoomDatabase, 11);
        this.i = new th(oneMeRoomDatabase, 26);
        this.j = new th(oneMeRoomDatabase, 27);
        this.k = new th(oneMeRoomDatabase, 28);
        this.l = new th(oneMeRoomDatabase, 29);
        this.m = new p19(oneMeRoomDatabase, 0);
        new p19(oneMeRoomDatabase, 1);
        this.n = new p19(oneMeRoomDatabase, 2);
        this.o = new p19(oneMeRoomDatabase, 3);
        this.p = new p19(oneMeRoomDatabase, 4);
        this.q = new p19(oneMeRoomDatabase, 5);
        this.r = new p19(oneMeRoomDatabase, 6);
        this.s = new p19(oneMeRoomDatabase, 7);
        this.t = new p19(oneMeRoomDatabase, 8);
        new p19(oneMeRoomDatabase, 9);
    }

    public static yw8 g(t19 t19Var, ru8 ru8Var, yw8 yw8Var, long j, Long l, Long l2, int i) {
        String str;
        Long l3 = (i & 8) != 0 ? null : l;
        Long l4 = (i & 16) == 0 ? l2 : null;
        String str2 = yw8Var.h;
        String str3 = ((str2 != null && str2.length() != 0) || (str = ru8Var.g) == null || str.length() == 0) ? str2 : str;
        long j2 = yw8Var.l;
        if (j2 == 0) {
            j2 = ru8Var.q;
        }
        long j3 = j2;
        int i2 = yw8Var.k;
        if (i2 == 0) {
            i2 = ru8Var.p;
        }
        int i3 = i2;
        long j4 = yw8Var.n;
        if (j4 == 0) {
            j4 = ru8Var.s;
        }
        long j5 = j4;
        String str4 = yw8Var.p;
        if (str4 == null) {
            str4 = ru8Var.u;
        }
        String str5 = str4;
        String str6 = yw8Var.o;
        if (str6 == null) {
            str6 = ru8Var.t;
        }
        String str7 = str6;
        ix8 ix8Var = yw8Var.j;
        if (ix8Var == null) {
            ix8Var = ru8Var.G;
        }
        return new yw8(ru8Var.a, l3 != null ? l3.longValue() : yw8Var.b, yw8Var.c, j, yw8Var.e, yw8Var.f, l4 != null ? l4.longValue() : yw8Var.g, str3, yw8Var.i, ix8Var, i3, j3, ru8Var.r && yw8Var.m, j5, str7, str5, yw8Var.q, yw8Var.r, yw8Var.s, yw8Var.t, yw8Var.u, yw8Var.v, yw8Var.w, yw8Var.x, yw8Var.y);
    }

    public static ArrayList j(t19 t19Var, long j) throws Throwable {
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
        String string;
        int i2;
        String string2;
        int i3;
        int i4;
        byte[] blob;
        int i5;
        Long lValueOf;
        int i6;
        Boolean boolValueOf;
        t19Var.getClass();
        xlc xlcVarA = xlc.a(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?");
        ey8.m(xlcVarA, 1, j, t19Var);
        xlcVarA.j(2, 10);
        xlcVarA.j(3, 1L);
        ilc ilcVar = t19Var.a;
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
            iN14 = tfg.n(cursorO, "media_type");
            xlcVar = xlcVarA;
        } catch (Throwable th) {
            th = th;
            xlcVar = xlcVarA;
        }
        try {
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
            int i7 = iN14;
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                long j2 = cursorO.getLong(iN);
                long j3 = cursorO.getLong(iN2);
                long j4 = cursorO.getLong(iN3);
                long j5 = cursorO.getLong(iN4);
                long j6 = cursorO.getLong(iN5);
                long j7 = cursorO.getLong(iN6);
                String string3 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                int i8 = cursorO.getInt(iN8);
                t19Var.a().getClass();
                iu8.b.getClass();
                iu8 iu8VarN = oz7.n(i8);
                int i9 = cursorO.getInt(iN9);
                t19Var.a().getClass();
                vx8 vx8VarB = v89.b(i9);
                long j8 = cursorO.getLong(iN10);
                String string4 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                String string5 = cursorO.isNull(iN12) ? null : cursorO.getString(iN12);
                byte[] blob2 = cursorO.isNull(iN13) ? null : cursorO.getBlob(iN13);
                t19Var.a().getClass();
                k8g k8gVarB = iz7.b(blob2);
                int i10 = i7;
                int i11 = cursorO.getInt(i10);
                i7 = i10;
                int i12 = iN15;
                int i13 = cursorO.getInt(i12);
                iN15 = i12;
                int i14 = iN16;
                boolean z2 = i13 != 0;
                int i15 = cursorO.getInt(i14);
                int i16 = iN17;
                long j9 = cursorO.getLong(i16);
                iN17 = i16;
                int i17 = iN18;
                if (cursorO.getInt(i17) != 0) {
                    iN18 = i17;
                    i = iN19;
                    z = true;
                } else {
                    iN18 = i17;
                    i = iN19;
                    z = false;
                }
                long j10 = cursorO.getLong(i);
                iN19 = i;
                int i18 = iN20;
                if (cursorO.isNull(i18)) {
                    iN20 = i18;
                    i2 = iN21;
                    string = null;
                } else {
                    string = cursorO.getString(i18);
                    iN20 = i18;
                    i2 = iN21;
                }
                if (cursorO.isNull(i2)) {
                    iN21 = i2;
                    i3 = iN22;
                    string2 = null;
                } else {
                    string2 = cursorO.getString(i2);
                    iN21 = i2;
                    i3 = iN22;
                }
                long j11 = cursorO.getLong(i3);
                iN22 = i3;
                int i19 = iN23;
                long j12 = cursorO.getLong(i19);
                iN23 = i19;
                int i20 = iN24;
                int i21 = cursorO.getInt(i20);
                t19Var.a().getClass();
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
                t19Var.a().getClass();
                List listA = v89.a(blob3);
                iN33 = i35;
                int i36 = iN34;
                if (cursorO.isNull(i36)) {
                    i4 = i36;
                    i5 = iN12;
                    blob = null;
                } else {
                    i4 = i36;
                    blob = cursorO.getBlob(i36);
                    i5 = iN12;
                }
                ix8 ix8VarC = t19Var.a().c(blob);
                int i37 = iN35;
                if (cursorO.isNull(i37)) {
                    i6 = iN36;
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(cursorO.getLong(i37));
                    i6 = iN36;
                }
                Integer numValueOf = cursorO.isNull(i6) ? null : Integer.valueOf(cursorO.getInt(i6));
                if (numValueOf == null) {
                    iN35 = i37;
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    iN35 = i37;
                }
                arrayList.add(new ru8(j2, j3, j4, j5, j6, j7, string3, iu8VarN, vx8VarB, j8, string4, string5, k8gVarB, i11, z2, i15, j9, z, j10, string, string2, j11, j12, iA, j13, i24, i26, i28, j14, i31, i33, j15, listA, ix8VarC, lValueOf, boolValueOf));
                iN36 = i6;
                iN12 = i5;
                iN16 = i14;
                iN34 = i4;
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

    public final synchronized v89 a() {
        try {
            if (this.c == null) {
                this.c = (v89) this.a.l.get(v89.class);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public final ru8 b(long j, long j2) throws Throwable {
        xlc xlcVar;
        ru8 ru8Var;
        int i;
        boolean z;
        boolean z2;
        int i2;
        String string;
        int i3;
        String string2;
        int i4;
        Boolean boolValueOf;
        xlc xlcVarA = xlc.a(2, "SELECT * FROM messages WHERE chat_id = ? AND server_id = ?");
        xlcVarA.j(1, j);
        xlcVarA.j(2, j2);
        ilc ilcVar = this.a;
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
            int iN14 = tfg.n(cursorO, "media_type");
            xlcVar = xlcVarA;
            try {
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
                if (cursorO.moveToFirst()) {
                    long j3 = cursorO.getLong(iN);
                    long j4 = cursorO.getLong(iN2);
                    long j5 = cursorO.getLong(iN3);
                    long j6 = cursorO.getLong(iN4);
                    long j7 = cursorO.getLong(iN5);
                    long j8 = cursorO.getLong(iN6);
                    String string3 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                    int i5 = cursorO.getInt(iN8);
                    a().getClass();
                    iu8.b.getClass();
                    iu8 iu8VarN = oz7.n(i5);
                    int i6 = cursorO.getInt(iN9);
                    a().getClass();
                    vx8 vx8VarB = v89.b(i6);
                    long j9 = cursorO.getLong(iN10);
                    String string4 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                    String string5 = cursorO.isNull(iN12) ? null : cursorO.getString(iN12);
                    byte[] blob = cursorO.isNull(iN13) ? null : cursorO.getBlob(iN13);
                    a().getClass();
                    k8g k8gVarB = iz7.b(blob);
                    int i7 = cursorO.getInt(iN14);
                    if (cursorO.getInt(iN15) != 0) {
                        i = iN16;
                        z = true;
                    } else {
                        i = iN16;
                        z = false;
                    }
                    int i8 = cursorO.getInt(i);
                    long j10 = cursorO.getLong(iN17);
                    if (cursorO.getInt(iN18) != 0) {
                        i2 = iN19;
                        z2 = true;
                    } else {
                        z2 = false;
                        i2 = iN19;
                    }
                    long j11 = cursorO.getLong(i2);
                    if (cursorO.isNull(iN20)) {
                        i3 = iN21;
                        string = null;
                    } else {
                        string = cursorO.getString(iN20);
                        i3 = iN21;
                    }
                    if (cursorO.isNull(i3)) {
                        i4 = iN22;
                        string2 = null;
                    } else {
                        string2 = cursorO.getString(i3);
                        i4 = iN22;
                    }
                    long j12 = cursorO.getLong(i4);
                    long j13 = cursorO.getLong(iN23);
                    int i9 = cursorO.getInt(iN24);
                    a().getClass();
                    int iA = ey8.a(i9);
                    long j14 = cursorO.getLong(iN25);
                    int i10 = cursorO.getInt(iN26);
                    int i11 = cursorO.getInt(iN27);
                    int i12 = cursorO.getInt(iN28);
                    long j15 = cursorO.getLong(iN29);
                    int i13 = cursorO.getInt(iN30);
                    int i14 = cursorO.getInt(iN31);
                    long j16 = cursorO.getLong(iN32);
                    byte[] blob2 = cursorO.isNull(iN33) ? null : cursorO.getBlob(iN33);
                    a().getClass();
                    List listA = v89.a(blob2);
                    ix8 ix8VarC = a().c(cursorO.isNull(iN34) ? null : cursorO.getBlob(iN34));
                    Long lValueOf = cursorO.isNull(iN35) ? null : Long.valueOf(cursorO.getLong(iN35));
                    Integer numValueOf = cursorO.isNull(iN36) ? null : Integer.valueOf(cursorO.getInt(iN36));
                    if (numValueOf == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    ru8Var = new ru8(j3, j4, j5, j6, j7, j8, string3, iu8VarN, vx8VarB, j9, string4, string5, k8gVarB, i7, z, i8, j10, z2, j11, string, string2, j12, j13, iA, j14, i10, i11, i12, j15, i13, i14, j16, listA, ix8VarC, lValueOf, boolValueOf);
                } else {
                    ru8Var = null;
                }
                cursorO.close();
                xlcVar.n();
                return ru8Var;
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

    public final ru8 c(long j) throws Throwable {
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
        ru8 ru8Var;
        boolean z;
        int i;
        boolean z2;
        int i2;
        String string;
        int i3;
        String string2;
        int i4;
        Boolean boolValueOf;
        xlc xlcVarA = xlc.a(1, "SELECT * FROM messages WHERE id = ?");
        xlcVarA.j(1, j);
        ilc ilcVar = this.a;
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
            iN14 = tfg.n(cursorO, "media_type");
            xlcVar = xlcVarA;
        } catch (Throwable th) {
            th = th;
            xlcVar = xlcVarA;
        }
        try {
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
            if (cursorO.moveToFirst()) {
                long j2 = cursorO.getLong(iN);
                long j3 = cursorO.getLong(iN2);
                long j4 = cursorO.getLong(iN3);
                long j5 = cursorO.getLong(iN4);
                long j6 = cursorO.getLong(iN5);
                long j7 = cursorO.getLong(iN6);
                String string3 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                int i5 = cursorO.getInt(iN8);
                a().getClass();
                iu8.b.getClass();
                iu8 iu8VarN = oz7.n(i5);
                int i6 = cursorO.getInt(iN9);
                a().getClass();
                vx8 vx8VarB = v89.b(i6);
                long j8 = cursorO.getLong(iN10);
                String string4 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                String string5 = cursorO.isNull(iN12) ? null : cursorO.getString(iN12);
                byte[] blob = cursorO.isNull(iN13) ? null : cursorO.getBlob(iN13);
                a().getClass();
                k8g k8gVarB = iz7.b(blob);
                int i7 = cursorO.getInt(iN14);
                if (cursorO.getInt(iN15) != 0) {
                    i = iN16;
                    z = true;
                } else {
                    z = false;
                    i = iN16;
                }
                int i8 = cursorO.getInt(i);
                long j9 = cursorO.getLong(iN17);
                if (cursorO.getInt(iN18) != 0) {
                    i2 = iN19;
                    z2 = true;
                } else {
                    z2 = false;
                    i2 = iN19;
                }
                long j10 = cursorO.getLong(i2);
                if (cursorO.isNull(iN20)) {
                    i3 = iN21;
                    string = null;
                } else {
                    string = cursorO.getString(iN20);
                    i3 = iN21;
                }
                if (cursorO.isNull(i3)) {
                    i4 = iN22;
                    string2 = null;
                } else {
                    string2 = cursorO.getString(i3);
                    i4 = iN22;
                }
                long j11 = cursorO.getLong(i4);
                long j12 = cursorO.getLong(iN23);
                int i9 = cursorO.getInt(iN24);
                a().getClass();
                int iA = ey8.a(i9);
                long j13 = cursorO.getLong(iN25);
                int i10 = cursorO.getInt(iN26);
                int i11 = cursorO.getInt(iN27);
                int i12 = cursorO.getInt(iN28);
                long j14 = cursorO.getLong(iN29);
                int i13 = cursorO.getInt(iN30);
                int i14 = cursorO.getInt(iN31);
                long j15 = cursorO.getLong(iN32);
                byte[] blob2 = cursorO.isNull(iN33) ? null : cursorO.getBlob(iN33);
                a().getClass();
                List listA = v89.a(blob2);
                ix8 ix8VarC = a().c(cursorO.isNull(iN34) ? null : cursorO.getBlob(iN34));
                Long lValueOf = cursorO.isNull(iN35) ? null : Long.valueOf(cursorO.getLong(iN35));
                Integer numValueOf = cursorO.isNull(iN36) ? null : Integer.valueOf(cursorO.getInt(iN36));
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                ru8Var = new ru8(j2, j3, j4, j5, j6, j7, string3, iu8VarN, vx8VarB, j8, string4, string5, k8gVarB, i7, z, i8, j9, z2, j10, string, string2, j11, j12, iA, j13, i10, i11, i12, j14, i13, i14, j15, listA, ix8VarC, lValueOf, boolValueOf);
            } else {
                ru8Var = null;
            }
            cursorO.close();
            xlcVar.n();
            return ru8Var;
        } catch (Throwable th2) {
            th = th2;
            cursorO.close();
            xlcVar.n();
            throw th;
        }
    }

    public final ArrayList d(long j, long j2, boolean z, long j3) throws Throwable {
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
        ArrayList arrayList;
        int i;
        String str;
        String string;
        int i2;
        int i3;
        byte[] blob;
        int i4;
        Long lValueOf;
        int i5;
        Boolean boolValueOf;
        xlc xlcVar2;
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
        int iN27;
        int iN28;
        int i6;
        String str2;
        String string2;
        int i7;
        int i8;
        byte[] blob2;
        int i9;
        Long lValueOf2;
        int i10;
        Boolean boolValueOf2;
        ilc ilcVar = this.a;
        if (z) {
            xlc xlcVarA = xlc.a(5, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC, time_local DESC LIMIT ?");
            xlcVarA.j(1, j);
            xlcVarA.j(2, j2);
            ey8.m(xlcVarA, 3, j3, this);
            xlcVarA.j(4, 10);
            xlcVarA.j(5, 40);
            ilcVar.b();
            Cursor cursorO = ilcVar.o(xlcVarA, null);
            try {
                iN15 = tfg.n(cursorO, "id");
                iN16 = tfg.n(cursorO, "server_id");
                iN17 = tfg.n(cursorO, "time");
                iN18 = tfg.n(cursorO, "update_time");
                iN19 = tfg.n(cursorO, "sender");
                iN20 = tfg.n(cursorO, "cid");
                iN21 = tfg.n(cursorO, "text");
                iN22 = tfg.n(cursorO, "delivery_status");
                iN23 = tfg.n(cursorO, "status");
                iN24 = tfg.n(cursorO, "time_local");
                iN25 = tfg.n(cursorO, "error");
                iN26 = tfg.n(cursorO, "localized_error");
                iN27 = tfg.n(cursorO, "attaches");
                iN28 = tfg.n(cursorO, "media_type");
                xlcVar2 = xlcVarA;
            } catch (Throwable th) {
                th = th;
                xlcVar2 = xlcVarA;
            }
            try {
                int iN29 = tfg.n(cursorO, "detect_share");
                int iN30 = tfg.n(cursorO, "msg_link_type");
                int iN31 = tfg.n(cursorO, "msg_link_id");
                int iN32 = tfg.n(cursorO, "inserted_from_msg_link");
                int iN33 = tfg.n(cursorO, "msg_link_chat_id");
                int iN34 = tfg.n(cursorO, "msg_link_chat_name");
                int iN35 = tfg.n(cursorO, "msg_link_chat_link");
                int iN36 = tfg.n(cursorO, "msg_link_out_chat_id");
                int iN37 = tfg.n(cursorO, "msg_link_out_msg_id");
                int iN38 = tfg.n(cursorO, "type");
                int iN39 = tfg.n(cursorO, "chat_id");
                int iN40 = tfg.n(cursorO, "ttl");
                int iN41 = tfg.n(cursorO, "channel_views");
                int iN42 = tfg.n(cursorO, "channel_forwards");
                int iN43 = tfg.n(cursorO, "view_time");
                int iN44 = tfg.n(cursorO, "zoom");
                int iN45 = tfg.n(cursorO, "options");
                int iN46 = tfg.n(cursorO, "live_until");
                int iN47 = tfg.n(cursorO, "elements");
                int iN48 = tfg.n(cursorO, "reactions");
                int iN49 = tfg.n(cursorO, "delayed_attrs_time_to_fire");
                int iN50 = tfg.n(cursorO, "delayed_attrs_notify_sender");
                int i11 = iN28;
                arrayList = new ArrayList(cursorO.getCount());
                while (cursorO.moveToNext()) {
                    long j4 = cursorO.getLong(iN15);
                    long j5 = cursorO.getLong(iN16);
                    long j6 = cursorO.getLong(iN17);
                    long j7 = cursorO.getLong(iN18);
                    long j8 = cursorO.getLong(iN19);
                    long j9 = cursorO.getLong(iN20);
                    String string3 = cursorO.isNull(iN21) ? null : cursorO.getString(iN21);
                    int i12 = cursorO.getInt(iN22);
                    a().getClass();
                    iu8.b.getClass();
                    iu8 iu8VarN = oz7.n(i12);
                    int i13 = cursorO.getInt(iN23);
                    a().getClass();
                    vx8 vx8VarB = v89.b(i13);
                    long j10 = cursorO.getLong(iN24);
                    String string4 = cursorO.isNull(iN25) ? null : cursorO.getString(iN25);
                    String string5 = cursorO.isNull(iN26) ? null : cursorO.getString(iN26);
                    byte[] blob3 = cursorO.isNull(iN27) ? null : cursorO.getBlob(iN27);
                    a().getClass();
                    k8g k8gVarB = iz7.b(blob3);
                    int i14 = i11;
                    int i15 = cursorO.getInt(i14);
                    i11 = i14;
                    int i16 = iN29;
                    iN29 = i16;
                    boolean z2 = cursorO.getInt(i16) != 0;
                    int i17 = iN30;
                    int i18 = cursorO.getInt(i17);
                    iN30 = i17;
                    int i19 = iN31;
                    long j11 = cursorO.getLong(i19);
                    iN31 = i19;
                    int i20 = iN32;
                    iN32 = i20;
                    boolean z3 = cursorO.getInt(i20) != 0;
                    int i21 = iN33;
                    long j12 = cursorO.getLong(i21);
                    iN33 = i21;
                    int i22 = iN34;
                    if (cursorO.isNull(i22)) {
                        iN34 = i22;
                        i6 = iN35;
                        str2 = null;
                    } else {
                        String string6 = cursorO.getString(i22);
                        iN34 = i22;
                        i6 = iN35;
                        str2 = string6;
                    }
                    if (cursorO.isNull(i6)) {
                        iN35 = i6;
                        i7 = iN36;
                        string2 = null;
                    } else {
                        string2 = cursorO.getString(i6);
                        iN35 = i6;
                        i7 = iN36;
                    }
                    long j13 = cursorO.getLong(i7);
                    iN36 = i7;
                    int i23 = iN37;
                    long j14 = cursorO.getLong(i23);
                    iN37 = i23;
                    int i24 = iN38;
                    int i25 = cursorO.getInt(i24);
                    a().getClass();
                    int iA = ey8.a(i25);
                    iN38 = i24;
                    int i26 = iN39;
                    long j15 = cursorO.getLong(i26);
                    iN39 = i26;
                    int i27 = iN40;
                    int i28 = cursorO.getInt(i27);
                    iN40 = i27;
                    int i29 = iN41;
                    int i30 = cursorO.getInt(i29);
                    iN41 = i29;
                    int i31 = iN42;
                    int i32 = cursorO.getInt(i31);
                    iN42 = i31;
                    int i33 = iN43;
                    long j16 = cursorO.getLong(i33);
                    iN43 = i33;
                    int i34 = iN44;
                    int i35 = cursorO.getInt(i34);
                    iN44 = i34;
                    int i36 = iN45;
                    int i37 = cursorO.getInt(i36);
                    iN45 = i36;
                    int i38 = iN46;
                    long j17 = cursorO.getLong(i38);
                    iN46 = i38;
                    int i39 = iN47;
                    byte[] blob4 = cursorO.isNull(i39) ? null : cursorO.getBlob(i39);
                    a().getClass();
                    List listA = v89.a(blob4);
                    iN47 = i39;
                    int i40 = iN48;
                    if (cursorO.isNull(i40)) {
                        i8 = i40;
                        i9 = iN15;
                        blob2 = null;
                    } else {
                        i8 = i40;
                        blob2 = cursorO.getBlob(i40);
                        i9 = iN15;
                    }
                    ix8 ix8VarC = a().c(blob2);
                    int i41 = iN49;
                    if (cursorO.isNull(i41)) {
                        i10 = iN50;
                        lValueOf2 = null;
                    } else {
                        lValueOf2 = Long.valueOf(cursorO.getLong(i41));
                        i10 = iN50;
                    }
                    Integer numValueOf = cursorO.isNull(i10) ? null : Integer.valueOf(cursorO.getInt(i10));
                    if (numValueOf == null) {
                        iN49 = i41;
                        boolValueOf2 = null;
                    } else {
                        iN49 = i41;
                        boolValueOf2 = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    arrayList.add(new ru8(j4, j5, j6, j7, j8, j9, string3, iu8VarN, vx8VarB, j10, string4, string5, k8gVarB, i15, z2, i18, j11, z3, j12, str2, string2, j13, j14, iA, j15, i28, i30, i32, j16, i35, i37, j17, listA, ix8VarC, lValueOf2, boolValueOf2));
                    iN50 = i10;
                    iN15 = i9;
                    iN48 = i8;
                }
                cursorO.close();
                xlcVar2.n();
            } catch (Throwable th2) {
                th = th2;
                cursorO.close();
                xlcVar2.n();
                throw th;
            }
        } else {
            xlc xlcVarA2 = xlc.a(5, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC, time_local ASC LIMIT ?");
            xlcVarA2.j(1, j);
            xlcVarA2.j(2, j2);
            ey8.m(xlcVarA2, 3, j3, this);
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
                iN14 = tfg.n(cursorO2, "media_type");
                xlcVar = xlcVarA2;
            } catch (Throwable th3) {
                th = th3;
                xlcVar = xlcVarA2;
            }
            try {
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
                int i42 = iN14;
                arrayList = new ArrayList(cursorO2.getCount());
                while (cursorO2.moveToNext()) {
                    long j18 = cursorO2.getLong(iN);
                    long j19 = cursorO2.getLong(iN2);
                    long j20 = cursorO2.getLong(iN3);
                    long j21 = cursorO2.getLong(iN4);
                    long j22 = cursorO2.getLong(iN5);
                    long j23 = cursorO2.getLong(iN6);
                    String string7 = cursorO2.isNull(iN7) ? null : cursorO2.getString(iN7);
                    int i43 = cursorO2.getInt(iN8);
                    a().getClass();
                    iu8.b.getClass();
                    iu8 iu8VarN2 = oz7.n(i43);
                    int i44 = cursorO2.getInt(iN9);
                    a().getClass();
                    vx8 vx8VarB2 = v89.b(i44);
                    long j24 = cursorO2.getLong(iN10);
                    String string8 = cursorO2.isNull(iN11) ? null : cursorO2.getString(iN11);
                    String string9 = cursorO2.isNull(iN12) ? null : cursorO2.getString(iN12);
                    byte[] blob5 = cursorO2.isNull(iN13) ? null : cursorO2.getBlob(iN13);
                    a().getClass();
                    k8g k8gVarB2 = iz7.b(blob5);
                    int i45 = i42;
                    int i46 = cursorO2.getInt(i45);
                    int i47 = iN11;
                    int i48 = iN51;
                    iN51 = i48;
                    boolean z4 = cursorO2.getInt(i48) != 0;
                    int i49 = iN52;
                    int i50 = cursorO2.getInt(i49);
                    iN52 = i49;
                    int i51 = iN53;
                    long j25 = cursorO2.getLong(i51);
                    iN53 = i51;
                    int i52 = iN54;
                    iN54 = i52;
                    boolean z5 = cursorO2.getInt(i52) != 0;
                    int i53 = iN55;
                    long j26 = cursorO2.getLong(i53);
                    iN55 = i53;
                    int i54 = iN56;
                    if (cursorO2.isNull(i54)) {
                        iN56 = i54;
                        i = iN57;
                        str = null;
                    } else {
                        String string10 = cursorO2.getString(i54);
                        iN56 = i54;
                        i = iN57;
                        str = string10;
                    }
                    if (cursorO2.isNull(i)) {
                        iN57 = i;
                        i2 = iN58;
                        string = null;
                    } else {
                        string = cursorO2.getString(i);
                        iN57 = i;
                        i2 = iN58;
                    }
                    long j27 = cursorO2.getLong(i2);
                    iN58 = i2;
                    int i55 = iN59;
                    long j28 = cursorO2.getLong(i55);
                    iN59 = i55;
                    int i56 = iN60;
                    int i57 = cursorO2.getInt(i56);
                    a().getClass();
                    int iA2 = ey8.a(i57);
                    iN60 = i56;
                    int i58 = iN61;
                    long j29 = cursorO2.getLong(i58);
                    iN61 = i58;
                    int i59 = iN62;
                    int i60 = cursorO2.getInt(i59);
                    iN62 = i59;
                    int i61 = iN63;
                    int i62 = cursorO2.getInt(i61);
                    iN63 = i61;
                    int i63 = iN64;
                    int i64 = cursorO2.getInt(i63);
                    iN64 = i63;
                    int i65 = iN65;
                    long j30 = cursorO2.getLong(i65);
                    iN65 = i65;
                    int i66 = iN66;
                    int i67 = cursorO2.getInt(i66);
                    iN66 = i66;
                    int i68 = iN67;
                    int i69 = cursorO2.getInt(i68);
                    iN67 = i68;
                    int i70 = iN68;
                    long j31 = cursorO2.getLong(i70);
                    iN68 = i70;
                    int i71 = iN69;
                    byte[] blob6 = cursorO2.isNull(i71) ? null : cursorO2.getBlob(i71);
                    a().getClass();
                    List listA2 = v89.a(blob6);
                    iN69 = i71;
                    int i72 = iN70;
                    if (cursorO2.isNull(i72)) {
                        i3 = i72;
                        i4 = iN13;
                        blob = null;
                    } else {
                        i3 = i72;
                        blob = cursorO2.getBlob(i72);
                        i4 = iN13;
                    }
                    ix8 ix8VarC2 = a().c(blob);
                    int i73 = iN71;
                    if (cursorO2.isNull(i73)) {
                        i5 = iN72;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(cursorO2.getLong(i73));
                        i5 = iN72;
                    }
                    Integer numValueOf2 = cursorO2.isNull(i5) ? null : Integer.valueOf(cursorO2.getInt(i5));
                    if (numValueOf2 == null) {
                        iN71 = i73;
                        boolValueOf = null;
                    } else {
                        iN71 = i73;
                        boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    arrayList.add(new ru8(j18, j19, j20, j21, j22, j23, string7, iu8VarN2, vx8VarB2, j24, string8, string9, k8gVarB2, i46, z4, i50, j25, z5, j26, str, string, j27, j28, iA2, j29, i60, i62, i64, j30, i67, i69, j31, listA2, ix8VarC2, lValueOf, boolValueOf));
                    iN72 = i5;
                    iN13 = i4;
                    iN11 = i47;
                    iN70 = i3;
                    i42 = i45;
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
        return arrayList;
    }

    public final void e(long j) {
        ilc ilcVar = this.a;
        ilcVar.b();
        p19 p19Var = this.p;
        q36 q36VarF = p19Var.f();
        q36VarF.j(1, j);
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
            } finally {
                ilcVar.l();
            }
        } finally {
            p19Var.t(q36VarF);
        }
    }

    public final long f(ru8 ru8Var) {
        ilc ilcVar = this.a;
        ilcVar.b();
        ilcVar.c();
        try {
            long jD = this.b.D(ru8Var);
            ilcVar.r();
            return jD;
        } finally {
            ilcVar.l();
        }
    }

    public final ru8 h(long j, long j2) throws Throwable {
        xlc xlcVar;
        ru8 ru8Var;
        int i;
        boolean z;
        boolean z2;
        int i2;
        String string;
        int i3;
        String string2;
        int i4;
        Boolean boolValueOf;
        xlc xlcVarA = xlc.a(2, "SELECT * FROM messages WHERE chat_id = ? AND cid = ?");
        xlcVarA.j(1, j);
        xlcVarA.j(2, j2);
        ilc ilcVar = this.a;
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
            int iN14 = tfg.n(cursorO, "media_type");
            xlcVar = xlcVarA;
            try {
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
                if (cursorO.moveToFirst()) {
                    long j3 = cursorO.getLong(iN);
                    long j4 = cursorO.getLong(iN2);
                    long j5 = cursorO.getLong(iN3);
                    long j6 = cursorO.getLong(iN4);
                    long j7 = cursorO.getLong(iN5);
                    long j8 = cursorO.getLong(iN6);
                    String string3 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                    int i5 = cursorO.getInt(iN8);
                    a().getClass();
                    iu8.b.getClass();
                    iu8 iu8VarN = oz7.n(i5);
                    int i6 = cursorO.getInt(iN9);
                    a().getClass();
                    vx8 vx8VarB = v89.b(i6);
                    long j9 = cursorO.getLong(iN10);
                    String string4 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                    String string5 = cursorO.isNull(iN12) ? null : cursorO.getString(iN12);
                    byte[] blob = cursorO.isNull(iN13) ? null : cursorO.getBlob(iN13);
                    a().getClass();
                    k8g k8gVarB = iz7.b(blob);
                    int i7 = cursorO.getInt(iN14);
                    if (cursorO.getInt(iN15) != 0) {
                        i = iN16;
                        z = true;
                    } else {
                        i = iN16;
                        z = false;
                    }
                    int i8 = cursorO.getInt(i);
                    long j10 = cursorO.getLong(iN17);
                    if (cursorO.getInt(iN18) != 0) {
                        i2 = iN19;
                        z2 = true;
                    } else {
                        z2 = false;
                        i2 = iN19;
                    }
                    long j11 = cursorO.getLong(i2);
                    if (cursorO.isNull(iN20)) {
                        i3 = iN21;
                        string = null;
                    } else {
                        string = cursorO.getString(iN20);
                        i3 = iN21;
                    }
                    if (cursorO.isNull(i3)) {
                        i4 = iN22;
                        string2 = null;
                    } else {
                        string2 = cursorO.getString(i3);
                        i4 = iN22;
                    }
                    long j12 = cursorO.getLong(i4);
                    long j13 = cursorO.getLong(iN23);
                    int i9 = cursorO.getInt(iN24);
                    a().getClass();
                    int iA = ey8.a(i9);
                    long j14 = cursorO.getLong(iN25);
                    int i10 = cursorO.getInt(iN26);
                    int i11 = cursorO.getInt(iN27);
                    int i12 = cursorO.getInt(iN28);
                    long j15 = cursorO.getLong(iN29);
                    int i13 = cursorO.getInt(iN30);
                    int i14 = cursorO.getInt(iN31);
                    long j16 = cursorO.getLong(iN32);
                    byte[] blob2 = cursorO.isNull(iN33) ? null : cursorO.getBlob(iN33);
                    a().getClass();
                    List listA = v89.a(blob2);
                    ix8 ix8VarC = a().c(cursorO.isNull(iN34) ? null : cursorO.getBlob(iN34));
                    Long lValueOf = cursorO.isNull(iN35) ? null : Long.valueOf(cursorO.getLong(iN35));
                    Integer numValueOf = cursorO.isNull(iN36) ? null : Integer.valueOf(cursorO.getInt(iN36));
                    if (numValueOf == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    ru8Var = new ru8(j3, j4, j5, j6, j7, j8, string3, iu8VarN, vx8VarB, j9, string4, string5, k8gVarB, i7, z, i8, j10, z2, j11, string, string2, j12, j13, iA, j14, i10, i11, i12, j15, i13, i14, j16, listA, ix8VarC, lValueOf, boolValueOf);
                } else {
                    ru8Var = null;
                }
                cursorO.close();
                xlcVar.n();
                return ru8Var;
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

    public final Long i(long j, long j2) {
        xlc xlcVarA = xlc.a(2, "SELECT id FROM messages WHERE chat_id = ? AND server_id = ?");
        xlcVarA.j(1, j);
        xlcVarA.j(2, j2);
        ilc ilcVar = this.a;
        ilcVar.b();
        Long lValueOf = null;
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            if (cursorO.moveToFirst() && !cursorO.isNull(0)) {
                lValueOf = Long.valueOf(cursorO.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public final long k(long j) {
        xlc xlcVarA = xlc.a(1, "SELECT time FROM messages WHERE id = ?");
        xlcVarA.j(1, j);
        ilc ilcVar = this.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            return cursorO.moveToFirst() ? cursorO.getLong(0) : 0L;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public final int l(yw8 yw8Var) {
        ilc ilcVar = this.a;
        ilcVar.b();
        ilcVar.c();
        try {
            int iB = this.d.B(yw8Var);
            ilcVar.r();
            return iB;
        } finally {
            ilcVar.l();
        }
    }

    public final int m(b6f b6fVar) {
        ilc ilcVar = this.a;
        ilcVar.b();
        ilcVar.c();
        try {
            int iB = this.e.B(b6fVar);
            ilcVar.r();
            return iB;
        } finally {
            ilcVar.l();
        }
    }

    public final void n(long j, iu8 iu8Var) {
        ilc ilcVar = this.a;
        ilcVar.b();
        p19 p19Var = this.h;
        q36 q36VarF = p19Var.f();
        a().getClass();
        q36VarF.j(1, iu8Var.a);
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
            p19Var.t(q36VarF);
        }
    }

    public final void o(long j, List list, vx8 vx8Var) {
        ilc ilcVar = this.a;
        ilcVar.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE messages SET status = ? WHERE chat_id = ? AND id in (");
        a14.c(sb, list.size());
        sb.append(")");
        q36 q36VarD = ilcVar.d(sb.toString());
        a().getClass();
        q36VarD.j(1, vx8Var.a);
        q36VarD.j(2, j);
        Iterator it = list.iterator();
        int i = 3;
        while (it.hasNext()) {
            Long l = (Long) it.next();
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
}
