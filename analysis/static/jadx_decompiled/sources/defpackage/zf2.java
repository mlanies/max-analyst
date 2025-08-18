package defpackage;

import android.database.Cursor;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.chat.FrgChatMediaLoader;

/* loaded from: classes2.dex */
public final class zf2 {
    public final long a;
    public final long b;
    public final boolean c;
    public final Set f;
    public final Set g;
    public final ztc h;
    public final ztc i;
    public final ztc j;
    public boolean k;
    public boolean l;
    public long m;
    public long n;
    public final av0 p;
    public final p82 q;
    public final au8 r;
    public final ge2 s;
    public final t6b t;
    public final zu8 u;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Set o = Collections.newSetFromMap(new WeakHashMap());

    public zf2(long j, Long l, boolean z, HashSet hashSet, av0 av0Var, p82 p82Var, au8 au8Var, ge2 ge2Var, t6b t6bVar, zu8 zu8Var, ztc ztcVar, ztc ztcVar2, ztc ztcVar3) {
        this.p = av0Var;
        this.q = p82Var;
        this.r = au8Var;
        this.s = ge2Var;
        this.t = t6bVar;
        this.u = zu8Var;
        this.a = j;
        this.c = z;
        this.b = l.longValue();
        this.f = hashSet;
        this.g = d(hashSet);
        this.h = ztcVar;
        this.i = ztcVar2;
        this.j = ztcVar3;
        hm9.n("zf2", "newInstance: chatId = " + j + ", initialMessageId = " + l);
    }

    public static Set d(Set set) {
        return ql8.a.equals(set) ? b10.D0 : ql8.b.equals(set) ? b10.G0 : ql8.c.equals(set) ? b10.H0 : ql8.d.equals(set) ? b10.E0 : ql8.g.equals(set) ? b10.I0 : ql8.f.equals(set) ? b10.F0 : ql8.h.equals(set) ? b10.J0 : Collections.emptySet();
    }

    public final ArrayList a(List list, boolean z) {
        HashSet hashSet;
        hm9.n("zf2", "addMessages count = " + list.size());
        if (!this.c) {
            Collections.reverse(list);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            hashSet = this.e;
            if (!zHasNext) {
                break;
            }
            es8 es8Var = (es8) it.next();
            if (!es8Var.a.s() && !hashSet.contains(Long.valueOf(es8Var.a.b))) {
                arrayList.add(es8Var);
            }
        }
        hm9.n("zf2", "addMessages count after checkExists = " + arrayList.size());
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = this.d;
            if (z) {
                arrayList2.addAll(arrayList);
            } else {
                arrayList2.addAll(0, arrayList);
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    arrayList3.add(Long.valueOf(((es8) it2.next()).a.b));
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            hashSet.addAll(arrayList3);
        }
        return arrayList;
    }

    public final void b(boolean z) {
        new q1a(1, new vf2(this, z)).m(this.j).i(this.h).k(new iq1(new vf2(this, z), 2, ft.f));
    }

    public final void c() {
        Set<yf2> set = this.o;
        if (set != null) {
            for (yf2 yf2Var : set) {
            }
        }
    }

