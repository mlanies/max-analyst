package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class jz2 implements iy2, yu2, o82, qu7 {
    public static final /* synthetic */ int Y = 0;
    public final je7 X;
    public final kke a;
    public final ty2 b;
    public final je7 c;
    public final je7 o;

    public jz2(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, kke kkeVar) {
        this.a = kkeVar;
        ty2 ty2Var = new ty2();
        ty2Var.a = ty2.class.getName();
        ty2Var.b = je7Var;
        ty2Var.c = je7Var3;
        ty2Var.o = je7Var4;
        ty2Var.X = new khe(new ly2(kkeVar, 0));
        ty2Var.Y = new ConcurrentHashMap();
        ty2Var.Z = new ConcurrentHashMap();
        this.b = ty2Var;
        this.c = je7Var4;
        this.o = je7Var2;
        this.X = je7Var3;
        j47.T(j1e.a(((w9a) kkeVar).b()), null, null, new yy2(je7Var3, this, null), 3);
    }

    public static c6d i(at atVar, tu2 tu2Var) {
        if (tu2Var instanceof ru2) {
            return l6d.a0(atVar, new we1(29));
        }
        if (tu2Var instanceof su2) {
            return atVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.qu7
    public final void a() {
        ty2 ty2Var = this.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ty2Var.Y;
        Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            ((ti9) it.next()).setValue(null);
        }
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) ty2Var.Z;
        Iterator it2 = concurrentHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((ti9) it2.next()).setValue(null);
        }
        concurrentHashMap.clear();
        concurrentHashMap2.clear();
    }

    @Override // defpackage.o82
    public final void b(List list) {
        this.b.b(list);
    }

    @Override // defpackage.o82
    public final void c(List list) {
        this.b.c(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r8, java.util.List r10, kotlin.coroutines.Continuation r11, boolean r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.zy2
            if (r0 == 0) goto L13
            r0 = r11
            zy2 r0 = (defpackage.zy2) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u0 = r1
            goto L18
        L13:
            zy2 r0 = new zy2
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r12 = r0.Z
            long r8 = r0.Y
            java.util.List r10 = r0.X
            jz2 r7 = r0.o
            defpackage.od2.a0(r11)
        L2e:
            r1 = r8
            r5 = r10
            r6 = r12
            goto L4e
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            defpackage.od2.a0(r11)
            r0.o = r7
            r0.X = r10
            r0.Y = r8
            r0.Z = r12
            r0.u0 = r3
            java.lang.Object r11 = r7.d(r8, r0)
            if (r11 != r1) goto L2e
            return r1
        L4e:
            e52 r11 = (defpackage.e52) r11
            p82 r7 = r7.l()
            k92 r8 = r11.b
            long r3 = r8.a
            r7.getClass()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "addChatUsers, chatId = "
            r8.<init>(r9)
            r8.append(r1)
            java.lang.String r9 = ", ids = "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "p82"
            defpackage.hm9.n(r9, r8)
            r7.d(r1, r5)
            rm4 r7 = r7.p
            java.lang.Object r7 = r7.get()
            pk r7 = (defpackage.pk) r7
            r0 = r7
            k4a r0 = (defpackage.k4a) r0
            r0.d(r1, r3, r5, r6)
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.e(long, java.util.List, kotlin.coroutines.Continuation, boolean):java.lang.Object");
    }

    public final e52 f(long j, m56 m56Var) {
        return l().h(j, false, new wp(1, m56Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable g(kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.az2
            if (r0 == 0) goto L13
            r0 = r6
            az2 r0 = (defpackage.az2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            az2 r0 = new az2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r6)
            goto L5e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.od2.a0(r6)
            p82 r6 = r5.l()
            r6.getClass()
            b82 r2 = new b82
            r4 = 2
            r2.<init>(r6, r4)
            r4 = 0
            java.lang.Object r6 = r6.e0(r4, r2)
            e52 r6 = (defpackage.e52) r6
            if (r6 != 0) goto L60
            kke r6 = r5.a
            w9a r6 = (defpackage.w9a) r6
            nx3 r6 = r6.b()
            bz2 r2 = new bz2
            r2.<init>(r5, r4)
            r0.Y = r3
            java.lang.Object r6 = defpackage.j47.t0(r6, r2, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            e52 r6 = (defpackage.e52) r6
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.g(kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    public final c6d h(c6d c6dVar, tu2 tu2Var) {
        if (tu2Var instanceof ru2) {
            return c6dVar;
        }
        if (!(tu2Var instanceof su2)) {
            throw new NoWhenBranchMatchedException();
        }
        su2 su2Var = (su2) tu2Var;
        final Set set = su2Var.a;
        final Set set2 = su2Var.b;
        final Map map = su2Var.e;
        final Set set3 = su2Var.c;
        final Set set4 = su2Var.d;
        return l6d.Z(c6dVar, new m56() { // from class: vy2
            /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
            @Override // defpackage.m56
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r6) {
                /*
                    r5 = this;
                    e52 r6 = (defpackage.e52) r6
                    k92 r0 = r6.b
                    long r1 = r0.a
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    java.util.Set r2 = r2
                    boolean r1 = r2.contains(r1)
                    jz2 r2 = r5.a
                    java.util.Map r3 = r4
                    if (r1 != 0) goto L26
                    je7 r1 = r2.o
                    java.lang.Object r1 = r1.getValue()
                    jt2 r1 = (defpackage.jt2) r1
                    java.util.Set r4 = r3
                    boolean r1 = r1.a(r4, r3, r6)
                    if (r1 == 0) goto L47
                L26:
                    long r0 = r0.a
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    java.util.Set r1 = r5
                    boolean r0 = r1.contains(r0)
                    if (r0 != 0) goto L47
                    je7 r0 = r2.o
                    java.lang.Object r0 = r0.getValue()
                    jt2 r0 = (defpackage.jt2) r0
                    java.util.Set r5 = r6
                    boolean r5 = r0.a(r5, r3, r6)
                    if (r5 == 0) goto L45
                    goto L47
                L45:
                    r5 = 1
                    goto L48
                L47:
                    r5 = 0
                L48:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vy2.invoke(java.lang.Object):java.lang.Object");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable j(long r5, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cz2
            if (r0 == 0) goto L13
            r0 = r7
            cz2 r0 = (defpackage.cz2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            cz2 r0 = new cz2
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r5 = r0.X
            jz2 r4 = r0.o
            defpackage.od2.a0(r7)     // Catch: java.lang.Throwable -> L2b
            goto L4d
        L2b:
            r7 = move-exception
            goto L50
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.od2.a0(r7)
            p82 r7 = r4.l()     // Catch: java.lang.Throwable -> L2b
            iqd r7 = r7.y(r5)     // Catch: java.lang.Throwable -> L2b
            r0.o = r4     // Catch: java.lang.Throwable -> L2b
            r0.X = r5     // Catch: java.lang.Throwable -> L2b
            r0.s0 = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = defpackage.s36.f(r7, r0)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r1) goto L4d
            return r1
        L4d:
            e52 r7 = (defpackage.e52) r7     // Catch: java.lang.Throwable -> L2b
            goto L6a
        L50:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to fetch chat for #"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            defpackage.hm9.p(r4, r5, r7)
            r7 = 0
        L6a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.j(long, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dz2
            if (r0 == 0) goto L13
            r0 = r8
            dz2 r0 = (defpackage.dz2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            dz2 r0 = new dz2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.od2.a0(r8)
            goto L64
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            long r6 = r0.X
            jz2 r5 = r0.o
            defpackage.od2.a0(r8)
            goto L52
        L3a:
            defpackage.od2.a0(r8)
            p82 r8 = r5.l()
            pa3 r8 = r8.f()
            r0.o = r5
            r0.X = r6
            r0.s0 = r4
            java.lang.Object r8 = defpackage.s36.e(r8, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            wy2 r8 = new wy2
            r2 = 1
            r8.<init>(r5, r6, r2)
            r5 = 0
            r0.o = r5
            r0.s0 = r3
            java.lang.Object r8 = defpackage.ema.C(r8, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.k(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final p82 l() {
        return (p82) this.X.getValue();
    }

    public final w7c m(long j) {
        ty2 ty2Var = this.b;
        return new w7c((ti9) ((ConcurrentHashMap) ty2Var.Y).computeIfAbsent(Long.valueOf(j), new di(5, new my2(ty2Var, j, 0))));
    }

    public final w7c n(long j) {
        ty2 ty2Var = this.b;
        return new w7c((ti9) ((ConcurrentHashMap) ty2Var.Z).computeIfAbsent(Long.valueOf(j), new di(6, new my2(ty2Var, j, 1))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.gi9 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fz2
            if (r0 == 0) goto L13
            r0 = r6
            fz2 r0 = (defpackage.fz2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            fz2 r0 = new fz2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.od2.a0(r6)
            x2 r6 = new x2
            r2 = 28
            r6.<init>(r4, r2, r5)
            r0.Y = r3
            java.lang.Object r6 = defpackage.ema.C(r6, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.o(gi9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.util.Set r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ez2
            if (r0 == 0) goto L13
            r0 = r6
            ez2 r0 = (defpackage.ez2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ez2 r0 = new ez2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.od2.a0(r6)
            x2 r6 = new x2
            r2 = 27
            r6.<init>(r4, r2, r5)
            r0.Y = r3
            java.lang.Object r6 = defpackage.ema.C(r6, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.p(java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final e52 q(long j) {
        return l().F(j);
    }

    public final Object r(tu2 tu2Var) {
        if (!(tu2Var instanceof ru2)) {
            if (tu2Var instanceof su2) {
                return nz4.a;
            }
            throw new NoWhenBranchMatchedException();
        }
        List listE = l().E(p82.J);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (((e52) obj).N()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List s(tu2 tu2Var, long j, Long l, int i) {
        c6d c6dVarH = h(i(new at(2, l().E(tu2Var.a())), tu2Var), tu2Var);
        Iterator it = c6dVarH.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it.next();
            if (i2 < 0) {
                y53.R();
                throw null;
            }
            e52 e52Var = (e52) next;
            if (j >= e52Var.o()) {
                if (l == null) {
                    break;
                }
                if (e52Var.a != l.longValue()) {
                    break;
                }
            }
            i2++;
        }
        if (i2 == -1) {
            return nz4.a;
        }
        return l6d.i0(c6dVarH).subList(i2, Math.min(i != Integer.MAX_VALUE ? i + i2 + 1 : Integer.MAX_VALUE, l6d.X(c6dVarH)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(long r5, java.util.Set r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.gz2
            if (r0 == 0) goto L13
            r0 = r8
            gz2 r0 = (defpackage.gz2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            gz2 r0 = new gz2
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Set r7 = r0.X
            jz2 r4 = r0.o
            defpackage.od2.a0(r8)
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.od2.a0(r8)
            r0.o = r4
            r0.X = r7
            r0.s0 = r3
            java.lang.Object r8 = r4.d(r5, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            e52 r8 = (defpackage.e52) r8
            p82 r4 = r4.l()
            k92 r5 = r8.b
            r4.getClass()
            x82 r4 = defpackage.p82.I(r5, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.t(long, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(long r6, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.hz2
            if (r0 == 0) goto L13
            r0 = r8
            hz2 r0 = (defpackage.hz2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            hz2 r0 = new hz2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r8)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.od2.a0(r8)
            kke r8 = r5.a
            w9a r8 = (defpackage.w9a) r8
            nx3 r8 = r8.b()
            wy2 r2 = new wy2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.Y = r3
            h47 r5 = new h47
            r6 = 0
            r5.<init>(r2, r6)
            java.lang.Object r8 = defpackage.j47.t0(r8, r5, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.u(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(long r5, java.util.Set r7, int r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.iz2
            if (r0 == 0) goto L13
            r0 = r9
            iz2 r0 = (defpackage.iz2) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u0 = r1
            goto L18
        L13:
            iz2 r0 = new iz2
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r8 = r0.Z
            long r5 = r0.Y
            java.util.Set r7 = r0.X
            jz2 r4 = r0.o
            defpackage.od2.a0(r9)
            goto L4b
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            defpackage.od2.a0(r9)
            r0.o = r4
            r0.X = r7
            r0.Y = r5
            r0.Z = r8
            r0.u0 = r3
            java.lang.Object r9 = r4.t(r5, r7, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            x82 r9 = (defpackage.x82) r9
            p82 r0 = r4.l()
            ui0 r1 = new ui0
            r1.<init>(r9, r8, r4, r7)
            r4 = 0
            r0.h(r5, r4, r1)
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz2.v(long, java.util.Set, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
