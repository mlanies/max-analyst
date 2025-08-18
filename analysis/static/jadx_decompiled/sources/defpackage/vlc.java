package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class vlc {
    public final jlc a;
    public final vxc b;
    public final je7 c;
    public final je7 d;
    public final khe e = new khe(new lwa(16, this));

    public vlc(jlc jlcVar, vxc vxcVar, v07 v07Var, je7 je7Var) {
        this.a = jlcVar;
        this.b = vxcVar;
        this.c = v07Var;
        this.d = je7Var;
    }

    public static bu8 m(ru8 ru8Var) {
        bu8 bu8Var = new bu8();
        bu8Var.a = ru8Var.a;
        bu8Var.b = ru8Var.b;
        bu8Var.c = ru8Var.c;
        bu8Var.d = ru8Var.d;
        bu8Var.e = ru8Var.e;
        bu8Var.f = ru8Var.f;
        bu8Var.g = ru8Var.g;
        bu8Var.h = ru8Var.x;
        bu8Var.i = ru8Var.h;
        bu8Var.j = ru8Var.i;
        bu8Var.k = ru8Var.j;
        bu8Var.l = ru8Var.k;
        bu8Var.m = ru8Var.l;
        bu8Var.n = ru8Var.m;
        bu8Var.o = ru8Var.n;
        bu8Var.p = ru8Var.p;
        bu8Var.q = ru8Var.s;
        bu8Var.s = ru8Var.t;
        bu8Var.t = ru8Var.u;
        bu8Var.y = ru8Var.w;
        bu8Var.x = ru8Var.v;
        bu8Var.u = ru8Var.o;
        bu8Var.v = ru8Var.z;
        bu8Var.w = ru8Var.A;
        bu8Var.I = ru8Var.J;
        bu8Var.A = ru8Var.y;
        bu8Var.B = ru8Var.B;
        bu8Var.C = ru8Var.C;
        bu8Var.D = ru8Var.D;
        bu8Var.E = ru8Var.E;
        bu8Var.F = ru8Var.F;
        bu8Var.G = ru8Var.G;
        return bu8Var;
    }

    public final int a(long j, long j2, mg4 mg4Var) {
        ilc ilcVar;
        int iN;
        int iOrdinal = mg4Var.ordinal();
        if (iOrdinal == 0) {
            t19 t19VarD = d();
            ilcVar = t19VarD.a;
            ilcVar.b();
            p19 p19Var = t19VarD.r;
            q36 q36VarF = p19Var.f();
            q36VarF.j(1, j);
            q36VarF.j(2, j2);
            try {
                ilcVar.c();
                try {
                    iN = q36VarF.n();
                    ilcVar.r();
                } finally {
                }
            } finally {
                p19Var.t(q36VarF);
            }
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            t19 t19VarD2 = d();
            ilcVar = t19VarD2.a;
            ilcVar.b();
            p19 p19Var2 = t19VarD2.s;
            q36 q36VarF2 = p19Var2.f();
            q36VarF2.j(1, j);
            q36VarF2.j(2, j2);
            try {
                ilcVar.c();
                try {
                    iN = q36VarF2.n();
                    ilcVar.r();
                } finally {
                }
            } finally {
                p19Var2.t(q36VarF2);
            }
        }
        return iN;
    }

    public final cu8 b(ru8 ru8Var) throws Throwable {
        Boolean bool;
        l20 l20VarK;
        q10 q10Var;
        bu8 bu8VarM = m(ru8Var);
        long j = ru8Var.q;
        ng4 ng4Var = null;
        if (j > 0) {
            ru8 ru8VarC = d().c(j);
            bu8VarM.r = ru8VarC != null ? b(ru8VarC) : null;
        }
        k8g k8gVar = ru8Var.m;
        long j2 = (k8gVar == null || (l20VarK = k8gVar.k(g20.b)) == null || (q10Var = l20VarK.c) == null) ? 0L : q10Var.m;
        if (j2 > 0) {
            ru8 ru8VarC2 = d().c(j2);
            bu8VarM.z = ru8VarC2 != null ? b(ru8VarC2) : null;
        }
        Long l = ru8Var.H;
        if (l != null && (bool = ru8Var.I) != null) {
            ng4Var = new ng4(l.longValue(), bool.booleanValue());
        }
        bu8VarM.H = ng4Var;
        return bu8VarM.a();
    }

    public final kke c() {
        return (kke) this.c.getValue();
    }

    public final t19 d() {
        return (t19) this.e.getValue();
    }

    public final long e(final long j, final long j2, final fs8 fs8Var) {
        return ((Number) ((OneMeRoomDatabase) this.a.m()).p(new Callable() { // from class: mlc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(this.a.f(j, j2, fs8Var, false));
            }
        })).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(long r90, long r92, defpackage.fs8 r94, boolean r95) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlc.f(long, long, fs8, boolean):long");
    }

    public final void g(lna lnaVar, long j) {
        long j2 = lnaVar.a;
        k8g k8gVarC = new m20().c();
        xxc xxcVar = mg4.o;
        nz4 nz4Var = nz4.a;
        int iC = iz7.c(k8gVarC);
        d().f(new ru8(0L, 0L, 0L, 0L, 0L, j2, lnaVar.b, iu8.X, vx8.ACTIVE, 0L, null, null, k8gVarC, iC, lnaVar.e, 0, 0L, false, 0L, null, null, 0L, 0L, 1, j, lnaVar.f, 0, 0, 0L, 0, 0, 0L, nz4Var, null, null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ru8 r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlc.h(ru8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yw8 i(long r44, defpackage.fs8 r46, long r47, boolean r49, long r50, defpackage.vx8 r52) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlc.i(long, fs8, long, boolean, long, vx8):yw8");
    }

    public final Object j(long j, long j2, Continuation continuation) {
        return j47.t0(((w9a) c()).b(), new slc(this, j, j2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(long r6, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ulc
            if (r0 == 0) goto L13
            r0 = r8
            ulc r0 = (defpackage.ulc) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ulc r0 = new ulc
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            defpackage.od2.a0(r8)
            goto L73
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            vlc r5 = r0.o
            defpackage.od2.a0(r8)
            goto L63
        L38:
            defpackage.od2.a0(r8)
            t19 r8 = r5.d()
            r0.o = r5
            r0.Z = r3
            r8.getClass()
            java.lang.String r2 = "SELECT * FROM messages WHERE id = ?"
            xlc r2 = defpackage.xlc.a(r3, r2)
            r2.j(r3, r6)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            r19 r7 = new r19
            r3 = 0
            r7.<init>(r8, r2, r3)
            ilc r8 = r8.a
            java.lang.Object r8 = defpackage.ote.i(r8, r6, r7, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            ru8 r8 = (defpackage.ru8) r8
            r6 = 0
            if (r8 == 0) goto L76
            r0.o = r6
            r0.Z = r4
            java.lang.Object r8 = r5.h(r8, r0)
            if (r8 != r1) goto L73
            return r1
        L73:
            r6 = r8
            cu8 r6 = (defpackage.cu8) r6
        L76:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlc.k(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ArrayList l(long j, long j2, Set set, Integer num, boolean z) throws Throwable {
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
        boolean z2;
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
        String str;
        String str2;
        xlc xlcVar2;
        String string4;
        int i8;
        int i9;
        boolean z3;
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
        String str3;
        String str4;
        List listSingletonList = Collections.singletonList(Long.valueOf(j));
        t19 t19VarD = d();
        List<Long> listD0 = x53.D0(listSingletonList);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        ilc ilcVar = t19VarD.a;
        String str5 = "update_time";
        String str6 = "time";
        if (z) {
            StringBuilder sbL = au1.l("SELECT * FROM messages WHERE chat_id in (");
            int size = listD0.size();
            a14.c(sbL, size);
            sbL.append(") AND media_type in (");
            int size2 = set.size();
            a14.c(sbL, size2);
            sbL.append(") AND time <= ");
            sbL.append("?");
            sbL.append(" AND inserted_from_msg_link = 0 AND status <> ");
            sbL.append("?");
            sbL.append(" ORDER BY time DESC LIMIT ");
            sbL.append("?");
            int i15 = size + 3 + size2;
            xlc xlcVarA = xlc.a(i15, sbL.toString());
            int i16 = 1;
            for (Long l : listD0) {
                if (l == null) {
                    xlcVarA.W(i16);
                    str3 = str5;
                    str4 = str6;
                } else {
                    str3 = str5;
                    str4 = str6;
                    xlcVarA.j(i16, l.longValue());
                }
                i16++;
                str5 = str3;
                str6 = str4;
            }
            String str7 = str5;
            String str8 = str6;
            int i17 = size + 1;
            Iterator it = set.iterator();
            int i18 = i17;
            while (it.hasNext()) {
                if (((Integer) it.next()) == null) {
                    xlcVarA.W(i18);
                } else {
                    xlcVarA.j(i18, r14.intValue());
                }
                i18++;
            }
            xlcVarA.j(i17 + size2, j2);
            t19VarD.a().getClass();
            xlcVarA.j(size + 2 + size2, 10);
            xlcVarA.j(i15, iIntValue);
            ilcVar.b();
            Cursor cursorO = ilcVar.o(xlcVarA, null);
            try {
                int iN14 = tfg.n(cursorO, "id");
                int iN15 = tfg.n(cursorO, "server_id");
                int iN16 = tfg.n(cursorO, str8);
                int iN17 = tfg.n(cursorO, str7);
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
                    int i19 = iN26;
                    arrayList = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        long j3 = cursorO.getLong(iN14);
                        long j4 = cursorO.getLong(iN15);
                        long j5 = cursorO.getLong(iN16);
                        long j6 = cursorO.getLong(iN17);
                        long j7 = cursorO.getLong(iN18);
                        long j8 = cursorO.getLong(iN19);
                        String string7 = cursorO.isNull(iN20) ? null : cursorO.getString(iN20);
                        int i20 = cursorO.getInt(iN21);
                        t19VarD.a().getClass();
                        iu8.b.getClass();
                        iu8 iu8VarN = oz7.n(i20);
                        int i21 = cursorO.getInt(iN22);
                        t19VarD.a().getClass();
                        vx8 vx8VarB = v89.b(i21);
                        long j9 = cursorO.getLong(iN23);
                        String string8 = cursorO.isNull(iN24) ? null : cursorO.getString(iN24);
                        if (cursorO.isNull(iN25)) {
                            i8 = i19;
                            string4 = null;
                        } else {
                            string4 = cursorO.getString(iN25);
                            i8 = i19;
                        }
                        byte[] blob3 = cursorO.isNull(i8) ? null : cursorO.getBlob(i8);
                        t19VarD.a().getClass();
                        k8g k8gVarB = iz7.b(blob3);
                        int i22 = iN14;
                        int i23 = iN27;
                        int i24 = cursorO.getInt(i23);
                        iN27 = i23;
                        int i25 = iN28;
                        iN28 = i25;
                        boolean z4 = cursorO.getInt(i25) != 0;
                        int i26 = iN29;
                        int i27 = cursorO.getInt(i26);
                        iN29 = i26;
                        int i28 = iN30;
                        long j10 = cursorO.getLong(i28);
                        iN30 = i28;
                        int i29 = iN31;
                        if (cursorO.getInt(i29) != 0) {
                            iN31 = i29;
                            i9 = iN32;
                            z3 = true;
                        } else {
                            iN31 = i29;
                            i9 = iN32;
                            z3 = false;
                        }
                        long j11 = cursorO.getLong(i9);
                        iN32 = i9;
                        int i30 = iN33;
                        if (cursorO.isNull(i30)) {
                            iN33 = i30;
                            i10 = iN34;
                            string5 = null;
                        } else {
                            string5 = cursorO.getString(i30);
                            iN33 = i30;
                            i10 = iN34;
                        }
                        if (cursorO.isNull(i10)) {
                            iN34 = i10;
                            i11 = iN35;
                            string6 = null;
                        } else {
                            string6 = cursorO.getString(i10);
                            iN34 = i10;
                            i11 = iN35;
                        }
                        long j12 = cursorO.getLong(i11);
                        iN35 = i11;
                        int i31 = iN36;
                        long j13 = cursorO.getLong(i31);
                        iN36 = i31;
                        int i32 = iN37;
                        int i33 = cursorO.getInt(i32);
                        t19VarD.a().getClass();
                        int iA = ey8.a(i33);
                        iN37 = i32;
                        int i34 = iN38;
                        long j14 = cursorO.getLong(i34);
                        iN38 = i34;
                        int i35 = iN39;
                        int i36 = cursorO.getInt(i35);
                        iN39 = i35;
                        int i37 = iN40;
                        int i38 = cursorO.getInt(i37);
                        iN40 = i37;
                        int i39 = iN41;
                        int i40 = cursorO.getInt(i39);
                        iN41 = i39;
                        int i41 = iN42;
                        long j15 = cursorO.getLong(i41);
                        iN42 = i41;
                        int i42 = iN43;
                        int i43 = cursorO.getInt(i42);
                        iN43 = i42;
                        int i44 = iN44;
                        int i45 = cursorO.getInt(i44);
                        iN44 = i44;
                        int i46 = iN45;
                        long j16 = cursorO.getLong(i46);
                        iN45 = i46;
                        int i47 = iN46;
                        byte[] blob4 = cursorO.isNull(i47) ? null : cursorO.getBlob(i47);
                        t19VarD.a().getClass();
                        List listA = v89.a(blob4);
                        iN46 = i47;
                        int i48 = iN47;
                        if (cursorO.isNull(i48)) {
                            i12 = i48;
                            i13 = iN15;
                            blob2 = null;
                        } else {
                            i12 = i48;
                            blob2 = cursorO.getBlob(i48);
                            i13 = iN15;
                        }
                        ix8 ix8VarC = t19VarD.a().c(blob2);
                        int i49 = iN48;
                        if (cursorO.isNull(i49)) {
                            i14 = iN49;
                            lValueOf2 = null;
                        } else {
                            lValueOf2 = Long.valueOf(cursorO.getLong(i49));
                            i14 = iN49;
                        }
                        Integer numValueOf = cursorO.isNull(i14) ? null : Integer.valueOf(cursorO.getInt(i14));
                        if (numValueOf == null) {
                            iN48 = i49;
                            boolValueOf2 = null;
                        } else {
                            boolValueOf2 = Boolean.valueOf(numValueOf.intValue() != 0);
                            iN48 = i49;
                        }
                        arrayList.add(new ru8(j3, j4, j5, j6, j7, j8, string7, iu8VarN, vx8VarB, j9, string8, string4, k8gVarB, i24, z4, i27, j10, z3, j11, string5, string6, j12, j13, iA, j14, i36, i38, i40, j15, i43, i45, j16, listA, ix8VarC, lValueOf2, boolValueOf2));
                        iN49 = i14;
                        iN15 = i13;
                        iN14 = i22;
                        iN47 = i12;
                        i19 = i8;
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
            String str9 = "time";
            String str10 = "update_time";
            StringBuilder sbL2 = au1.l("SELECT * FROM messages WHERE chat_id in (");
            int size3 = listD0.size();
            a14.c(sbL2, size3);
            sbL2.append(") AND media_type in (");
            int size4 = set.size();
            a14.c(sbL2, size4);
            sbL2.append(") AND time >= ");
            sbL2.append("?");
            sbL2.append(" AND inserted_from_msg_link = 0 AND status <> ");
            sbL2.append("?");
            sbL2.append(" ORDER BY time ASC LIMIT ");
            sbL2.append("?");
            int i50 = size3 + 3 + size4;
            xlc xlcVarA2 = xlc.a(i50, sbL2.toString());
            int i51 = 1;
            for (Long l2 : listD0) {
                if (l2 == null) {
                    xlcVarA2.W(i51);
                    str = str9;
                    str2 = str10;
                } else {
                    str = str9;
                    str2 = str10;
                    xlcVarA2.j(i51, l2.longValue());
                }
                i51++;
                str10 = str2;
                str9 = str;
            }
            String str11 = str9;
            String str12 = str10;
            int i52 = size3 + 1;
            Iterator it2 = set.iterator();
            int i53 = i52;
            while (it2.hasNext()) {
                if (((Integer) it2.next()) == null) {
                    xlcVarA2.W(i53);
                } else {
                    xlcVarA2.j(i53, r14.intValue());
                }
                i53++;
            }
            xlcVarA2.j(i52 + size4, j2);
            t19VarD.a().getClass();
            xlcVarA2.j(size3 + 2 + size4, 10);
            xlcVarA2.j(i50, iIntValue);
            ilcVar.b();
            Cursor cursorO2 = ilcVar.o(xlcVarA2, null);
            try {
                iN = tfg.n(cursorO2, "id");
                iN2 = tfg.n(cursorO2, "server_id");
                iN3 = tfg.n(cursorO2, str11);
                iN4 = tfg.n(cursorO2, str12);
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
                int i54 = iN13;
                arrayList = new ArrayList(cursorO2.getCount());
                while (cursorO2.moveToNext()) {
                    long j17 = cursorO2.getLong(iN);
                    long j18 = cursorO2.getLong(iN2);
                    long j19 = cursorO2.getLong(iN3);
                    long j20 = cursorO2.getLong(iN4);
                    long j21 = cursorO2.getLong(iN5);
                    long j22 = cursorO2.getLong(iN6);
                    String string9 = cursorO2.isNull(iN7) ? null : cursorO2.getString(iN7);
                    int i55 = cursorO2.getInt(iN8);
                    t19VarD.a().getClass();
                    iu8.b.getClass();
                    iu8 iu8VarN2 = oz7.n(i55);
                    int i56 = cursorO2.getInt(iN9);
                    t19VarD.a().getClass();
                    vx8 vx8VarB2 = v89.b(i56);
                    long j23 = cursorO2.getLong(iN10);
                    String string10 = cursorO2.isNull(iN11) ? null : cursorO2.getString(iN11);
                    if (cursorO2.isNull(iN12)) {
                        i = i54;
                        string = null;
                    } else {
                        string = cursorO2.getString(iN12);
                        i = i54;
                    }
                    byte[] blob5 = cursorO2.isNull(i) ? null : cursorO2.getBlob(i);
                    t19VarD.a().getClass();
                    k8g k8gVarB2 = iz7.b(blob5);
                    i54 = i;
                    int i57 = iN50;
                    int i58 = cursorO2.getInt(i57);
                    iN50 = i57;
                    int i59 = iN51;
                    iN51 = i59;
                    boolean z5 = cursorO2.getInt(i59) != 0;
                    int i60 = iN52;
                    int i61 = cursorO2.getInt(i60);
                    iN52 = i60;
                    int i62 = iN53;
                    long j24 = cursorO2.getLong(i62);
                    iN53 = i62;
                    int i63 = iN54;
                    if (cursorO2.getInt(i63) != 0) {
                        iN54 = i63;
                        i2 = iN55;
                        z2 = true;
                    } else {
                        iN54 = i63;
                        i2 = iN55;
                        z2 = false;
                    }
                    long j25 = cursorO2.getLong(i2);
                    iN55 = i2;
                    int i64 = iN56;
                    if (cursorO2.isNull(i64)) {
                        iN56 = i64;
                        i3 = iN57;
                        string2 = null;
                    } else {
                        string2 = cursorO2.getString(i64);
                        iN56 = i64;
                        i3 = iN57;
                    }
                    if (cursorO2.isNull(i3)) {
                        iN57 = i3;
                        i4 = iN58;
                        string3 = null;
                    } else {
                        string3 = cursorO2.getString(i3);
                        iN57 = i3;
                        i4 = iN58;
                    }
                    long j26 = cursorO2.getLong(i4);
                    iN58 = i4;
                    int i65 = iN59;
                    long j27 = cursorO2.getLong(i65);
                    iN59 = i65;
                    int i66 = iN60;
                    int i67 = cursorO2.getInt(i66);
                    t19VarD.a().getClass();
                    int iA2 = ey8.a(i67);
                    iN60 = i66;
                    int i68 = iN61;
                    long j28 = cursorO2.getLong(i68);
                    iN61 = i68;
                    int i69 = iN62;
                    int i70 = cursorO2.getInt(i69);
                    iN62 = i69;
                    int i71 = iN63;
                    int i72 = cursorO2.getInt(i71);
                    iN63 = i71;
                    int i73 = iN64;
                    int i74 = cursorO2.getInt(i73);
                    iN64 = i73;
                    int i75 = iN65;
                    long j29 = cursorO2.getLong(i75);
                    iN65 = i75;
                    int i76 = iN66;
                    int i77 = cursorO2.getInt(i76);
                    iN66 = i76;
                    int i78 = iN67;
                    int i79 = cursorO2.getInt(i78);
                    iN67 = i78;
                    int i80 = iN68;
                    long j30 = cursorO2.getLong(i80);
                    iN68 = i80;
                    int i81 = iN69;
                    byte[] blob6 = cursorO2.isNull(i81) ? null : cursorO2.getBlob(i81);
                    t19VarD.a().getClass();
                    List listA2 = v89.a(blob6);
                    iN69 = i81;
                    int i82 = iN70;
                    if (cursorO2.isNull(i82)) {
                        i5 = i82;
                        i6 = iN;
                        blob = null;
                    } else {
                        i5 = i82;
                        blob = cursorO2.getBlob(i82);
                        i6 = iN;
                    }
                    ix8 ix8VarC2 = t19VarD.a().c(blob);
                    int i83 = iN71;
                    if (cursorO2.isNull(i83)) {
                        i7 = iN72;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(cursorO2.getLong(i83));
                        i7 = iN72;
                    }
                    Integer numValueOf2 = cursorO2.isNull(i7) ? null : Integer.valueOf(cursorO2.getInt(i7));
                    if (numValueOf2 == null) {
                        iN71 = i83;
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                        iN71 = i83;
                    }
                    arrayList.add(new ru8(j17, j18, j19, j20, j21, j22, string9, iu8VarN2, vx8VarB2, j23, string10, string, k8gVarB2, i58, z5, i61, j24, z2, j25, string2, string3, j26, j27, iA2, j28, i70, i72, i74, j29, i77, i79, j30, listA2, ix8VarC2, lValueOf, boolValueOf));
                    iN72 = i7;
                    iN = i6;
                    iN70 = i5;
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
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(b((ru8) it3.next()));
        }
        return arrayList2;
    }

    public final void n(long j, qj3 qj3Var) {
        try {
            ((Number) ((OneMeRoomDatabase) this.a.m()).p(new d76(this, j, qj3Var))).intValue();
        } catch (Throwable th) {
            hm9.p("RoomMessagesDatabase", "Can't update attach", th);
        }
    }

    public final int o(fs8 fs8Var, long j, boolean z, vx8 vx8Var) {
        int iL;
        iu8 iu8Var = iu8.Y;
        yw8 yw8VarI = i(j, fs8Var, 0L, z, 0L, vx8Var);
        t19 t19VarD = d();
        long j2 = fs8Var.Y;
        ilc ilcVar = t19VarD.a;
        ilcVar.c();
        try {
            ru8 ru8VarH = t19VarD.h(j, j2);
            if (ru8VarH == null) {
                iL = 0;
            } else {
                yw8 yw8VarG = t19.g(t19VarD, ru8VarH, yw8VarI, j, null, Long.valueOf(j2), 8);
                t19VarD.n(ru8VarH.a, iu8Var);
                iL = t19VarD.l(yw8VarG);
            }
            ilcVar.r();
            return iL;
        } finally {
            ilcVar.l();
        }
    }

    public final int p(long j, long j2, fs8 fs8Var, boolean z) {
        yw8 yw8VarI = i(j, fs8Var, j2, z, 0L, null);
        t19 t19VarD = d();
        long j3 = fs8Var.a;
        ilc ilcVar = t19VarD.a;
        ilcVar.c();
        try {
            ru8 ru8VarB = t19VarD.b(j, j3);
            int iL = ru8VarB == null ? 0 : t19VarD.l(t19.g(t19VarD, ru8VarB, yw8VarI, j, Long.valueOf(j3), null, 16));
            ilcVar.r();
            return iL;
        } finally {
            ilcVar.l();
        }
    }

    public final void q(long j, Long l, Boolean bool) {
        t19 t19VarD = d();
        ilc ilcVar = t19VarD.a;
        ilcVar.b();
        p19 p19Var = t19VarD.o;
        q36 q36VarF = p19Var.f();
        if (l == null) {
            q36VarF.W(1);
        } else {
            q36VarF.j(1, l.longValue());
        }
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            q36VarF.W(2);
        } else {
            q36VarF.j(2, r8.intValue());
        }
        q36VarF.j(3, j);
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
}
