package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class du extends ol implements lme {
    public final long[] X;
    public final int o;

    public du(int i, long j, long[] jArr) {
        super(j);
        this.o = i;
        this.X = jArr;
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) throws InterruptedException {
        int i = 2;
        int i2 = 1;
        eu euVar = (eu) gleVar;
        int i3 = this.o;
        int iS = au1.s(i3);
        if (iS == 1) {
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            o2e o2eVar = (o2e) plVar.n.getValue();
            List list = euVar.c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(iz7.r((e2e) it.next()));
            }
            o2eVar.e(arrayList);
            pl plVar2 = this.c;
            if (plVar2 == null) {
                plVar2 = null;
            }
            sc5 sc5Var = (sc5) plVar2.q.getValue();
            List list2 = euVar.c;
            ArrayList arrayList2 = new ArrayList(z53.S(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(((e2e) it2.next()).k));
            }
            sc5Var.e(arrayList2);
        } else if (iS == 2) {
            pl plVar3 = this.c;
            if (plVar3 == null) {
                plVar3 = null;
            }
            a4e a4eVar = (a4e) plVar3.o.getValue();
            List<n3e> list3 = euVar.o;
            a4eVar.getClass();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (n3e n3eVar : list3) {
                arrayList3.addAll(((o2e) a4eVar.b).c(n3eVar.h));
                arrayList4.add(a4e.e(n3eVar));
            }
            if (!arrayList3.isEmpty()) {
                nd7.O(arrayList3);
                Iterator it3 = nd7.T(arrayList3).iterator();
                while (it3.hasNext()) {
                    a4eVar.c.c(2, (List) it3.next());
                }
            }
            if (!arrayList4.isEmpty()) {
                c4e c4eVar = a4eVar.a;
                c4eVar.getClass();
                nd7.U(new qa3(new e0a(qy9.j(arrayList4), new m2e(22), 3).v(), i, new z3e(c4eVar, i2)).l(), ft.e, new z72(26, arrayList4), new ic5(6, arrayList4));
            }
            pl plVar4 = this.c;
            if (plVar4 == null) {
                plVar4 = null;
            }
            sc5 sc5Var2 = (sc5) plVar4.q.getValue();
            List list4 = euVar.o;
            ArrayList arrayList5 = new ArrayList(z53.S(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList5.add(Long.valueOf(((n3e) it4.next()).a));
            }
            sc5Var2.e(arrayList5);
        }
        pl plVar5 = this.c;
        (plVar5 != null ? plVar5 : null).b().c(new fu(i3, this.a, ys.l0(this.X)));
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        hm9.p("du", pkeVar.toString(), null);
    }

    @Override // defpackage.ol
    public final dle i() {
        return new au(this.o, this.X);
    }
}
