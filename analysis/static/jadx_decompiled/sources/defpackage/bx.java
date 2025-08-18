package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class bx implements t29, ne3 {
    public static final /* synthetic */ bc7[] F;
    public final q0e A;
    public final w7c B;
    public final q0e C;
    public final sy4 D;
    public final wd6 E;
    public final long a;
    public final kke b;
    public final yx4 c;
    public final v19 d;
    public final je7 e;
    public final je7 f;
    public final ox3 g;
    public final m9a h;
    public final tk6 i;
    public final uu j;
    public final pfc k;
    public final oe3 l;
    public final int m;
    public final int n;
    public final String o;
    public final je7 p;
    public final je7 q;
    public final je7 r;
    public final y77 s;
    public final lx3 t;
    public final ContextScope u;
    public final ContextScope v;
    public final ax w;
    public final je7 x;
    public final q0e y;
    public final kv z;

    static {
        oi9 oi9Var = new oi9(bx.class, "historyBounds", "getHistoryBounds()Lru/ok/tamtam/loader/HistoryBounds;");
        nec.a.getClass();
        F = new bc7[]{oi9Var};
    }

    public bx(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, long j, kke kkeVar, yx4 yx4Var, v19 v19Var, khe kheVar, khe kheVar2, ox3 ox3Var, m9a m9aVar, tk6 tk6Var, uu uuVar, pfc pfcVar, oe3 oe3Var, int i, int i2) {
        int i3 = 0;
        this.a = j;
        this.b = kkeVar;
        this.c = yx4Var;
        this.d = v19Var;
        this.e = kheVar;
        this.f = kheVar2;
        this.g = ox3Var;
        this.h = m9aVar;
        this.i = tk6Var;
        this.j = uuVar;
        this.k = pfcVar;
        this.l = oe3Var;
        this.m = i;
        this.n = i2;
        String str = bx.class.getName() + "#" + j;
        this.o = str;
        this.p = je7Var;
        this.q = je7Var2;
        this.r = je7Var3;
        y77 y77VarA = pag.a();
        this.s = y77VarA;
        w9a w9aVar = (w9a) kkeVar;
        lx3 lx3VarPlus = w9aVar.a().plus(y77VarA).plus(new qj(this));
        this.t = lx3VarPlus;
        ContextScope contextScopeA = j1e.a(lx3VarPlus.plus(w9aVar.a().limitedParallelism(1, str)).plus(new y77(y77VarA)));
        this.u = contextScopeA;
        this.v = j1e.a(lx3VarPlus.plus(w9aVar.b()).plus(new y77(y77VarA)));
        this.w = new ax(new khe(new x5(12, this)), i3, this);
        this.x = je7Var4;
        q0e q0eVarA = r0e.a(0L);
        this.y = q0eVarA;
        kv kvVar = new kv(this);
        this.z = kvVar;
        q0e q0eVarA2 = r0e.a(l29.o);
        this.A = q0eVarA2;
        this.B = new w7c(q0eVarA2);
        q0e q0eVarA3 = r0e.a(mv.a);
        this.C = q0eVarA3;
        this.D = new sy4(3, this);
        this.E = new wd6(3, this);
        od2.L(new mqc(new yw(q0eVarA3, null, this)), contextScopeA);
        od2.L(new zn5(od2.x(new j31(kvVar, q0eVarA, new mw(this, null), 4)), new nw(this, null), 5), j1e.a(lx3VarPlus));
        v7c v7cVar = v19Var.e;
        qw qwVar = new qw(v7cVar, i3);
        int i4 = ft4.o;
        kt4 kt4Var = kt4.MILLISECONDS;
        od2.L(new zn5(od2.N(new mqc(new uw(new m32(new vn5(z7.R(15, kt4Var), qwVar, null), hz4.a, -2, 1, 0), null)), nu0.Q(new qw(v7cVar, 1), z7.R(1000, kt4Var)), new qw(v7cVar, 2)), new vw(2, this, bx.class, "handleEvent", "handleEvent(Lone/me/messages/list/loader/events/MessageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0), 5), contextScopeA);
        oe3Var.a(oe3.c | oe3.d, this);
        yx4Var.b("initialized @" + System.identityHashCode(this));
    }

    public static void A(ArrayList arrayList, vk6 vk6Var, vk6 vk6Var2) {
        int iNextIndex;
        if (vk6Var == null || vk6Var2 == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            vk6 vk6Var3 = (vk6) it.next();
            if (!(vk6Var3 instanceof uk6) && vk6Var3.getA() == vk6Var.getA()) {
                break;
            } else {
                i++;
            }
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            vk6 vk6Var4 = (vk6) listIterator.previous();
            if (!(vk6Var4 instanceof uk6) && vk6Var4.getA() == vk6Var2.getA()) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (i < 0 || iNextIndex < 0 || i > iNextIndex) {
            return;
        }
        while (true) {
            if (arrayList.get(iNextIndex) instanceof uk6) {
                arrayList.remove(iNextIndex);
            }
            if (iNextIndex == i) {
                return;
            } else {
                iNextIndex--;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.bx r11, defpackage.pfc r12, long r13, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof defpackage.bw
            if (r0 == 0) goto L14
            r0 = r15
            bw r0 = (defpackage.bw) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r10 = r0
            goto L1a
        L14:
            bw r0 = new bw
            r0.<init>(r11, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r10.o
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.Y
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            defpackage.od2.a0(r15)
            goto Lcb
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            defpackage.od2.a0(r15)
            java.util.List r15 = r11.l(r13)
            boolean r1 = r15 instanceof java.util.Collection
            r3 = -1
            if (r1 == 0) goto L46
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L46
            goto L8d
        L46:
            java.util.Iterator r1 = r15.iterator()
        L4a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L8d
            java.lang.Object r5 = r1.next()
            vk6 r5 = (defpackage.vk6) r5
            boolean r5 = r5 instanceof defpackage.uk6
            r5 = r5 ^ r2
            if (r5 == 0) goto L4a
            java.lang.Object r1 = defpackage.x53.g0(r15)
            boolean r1 = r1 instanceof defpackage.uk6
            if (r1 == 0) goto L86
            boolean r13 = r11.q(r15, r13, r2)
            if (r13 == 0) goto L86
            java.lang.Object r13 = r15.get(r2)
            vk6 r13 = (defpackage.vk6) r13
            long r13 = r13.getC()
            sk6 r15 = r11.k()
            i13 r15 = r15.f(r13)
            if (r15 == 0) goto L81
            long r3 = r15.b()
        L81:
            int r15 = r11.m
        L83:
            r6 = r3
            r4 = r15
            goto L90
        L86:
            java.lang.Integer r0 = new java.lang.Integer
            r11 = 0
            r0.<init>(r11)
            goto Ld6
        L8d:
            int r15 = r11.n
            goto L83
        L90:
            yx4 r11 = r11.c
            if (r11 == 0) goto Lbd
            java.lang.String r15 = defpackage.yx4.a(r13)
            java.lang.String r1 = defpackage.yx4.a(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "loadDataBackwardRemote time: "
            r3.<init>(r5)
            r3.append(r15)
            java.lang.String r15 = ", count: "
            r3.append(r15)
            r3.append(r4)
            java.lang.String r15 = ", limit: "
            r3.append(r15)
            r3.append(r1)
            java.lang.String r15 = r3.toString()
            r11.b(r15)
        Lbd:
            r10.Y = r2
            r5 = 0
            r8 = -1
            r1 = r12
            r2 = r13
            java.lang.Object r15 = r1.a(r2, r4, r5, r6, r8, r10)
            if (r15 != r0) goto Lcb
            goto Ld6
        Lcb:
            java.lang.Number r15 = (java.lang.Number) r15
            int r11 = r15.intValue()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r11)
        Ld6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.b(bx, pfc, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.bx r11, defpackage.pfc r12, long r13, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.c(bx, pfc, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.bx r9, long r10, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r9.getClass()
            boolean r0 = r12 instanceof defpackage.kw
            if (r0 == 0) goto L17
            r0 = r12
            kw r0 = (defpackage.kw) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.s0 = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            kw r0 = new kw
            r0.<init>(r9, r12)
            goto L15
        L1d:
            java.lang.Object r12 = r6.Y
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.s0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            bx r9 = r6.o
            defpackage.od2.a0(r12)
            goto Lac
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            long r9 = r6.X
            bx r11 = r6.o
            defpackage.od2.a0(r12)
            r7 = r9
            r9 = r11
            r10 = r7
            goto L94
        L45:
            defpackage.od2.a0(r12)
            yx4 r12 = r9.c
            if (r12 == 0) goto L61
            java.lang.String r1 = defpackage.yx4.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "loadPrev: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r12.b(r1)
        L61:
            r9.B()
            sk6 r12 = r9.k()
            java.util.List r12 = r12.i()
            boolean r12 = r12.isEmpty()
            r12 = r12 ^ r3
            if (r12 == 0) goto La1
            java.util.List r12 = r9.l(r10)
            vk6 r12 = defpackage.ft.h(r12)
            if (r12 == 0) goto L81
            long r10 = r12.getC()
        L81:
            r6.o = r9
            r6.X = r10
            r6.s0 = r3
            uu r2 = r9.j
            sy4 r5 = r9.D
            r1 = r9
            r3 = r10
            java.lang.Object r12 = r1.t(r2, r3, r5, r6)
            if (r12 != r0) goto L94
            goto Lbb
        L94:
            kotlinx.coroutines.internal.ContextScope r12 = r9.v
            lw r0 = new lw
            r1 = 0
            r0.<init>(r9, r10, r1)
            r10 = 3
            defpackage.j47.T(r12, r1, r1, r0, r10)
            goto Lac
        La1:
            r6.o = r9
            r6.s0 = r2
            java.lang.Object r10 = r9.v(r10, r6)
            if (r10 != r0) goto Lac
            goto Lbb
        Lac:
            yx4 r10 = r9.c
            if (r10 == 0) goto Lb9
            kv r9 = r9.z
            java.util.List r9 = r9.getValue()
            defpackage.kq0.u(r10, r9)
        Lb9:
            e5f r0 = defpackage.e5f.a
        Lbb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.d(bx, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void e(bx bxVar, ArrayList arrayList) {
        bxVar.getClass();
        for (int iL = y53.L(arrayList); -1 < iL; iL--) {
            if (iL > 0 && (arrayList.get(iL) instanceof uk6) && (arrayList.get(iL - 1) instanceof uk6)) {
                arrayList.remove(iL);
            }
        }
    }

    public static final void f(bx bxVar, ArrayList arrayList) {
        boolean z;
        long jG = bxVar.k().g();
        bxVar.k().getClass();
        if (jG == -1 || arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                vk6 vk6Var = (vk6) it.next();
                if (!(vk6Var instanceof uk6) && vk6Var.getA() == jG) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        vk6 vk6Var2 = (vk6) x53.g0(arrayList);
        yx4 yx4Var = bxVar.c;
        if (yx4Var != null) {
            yx4Var.b("UpdateFirstGap: firstItemId=" + jG + ", isFirstGap=" + (vk6Var2 instanceof uk6) + ", hasFirstBound=" + z);
        }
        if (z && (vk6Var2 instanceof uk6)) {
            arrayList.remove(0);
        } else {
            if (z || (vk6Var2 instanceof uk6)) {
                return;
            }
            arrayList.add(0, new uk6());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.bx r7, java.util.ArrayList r8) {
        /*
            sk6 r0 = r7.k()
            long r0 = r0.h()
            sk6 r2 = r7.k()
            r2.getClass()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L3c
            int r2 = r8.size()
            java.util.ListIterator r2 = r8.listIterator(r2)
        L1d:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r2.previous()
            r4 = r3
            vk6 r4 = (defpackage.vk6) r4
            boolean r5 = r4 instanceof defpackage.uk6
            if (r5 != 0) goto L1d
            long r4 = r4.getA()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L1d
            goto L38
        L37:
            r3 = 0
        L38:
            if (r3 == 0) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            java.lang.Object r3 = defpackage.x53.p0(r8)
            vk6 r3 = (defpackage.vk6) r3
            yx4 r7 = r7.c
            if (r7 == 0) goto L6a
            boolean r4 = r3 instanceof defpackage.uk6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "UpdateLastGap: lastItemId="
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = ", isLastGap="
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = ", hasLastBound="
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r7.b(r0)
        L6a:
            if (r2 == 0) goto L74
            boolean r7 = r3 instanceof defpackage.uk6
            if (r7 == 0) goto L74
            r8.remove(r3)
            goto L86
        L74:
            if (r2 != 0) goto L86
            boolean r7 = r3 instanceof defpackage.uk6
            if (r7 != 0) goto L86
            int r7 = r8.size()
            uk6 r0 = new uk6
            r0.<init>()
            r8.add(r7, r0)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.g(bx, java.util.ArrayList):void");
    }

    public static void z(long j, long j2, ArrayList arrayList) {
        Object obj;
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            vk6 vk6Var = (vk6) next;
            if (!(vk6Var instanceof uk6) && vk6Var.getC() >= j) {
                break;
            }
        }
        vk6 vk6Var2 = (vk6) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            vk6 vk6Var3 = (vk6) objPrevious;
            if (!(vk6Var3 instanceof uk6) && vk6Var3.getC() <= j2) {
                obj = objPrevious;
                break;
            }
        }
        A(arrayList, vk6Var2, (vk6) obj);
    }

    public final boolean B() {
        List listH;
        ArrayList arrayList;
        sk6 sk6VarK = k();
        sk6 sk6VarI = this.i.i();
        sk6VarI.getClass();
        sk6.a.getClass();
        this.w.o1(this, F[0], new rk6(sk6VarI));
        kv kvVar = this.z;
        bx bxVar = kvVar.b;
        do {
            listH = kvVar.getValue();
            arrayList = new ArrayList(listH);
            e(bxVar, arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!(((vk6) it.next()) instanceof uk6)) {
                        f(bxVar, arrayList);
                        g(bxVar, arrayList);
                        break;
                    }
                }
            }
        } while (!kvVar.c(listH, arrayList));
        boolean z = !kp.i(sk6VarK, k());
        yx4 yx4Var = this.c;
        if (yx4Var != null && z) {
            kq0.v(yx4Var, k());
        }
        return z;
    }

    @Override // defpackage.ne3
    public final void a() {
        j47.T(this.u, null, null, new zw(this, null), 3);
    }

    public final void h() {
        v19 v19Var = this.d;
        v19Var.a.f(v19Var);
        this.s.cancel((CancellationException) null);
        Set set = (Set) this.l.a.get(Integer.valueOf(oe3.c | oe3.d));
        if (set != null) {
            set.remove(this);
        }
        yx4 yx4Var = this.c;
        if (yx4Var != null) {
            yx4Var.b("cleared @" + System.identityHashCode(this));
        }
    }

    public final long i() {
        return ((Number) this.y.getValue()).longValue();
    }

    public final long j() {
        Long l;
        Iterator it = ((l29) this.A.getValue()).a.iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((MessageModel) it.next()).c);
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((MessageModel) it.next()).c);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l = lValueOf;
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue();
        }
        return Long.MAX_VALUE;
    }

    public final sk6 k() {
        return (sk6) this.w.T0(this, F[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c4, code lost:
    
        r1 = r1.subList(r12, r3 + 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[PHI: r7
      0x007c: PHI (r7v16 int) = (r7v1 int), (r7v20 int) binds: [B:30:0x0076, B:32:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List l(long r24) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.l(long):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.su8 r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.m(su8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x016e -> B:59:0x0172). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.xu8 r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.n(xu8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void o(long j, List list, boolean z, boolean z2) {
        List listH;
        ArrayList arrayList;
        k92 k92Var;
        List listH2;
        ArrayList arrayList2;
        List listI = k().i();
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(Long.valueOf(((vk6) obj).getA()))) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (fm9.p(((vk6) next).getC(), listI)) {
                arrayList4.add(next);
            }
        }
        List listX0 = x53.x0(arrayList4, k().c());
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        int size = listX0.size();
        for (int i = 0; i < size; i++) {
            vk6 vk6Var = (vk6) listX0.get(i);
            arrayList6.add(vk6Var);
            if (i == y53.L(listX0) || !tpa.f(fm9.v(vk6Var.getC(), listI), fm9.v(((vk6) listX0.get(i + 1)).getC(), listI))) {
                arrayList5.add(arrayList6);
                arrayList6 = new ArrayList();
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!((List) next2).isEmpty()) {
                arrayList7.add(next2);
            }
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        kv kvVar = this.z;
        if (zIsEmpty) {
            List listH3 = kvVar.getValue();
            if (!(listH3 instanceof Collection) || !listH3.isEmpty()) {
                Iterator it3 = listH3.iterator();
                while (it3.hasNext()) {
                    if (!(((vk6) it3.next()) instanceof uk6)) {
                        return;
                    }
                }
            }
            e52 e52Var = (e52) ((jz2) ((iy2) this.p.getValue())).m(this.a).a.getValue();
            if (e52Var == null || (k92Var = e52Var.b) == null || k92Var.j != 0) {
                return;
            }
            do {
                listH2 = kvVar.getValue();
                arrayList2 = new ArrayList(listH2);
                arrayList2.clear();
                bx bxVar = kvVar.b;
                e(bxVar, arrayList2);
                if (!arrayList2.isEmpty()) {
                    Iterator it4 = arrayList2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        if (!(((vk6) it4.next()) instanceof uk6)) {
                            f(bxVar, arrayList2);
                            g(bxVar, arrayList2);
                            break;
                        }
                    }
                }
            } while (!kvVar.c(listH2, arrayList2));
            return;
        }
        Iterator it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            List list2 = (List) it5.next();
            list2.add(0, new uk6());
            list2.add(list2.size(), new uk6());
        }
        bx bxVar2 = kvVar.b;
        do {
            listH = kvVar.getValue();
            arrayList = new ArrayList(listH);
            Iterator it6 = arrayList7.iterator();
            while (it6.hasNext()) {
                List list3 = (List) it6.next();
                p(arrayList, list3);
                A(arrayList, ft.h(list3), ft.o(list3));
            }
            List list4 = (List) x53.g0(arrayList7);
            if (z && (!arrayList.isEmpty())) {
                vk6 vk6VarO = ft.o(list4);
                long c = vk6VarO != null ? vk6VarO.getC() : -1L;
                if (c >= 0) {
                    i13 i13VarV = fm9.v(c, listI);
                    i13 i13VarV2 = fm9.v(j, listI);
                    if (i13VarV != null && i13VarV.equals(i13VarV2)) {
                        z(j, c, arrayList);
                    }
                }
            }
            List list5 = (List) x53.p0(arrayList7);
            if (z2 && (!arrayList.isEmpty())) {
                vk6 vk6VarH = ft.h(list5);
                long c2 = vk6VarH != null ? vk6VarH.getC() : -1L;
                if (c2 >= 0) {
                    i13 i13VarV3 = fm9.v(c2, listI);
                    i13 i13VarV4 = fm9.v(j, listI);
                    if (i13VarV3 != null && i13VarV3.equals(i13VarV4)) {
                        z(c2, j, arrayList);
                    }
                }
            }
            e(bxVar2, arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it7 = arrayList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    if (!(((vk6) it7.next()) instanceof uk6)) {
                        f(bxVar2, arrayList);
                        g(bxVar2, arrayList);
                        break;
                    }
                }
            }
        } while (!kvVar.c(listH, arrayList));
    }

    public final void p(ArrayList arrayList, List list) {
        int iIndexOf;
        int iIndexOf2;
        boolean z = x53.i0(list) instanceof uk6;
        boolean z2 = x53.q0(list) instanceof uk6;
        gi9 gi9VarA = vv7.a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vk6 vk6Var = (vk6) it.next();
            if (!(vk6Var instanceof uk6)) {
                gi9VarA.a(vk6Var.getA());
            }
        }
        List listI0 = l6d.i0(l6d.a0(l6d.a0(new at(2, list), new k8(11)), new jv(gi9VarA, 1)));
        if (listI0.isEmpty()) {
            return;
        }
        if (!arrayList.isEmpty()) {
            Comparator comparatorE = k().e();
            int iL = y53.L(arrayList);
            Iterator it2 = new r08(listI0).iterator();
            while (true) {
                ListIterator listIterator = ((fkc) it2).b;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                vk6 vk6Var2 = (vk6) listIterator.previous();
                while (iL > 0) {
                    vk6 vk6Var3 = (vk6) arrayList.get(iL);
                    boolean z3 = vk6Var3 instanceof uk6;
                    boolean z4 = comparatorE.compare(Long.valueOf(vk6Var3.getC()), Long.valueOf(vk6Var2.getC())) > 0;
                    if (!z3 && !z4) {
                        break;
                    } else {
                        iL--;
                    }
                }
                if (iL < y53.L(arrayList)) {
                    int i = iL + 1;
                    if (arrayList.get(i) instanceof uk6) {
                        iL = i;
                    }
                }
                arrayList.add(iL + 1, vk6Var2);
            }
        } else {
            arrayList.addAll(listI0);
        }
        if (z && (iIndexOf2 = arrayList.indexOf(x53.g0(listI0))) > 0) {
            int i2 = iIndexOf2 - 1;
            if (!(arrayList.get(i2) instanceof uk6)) {
                arrayList.add(i2, new uk6());
            }
        }
        if (!z2 || (iIndexOf = arrayList.indexOf(x53.p0(listI0))) <= 0) {
            return;
        }
        if (iIndexOf == y53.L(arrayList) ? x53.p0(arrayList) instanceof uk6 : arrayList.get(iIndexOf + 1) instanceof uk6) {
            return;
        }
        arrayList.add(iIndexOf + 1, new uk6());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(java.util.List r7, long r8, boolean r10) {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            if (r10 == 0) goto L45
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto Ld
        La:
            r10 = r1
            goto L84
        Ld:
            java.util.Iterator r7 = r7.iterator()
            r10 = r1
        L12:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r7.next()
            vk6 r2 = (defpackage.vk6) r2
            boolean r3 = r2 instanceof defpackage.uk6
            if (r3 != 0) goto L12
            sk6 r3 = r6.k()
            java.util.Comparator r3 = r3.e()
            long r4 = r2.getC()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            int r2 = r3.compare(r2, r4)
            if (r2 > 0) goto L12
            int r10 = r10 + 1
            if (r10 < 0) goto L41
            goto L12
        L41:
            defpackage.y53.Q()
            throw r0
        L45:
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L4c
            goto La
        L4c:
            java.util.Iterator r7 = r7.iterator()
            r10 = r1
        L51:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r7.next()
            vk6 r2 = (defpackage.vk6) r2
            boolean r3 = r2 instanceof defpackage.uk6
            if (r3 != 0) goto L51
            sk6 r3 = r6.k()
            java.util.Comparator r3 = r3.e()
            long r4 = r2.getC()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            int r2 = r3.compare(r2, r4)
            if (r2 < 0) goto L51
            int r10 = r10 + 1
            if (r10 < 0) goto L80
            goto L51
        L80:
            defpackage.y53.Q()
            throw r0
        L84:
            int r7 = r6.m
            if (r10 >= r7) goto L8d
            int r6 = r6.n
            if (r10 == r6) goto L8d
            r1 = 1
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.q(java.util.List, long, boolean):boolean");
    }

    public final void r(long j) {
        if (j == i()) {
            return;
        }
        yx4 yx4Var = this.c;
        if (yx4Var != null) {
            yx4Var.b("load around " + j);
        }
        this.C.m(null, new nv(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(long r20, kotlin.coroutines.Continuation r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.s(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.uu r17, long r18, defpackage.lv r20, kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.t(uu, long, lv, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.uu r17, long r18, defpackage.lv r20, kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.u(uu, long, lv, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(long r13, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.v(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void w() {
        Object value;
        Object obj;
        ov ovVar = new ov(j(), false);
        q0e q0eVar = this.C;
        do {
            value = q0eVar.getValue();
            qv qvVar = (qv) value;
            obj = qvVar instanceof nv ? (nv) qvVar : null;
            if (obj == null) {
                obj = ovVar;
            }
        } while (!q0eVar.c(value, obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(long r10, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.iw
            if (r0 == 0) goto L14
            r0 = r12
            iw r0 = (defpackage.iw) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.s0 = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            iw r0 = new iw
            r0.<init>(r9, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.Y
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.s0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L42
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            bx r9 = r6.o
            defpackage.od2.a0(r12)
            goto Lb0
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            long r9 = r6.X
            bx r11 = r6.o
            defpackage.od2.a0(r12)
            r7 = r9
            r9 = r11
            r10 = r7
            goto L98
        L42:
            defpackage.od2.a0(r12)
            yx4 r12 = r9.c
            if (r12 == 0) goto L5e
            java.lang.String r1 = defpackage.yx4.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "loadNext: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r12.b(r1)
        L5e:
            r9.B()
            sk6 r1 = r9.k()
            java.util.List r1 = r1.i()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 == 0) goto La5
            if (r12 == 0) goto L77
            java.lang.String r1 = "loadNext: Chunks not empty, started loading from datasources"
            r12.b(r1)
        L77:
            java.util.List r12 = r9.l(r10)
            vk6 r12 = defpackage.ft.o(r12)
            if (r12 == 0) goto L85
            long r10 = r12.getC()
        L85:
            r6.o = r9
            r6.X = r10
            r6.s0 = r3
            uu r2 = r9.j
            wd6 r5 = r9.E
            r1 = r9
            r3 = r10
            java.lang.Object r12 = r1.u(r2, r3, r5, r6)
            if (r12 != r0) goto L98
            return r0
        L98:
            kotlinx.coroutines.internal.ContextScope r12 = r9.v
            jw r0 = new jw
            r1 = 0
            r0.<init>(r9, r10, r1)
            r10 = 3
            defpackage.j47.T(r12, r1, r1, r0, r10)
            goto Lb0
        La5:
            r6.o = r9
            r6.s0 = r2
            java.lang.Object r10 = r9.v(r10, r6)
            if (r10 != r0) goto Lb0
            return r0
        Lb0:
            yx4 r10 = r9.c
            if (r10 == 0) goto Lbd
            kv r9 = r9.z
            java.util.List r9 = r9.getValue()
            defpackage.kq0.u(r10, r9)
        Lbd:
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.x(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void y() {
        Long lValueOf;
        Object value;
        Object obj;
        Iterator it = ((l29) this.A.getValue()).a.iterator();
        if (it.hasNext()) {
            lValueOf = Long.valueOf(((MessageModel) it.next()).c);
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((MessageModel) it.next()).c);
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
        } else {
            lValueOf = null;
        }
        pv pvVar = new pv(lValueOf != null ? lValueOf.longValue() : Long.MAX_VALUE, false);
        q0e q0eVar = this.C;
        do {
            value = q0eVar.getValue();
            qv qvVar = (qv) value;
            obj = qvVar instanceof nv ? (nv) qvVar : null;
            if (obj == null) {
                obj = pvVar;
            }
        } while (!q0eVar.c(value, obj));
    }
}
