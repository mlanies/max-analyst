package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class gj {
    public static final /* synthetic */ bc7[] p = {new oi9(gj.class, "warmupJob", "getWarmupJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, gj.class, "updateJob", "getUpdateJob()Lkotlinx/coroutines/Job;"), new oi9(gj.class, "animojiSetsUpdateJob", "getAnimojiSetsUpdateJob()Lkotlinx/coroutines/Job;")};
    public final pk a;
    public final jlc b;
    public final q33 c;
    public final kke d;
    public final rj e;
    public final khe g;
    public final khe h;
    public final khe i;
    public final ContextScope j;
    public final String f = gj.class.getName();
    public final w4d k = mqd.D();
    public final w4d l = mqd.D();
    public final w4d m = mqd.D();
    public final ConcurrentHashMap n = new ConcurrentHashMap();
    public final CopyOnWriteArrayList o = new CopyOnWriteArrayList();

    public gj(pk pkVar, jlc jlcVar, q33 q33Var, kke kkeVar, rj rjVar, o45 o45Var) {
        this.a = pkVar;
        this.b = jlcVar;
        this.c = q33Var;
        this.d = kkeVar;
        this.e = rjVar;
        final int i = 0;
        this.g = new khe(new k56(this) { // from class: qi
            public final /* synthetic */ gj b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((OneMeRoomDatabase) this.b.b.m()).t();
                    case 1:
                        return ((OneMeRoomDatabase) this.b.b.m()).u();
                    default:
                        return ((OneMeRoomDatabase) this.b.b.m()).L();
                }
            }
        });
        final int i2 = 1;
        this.h = new khe(new k56(this) { // from class: qi
            public final /* synthetic */ gj b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((OneMeRoomDatabase) this.b.b.m()).t();
                    case 1:
                        return ((OneMeRoomDatabase) this.b.b.m()).u();
                    default:
                        return ((OneMeRoomDatabase) this.b.b.m()).L();
                }
            }
        });
        final int i3 = 2;
        this.i = new khe(new k56(this) { // from class: qi
            public final /* synthetic */ gj b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ((OneMeRoomDatabase) this.b.b.m()).t();
                    case 1:
                        return ((OneMeRoomDatabase) this.b.b.m()).u();
                    default:
                        return ((OneMeRoomDatabase) this.b.b.m()).L();
                }
            }
        });
        this.j = j1e.a(((w9a) kkeVar).b().plus(new qj(o45Var)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.gj r10, java.util.Map r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj.a(gj, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.gj r10, defpackage.ru r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj.b(gj, ru, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0294 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.gj r18, java.util.List r19, java.util.Map r20, kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj.c(gj, java.util.List, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static ph l(ii iiVar) {
        return new ph(iiVar.a, iiVar.c, iiVar.d, iiVar.e, iiVar.g);
    }

    public final void d() {
        ((hyc) this.c).l("user.reactionsLastSync", 0L);
        wh whVarH = h();
        ilc ilcVar = whVarH.a;
        ilcVar.b();
        th thVar = whVarH.c;
        q36 q36VarF = thVar.f();
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
                thVar.t(q36VarF);
                oj ojVar = (oj) this.h.getValue();
                ilc ilcVar2 = ojVar.a;
                ilcVar2.b();
                th thVar2 = ojVar.c;
                q36 q36VarF2 = thVar2.f();
                try {
                    ilcVar2.c();
                    try {
                        q36VarF2.n();
                        ilcVar2.r();
                        thVar2.t(q36VarF2);
                        a7c a7cVar = (a7c) this.i.getValue();
                        ilc ilcVar3 = a7cVar.a;
                        ilcVar3.b();
                        p19 p19Var = a7cVar.c;
                        q36 q36VarF3 = p19Var.f();
                        try {
                            ilcVar3.c();
                            try {
                                q36VarF3.n();
                                ilcVar3.r();
                            } finally {
                                ilcVar3.l();
                            }
                        } finally {
                            p19Var.t(q36VarF3);
                        }
                    } finally {
                        ilcVar2.l();
                    }
                } catch (Throwable th) {
                    thVar2.t(q36VarF2);
                    throw th;
                }
            } finally {
                ilcVar.l();
            }
        } catch (Throwable th2) {
            thVar.t(q36VarF);
            throw th2;
        }
    }

    public final Object e(gi9 gi9Var, Continuation continuation) {
        Object objT0;
        boolean zI = gi9Var.i();
        e5f e5fVar = e5f.a;
        return (!zI && (objT0 = j47.t0(((w9a) this.d).a(), new wi(this, gi9Var, null), continuation)) == tx3.a) ? objT0 : e5fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.z6c r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.xi
            if (r0 == 0) goto L13
            r0 = r12
            xi r0 = (defpackage.xi) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            xi r0 = new xi
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r5) goto L2c
            defpackage.od2.a0(r12)
            goto L78
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            z6c r11 = r0.X
            gj r10 = r0.o
            defpackage.od2.a0(r12)
            goto L57
        L3c:
            defpackage.od2.a0(r12)
            java.util.concurrent.CopyOnWriteArrayList r12 = r10.o
            r12.clear()
            wh r12 = r10.h()
            java.util.List r2 = r11.c
            r0.o = r10
            r0.X = r11
            r0.s0 = r4
            java.lang.Object r12 = r12.a(r2, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            java.util.List r12 = (java.util.List) r12
            boolean r2 = r12.isEmpty()
            r4 = 0
            if (r2 == 0) goto L79
            java.util.List r11 = r11.c
            java.util.concurrent.CopyOnWriteArrayList r12 = r10.o
            r12.addAll(r11)
            gi9 r11 = defpackage.oag.G(r11)
            r0.o = r4
            r0.X = r4
            r0.s0 = r5
            java.lang.Object r10 = r10.e(r11, r0)
            if (r10 != r1) goto L78
            return r1
        L78:
            return r3
        L79:
            java.util.List r0 = r11.c
            int r0 = r0.size()
            r1 = 0
        L80:
            if (r1 >= r0) goto Lbf
            java.util.List r2 = r11.c
            java.lang.Object r2 = r2.get(r1)
            java.lang.Number r2 = (java.lang.Number) r2
            long r5 = r2.longValue()
            java.util.concurrent.CopyOnWriteArrayList r2 = r10.o
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            r2.add(r7)
            java.util.Iterator r2 = r12.iterator()
        L9c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto Lb0
            java.lang.Object r7 = r2.next()
            r8 = r7
            ii r8 = (defpackage.ii) r8
            long r8 = r8.a
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L9c
            goto Lb1
        Lb0:
            r7 = r4
        Lb1:
            ii r7 = (defpackage.ii) r7
            if (r7 == 0) goto Lbc
            ph r2 = l(r7)
            r10.j(r2)
        Lbc:
            int r1 = r1 + 1
            goto L80
        Lbf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj.f(z6c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ph g(String str) {
        Object next;
        if (str.length() == 0) {
            return null;
        }
        Iterator it = this.n.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ph phVar = (ph) ((ti9) next).getValue();
            if (tpa.f(phVar != null ? phVar.b : null, str)) {
                break;
            }
        }
        ti9 ti9Var = (ti9) next;
        if (ti9Var != null) {
            return (ph) ti9Var.getValue();
        }
        return null;
    }

    public final wh h() {
        return (wh) this.g.getValue();
    }

    public final ti9 i(long j) {
        return (ti9) this.n.computeIfAbsent(Long.valueOf(j), new di(1, new k8(9)));
    }

    public final void j(ph phVar) {
        Object value;
        ti9 ti9VarI = i(phVar.a);
        do {
            value = ti9VarI.getValue();
        } while (!ti9VarI.c(value, phVar));
    }

    public final void k() {
        vx3 vx3Var = vx3.b;
        cj cjVar = new cj(this, null);
        ContextScope contextScope = this.j;
        vxd vxdVarT = j47.T(contextScope, null, vx3Var, cjVar, 1);
        bc7[] bc7VarArr = p;
        this.l.o1(this, bc7VarArr[1], vxdVarT);
        if (this.e.a()) {
            vxd vxdVarT2 = j47.T(contextScope, null, vx3Var, new bj(this, null), 1);
            this.m.o1(this, bc7VarArr[2], vxdVarT2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.util.List r21, defpackage.z6c r22, kotlin.coroutines.Continuation r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj.m(java.util.List, z6c, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
