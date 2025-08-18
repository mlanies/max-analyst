package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final class f8a implements sk6 {
    public final long b;
    public final ol6 c;
    public final je7 d;
    public final je7 e;
    public boolean f;
    public final ye4 g = new ye4(10);

    public f8a(je7 je7Var, je7 je7Var2, long j, ol6 ol6Var) {
        this.b = j;
        this.c = ol6Var;
        this.d = je7Var;
        this.e = je7Var2;
    }

    @Override // defpackage.sk6
    public final boolean a() {
        return false;
    }

    @Override // defpackage.sk6
    public final void b() {
        this.f = true;
    }

    @Override // defpackage.sk6
    public final Comparator c() {
        return new ye4(11);
    }

    @Override // defpackage.sk6
    public final i13 d(long j) {
        return fm9.x(j, i());
    }

    @Override // defpackage.sk6
    public final Comparator e() {
        return this.g;
    }

    @Override // defpackage.sk6
    public final i13 f(long j) {
        return fm9.w(j, i());
    }

    @Override // defpackage.sk6
    public final long g() throws Throwable {
        xlc xlcVar;
        ng4 ng4Var;
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
        if (!this.f) {
            return 0L;
        }
        vlc vlcVar = ((r79) this.e.getValue()).a;
        t19 t19VarD = vlcVar.d();
        t19VarD.getClass();
        xlc xlcVarA = xlc.a(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
        ey8.m(xlcVarA, 1, this.b, t19VarD);
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
                    long j = cursorO.getLong(iN);
                    long j2 = cursorO.getLong(iN2);
                    long j3 = cursorO.getLong(iN3);
                    long j4 = cursorO.getLong(iN4);
                    long j5 = cursorO.getLong(iN5);
                    long j6 = cursorO.getLong(iN6);
                    String string4 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                    int i10 = cursorO.getInt(iN8);
                    t19VarD.a().getClass();
                    iu8.b.getClass();
                    iu8 iu8VarN = oz7.n(i10);
                    int i11 = cursorO.getInt(iN9);
                    t19VarD.a().getClass();
                    vx8 vx8VarB = v89.b(i11);
                    long j7 = cursorO.getLong(iN10);
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
                    int i12 = iN12;
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
                    long j8 = cursorO.getLong(i17);
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
                    long j9 = cursorO.getLong(i3);
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
                    long j10 = cursorO.getLong(i5);
                    iN22 = i5;
                    int i20 = iN23;
                    long j11 = cursorO.getLong(i20);
                    iN23 = i20;
                    int i21 = iN24;
                    int i22 = cursorO.getInt(i21);
                    t19VarD.a().getClass();
                    int iA = ey8.a(i22);
                    iN24 = i21;
                    int i23 = iN25;
                    long j12 = cursorO.getLong(i23);
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
                    long j13 = cursorO.getLong(i30);
                    iN29 = i30;
                    int i31 = iN30;
                    int i32 = cursorO.getInt(i31);
                    iN30 = i31;
                    int i33 = iN31;
                    int i34 = cursorO.getInt(i33);
                    iN31 = i33;
                    int i35 = iN32;
                    long j14 = cursorO.getLong(i35);
                    iN32 = i35;
                    int i36 = iN33;
                    byte[] blob3 = cursorO.isNull(i36) ? null : cursorO.getBlob(i36);
                    t19VarD.a().getClass();
                    List listA = v89.a(blob3);
                    iN33 = i36;
                    int i37 = iN34;
                    if (cursorO.isNull(i37)) {
                        i6 = i37;
                        i7 = i;
                        blob = null;
                    } else {
                        i6 = i37;
                        blob = cursorO.getBlob(i37);
                        i7 = i;
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
                    arrayList.add(new ru8(j, j2, j3, j4, j5, j6, string4, iu8VarN, vx8VarB, j7, string5, string, k8gVarB, i14, z, i16, j8, z2, j9, string2, string3, j10, j11, iA, j12, i25, i27, i29, j13, i32, i34, j14, listA, ix8VarC, lValueOf, boolValueOf));
                    iN36 = i8;
                    iN12 = i12;
                    i9 = i7;
                    iN34 = i6;
                }
                cursorO.close();
                xlcVar.n();
                ru8 ru8Var = (ru8) x53.i0(arrayList);
                cu8 cu8VarB = ru8Var != null ? vlcVar.b(ru8Var) : null;
                if (cu8VarB == null || (ng4Var = cu8VarB.T0) == null || !this.c.n(ng4Var.a)) {
                    return 0L;
                }
                return cu8VarB.b;
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

    @Override // defpackage.sk6
    public final long h() {
        ng4 ng4Var;
        vlc vlcVar = ((r79) this.e.getValue()).a;
        ru8 ru8Var = (ru8) x53.i0(t19.j(vlcVar.d(), this.b));
        cu8 cu8VarB = ru8Var != null ? vlcVar.b(ru8Var) : null;
        if (cu8VarB == null || (ng4Var = cu8VarB.T0) == null || !this.c.n(ng4Var.a)) {
            return 0L;
        }
        return cu8VarB.b;
    }

    @Override // defpackage.sk6
    public final List i() {
        return ((e52) j47.f0(hz4.a, new e8a(this, null))).b.n.d(mg4.DELAYED);
    }
}