    public final wf2 e(boolean z) throws Throwable {
        d92 d92Var;
        xlc xlcVar;
        String string;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
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
        long j = this.a;
        p82 p82Var = this.q;
        e52 e52VarC = p82Var.C(j);
        if (e52VarC == null) {
            return new wf2(Collections.emptyList(), false, false, 0, 100, 0);
        }
        k92 k92Var = e52VarC.b;
        Set set = this.g;
        x82 x82VarI = p82.I(k92Var, set);
        boolean zL = p82.L(k92Var, set);
        ge2 ge2Var = this.s;
        if (zL && x82VarI.a != null) {
            ge2Var.getClass();
            d92 d92Var2 = x82VarI.a;
            long j2 = d92Var2.a;
            t19 t19VarD = ((k24) ge2Var.c.a).c.d();
            t19VarD.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND media_type in (");
            Set set2 = this.f;
            int size = set2.size();
            a14.c(sb, size);
            sb.append(") AND inserted_from_msg_link = 0 AND status <> ");
            sb.append("?");
            int i9 = size + 4;
            xlc xlcVarA = xlc.a(i9, sb.toString());
            xlcVarA.j(1, j);
            xlcVarA.j(2, j2);
            xlcVarA.j(3, d92Var2.b);
            Iterator it = set2.iterator();
            int i10 = 4;
            while (it.hasNext()) {
                if (((Integer) it.next()) == null) {
                    xlcVarA.W(i10);
                } else {
                    xlcVarA.j(i10, r10.intValue());
                }
                i10++;
            }
            t19VarD.a().getClass();
            xlcVarA.j(i9, 10);
            ilc ilcVar = t19VarD.a;
            ilcVar.b();
            Cursor cursorO = ilcVar.o(xlcVarA, null);
            try {
                long j3 = cursorO.moveToFirst() ? cursorO.getLong(0) : 0L;
                cursorO.close();
                xlcVarA.n();
                if (j3 == 0) {
                    hm9.n("ge2", "clearMediaChunkIfEmpty: empty chunk removed");
                    p82 p82Var2 = ge2Var.b;
                    p82Var2.getClass();
                    p82Var2.h(j, false, new u00(p82Var2, set, (Object) null, 3));
                    e52 e52VarC2 = p82Var.C(j);
                    if (e52VarC2 == null) {
                        return null;
                    }
                    x82VarI = p82.I(e52VarC2.b, set);
                    e52VarC = e52VarC2;
                }
            } catch (Throwable th) {
                cursorO.close();
                xlcVarA.n();
                throw th;
            }
        }
        if (!p82.L(e52VarC.b, set) || (d92Var = x82VarI.a) == null) {
            hm9.n("zf2", "obsLoadNetwork: requestMediaBackward from last");
            this.n = ge2Var.a(e52VarC, null, false, set);
            return new wf2(Collections.emptyList(), false, true, 0, 100, 0);
        }
        au8 au8Var = this.r;
        if (z) {
            long j4 = x82VarI.c;
            if (j4 <= 0) {
                cu8 cu8VarR = au8Var.r(j, d92Var.a);
                hm9.m("zf2", "obsLoadNetwork: requestMediaBackward from after chunk start %s, message=%s", hm9.W(d92Var), cu8VarR);
                this.n = ge2Var.a(e52VarC, cu8VarR, false, set);
                return new wf2(Collections.emptyList(), false, true, 0, 100, 0);
            }
            cu8 cu8VarQ = au8Var.q(j4);
            if (cu8VarQ != null && hm9.K(cu8VarQ.o, d92Var)) {
                return new wf2(Collections.emptyList(), false, false, 0, 100, 0);
            }
            cu8 cu8VarR2 = au8Var.r(j, d92Var.a);
            hm9.m("zf2", "obsLoadNetwork: requestMediaBackward from after chunk start %s, message=%s", hm9.W(d92Var), cu8VarR2);
            this.n = ge2Var.a(e52VarC, cu8VarR2, false, set);
            return new wf2(Collections.emptyList(), false, true, 0, 100, 0);
        }
        cu8 cu8VarO = au8Var.o(j);
        if (cu8VarO != null && hm9.K(cu8VarO.o, d92Var)) {
            return new wf2(Collections.emptyList(), true, false, 100, 0, 0);
        }
        long j5 = d92Var.b;
        vlc vlcVar = ((k24) au8Var.a).c;
        t19 t19VarD2 = vlcVar.d();
        t19VarD2.getClass();
        xlc xlcVarA2 = xlc.a(4, "SELECT * FROM messages WHERE chat_id = ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? ORDER BY time DESC LIMIT ?");
        xlcVarA2.j(1, j);
        ey8.m(xlcVarA2, 2, j5, t19VarD2);
        xlcVarA2.j(3, 10);
        xlcVarA2.j(4, 1);
        ilc ilcVar2 = t19VarD2.a;
        ilcVar2.b();
        Cursor cursorO2 = ilcVar2.o(xlcVarA2, null);
        try {
            int iN = tfg.n(cursorO2, "id");
            int iN2 = tfg.n(cursorO2, "server_id");
            int iN3 = tfg.n(cursorO2, "time");
            int iN4 = tfg.n(cursorO2, "update_time");
            int iN5 = tfg.n(cursorO2, "sender");
            int iN6 = tfg.n(cursorO2, "cid");
            int iN7 = tfg.n(cursorO2, "text");
            e52 e52Var = e52VarC;
            int iN8 = tfg.n(cursorO2, "delivery_status");
            int iN9 = tfg.n(cursorO2, "status");
            int iN10 = tfg.n(cursorO2, "time_local");
            int iN11 = tfg.n(cursorO2, "error");
            int iN12 = tfg.n(cursorO2, "localized_error");
            int iN13 = tfg.n(cursorO2, "attaches");
            xlcVar = xlcVarA2;
            try {
                int iN14 = tfg.n(cursorO2, "media_type");
                int iN15 = tfg.n(cursorO2, "detect_share");
                int iN16 = tfg.n(cursorO2, "msg_link_type");
                int iN17 = tfg.n(cursorO2, "msg_link_id");
                int iN18 = tfg.n(cursorO2, "inserted_from_msg_link");
                int iN19 = tfg.n(cursorO2, "msg_link_chat_id");
                int iN20 = tfg.n(cursorO2, "msg_link_chat_name");
                int iN21 = tfg.n(cursorO2, "msg_link_chat_link");
                int iN22 = tfg.n(cursorO2, "msg_link_out_chat_id");
                int iN23 = tfg.n(cursorO2, "msg_link_out_msg_id");
                int iN24 = tfg.n(cursorO2, "type");
                int iN25 = tfg.n(cursorO2, "chat_id");
                int iN26 = tfg.n(cursorO2, "ttl");
                int iN27 = tfg.n(cursorO2, "channel_views");
                int iN28 = tfg.n(cursorO2, "channel_forwards");
                int iN29 = tfg.n(cursorO2, "view_time");
                int iN30 = tfg.n(cursorO2, "zoom");
                int iN31 = tfg.n(cursorO2, "options");
                int iN32 = tfg.n(cursorO2, "live_until");
                int iN33 = tfg.n(cursorO2, "elements");
                int iN34 = tfg.n(cursorO2, "reactions");
                int iN35 = tfg.n(cursorO2, "delayed_attrs_time_to_fire");
                int iN36 = tfg.n(cursorO2, "delayed_attrs_notify_sender");
                int i11 = iN13;
                ArrayList arrayList = new ArrayList(cursorO2.getCount());
                while (cursorO2.moveToNext()) {
                    long j6 = cursorO2.getLong(iN);
                    long j7 = cursorO2.getLong(iN2);
                    long j8 = cursorO2.getLong(iN3);
                    long j9 = cursorO2.getLong(iN4);
                    long j10 = cursorO2.getLong(iN5);
                    long j11 = cursorO2.getLong(iN6);
                    String string4 = cursorO2.isNull(iN7) ? null : cursorO2.getString(iN7);
                    int i12 = cursorO2.getInt(iN8);
                    t19VarD2.a().getClass();
                    iu8.b.getClass();
                    iu8 iu8VarN = oz7.n(i12);
                    int i13 = cursorO2.getInt(iN9);
                    t19VarD2.a().getClass();
                    vx8 vx8VarB = v89.b(i13);
                    long j12 = cursorO2.getLong(iN10);
                    String string5 = cursorO2.isNull(iN11) ? null : cursorO2.getString(iN11);
                    if (cursorO2.isNull(iN12)) {
                        i = i11;
                        string = null;
                    } else {
                        string = cursorO2.getString(iN12);
                        i = i11;
                    }
                    byte[] blob2 = cursorO2.isNull(i) ? null : cursorO2.getBlob(i);
                    t19VarD2.a().getClass();
                    k8g k8gVarB = iz7.b(blob2);
                    int i14 = iN7;
                    int i15 = iN14;
                    int i16 = cursorO2.getInt(i15);
                    iN14 = i15;
                    int i17 = iN15;
                    if (cursorO2.getInt(i17) != 0) {
                        iN15 = i17;
                        i2 = iN16;
                        z2 = true;
                    } else {
                        iN15 = i17;
                        i2 = iN16;
                        z2 = false;
                    }
                    int i18 = cursorO2.getInt(i2);
                    iN16 = i2;
                    int i19 = iN17;
                    long j13 = cursorO2.getLong(i19);
                    iN17 = i19;
                    int i20 = iN18;
                    if (cursorO2.getInt(i20) != 0) {
                        iN18 = i20;
                        i3 = iN19;
                        z3 = true;
                    } else {
                        iN18 = i20;
                        i3 = iN19;
                        z3 = false;
                    }
                    long j14 = cursorO2.getLong(i3);
                    iN19 = i3;
                    int i21 = iN20;
                    if (cursorO2.isNull(i21)) {
                        iN20 = i21;
                        i4 = iN21;
                        string2 = null;
                    } else {
                        string2 = cursorO2.getString(i21);
                        iN20 = i21;
                        i4 = iN21;
                    }
                    if (cursorO2.isNull(i4)) {
                        iN21 = i4;
                        i5 = iN22;
                        string3 = null;
                    } else {
                        string3 = cursorO2.getString(i4);
                        iN21 = i4;
                        i5 = iN22;
                    }
                    long j15 = cursorO2.getLong(i5);
                    iN22 = i5;
                    int i22 = iN23;
                    long j16 = cursorO2.getLong(i22);
                    iN23 = i22;
                    int i23 = iN24;
                    int i24 = cursorO2.getInt(i23);
                    t19VarD2.a().getClass();
                    int iA = ey8.a(i24);
                    iN24 = i23;
                    int i25 = iN25;
                    long j17 = cursorO2.getLong(i25);
                    iN25 = i25;
                    int i26 = iN26;
                    int i27 = cursorO2.getInt(i26);
                    iN26 = i26;
                    int i28 = iN27;
                    int i29 = cursorO2.getInt(i28);
                    iN27 = i28;
                    int i30 = iN28;
                    int i31 = cursorO2.getInt(i30);
                    iN28 = i30;
                    int i32 = iN29;
                    long j18 = cursorO2.getLong(i32);
                    iN29 = i32;
                    int i33 = iN30;
                    int i34 = cursorO2.getInt(i33);
                    iN30 = i33;
                    int i35 = iN31;
                    int i36 = cursorO2.getInt(i35);
                    iN31 = i35;
                    int i37 = iN32;
                    long j19 = cursorO2.getLong(i37);
                    iN32 = i37;
                    int i38 = iN33;
                    byte[] blob3 = cursorO2.isNull(i38) ? null : cursorO2.getBlob(i38);
                    t19VarD2.a().getClass();
                    List listA = v89.a(blob3);
                    iN33 = i38;
                    int i39 = iN34;
                    if (cursorO2.isNull(i39)) {
                        i6 = i39;
                        i7 = iN12;
                        blob = null;
                    } else {
                        i6 = i39;
                        blob = cursorO2.getBlob(i39);
                        i7 = iN12;
                    }
                    ix8 ix8VarC = t19VarD2.a().c(blob);
                    int i40 = iN35;
                    if (cursorO2.isNull(i40)) {
                        i8 = iN36;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(cursorO2.getLong(i40));
                        i8 = iN36;
                    }
                    Integer numValueOf = cursorO2.isNull(i8) ? null : Integer.valueOf(cursorO2.getInt(i8));
                    if (numValueOf == null) {
                        iN35 = i40;
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        iN35 = i40;
                    }
                    arrayList.add(new ru8(j6, j7, j8, j9, j10, j11, string4, iu8VarN, vx8VarB, j12, string5, string, k8gVarB, i16, z2, i18, j13, z3, j14, string2, string3, j15, j16, iA, j17, i27, i29, i31, j18, i34, i36, j19, listA, ix8VarC, lValueOf, boolValueOf));
                    iN36 = i8;
                    iN12 = i7;
                    iN7 = i14;
                    iN34 = i6;
                    i11 = i;
                }
                cursorO2.close();
                xlcVar.n();
                ru8 ru8Var = (ru8) x53.i0(arrayList);
                cu8 cu8VarB = ru8Var != null ? vlcVar.b(ru8Var) : null;
                hm9.m("zf2", "obsLoadNetwork: requestMediaForward from before chunk end %s, message=%s", hm9.W(d92Var), cu8VarB);
                this.m = ge2Var.a(e52Var, cu8VarB, true, set);
                return new wf2(Collections.emptyList(), true, true, 100, 0, 0);
            } catch (Throwable th2) {
                th = th2;
                cursorO2.close();
                xlcVar.n();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xlcVar = xlcVarA2;
        }
    }

    public final void f(wf2 wf2Var) {
        hm9.m("zf2", "onLoadNetwork, result = %s", wf2Var);
        boolean zIsEmpty = wf2Var.a.isEmpty();
        boolean z = wf2Var.b;
        if (!zIsEmpty) {
            boolean z2 = this.c;
            boolean z3 = (z && !z2) || (!z && z2);
            ArrayList arrayListA = a(wf2Var.a, z3);
            Set<yf2> set = this.o;
            if (set != null) {
                if (z3) {
                    for (yf2 yf2Var : set) {
                        if (yf2Var != null) {
                            ActAttachesView actAttachesView = (ActAttachesView) yf2Var;
                            hm9.n("ru.ok.messages.media.attaches.ActAttachesView", "onLoadNextPage, count = " + arrayListA.size());
                            if (actAttachesView.f1.getVisibility() == 0 && actAttachesView.W0 != null) {
                                actAttachesView.W0.j(FrgChatMediaLoader.r1(arrayListA, ActAttachesView.z1), true);
                                actAttachesView.W0.d();
                                actAttachesView.r0();
                            }
                        }
                    }
                } else {
                    for (yf2 yf2Var2 : set) {
                        if (yf2Var2 != null) {
                            ActAttachesView actAttachesView2 = (ActAttachesView) yf2Var2;
                            hm9.n("ru.ok.messages.media.attaches.ActAttachesView", "onLoadPrevPage, count = " + arrayListA.size());
                            if (actAttachesView2.f1.getVisibility() == 0 && actAttachesView2.W0 != null) {
                                actAttachesView2.W0.j(FrgChatMediaLoader.r1(arrayListA, ActAttachesView.z1), false);
                                actAttachesView2.W0.d();
                                actAttachesView2.r0();
                            }
                        }
                    }
                }
            }
        }
        this.l = wf2Var.c;
        c();
        if (this.l) {
            return;
        }
        int i = wf2Var.d;
        if (z) {
            if (i >= wf2Var.e) {
                f(e(false));
                return;
            } else {
                c();
                f(e(true));
                return;
            }
        }
        if (i < wf2Var.f) {
            c();
        } else {
            c();
            f(e(true));
        }
    }

    @uae
    public void onEvent(l6f l6fVar) {
        int i = 2;
        if (l6fVar.b == this.a) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                long j = ((es8) it.next()).a.b;
                long j2 = l6fVar.c;
                if (j == j2) {
                    hm9.n("zf2", "onEvent: UpdateMessageEvent id = " + j2);
                    new q1a(1, new lt1(this, j2, i)).m(this.i).i(this.h).k(new iq1(new v02(8, this), 2, ft.f));
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @uae
    public void onEvent(final gf2 gf2Var) {
        boolean z = false;
        Object[] objArr = 0;
        boolean z2 = true;
        char c = 1;
        long j = gf2Var.a;
        long j2 = this.m;
        oz7 oz7Var = ft.f;
        ztc ztcVar = this.h;
        ztc ztcVar2 = this.i;
        long j3 = gf2Var.b;
        if (j == j2) {
            hm9.n("zf2", "onEvent, loadNextPageRequestId");
            this.m = 0L;
            drd drdVarI = new q1a(1, new vi0(this, j3, z)).m(ztcVar2).i(ztcVar);
            final Object[] objArr2 = objArr == true ? 1 : 0;
            drdVarI.k(new iq1(new qj3(this) { // from class: uf2
                public final /* synthetic */ zf2 b;

                {
                    this.b = this;
                }

                @Override // defpackage.qj3
                public final void accept(Object obj) {
                    switch (objArr2) {
                        case 0:
                            zf2 zf2Var = this.b;
                            zf2Var.getClass();
                            gf2 gf2Var2 = gf2Var;
                            zf2Var.f(new wf2((List) obj, true, false, gf2Var2.c, gf2Var2.o, gf2Var2.X));
                            break;
                        default:
                            zf2 zf2Var2 = this.b;
                            zf2Var2.getClass();
                            gf2 gf2Var3 = gf2Var;
                            zf2Var2.f(new wf2((List) obj, false, false, gf2Var3.c, gf2Var3.o, gf2Var3.X));
                            break;
                    }
                }
            }, 2, oz7Var));
        }
        if (gf2Var.a == this.n) {
            hm9.n("zf2", "onEvent, loadPrevPageRequestId");
            this.n = 0L;
            drd drdVarI2 = new q1a(1, new vi0(this, j3, z2)).m(ztcVar2).i(ztcVar);
            final char c2 = c == true ? 1 : 0;
            drdVarI2.k(new iq1(new qj3(this) { // from class: uf2
                public final /* synthetic */ zf2 b;

                {
                    this.b = this;
                }

                @Override // defpackage.qj3
                public final void accept(Object obj) {
                    switch (c2) {
                        case 0:
                            zf2 zf2Var = this.b;
                            zf2Var.getClass();
                            gf2 gf2Var2 = gf2Var;
                            zf2Var.f(new wf2((List) obj, true, false, gf2Var2.c, gf2Var2.o, gf2Var2.X));
                            break;
                        default:
                            zf2 zf2Var2 = this.b;
                            zf2Var2.getClass();
                            gf2 gf2Var3 = gf2Var;
                            zf2Var2.f(new wf2((List) obj, false, false, gf2Var3.c, gf2Var3.o, gf2Var3.X));
                            break;
                    }
                }
            }, 2, oz7Var));
        }
    }

    @uae
    public void onEvent(oi0 oi0Var) {
        if (oi0Var.a == this.m) {
            hm9.k("zf2", "onEvent: chat media error in loading next page");
            this.m = 0L;
            b(true);
        }
        if (oi0Var.a == this.n) {
            hm9.k("zf2", "onEvent: chat media error in loading prev page");
            this.n = 0L;
            b(true);
        }
    }

    @uae
    public void onEvent(ut7 ut7Var) {
        hm9.k("zf2", "onEvent: LoginEvent");
        b(true);
    }

    @uae
    public void onEvent(to4 to4Var) {
        for (yf2 yf2Var : this.o) {
            if (yf2Var != null) {
                ActAttachesView actAttachesView = (ActAttachesView) yf2Var;
                hm9.q("ru.ok.messages.media.attaches.ActAttachesView", "onDownloadError: messageId=$d", Long.valueOf(to4Var.c));
                int i = jpc.E;
                Handler handler = a14.i;
                a14.N(0, actAttachesView, actAttachesView.getString(i));
            }
        }
    }
}
