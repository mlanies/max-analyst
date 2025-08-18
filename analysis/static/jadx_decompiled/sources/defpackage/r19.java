package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class r19 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xlc b;
    public final /* synthetic */ t19 c;

    public /* synthetic */ r19(t19 t19Var, xlc xlcVar, int i) {
        this.a = i;
        this.c = t19Var;
        this.b = xlcVar;
    }

    private final Object a() throws Throwable {
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
        t19 t19Var = this.c;
        ilc ilcVar = t19Var.a;
        xlc xlcVar2 = this.b;
        Cursor cursorO = ilcVar.o(xlcVar2, null);
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
            xlcVar = xlcVar2;
        } catch (Throwable th) {
            th = th;
            xlcVar = xlcVar2;
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
            int i8 = iN13;
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                long j = cursorO.getLong(iN);
                long j2 = cursorO.getLong(iN2);
                long j3 = cursorO.getLong(iN3);
                long j4 = cursorO.getLong(iN4);
                long j5 = cursorO.getLong(iN5);
                long j6 = cursorO.getLong(iN6);
                String string4 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                int i9 = cursorO.getInt(iN8);
                t19Var.a().getClass();
                iu8.b.getClass();
                iu8 iu8VarN = oz7.n(i9);
                int i10 = cursorO.getInt(iN9);
                t19Var.a().getClass();
                vx8 vx8VarB = v89.b(i10);
                long j7 = cursorO.getLong(iN10);
                String string5 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                if (cursorO.isNull(iN12)) {
                    i = i8;
                    string = null;
                } else {
                    string = cursorO.getString(iN12);
                    i = i8;
                }
                byte[] blob2 = cursorO.isNull(i) ? null : cursorO.getBlob(i);
                t19Var.a().getClass();
                k8g k8gVarB = iz7.b(blob2);
                i8 = i;
                int i11 = iN14;
                int i12 = cursorO.getInt(i11);
                iN14 = i11;
                int i13 = iN15;
                boolean z2 = cursorO.getInt(i13) != 0;
                int i14 = iN16;
                int i15 = cursorO.getInt(i14);
                int i16 = iN17;
                long j8 = cursorO.getLong(i16);
                iN17 = i16;
                int i17 = iN18;
                if (cursorO.getInt(i17) != 0) {
                    iN18 = i17;
                    i2 = iN19;
                    z = true;
                } else {
                    iN18 = i17;
                    i2 = iN19;
                    z = false;
                }
                long j9 = cursorO.getLong(i2);
                iN19 = i2;
                int i18 = iN20;
                if (cursorO.isNull(i18)) {
                    iN20 = i18;
                    i3 = iN21;
                    string2 = null;
                } else {
                    string2 = cursorO.getString(i18);
                    iN20 = i18;
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
                long j10 = cursorO.getLong(i4);
                iN22 = i4;
                int i19 = iN23;
                long j11 = cursorO.getLong(i19);
                iN23 = i19;
                int i20 = iN24;
                int i21 = cursorO.getInt(i20);
                t19Var.a().getClass();
                int iA = ey8.a(i21);
                iN24 = i20;
                int i22 = iN25;
                long j12 = cursorO.getLong(i22);
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
                long j13 = cursorO.getLong(i29);
                iN29 = i29;
                int i30 = iN30;
                int i31 = cursorO.getInt(i30);
                iN30 = i30;
                int i32 = iN31;
                int i33 = cursorO.getInt(i32);
                iN31 = i32;
                int i34 = iN32;
                long j14 = cursorO.getLong(i34);
                iN32 = i34;
                int i35 = iN33;
                byte[] blob3 = cursorO.isNull(i35) ? null : cursorO.getBlob(i35);
                t19Var.a().getClass();
                List listA = v89.a(blob3);
                iN33 = i35;
                int i36 = iN34;
                if (cursorO.isNull(i36)) {
                    i5 = i36;
                    i6 = iN;
                    blob = null;
                } else {
                    i5 = i36;
                    blob = cursorO.getBlob(i36);
                    i6 = iN;
                }
                ix8 ix8VarC = t19Var.a().c(blob);
                int i37 = iN35;
                if (cursorO.isNull(i37)) {
                    i7 = iN36;
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(cursorO.getLong(i37));
                    i7 = iN36;
                }
                Integer numValueOf = cursorO.isNull(i7) ? null : Integer.valueOf(cursorO.getInt(i7));
                if (numValueOf == null) {
                    iN35 = i37;
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    iN35 = i37;
                }
                arrayList.add(new ru8(j, j2, j3, j4, j5, j6, string4, iu8VarN, vx8VarB, j7, string5, string, k8gVarB, i12, z2, i15, j8, z, j9, string2, string3, j10, j11, iA, j12, i24, i26, i28, j13, i31, i33, j14, listA, ix8VarC, lValueOf, boolValueOf));
                iN36 = i7;
                iN15 = i13;
                iN = i6;
                iN16 = i14;
                iN34 = i5;
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

    private final Object b() throws Throwable {
        xlc xlcVar;
        ru8 ru8Var;
        String string;
        int i;
        String string2;
        int i2;
        Boolean boolValueOf;
        t19 t19Var = this.c;
        ilc ilcVar = t19Var.a;
        xlc xlcVar2 = this.b;
        Cursor cursorO = ilcVar.o(xlcVar2, null);
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
            xlcVar = xlcVar2;
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
                if (cursorO.moveToFirst()) {
                    long j = cursorO.getLong(iN);
                    long j2 = cursorO.getLong(iN2);
                    long j3 = cursorO.getLong(iN3);
                    long j4 = cursorO.getLong(iN4);
                    long j5 = cursorO.getLong(iN5);
                    long j6 = cursorO.getLong(iN6);
                    String string3 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                    int i3 = cursorO.getInt(iN8);
                    t19Var.a().getClass();
                    iu8.b.getClass();
                    iu8 iu8VarN = oz7.n(i3);
                    int i4 = cursorO.getInt(iN9);
                    t19Var.a().getClass();
                    vx8 vx8VarB = v89.b(i4);
                    long j7 = cursorO.getLong(iN10);
                    String string4 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                    String string5 = cursorO.isNull(iN12) ? null : cursorO.getString(iN12);
                    byte[] blob = cursorO.isNull(iN13) ? null : cursorO.getBlob(iN13);
                    t19Var.a().getClass();
                    k8g k8gVarB = iz7.b(blob);
                    int i5 = cursorO.getInt(iN14);
                    boolean z = cursorO.getInt(iN15) != 0;
                    int i6 = cursorO.getInt(iN16);
                    long j8 = cursorO.getLong(iN17);
                    boolean z2 = cursorO.getInt(iN18) != 0;
                    long j9 = cursorO.getLong(iN19);
                    if (cursorO.isNull(iN20)) {
                        i = iN21;
                        string = null;
                    } else {
                        string = cursorO.getString(iN20);
                        i = iN21;
                    }
                    if (cursorO.isNull(i)) {
                        i2 = iN22;
                        string2 = null;
                    } else {
                        string2 = cursorO.getString(i);
                        i2 = iN22;
                    }
                    long j10 = cursorO.getLong(i2);
                    long j11 = cursorO.getLong(iN23);
                    int i7 = cursorO.getInt(iN24);
                    t19Var.a().getClass();
                    int iA = ey8.a(i7);
                    long j12 = cursorO.getLong(iN25);
                    int i8 = cursorO.getInt(iN26);
                    int i9 = cursorO.getInt(iN27);
                    int i10 = cursorO.getInt(iN28);
                    long j13 = cursorO.getLong(iN29);
                    int i11 = cursorO.getInt(iN30);
                    int i12 = cursorO.getInt(iN31);
                    long j14 = cursorO.getLong(iN32);
                    byte[] blob2 = cursorO.isNull(iN33) ? null : cursorO.getBlob(iN33);
                    t19Var.a().getClass();
                    List listA = v89.a(blob2);
                    ix8 ix8VarC = t19Var.a().c(cursorO.isNull(iN34) ? null : cursorO.getBlob(iN34));
                    Long lValueOf = cursorO.isNull(iN35) ? null : Long.valueOf(cursorO.getLong(iN35));
                    Integer numValueOf = cursorO.isNull(iN36) ? null : Integer.valueOf(cursorO.getInt(iN36));
                    if (numValueOf == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    ru8Var = new ru8(j, j2, j3, j4, j5, j6, string3, iu8VarN, vx8VarB, j7, string4, string5, k8gVarB, i5, z, i6, j8, z2, j9, string, string2, j10, j11, iA, j12, i8, i9, i10, j13, i11, i12, j14, listA, ix8VarC, lValueOf, boolValueOf);
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
            xlcVar = xlcVar2;
        }
    }

    private final Object c() throws Throwable {
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
        t19 t19Var = this.c;
        ilc ilcVar = t19Var.a;
        xlc xlcVar2 = this.b;
        Cursor cursorO = ilcVar.o(xlcVar2, null);
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
            xlcVar = xlcVar2;
        } catch (Throwable th) {
            th = th;
            xlcVar = xlcVar2;
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
            int i8 = iN13;
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                long j = cursorO.getLong(iN);
                long j2 = cursorO.getLong(iN2);
                long j3 = cursorO.getLong(iN3);
                long j4 = cursorO.getLong(iN4);
                long j5 = cursorO.getLong(iN5);
                long j6 = cursorO.getLong(iN6);
                String string4 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                int i9 = cursorO.getInt(iN8);
                t19Var.a().getClass();
                iu8.b.getClass();
                iu8 iu8VarN = oz7.n(i9);
                int i10 = cursorO.getInt(iN9);
                t19Var.a().getClass();
                vx8 vx8VarB = v89.b(i10);
                long j7 = cursorO.getLong(iN10);
                String string5 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                if (cursorO.isNull(iN12)) {
                    i = i8;
                    string = null;
                } else {
                    string = cursorO.getString(iN12);
                    i = i8;
                }
                byte[] blob2 = cursorO.isNull(i) ? null : cursorO.getBlob(i);
                t19Var.a().getClass();
                k8g k8gVarB = iz7.b(blob2);
                i8 = i;
                int i11 = iN14;
                int i12 = cursorO.getInt(i11);
                iN14 = i11;
                int i13 = iN15;
                boolean z2 = cursorO.getInt(i13) != 0;
                int i14 = iN16;
                int i15 = cursorO.getInt(i14);
                int i16 = iN17;
                long j8 = cursorO.getLong(i16);
                iN17 = i16;
                int i17 = iN18;
                if (cursorO.getInt(i17) != 0) {
                    iN18 = i17;
                    i2 = iN19;
                    z = true;
                } else {
                    iN18 = i17;
                    i2 = iN19;
                    z = false;
                }
                long j9 = cursorO.getLong(i2);
                iN19 = i2;
                int i18 = iN20;
                if (cursorO.isNull(i18)) {
                    iN20 = i18;
                    i3 = iN21;
                    string2 = null;
                } else {
                    string2 = cursorO.getString(i18);
                    iN20 = i18;
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
                long j10 = cursorO.getLong(i4);
                iN22 = i4;
                int i19 = iN23;
                long j11 = cursorO.getLong(i19);
                iN23 = i19;
                int i20 = iN24;
                int i21 = cursorO.getInt(i20);
                t19Var.a().getClass();
                int iA = ey8.a(i21);
                iN24 = i20;
                int i22 = iN25;
                long j12 = cursorO.getLong(i22);
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
                long j13 = cursorO.getLong(i29);
                iN29 = i29;
                int i30 = iN30;
                int i31 = cursorO.getInt(i30);
                iN30 = i30;
                int i32 = iN31;
                int i33 = cursorO.getInt(i32);
                iN31 = i32;
                int i34 = iN32;
                long j14 = cursorO.getLong(i34);
                iN32 = i34;
                int i35 = iN33;
                byte[] blob3 = cursorO.isNull(i35) ? null : cursorO.getBlob(i35);
                t19Var.a().getClass();
                List listA = v89.a(blob3);
                iN33 = i35;
                int i36 = iN34;
                if (cursorO.isNull(i36)) {
                    i5 = i36;
                    i6 = iN;
                    blob = null;
                } else {
                    i5 = i36;
                    blob = cursorO.getBlob(i36);
                    i6 = iN;
                }
                ix8 ix8VarC = t19Var.a().c(blob);
                int i37 = iN35;
                if (cursorO.isNull(i37)) {
                    i7 = iN36;
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(cursorO.getLong(i37));
                    i7 = iN36;
                }
                Integer numValueOf = cursorO.isNull(i7) ? null : Integer.valueOf(cursorO.getInt(i7));
                if (numValueOf == null) {
                    iN35 = i37;
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    iN35 = i37;
                }
                arrayList.add(new ru8(j, j2, j3, j4, j5, j6, string4, iu8VarN, vx8VarB, j7, string5, string, k8gVarB, i12, z2, i15, j8, z, j9, string2, string3, j10, j11, iA, j12, i24, i26, i28, j13, i31, i33, j14, listA, ix8VarC, lValueOf, boolValueOf));
                iN36 = i7;
                iN15 = i13;
                iN = i6;
                iN16 = i14;
                iN34 = i5;
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

    private final Object d() throws Throwable {
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
        t19 t19Var = this.c;
        ilc ilcVar = t19Var.a;
        xlc xlcVar2 = this.b;
        Cursor cursorO = ilcVar.o(xlcVar2, null);
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
            xlcVar = xlcVar2;
        } catch (Throwable th) {
            th = th;
            xlcVar = xlcVar2;
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
            int i8 = iN13;
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                long j = cursorO.getLong(iN);
                long j2 = cursorO.getLong(iN2);
                long j3 = cursorO.getLong(iN3);
                long j4 = cursorO.getLong(iN4);
                long j5 = cursorO.getLong(iN5);
                long j6 = cursorO.getLong(iN6);
                String string4 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                int i9 = cursorO.getInt(iN8);
                t19Var.a().getClass();
                iu8.b.getClass();
                iu8 iu8VarN = oz7.n(i9);
                int i10 = cursorO.getInt(iN9);
                t19Var.a().getClass();
                vx8 vx8VarB = v89.b(i10);
                long j7 = cursorO.getLong(iN10);
                String string5 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                if (cursorO.isNull(iN12)) {
                    i = i8;
                    string = null;
                } else {
                    string = cursorO.getString(iN12);
                    i = i8;
                }
                byte[] blob2 = cursorO.isNull(i) ? null : cursorO.getBlob(i);
                t19Var.a().getClass();
                k8g k8gVarB = iz7.b(blob2);
                i8 = i;
                int i11 = iN14;
                int i12 = cursorO.getInt(i11);
                iN14 = i11;
                int i13 = iN15;
                boolean z2 = cursorO.getInt(i13) != 0;
                int i14 = iN16;
                int i15 = cursorO.getInt(i14);
                int i16 = iN17;
                long j8 = cursorO.getLong(i16);
                iN17 = i16;
                int i17 = iN18;
                if (cursorO.getInt(i17) != 0) {
                    iN18 = i17;
                    i2 = iN19;
                    z = true;
                } else {
                    iN18 = i17;
                    i2 = iN19;
                    z = false;
                }
                long j9 = cursorO.getLong(i2);
                iN19 = i2;
                int i18 = iN20;
                if (cursorO.isNull(i18)) {
                    iN20 = i18;
                    i3 = iN21;
                    string2 = null;
                } else {
                    string2 = cursorO.getString(i18);
                    iN20 = i18;
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
                long j10 = cursorO.getLong(i4);
                iN22 = i4;
                int i19 = iN23;
                long j11 = cursorO.getLong(i19);
                iN23 = i19;
                int i20 = iN24;
                int i21 = cursorO.getInt(i20);
                t19Var.a().getClass();
                int iA = ey8.a(i21);
                iN24 = i20;
                int i22 = iN25;
                long j12 = cursorO.getLong(i22);
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
                long j13 = cursorO.getLong(i29);
                iN29 = i29;
                int i30 = iN30;
                int i31 = cursorO.getInt(i30);
                iN30 = i30;
                int i32 = iN31;
                int i33 = cursorO.getInt(i32);
                iN31 = i32;
                int i34 = iN32;
                long j14 = cursorO.getLong(i34);
                iN32 = i34;
                int i35 = iN33;
                byte[] blob3 = cursorO.isNull(i35) ? null : cursorO.getBlob(i35);
                t19Var.a().getClass();
                List listA = v89.a(blob3);
                iN33 = i35;
                int i36 = iN34;
                if (cursorO.isNull(i36)) {
                    i5 = i36;
                    i6 = iN;
                    blob = null;
                } else {
                    i5 = i36;
                    blob = cursorO.getBlob(i36);
                    i6 = iN;
                }
                ix8 ix8VarC = t19Var.a().c(blob);
                int i37 = iN35;
                if (cursorO.isNull(i37)) {
                    i7 = iN36;
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(cursorO.getLong(i37));
                    i7 = iN36;
                }
                Integer numValueOf = cursorO.isNull(i7) ? null : Integer.valueOf(cursorO.getInt(i7));
                if (numValueOf == null) {
                    iN35 = i37;
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    iN35 = i37;
                }
                arrayList.add(new ru8(j, j2, j3, j4, j5, j6, string4, iu8VarN, vx8VarB, j7, string5, string, k8gVarB, i12, z2, i15, j8, z, j9, string2, string3, j10, j11, iA, j12, i24, i26, i28, j13, i31, i33, j14, listA, ix8VarC, lValueOf, boolValueOf));
                iN36 = i7;
                iN15 = i13;
                iN = i6;
                iN16 = i14;
                iN34 = i5;
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

    private final Object e() throws Throwable {
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
        t19 t19Var = this.c;
        ilc ilcVar = t19Var.a;
        xlc xlcVar2 = this.b;
        Cursor cursorO = ilcVar.o(xlcVar2, null);
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
            xlcVar = xlcVar2;
        } catch (Throwable th) {
            th = th;
            xlcVar = xlcVar2;
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
            int i8 = iN13;
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                long j = cursorO.getLong(iN);
                long j2 = cursorO.getLong(iN2);
                long j3 = cursorO.getLong(iN3);
                long j4 = cursorO.getLong(iN4);
                long j5 = cursorO.getLong(iN5);
                long j6 = cursorO.getLong(iN6);
                String string4 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                int i9 = cursorO.getInt(iN8);
                t19Var.a().getClass();
                iu8.b.getClass();
                iu8 iu8VarN = oz7.n(i9);
                int i10 = cursorO.getInt(iN9);
                t19Var.a().getClass();
                vx8 vx8VarB = v89.b(i10);
                long j7 = cursorO.getLong(iN10);
                String string5 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                if (cursorO.isNull(iN12)) {
                    i = i8;
                    string = null;
                } else {
                    string = cursorO.getString(iN12);
                    i = i8;
                }
                byte[] blob2 = cursorO.isNull(i) ? null : cursorO.getBlob(i);
                t19Var.a().getClass();
                k8g k8gVarB = iz7.b(blob2);
                i8 = i;
                int i11 = iN14;
                int i12 = cursorO.getInt(i11);
                iN14 = i11;
                int i13 = iN15;
                boolean z2 = cursorO.getInt(i13) != 0;
                int i14 = iN16;
                int i15 = cursorO.getInt(i14);
                int i16 = iN17;
                long j8 = cursorO.getLong(i16);
                iN17 = i16;
                int i17 = iN18;
                if (cursorO.getInt(i17) != 0) {
                    iN18 = i17;
                    i2 = iN19;
                    z = true;
                } else {
                    iN18 = i17;
                    i2 = iN19;
                    z = false;
                }
                long j9 = cursorO.getLong(i2);
                iN19 = i2;
                int i18 = iN20;
                if (cursorO.isNull(i18)) {
                    iN20 = i18;
                    i3 = iN21;
                    string2 = null;
                } else {
                    string2 = cursorO.getString(i18);
                    iN20 = i18;
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
                long j10 = cursorO.getLong(i4);
                iN22 = i4;
                int i19 = iN23;
                long j11 = cursorO.getLong(i19);
                iN23 = i19;
                int i20 = iN24;
                int i21 = cursorO.getInt(i20);
                t19Var.a().getClass();
                int iA = ey8.a(i21);
                iN24 = i20;
                int i22 = iN25;
                long j12 = cursorO.getLong(i22);
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
                long j13 = cursorO.getLong(i29);
                iN29 = i29;
                int i30 = iN30;
                int i31 = cursorO.getInt(i30);
                iN30 = i30;
                int i32 = iN31;
                int i33 = cursorO.getInt(i32);
                iN31 = i32;
                int i34 = iN32;
                long j14 = cursorO.getLong(i34);
                iN32 = i34;
                int i35 = iN33;
                byte[] blob3 = cursorO.isNull(i35) ? null : cursorO.getBlob(i35);
                t19Var.a().getClass();
                List listA = v89.a(blob3);
                iN33 = i35;
                int i36 = iN34;
                if (cursorO.isNull(i36)) {
                    i5 = i36;
                    i6 = iN;
                    blob = null;
                } else {
                    i5 = i36;
                    blob = cursorO.getBlob(i36);
                    i6 = iN;
                }
                ix8 ix8VarC = t19Var.a().c(blob);
                int i37 = iN35;
                if (cursorO.isNull(i37)) {
                    i7 = iN36;
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(cursorO.getLong(i37));
                    i7 = iN36;
                }
                Integer numValueOf = cursorO.isNull(i7) ? null : Integer.valueOf(cursorO.getInt(i7));
                if (numValueOf == null) {
                    iN35 = i37;
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    iN35 = i37;
                }
                arrayList.add(new ru8(j, j2, j3, j4, j5, j6, string4, iu8VarN, vx8VarB, j7, string5, string, k8gVarB, i12, z2, i15, j8, z, j9, string2, string3, j10, j11, iA, j12, i24, i26, i28, j13, i31, i33, j14, listA, ix8VarC, lValueOf, boolValueOf));
                iN36 = i7;
                iN15 = i13;
                iN = i6;
                iN16 = i14;
                iN34 = i5;
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

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        xlc xlcVar;
        ru8 ru8Var;
        String string;
        int i;
        String string2;
        int i2;
        Boolean boolValueOf;
        xlc xlcVar2;
        String string3;
        int i3;
        int i4;
        boolean z;
        String string4;
        int i5;
        String string5;
        int i6;
        int i7;
        byte[] blob;
        int i8;
        Long lValueOf;
        int i9;
        Boolean boolValueOf2;
        switch (this.a) {
            case 0:
                t19 t19Var = this.c;
                ilc ilcVar = t19Var.a;
                xlc xlcVar3 = this.b;
                Cursor cursorO = ilcVar.o(xlcVar3, null);
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
                    xlcVar = xlcVar3;
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
                        if (cursorO.moveToFirst()) {
                            long j = cursorO.getLong(iN);
                            long j2 = cursorO.getLong(iN2);
                            long j3 = cursorO.getLong(iN3);
                            long j4 = cursorO.getLong(iN4);
                            long j5 = cursorO.getLong(iN5);
                            long j6 = cursorO.getLong(iN6);
                            String string6 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                            int i10 = cursorO.getInt(iN8);
                            t19Var.a().getClass();
                            iu8.b.getClass();
                            iu8 iu8VarN = oz7.n(i10);
                            int i11 = cursorO.getInt(iN9);
                            t19Var.a().getClass();
                            vx8 vx8VarB = v89.b(i11);
                            long j7 = cursorO.getLong(iN10);
                            String string7 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                            String string8 = cursorO.isNull(iN12) ? null : cursorO.getString(iN12);
                            byte[] blob2 = cursorO.isNull(iN13) ? null : cursorO.getBlob(iN13);
                            t19Var.a().getClass();
                            k8g k8gVarB = iz7.b(blob2);
                            int i12 = cursorO.getInt(iN14);
                            boolean z2 = cursorO.getInt(iN15) != 0;
                            int i13 = cursorO.getInt(iN16);
                            long j8 = cursorO.getLong(iN17);
                            boolean z3 = cursorO.getInt(iN18) != 0;
                            long j9 = cursorO.getLong(iN19);
                            if (cursorO.isNull(iN20)) {
                                i = iN21;
                                string = null;
                            } else {
                                string = cursorO.getString(iN20);
                                i = iN21;
                            }
                            if (cursorO.isNull(i)) {
                                i2 = iN22;
                                string2 = null;
                            } else {
                                string2 = cursorO.getString(i);
                                i2 = iN22;
                            }
                            long j10 = cursorO.getLong(i2);
                            long j11 = cursorO.getLong(iN23);
                            int i14 = cursorO.getInt(iN24);
                            t19Var.a().getClass();
                            int iA = ey8.a(i14);
                            long j12 = cursorO.getLong(iN25);
                            int i15 = cursorO.getInt(iN26);
                            int i16 = cursorO.getInt(iN27);
                            int i17 = cursorO.getInt(iN28);
                            long j13 = cursorO.getLong(iN29);
                            int i18 = cursorO.getInt(iN30);
                            int i19 = cursorO.getInt(iN31);
                            long j14 = cursorO.getLong(iN32);
                            byte[] blob3 = cursorO.isNull(iN33) ? null : cursorO.getBlob(iN33);
                            t19Var.a().getClass();
                            List listA = v89.a(blob3);
                            ix8 ix8VarC = t19Var.a().c(cursorO.isNull(iN34) ? null : cursorO.getBlob(iN34));
                            Long lValueOf2 = cursorO.isNull(iN35) ? null : Long.valueOf(cursorO.getLong(iN35));
                            Integer numValueOf = cursorO.isNull(iN36) ? null : Integer.valueOf(cursorO.getInt(iN36));
                            if (numValueOf == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                            }
                            ru8Var = new ru8(j, j2, j3, j4, j5, j6, string6, iu8VarN, vx8VarB, j7, string7, string8, k8gVarB, i12, z2, i13, j8, z3, j9, string, string2, j10, j11, iA, j12, i15, i16, i17, j13, i18, i19, j14, listA, ix8VarC, lValueOf2, boolValueOf);
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
                    xlcVar = xlcVar3;
                }
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return d();
            case 5:
                return e();
            default:
                t19 t19Var2 = this.c;
                ilc ilcVar2 = t19Var2.a;
                xlc xlcVar4 = this.b;
                Cursor cursorO2 = ilcVar2.o(xlcVar4, null);
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
                    xlcVar2 = xlcVar4;
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
                        int i20 = iN49;
                        ArrayList arrayList = new ArrayList(cursorO2.getCount());
                        while (cursorO2.moveToNext()) {
                            long j15 = cursorO2.getLong(iN37);
                            long j16 = cursorO2.getLong(iN38);
                            long j17 = cursorO2.getLong(iN39);
                            long j18 = cursorO2.getLong(iN40);
                            long j19 = cursorO2.getLong(iN41);
                            long j20 = cursorO2.getLong(iN42);
                            String string9 = cursorO2.isNull(iN43) ? null : cursorO2.getString(iN43);
                            int i21 = cursorO2.getInt(iN44);
                            t19Var2.a().getClass();
                            iu8.b.getClass();
                            iu8 iu8VarN2 = oz7.n(i21);
                            int i22 = cursorO2.getInt(iN45);
                            t19Var2.a().getClass();
                            vx8 vx8VarB2 = v89.b(i22);
                            long j21 = cursorO2.getLong(iN46);
                            String string10 = cursorO2.isNull(iN47) ? null : cursorO2.getString(iN47);
                            if (cursorO2.isNull(iN48)) {
                                i3 = i20;
                                string3 = null;
                            } else {
                                string3 = cursorO2.getString(iN48);
                                i3 = i20;
                            }
                            byte[] blob4 = cursorO2.isNull(i3) ? null : cursorO2.getBlob(i3);
                            t19Var2.a().getClass();
                            k8g k8gVarB2 = iz7.b(blob4);
                            i20 = i3;
                            int i23 = iN50;
                            int i24 = cursorO2.getInt(i23);
                            iN50 = i23;
                            int i25 = iN51;
                            boolean z4 = cursorO2.getInt(i25) != 0;
                            int i26 = iN52;
                            int i27 = cursorO2.getInt(i26);
                            int i28 = iN53;
                            long j22 = cursorO2.getLong(i28);
                            iN53 = i28;
                            int i29 = iN54;
                            if (cursorO2.getInt(i29) != 0) {
                                iN54 = i29;
                                i4 = iN55;
                                z = true;
                            } else {
                                iN54 = i29;
                                i4 = iN55;
                                z = false;
                            }
                            long j23 = cursorO2.getLong(i4);
                            iN55 = i4;
                            int i30 = iN56;
                            if (cursorO2.isNull(i30)) {
                                iN56 = i30;
                                i5 = iN57;
                                string4 = null;
                            } else {
                                string4 = cursorO2.getString(i30);
                                iN56 = i30;
                                i5 = iN57;
                            }
                            if (cursorO2.isNull(i5)) {
                                iN57 = i5;
                                i6 = iN58;
                                string5 = null;
                            } else {
                                string5 = cursorO2.getString(i5);
                                iN57 = i5;
                                i6 = iN58;
                            }
                            long j24 = cursorO2.getLong(i6);
                            iN58 = i6;
                            int i31 = iN59;
                            long j25 = cursorO2.getLong(i31);
                            iN59 = i31;
                            int i32 = iN60;
                            int i33 = cursorO2.getInt(i32);
                            t19Var2.a().getClass();
                            int iA2 = ey8.a(i33);
                            iN60 = i32;
                            int i34 = iN61;
                            long j26 = cursorO2.getLong(i34);
                            iN61 = i34;
                            int i35 = iN62;
                            int i36 = cursorO2.getInt(i35);
                            iN62 = i35;
                            int i37 = iN63;
                            int i38 = cursorO2.getInt(i37);
                            iN63 = i37;
                            int i39 = iN64;
                            int i40 = cursorO2.getInt(i39);
                            iN64 = i39;
                            int i41 = iN65;
                            long j27 = cursorO2.getLong(i41);
                            iN65 = i41;
                            int i42 = iN66;
                            int i43 = cursorO2.getInt(i42);
                            iN66 = i42;
                            int i44 = iN67;
                            int i45 = cursorO2.getInt(i44);
                            iN67 = i44;
                            int i46 = iN68;
                            long j28 = cursorO2.getLong(i46);
                            iN68 = i46;
                            int i47 = iN69;
                            byte[] blob5 = cursorO2.isNull(i47) ? null : cursorO2.getBlob(i47);
                            t19Var2.a().getClass();
                            List listA2 = v89.a(blob5);
                            iN69 = i47;
                            int i48 = iN70;
                            if (cursorO2.isNull(i48)) {
                                i7 = i48;
                                i8 = iN37;
                                blob = null;
                            } else {
                                i7 = i48;
                                blob = cursorO2.getBlob(i48);
                                i8 = iN37;
                            }
                            ix8 ix8VarC2 = t19Var2.a().c(blob);
                            int i49 = iN71;
                            if (cursorO2.isNull(i49)) {
                                i9 = iN72;
                                lValueOf = null;
                            } else {
                                lValueOf = Long.valueOf(cursorO2.getLong(i49));
                                i9 = iN72;
                            }
                            Integer numValueOf2 = cursorO2.isNull(i9) ? null : Integer.valueOf(cursorO2.getInt(i9));
                            if (numValueOf2 == null) {
                                iN71 = i49;
                                boolValueOf2 = null;
                            } else {
                                boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                                iN71 = i49;
                            }
                            arrayList.add(new ru8(j15, j16, j17, j18, j19, j20, string9, iu8VarN2, vx8VarB2, j21, string10, string3, k8gVarB2, i24, z4, i27, j22, z, j23, string4, string5, j24, j25, iA2, j26, i36, i38, i40, j27, i43, i45, j28, listA2, ix8VarC2, lValueOf, boolValueOf2));
                            iN72 = i9;
                            iN51 = i25;
                            iN37 = i8;
                            iN52 = i26;
                            iN70 = i7;
                        }
                        cursorO2.close();
                        xlcVar2.n();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        cursorO2.close();
                        xlcVar2.n();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    xlcVar2 = xlcVar4;
                }
        }
    }
}
