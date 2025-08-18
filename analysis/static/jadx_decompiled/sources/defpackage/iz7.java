package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public abstract class iz7 {
    public static final /* synthetic */ int a = 0;

    public static l20 a(byte[] bArr) throws ProtoException {
        if (bArr != null && bArr.length > 0) {
            try {
                byte[] bArr2 = b.a;
                try {
                    return b.c(Protos.Attaches.Attach.parseFrom(bArr));
                } catch (InvalidProtocolBufferNanoException e) {
                    throw new ProtoException(e);
                }
            } catch (ProtoException unused) {
            }
        }
        return null;
    }

    public static k8g b(byte[] bArr) throws ProtoException {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            byte[] bArr2 = b.a;
            try {
                return b.e(Protos.Attaches.parseFrom(bArr));
            } catch (InvalidProtocolBufferNanoException e) {
                throw new ProtoException(e);
            }
        } catch (ProtoException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static int c(k8g k8gVar) {
        if (k8gVar == null) {
            return 0;
        }
        if (k8gVar.i() != 1) {
            return k8gVar.i() > 1 ? 4 : 0;
        }
        l20 l20VarH = k8gVar.h(0);
        switch (l20VarH.a.ordinal()) {
            case 1:
            case 8:
            case 10:
            case 11:
            case 13:
                break;
            case 2:
                break;
            case 3:
                if (l20VarH.d.b == 2) {
                }
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 9:
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                break;
            default:
                hm9.p("iz7", "new attach type " + k8gVar.h(0).a + " in calcMediaType method. developer, please add mapping logic for it", null);
                break;
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d2  */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bz d(defpackage.l20 r50) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz7.d(l20):bz");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.l20 e(defpackage.bz r10, defpackage.vxc r11, long r12, long r14) {
        /*
            Method dump skipped, instructions count: 1790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz7.e(bz, vxc, long, long):l20");
    }

    public static wz f(k8g k8gVar) {
        int i;
        int i2;
        ev0 ev0Var;
        if (k8gVar == null) {
            return null;
        }
        wz wzVar = new wz();
        Iterator it = ((List) k8gVar.a).iterator();
        while (it.hasNext()) {
            bz bzVarD = d((l20) it.next());
            if (bzVarD != null) {
                wzVar.add(bzVarD);
            }
        }
        z07 z07Var = (z07) k8gVar.b;
        if (z07Var != null) {
            o9g o9gVar = new o9g(18, false);
            ArrayList arrayList = new ArrayList();
            for (lv0 lv0Var : z07Var.a) {
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                Iterator<E> it2 = lv0Var.iterator();
                while (it2.hasNext()) {
                    fv0 fv0Var = (fv0) it2.next();
                    String str = fv0Var.b.a;
                    ev0[] ev0VarArr = ev0.c;
                    int length = ev0VarArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            ev0Var = ev0.UNKNOWN;
                            break;
                        }
                        ev0Var = ev0VarArr[i3];
                        if (ev0Var.a.equalsIgnoreCase(str)) {
                            break;
                        }
                        i3++;
                    }
                    dv0 dv0Var = dv0.UNKNOWN;
                    int iS = au1.s(fv0Var.c);
                    if (iS == 0) {
                        dv0Var = dv0.DEFAULT;
                    } else if (iS == 1) {
                        dv0Var = dv0.POSITIVE;
                    } else if (iS == 2) {
                        dv0Var = dv0.NEGATIVE;
                    }
                    wf wfVar = new wf();
                    wfVar.c = ev0Var;
                    wfVar.X = dv0Var;
                    wfVar.o = fv0Var.a;
                    wfVar.Y = fv0Var.o;
                    wfVar.Z = fv0Var.X;
                    wfVar.a = fv0Var.Y;
                    wfVar.b = fv0Var.Z;
                    arrayList2.add(new gv0(wfVar));
                }
            }
            o9gVar.b = arrayList;
            wzVar.add(new a17(new jc7(o9gVar), z07Var.b, false, false));
        }
        wgc wgcVar = (wgc) k8gVar.c;
        if (wgcVar != null) {
            ArrayList arrayList3 = new ArrayList();
            for (vgc vgcVar : wgcVar.a) {
                ArrayList arrayList4 = new ArrayList();
                arrayList3.add(arrayList4);
                Iterator<E> it3 = vgcVar.iterator();
                while (it3.hasNext()) {
                    tgc tgcVar = (tgc) it3.next();
                    String strD = z7b.d(tgcVar.a);
                    int[] iArrV = au1.v(5);
                    int length2 = iArrV.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = 0;
                            break;
                        }
                        i = iArrV[i4];
                        if (z7b.e(i).equals(strD)) {
                            break;
                        }
                        i4++;
                    }
                    int i5 = i == 0 ? 5 : i;
                    int iS2 = au1.s(tgcVar.b);
                    if (iS2 == 0) {
                        i2 = 1;
                    } else if (iS2 != 1) {
                        i2 = iS2 != 2 ? 4 : 3;
                    } else {
                        i2 = 2;
                    }
                    arrayList4.add(new ugc(i5, i2, tgcVar.c, y(tgcVar.d), null));
                }
            }
            wzVar.add(new ygc(wgcVar.b, new xgc(arrayList3), false, false));
        }
        return wzVar;
    }

    public static k8g g(wz wzVar, vxc vxcVar) {
        return h(wzVar, vxcVar, 0L, 0L, null);
    }

    public static k8g h(wz wzVar, vxc vxcVar, long j, long j2, sj3 sj3Var) {
        int i;
        int i2;
        long j3;
        m20 m20Var = new m20();
        if (wzVar == null) {
            return m20Var.c();
        }
        Iterator<E> it = wzVar.iterator();
        while (it.hasNext()) {
            bz bzVar = (bz) it.next();
            int iOrdinal = bzVar.a.ordinal();
            if (iOrdinal == 12) {
                m20Var.b = w((a17) bzVar);
            } else if (iOrdinal != 14) {
                m20Var.a(e(bzVar, vxcVar, j, j2));
            } else {
                ygc ygcVar = (ygc) bzVar;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (List<ugc> list : ygcVar.X.a) {
                    vgc vgcVar = new vgc();
                    arrayList.add(vgcVar);
                    for (ugc ugcVar : list) {
                        String strE = z7b.e(ugcVar.a);
                        int[] iArrV = au1.v(5);
                        int length = iArrV.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i = 0;
                                break;
                            }
                            int i4 = iArrV[i3];
                            if (z7b.d(i4).equals(strE)) {
                                i = i4;
                                break;
                            }
                            i3++;
                        }
                        int i5 = i == 0 ? 5 : i;
                        int iS = au1.s(ugcVar.b);
                        if (iS == 0) {
                            i2 = 1;
                        } else if (iS != 1) {
                            i2 = iS != 2 ? 4 : 3;
                        } else {
                            i2 = 2;
                        }
                        tva tvaVar = ugcVar.o;
                        x10 x10Var = tvaVar != null ? x(tvaVar, null).b : null;
                        lna lnaVar = ugcVar.X;
                        if (lnaVar != null) {
                            arrayList2.add(lnaVar);
                            j3 = lnaVar.a;
                        } else {
                            j3 = -1;
                        }
                        vgcVar.add(new tgc(i5, i2, ugcVar.c, x10Var, j3));
                    }
                }
                if (sj3Var != null) {
                    sj3Var.accept(arrayList2);
                }
                m20Var.c = new wgc(arrayList, ygcVar.o);
            }
        }
        return m20Var.c();
    }

    public static b92 i(xq2 xq2Var, b92 b92Var) {
        b92 b92Var2 = b92.h;
        a92 a92Var = new a92();
        a92Var.a = xq2Var.b;
        Long l = xq2Var.c;
        if (l != null) {
            a92Var.e = l.longValue();
        }
        ArrayList arrayList = new ArrayList();
        List list = xq2Var.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iOrdinal = ((jm2) it.next()).ordinal();
                if (iOrdinal == 0) {
                    arrayList.add(y82.a);
                } else if (iOrdinal == 1) {
                    arrayList.add(y82.b);
                } else if (iOrdinal == 2) {
                    arrayList.add(y82.c);
                }
            }
        }
        if (a92Var.b == null) {
            a92Var.b = new ArrayList();
        }
        a92Var.b.addAll(arrayList);
        a92Var.c = b92Var.c;
        a92Var.d = b92Var.d;
        a92Var.f = b92Var.f;
        a92Var.g = b92Var.g;
        return a92Var.b();
    }

    public static ArrayList j(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            op3 op3Var = (op3) it.next();
            String str = op3Var.a;
            int iOrdinal = op3Var.b.ordinal();
            arrayList.add(new jl3(str, iOrdinal != 0 ? iOrdinal != 2 ? iOrdinal != 3 ? null : il3.o : il3.c : il3.a, op3Var.c));
        }
        return arrayList;
    }

    public static ArrayList k(List list) {
        ArrayList arrayList = new ArrayList();
        if (nd7.D(list)) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g9c g9cVar = (g9c) it.next();
            if (g9cVar.b == f9c.o) {
                String str = g9cVar.c;
                if (oag.u(str)) {
                    arrayList.add(new by4(str));
                }
            }
            if (g9cVar.b == f9c.X) {
                long j = g9cVar.a;
                if (j != 0) {
                    arrayList.add(new oi(j));
                }
            }
        }
        return arrayList;
    }

    public static r7b l(s7b s7bVar) {
        if (s7bVar == null) {
            return r7b.c;
        }
        int iS = au1.s(s7bVar.a);
        return new r7b(iS != 1 ? iS != 2 ? iS != 3 ? iS != 4 ? 0 : 40 : 30 : 20 : 10, s7bVar.b);
    }

    public static s7b m(r7b r7bVar) {
        int i = r7bVar.a;
        return new s7b(i != 10 ? i != 20 ? i != 30 ? i != 40 ? 1 : 5 : 4 : 3 : 2, r7bVar.b);
    }

    public static HashMap n(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((Long) entry.getKey(), l((s7b) entry.getValue()));
        }
        return map2;
    }

    public static ArrayList o(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y82 y82Var = (y82) it.next();
            if (y82Var == y82.a) {
                arrayList.add(jm2.SOUND);
            } else if (y82Var == y82.b) {
                arrayList.add(jm2.VIBRATION);
            } else if (y82Var == y82.c) {
                arrayList.add(jm2.LED);
            }
        }
        return arrayList;
    }

    public static ArrayList p(List list, vxc vxcVar) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i9c i9cVar = (i9c) it.next();
            int iS = au1.s(i9cVar.a);
            long j = i9cVar.b;
            if (iS == 1) {
                arrayList.add(new j3e(i9cVar.c, j));
            } else if (iS != 2) {
                Locale locale = Locale.ENGLISH;
                hm9.p("iz7", "Unknown RecentItem " + i9cVar, null);
            } else {
                arrayList.add(new vc6(x(i9cVar.d, vxcVar).b, j));
            }
        }
        return arrayList;
    }

    public static vx8 q(wx8 wx8Var) {
        int iOrdinal;
        vx8 vx8Var = vx8.ACTIVE;
        return (wx8Var == null || (iOrdinal = wx8Var.ordinal()) == 0) ? vx8Var : iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? vx8Var : vx8.DELAYED_FIRE_ERROR : vx8.DELETED : vx8.EDITED;
    }

    public static d2e r(e2e e2eVar) {
        e20 e20Var = new e20();
        e20Var.a = e2eVar.a;
        e20Var.b = e2eVar.b;
        e20Var.c = e2eVar.c;
        e20Var.d = e2eVar.d;
        e20Var.e = e2eVar.e;
        e20Var.f = e2eVar.f;
        e20Var.g = e2eVar.g;
        e20Var.h = e2eVar.h;
        e20Var.i = e2eVar.i;
        int iS = au1.s(e2eVar.j);
        int i = 3;
        e20Var.j = iS != 1 ? iS != 2 ? iS != 3 ? 1 : 4 : 3 : 2;
        e20Var.k = e2eVar.k;
        e20Var.l = e2eVar.l;
        e20Var.m = e2eVar.m;
        int iS2 = au1.s(e2eVar.n);
        if (iS2 == 1) {
            i = 2;
        } else if (iS2 != 2) {
            i = 1;
        }
        e20Var.n = i;
        e20Var.o = e2eVar.o;
        return e20Var.b();
    }

    public static f20 s(d2e d2eVar) {
        e20 e20Var = new e20();
        e20Var.a = d2eVar.a;
        e20Var.d = d2eVar.o;
        e20Var.b = d2eVar.b;
        e20Var.c = d2eVar.c;
        e20Var.f = d2eVar.Y;
        e20Var.g = d2eVar.Z;
        e20Var.i = d2eVar.t0;
        e20Var.h = d2eVar.s0;
        e20Var.e = d2eVar.X;
        int iS = au1.s(d2eVar.u0);
        int i = 3;
        e20Var.j = iS != 1 ? iS != 2 ? iS != 3 ? 1 : 4 : 3 : 2;
        e20Var.k = d2eVar.v0;
        e20Var.l = d2eVar.w0;
        e20Var.m = d2eVar.x0;
        int iS2 = au1.s(d2eVar.y0);
        if (iS2 == 1) {
            i = 2;
        } else if (iS2 != 2) {
            i = 1;
        }
        e20Var.n = i;
        e20Var.o = d2eVar.z0;
        return e20Var.a();
    }

    public static wm3 t(uj3 uj3Var) {
        pq3 pq3Var;
        pq3 pq3Var2;
        int i;
        long jN = uj3Var.n();
        ql3 ql3Var = uj3Var.a;
        pl3 pl3Var = ql3Var.c;
        long j = pl3Var.g;
        String str = pl3Var.c;
        String str2 = pl3Var.d;
        ArrayList arrayList = new ArrayList();
        for (jl3 jl3Var : pl3Var.f) {
            String str3 = jl3Var.a;
            int iOrdinal = jl3Var.c.ordinal();
            np3 np3Var = np3.c;
            np3 np3Var2 = iOrdinal != 0 ? iOrdinal != 2 ? iOrdinal != 3 ? null : np3Var : np3.b : np3.a;
            if (np3Var2 != null) {
                np3Var = np3Var2;
            }
            arrayList.add(new op3(str3, np3Var, jl3Var.b));
        }
        pl3 pl3Var2 = ql3Var.c;
        long j2 = pl3Var2.e;
        nl3 nl3Var = ql3Var.c.i;
        if (nl3Var == null) {
            pq3Var2 = null;
        } else {
            int iOrdinal2 = nl3Var.ordinal();
            if (iOrdinal2 == 0) {
                pq3Var = pq3.BLOCKED;
            } else {
                if (iOrdinal2 != 1) {
                    throw new IllegalArgumentException("No such value for " + nl3Var + " in ContactStatus");
                }
                pq3Var = pq3.REMOVED;
            }
            pq3Var2 = pq3Var;
        }
        int i2 = ql3Var.c.l;
        int iS = au1.s(i2);
        if (iS == 0) {
            i = 1;
        } else if (iS == 1) {
            i = 2;
        } else {
            if (iS != 2) {
                StringBuilder sb = new StringBuilder("No such value for ");
                sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "FEMALE" : "MALE" : "UNKNOWN");
                sb.append(" in ContactInfo.Gender");
                throw new IllegalArgumentException(sb.toString());
            }
            i = 3;
        }
        List list = pl3Var2.n;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iOrdinal3 = ((ll3) it.next()).ordinal();
            if (iOrdinal3 == 0) {
                arrayList2.add(vm3.OFFICIAL);
            } else if (iOrdinal3 == 1) {
                arrayList2.add(vm3.BOT);
            } else if (iOrdinal3 == 2) {
                arrayList2.add(vm3.SERVICE_ACCOUNT);
            } else if (iOrdinal3 == 3) {
                arrayList2.add(vm3.HAS_WEBAPP);
            }
        }
        String str4 = pl3Var2.o;
        kl3 kl3Var = pl3Var2.u;
        return new wm3(jN, j, str, str2, arrayList, j2, pl3Var2.h, pq3Var2, i, arrayList2, str4, pl3Var2.p, pl3Var2.q, kl3Var == null ? null : new jc7(kl3Var.a), pl3Var2.v);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList u(java.util.List r12) {
        /*
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r12 = r12.iterator()
        Ld:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L66
            java.lang.Object r2 = r12.next()
            lu8 r2 = (defpackage.lu8) r2
            if (r2 != 0) goto L1c
            goto Ld
        L1c:
            pu8 r3 = r2.c
            int r3 = r3.ordinal()
            switch(r3) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L33;
                case 8: goto L30;
                case 9: goto L2d;
                case 10: goto L2a;
                case 11: goto L26;
                default: goto L25;
            }
        L25:
            goto Ld
        L26:
            mu8 r3 = defpackage.mu8.v0
        L28:
            r8 = r3
            goto L48
        L2a:
            mu8 r3 = defpackage.mu8.s0
            goto L28
        L2d:
            mu8 r3 = defpackage.mu8.u0
            goto L28
        L30:
            mu8 r3 = defpackage.mu8.t0
            goto L28
        L33:
            mu8 r3 = defpackage.mu8.Z
            goto L28
        L36:
            mu8 r3 = defpackage.mu8.Y
            goto L28
        L39:
            mu8 r3 = defpackage.mu8.X
            goto L28
        L3c:
            mu8 r3 = defpackage.mu8.o
            goto L28
        L3f:
            mu8 r3 = defpackage.mu8.c
            goto L28
        L42:
            mu8 r3 = defpackage.mu8.b
            goto L28
        L45:
            mu8 r3 = defpackage.mu8.a
            goto L28
        L48:
            nu8 r3 = new nu8
            java.util.Map r4 = r2.Y
            if (r4 != 0) goto L50
            r11 = r0
            goto L56
        L50:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>(r4)
            r11 = r5
        L56:
            short r9 = r2.o
            short r10 = r2.X
            long r5 = r2.a
            java.lang.String r7 = r2.b
            r4 = r3
            r4.<init>(r5, r7, r8, r9, r10, r11)
            r1.add(r3)
            goto Ld
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz7.u(java.util.List):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList v(java.util.List r11) {
        /*
            if (r11 != 0) goto L4
            r11 = 0
            return r11
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        Ld:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto La5
            java.lang.Object r1 = r11.next()
            nu8 r1 = (defpackage.nu8) r1
            mu8 r2 = r1.c
            int r2 = r2.ordinal()
            switch(r2) {
                case 0: goto L42;
                case 1: goto L3f;
                case 2: goto L3c;
                case 3: goto L39;
                case 4: goto L36;
                case 5: goto L33;
                case 6: goto L30;
                case 7: goto L2d;
                case 8: goto L2a;
                case 9: goto L27;
                case 10: goto L23;
                default: goto L22;
            }
        L22:
            goto Ld
        L23:
            pu8 r2 = defpackage.pu8.w0
        L25:
            r7 = r2
            goto L45
        L27:
            pu8 r2 = defpackage.pu8.u0
            goto L25
        L2a:
            pu8 r2 = defpackage.pu8.t0
            goto L25
        L2d:
            pu8 r2 = defpackage.pu8.v0
            goto L25
        L30:
            pu8 r2 = defpackage.pu8.s0
            goto L25
        L33:
            pu8 r2 = defpackage.pu8.Z
            goto L25
        L36:
            pu8 r2 = defpackage.pu8.Y
            goto L25
        L39:
            pu8 r2 = defpackage.pu8.X
            goto L25
        L3c:
            pu8 r2 = defpackage.pu8.o
            goto L25
        L3f:
            pu8 r2 = defpackage.pu8.c
            goto L25
        L42:
            pu8 r2 = defpackage.pu8.b
            goto L25
        L45:
            lu8 r2 = new lu8
            int r3 = r1.d
            short r8 = (short) r3
            int r3 = r1.e
            short r9 = (short) r3
            java.util.Map r3 = r1.f
            if (r3 == 0) goto L93
            int r4 = r3.size()
            if (r4 != 0) goto L58
            goto L93
        L58:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L65:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L91
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getValue()
            boolean r6 = r6 instanceof java.io.Serializable
            if (r6 == 0) goto L89
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            java.io.Serializable r5 = (java.io.Serializable) r5
            r4.put(r6, r5)
            goto L65
        L89:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "attribute must be Serializable"
            r11.<init>(r0)
            throw r11
        L91:
            r10 = r4
            goto L98
        L93:
            java.util.Map r3 = java.util.Collections.emptyMap()
            r10 = r3
        L98:
            long r4 = r1.a
            java.lang.String r6 = r1.b
            r3 = r2
            r3.<init>(r4, r6, r7, r8, r9, r10)
            r0.add(r2)
            goto Ld
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz7.v(java.util.List):java.util.ArrayList");
    }

    public static z07 w(a17 a17Var) {
        nv0 nv0Var;
        int i;
        int i2 = z07.c;
        y07 y07Var = new y07();
        List<List> list = (List) a17Var.o.a;
        ArrayList arrayList = new ArrayList();
        for (List<gv0> list2 : list) {
            lv0 lv0Var = new lv0();
            arrayList.add(lv0Var);
            for (gv0 gv0Var : list2) {
                String str = gv0Var.a.a;
                nv0[] nv0VarArr = nv0.u0;
                int length = nv0VarArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        nv0Var = nv0.UNKNOWN;
                        break;
                    }
                    nv0Var = nv0VarArr[i3];
                    if (nv0Var.a.equalsIgnoreCase(str)) {
                        break;
                    }
                    i3++;
                }
                int iOrdinal = gv0Var.c.ordinal();
                if (iOrdinal != 0) {
                    i = 2;
                    if (iOrdinal != 1) {
                        i = iOrdinal != 2 ? 4 : 3;
                    }
                } else {
                    i = 1;
                }
                cv0 cv0Var = new cv0(gv0Var.b, nv0Var, i);
                cv0Var.d = gv0Var.o;
                cv0Var.e = gv0Var.X;
                cv0Var.f = gv0Var.Y;
                cv0Var.h = gv0Var.Z;
                lv0Var.add(new fv0(cv0Var));
            }
        }
        y07Var.a = arrayList;
        y07Var.b = a17Var.X;
        return new z07(y07Var);
    }

    public static l20 x(tva tvaVar, vxc vxcVar) {
        x10 x10Var = x10.w0;
        w10 w10Var = new w10();
        String str = tvaVar.o;
        if (str != null) {
            w10Var.a = str;
        }
        String str2 = tvaVar.X;
        if (str2 != null) {
            w10Var.b = str2;
        }
        Integer num = tvaVar.Y;
        if (num != null) {
            w10Var.c = num.intValue();
        }
        Integer num2 = tvaVar.Z;
        if (num2 != null) {
            w10Var.d = num2.intValue();
        }
        w10Var.e = tvaVar.s0;
        byte[] bArr = tvaVar.t0;
        if (bArr != null && bArr.length > 0) {
            try {
                vxcVar.getClass();
                w10Var.f = bArr;
            } catch (Throwable unused) {
                w10Var.f = bArr;
            }
        }
        Long l = tvaVar.w0;
        if (l != null) {
            w10Var.h = l.longValue();
        }
        String str3 = tvaVar.v0;
        if (str3 != null) {
            w10Var.i = str3;
        }
        String str4 = tvaVar.u0;
        if (str4 != null) {
            w10Var.g = str4;
        }
        w10Var.k = tvaVar.x0;
        x10 x10VarA = w10Var.a();
        int i = l20.A;
        j10 j10Var = new j10();
        j10Var.l = UUID.randomUUID().toString();
        j10Var.a = g20.c;
        j10Var.n = tvaVar.b;
        j10Var.z = tvaVar.c;
        j10Var.b = x10VarA;
        return j10Var.a();
    }

    public static tva y(x10 x10Var) {
        if (x10Var == null) {
            return null;
        }
        String str = !oag.t(x10Var.a) ? x10Var.a : null;
        String str2 = x10Var.b;
        String str3 = !oag.t(str2) ? str2 : null;
        int i = x10Var.c;
        Integer numValueOf = i > 0 ? Integer.valueOf(i) : null;
        int i2 = x10Var.o;
        Integer numValueOf2 = i2 > 0 ? Integer.valueOf(i2) : null;
        byte[] bArr = x10Var.Y;
        byte[] bArr2 = (bArr == null || bArr.length <= 0) ? null : bArr;
        String str4 = x10Var.t0;
        String str5 = !oag.t(str4) ? str4 : null;
        String str6 = x10Var.Z;
        String str7 = !oag.t(str6) ? str6 : null;
        String str8 = x10Var.v0;
        return new tva(str, str3, numValueOf, numValueOf2, x10Var.X, bArr2, Long.valueOf(x10Var.s0), str5, str7, false, false, !oag.t(str8) ? str8 : null);
    }
}
