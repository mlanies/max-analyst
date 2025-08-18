package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class qh4 {
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public void a(sh4 sh4Var, int i, ArrayList arrayList, opc opcVar) {
        r5g r5gVar = sh4Var.d;
        if (r5gVar.c == null) {
            ij3 ij3Var = (ij3) this.c;
            if (r5gVar == ij3Var.d || r5gVar == ij3Var.e) {
                return;
            }
            if (opcVar == null) {
                opcVar = new opc();
                opcVar.a = null;
                opcVar.b = new ArrayList();
                opcVar.a = r5gVar;
                arrayList.add(opcVar);
            }
            r5gVar.c = opcVar;
            opcVar.b.add(r5gVar);
            sh4 sh4Var2 = r5gVar.h;
            Iterator it = sh4Var2.k.iterator();
            while (it.hasNext()) {
                oh4 oh4Var = (oh4) it.next();
                if (oh4Var instanceof sh4) {
                    a((sh4) oh4Var, i, arrayList, opcVar);
                }
            }
            sh4 sh4Var3 = r5gVar.i;
            Iterator it2 = sh4Var3.k.iterator();
            while (it2.hasNext()) {
                oh4 oh4Var2 = (oh4) it2.next();
                if (oh4Var2 instanceof sh4) {
                    a((sh4) oh4Var2, i, arrayList, opcVar);
                }
            }
            if (i == 1 && (r5gVar instanceof ocf)) {
                Iterator it3 = ((ocf) r5gVar).k.k.iterator();
                while (it3.hasNext()) {
                    oh4 oh4Var3 = (oh4) it3.next();
                    if (oh4Var3 instanceof sh4) {
                        a((sh4) oh4Var3, i, arrayList, opcVar);
                    }
                }
            }
            Iterator it4 = sh4Var2.l.iterator();
            while (it4.hasNext()) {
                a((sh4) it4.next(), i, arrayList, opcVar);
            }
            Iterator it5 = sh4Var3.l.iterator();
            while (it5.hasNext()) {
                a((sh4) it5.next(), i, arrayList, opcVar);
            }
            if (i == 1 && (r5gVar instanceof ocf)) {
                Iterator it6 = ((ocf) r5gVar).k.l.iterator();
                while (it6.hasNext()) {
                    a((sh4) it6.next(), i, arrayList, opcVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.ij3 r17) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qh4.b(ij3):void");
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.e;
        arrayList.clear();
        ij3 ij3Var = (ij3) this.d;
        ij3Var.d.f();
        ij3Var.e.f();
        arrayList.add(ij3Var.d);
        arrayList.add(ij3Var.e);
        Iterator it = ij3Var.q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            hj3 hj3Var = (hj3) it.next();
            if (hj3Var instanceof fh6) {
                gh6 gh6Var = new gh6(hj3Var);
                hj3Var.d.f();
                hj3Var.e.f();
                gh6Var.f = ((fh6) hj3Var).u0;
                arrayList.add(gh6Var);
            } else {
                if (hj3Var.x()) {
                    if (hj3Var.b == null) {
                        hj3Var.b = new g12(hj3Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(hj3Var.b);
                } else {
                    arrayList.add(hj3Var.d);
                }
                if (hj3Var.y()) {
                    if (hj3Var.c == null) {
                        hj3Var.c = new g12(hj3Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(hj3Var.c);
                } else {
                    arrayList.add(hj3Var.e);
                }
                if (hj3Var instanceof uj6) {
                    arrayList.add(new tj6(hj3Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((r5g) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            r5g r5gVar = (r5g) it3.next();
            if (r5gVar.b != ij3Var) {
                r5gVar.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        ij3 ij3Var2 = (ij3) this.c;
        e(ij3Var2.d, 0, arrayList2);
        e(ij3Var2.e, 1, arrayList2);
        this.a = false;
    }

    public int d(ij3 ij3Var, int i) {
        ArrayList arrayList;
        int i2;
        long jMax;
        float f;
        ij3 ij3Var2 = ij3Var;
        ArrayList arrayList2 = (ArrayList) this.f;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            r5g r5gVar = ((opc) arrayList2.get(i3)).a;
            if (!(r5gVar instanceof g12) ? !(i != 0 ? (r5gVar instanceof ocf) : (r5gVar instanceof eo6)) : ((g12) r5gVar).f != i) {
                sh4 sh4Var = (i == 0 ? ij3Var2.d : ij3Var2.e).h;
                sh4 sh4Var2 = (i == 0 ? ij3Var2.d : ij3Var2.e).i;
                boolean zContains = r5gVar.h.l.contains(sh4Var);
                sh4 sh4Var3 = r5gVar.i;
                boolean zContains2 = sh4Var3.l.contains(sh4Var2);
                long j2 = r5gVar.j();
                sh4 sh4Var4 = r5gVar.h;
                if (zContains && zContains2) {
                    long jB = opc.b(sh4Var4, j);
                    arrayList = arrayList2;
                    long jA = opc.a(sh4Var3, j);
                    long j3 = jB - j2;
                    int i4 = sh4Var3.f;
                    i2 = i3;
                    if (j3 >= (-i4)) {
                        j3 += i4;
                    }
                    long j4 = sh4Var4.f;
                    long j5 = ((-jA) - j2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    hj3 hj3Var = r5gVar.b;
                    if (i == 0) {
                        f = hj3Var.d0;
                    } else if (i == 1) {
                        f = hj3Var.e0;
                    } else {
                        hj3Var.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j3 / (1.0f - f)) + (j5 / f)) : 0L;
                    jMax = (sh4Var4.f + ((((long) ((f2 * f) + 0.5f)) + j2) + ((long) z7b.f(1.0f, f, f2, 0.5f)))) - sh4Var3.f;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    jMax = zContains ? Math.max(opc.b(sh4Var4, sh4Var4.f), sh4Var4.f + j2) : zContains2 ? Math.max(-opc.a(sh4Var3, sh4Var3.f), (-sh4Var3.f) + j2) : (r5gVar.j() + sh4Var4.f) - sh4Var3.f;
                }
            } else {
                arrayList = arrayList2;
                jMax = j;
                i2 = i3;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            ij3Var2 = ij3Var;
            j = 0;
        }
        return (int) jMax2;
    }

    public void e(r5g r5gVar, int i, ArrayList arrayList) {
        sh4 sh4Var;
        Iterator it = r5gVar.h.k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            sh4Var = r5gVar.i;
            if (!zHasNext) {
                break;
            }
            oh4 oh4Var = (oh4) it.next();
            if (oh4Var instanceof sh4) {
                a((sh4) oh4Var, i, arrayList, null);
            } else if (oh4Var instanceof r5g) {
                a(((r5g) oh4Var).h, i, arrayList, null);
            }
        }
        Iterator it2 = sh4Var.k.iterator();
        while (it2.hasNext()) {
            oh4 oh4Var2 = (oh4) it2.next();
            if (oh4Var2 instanceof sh4) {
                a((sh4) oh4Var2, i, arrayList, null);
            } else if (oh4Var2 instanceof r5g) {
                a(((r5g) oh4Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((ocf) r5gVar).k.k.iterator();
            while (it3.hasNext()) {
                oh4 oh4Var3 = (oh4) it3.next();
                if (oh4Var3 instanceof sh4) {
                    a((sh4) oh4Var3, i, arrayList, null);
                }
            }
        }
    }

    public void f(int i, int i2, int i3, int i4, hj3 hj3Var) {
        xk0 xk0Var = (xk0) this.h;
        xk0Var.b = i;
        xk0Var.d = i3;
        xk0Var.e = i2;
        xk0Var.f = i4;
        ((dob) this.g).c(hj3Var, xk0Var);
        hj3Var.O(xk0Var.g);
        hj3Var.L(xk0Var.h);
        hj3Var.E = xk0Var.c;
        hj3Var.I(xk0Var.i);
    }

    public void g() {
        qk0 qk0Var;
        Iterator it = ((ij3) this.c).q0.iterator();
        while (it.hasNext()) {
            hj3 hj3Var = (hj3) it.next();
            if (!hj3Var.a) {
                int[] iArr = hj3Var.p0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = hj3Var.r;
                int i4 = hj3Var.s;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                ek4 ek4Var = hj3Var.d.e;
                boolean z3 = ek4Var.j;
                ek4 ek4Var2 = hj3Var.e.e;
                boolean z4 = ek4Var2.j;
                if (z3 && z4) {
                    f(1, ek4Var.g, 1, ek4Var2.g, hj3Var);
                    hj3Var.a = true;
                } else if (z3 && z) {
                    f(1, ek4Var.g, 2, ek4Var2.g, hj3Var);
                    if (i2 == 3) {
                        hj3Var.e.e.m = hj3Var.k();
                    } else {
                        hj3Var.e.e.d(hj3Var.k());
                        hj3Var.a = true;
                    }
                } else if (z4 && z2) {
                    f(2, ek4Var.g, 1, ek4Var2.g, hj3Var);
                    if (i == 3) {
                        hj3Var.d.e.m = hj3Var.q();
                    } else {
                        hj3Var.d.e.d(hj3Var.q());
                        hj3Var.a = true;
                    }
                }
                if (hj3Var.a && (qk0Var = hj3Var.e.l) != null) {
                    qk0Var.d(hj3Var.a0);
                }
            }
        }
    }
}
