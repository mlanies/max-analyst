package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class nl6 {
    public static final /* synthetic */ bc7[] k;
    public final tk6 a;
    public final s24 b;
    public final s24 c;
    public final int d;
    public final yx4 e;
    public final Integer f;
    public final boolean g;
    public final dx3 h;
    public final ax i;
    public volatile jl6 j;

    static {
        oi9 oi9Var = new oi9(nl6.class, "historyBounds", "getHistoryBounds()Lru/ok/tamtam/loader/HistoryBounds;");
        nec.a.getClass();
        k = new bc7[]{oi9Var};
    }

    public nl6(tk6 tk6Var, s24 s24Var, s24 s24Var2, int i, yx4 yx4Var, boolean z, int i2) {
        z = (i2 & 64) != 0 ? true : z;
        this.a = tk6Var;
        this.b = s24Var;
        this.c = s24Var2;
        this.d = i;
        this.e = yx4Var;
        this.f = null;
        this.g = z;
        dx3 dx3Var = new dx3();
        this.h = dx3Var;
        this.i = new ax(new khe(new es3(24, this)), 4, this);
        dx3Var.add(new uk6());
    }

    public final void a(int i, vk6 vk6Var) {
        this.h.add(i, vk6Var);
    }

    public final void b(vk6 vk6Var) {
        yx4 yx4Var = this.e;
        if (yx4Var != null) {
            yx4Var.b("addHistoryItem " + vk6Var);
        }
        h(Collections.singletonList(vk6Var));
        p();
        s();
        jl6 jl6Var = this.j;
        if (jl6Var != null) {
            jl6Var.k();
        }
    }

    public final void c(Set set) {
        if (set.isEmpty()) {
            return;
        }
        yx4 yx4Var = this.e;
        if (yx4Var != null) {
            yx4Var.b("deleteHistoryItem: " + set.size());
        }
        dx3 dx3Var = this.h;
        ArrayList arrayList = new ArrayList();
        Iterator it = dx3Var.iterator();
        while (true) {
            ax3 ax3Var = (ax3) it;
            if (!ax3Var.hasNext()) {
                break;
            }
            Object next = ax3Var.next();
            if (set.contains(Long.valueOf(((vk6) next).getA()))) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty() || this.h.isEmpty()) {
            return;
        }
        this.h.removeAll(arrayList);
        m(this.h);
        q();
        dx3 dx3Var2 = this.h;
        if (!(dx3Var2 instanceof Collection) || !dx3Var2.isEmpty()) {
            Iterator it2 = dx3Var2.iterator();
            while (true) {
                if (!((ax3) it2).hasNext()) {
                    break;
                }
                if (!(((vk6) r0.next()) instanceof uk6)) {
                    p();
                    s();
                    break;
                }
            }
        }
        jl6 jl6Var = this.j;
        if (jl6Var != null) {
            jl6Var.k();
        }
    }

    public final sk6 d() {
        return (sk6) this.i.T0(this, k[0]);
    }

    public final ArrayList e() {
        return new ArrayList(this.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0092 A[PHI: r7
      0x0092: PHI (r7v8 int) = (r7v1 int), (r7v12 int) binds: [B:37:0x008c, B:39:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List f(long r17) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl6.f(long):java.util.List");
    }

    public final void g(long j, List list, boolean z, boolean z2) {
        List listSingletonList;
        List listI = d().i();
        qk5 qk5VarZ = l6d.Z(new km4(new at(2, list), 0, new pz2(23)), new kl6(0, listI));
        Comparator comparatorC = d().c();
        ArrayList arrayList = new ArrayList();
        l6d.h0(qk5VarZ, arrayList);
        c63.U(arrayList, comparatorC);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(next);
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                listSingletonList = arrayList2;
            } else {
                listSingletonList = Collections.singletonList(next);
            }
        } else {
            listSingletonList = nz4.a;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = listSingletonList.size();
        for (int i = 0; i < size; i++) {
            vk6 vk6Var = (vk6) listSingletonList.get(i);
            arrayList4.add(vk6Var);
            if (i == listSingletonList.size() - 1 || !tpa.f(fm9.v(vk6Var.getC(), listI), fm9.v(((vk6) listSingletonList.get(i + 1)).getC(), listI))) {
                arrayList3.add(arrayList4);
                arrayList4 = new ArrayList();
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((List) next2).size() > 0) {
                arrayList5.add(next2);
            }
        }
        ArrayList arrayList6 = new ArrayList(arrayList5);
        if (arrayList6.isEmpty()) {
            return;
        }
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            List list2 = (List) it3.next();
            list2.add(0, new uk6());
            list2.add(list2.size(), new uk6());
        }
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            List list3 = (List) it4.next();
            h(list3);
            o(ft.h(list3), ft.o(list3));
        }
        List list4 = (List) x53.g0(arrayList6);
        if (z && (!this.h.isEmpty())) {
            vk6 vk6VarO = ft.o(list4);
            long c = vk6VarO != null ? vk6VarO.getC() : -1L;
            if (c >= 0) {
                i13 i13VarV = fm9.v(c, listI);
                i13 i13VarV2 = fm9.v(j, listI);
                if (i13VarV != null && i13VarV.equals(i13VarV2)) {
                    n(j, c);
                }
            }
        }
        List list5 = (List) x53.p0(arrayList6);
        if (z2 && (!this.h.isEmpty())) {
            vk6 vk6VarH = ft.h(list5);
            long c2 = vk6VarH != null ? vk6VarH.getC() : -1L;
            if (c2 >= 0) {
                i13 i13VarV3 = fm9.v(c2, listI);
                i13 i13VarV4 = fm9.v(j, listI);
                if (i13VarV3 != null && i13VarV3.equals(i13VarV4)) {
                    n(c2, j);
                }
            }
        }
        m(this.h);
        p();
        s();
        if (!d().a()) {
            dx3 dx3Var = this.h;
            o(ft.h(dx3Var), ft.o(dx3Var));
        }
        jl6 jl6Var = this.j;
        if (jl6Var != null) {
            jl6Var.k();
        }
    }

    public final void h(List list) {
        int iIndexOf;
        int iIndexOf2;
        int i = 0;
        boolean z = (list.isEmpty() ^ true) && (x53.g0(list) instanceof uk6);
        boolean z2 = (list.isEmpty() ^ true) && (x53.p0(list) instanceof uk6);
        List<vk6> listI0 = l6d.i0(l6d.a0(l6d.Z(new at(2, list), new pz2(22)), new jy2(20, this)));
        if (listI0.isEmpty()) {
            return;
        }
        if (this.h.isEmpty()) {
            this.h.addAll(listI0);
        } else {
            Comparator comparatorE = d().e();
            if (this.g) {
                int iL = y53.L(this.h);
                Iterator it = new r08(listI0).iterator();
                while (true) {
                    fkc fkcVar = (fkc) it;
                    if (!fkcVar.b.hasPrevious()) {
                        break;
                    }
                    vk6 vk6Var = (vk6) fkcVar.b.previous();
                    while (iL > 0 && ((this.h.b[iL] instanceof uk6) || comparatorE.compare(Long.valueOf(((vk6) this.h.b[iL]).getC()), Long.valueOf(vk6Var.getC())) > 0)) {
                        iL--;
                    }
                    int i2 = iL + 1;
                    if (this.h.b.length > i2 && (this.h.b[i2] instanceof uk6)) {
                        iL = i2;
                    }
                    a(iL + 1, vk6Var);
                }
            } else {
                for (vk6 vk6Var2 : listI0) {
                    while (i < this.h.b.length && ((this.h.b[i] instanceof uk6) || comparatorE.compare(Long.valueOf(((vk6) this.h.b[i]).getC()), Long.valueOf(vk6Var2.getC())) <= 0)) {
                        i++;
                    }
                    a(i, vk6Var2);
                }
            }
        }
        if (z && (iIndexOf2 = this.h.indexOf(x53.g0(listI0))) > 0) {
            int i3 = iIndexOf2 - 1;
            if (!(this.h.b[i3] instanceof uk6)) {
                a(i3, new uk6());
            }
        }
        if (!z2 || (iIndexOf = this.h.indexOf(x53.p0(listI0))) <= 0) {
            return;
        }
        if (iIndexOf == y53.L(this.h) ? x53.p0(this.h) instanceof uk6 : this.h.b[iIndexOf + 1] instanceof uk6) {
            return;
        }
        a(iIndexOf + 1, new uk6());
    }

    public final boolean i(List list, long j, boolean z) {
        int i;
        int i2;
        int i3 = this.d;
        if (z) {
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    vk6 vk6Var = (vk6) it.next();
                    if (!(vk6Var instanceof uk6) && d().e().compare(Long.valueOf(vk6Var.getC()), Long.valueOf(j)) <= 0 && (i2 = i2 + 1) < 0) {
                        y53.Q();
                        throw null;
                    }
                }
            }
            if (i2 < i3) {
                return true;
            }
        } else {
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = list.iterator();
                i = 0;
                while (it2.hasNext()) {
                    vk6 vk6Var2 = (vk6) it2.next();
                    if (!(vk6Var2 instanceof uk6) && d().e().compare(Long.valueOf(vk6Var2.getC()), Long.valueOf(j)) >= 0 && (i = i + 1) < 0) {
                        y53.Q();
                        throw null;
                    }
                }
            }
            if (i < i3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.s24 r28, long r29, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl6.j(s24, long, boolean, boolean, boolean):void");
    }

    public final void k(s24 s24Var, long j, boolean z, boolean z2) {
        j(s24Var, j, z, z2, true);
        if (this.h.isEmpty() || (this.h.b.length == 1 && (x53.i0(this.h) instanceof uk6))) {
            this.h.clear();
            jl6 jl6Var = this.j;
            if (jl6Var != null) {
                jl6Var.k();
            }
        }
    }

    public final void l(long j) {
        int iL;
        int i = 0;
        yx4 yx4Var = this.e;
        if (yx4Var != null) {
            yx4Var.b("loadEmptyChunksData: " + yx4.a(j));
        }
        List listF = this.b.f(j, null, Integer.MAX_VALUE, Integer.MAX_VALUE, Long.MIN_VALUE, Long.MAX_VALUE);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (hashSet.add(Long.valueOf(((vk6) obj).getA()))) {
                arrayList.add(obj);
            }
        }
        h(x53.x0(arrayList, xfg.d(ll6.a, ml6.a)));
        ArrayList arrayList2 = new ArrayList();
        int iL2 = y53.L(this.h);
        if (iL2 >= 0) {
            int i2 = 0;
            while (true) {
                vk6 vk6Var = (vk6) this.h.b[i];
                if (!(vk6Var instanceof uk6)) {
                    if (i2 != i) {
                        this.h.set(i2, vk6Var);
                    }
                    i2++;
                }
                if (i == iL2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i < this.h.b.length && i <= (iL = y53.L(this.h))) {
            while (true) {
                arrayList2.add(this.h.remove(iL));
                if (iL == i) {
                    break;
                } else {
                    iL--;
                }
            }
        }
        arrayList2.isEmpty();
        jl6 jl6Var = this.j;
        if (jl6Var != null) {
            jl6Var.k();
        }
    }

    public final void m(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (size > 0 && (list.get(size) instanceof uk6) && (list.get(size - 1) instanceof uk6)) {
            }
        }
    }

    public final void n(long j, long j2) {
        Object obj;
        Object objPrevious;
        dx3 dx3Var = this.h;
        ListIterator listIterator = dx3Var.listIterator(dx3Var.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            vk6 vk6Var = (vk6) objPrevious;
            if (!(vk6Var instanceof uk6) && vk6Var.getC() <= j) {
                break;
            }
        }
        vk6 vk6Var2 = (vk6) objPrevious;
        Iterator<E> it = dx3Var.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            vk6 vk6Var3 = (vk6) next;
            if (!(vk6Var3 instanceof uk6) && vk6Var3.getC() >= j2) {
                obj = next;
                break;
            }
        }
        o(vk6Var2, (vk6) obj);
    }

    public final void o(vk6 vk6Var, vk6 vk6Var2) {
        int i;
        if (vk6Var == null || vk6Var2 == null) {
            return;
        }
        Iterator it = this.h.iterator();
        int i2 = 0;
        while (true) {
            ax3 ax3Var = (ax3) it;
            i = -1;
            if (!ax3Var.hasNext()) {
                i2 = -1;
                break;
            }
            vk6 vk6Var3 = (vk6) ax3Var.next();
            if (!(vk6Var3 instanceof uk6) && vk6Var3.getA() == vk6Var.getA()) {
                break;
            } else {
                i2++;
            }
        }
        dx3 dx3Var = this.h;
        ListIterator listIterator = dx3Var.listIterator(dx3Var.b.length);
        while (true) {
            ax3 ax3Var2 = (ax3) listIterator;
            if (!ax3Var2.hasPrevious()) {
                break;
            }
            vk6 vk6Var4 = (vk6) ax3Var2.previous();
            if (!(vk6Var4 instanceof uk6) && vk6Var4.getA() == vk6Var2.getA()) {
                i = ax3Var2.b;
                break;
            }
        }
        if (i2 < 0 || i < 0 || i2 > i) {
            return;
        }
        while (true) {
            if (this.h.b[i] instanceof uk6) {
            }
            if (i == i2) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void p() {
        boolean z;
        long jG = d().g();
        d().getClass();
        dx3 dx3Var = this.h;
        if (jG != -1 && (!(dx3Var instanceof Collection) || !dx3Var.isEmpty())) {
            Iterator it = dx3Var.iterator();
            while (true) {
                ax3 ax3Var = (ax3) it;
                if (!ax3Var.hasNext()) {
                    break;
                }
                vk6 vk6Var = (vk6) ax3Var.next();
                if (!(vk6Var instanceof uk6) && vk6Var.getA() == jG) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
        }
        vk6 vk6Var2 = (vk6) x53.g0(dx3Var);
        yx4 yx4Var = this.e;
        if (yx4Var != null) {
            yx4Var.b("UpdateFirstGap: firstItemId=" + jG + ", isLastGap=" + (vk6Var2 instanceof uk6) + ", hasFirstBound=" + z);
        }
        if (z && (vk6Var2 instanceof uk6)) {
        } else {
            if (z || (vk6Var2 instanceof uk6)) {
                return;
            }
            a(0, new uk6());
        }
    }

    public final void q() {
        sk6 sk6VarD = d();
        this.i.o1(this, k[0], this.a.i());
        dx3 dx3Var = this.h;
        if (!(dx3Var instanceof Collection) || !dx3Var.isEmpty()) {
            Iterator it = dx3Var.iterator();
            while (true) {
                if (!((ax3) it).hasNext()) {
                    break;
                }
                if (!(((vk6) r2.next()) instanceof uk6)) {
                    p();
                    s();
                    break;
                }
            }
        }
        yx4 yx4Var = this.e;
        if (yx4Var == null || kp.i(sk6VarD, d())) {
            return;
        }
        kq0.v(yx4Var, d());
    }

    public final void r(vk6 vk6Var) {
        int iL = y53.L(this.h);
        while (true) {
            if (-1 >= iL) {
                iL = -1;
                break;
            } else if (((vk6) this.h.b[iL]).getA() == vk6Var.getA()) {
                break;
            } else {
                iL--;
            }
        }
        jl6 jl6Var = this.j;
        if (iL < 0) {
            yx4 yx4Var = this.e;
            if (yx4Var != null) {
                yx4Var.b("WARN: updateHistoryItem: could not find history item by id!");
                return;
            }
            return;
        }
        vk6 vk6Var2 = (vk6) x53.j0(iL - 1, this.h);
        boolean z = true;
        vk6 vk6Var3 = (vk6) x53.j0(iL + 1, this.h);
        if ((vk6Var2 == null || d().c().compare(vk6Var2, vk6Var) <= 0) && (vk6Var3 == null || d().c().compare(vk6Var, vk6Var3) >= 0)) {
            z = false;
        }
        if (z) {
            this.h.c(d().c());
        }
        if ((z || jl6Var == null) && jl6Var != null) {
            jl6Var.k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[EDGE_INSN: B:31:0x0043->B:17:0x0043 BREAK  A[LOOP:0: B:10:0x0026->B:34:0x0026]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r8 = this;
            sk6 r0 = r8.d()
            long r0 = r0.h()
            sk6 r2 = r8.d()
            r2.getClass()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L43
            dx3 r2 = r8.h
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L22
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L22
            goto L43
        L22:
            java.util.Iterator r2 = r2.iterator()
        L26:
            r3 = r2
            ax3 r3 = (defpackage.ax3) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r3 = r3.next()
            vk6 r3 = (defpackage.vk6) r3
            boolean r4 = r3 instanceof defpackage.uk6
            if (r4 != 0) goto L26
            long r3 = r3.getA()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L26
            r2 = 1
            goto L44
        L43:
            r2 = 0
        L44:
            dx3 r3 = r8.h
            java.lang.Object r3 = defpackage.x53.p0(r3)
            vk6 r3 = (defpackage.vk6) r3
            yx4 r4 = r8.e
            if (r4 == 0) goto L73
            boolean r5 = r3 instanceof defpackage.uk6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "UpdateLastGap: lastItemId="
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = ", isLastGap="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ", hasLastBound="
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = r6.toString()
            r4.b(r0)
        L73:
            if (r2 == 0) goto L7f
            boolean r0 = r3 instanceof defpackage.uk6
            if (r0 == 0) goto L7f
            dx3 r8 = r8.h
            r8.remove(r3)
            return
        L7f:
            if (r2 != 0) goto L92
            boolean r0 = r3 instanceof defpackage.uk6
            if (r0 != 0) goto L92
            dx3 r0 = r8.h
            java.lang.Object[] r0 = r0.b
            int r0 = r0.length
            uk6 r1 = new uk6
            r1.<init>()
            r8.a(r0, r1)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl6.s():void");
    }
}
