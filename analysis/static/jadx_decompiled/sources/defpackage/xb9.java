package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xb9 implements qu7 {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final ox3 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final aj9 s0 = bj9.a();
    public final xs t0 = new xs(0);
    public final es7 u0;

    public xb9(je7 je7Var, je7 je7Var2, ox3 ox3Var, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7) {
        this.a = ox3Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.o = je7Var4;
        this.X = je7Var5;
        this.Y = je7Var6;
        this.Z = je7Var7;
        this.u0 = new es7(je7Var);
        ((dr9) je7Var7.getValue()).c.d = new kb9(this, null);
    }

    public static void e(fs8 fs8Var, gi9 gi9Var, gi9 gi9Var2, int i, boolean z) {
        fs8 fs8Var2;
        gi9Var.a(fs8Var.o);
        wz wzVar = fs8Var.s0;
        if (!wzVar.isEmpty()) {
            Iterator<E> it = wzVar.iterator();
            while (it.hasNext()) {
                bz bzVar = (bz) it.next();
                b10 b10Var = bzVar.a;
                int i2 = b10Var == null ? -1 : lb9.$EnumSwitchMapping$0[b10Var.ordinal()];
                if (i2 == 1) {
                    ju3 ju3Var = (ju3) bzVar;
                    Long l = ju3Var.X;
                    if (l != null) {
                        gi9Var.a(l.longValue());
                    }
                    List<Long> list = ju3Var.Y;
                    if (list != null) {
                        for (Long l2 : list) {
                            if (l2 != null) {
                                gi9Var.a(l2.longValue());
                            }
                        }
                    }
                } else if (i2 == 2) {
                    List list2 = ((x01) bzVar).t0;
                    if (list2 != null) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            gi9Var.a(((Long) it2.next()).longValue());
                        }
                    }
                } else if (i2 == 3) {
                    gi9Var.a(((zj3) bzVar).X);
                }
            }
        }
        aw8 aw8Var = fs8Var.t0;
        if (aw8Var == null || (fs8Var2 = aw8Var.c) == null || i <= 0) {
            return;
        }
        if (z) {
            e(fs8Var2, gi9Var2, gi9Var2, i - 1, true);
        } else {
            e(fs8Var2, gi9Var, gi9Var2, i - 1, true);
        }
    }

    public static void f(cu8 cu8Var, gi9 gi9Var, gi9 gi9Var2, int i, boolean z) {
        List list;
        n10 n10Var;
        gi9Var.a(cu8Var.Y);
        k8g k8gVar = cu8Var.z0;
        if (k8gVar != null) {
            int i2 = k8gVar.i();
            for (int i3 = 0; i3 < i2; i3++) {
                l20 l20VarH = k8gVar.h(i3);
                if (l20VarH != null) {
                    g20 g20Var = l20VarH.a;
                    int i4 = g20Var == null ? -1 : lb9.$EnumSwitchMapping$1[g20Var.ordinal()];
                    if (i4 == 1) {
                        q10 q10Var = l20VarH.c;
                        if (q10Var != null) {
                            gi9Var.a(q10Var.b);
                            Iterator it = q10Var.c.iterator();
                            while (it.hasNext()) {
                                gi9Var.a(((Number) it.next()).longValue());
                            }
                        }
                    } else if (i4 == 2) {
                        l10 l10Var = l20VarH.i;
                        if (l10Var != null && (list = l10Var.f) != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                gi9Var.a(((Number) it2.next()).longValue());
                            }
                        }
                    } else if (i4 == 3 && (n10Var = l20VarH.k) != null) {
                        gi9Var.a(n10Var.b);
                    }
                }
            }
        }
        cu8 cu8Var2 = cu8Var.C0;
        if (cu8Var2 != null && i > 0) {
            if (z) {
                f(cu8Var2, gi9Var2, gi9Var2, i - 1, true);
            } else {
                f(cu8Var2, gi9Var, gi9Var2, i - 1, true);
            }
        }
    }

    @Override // defpackage.qu7
    public final void a() {
    }

    public final List b(gi9 gi9Var) {
        boolean zI = i();
        nz4 nz4Var = nz4.a;
        if (zI && !gi9Var.i()) {
            gi9 gi9Var2 = new gi9((Object) null);
            long[] jArr = gi9Var.b;
            long[] jArr2 = gi9Var.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr2[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8;
                        int i3 = 8 - ((~(i - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                long j2 = jArr[(i << 3) + i4];
                                if (!((Boolean) this.u0.invoke(Long.valueOf(j2))).booleanValue()) {
                                    gi9Var2.a(j2);
                                }
                                i2 = 8;
                            }
                            j >>= i2;
                        }
                        if (i3 != i2) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            gi9Var.m(gi9Var2);
            if (i() && !gi9Var.i()) {
                return oag.F(gi9Var);
            }
        }
        return nz4Var;
    }

    public final void c(gi9 gi9Var, f52 f52Var, gi9 gi9Var2) {
        boolean z = f52Var.X0 == 2;
        Iterator it = f52Var.o.keySet().iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (z) {
                gi9Var.a(jLongValue);
            } else {
                gi9Var2.a(jLongValue);
            }
        }
        Map map = f52Var.M0;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Long l = (Long) entry.getKey();
                ca caVar = (ca) entry.getValue();
                gi9Var2.a(l.longValue());
                gi9Var2.a(caVar.c);
            }
        }
        fs8 fs8Var = f52Var.t0;
        if (fs8Var != null) {
            e(fs8Var, gi9Var, gi9Var2, 5, false);
        }
        fs8 fs8Var2 = f52Var.H0;
        if (fs8Var2 != null) {
            e(fs8Var2, gi9Var, gi9Var2, 5, false);
        }
        gi9Var2.a(f52Var.c);
    }

    public final gi9 d(List list, gi9 gi9Var) {
        gi9 gi9Var2 = new gi9(list.size());
        if (list.isEmpty()) {
            return gi9Var2;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c(gi9Var2, (f52) it.next(), gi9Var);
        }
        return gi9Var2;
    }

    public final void g(List list, gi9 gi9Var, gi9 gi9Var2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((fs8) it.next(), gi9Var, gi9Var2, 5, false);
        }
    }

    public final dr9 h() {
        return (dr9) this.Z.getValue();
    }

    public final boolean i() {
        return !(((jbd) ((hbd) ((ch3) this.Y.getValue()).d.getValue())).h == 1);
    }

    public final Object j(long j, List list, Continuation continuation) {
        return j1e.k(new pb9(list, this, j, null), continuation);
    }

    public final void k(f52 f52Var) throws Throwable {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "MissedContactsController", "requestForChat: chat=" + f52Var, null);
        }
        gi9 gi9Var = new gi9((Object) null);
        gi9 gi9VarD = d(Collections.singletonList(f52Var), gi9Var);
        h().c(gi9Var);
        if (gi9VarD.i()) {
            return;
        }
        List listB = b(gi9VarD);
        if (listB.isEmpty()) {
            return;
        }
        j47.f0(hz4.a, new qb9(this, listB, null));
    }

    public final Object l(dc2 dc2Var, long j, Continuation continuation) {
        Object objJ;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            f52 f52Var = dc2Var.o;
            ir6Var.d(us7Var, "MissedContactsController", "requestForChatHistory: response=" + (f52Var != null ? new Long(f52Var.a) : null), null);
        }
        gi9 gi9Var = new gi9((Object) null);
        gi9 gi9Var2 = new gi9((Object) null);
        g(dc2Var.c, gi9Var, gi9Var2);
        f52 f52Var2 = dc2Var.o;
        if (f52Var2 != null) {
            c(gi9Var, f52Var2, gi9Var2);
        }
        h().c(gi9Var2);
        List listB = b(gi9Var);
        boolean zIsEmpty = listB.isEmpty();
        e5f e5fVar = e5f.a;
        return (!zIsEmpty && (objJ = j(j, listB, continuation)) == tx3.a) ? objJ : e5fVar;
    }

    public final void m(lc2 lc2Var) throws Throwable {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "MissedContactsController", "requestForChatInfo: response=" + lc2Var, null);
        }
        gi9 gi9Var = new gi9((Object) null);
        gi9 gi9VarD = d(lc2Var.c, gi9Var);
        f52 f52Var = lc2Var.o;
        if (f52Var != null) {
            c(gi9VarD, f52Var, gi9Var);
        }
        h().c(gi9Var);
        if (gi9VarD.i()) {
            return;
        }
        List listB = b(gi9VarD);
        if (listB.isEmpty()) {
            return;
        }
        j47.f0(hz4.a, new rb9(this, listB, null));
    }

    public final void n(List list) throws Throwable {
        if (list == null || list.isEmpty()) {
            return;
        }
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "MissedContactsController", "requestForChats: chats=".concat(x53.n0(list, null, null, null, null, 63)), null);
        }
        gi9 gi9Var = new gi9((Object) null);
        gi9 gi9VarD = d(list, gi9Var);
        h().c(gi9Var);
        if (gi9VarD.i()) {
            return;
        }
        List listB = b(gi9VarD);
        if (listB.isEmpty()) {
            return;
        }
        j47.f0(hz4.a, new sb9(this, listB, null));
    }

    public final Object o(e52 e52Var, Continuation continuation) {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "MissedContactsController", "requestForChat: chat=" + e52Var, null);
        }
        gi9 gi9Var = new gi9((Object) null);
        gi9 gi9Var2 = new gi9((Object) null);
        boolean zM = e52Var.M();
        Iterator it = e52Var.b.e.keySet().iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (zM) {
                gi9Var2.a(jLongValue);
            } else {
                gi9Var.a(jLongValue);
            }
        }
        Map map = e52Var.b.R;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Long l = (Long) entry.getKey();
                t82 t82Var = (t82) entry.getValue();
                gi9Var.a(l.longValue());
                gi9Var.a(t82Var.c);
            }
        }
        es8 es8Var = e52Var.c;
        if (es8Var != null) {
            f(es8Var.a, gi9Var2, gi9Var, 5, false);
        }
        es8 es8Var2 = e52Var.X;
        if (es8Var2 != null) {
            f(es8Var2.a, gi9Var2, gi9Var, 5, false);
        }
        gi9Var.a(e52Var.b.d);
        h().c(gi9Var);
        boolean zI = gi9Var2.i();
        e5f e5fVar = e5f.a;
        if (zI) {
            return e5fVar;
        }
        List listB = b(gi9Var2);
        if (listB.isEmpty()) {
            return e5fVar;
        }
        int i = ft4.o;
        Object objJ = j(z7.R(10, kt4.SECONDS), listB, continuation);
        return objJ == tx3.a ? objJ : e5fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.kt7 r8, long r9, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.tb9
            if (r0 == 0) goto L13
            r0 = r11
            tb9 r0 = (defpackage.tb9) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            tb9 r0 = new tb9
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            gi9 r7 = r0.X
            xb9 r8 = r0.o
            defpackage.od2.a0(r11)
            r2 = r7
            r7 = r8
            goto Lb8
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.od2.a0(r11)
            java.lang.String r11 = "requestForLogin"
            java.lang.String r2 = "MissedContactsController"
            defpackage.hm9.n(r2, r11)
            java.util.ArrayList r11 = r8.c()
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.z53.S(r11, r4)
            r2.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
        L53:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r11.next()
            wm3 r4 = (defpackage.wm3) r4
            long r4 = r4.a
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            r2.add(r6)
            goto L53
        L6a:
            gi9 r11 = defpackage.oag.G(r2)
            gi9 r2 = new gi9
            r4 = 0
            r2.<init>(r4)
            java.util.List r4 = r8.o
            gi9 r4 = r7.d(r4, r2)
            java.util.Map r5 = r8.u0
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L84:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L94
            java.lang.Object r6 = r5.next()
            java.util.List r6 = (java.util.List) r6
            r7.g(r6, r4, r2)
            goto L84
        L94:
            r4.m(r11)
            nab r8 = r8.c
            if (r8 == 0) goto La4
            wm3 r8 = r8.a
            if (r8 == 0) goto La4
            long r5 = r8.a
            r4.l(r5)
        La4:
            r2.m(r11)
            java.util.List r8 = r7.b(r4)
            r0.o = r7
            r0.X = r2
            r0.s0 = r3
            java.lang.Object r8 = r7.j(r9, r8, r0)
            if (r8 != r1) goto Lb8
            return r1
        Lb8:
            dr9 r7 = r7.h()
            r7.c(r2)
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb9.p(kt7, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void q(hs9 hs9Var) throws Throwable {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "MissedContactsController", "requestForNotifMessage: response=" + hs9Var, null);
        }
        gi9 gi9Var = new gi9((Object) null);
        gi9 gi9Var2 = new gi9((Object) null);
        e(hs9Var.X, gi9Var, gi9Var2, 5, false);
        f52 f52Var = hs9Var.o;
        if (f52Var != null) {
            c(gi9Var, f52Var, gi9Var2);
        }
        h().c(gi9Var2);
        if (gi9Var.i()) {
            return;
        }
        List listB = b(gi9Var);
        if (listB.isEmpty()) {
            return;
        }
        j47.f0(hz4.a, new ub9(this, listB, null));
    }

    public final void r(at9 at9Var) {
        long j = at9Var.o;
        gi9 gi9Var = vv7.a;
        gi9 gi9Var2 = new gi9(1);
        gi9Var2.b[gi9Var2.e(j)] = j;
        List listB = b(gi9Var2);
        if (listB.isEmpty()) {
            return;
        }
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "MissedContactsController", "requestForTyping: id=#" + x53.g0(listB), null);
        }
        h().d(listB);
    }

    public final Object s(long j, long j2, Continuation continuation) {
        Object objJ;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "MissedContactsController", ey8.h(j, "requestForUser: id=#"), null);
        }
        gi9 gi9Var = vv7.a;
        gi9 gi9Var2 = new gi9(1);
        gi9Var2.b[gi9Var2.e(j)] = j;
        List listB = b(gi9Var2);
        boolean zIsEmpty = listB.isEmpty();
        e5f e5fVar = e5f.a;
        return (!zIsEmpty && (objJ = j(j2, listB, continuation)) == tx3.a) ? objJ : e5fVar;
    }

    public final Object t(gi9 gi9Var, long j, Continuation continuation) {
        List listB = b(gi9Var);
        boolean zIsEmpty = listB.isEmpty();
        e5f e5fVar = e5f.a;
        if (zIsEmpty) {
            return e5fVar;
        }
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "MissedContactsController", zr6.i("requestForUsers: ids=[", x53.n0(listB, null, null, null, null, 63), "]"), null);
        }
        Object objJ = j(j, listB, continuation);
        return objJ == tx3.a ? objJ : e5fVar;
    }

    public final void u(def defVar) {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "MissedContactsController", "requestForVideoConference: videoConference=" + defVar, null);
        }
        wm3 wm3Var = defVar.a;
        if (wm3Var != null) {
            h().b(wm3Var.a);
        }
    }
}
