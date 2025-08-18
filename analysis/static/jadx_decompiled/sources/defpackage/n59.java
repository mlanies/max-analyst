package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class n59 extends pnf {
    public static final /* synthetic */ bc7[] D1 = {new oi9(n59.class, "markAsUnreadJob", "getMarkAsUnreadJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, n59.class, "markMessageAsReadJob", "getMarkMessageAsReadJob()Lkotlinx/coroutines/Job;"), new oi9(n59.class, "attachClickJob", "getAttachClickJob()Lkotlinx/coroutines/Job;"), new oi9(n59.class, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;"), new oi9(n59.class, "keyboardActionJob", "getKeyboardActionJob()Lkotlinx/coroutines/Job;"), new oi9(n59.class, "saveVideoProgressJob", "getSaveVideoProgressJob()Lkotlinx/coroutines/Job;")};
    public final String A0;
    public final q0e A1;
    public final nx3 B0;
    public final w7c B1;
    public final je7 C0;
    public int C1;
    public final je7 D0;
    public final je7 E0;
    public final je7 F0;
    public final je7 G0;
    public final je7 H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final je7 L0;
    public final je7 M0;
    public final je7 N0;
    public final je7 O0;
    public final je7 P0;
    public final je7 Q0;
    public final je7 R0;
    public final je7 S0;
    public final je7 T0;
    public final je7 U0;
    public final je7 V0;
    public final je7 W0;
    public final pz7 X;
    public final je7 X0;
    public final kke Y;
    public final je7 Y0;
    public final z3b Z;
    public final je7 Z0;
    public final je7 a1;
    public final v69 b;
    public final je7 b1;
    public final rg1 c;
    public final je7 c1;
    public final je7 d1;
    public final je7 e1;
    public final je7 f1;
    public final s35 g1;
    public final adb h1;
    public final w4d i1;
    public final w4d j1;
    public final w4d k1;
    public final w4d l1;
    public final w4d m1;
    public final w4d n1;
    public final t29 o;
    public final w7c o1;
    public final q0e p1;
    public final w7c q1;
    public final w7c r1;
    public final iy2 s0;
    public final khe s1;
    public final p31 t0;
    public final khe t1;
    public final qz7 u0;
    public final s35 u1;
    public final qrc v0;
    public final s35 v1;
    public final fc3 w0;
    public final ConcurrentHashMap w1;
    public final m5d x0;
    public final HashSet x1;
    public final q33 y0;
    public final khe y1;
    public final i00 z0;
    public final mn5 z1;

    public n59(v69 v69Var, rg1 rg1Var, bx bxVar, pz7 pz7Var, y7g y7gVar) {
        uj3 uj3VarL;
        o19 o19Var = o19.a;
        kke dispatchers = o19Var.getDispatchers();
        z3b z3bVar = (z3b) o19Var.getAccessor().c(z3b.class);
        iy2 iy2Var = (iy2) o19Var.getAccessor().c(iy2.class);
        p31 p31Var = new p31(o19Var.getAccessor().d(y7d.class), o19Var.getAccessor().d(qe5.class), o19Var.getAccessor().d(y4e.class), 1);
        qz7 qz7Var = new qz7((je7) o19Var.getAccessor().d(p7c.class));
        qrc qrcVarB = o19Var.b();
        Context context = (Context) o19Var.getAccessor().c(Context.class);
        nx3 nx3VarB = ((w9a) ((kke) o19Var.getAccessor().c(kke.class))).b();
        khe kheVarD = o19Var.getAccessor().d(gh3.class);
        khe kheVarD2 = o19Var.getAccessor().d(r79.class);
        qrc qrcVarB2 = o19Var.b();
        fc3 fc3Var = new fc3();
        fc3Var.a = context;
        fc3Var.b = nx3VarB;
        fc3Var.c = qrcVarB2;
        fc3Var.o = kheVarD2;
        fc3Var.X = kheVarD;
        fc3Var.Y = tu0.r(3, new zf3(10));
        fc3Var.Z = tu0.r(3, new zf3(11));
        m5d m5dVar = new m5d(o19Var.getAccessor().d(pk.class), o19Var.getAccessor().d(av0.class), o19Var.getAccessor().d(r79.class));
        q33 q33Var = (q33) o19Var.getAccessor().c(q33.class);
        i00 i00Var = (i00) o19Var.getAccessor().c(i00.class);
        khe kheVarD3 = o19Var.getAccessor().d(pk.class);
        khe kheVarD4 = o19Var.getAccessor().d(wha.class);
        khe kheVarD5 = o19Var.getAccessor().d(Application.class);
        khe kheVarD6 = o19Var.getAccessor().d(y7d.class);
        khe kheVarD7 = o19Var.getAccessor().d(ds3.class);
        khe kheVarD8 = o19Var.getAccessor().d(r79.class);
        khe kheVarD9 = o19Var.getAccessor().d(ns8.class);
        khe kheVarD10 = o19Var.getAccessor().d(hu8.class);
        khe kheVarD11 = o19Var.getAccessor().d(mm2.class);
        khe kheVarD12 = o19Var.getAccessor().d(u79.class);
        khe kheVarD13 = o19Var.getAccessor().d(kt8.class);
        khe kheVarD14 = o19Var.getAccessor().d(tp7.class);
        khe kheVarD15 = o19Var.getAccessor().d(ps2.class);
        khe kheVarD16 = o19Var.getAccessor().d(o89.class);
        khe kheVarD17 = o19Var.getAccessor().d(mw8.class);
        khe kheVarD18 = o19Var.getAccessor().d(lx8.class);
        khe kheVarD19 = o19Var.getAccessor().d(k6f.class);
        khe kheVarD20 = o19Var.getAccessor().d(pf5.class);
        av0 av0Var = (av0) o19Var.getAccessor().c(av0.class);
        kke dispatchers2 = o19Var.getDispatchers();
        long j = v69Var.a;
        v19 v19Var = new v19(j, av0Var, dispatchers2);
        a79 a79Var = new a79((av0) o19Var.getAccessor().c(av0.class), o19Var.getDispatchers());
        khe kheVarD21 = o19Var.getAccessor().d(s8g.class);
        khe kheVarD22 = o19Var.getAccessor().d(al.class);
        khe kheVarD23 = o19Var.getAccessor().d(vj7.class);
        khe kheVarD24 = o19Var.getAccessor().d(gh3.class);
        khe kheVarD25 = o19Var.getAccessor().d(gj.class);
        khe kheVarD26 = o19Var.getAccessor().d(ab6.class);
        khe kheVarD27 = o19Var.getAccessor().d(ge2.class);
        khe kheVarD28 = o19Var.getAccessor().d(wrc.class);
        khe kheVarD29 = o19Var.getAccessor().d(bt1.class);
        khe kheVarD30 = o19Var.getAccessor().d(jhf.class);
        khe kheVarD31 = o19Var.getAccessor().d(uva.class);
        khe kheVarD32 = o19Var.getAccessor().d(pb6.class);
        this.b = v69Var;
        this.c = rg1Var;
        this.o = bxVar;
        this.X = pz7Var;
        this.Y = dispatchers;
        this.Z = z3bVar;
        this.s0 = iy2Var;
        this.t0 = p31Var;
        this.u0 = qz7Var;
        this.v0 = qrcVarB;
        this.w0 = fc3Var;
        this.x0 = m5dVar;
        this.y0 = q33Var;
        this.z0 = i00Var;
        this.A0 = n59.class.getName();
        w9a w9aVar = (w9a) dispatchers;
        this.B0 = w9aVar.b().limitedParallelism(1, "messages-list-vm-io");
        this.C0 = kheVarD3;
        this.D0 = kheVarD6;
        this.E0 = kheVarD5;
        this.F0 = kheVarD9;
        this.G0 = kheVarD8;
        this.H0 = kheVarD12;
        this.I0 = kheVarD4;
        this.J0 = kheVarD7;
        this.K0 = kheVarD17;
        this.L0 = kheVarD10;
        this.M0 = kheVarD13;
        this.N0 = kheVarD11;
        this.O0 = kheVarD15;
        this.P0 = kheVarD14;
        this.Q0 = kheVarD18;
        this.R0 = kheVarD19;
        this.S0 = kheVarD20;
        this.T0 = kheVarD21;
        this.U0 = kheVarD22;
        this.V0 = kheVarD23;
        this.W0 = kheVarD24;
        this.X0 = kheVarD25;
        this.Y0 = kheVarD26;
        this.Z0 = kheVarD27;
        this.a1 = kheVarD28;
        this.b1 = kheVarD29;
        this.c1 = kheVarD16;
        this.d1 = kheVarD30;
        this.e1 = kheVarD31;
        this.f1 = kheVarD32;
        this.g1 = new s35(0);
        List listM = y53.M(new r92(y7gVar), new i32());
        adb adbVar = new adb();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (obj instanceof r29) {
                arrayList.add(obj);
            }
        }
        adbVar.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            it.next();
        }
        adbVar.b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = listM.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        adbVar.c = arrayList3;
        this.h1 = adbVar;
        this.i1 = mqd.D();
        this.j1 = mqd.D();
        this.k1 = mqd.D();
        this.l1 = mqd.D();
        this.m1 = mqd.D();
        this.n1 = mqd.D();
        w7c w7cVarM = ((jz2) iy2Var).m(j);
        this.o1 = w7cVarM;
        q0e q0eVarA = r0e.a(l29.o);
        this.p1 = q0eVarA;
        w7c w7cVar = new w7c(q0eVarA);
        this.q1 = w7cVar;
        Continuation continuation = null;
        j31 j31Var = new j31(w7cVarM, w7cVar, new c3(this, continuation, 19), 4);
        nz4 nz4Var = nz4.a;
        c32 c32Var = wld.a;
        this.r1 = od2.X(j31Var, this.a, c32Var, nz4Var);
        final int i = 0;
        this.s1 = new khe(new k56(this) { // from class: i39
            public final /* synthetic */ n59 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        n59 n59Var = this.b;
                        return new w5f(n59Var.o1, n59Var.q1, n59Var.a, n59Var.Y);
                    default:
                        n59 n59Var2 = this.b;
                        return new l89(n59Var2.b, n59Var2.B0, n59Var2.a, n59Var2.o1, n59Var2.q1, new vw(2, n59Var2, n59.class, "processReactionEffect", "processReactionEffect(Ljava/util/Set;J)V", 0, 29), new wz7(8, n59Var2));
                }
            }
        });
        final int i2 = 1;
        this.t1 = new khe(new k56(this) { // from class: i39
            public final /* synthetic */ n59 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        n59 n59Var = this.b;
                        return new w5f(n59Var.o1, n59Var.q1, n59Var.a, n59Var.Y);
                    default:
                        n59 n59Var2 = this.b;
                        return new l89(n59Var2.b, n59Var2.B0, n59Var2.a, n59Var2.o1, n59Var2.q1, new vw(2, n59Var2, n59.class, "processReactionEffect", "processReactionEffect(Ljava/util/Set;J)V", 0, 29), new wz7(8, n59Var2));
                }
            }
        });
        this.u1 = new s35(0);
        this.v1 = new s35(0);
        this.w1 = new ConcurrentHashMap(0);
        this.x1 = new HashSet();
        this.y1 = new khe(new yf3(kheVarD9, 18, this));
        this.z1 = od2.F(new m58(q0eVarA, 7), w9aVar.a());
        q0e q0eVarA2 = r0e.a(null);
        this.A1 = q0eVarA2;
        m58 m58Var = new m58(q0eVarA, 8);
        t03 t03Var = new t03(w7cVarM, 11);
        e52 e52Var = (e52) w7cVarM.a.getValue();
        this.B1 = od2.X(od2.F(od2.s(m58Var, t03Var, q0eVarA2, od2.w((e52Var == null || (uj3VarL = e52Var.l()) == null) ? new qn5(3, null) : new t03(((ds3) this.J0.getValue()).c(uj3VarL.n()), 11), new ai0(18)), new ik1(this, continuation, 1)), w9aVar.b()), this.a, c32Var, null);
        od2.L(od2.F(new zn5(new mqc(new j59(new j31(new t03(w7cVarM, 11), bxVar.B, new xh0(3, continuation, 20), 4), null, this)), new j39(this, null), 5), w9aVar.a()), this.a);
        pnf.n(this, w9aVar.b(), null, new k39(this, null), 2);
        od2.L(new zn5(v19Var.e, new l39(this, null), 5), this.a);
        od2.L(new zn5(new v7c(a79Var.a), new m39(this, null), 5), this.a);
        ((uh9) z3bVar.a).e(z3bVar.g);
        z3bVar.b();
        j47.T(this.a, null, null, new n39(this, null), 3);
    }

    public static final xz4 q(n59 n59Var, ml3 ml3Var, e52 e52Var, eqe eqeVar, eqe eqeVar2) {
        CharSequence charSequenceA;
        x10 x10Var;
        n59Var.getClass();
        String str = ml3Var.b;
        if (str != null) {
            pb6 pb6Var = (pb6) n59Var.f1.getValue();
            List list = ml3Var.c;
            if (list == null) {
                list = nz4.a;
            }
            charSequenceA = pb6Var.a(str, list);
        } else {
            charSequenceA = "";
        }
        l20 l20Var = ml3Var.a;
        yt6 yt6VarA = (l20Var == null || (x10Var = l20Var.b) == null) ? null : ((uva) n59Var.e1.getValue()).a(x10Var, l20Var);
        jqe iqeVar = eqeVar;
        if (charSequenceA.length() > 0) {
            iqeVar = new iqe(charSequenceA);
        }
        jqe jqeVar = iqeVar;
        jqe jqeVar2 = eqeVar2;
        if (charSequenceA.length() > 0) {
            jqeVar2 = jqe.a;
        }
        jqe jqeVar3 = jqeVar2;
        String strG = e52Var.g(kk0.c, jk0.a);
        uj3 uj3VarL = e52Var.l();
        return new xz4(strG, uj3VarL != null ? uj3VarL.m() : null, e52Var.f(), yt6VarA, jqeVar, jqeVar3);
    }

    public static final r79 r(n59 n59Var) {
        return (r79) n59Var.G0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.n59 r12, defpackage.cu8 r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n59.s(n59, cu8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.n59 r28, defpackage.cu8 r29, kotlin.coroutines.Continuation r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n59.t(n59, cu8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void u(n59 n59Var) {
        wha whaVarC = n59Var.C();
        whaVarC.e(new kia(woc.I));
        whaVarC.g(new eqe(oda.h0));
        n59Var.M(whaVarC);
        whaVarC.i();
    }

    public final eg9 A() {
        return (eg9) this.y1.getValue();
    }

    public final l89 B() {
        return (l89) this.t1.getValue();
    }

    public final wha C() {
        return (wha) this.I0.getValue();
    }

    public final w5f D() {
        return (w5f) this.s1.getValue();
    }

    public final void E(String str) {
        vxd vxdVarS = j47.S(this.a, ((w9a) this.Y).b(), vx3.b, new a49(this, str, null));
        this.l1.o1(this, D1[3], vxdVarS);
    }

    public final void F(String str) {
        String strA;
        if (str == null || (strA = ((fl7) ((al) this.U0.getValue())).a(str)) == null) {
            return;
        }
        E(strA);
    }

    public final void G(long j) {
        j47.T(this.a, null, null, new c49(this, j, null), 3);
    }

    public final boolean H(o00 o00Var, long j, String str) {
        if (A().d()) {
            A().e(j);
            return true;
        }
        if (o00Var instanceof bk3) {
            return false;
        }
        if (((o00Var instanceof f53) && str == null) || (o00Var instanceof k50) || (o00Var instanceof wgf)) {
            return false;
        }
        vx3 vx3Var = vx3.b;
        e49 e49Var = new e49(o00Var, this, j, str, null);
        vxd vxdVarS = j47.S(this.a, this.B0, vx3Var, e49Var);
        this.k1.o1(this, D1[2], vxdVarS);
        return true;
    }

    public final boolean I(MessageModel messageModel) {
        this.j1.o1(this, D1[1], j47.S(this.a, this.B0, vx3.b, new g49(this, messageModel, null)));
        return messageModel.b != 0;
    }

    public final void J(int i, List list) {
        Long l;
        long jLongValue;
        MessageModel messageModelD;
        o00 o00Var;
        en4 en4Var;
        Long l2;
        int i2 = mda.y;
        s35 s35Var = this.u1;
        if (i == i2) {
            Long l3 = (Long) x53.i0(list);
            if (l3 != null) {
                pnf.o(s35Var, new nnd(l3.longValue()));
                return;
            }
            return;
        }
        int i3 = mda.v;
        w7c w7cVar = this.q1;
        s35 s35Var2 = this.v1;
        if (i == i3) {
            if (list.size() != 1) {
                u29.c.getClass();
                pnf.o(s35Var2, u29.Z1(list, false));
                return;
            }
            Long l4 = (Long) x53.i0(list);
            if (l4 != null) {
                MessageModel messageModelD2 = ((l29) w7cVar.a.getValue()).d(l4.longValue());
                if (messageModelD2 == null) {
                    return;
                }
                u29 u29Var = u29.c;
                boolean z = messageModelD2.u0.d instanceof zf5;
                u29Var.getClass();
                pnf.o(s35Var2, u29.Z1(list, z));
                return;
            }
            return;
        }
        int i4 = mda.q;
        kke kkeVar = this.Y;
        if (i == i4) {
            pnf.n(this, ((w9a) kkeVar).b(), null, new n49(this, list, null), 2);
            return;
        }
        if (i == mda.z) {
            pnf.n(this, ((w9a) kkeVar).b(), null, new p49(this, list, null), 2);
            return;
        }
        int i5 = mda.w;
        ContextScope contextScope = this.a;
        if (i == i5) {
            this.i1.o1(this, D1[0], j47.S(contextScope, ((w9a) kkeVar).b(), vx3.b, new r49(this, list, null)));
            return;
        }
        if (i == mda.s) {
            pnf.n(this, ((w9a) kkeVar).b(), null, new s49(this, list, null), 2);
            return;
        }
        if (i == mda.m) {
            pnf.n(this, ((w9a) kkeVar).b(), null, new t49(this, list, null), 2);
            return;
        }
        if (i == mda.n) {
            pnf.n(this, ((w9a) kkeVar).b(), null, new u49(this, list, null), 2);
            return;
        }
        if (i == mda.k) {
            Long l5 = (Long) x53.i0(list);
            if (l5 != null) {
                v(l5.longValue(), da3.SPAM);
                return;
            }
            return;
        }
        if (i == mda.j) {
            Long l6 = (Long) x53.i0(list);
            if (l6 != null) {
                v(l6.longValue(), da3.PORNO);
                return;
            }
            return;
        }
        if (i == mda.g) {
            Long l7 = (Long) x53.i0(list);
            if (l7 != null) {
                v(l7.longValue(), da3.EXTREMISM);
                return;
            }
            return;
        }
        if (i == mda.h) {
            Long l8 = (Long) x53.i0(list);
            if (l8 != null) {
                v(l8.longValue(), da3.FAKE);
                return;
            }
            return;
        }
        if (i == mda.l) {
            Long l9 = (Long) x53.i0(list);
            if (l9 != null) {
                v(l9.longValue(), da3.THREAT);
                return;
            }
            return;
        }
        if (i == mda.i) {
            Long l10 = (Long) x53.i0(list);
            if (l10 != null) {
                v(l10.longValue(), da3.OTHER);
                return;
            }
            return;
        }
        if (i == mda.x) {
            e52 e52Var = (e52) this.o1.a.getValue();
            if (e52Var == null || (l2 = (Long) x53.i0(list)) == null) {
                return;
            }
            if (e52Var.X != null) {
                mg3 mg3Var = hs8.a;
                pnf.o(s35Var, new fnd(Collections.singletonList(l2), new eqe(oda.J), null, y53.M(new mg3(mda.o, new eqe(oda.H), 3, false), new mg3(mda.p, new eqe(oda.I), 3, false), hs8.a)));
                return;
            } else {
                mg3 mg3Var2 = hs8.a;
                pnf.o(s35Var, new fnd(Collections.singletonList(l2), new eqe(oda.G), null, y53.M(new mg3(mda.o, new eqe(oda.H), 3, false), new mg3(mda.p, new eqe(oda.I), 3, false), hs8.a)));
                return;
            }
        }
        if (i == mda.o) {
            pnf.n(this, ((w9a) kkeVar).b(), null, new v49(this, list, null), 2);
            return;
        }
        if (i == mda.p) {
            pnf.n(this, ((w9a) kkeVar).b(), null, new w49(this, list, null), 2);
            return;
        }
        if (i == mda.C) {
            pnf.n(this, ((w9a) kkeVar).b(), null, new x49(this, list, null), 2);
            return;
        }
        if (i == mda.B) {
            Long l11 = (Long) x53.i0(list);
            if (l11 != null) {
                A().e(l11.longValue());
                return;
            }
            return;
        }
        if (i == mda.u) {
            Long l12 = (Long) x53.i0(list);
            if (l12 != null) {
                pnf.o(s35Var, new hnd(l12.longValue()));
                return;
            }
            return;
        }
        if (i == mda.c) {
            pnf.n(this, ((w9a) kkeVar).b(), null, new j49(this, list, null), 2);
            return;
        }
        if (i == mda.b) {
            pnf.n(this, ((w9a) kkeVar).b(), null, new l49(this, null), 2);
            return;
        }
        if (i == mda.a) {
            pnf.n(this, ((w9a) kkeVar).b(), null, new m49(this, list, null), 2);
            return;
        }
        int i6 = mda.A;
        HashSet hashSet = this.x1;
        if (i == i6) {
            Long l13 = (Long) x53.i0(list);
            if (l13 != null) {
                long jLongValue2 = l13.longValue();
                if (hashSet.contains(l13)) {
                    return;
                }
                hashSet.add(l13);
                pnf.n(this, ((w9a) kkeVar).b(), null, new r39(this, jLongValue2, null), 2);
                return;
            }
            return;
        }
        if (i == mda.r) {
            Long l14 = (Long) x53.i0(list);
            if (l14 != null) {
                long jLongValue3 = l14.longValue();
                if (hashSet.contains(l14)) {
                    return;
                }
                hashSet.add(l14);
                fc3 fc3Var = this.w0;
                fc3Var.getClass();
                od2.L(new zn5(od2.F(new mqc(new zw3(fc3Var, jLongValue3, null)), (nx3) fc3Var.b), new q39(this, jLongValue3, null), 5), contextScope);
                return;
            }
            return;
        }
        if (i != mwb.messages_list_context_action_share_externally || (l = (Long) x53.i0(list)) == null || (messageModelD = ((l29) w7cVar.a.getValue()).d((jLongValue = l.longValue()))) == null || (o00Var = messageModelD.u0.d) == null) {
            return;
        }
        if (!(o00Var instanceof zf5)) {
            if (o00Var instanceof bsd) {
                bsd bsdVar = (bsd) o00Var;
                u29 u29Var2 = u29.c;
                long j = bsdVar.c.a;
                en4 en4Var2 = en4.b;
                u29Var2.getClass();
                pnf.o(s35Var2, u29.a2(jLongValue, j, bsdVar.b, en4Var2));
                return;
            }
            return;
        }
        zf5 zf5Var = (zf5) o00Var;
        u29 u29Var3 = u29.c;
        int iS = au1.s(zf5Var.j);
        if (iS == 0) {
            en4Var = en4.o;
        } else if (iS == 1) {
            en4Var = en4.b;
        } else if (iS == 2) {
            en4Var = en4.Y;
        } else {
            if (iS != 3) {
                throw new NoWhenBranchMatchedException();
            }
            en4Var = en4.s0;
        }
        en4 en4Var3 = en4Var;
        u29Var3.getClass();
        pnf.o(s35Var2, u29.a2(jLongValue, zf5Var.a, zf5Var.c, en4Var3));
    }

    public final void K(long j, boolean z, boolean z2, boolean z3) {
        this.x1.remove(Long.valueOf(j));
        if (!z) {
            wha whaVarC = C();
            whaVarC.e(new kia(woc.I));
            whaVarC.g(new eqe(oda.t0));
            M(whaVarC);
            whaVarC.i();
            return;
        }
        int i = z2 ? oda.s0 : z3 ? oda.q0 : oda.r0;
        wha whaVarC2 = C();
        whaVarC2.e(new kia(woc.m));
        whaVarC2.g(new eqe(i));
        M(whaVarC2);
        whaVarC2.i();
    }

    public final void L(boolean z) {
        Object value;
        l89 l89VarB = B();
        String str = l89VarB.i;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, ey8.j("Update scroll to bottom state, visible:", z), null);
        }
        q0e q0eVar = l89VarB.m;
        do {
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, bxc.a((bxc) value, 0, z, false, null, 13)));
    }

    public final void M(wha whaVar) {
        whaVar.c(new eia(0, 0, this.C1, 3));
    }

    @Override // defpackage.pnf
    public final void p() {
        ((bx) this.o).h();
        z3b z3bVar = this.Z;
        w4d w4dVar = z3bVar.d;
        bc7[] bc7VarArr = z3b.i;
        x77 x77Var = (x77) w4dVar.T0(z3bVar, bc7VarArr[0]);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        z3bVar.d.o1(z3bVar, bc7VarArr[0], null);
        z3bVar.e.setValue(null);
        ((uh9) z3bVar.a).s(z3bVar.g);
        this.w1.clear();
        this.x1.clear();
        i00 i00Var = this.z0;
        w4d w4dVar2 = i00Var.d;
        bc7[] bc7VarArr2 = i00.f;
        x77 x77Var2 = (x77) w4dVar2.T0(i00Var, bc7VarArr2[0]);
        if (x77Var2 != null) {
            x77Var2.cancel(null);
        }
        i00Var.d.o1(i00Var, bc7VarArr2[0], null);
        i00Var.e.setValue(null);
    }

    public final void v(long j, da3 da3Var) {
        pnf.n(this, ((w9a) this.Y).b(), null, new p39(this, da3Var, j, null), 2);
    }

    public final tx8 w() {
        e52 e52Var = (e52) this.o1.a.getValue();
        if (e52Var == null) {
            return null;
        }
        boolean zI = e52Var.I();
        k92 k92Var = e52Var.b;
        if (zI) {
            return new px8(k92Var.a);
        }
        if (e52Var.H()) {
            uj3 uj3VarL = e52Var.l();
            if (uj3VarL != null) {
                return new rx8(uj3VarL.n());
            }
            return null;
        }
        if (!e52Var.M()) {
            return new qx8(k92Var.a);
        }
        uj3 uj3VarL2 = e52Var.l();
        if (uj3VarL2 != null) {
            return new sx8(uj3VarL2.n());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(long r6, java.lang.String r8, long r9, boolean r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r12 instanceof defpackage.s39
            if (r0 == 0) goto L13
            r0 = r12
            s39 r0 = (defpackage.s39) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            s39 r0 = new s39
            r0.<init>(r5, r12)
        L18:
            java.lang.Object r12 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r8 = r0.o
            defpackage.od2.a0(r12)
            goto L92
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.od2.a0(r12)
            je7 r12 = r5.D0
            java.lang.Object r12 = r12.getValue()
            y7d r12 = (defpackage.y7d) r12
            qyc r12 = (defpackage.qyc) r12
            r12.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f92newmediaviewerenabled
            r4 = 0
            boolean r12 = r12.n(r2, r4)
            if (r12 == 0) goto L7b
            u29 r5 = defpackage.u29.c
            r5.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r12 = ":attach/viewer?chat_id="
            r5.<init>(r12)
            r5.append(r6)
            java.lang.String r6 = "&attach_id="
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = "&msg_id="
            r5.append(r6)
            r5.append(r9)
            java.lang.String r6 = "&single="
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            c64 r6 = new c64
            r6.<init>(r5)
            goto Laf
        L7b:
            je7 r5 = r5.P0
            java.lang.Object r5 = r5.getValue()
            tp7 r5 = (defpackage.tp7) r5
            q1a r5 = defpackage.tp7.a(r5, r9)
            r0.o = r8
            r0.Z = r3
            java.lang.Object r12 = defpackage.s36.f(r5, r0)
            if (r12 != r1) goto L92
            return r1
        L92:
            es8 r12 = (defpackage.es8) r12
            o19 r5 = defpackage.o19.a
            v4 r5 = r5.getAccessor()
            java.lang.Class<df7> r6 = defpackage.df7.class
            java.lang.Object r5 = r5.c(r6)
            df7 r5 = (defpackage.df7) r5
            r5.getClass()
            xw8 r5 = new xw8
            r5.<init>(r12)
            dma r6 = new dma
            r6.<init>(r5, r8)
        Laf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n59.x(long, java.lang.String, long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(long r9, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.t39
            if (r0 == 0) goto L13
            r0 = r11
            t39 r0 = (defpackage.t39) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            t39 r0 = new t39
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r11)
            goto L43
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.od2.a0(r11)
            je7 r8 = r8.F0
            java.lang.Object r8 = r8.getValue()
            ns8 r8 = (defpackage.ns8) r8
            r0.Y = r3
            java.io.Serializable r11 = r8.c(r9, r0)
            if (r11 != r1) goto L43
            return r1
        L43:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            at r8 = new at
            r9 = 2
            r8.<init>(r9, r11)
            g27 r9 = new g27
            r10 = 22
            r9.<init>(r10)
            qk5 r8 = defpackage.l6d.a0(r8, r9)
            om8 r9 = new om8
            is8 r2 = defpackage.is8.a
            java.lang.Class<is8> r3 = defpackage.is8.class
            java.lang.String r4 = "convert"
            r1 = 1
            java.lang.String r5 = "convert$message_list_release(Lru/ok/tamtam/messages/MessageAction;)Lone/me/sdk/contextmenu/ContextMenuAction;"
            r6 = 0
            r7 = 5
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1f r10 = new r1f
            r10.<init>(r8, r9)
            java.util.List r8 = defpackage.l6d.i0(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n59.y(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final k6f z() {
        return (k6f) this.R0.getValue();
    }
}
